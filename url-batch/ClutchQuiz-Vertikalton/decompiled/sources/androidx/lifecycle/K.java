package androidx.lifecycle;

import i0.InterfaceC0146e;

/* loaded from: classes.dex */
public final class K extends g1.g implements f1.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1483b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1484c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(int i, Object obj) {
        super(0);
        this.f1483b = i;
        this.f1484c = obj;
    }

    @Override // f1.a
    public final Object c() {
        InterfaceC0146e compileStatement;
        switch (this.f1483b) {
            case 0:
                return J.f((S) this.f1484c);
            case 1:
                compileStatement = r0.database.compileStatement(((androidx.room.y) this.f1484c).createQuery());
                return compileStatement;
            default:
                j0.h hVar = (j0.h) this.f1484c;
                String str = hVar.f2664b;
                j0.d dVar = new j0.d();
                dVar.f2652a = null;
                j0.g gVar = new j0.g(hVar.f2663a, hVar.f2664b, dVar, hVar.f2665c);
                gVar.setWriteAheadLoggingEnabled(hVar.f2666e);
                return gVar;
        }
    }
}
