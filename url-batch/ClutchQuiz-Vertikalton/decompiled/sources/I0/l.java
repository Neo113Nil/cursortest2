package I0;

import K.G;
import K.S;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f0.C0108n;
import java.util.Comparator;
import java.util.WeakHashMap;
import q.C0318f;

/* loaded from: classes.dex */
public final class l implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f346a;

    public /* synthetic */ l(int i) {
        this.f346a = i;
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
        switch (this.f346a) {
            case 0:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 1:
                C0108n c0108n = (C0108n) obj;
                C0108n c0108n2 = (C0108n) obj2;
                RecyclerView recyclerView = c0108n.d;
                if ((recyclerView == null) == (c0108n2.d == null)) {
                    boolean z2 = c0108n.f2315a;
                    if (z2 == c0108n2.f2315a) {
                        i = c0108n2.f2316b - c0108n.f2316b;
                        if (i == 0) {
                            int i2 = c0108n.f2317c - c0108n2.f2317c;
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
                return ((C0318f) obj).f3427b - ((C0318f) obj2).f3427b;
            default:
                WeakHashMap weakHashMap = S.f365a;
                float m2 = G.m((View) obj);
                float m3 = G.m((View) obj2);
                if (m2 > m3) {
                    return -1;
                }
                return m2 < m3 ? 1 : 0;
        }
    }
}
