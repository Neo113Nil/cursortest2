package u2;

import a0.u;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class a extends q6.j implements p6.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7303e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f7304f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(p pVar, int i) {
        super(1);
        this.f7303e = i;
        this.f7304f = pVar;
    }

    @Override // p6.c
    public final Object i(Object obj) {
        switch (this.f7303e) {
            case 0:
                return new u(3, this.f7304f);
            default:
                p pVar = this.f7304f;
                if (pVar.i.f7333a) {
                    pVar.f7343h.b();
                }
                return c6.m.f1757a;
        }
    }
}
