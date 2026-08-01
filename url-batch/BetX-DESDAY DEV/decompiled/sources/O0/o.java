package O0;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class o implements d1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f692a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f693b;

    public /* synthetic */ o(int i, Object obj) {
        this.f692a = i;
        this.f693b = obj;
    }

    @Override // d1.d
    public final Iterator iterator() {
        switch (this.f692a) {
            case 0:
                return ((List) this.f693b).iterator();
            default:
                return new d1.c(this);
        }
    }
}
