package Y0;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class q implements q1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1513a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1514b;

    public /* synthetic */ q(int i, Object obj) {
        this.f1513a = i;
        this.f1514b = obj;
    }

    @Override // q1.d
    public final Iterator iterator() {
        switch (this.f1513a) {
            case 0:
                return ((List) this.f1514b).iterator();
            case 1:
                return new q1.c(this);
            default:
                return (Iterator) this.f1514b;
        }
    }
}
