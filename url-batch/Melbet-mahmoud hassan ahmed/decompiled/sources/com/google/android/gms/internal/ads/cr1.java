package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes.dex */
public final class cr1 implements t70<Object> {

    /* renamed from: a, reason: collision with root package name */
    private final o50 f3924a;

    /* renamed from: b, reason: collision with root package name */
    private final rr1 f3925b;

    /* renamed from: c, reason: collision with root package name */
    private final ev3<yq1> f3926c;

    public cr1(cn1 cn1Var, rm1 rm1Var, rr1 rr1Var, ev3<yq1> ev3Var) {
        this.f3924a = cn1Var.c(rm1Var.g0());
        this.f3925b = rr1Var;
        this.f3926c = ev3Var;
    }

    @Override // com.google.android.gms.internal.ads.t70
    public final void a(Object obj, Map<String, String> map) {
        String str = map.get("asset");
        try {
            this.f3924a.e3(this.f3926c.a(), str);
        } catch (RemoteException e7) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            io0.h(sb.toString(), e7);
        }
    }

    public final void b() {
        if (this.f3924a == null) {
            return;
        }
        this.f3925b.i("/nativeAdCustomClick", this);
    }
}
