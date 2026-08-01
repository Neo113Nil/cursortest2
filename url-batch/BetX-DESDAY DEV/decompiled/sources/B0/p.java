package B0;

import K.L;
import K.X;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import e0.C0127n;
import java.util.Comparator;
import java.util.WeakHashMap;
import q.C0320f;

/* loaded from: classes.dex */
public final class p implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149a;

    public /* synthetic */ p(int i) {
        this.f149a = i;
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
        switch (this.f149a) {
            case 0:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 1:
                C0127n c0127n = (C0127n) obj;
                C0127n c0127n2 = (C0127n) obj2;
                RecyclerView recyclerView = c0127n.f2314d;
                if ((recyclerView == null) == (c0127n2.f2314d == null)) {
                    boolean z2 = c0127n.f2311a;
                    if (z2 == c0127n2.f2311a) {
                        i = c0127n2.f2312b - c0127n.f2312b;
                        if (i == 0) {
                            int i2 = c0127n.f2313c - c0127n2.f2313c;
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
                return ((C0320f) obj).f3925b - ((C0320f) obj2).f3925b;
            default:
                WeakHashMap weakHashMap = X.f419a;
                float m2 = L.m((View) obj);
                float m3 = L.m((View) obj2);
                if (m2 > m3) {
                    return -1;
                }
                return m2 < m3 ? 1 : 0;
        }
    }
}
