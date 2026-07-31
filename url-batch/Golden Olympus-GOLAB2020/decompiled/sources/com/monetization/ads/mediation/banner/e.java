package com.monetization.ads.mediation.banner;

import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import com.monetization.ads.mediation.banner.d;
import com.yandex.mobile.ads.impl.ap0;
import com.yandex.mobile.ads.impl.og2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ View f20728a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d.a f20729b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f20730c;

    e(d dVar, View view, d.a aVar) {
        this.f20728a = view;
        this.f20729b = aVar;
        this.f20730c = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(d this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        og2.a(d.a(this$0), false);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        Handler handler;
        ap0.d(new Object[0]);
        if (!this.f20728a.isShown()) {
            return true;
        }
        this.f20728a.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f20729b.a();
        handler = this.f20730c.f20726b;
        final d dVar = this.f20730c;
        handler.postDelayed(new Runnable() { // from class: com.monetization.ads.mediation.banner.g
            @Override // java.lang.Runnable
            public final void run() {
                e.a(d.this);
            }
        }, 50L);
        return true;
    }
}
