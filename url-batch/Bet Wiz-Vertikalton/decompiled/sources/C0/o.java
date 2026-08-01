package C0;

import K.G;
import K.S;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f0.C0104n;
import java.util.Comparator;
import java.util.WeakHashMap;
import q.C0286f;

/* loaded from: classes.dex */
public final class o implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f162a;

    public /* synthetic */ o(int i) {
        this.f162a = i;
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
        switch (this.f162a) {
            case 0:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 1:
                C0104n c0104n = (C0104n) obj;
                C0104n c0104n2 = (C0104n) obj2;
                RecyclerView recyclerView = c0104n.d;
                if ((recyclerView == null) == (c0104n2.d == null)) {
                    boolean z2 = c0104n.f2266a;
                    if (z2 == c0104n2.f2266a) {
                        i = c0104n2.f2267b - c0104n.f2267b;
                        if (i == 0) {
                            int i2 = c0104n.f2268c - c0104n2.f2268c;
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
                return ((C0286f) obj).f3480b - ((C0286f) obj2).f3480b;
            default:
                WeakHashMap weakHashMap = S.f422a;
                float m2 = G.m((View) obj);
                float m3 = G.m((View) obj2);
                if (m2 > m3) {
                    return -1;
                }
                return m2 < m3 ? 1 : 0;
        }
    }
}
