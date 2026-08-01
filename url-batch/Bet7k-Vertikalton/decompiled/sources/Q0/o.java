package Q0;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class o implements d1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f667a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f668b;

    public /* synthetic */ o(int i, Object obj) {
        this.f667a = i;
        this.f668b = obj;
    }

    @Override // d1.d
    public final Iterator iterator() {
        switch (this.f667a) {
            case 0:
                return ((List) this.f668b).iterator();
            default:
                return new d1.c(this);
        }
    }
}
