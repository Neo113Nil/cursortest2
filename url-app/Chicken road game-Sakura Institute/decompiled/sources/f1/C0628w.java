package f1;

/* renamed from: f1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0628w extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f6627j;

    /* renamed from: k, reason: collision with root package name */
    public int f6628k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Z2.r f6629l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0628w(Z2.r rVar, C2.a aVar) {
        super(aVar);
        this.f6629l = rVar;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f6627j = obj;
        this.f6628k |= Integer.MIN_VALUE;
        return this.f6629l.d(null, this);
    }
}
