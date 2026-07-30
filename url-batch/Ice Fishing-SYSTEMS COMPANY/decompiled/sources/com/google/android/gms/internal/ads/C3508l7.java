package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.l7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3508l7 extends AbstractC2720Pd {

    /* renamed from: I, reason: collision with root package name */
    public final /* synthetic */ int f32541I = 0;
    public Long J;

    /* renamed from: K, reason: collision with root package name */
    public Object f32542K;

    /* renamed from: L, reason: collision with root package name */
    public Object f32543L;

    public /* synthetic */ C3508l7() {
        super(19);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2720Pd
    public final HashMap f() {
        switch (this.f32541I) {
            case 0:
                HashMap hashMap = new HashMap();
                hashMap.put(0, this.J);
                hashMap.put(1, (Long) this.f32542K);
                hashMap.put(2, (Long) this.f32543L);
                return hashMap;
            default:
                HashMap hashMap2 = new HashMap();
                hashMap2.put(0, this.J);
                hashMap2.put(1, (Boolean) this.f32542K);
                hashMap2.put(2, (Boolean) this.f32543L);
                return hashMap2;
        }
    }

    public C3508l7(String str) {
        super(19);
        HashMap o9 = AbstractC2720Pd.o(str);
        if (o9 != null) {
            this.J = (Long) o9.get(0);
            this.f32542K = (Boolean) o9.get(1);
            this.f32543L = (Boolean) o9.get(2);
        }
    }
}
