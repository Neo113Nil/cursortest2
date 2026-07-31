package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.Map;

/* loaded from: classes3.dex */
public final class Ok {

    /* renamed from: a, reason: collision with root package name */
    public final String f38088a;

    /* renamed from: b, reason: collision with root package name */
    public final Jk f38089b;

    /* renamed from: c, reason: collision with root package name */
    public final Nk f38090c;

    /* renamed from: d, reason: collision with root package name */
    public final IBinaryDataHelper f38091d;

    public Ok(Context context, C2772l5 c2772l5) {
        c2772l5.a();
        this.f38088a = "session_extras";
        this.f38089b = new Jk();
        this.f38090c = new Nk();
        this.f38091d = C3007u7.a(context).a(c2772l5);
    }

    public final Map a() {
        try {
            byte[] bArr = this.f38091d.get(this.f38088a);
            if (bArr != null) {
                if (!(bArr.length == 0)) {
                    return this.f38089b.toModel(this.f38090c.toState(bArr));
                }
            }
        } catch (Throwable unused) {
        }
        Jk jk = this.f38089b;
        this.f38090c.getClass();
        return jk.toModel(new Lk());
    }
}
