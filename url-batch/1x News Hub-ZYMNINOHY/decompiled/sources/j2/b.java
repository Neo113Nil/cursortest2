package j2;

import androidx.datastore.preferences.protobuf.C0145l;
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
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public abstract class b extends android.support.v4.media.session.a {
    public static void Z(File file, File file2) {
        if (!file.exists()) {
            throw new a(file, null, "The source file doesn't exist.");
        }
        if (file2.exists()) {
            throw new a(file, file2, "The destination file already exists.");
        }
        if (file.isDirectory()) {
            if (!file2.mkdirs()) {
                throw new C0145l(file, file2, "Failed to create target directory.");
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
                S0.a.c(fileInputStream, fileOutputStream);
                fileOutputStream.close();
                fileInputStream.close();
            } finally {
            }
        } finally {
        }
    }

    public static String a0(File file) {
        Charset charset = s2.a.f10316a;
        j.e(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            for (int read = inputStreamReader.read(cArr); read >= 0; read = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, read);
            }
            String stringWriter2 = stringWriter.toString();
            j.d(stringWriter2, "toString(...)");
            inputStreamReader.close();
            return stringWriter2;
        } finally {
        }
    }

    public static final void b0(FileOutputStream fileOutputStream, String str, Charset charset) {
        j.e(charset, "charset");
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            j.d(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder onUnmappableCharacter = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer allocate = CharBuffer.allocate(8192);
        j.b(onUnmappableCharacter);
        ByteBuffer allocate2 = ByteBuffer.allocate(8192 * ((int) Math.ceil(onUnmappableCharacter.maxBytesPerChar())));
        j.d(allocate2, "allocate(...)");
        int i3 = 0;
        int i4 = 0;
        while (i3 < str.length()) {
            int min = Math.min(8192 - i4, str.length() - i3);
            int i5 = i3 + min;
            char[] array = allocate.array();
            j.d(array, "array(...)");
            str.getChars(i3, i5, array, i4);
            allocate.limit(min + i4);
            i4 = 1;
            if (!onUnmappableCharacter.encode(allocate, allocate2, i5 == str.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(allocate2.array(), 0, allocate2.position());
            if (allocate.position() != allocate.limit()) {
                allocate.put(0, allocate.get());
            } else {
                i4 = 0;
            }
            allocate.clear();
            allocate2.clear();
            i3 = i5;
        }
    }
}
