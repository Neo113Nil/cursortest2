package com.yandex.mobile.ads.impl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class af2 implements zt {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Object f23268a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ps0 f23269b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f23270c;

    public /* synthetic */ af2() {
        this(new Object(), new ps0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(af2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = this$0.a().iterator();
        while (it.hasNext()) {
            ((zt) it.next()).onVideoPaused();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(af2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = this$0.a().iterator();
        while (it.hasNext()) {
            ((zt) it.next()).onVideoPrepared();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(af2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = this$0.a().iterator();
        while (it.hasNext()) {
            ((zt) it.next()).onVideoResumed();
        }
    }

    public final void a(@NotNull re2 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        synchronized (this.f23268a) {
            this.f23270c.add(listener);
        }
    }

    public final void b() {
        this.f23270c.clear();
        this.f23269b.a();
    }

    @Override // com.yandex.mobile.ads.impl.zt
    public final void onVideoCompleted() {
        this.f23269b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.E
            @Override // java.lang.Runnable
            public final void run() {
                af2.a(af2.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.zt
    public final void onVideoError() {
        this.f23269b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.D
            @Override // java.lang.Runnable
            public final void run() {
                af2.b(af2.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.zt
    public final void onVideoPaused() {
        this.f23269b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.B
            @Override // java.lang.Runnable
            public final void run() {
                af2.c(af2.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.zt
    public final void onVideoPrepared() {
        this.f23269b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.C
            @Override // java.lang.Runnable
            public final void run() {
                af2.d(af2.this);
            }
        });
    }

    @Override // com.yandex.mobile.ads.impl.zt
    public final void onVideoResumed() {
        this.f23269b.a(new Runnable() { // from class: com.yandex.mobile.ads.impl.F
            @Override // java.lang.Runnable
            public final void run() {
                af2.e(af2.this);
            }
        });
    }

    private final HashSet a() {
        HashSet hashSet;
        synchronized (this.f23268a) {
            hashSet = new HashSet(this.f23270c);
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(af2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = this$0.a().iterator();
        while (it.hasNext()) {
            ((zt) it.next()).onVideoError();
        }
    }

    public af2(@NotNull Object lock, @NotNull ps0 mainThreadExecutor) {
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(mainThreadExecutor, "mainThreadExecutor");
        this.f23268a = lock;
        this.f23269b = mainThreadExecutor;
        this.f23270c = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(af2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Iterator it = this$0.a().iterator();
        while (it.hasNext()) {
            ((zt) it.next()).onVideoCompleted();
        }
    }
}
