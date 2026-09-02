package K;

/* renamed from: K.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0075y extends h3.c {

    /* renamed from: a, reason: collision with root package name */
    public M f1433a;

    /* renamed from: b, reason: collision with root package name */
    public int f1434b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1435c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M f1436d;

    /* renamed from: e, reason: collision with root package name */
    public int f1437e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0075y(M m4, h3.c cVar) {
        super(cVar);
        this.f1436d = m4;
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        this.f1435c = obj;
        this.f1437e |= Integer.MIN_VALUE;
        return this.f1436d.h(this);
    }
}
