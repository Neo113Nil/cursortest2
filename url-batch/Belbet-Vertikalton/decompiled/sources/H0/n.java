package H0;

import M.E;
import M.P;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import h0.C0163m;
import java.util.Comparator;
import java.util.WeakHashMap;
import s.C0381f;

/* loaded from: classes.dex */
public final class n implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f540a;

    public /* synthetic */ n(int i) {
        this.f540a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        if (r3 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004b, code lost:
    
        if (r3 != false) goto L24;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i = 1;
        switch (this.f540a) {
            case 0:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 1:
                C0163m c0163m = (C0163m) obj;
                C0163m c0163m2 = (C0163m) obj2;
                RecyclerView recyclerView = c0163m.f3083d;
                if ((recyclerView == null) == (c0163m2.f3083d == null)) {
                    boolean z2 = c0163m.f3080a;
                    if (z2 == c0163m2.f3080a) {
                        i = c0163m2.f3081b - c0163m.f3081b;
                        if (i == 0) {
                            int i2 = c0163m.f3082c - c0163m2.f3082c;
                            if (i2 != 0) {
                                return i2;
                            }
                            return 0;
                        }
                    }
                    return i;
                }
                break;
            case 2:
                return ((C0381f) obj).f4132b - ((C0381f) obj2).f4132b;
            default:
                WeakHashMap weakHashMap = P.f711a;
                float m2 = E.m((View) obj);
                float m3 = E.m((View) obj2);
                if (m2 > m3) {
                    return -1;
                }
                return m2 < m3 ? 1 : 0;
        }
    }
}
