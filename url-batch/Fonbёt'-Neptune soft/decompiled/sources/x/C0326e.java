package x;

import P.O;
import java.util.ArrayList;
import n.C0276i;

/* renamed from: x.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326e implements z.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3575a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3576b;

    public /* synthetic */ C0326e(int i2, Object obj) {
        this.f3575a = i2;
        this.f3576b = obj;
    }

    @Override // z.a
    public final void accept(Object obj) {
        switch (this.f3575a) {
            case 0:
                C0327f c0327f = (C0327f) obj;
                if (c0327f == null) {
                    c0327f = new C0327f(-3);
                }
                ((O) this.f3576b).n(c0327f);
                return;
            default:
                C0327f c0327f2 = (C0327f) obj;
                synchronized (AbstractC0328g.f3581c) {
                    try {
                        C0276i c0276i = AbstractC0328g.f3582d;
                        ArrayList arrayList = (ArrayList) c0276i.getOrDefault((String) this.f3576b, null);
                        if (arrayList == null) {
                            return;
                        }
                        c0276i.remove((String) this.f3576b);
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((z.a) arrayList.get(i2)).accept(c0327f2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
