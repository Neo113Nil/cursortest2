package com.squareup.picasso;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.File;
import java.io.IOException;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes4.dex */
public final class q implements j {
    private final Cache cache;

    @VisibleForTesting
    final Call.Factory client;
    private boolean sharedClient;

    public q(Context context) {
        this(d0.createDefaultCacheDir(context));
    }

    @Override // com.squareup.picasso.j
    @NonNull
    public Response load(@NonNull Request request) {
        return this.client.newCall(request).execute();
    }

    @Override // com.squareup.picasso.j
    public void shutdown() {
        Cache cache;
        if (this.sharedClient || (cache = this.cache) == null) {
            return;
        }
        try {
            cache.close();
        } catch (IOException unused) {
        }
    }

    public q(File file) {
        this(file, d0.calculateDiskCacheSize(file));
    }

    public q(Context context, long j8) {
        this(d0.createDefaultCacheDir(context), j8);
    }

    public q(File file, long j8) {
        this(new OkHttpClient.Builder().cache(new Cache(file, j8)).build());
        this.sharedClient = false;
    }

    public q(OkHttpClient okHttpClient) {
        this.sharedClient = true;
        this.client = okHttpClient;
        this.cache = okHttpClient.cache();
    }

    public q(Call.Factory factory) {
        this.sharedClient = true;
        this.client = factory;
        this.cache = null;
    }
}
