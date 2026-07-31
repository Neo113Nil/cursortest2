package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class ox3 implements jx3 {

    /* renamed from: a, reason: collision with root package name */
    public final o54 f9876a;

    /* renamed from: d, reason: collision with root package name */
    public int f9879d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9880e;

    /* renamed from: c, reason: collision with root package name */
    public final List<s54> f9878c = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final Object f9877b = new Object();

    public ox3(v54 v54Var, boolean z6) {
        this.f9876a = new o54(v54Var, z6);
    }

    @Override // com.google.android.gms.internal.ads.jx3
    public final Object a() {
        return this.f9877b;
    }

    public final void b(int i7) {
        this.f9879d = i7;
        this.f9880e = false;
        this.f9878c.clear();
    }

    @Override // com.google.android.gms.internal.ads.jx3
    public final ei0 zza() {
        return this.f9876a.F();
    }
}
