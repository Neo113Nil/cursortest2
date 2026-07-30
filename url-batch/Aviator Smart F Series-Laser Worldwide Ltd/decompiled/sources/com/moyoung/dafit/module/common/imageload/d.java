package com.moyoung.dafit.module.common.imageload;

import android.content.Context;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.q;
import java.io.File;
import okhttp3.Cache;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public class d {
    private static final long CACHE_MAX_SIZE = 209715200;
    private static final String PICASSO_CACHE_FILE_NAME = "picasso";

    public void setup(Context context) {
        try {
            Picasso.setSingletonInstance(new Picasso.b(context).downloader(new q(new OkHttpClient.Builder().addNetworkInterceptor(new e(context)).cache(new Cache(new File(context.getCacheDir() + File.separator + PICASSO_CACHE_FILE_NAME), CACHE_MAX_SIZE)).build())).build());
        } catch (IllegalStateException e8) {
            e8.printStackTrace();
        }
    }
}
