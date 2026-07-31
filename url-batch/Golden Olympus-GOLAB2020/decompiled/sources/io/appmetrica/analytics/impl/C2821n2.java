package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashSet;

/* renamed from: io.appmetrica.analytics.impl.n2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2821n2 extends AbstractC2601eh {

    /* renamed from: b, reason: collision with root package name */
    public final C3024uo f39475b;

    /* renamed from: c, reason: collision with root package name */
    public final C2684hk f39476c;

    public C2821n2(@NonNull C2953s5 c2953s5) {
        this(c2953s5, c2953s5.t(), C2684hk.c());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC2601eh
    public final boolean a(@NonNull C2773l6 c2773l6) {
        C2953s5 c2953s5 = this.f38930a;
        if (!this.f39475b.c() && !this.f39475b.d()) {
            if (((C3095xh) c2953s5.f39775k.a()).f40178e) {
                this.f39476c.b();
            }
            C2620f9 c2620f9 = this.f38930a.f39776l;
            if (c2620f9.f38963c == null) {
                c2620f9.a();
            }
            C2673h9 c2673h9 = c2620f9.f38963c;
            c2673h9.getClass();
            c2673h9.f39132b = new HashSet();
            c2673h9.f39134d = 0;
            C2673h9 c2673h92 = c2620f9.f38963c;
            c2673h92.f39131a = true;
            C2750k9 c2750k9 = c2620f9.f38962b;
            IBinaryDataHelper iBinaryDataHelper = c2750k9.f39332c;
            C2724j9 c2724j9 = c2750k9.f39331b;
            c2750k9.f39330a.getClass();
            P9 a4 = C2699i9.a(c2673h92);
            c2724j9.getClass();
            iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray(a4));
        }
        return false;
    }

    public C2821n2(C2953s5 c2953s5, C3024uo c3024uo, C2684hk c2684hk) {
        super(c2953s5);
        this.f39475b = c3024uo;
        this.f39476c = c2684hk;
    }
}
