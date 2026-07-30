package cn.hutool.core.util;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.zip.ZipOutputStream;

/* loaded from: classes.dex */
public abstract /* synthetic */ class k1 {
    public static /* synthetic */ ZipOutputStream a(OutputStream outputStream, Charset charset) {
        return new ZipOutputStream(outputStream, charset);
    }
}
