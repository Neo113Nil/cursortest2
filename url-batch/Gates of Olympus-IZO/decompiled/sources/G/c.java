package G;

import E.C0025g;

/* loaded from: classes.dex */
public final class c extends R1.c {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f1509d;

    /* renamed from: e, reason: collision with root package name */
    public int f1510e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0025g f1511f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C0025g c0025g, P1.d dVar) {
        super(dVar);
        this.f1511f = c0025g;
    }

    @Override // R1.a
    public final Object invokeSuspend(Object obj) {
        this.f1509d = obj;
        this.f1510e |= Integer.MIN_VALUE;
        return this.f1511f.emit(null, this);
    }
}
