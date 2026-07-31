package c;

import a7.u;
import android.view.Choreographer;
import c6.m;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b extends i6.i implements p6.e {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1538h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i8, g6.c cVar) {
        super(i, cVar);
        this.f1538h = i8;
    }

    @Override // p6.e
    public final Object g(Object obj, Object obj2) {
        switch (this.f1538h) {
            case 0:
                b bVar = (b) l((g6.c) obj2, (d7.f) obj);
                m mVar = m.f1757a;
                bVar.p(mVar);
                return mVar;
            case 1:
                return ((b) l((g6.c) obj2, (u) obj)).p(m.f1757a);
            default:
                b bVar2 = (b) l((g6.c) obj2, (d7.g) obj);
                m mVar2 = m.f1757a;
                bVar2.p(mVar2);
                return mVar2;
        }
    }

    @Override // i6.a
    public final g6.c l(g6.c cVar, Object obj) {
        switch (this.f1538h) {
            case 0:
                return new b(2, 0, cVar);
            case 1:
                return new b(2, 1, cVar);
            default:
                return new b(2, 2, cVar);
        }
    }

    @Override // i6.a
    public final Object p(Object obj) {
        int i = this.f1538h;
        m mVar = m.f1757a;
        switch (i) {
            case 0:
                s6.a.K(obj);
                return mVar;
            case 1:
                s6.a.K(obj);
                return Choreographer.getInstance();
            default:
                s6.a.K(obj);
                return mVar;
        }
    }
}
