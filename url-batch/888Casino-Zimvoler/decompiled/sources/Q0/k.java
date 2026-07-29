package Q0;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class k implements d1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f662a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f663b;

    public /* synthetic */ k(int i, Object obj) {
        this.f662a = i;
        this.f663b = obj;
    }

    @Override // d1.d
    public final Iterator iterator() {
        switch (this.f662a) {
            case 0:
                return ((List) this.f663b).iterator();
            default:
                return new d1.c(this);
        }
    }
}
