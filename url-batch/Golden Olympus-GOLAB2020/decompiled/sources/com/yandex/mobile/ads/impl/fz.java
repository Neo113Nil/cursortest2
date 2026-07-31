package com.yandex.mobile.ads.impl;

import android.util.SparseArray;
import com.yandex.mobile.ads.impl.C1933fm;
import com.yandex.mobile.ads.impl.rv0;
import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class fz implements r30 {

    /* renamed from: c, reason: collision with root package name */
    private static final SparseArray<Constructor<? extends q30>> f25948c;

    /* renamed from: a, reason: collision with root package name */
    private final C1933fm.a f25949a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f25950b;

    static {
        SparseArray<Constructor<? extends q30>> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, a(Class.forName("com.monetization.ads.exo.source.dash.offline.DashDownloader")));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, a(Class.forName("com.monetization.ads.exo.source.hls.offline.HlsDownloader")));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, a(Class.forName("com.monetization.ads.exo.source.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
        f25948c = sparseArray;
    }

    public fz(C1933fm.a aVar, ExecutorService executorService) {
        this.f25949a = (C1933fm.a) C2253tf.a(aVar);
        this.f25950b = (Executor) C2253tf.a(executorService);
    }

    public final q30 a(p30 p30Var) {
        int a4 = u82.a(p30Var.f30308c, p30Var.f30309d);
        if (a4 != 0 && a4 != 1 && a4 != 2) {
            if (a4 == 4) {
                return new wl1(new rv0.a().a(p30Var.f30308c).a(p30Var.f30312g).a(), this.f25949a, this.f25950b);
            }
            throw new IllegalArgumentException(C1877de.a("Unsupported type: ", a4));
        }
        Constructor<? extends q30> constructor = f25948c.get(a4);
        if (constructor == null) {
            throw new IllegalStateException(C1877de.a("Module missing for content type ", a4));
        }
        try {
            return constructor.newInstance(new rv0.a().a(p30Var.f30308c).a(p30Var.f30310e).a(p30Var.f30312g).a(), this.f25949a, this.f25950b);
        } catch (Exception unused) {
            throw new IllegalStateException(C1877de.a("Failed to instantiate downloader for content type ", a4));
        }
    }

    private static Constructor<? extends q30> a(Class<?> cls) {
        try {
            return cls.asSubclass(q30.class).getConstructor(rv0.class, C1933fm.a.class, Executor.class);
        } catch (NoSuchMethodException e4) {
            throw new IllegalStateException("Downloader constructor missing", e4);
        }
    }
}
