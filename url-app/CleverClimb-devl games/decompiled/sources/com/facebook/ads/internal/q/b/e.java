package com.facebook.ads.internal.q.b;

import android.graphics.Bitmap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    static final int f5452a = Runtime.getRuntime().availableProcessors();

    /* renamed from: b, reason: collision with root package name */
    static final ExecutorService f5453b = Executors.newFixedThreadPool(f5452a);

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f5454c = true;

    /* renamed from: d, reason: collision with root package name */
    private final Bitmap f5455d;
    private Bitmap e;
    private final a f = new d();

    public e(Bitmap bitmap) {
        this.f5455d = bitmap;
    }

    public Bitmap a() {
        return this.e;
    }

    public Bitmap a(int i) {
        this.e = this.f.a(this.f5455d, i);
        return this.e;
    }
}
