package l3;

import c6.l;
import java.util.ArrayList;
import s.r0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class e implements n3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5846b;

    public /* synthetic */ e(int i3, Object obj) {
        this.f5845a = i3;
        this.f5846b = obj;
    }

    @Override // n3.a
    public final void accept(Object obj) {
        switch (this.f5845a) {
            case 0:
                f fVar = (f) obj;
                if (fVar == null) {
                    fVar = new f(-3);
                }
                ((l) this.f5846b).h(fVar);
                return;
            default:
                f fVar2 = (f) obj;
                synchronized (g.f5851c) {
                    try {
                        r0 r0Var = g.f5852d;
                        ArrayList arrayList = (ArrayList) r0Var.get((String) this.f5846b);
                        if (arrayList == null) {
                            return;
                        }
                        r0Var.remove((String) this.f5846b);
                        for (int i3 = 0; i3 < arrayList.size(); i3++) {
                            ((n3.a) arrayList.get(i3)).accept(fVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
