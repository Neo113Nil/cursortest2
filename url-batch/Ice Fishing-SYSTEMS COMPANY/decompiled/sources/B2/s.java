package B2;

import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC3137eE;
import com.google.android.gms.internal.ads.AbstractC3212fg;
import com.google.android.gms.internal.ads.AbstractC3368ia;
import com.google.android.gms.internal.ads.C2860Xh;
import com.google.android.gms.internal.ads.C3151ea;
import com.google.android.gms.internal.ads.C3157eg;
import com.google.android.gms.internal.ads.C3381io;
import com.google.android.gms.internal.ads.C4009uN;
import com.google.android.gms.internal.ads.InterfaceC4063vN;
import com.google.android.gms.internal.ads.InterfaceC4279zN;

/* loaded from: classes.dex */
public final class s implements InterfaceC4063vN {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298a;

    /* renamed from: b, reason: collision with root package name */
    public final C2860Xh f299b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC4279zN f300c;

    public /* synthetic */ s(C2860Xh c2860Xh, InterfaceC4279zN interfaceC4279zN, int i) {
        this.f298a = i;
        this.f299b = c2860Xh;
        this.f300c = interfaceC4279zN;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4279zN
    public final Object d() {
        InterfaceC4279zN interfaceC4279zN = this.f300c;
        C2860Xh c2860Xh = this.f299b;
        switch (this.f298a) {
            case 0:
                Context a9 = c2860Xh.a();
                C3151ea c3151ea = AbstractC3368ia.f31613a;
                return new C0268b(a9, q2.r.f40116e.f40117a.B(), ((C2860Xh) interfaceC4279zN).b());
            default:
                Context a10 = c2860Xh.a();
                C3381io c3381io = (C3381io) ((C4009uN) interfaceC4279zN).d();
                C3157eg c3157eg = AbstractC3212fg.f30738a;
                AbstractC3137eE.h(c3157eg);
                return new E(a10, c3381io, c3157eg);
        }
    }
}
