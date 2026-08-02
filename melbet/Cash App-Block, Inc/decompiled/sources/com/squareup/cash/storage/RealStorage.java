package com.squareup.cash.storage;

import android.content.Context;
import android.net.Uri;
import kotlin.jvm.functions.Function1;
import okio.ForwardingFileSystem;
import okio.Path;

/* loaded from: classes.dex */
public final class RealStorage implements Storage {
    public final ContextForwardingFileSystem cache;
    public final Context context;
    public final ContextForwardingFileSystem files;
    public final ContextForwardingFileSystem temp;

    public RealStorage(Context context) {
        this.context = context;
        this.cache = new ContextForwardingFileSystem(context, RealStorage$cache$1.INSTANCE);
        this.files = new ContextForwardingFileSystem(context, RealStorage$files$1.INSTANCE);
        this.temp = new ContextForwardingFileSystem(context, new RealStorage$temp$1(1, this, RealStorage.class, "getTempDir", "getTempDir(Landroid/content/Context;)Ljava/io/File;", 0, 0));
    }

    public final Uri getFileUri(Path path, Function1 function1) {
        path.getClass();
        function1.getClass();
        Object invoke = function1.invoke(this);
        invoke.getClass();
        Uri fromFile = Uri.fromFile(((ForwardingFileSystem) invoke).onPathParameter(path, "getFileUri", "path").toFile());
        fromFile.getClass();
        return fromFile;
    }
}
