package kotlin.io;

import app.cash.trifle.signers.Buffer;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.text.Charsets;
import okio.Utf8;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.AppUpdateData;

/* loaded from: classes.dex */
public class FilesKt__FileReadWriteKt extends FilesKt__FilePathComponentsKt {
    public static byte[] readBytes(File file) {
        file.getClass();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArr = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int read = fileInputStream.read(bArr, i3, i2);
                if (read < 0) {
                    break;
                }
                i2 -= read;
                i3 += read;
            }
            if (i2 > 0) {
                bArr = Arrays.copyOf(bArr, i3);
            } else {
                int read2 = fileInputStream.read();
                if (read2 != -1) {
                    Buffer buffer = new Buffer(1);
                    buffer.write(read2);
                    ByteStreamsKt.copyTo$default(fileInputStream, buffer);
                    int size = buffer.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] buffer2 = buffer.getBuffer();
                    bArr = Arrays.copyOf(bArr, size);
                    ArraysKt___ArraysJvmKt.copyInto(i, buffer2, 0, bArr, buffer.size());
                }
            }
            fileInputStream.close();
            return bArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Utf8.closeFinally(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static String readText(File file, Charset charset) {
        file.getClass();
        charset.getClass();
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String readText = AppUpdateData.readText(inputStreamReader);
            inputStreamReader.close();
            return readText;
        } finally {
        }
    }

    public static void writeText$default(File file, String str) {
        Charset charset = Charsets.UTF_8;
        file.getClass();
        str.getClass();
        charset.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            writeTextImpl(fileOutputStream, str, charset);
            fileOutputStream.close();
        } finally {
        }
    }

    public static final void writeTextImpl(FileOutputStream fileOutputStream, String str, Charset charset) {
        str.getClass();
        charset.getClass();
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder onUnmappableCharacter = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer allocate = CharBuffer.allocate(PKIFailureInfo.certRevoked);
        onUnmappableCharacter.getClass();
        ByteBuffer allocate2 = ByteBuffer.allocate(PKIFailureInfo.certRevoked * ((int) Math.ceil(onUnmappableCharacter.maxBytesPerChar())));
        allocate2.getClass();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int min = Math.min(8192 - i2, str.length() - i);
            int i3 = i + min;
            char[] array2 = allocate.array();
            array2.getClass();
            str.getChars(i, i3, array2, i2);
            allocate.limit(min + i2);
            i2 = 1;
            if (!onUnmappableCharacter.encode(allocate, allocate2, i3 == str.length()).isUnderflow()) {
                a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
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
