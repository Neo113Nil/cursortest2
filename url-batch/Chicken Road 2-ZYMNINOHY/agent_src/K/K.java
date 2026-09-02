package K;

/* loaded from: classes.dex */
public final class K extends h3.c {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.o f1262a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1263b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M f1264c;

    /* renamed from: d, reason: collision with root package name */
    public int f1265d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(M m4, h3.c cVar) {
        super(cVar);
        this.f1264c = m4;
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        this.f1263b = obj;
        this.f1265d |= Integer.MIN_VALUE;
        return this.f1264c.j(null, false, this);
    }
}
