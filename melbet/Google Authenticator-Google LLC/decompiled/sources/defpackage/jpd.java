package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpd {
    private static final List c = new ArrayList();
    public final CharsetEncoder[] a;
    public final int b;

    static {
        String[] strArr = {"IBM437", "ISO-8859-2", "ISO-8859-3", "ISO-8859-4", "ISO-8859-5", "ISO-8859-6", "ISO-8859-7", "ISO-8859-8", "ISO-8859-9", "ISO-8859-10", "ISO-8859-11", "ISO-8859-13", "ISO-8859-14", "ISO-8859-15", "ISO-8859-16", "windows-1250", "windows-1251", "windows-1252", "windows-1256", "Shift_JIS"};
        for (int i = 0; i < 20; i++) {
            String str = strArr[i];
            if (((jpc) jpc.B.get(str)) != null) {
                try {
                    c.add(Charset.forName(str).newEncoder());
                } catch (UnsupportedCharsetException unused) {
                }
            }
        }
    }

    public jpd(String str, Charset charset) {
        int i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(StandardCharsets.ISO_8859_1.newEncoder());
        int i2 = 0;
        boolean z = charset != null && charset.name().startsWith("UTF");
        for (int i3 = 0; i3 < str.length(); i3++) {
            int size = arrayList.size();
            int i4 = 0;
            while (true) {
                if (i4 < size) {
                    boolean canEncode = ((CharsetEncoder) arrayList.get(i4)).canEncode(str.charAt(i3));
                    i4++;
                    if (canEncode) {
                        break;
                    }
                } else {
                    Iterator it = c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        }
                        CharsetEncoder charsetEncoder = (CharsetEncoder) it.next();
                        if (charsetEncoder.canEncode(str.charAt(i3))) {
                            arrayList.add(charsetEncoder);
                            break;
                        }
                    }
                }
            }
        }
        if (arrayList.size() != 1 || z) {
            this.a = new CharsetEncoder[arrayList.size() + 2];
            int size2 = arrayList.size();
            int i5 = 0;
            int i6 = 0;
            while (true) {
                i = i5 + 1;
                if (i6 >= size2) {
                    break;
                }
                this.a[i5] = (CharsetEncoder) arrayList.get(i6);
                i6++;
                i5 = i;
            }
            this.a[i5] = StandardCharsets.UTF_8.newEncoder();
            this.a[i] = StandardCharsets.UTF_16BE.newEncoder();
        } else {
            this.a = new CharsetEncoder[]{(CharsetEncoder) arrayList.get(0)};
        }
        int i7 = -1;
        if (charset != null) {
            while (true) {
                CharsetEncoder[] charsetEncoderArr = this.a;
                if (i2 >= charsetEncoderArr.length) {
                    break;
                }
                if (charsetEncoderArr[i2] != null && charset.name().equals(this.a[i2].charset().name())) {
                    i7 = i2;
                    break;
                }
                i2++;
            }
        }
        this.b = i7;
    }

    public final int a() {
        return this.a.length;
    }

    public final Charset b(int i) {
        return this.a[i].charset();
    }

    public final boolean c(char c2, int i) {
        CharsetEncoder charsetEncoder = this.a[i];
        StringBuilder sb = new StringBuilder();
        sb.append(c2);
        return charsetEncoder.canEncode(sb.toString());
    }

    public final byte[] d(String str, int i) {
        return str.getBytes(this.a[i].charset());
    }
}
