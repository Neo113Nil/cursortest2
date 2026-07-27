package r4;

import B0.f;
import androidx.datastore.preferences.protobuf.C0216k;
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
import n2.AbstractC1341c;
import u1.AbstractC1477a;

/* renamed from: r4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1408b extends f {
    public static void M(File file, File target) {
        i.e(file, "<this>");
        i.e(target, "target");
        if (!file.exists()) {
            throw new C1407a(file, null, "The source file doesn't exist.");
        }
        if (target.exists()) {
            throw new C1407a(file, target, "The destination file already exists.");
        }
        if (file.isDirectory()) {
            if (!target.mkdirs()) {
                throw new C0216k(file, target, "Failed to create target directory.");
            }
            return;
        }
        File parentFile = target.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            try {
                AbstractC1341c.d(fileInputStream, fileOutputStream, 8192);
                AbstractC1477a.e(fileOutputStream, null);
                AbstractC1477a.e(fileInputStream, null);
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1477a.e(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static String N(File file) {
        Charset charset = B4.a.f287a;
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
            AbstractC1477a.e(inputStreamReader, null);
            return stringWriter2;
        } finally {
        }
    }

    public static final void O(FileOutputStream fileOutputStream, String text, Charset charset) {
        i.e(text, "text");
        i.e(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
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
        int i2 = 0;
        int i3 = 0;
        while (i2 < text.length()) {
            int min = Math.min(8192 - i3, text.length() - i2);
            int i6 = i2 + min;
            char[] array = allocate.array();
            i.d(array, "array(...)");
            text.getChars(i2, i6, array, i3);
            allocate.limit(min + i3);
            i3 = 1;
            if (!onUnmappableCharacter.encode(allocate, allocate2, i6 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(allocate2.array(), 0, allocate2.position());
            if (allocate.position() != allocate.limit()) {
                allocate.put(0, allocate.get());
            } else {
                i3 = 0;
            }
            allocate.clear();
            allocate2.clear();
            i2 = i6;
        }
    }
}
