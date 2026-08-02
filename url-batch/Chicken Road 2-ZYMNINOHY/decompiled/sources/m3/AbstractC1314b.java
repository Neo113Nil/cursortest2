package m3;

import O3.l;
import androidx.datastore.preferences.protobuf.C0179l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.jvm.internal.i;
import w3.AbstractC1504a;

/* renamed from: m3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1314b extends V3.b {
    public static void N(File file, File file2) {
        if (!file.exists()) {
            throw new C1313a(file, null, "The source file doesn't exist.");
        }
        if (file2.exists()) {
            throw new C1313a(file, file2, "The destination file already exists.");
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new C0179l(file, file2, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                l.g(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } finally {
        }
    }

    public static String O(File file) {
        Charset charset = AbstractC1504a.f15936a;
        i.e(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            for (int read = inputStreamReader.read(cArr); read >= 0; read = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, read);
            }
            String stringWriter2 = stringWriter.toString();
            i.d(stringWriter2, "toString(...)");
            inputStreamReader.close();
            return stringWriter2;
        } finally {
        }
    }

    public static final void P(FileOutputStream fileOutputStream, String str, Charset charset) {
        i.e(charset, "charset");
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            i.d(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder onUnmappableCharacter = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer allocate = CharBuffer.allocate(8192);
        i.b(onUnmappableCharacter);
        ByteBuffer allocate2 = ByteBuffer.allocate(8192 * ((int) Math.ceil(onUnmappableCharacter.maxBytesPerChar())));
        i.d(allocate2, "allocate(...)");
        int i4 = 0;
        int i5 = 0;
        while (i4 < str.length()) {
            int min = Math.min(8192 - i5, str.length() - i4);
            int i6 = i4 + min;
            char[] array = allocate.array();
            i.d(array, "array(...)");
            str.getChars(i4, i6, array, i5);
            allocate.limit(min + i5);
            i5 = 1;
            if (!onUnmappableCharacter.encode(allocate, allocate2, i6 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(allocate2.array(), 0, allocate2.position());
            if (allocate.position() != allocate.limit()) {
                allocate.put(0, allocate.get());
            } else {
                i5 = 0;
            }
            allocate.clear();
            allocate2.clear();
            i4 = i6;
        }
    }
}
