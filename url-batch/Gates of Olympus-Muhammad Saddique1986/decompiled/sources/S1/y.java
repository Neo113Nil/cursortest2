package S1;

import g2.InterfaceC0439a;
import java.util.Iterator;
import n2.C0722b;
import n2.C0723c;

/* loaded from: classes.dex */
public final class y implements Iterable, InterfaceC0439a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4325d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f4326e;

    public /* synthetic */ y(int i3, Object obj) {
        this.f4325d = i3;
        this.f4326e = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f4325d) {
            case 0:
                return new z(f2.j.h((Object[]) ((A.h) this.f4326e).f53f));
            default:
                return new C0722b((C0723c) this.f4326e);
        }
    }
}
