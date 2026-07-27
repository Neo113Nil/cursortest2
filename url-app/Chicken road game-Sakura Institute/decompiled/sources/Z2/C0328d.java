package Z2;

import D.C0127e0;

/* renamed from: Z2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0328d extends E2.c {

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f4671j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C0127e0 f4672k;

    /* renamed from: l, reason: collision with root package name */
    public int f4673l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0328d(C0127e0 c0127e0, C2.a aVar) {
        super(aVar);
        this.f4672k = c0127e0;
    }

    @Override // E2.a
    public final Object l(Object obj) {
        this.f4671j = obj;
        this.f4673l |= Integer.MIN_VALUE;
        return this.f4672k.d(null, this);
    }
}
