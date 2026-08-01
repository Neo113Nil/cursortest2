package L0;

import K.F;
import K.Q;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import g0.C0150n;
import java.util.Comparator;
import java.util.WeakHashMap;
import q.C0310f;

/* loaded from: classes.dex */
public final class l implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f778a;

    public /* synthetic */ l(int i) {
        this.f778a = i;
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
        switch (this.f778a) {
            case 0:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 1:
                C0150n c0150n = (C0150n) obj;
                C0150n c0150n2 = (C0150n) obj2;
                RecyclerView recyclerView = c0150n.d;
                if ((recyclerView == null) == (c0150n2.d == null)) {
                    boolean z2 = c0150n.f2902a;
                    if (z2 == c0150n2.f2902a) {
                        i = c0150n2.f2903b - c0150n.f2903b;
                        if (i == 0) {
                            int i2 = c0150n.f2904c - c0150n2.f2904c;
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
                return ((C0310f) obj).f3740b - ((C0310f) obj2).f3740b;
            default:
                WeakHashMap weakHashMap = Q.f578a;
                float m2 = F.m((View) obj);
                float m3 = F.m((View) obj2);
                if (m2 > m3) {
                    return -1;
                }
                return m2 < m3 ? 1 : 0;
        }
    }
}
