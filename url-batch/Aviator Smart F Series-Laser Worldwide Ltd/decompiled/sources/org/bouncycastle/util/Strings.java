package org.bouncycastle.util;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Vector;

/* loaded from: classes5.dex */
public final class Strings {
    private static String LINE_SEPARATOR;

    private static class StringListImpl extends ArrayList<String> implements k {
        private StringListImpl() {
        }

        /* synthetic */ StringListImpl(a aVar) {
            this();
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List, org.bouncycastle.util.k
        public /* bridge */ /* synthetic */ String get(int i8) {
            return (String) super.get(i8);
        }

        @Override // org.bouncycastle.util.k
        public String[] toStringArray() {
            int size = size();
            String[] strArr = new String[size];
            for (int i8 = 0; i8 != size; i8++) {
                strArr[i8] = get(i8);
            }
            return strArr;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public void add(int i8, String str) {
            super.add(i8, (int) str);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public String set(int i8, String str) {
            return (String) super.set(i8, (int) str);
        }

        @Override // org.bouncycastle.util.k
        public String[] toStringArray(int i8, int i9) {
            String[] strArr = new String[i9 - i8];
            for (int i10 = i8; i10 != size() && i10 != i9; i10++) {
                strArr[i10 - i8] = get(i10);
            }
            return strArr;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(String str) {
            return super.add((StringListImpl) str);
        }
    }

    static class a implements PrivilegedAction {
        a() {
        }

        @Override // java.security.PrivilegedAction
        public String run() {
            return System.getProperty("line.separator");
        }
    }

    static {
        try {
            try {
                LINE_SEPARATOR = (String) AccessController.doPrivileged(new a());
            } catch (Exception unused) {
                LINE_SEPARATOR = String.format("%n", new Object[0]);
            }
        } catch (Exception unused2) {
            LINE_SEPARATOR = "\n";
        }
    }

    public static char[] asCharArray(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i8 = 0; i8 != length; i8++) {
            cArr[i8] = (char) (bArr[i8] & 255);
        }
        return cArr;
    }

    public static boolean constantTimeAreEqual(String str, String str2) {
        boolean z7 = str.length() == str2.length();
        int length = str.length();
        for (int i8 = 0; i8 != length; i8++) {
            z7 &= str.charAt(i8) == str2.charAt(i8);
        }
        return z7;
    }

    public static String fromByteArray(byte[] bArr) {
        return new String(asCharArray(bArr));
    }

    public static String fromUTF8ByteArray(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int transcodeToUTF16 = org.bouncycastle.util.encoders.f.transcodeToUTF16(bArr, cArr);
        if (transcodeToUTF16 >= 0) {
            return new String(cArr, 0, transcodeToUTF16);
        }
        throw new IllegalArgumentException("Invalid UTF-8 input");
    }

    public static String lineSeparator() {
        return LINE_SEPARATOR;
    }

    public static k newList() {
        return new StringListImpl(null);
    }

    public static String[] split(String str, char c8) {
        int i8;
        Vector vector = new Vector();
        boolean z7 = true;
        while (true) {
            if (!z7) {
                break;
            }
            int indexOf = str.indexOf(c8);
            if (indexOf > 0) {
                vector.addElement(str.substring(0, indexOf));
                str = str.substring(indexOf + 1);
            } else {
                vector.addElement(str);
                z7 = false;
            }
        }
        int size = vector.size();
        String[] strArr = new String[size];
        for (i8 = 0; i8 != size; i8++) {
            strArr[i8] = (String) vector.elementAt(i8);
        }
        return strArr;
    }

    public static int toByteArray(String str, byte[] bArr, int i8) {
        int length = str.length();
        for (int i9 = 0; i9 < length; i9++) {
            bArr[i8 + i9] = (byte) str.charAt(i9);
        }
        return length;
    }

    public static String toLowerCase(String str) {
        char[] charArray = str.toCharArray();
        boolean z7 = false;
        for (int i8 = 0; i8 != charArray.length; i8++) {
            char c8 = charArray[i8];
            if ('A' <= c8 && 'Z' >= c8) {
                charArray[i8] = (char) (c8 + ' ');
                z7 = true;
            }
        }
        return z7 ? new String(charArray) : str;
    }

    public static void toUTF8ByteArray(char[] cArr, OutputStream outputStream) {
        int i8;
        int i9;
        int i10 = 0;
        while (i10 < cArr.length) {
            char c8 = cArr[i10];
            int i11 = c8;
            if (c8 >= 128) {
                if (c8 < 2048) {
                    i8 = (c8 >> 6) | PsExtractor.AUDIO_STREAM;
                } else if (c8 < 55296 || c8 > 57343) {
                    outputStream.write((c8 >> '\f') | 224);
                    i8 = ((c8 >> 6) & 63) | 128;
                } else {
                    i10++;
                    if (i10 >= cArr.length) {
                        throw new IllegalStateException("invalid UTF-16 codepoint");
                    }
                    char c9 = cArr[i10];
                    if (c8 > 56319) {
                        throw new IllegalStateException("invalid UTF-16 codepoint");
                    }
                    int i12 = (((c8 & 1023) << 10) | (c9 & 1023)) + 65536;
                    outputStream.write((i12 >> 18) | 240);
                    outputStream.write(((i12 >> 12) & 63) | 128);
                    outputStream.write(((i12 >> 6) & 63) | 128);
                    i9 = i12;
                    i11 = (i9 & 63) | 128;
                }
                outputStream.write(i8);
                i9 = c8;
                i11 = (i9 & 63) | 128;
            }
            outputStream.write(i11);
            i10++;
        }
    }

    public static String toUpperCase(String str) {
        char[] charArray = str.toCharArray();
        boolean z7 = false;
        for (int i8 = 0; i8 != charArray.length; i8++) {
            char c8 = charArray[i8];
            if ('a' <= c8 && 'z' >= c8) {
                charArray[i8] = (char) (c8 - ' ');
                z7 = true;
            }
        }
        return z7 ? new String(charArray) : str;
    }

    public static byte[] toByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i8 = 0; i8 != length; i8++) {
            bArr[i8] = (byte) str.charAt(i8);
        }
        return bArr;
    }

    public static byte[] toUTF8ByteArray(String str) {
        return toUTF8ByteArray(str.toCharArray());
    }

    public static byte[] toByteArray(char[] cArr) {
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i8 = 0; i8 != length; i8++) {
            bArr[i8] = (byte) cArr[i8];
        }
        return bArr;
    }

    public static byte[] toUTF8ByteArray(char[] cArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            toUTF8ByteArray(cArr, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalStateException("cannot encode string to byte array!");
        }
    }
}
