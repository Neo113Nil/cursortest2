package n2;

import E.C0025g;

/* renamed from: n2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0709o extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public C0025g f6367d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f6368e;

    /* renamed from: f, reason: collision with root package name */
    public int f6369f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0025g f6370g;

    /* renamed from: h, reason: collision with root package name */
    public Object f6371h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0709o(C0025g c0025g, P1.d dVar) {
        super(dVar);
        this.f6370g = c0025g;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f6368e = obj;
        this.f6369f |= Integer.MIN_VALUE;
        return this.f6370g.emit(null, this);
    }
}
