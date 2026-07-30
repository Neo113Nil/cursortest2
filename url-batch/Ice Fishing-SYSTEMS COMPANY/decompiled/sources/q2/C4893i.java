package q2;

import android.content.Context;
import com.google.android.gms.internal.ads.BinderC3317hd;
import com.google.android.gms.internal.ads.C2684Nb;
import java.util.Objects;

/* renamed from: q2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4893i extends AbstractC4905o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40072b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f40073c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f40074d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BinderC3317hd f40075e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4903n f40076f;

    public C4893i(C4903n c4903n, Context context, g1 g1Var, String str, BinderC3317hd binderC3317hd) {
        this.f40072b = context;
        this.f40073c = g1Var;
        this.f40074d = str;
        this.f40075e = binderC3317hd;
        Objects.requireNonNull(c4903n);
        this.f40076f = c4903n;
    }

    @Override // q2.AbstractC4905o
    public final Object a() {
        C4903n.p(this.f40072b, com.anythink.expressad.foundation.g.a.f.f19280d);
        return new Q0();
    }

    @Override // q2.AbstractC4905o
    public final /* synthetic */ Object b() {
        C2684Nb c2684Nb = (C2684Nb) this.f40076f.f40101u;
        BinderC3317hd binderC3317hd = this.f40075e;
        return c2684Nb.s(this.f40072b, this.f40073c, this.f40074d, binderC3317hd, 2);
    }

    @Override // q2.AbstractC4905o
    public final Object c(X x3) {
        return x3.M2(new V2.b(this.f40072b), this.f40073c, this.f40074d, this.f40075e, 261710000);
    }
}
