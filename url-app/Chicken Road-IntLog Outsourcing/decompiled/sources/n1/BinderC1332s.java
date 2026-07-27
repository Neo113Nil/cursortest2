package n1;

import java.lang.ref.WeakReference;

/* renamed from: n1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1332s extends G1.c {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f11414a;

    public BinderC1332s(C1334u c1334u) {
        this.f11414a = new WeakReference(c1334u);
    }

    @Override // G1.d
    public final void a(G1.g gVar) {
        C1334u c1334u = (C1334u) this.f11414a.get();
        if (c1334u == null) {
            return;
        }
        C1330q c1330q = new C1330q(c1334u, c1334u, gVar);
        HandlerC1335v handlerC1335v = c1334u.f11416a.f11281h;
        handlerC1335v.sendMessage(handlerC1335v.obtainMessage(1, c1330q));
    }
}
