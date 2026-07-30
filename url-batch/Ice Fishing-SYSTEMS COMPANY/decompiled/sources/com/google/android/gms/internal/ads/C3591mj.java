package com.google.android.gms.internal.ads;

import android.content.Context;
import org.json.JSONObject;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.mj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3591mj implements InterfaceC2608Ik {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f32745n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f32746u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C5107a f32747v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Ut f32748w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C3226fu f32749x;

    public /* synthetic */ C3591mj(Context context, C5107a c5107a, Ut ut, C3226fu c3226fu, int i) {
        this.f32745n = i;
        this.f32746u = context;
        this.f32747v = c5107a;
        this.f32748w = ut;
        this.f32749x = c3226fu;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2608Ik
    public final void e() {
        switch (this.f32745n) {
            case 0:
                JSONObject jSONObject = this.f32748w.f28111C;
                p2.j.f39798C.f39814o.d(this.f32746u, this.f32747v.f41217n, jSONObject.toString(), this.f32749x.f30904g);
                break;
            default:
                JSONObject jSONObject2 = this.f32748w.f28111C;
                p2.j.f39798C.f39814o.d(this.f32746u, this.f32747v.f41217n, jSONObject2.toString(), this.f32749x.f30904g);
                break;
        }
    }
}
