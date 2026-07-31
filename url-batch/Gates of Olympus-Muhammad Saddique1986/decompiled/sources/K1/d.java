package K1;

import J1.e;
import O2.l;
import U2.f;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class d implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3261a;

    public /* synthetic */ d(int i3) {
        this.f3261a = i3;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f3261a) {
            case 0:
                return l.T(Double.valueOf(((e) obj2).f3184c), Double.valueOf(((e) obj).f3184c));
            default:
                return l.T(((f) obj).f4528a, ((f) obj2).f4528a);
        }
    }
}
