package C0;

import K.G;
import K.S;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f0.C0105n;
import java.util.Comparator;
import java.util.WeakHashMap;
import q.C0289f;

/* loaded from: classes.dex */
public final class o implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161a;

    public /* synthetic */ o(int i) {
        this.f161a = i;
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
        switch (this.f161a) {
            case 0:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 1:
                C0105n c0105n = (C0105n) obj;
                C0105n c0105n2 = (C0105n) obj2;
                RecyclerView recyclerView = c0105n.d;
                if ((recyclerView == null) == (c0105n2.d == null)) {
                    boolean z2 = c0105n.f2199a;
                    if (z2 == c0105n2.f2199a) {
                        i = c0105n2.f2200b - c0105n.f2200b;
                        if (i == 0) {
                            int i2 = c0105n.f2201c - c0105n2.f2201c;
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
                return ((C0289f) obj).f3434b - ((C0289f) obj2).f3434b;
            default:
                WeakHashMap weakHashMap = S.f369a;
                float m2 = G.m((View) obj);
                float m3 = G.m((View) obj2);
                if (m2 > m3) {
                    return -1;
                }
                return m2 < m3 ? 1 : 0;
        }
    }
}
