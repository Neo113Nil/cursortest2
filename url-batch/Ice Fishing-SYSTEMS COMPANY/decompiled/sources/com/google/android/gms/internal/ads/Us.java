package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class Us implements Qs {

    /* renamed from: a, reason: collision with root package name */
    public final String f28101a;

    /* renamed from: b, reason: collision with root package name */
    public final int f28102b;

    /* renamed from: c, reason: collision with root package name */
    public final int f28103c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28104d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f28105e;

    /* renamed from: f, reason: collision with root package name */
    public final int f28106f;

    public Us(String str, int i, int i4, int i9, boolean z8, int i10) {
        this.f28101a = str;
        this.f28102b = i;
        this.f28103c = i4;
        this.f28104d = i9;
        this.f28105e = z8;
        this.f28106f = i10;
    }

    @Override // com.google.android.gms.internal.ads.Qs
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        AbstractC2720Pd.q(bundle, "carrier", this.f28101a, !TextUtils.isEmpty(r0));
        int i = this.f28102b;
        AbstractC2720Pd.y(bundle, "cnt", i, i != -2);
        bundle.putInt("gnt", this.f28103c);
        bundle.putInt("pt", this.f28104d);
        Bundle b9 = AbstractC2720Pd.b("device", bundle);
        bundle.putBundle("device", b9);
        Bundle b10 = AbstractC2720Pd.b("network", b9);
        b9.putBundle("network", b10);
        b10.putInt("active_network_state", this.f28106f);
        b10.putBoolean("active_network_metered", this.f28105e);
    }
}
