package R0;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class o implements f1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f709a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f710b;

    public /* synthetic */ o(int i, Object obj) {
        this.f709a = i;
        this.f710b = obj;
    }

    @Override // f1.d
    public final Iterator iterator() {
        switch (this.f709a) {
            case 0:
                return ((List) this.f710b).iterator();
            default:
                return new f1.c(this);
        }
    }
}
