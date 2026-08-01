package X0;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class r implements p1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1382a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1383b;

    public /* synthetic */ r(int i, Object obj) {
        this.f1382a = i;
        this.f1383b = obj;
    }

    @Override // p1.d
    public final Iterator iterator() {
        switch (this.f1382a) {
            case 0:
                return ((List) this.f1383b).iterator();
            case 1:
                return new p1.c(this);
            default:
                return (Iterator) this.f1383b;
        }
    }
}
