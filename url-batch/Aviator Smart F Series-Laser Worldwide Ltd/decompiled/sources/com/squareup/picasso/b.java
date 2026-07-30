package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import cn.hutool.core.util.g1;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.w;
import okio.j0;

/* loaded from: classes4.dex */
class b extends w {
    protected static final String ANDROID_ASSET = "android_asset";
    private static final int ASSET_PREFIX_LENGTH = 22;
    private AssetManager assetManager;
    private final Context context;
    private final Object lock = new Object();

    b(Context context) {
        this.context = context;
    }

    static String getFilePath(u uVar) {
        return uVar.uri.toString().substring(ASSET_PREFIX_LENGTH);
    }

    @Override // com.squareup.picasso.w
    public boolean canHandleRequest(u uVar) {
        Uri uri = uVar.uri;
        return g1.URL_PROTOCOL_FILE.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && ANDROID_ASSET.equals(uri.getPathSegments().get(0));
    }

    @Override // com.squareup.picasso.w
    public w.a load(u uVar, int i8) {
        if (this.assetManager == null) {
            synchronized (this.lock) {
                try {
                    if (this.assetManager == null) {
                        this.assetManager = this.context.getAssets();
                    }
                } finally {
                }
            }
        }
        return new w.a(j0.source(this.assetManager.open(getFilePath(uVar))), Picasso.LoadedFrom.DISK);
    }
}
