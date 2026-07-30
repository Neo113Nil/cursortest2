package defpackage;

import com.facebook.internal.Utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class sl0 extends rl0 {
    public static String a(File file) {
        Charset charset = yt.b;
        file.getClass();
        charset.getClass();
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String r = yh2.r(inputStreamReader);
            inputStreamReader.close();
            return r;
        } finally {
        }
    }

    public static void b(File file, String str) {
        Charset charset = yt.b;
        charset.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            c(fileOutputStream, str, charset);
            Unit unit = Unit.a;
            fileOutputStream.close();
        } finally {
        }
    }

    public static final void c(FileOutputStream fileOutputStream, String str, Charset charset) {
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder onUnmappableCharacter = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer allocate = CharBuffer.allocate(Utility.DEFAULT_STREAM_BUFFER_SIZE);
        onUnmappableCharacter.getClass();
        ByteBuffer allocate2 = ByteBuffer.allocate(Utility.DEFAULT_STREAM_BUFFER_SIZE * ((int) Math.ceil(onUnmappableCharacter.maxBytesPerChar())));
        allocate2.getClass();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int min = Math.min(8192 - i2, str.length() - i);
            int i3 = i + min;
            char[] array = allocate.array();
            array.getClass();
            str.getChars(i, i3, array, i2);
            allocate.limit(min + i2);
            i2 = 1;
            if (!onUnmappableCharacter.encode(allocate, allocate2, i3 == str.length()).isUnderflow()) {
                lh.g("Check failed.");
                return;
            }
            fileOutputStream.write(allocate2.array(), 0, allocate2.position());
            if (allocate.position() != allocate.limit()) {
                allocate.put(0, allocate.get());
            } else {
                i2 = 0;
            }
            allocate.clear();
            allocate2.clear();
            i = i3;
        }
    }
}
