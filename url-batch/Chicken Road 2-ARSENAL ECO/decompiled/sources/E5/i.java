package E5;

import X5.l;
import java.util.Iterator;
import y5.InterfaceC0766a;

/* loaded from: classes.dex */
public final class i implements Iterable, InterfaceC0766a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f701f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f702g;

    public /* synthetic */ i(int i7, Object obj) {
        this.f701f = i7;
        this.f702g = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f701f) {
            case 0:
                return new F5.b((F5.c) this.f702g);
            default:
                Object[] array = (Object[]) ((l) this.f702g).f2967g;
                kotlin.jvm.internal.i.e(array, "array");
                return new b(new R5.g(array));
        }
    }
}
