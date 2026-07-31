package S;

import java.util.Iterator;
import l.C0568m;
import l.M;
import q1.C0784h;
import r1.C0854f;
import r1.C0856h;

/* renamed from: S.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0156c extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f3191e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Y1.c f3192f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0156c(int i3, Y1.c cVar) {
        super(1);
        this.f3191e = i3;
        this.f3192f = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[LOOP:0: B:4:0x0020->B:23:?, LOOP_END, SYNTHETIC] */
    @Override // Y1.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj) {
        int i3;
        M m3;
        switch (this.f3191e) {
            case 0:
                n nVar = (n) obj;
                synchronized (q.f3235b) {
                    i3 = q.f3237d;
                    q.f3237d = i3 + 1;
                }
                return new h(i3, nVar, this.f3192f);
            default:
                C0568m c0568m = (C0568m) obj;
                q1.w wVar = ((C0784h) c0568m.c()).f6895e;
                Z1.i.d(wVar, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
                int i4 = q1.w.f6961l;
                Iterator it = g2.i.Q((C0856h) wVar).iterator();
                while (true) {
                    if (it.hasNext()) {
                        q1.w wVar2 = (q1.w) it.next();
                        if (wVar2 instanceof C0856h) {
                            Y1.c cVar = ((C0856h) wVar2).f7222r;
                            if (cVar != null) {
                                m3 = (M) cVar.j(c0568m);
                                if (m3 == null) {
                                }
                            }
                        } else if (wVar2 instanceof C0854f) {
                            ((C0854f) wVar2).getClass();
                        }
                        m3 = null;
                        if (m3 == null) {
                        }
                    } else {
                        m3 = null;
                    }
                }
                if (m3 != null) {
                    return m3;
                }
                Y1.c cVar2 = this.f3192f;
                if (cVar2 != null) {
                    return (M) cVar2.j(c0568m);
                }
                return null;
        }
    }
}
