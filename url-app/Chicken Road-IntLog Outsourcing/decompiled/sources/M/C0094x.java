package M;

import D4.C0013m;
import m4.AbstractC1295c;

/* renamed from: M.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0094x extends AbstractC1295c {

    /* renamed from: a, reason: collision with root package name */
    public Object f1763a;

    /* renamed from: b, reason: collision with root package name */
    public P f1764b;

    /* renamed from: c, reason: collision with root package name */
    public C0013m f1765c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f1766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ P f1767e;

    /* renamed from: f, reason: collision with root package name */
    public int f1768f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0094x(P p5, AbstractC1295c abstractC1295c) {
        super(abstractC1295c);
        this.f1767e = p5;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.f1766d = obj;
        this.f1768f |= Integer.MIN_VALUE;
        return P.b(this.f1767e, null, this);
    }
}
