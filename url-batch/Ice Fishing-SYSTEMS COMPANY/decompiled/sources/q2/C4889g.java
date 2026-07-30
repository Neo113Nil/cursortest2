package q2;

import android.content.Context;
import com.google.android.gms.internal.ads.C2684Nb;
import com.google.android.gms.internal.ads.InterfaceC3423jd;
import java.util.Objects;

/* renamed from: q2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4889g extends AbstractC4905o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40042b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f40043c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f40044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3423jd f40045e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4903n f40046f;

    public C4889g(C4903n c4903n, Context context, g1 g1Var, String str, InterfaceC3423jd interfaceC3423jd) {
        this.f40042b = context;
        this.f40043c = g1Var;
        this.f40044d = str;
        this.f40045e = interfaceC3423jd;
        Objects.requireNonNull(c4903n);
        this.f40046f = c4903n;
    }

    @Override // q2.AbstractC4905o
    public final Object a() {
        C4903n.p(this.f40042b, com.anythink.expressad.foundation.g.a.f.f19281e);
        return new Q0();
    }

    @Override // q2.AbstractC4905o
    public final /* synthetic */ Object b() {
        return ((C2684Nb) this.f40046f.f40101u).s(this.f40042b, this.f40043c, this.f40044d, this.f40045e, 1);
    }

    @Override // q2.AbstractC4905o
    public final Object c(X x3) {
        return x3.p2(new V2.b(this.f40042b), this.f40043c, this.f40044d, this.f40045e, 261710000);
    }
}
