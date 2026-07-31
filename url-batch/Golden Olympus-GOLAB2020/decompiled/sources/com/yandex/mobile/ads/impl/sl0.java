package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class sl0 implements ws {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f31829a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ps0 f31830b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f31831c;

    public /* synthetic */ sl0() {
        this(new Object(), new ps0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Set set, on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((ws) it.next()).i(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Set set, on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((ws) it.next()).g(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Set set, on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((ws) it.next()).c(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Set set, on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((ws) it.next()).b(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Set set, on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((ws) it.next()).e(videoAd);
        }
    }

    public final void a(@NotNull on0 videoAd, @NotNull ws listener) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f31829a) {
            try {
                Set set = (Set) this.f31831c.get(videoAd);
                if (set == null) {
                    set = new HashSet();
                    this.f31831c.put(videoAd, set);
                }
                set.add(listener);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.ws
    public final void g(@NotNull final on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet j4 = j(videoAd);
        if (j4 != null) {
            this.f31830b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Td
                @Override // java.lang.Runnable
                public final void run() {
                    sl0.c(j4, videoAd);
                }
            });
        }
    }

    @Override // com.yandex.mobile.ads.impl.ws
    public final void h(@NotNull final on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet j4 = j(videoAd);
        if (j4 != null) {
            this.f31830b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Od
                @Override // java.lang.Runnable
                public final void run() {
                    sl0.a(j4, videoAd);
                }
            });
        }
    }

    @Override // com.yandex.mobile.ads.impl.ws
    public final void i(@NotNull final on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet j4 = j(videoAd);
        if (j4 != null) {
            this.f31830b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Rd
                @Override // java.lang.Runnable
                public final void run() {
                    sl0.b(j4, videoAd);
                }
            });
        }
    }

    private final HashSet j(on0 on0Var) {
        HashSet hashSet;
        synchronized (this.f31829a) {
            Set set = (Set) this.f31831c.get(on0Var);
            hashSet = set != null ? new HashSet(set) : null;
        }
        return hashSet;
    }

    public sl0(@NotNull Object lock, @NotNull ps0 mainThreadExecutor) {
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(mainThreadExecutor, "mainThreadExecutor");
        this.f31829a = lock;
        this.f31830b = mainThreadExecutor;
        this.f31831c = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Set set, on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((ws) it.next()).a(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Set set, on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((ws) it.next()).d(videoAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(Set set, on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((ws) it.next()).f(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ws
    public final void b(@NotNull final on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet j4 = j(videoAd);
        if (j4 != null) {
            this.f31830b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Sd
                @Override // java.lang.Runnable
                public final void run() {
                    sl0.e(j4, videoAd);
                }
            });
        }
    }

    @Override // com.yandex.mobile.ads.impl.ws
    public final void c(@NotNull final on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet j4 = j(videoAd);
        if (j4 != null) {
            this.f31830b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Vd
                @Override // java.lang.Runnable
                public final void run() {
                    sl0.d(j4, videoAd);
                }
            });
        }
    }

    @Override // com.yandex.mobile.ads.impl.ws
    public final void d(@NotNull final on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet j4 = j(videoAd);
        if (j4 != null) {
            this.f31830b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Qd
                @Override // java.lang.Runnable
                public final void run() {
                    sl0.h(j4, videoAd);
                }
            });
        }
    }

    @Override // com.yandex.mobile.ads.impl.ws
    public final void e(@NotNull final on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet j4 = j(videoAd);
        if (j4 != null) {
            this.f31830b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Wd
                @Override // java.lang.Runnable
                public final void run() {
                    sl0.f(j4, videoAd);
                }
            });
        }
    }

    @Override // com.yandex.mobile.ads.impl.ws
    public final void f(@NotNull final on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet j4 = j(videoAd);
        if (j4 != null) {
            this.f31830b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Xd
                @Override // java.lang.Runnable
                public final void run() {
                    sl0.i(j4, videoAd);
                }
            });
        }
    }

    public final void b(@NotNull on0 videoAd, @NotNull ws listener) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f31829a) {
            try {
                Set set = (Set) this.f31831c.get(videoAd);
                if (set != null) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual(listener, (ws) it.next())) {
                            it.remove();
                        }
                    }
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Set set, on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((ws) it.next()).h(videoAd);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ws
    public final void a(@NotNull final on0 videoAd) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet j4 = j(videoAd);
        if (j4 != null) {
            this.f31830b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Pd
                @Override // java.lang.Runnable
                public final void run() {
                    sl0.g(j4, videoAd);
                }
            });
        }
    }

    @Override // com.yandex.mobile.ads.impl.ws
    public final void a(@NotNull final on0 videoAd, @NotNull final mc2 error) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(error, "error");
        final HashSet j4 = j(videoAd);
        if (j4 != null) {
            this.f31830b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Yd
                @Override // java.lang.Runnable
                public final void run() {
                    sl0.a(j4, videoAd, error);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Set set, on0 videoAd, mc2 error) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Intrinsics.checkNotNullParameter(error, "$error");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((ws) it.next()).a(videoAd, error);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ws
    public final void a(@NotNull final on0 videoAd, final float f4) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        final HashSet j4 = j(videoAd);
        if (j4 != null) {
            this.f31830b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.Ud
                @Override // java.lang.Runnable
                public final void run() {
                    sl0.a(j4, videoAd, f4);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Set set, on0 videoAd, float f4) {
        Intrinsics.checkNotNullParameter(videoAd, "$videoAd");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((ws) it.next()).a(videoAd, f4);
        }
    }

    public final void a() {
        this.f31830b.a();
    }
}
