package C0;

import K.G;
import K.S;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f0.C0103n;
import java.util.Comparator;
import java.util.WeakHashMap;
import q.C0286f;

/* loaded from: classes.dex */
public final class o implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f157a;

    public /* synthetic */ o(int i) {
        this.f157a = i;
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
        switch (this.f157a) {
            case 0:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 1:
                C0103n c0103n = (C0103n) obj;
                C0103n c0103n2 = (C0103n) obj2;
                RecyclerView recyclerView = c0103n.d;
                if ((recyclerView == null) == (c0103n2.d == null)) {
                    boolean z2 = c0103n.f2198a;
                    if (z2 == c0103n2.f2198a) {
                        i = c0103n2.f2199b - c0103n.f2199b;
                        if (i == 0) {
                            int i2 = c0103n.f2200c - c0103n2.f2200c;
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
                return ((C0286f) obj).f3502b - ((C0286f) obj2).f3502b;
            default:
                WeakHashMap weakHashMap = S.f362a;
                float m2 = G.m((View) obj);
                float m3 = G.m((View) obj2);
                if (m2 > m3) {
                    return -1;
                }
                return m2 < m3 ? 1 : 0;
        }
    }
}
