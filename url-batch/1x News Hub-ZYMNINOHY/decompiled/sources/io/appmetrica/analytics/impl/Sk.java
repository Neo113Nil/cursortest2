package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.Map;

/* loaded from: classes.dex */
public final class Sk {

    /* renamed from: a, reason: collision with root package name */
    public final String f6649a;

    /* renamed from: b, reason: collision with root package name */
    public final Nk f6650b;

    /* renamed from: c, reason: collision with root package name */
    public final Rk f6651c;

    /* renamed from: d, reason: collision with root package name */
    public final IBinaryDataHelper f6652d;

    public Sk(Context context, X4 x4) {
        x4.a();
        this.f6649a = "session_extras";
        this.f6650b = new Nk();
        this.f6651c = new Rk();
        this.f6652d = C0511g7.a(context).a(x4);
    }

    public final Map a() {
        try {
            byte[] bArr = this.f6652d.get(this.f6649a);
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    return this.f6650b.toModel(this.f6651c.toState(bArr));
                }
            }
        } catch (Throwable unused) {
        }
        Nk nk = this.f6650b;
        this.f6651c.getClass();
        return nk.toModel(new Pk());
    }
}
