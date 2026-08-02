package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.Map;

/* loaded from: classes.dex */
public final class Nk {

    /* renamed from: a, reason: collision with root package name */
    public final String f10720a;

    /* renamed from: b, reason: collision with root package name */
    public final Ik f10721b;

    /* renamed from: c, reason: collision with root package name */
    public final Mk f10722c;

    /* renamed from: d, reason: collision with root package name */
    public final IBinaryDataHelper f10723d;

    public Nk(Context context, Q4 q4) {
        q4.a();
        this.f10720a = "session_extras";
        this.f10721b = new Ik();
        this.f10722c = new Mk();
        this.f10723d = C0817na.k().B().a(context, q4);
    }

    public final Map a() {
        try {
            byte[] bArr = this.f10723d.get(this.f10720a);
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    return this.f10721b.toModel(this.f10722c.toState(bArr));
                }
            }
        } catch (Throwable unused) {
        }
        Ik ik = this.f10721b;
        this.f10722c.getClass();
        return ik.toModel(new Kk());
    }
}
