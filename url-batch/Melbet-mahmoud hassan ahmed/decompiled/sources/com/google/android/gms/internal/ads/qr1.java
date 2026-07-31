package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
final class qr1<T> implements t70<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<T> f10808a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10809b;

    /* renamed from: c, reason: collision with root package name */
    private final t70<T> f10810c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ rr1 f10811d;

    /* synthetic */ qr1(rr1 rr1Var, WeakReference weakReference, String str, t70 t70Var, pr1 pr1Var) {
        this.f10811d = rr1Var;
        this.f10808a = weakReference;
        this.f10809b = str;
        this.f10810c = t70Var;
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final void a(Object obj, Map<String, String> map) {
        T t6 = this.f10808a.get();
        if (t6 == null) {
            this.f10811d.k(this.f10809b, this);
        } else {
            this.f10810c.a(t6, map);
        }
    }
}
