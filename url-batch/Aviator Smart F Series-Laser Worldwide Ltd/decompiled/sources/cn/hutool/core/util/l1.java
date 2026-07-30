package cn.hutool.core.util;

import java.io.File;
import java.nio.charset.Charset;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public abstract /* synthetic */ class l1 {
    public static /* synthetic */ ZipFile a(File file, Charset charset) {
        return new ZipFile(file, charset);
    }
}
