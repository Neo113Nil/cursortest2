package h;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public abstract /* synthetic */ class k {
    public static /* synthetic */ ZipInputStream a(InputStream inputStream, Charset charset) {
        return new ZipInputStream(inputStream, charset);
    }
}
