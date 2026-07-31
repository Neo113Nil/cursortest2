package com.squareup.picasso;

import android.content.Context;
import java.io.File;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes2.dex */
public final class p implements d1.c {

    /* renamed from: a, reason: collision with root package name */
    final Call.Factory f21753a;

    /* renamed from: b, reason: collision with root package name */
    private final Cache f21754b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f21755c;

    public p(Context context) {
        this(y.e(context));
    }

    @Override // d1.c
    public Response a(Request request) {
        return this.f21753a.a(request).execute();
    }

    public p(File file) {
        this(file, y.a(file));
    }

    public p(File file, long j4) {
        this(new OkHttpClient.Builder().b(new Cache(file, j4)).a());
        this.f21755c = false;
    }

    public p(OkHttpClient okHttpClient) {
        this.f21755c = true;
        this.f21753a = okHttpClient;
        this.f21754b = okHttpClient.j();
    }
}
