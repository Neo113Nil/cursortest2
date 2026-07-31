package R;

import I.H;
import S.t;
import java.util.Map;
import l.C0586l;
import t1.C1028h;
import u1.p;

/* loaded from: classes.dex */
public final class g implements H {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4018a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4019b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4020c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4021d;

    public /* synthetic */ g(Object obj, Object obj2, Object obj3, int i3) {
        this.f4018a = i3;
        this.f4020c = obj;
        this.f4021d = obj2;
        this.f4019b = obj3;
    }

    @Override // I.H
    public final void a() {
        switch (this.f4018a) {
            case 0:
                i iVar = (i) this.f4021d;
                Map map = iVar.f4027a;
                f fVar = (f) this.f4020c;
                if (fVar.f4016b) {
                    Map a3 = fVar.f4017c.a();
                    boolean isEmpty = a3.isEmpty();
                    Object obj = fVar.f4015a;
                    if (isEmpty) {
                        map.remove(obj);
                    } else {
                        map.put(obj, a3);
                    }
                }
                iVar.f4028b.remove(this.f4019b);
                break;
            case 1:
                t tVar = (t) this.f4020c;
                Object obj2 = this.f4019b;
                tVar.remove(obj2);
                ((C0586l) this.f4021d).f6504d.g(obj2);
                break;
            default:
                p pVar = (p) this.f4020c;
                C1028h c1028h = (C1028h) this.f4021d;
                pVar.b().b(c1028h);
                ((t) this.f4019b).remove(c1028h);
                break;
        }
    }

    public g(t tVar, Object obj, C0586l c0586l) {
        this.f4018a = 1;
        this.f4020c = tVar;
        this.f4019b = obj;
        this.f4021d = c0586l;
    }
}
