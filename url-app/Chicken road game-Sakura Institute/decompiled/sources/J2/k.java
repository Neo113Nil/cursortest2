package J2;

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
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes.dex */
public class k extends j {
    public static String a(File file) {
        Charset charset = Charsets.UTF_8;
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            Intrinsics.checkNotNullParameter(inputStreamReader, "<this>");
            StringWriter out = new StringWriter();
            Intrinsics.checkNotNullParameter(inputStreamReader, "<this>");
            Intrinsics.checkNotNullParameter(out, "out");
            char[] cArr = new char[8192];
            for (int read = inputStreamReader.read(cArr); read >= 0; read = inputStreamReader.read(cArr)) {
                out.write(cArr, 0, read);
            }
            String stringWriter = out.toString();
            Intrinsics.checkNotNullExpressionValue(stringWriter, "toString(...)");
            q.a(inputStreamReader, null);
            return stringWriter;
        } finally {
        }
    }

    public static void b(File file, String text) {
        Charset charset = Charsets.UTF_8;
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            c(fileOutputStream, text, charset);
            Unit unit = Unit.f7487a;
            q.a(fileOutputStream, null);
        } finally {
        }
    }

    public static final void c(FileOutputStream fileOutputStream, String text, Charset charset) {
        Intrinsics.checkNotNullParameter(fileOutputStream, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        Intrinsics.checkNotNullParameter(charset, "<this>");
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder encoder = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer allocate = CharBuffer.allocate(8192);
        Intrinsics.c(encoder);
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        ByteBuffer allocate2 = ByteBuffer.allocate(8192 * ((int) Math.ceil(encoder.maxBytesPerChar())));
        Intrinsics.checkNotNullExpressionValue(allocate2, "allocate(...)");
        int i2 = 0;
        int i4 = 0;
        while (i2 < text.length()) {
            int min = Math.min(8192 - i4, text.length() - i2);
            int i5 = i2 + min;
            char[] array = allocate.array();
            Intrinsics.checkNotNullExpressionValue(array, "array(...)");
            text.getChars(i2, i5, array, i4);
            allocate.limit(min + i4);
            i4 = 1;
            if (!encoder.encode(allocate, allocate2, i5 == text.length()).isUnderflow()) {
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
            i2 = i5;
        }
    }
}
