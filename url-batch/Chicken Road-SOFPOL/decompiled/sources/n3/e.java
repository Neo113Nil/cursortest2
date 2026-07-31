package n3;

import a0.a0;
import java.util.ArrayList;
import o.t0;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class e implements p3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5351a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5352b;

    public /* synthetic */ e(int i, Object obj) {
        this.f5351a = i;
        this.f5352b = obj;
    }

    @Override // p3.a
    public final void accept(Object obj) {
        switch (this.f5351a) {
            case 0:
                f fVar = (f) obj;
                if (fVar == null) {
                    fVar = new f(-3);
                }
                ((a0) this.f5352b).r(fVar);
                return;
            default:
                f fVar2 = (f) obj;
                synchronized (g.f5357c) {
                    try {
                        t0 t0Var = g.f5358d;
                        ArrayList arrayList = (ArrayList) t0Var.get((String) this.f5352b);
                        if (arrayList == null) {
                            return;
                        }
                        t0Var.remove((String) this.f5352b);
                        for (int i = 0; i < arrayList.size(); i++) {
                            ((p3.a) arrayList.get(i)).accept(fVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
