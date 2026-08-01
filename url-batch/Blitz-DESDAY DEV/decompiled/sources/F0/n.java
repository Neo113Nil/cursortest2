package F0;

import M.F;
import M.Q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import h0.C0127n;
import java.util.Comparator;
import java.util.WeakHashMap;
import s.C0268f;

/* loaded from: classes.dex */
public final class n implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f319a;

    public /* synthetic */ n(int i) {
        this.f319a = i;
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
        switch (this.f319a) {
            case 0:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 1:
                C0127n c0127n = (C0127n) obj;
                C0127n c0127n2 = (C0127n) obj2;
                RecyclerView recyclerView = c0127n.d;
                if ((recyclerView == null) == (c0127n2.d == null)) {
                    boolean z2 = c0127n.f2557a;
                    if (z2 == c0127n2.f2557a) {
                        i = c0127n2.f2558b - c0127n.f2558b;
                        if (i == 0) {
                            int i2 = c0127n.f2559c - c0127n2.f2559c;
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
                return ((C0268f) obj).f3596b - ((C0268f) obj2).f3596b;
            default:
                WeakHashMap weakHashMap = Q.f513a;
                float m2 = F.m((View) obj);
                float m3 = F.m((View) obj2);
                if (m2 > m3) {
                    return -1;
                }
                return m2 < m3 ? 1 : 0;
        }
    }
}
