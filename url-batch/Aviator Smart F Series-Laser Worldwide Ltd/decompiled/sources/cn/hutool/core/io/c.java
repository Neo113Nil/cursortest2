package cn.hutool.core.io;

import com.google.zxing.common.StringUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/* loaded from: classes.dex */
public class c {
    private static final Charset[] DEFAULT_CHARSETS = (Charset[]) cn.hutool.core.convert.d.convert(Charset[].class, (Object) new String[]{cn.hutool.core.util.l.UTF_8, cn.hutool.core.util.l.GBK, StringUtils.GB2312, "GB18030", "UTF-16BE", "UTF-16LE", "UTF-16", "BIG5", "UNICODE", "US-ASCII"});

    public static Charset detect(File file, Charset... charsetArr) {
        return detect(l.getInputStream(file), charsetArr);
    }

    private static boolean identify(byte[] bArr, CharsetDecoder charsetDecoder) {
        try {
            charsetDecoder.decode(ByteBuffer.wrap(bArr));
            return true;
        } catch (CharacterCodingException unused) {
            return false;
        }
    }

    public static Charset detect(InputStream inputStream, Charset... charsetArr) {
        return detect(32768, inputStream, charsetArr);
    }

    public static Charset detect(int i8, InputStream inputStream, Charset... charsetArr) {
        if (cn.hutool.core.util.h.isEmpty((Object[]) charsetArr)) {
            charsetArr = DEFAULT_CHARSETS;
        }
        byte[] bArr = new byte[i8];
        while (inputStream.read(bArr) > -1) {
            try {
                try {
                    for (Charset charset : charsetArr) {
                        if (identify(bArr, charset.newDecoder())) {
                            return charset;
                        }
                    }
                } catch (IOException e8) {
                    throw new IORuntimeException(e8);
                }
            } finally {
                n.close((Closeable) inputStream);
            }
        }
        n.close((Closeable) inputStream);
        return null;
    }
}
