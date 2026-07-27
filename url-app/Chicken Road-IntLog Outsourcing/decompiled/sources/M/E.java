package M;

import java.io.Serializable;
import m4.AbstractC1295c;

/* loaded from: classes.dex */
public final class E extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public Object f1565a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1566b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f1567c;

    /* renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.s f1568d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1569e;

    /* renamed from: f, reason: collision with root package name */
    public int f1570f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1571g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ P f1572h;

    /* renamed from: i, reason: collision with root package name */
    public int f1573i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(P p5, AbstractC1295c abstractC1295c) {
        super(abstractC1295c);
        this.f1572h = p5;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f1571g = obj;
        this.f1573i |= Integer.MIN_VALUE;
        return P.f(this.f1572h, false, this);
    }
}
