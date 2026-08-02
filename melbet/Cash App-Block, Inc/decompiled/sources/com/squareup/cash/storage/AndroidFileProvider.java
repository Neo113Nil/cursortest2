package com.squareup.cash.storage;

import android.app.Application;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;

/* loaded from: classes.dex */
public final class AndroidFileProvider {
    public final Application context;
    public final FileProviderAuthority fileProviderAuthority;

    public AndroidFileProvider(Application application, FileProviderAuthority fileProviderAuthority) {
        this.context = application;
        this.fileProviderAuthority = fileProviderAuthority;
    }

    public final Uri contentUriForFileUri(Uri uri) {
        uri.getClass();
        String str = this.fileProviderAuthority.id;
        String path = uri.getPath();
        path.getClass();
        Uri uriForFile = FileProvider.getUriForFile(this.context, str, new File(path));
        uriForFile.getClass();
        return uriForFile;
    }
}
