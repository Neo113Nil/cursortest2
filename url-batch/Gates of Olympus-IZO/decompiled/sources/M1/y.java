package M1;

import a2.InterfaceC0184a;
import h2.C0440b;
import h2.C0441c;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class y implements Iterable, InterfaceC0184a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2808d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2809e;

    public /* synthetic */ y(int i3, Object obj) {
        this.f2808d = i3;
        this.f2809e = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f2808d) {
            case 0:
                return new z(Z1.i.h((Object[]) ((A2.l) this.f2809e).f113f));
            default:
                return new C0440b((C0441c) this.f2809e);
        }
    }
}
