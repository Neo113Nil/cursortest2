package sd;

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
import kotlin.collections.i0;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class j extends i {
    public static String a(File file) {
        Charset charset = Charsets.UTF_8;
        file.getClass();
        charset.getClass();
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[8192];
            for (int read = inputStreamReader.read(cArr); read >= 0; read = inputStreamReader.read(cArr)) {
                stringWriter.write(cArr, 0, read);
            }
            String stringWriter2 = stringWriter.toString();
            stringWriter2.getClass();
            inputStreamReader.close();
            return stringWriter2;
        } finally {
        }
    }

    public static void b(File file, String str) {
        Charset charset = Charsets.UTF_8;
        str.getClass();
        charset.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            c(fileOutputStream, str, charset);
            fileOutputStream.close();
        } finally {
        }
    }

    public static final void c(FileOutputStream fileOutputStream, String str, Charset charset) {
        str.getClass();
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder onUnmappableCharacter = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer allocate = CharBuffer.allocate(8192);
        onUnmappableCharacter.getClass();
        ByteBuffer allocate2 = ByteBuffer.allocate(8192 * ((int) Math.ceil(onUnmappableCharacter.maxBytesPerChar())));
        allocate2.getClass();
        int i3 = 0;
        int i10 = 0;
        while (i3 < str.length()) {
            int min = Math.min(8192 - i10, str.length() - i3);
            int i11 = i3 + min;
            char[] array = allocate.array();
            array.getClass();
            str.getChars(i3, i11, array, i10);
            allocate.limit(min + i10);
            i10 = 1;
            if (!onUnmappableCharacter.encode(allocate, allocate2, i11 == str.length()).isUnderflow()) {
                i0.l("Check failed.");
                return;
            }
            fileOutputStream.write(allocate2.array(), 0, allocate2.position());
            if (allocate.position() != allocate.limit()) {
                allocate.put(0, allocate.get());
            } else {
                i10 = 0;
            }
            allocate.clear();
            allocate2.clear();
            i3 = i11;
        }
    }
}
