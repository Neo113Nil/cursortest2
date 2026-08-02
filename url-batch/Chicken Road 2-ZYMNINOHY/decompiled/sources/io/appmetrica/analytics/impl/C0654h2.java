package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.HashSet;

/* renamed from: io.appmetrica.analytics.impl.h2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0654h2 extends Rg {

    /* renamed from: b, reason: collision with root package name */
    public final C1090xo f11963b;

    /* renamed from: c, reason: collision with root package name */
    public final Xj f11964c;

    public C0654h2(X4 x4) {
        this(x4, x4.u(), Xj.c());
    }

    @Override // io.appmetrica.analytics.impl.Rg
    public final boolean a(P5 p5) {
        X4 x4 = this.f10886a;
        if (!this.f11963b.c() && !this.f11963b.d()) {
            if (((C0746kh) x4.f11232k.a()).f12223e) {
                this.f11964c.b();
            }
            M8 m8 = this.f10886a.f11233l;
            if (m8.f10636c == null) {
                m8.a();
            }
            O8 o8 = m8.f10636c;
            o8.getClass();
            o8.f10746b = new HashSet();
            o8.f10748d = 0;
            O8 o82 = m8.f10636c;
            o82.f10745a = true;
            R8 r8 = m8.f10635b;
            IBinaryDataHelper iBinaryDataHelper = r8.f10878c;
            Q8 q8 = r8.f10877b;
            r8.f10876a.getClass();
            iBinaryDataHelper.insert("event_hashes", q8.toByteArray((Q8) P8.a(o82)));
        }
        return false;
    }

    public C0654h2(X4 x4, C1090xo c1090xo, Xj xj) {
        super(x4);
        this.f11963b = c1090xo;
        this.f11964c = xj;
    }
}
