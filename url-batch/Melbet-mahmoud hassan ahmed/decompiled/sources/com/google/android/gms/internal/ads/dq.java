package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import t2.a;

/* loaded from: classes.dex */
public final class dq {

    /* renamed from: a, reason: collision with root package name */
    private nx f4276a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f4277b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4278c;

    /* renamed from: d, reason: collision with root package name */
    private final kz f4279d;

    /* renamed from: e, reason: collision with root package name */
    private final int f4280e;

    /* renamed from: f, reason: collision with root package name */
    private final a.AbstractC0140a f4281f;

    /* renamed from: g, reason: collision with root package name */
    private final ad0 f4282g = new ad0();

    /* renamed from: h, reason: collision with root package name */
    private final ov f4283h = ov.f9836a;

    public dq(Context context, String str, kz kzVar, int i7, a.AbstractC0140a abstractC0140a) {
        this.f4277b = context;
        this.f4278c = str;
        this.f4279d = kzVar;
        this.f4280e = i7;
        this.f4281f = abstractC0140a;
    }

    public final void a() {
        try {
            this.f4276a = qw.a().d(this.f4277b, pv.g(), this.f4278c, this.f4282g);
            vv vvVar = new vv(this.f4280e);
            nx nxVar = this.f4276a;
            if (nxVar != null) {
                nxVar.L4(vvVar);
                this.f4276a.q5(new op(this.f4281f, this.f4278c));
                this.f4276a.F4(this.f4283h.a(this.f4277b, this.f4279d));
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }
}
