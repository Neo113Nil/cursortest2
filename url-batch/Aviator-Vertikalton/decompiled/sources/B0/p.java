package B0;

import K.L;
import K.X;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import e0.C0126n;
import java.util.Comparator;
import java.util.WeakHashMap;
import q.C0318f;

/* loaded from: classes.dex */
public final class p implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f150a;

    public /* synthetic */ p(int i) {
        this.f150a = i;
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
        switch (this.f150a) {
            case 0:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 1:
                C0126n c0126n = (C0126n) obj;
                C0126n c0126n2 = (C0126n) obj2;
                RecyclerView recyclerView = c0126n.f2310d;
                if ((recyclerView == null) == (c0126n2.f2310d == null)) {
                    boolean z2 = c0126n.f2307a;
                    if (z2 == c0126n2.f2307a) {
                        i = c0126n2.f2308b - c0126n.f2308b;
                        if (i == 0) {
                            int i2 = c0126n.f2309c - c0126n2.f2309c;
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
                return ((C0318f) obj).f3921b - ((C0318f) obj2).f3921b;
            default:
                WeakHashMap weakHashMap = X.f418a;
                float m2 = L.m((View) obj);
                float m3 = L.m((View) obj2);
                if (m2 > m3) {
                    return -1;
                }
                return m2 < m3 ? 1 : 0;
        }
    }
}
