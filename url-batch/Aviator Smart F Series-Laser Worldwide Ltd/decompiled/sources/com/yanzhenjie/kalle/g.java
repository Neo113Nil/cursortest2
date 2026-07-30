package com.yanzhenjie.kalle;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class g extends a implements b {
    private File mFile;

    public g(File file) {
        this.mFile = file;
    }

    @Override // com.yanzhenjie.kalle.a, com.yanzhenjie.kalle.f
    public long contentLength() {
        return this.mFile.length();
    }

    @Override // com.yanzhenjie.kalle.a, com.yanzhenjie.kalle.f
    public String contentType() {
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(this.mFile.getName()));
        return TextUtils.isEmpty(mimeTypeFromExtension) ? "application/octet-stream" : mimeTypeFromExtension;
    }

    @Override // com.yanzhenjie.kalle.b
    public String name() {
        return this.mFile.getName();
    }

    @Override // com.yanzhenjie.kalle.a
    protected void onWrite(OutputStream outputStream) {
        FileInputStream fileInputStream = new FileInputStream(this.mFile);
        com.yanzhenjie.kalle.util.a.write(fileInputStream, outputStream);
        com.yanzhenjie.kalle.util.a.closeQuietly(fileInputStream);
    }
}
