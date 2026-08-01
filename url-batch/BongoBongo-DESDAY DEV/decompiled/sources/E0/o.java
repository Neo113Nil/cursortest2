package E0;

import L.H;
import L.T;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import h0.C0133o;
import java.util.Comparator;
import java.util.WeakHashMap;
import r.C0291f;

/* loaded from: classes.dex */
public final class o implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225a;

    public /* synthetic */ o(int i) {
        this.f225a = i;
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
        switch (this.f225a) {
            case 0:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 1:
                C0133o c0133o = (C0133o) obj;
                C0133o c0133o2 = (C0133o) obj2;
                RecyclerView recyclerView = c0133o.d;
                if ((recyclerView == null) == (c0133o2.d == null)) {
                    boolean z2 = c0133o.f2587a;
                    if (z2 == c0133o2.f2587a) {
                        i = c0133o2.f2588b - c0133o.f2588b;
                        if (i == 0) {
                            int i2 = c0133o.f2589c - c0133o2.f2589c;
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
                return ((C0291f) obj).f3557b - ((C0291f) obj2).f3557b;
            default:
                WeakHashMap weakHashMap = T.f490a;
                float m2 = H.m((View) obj);
                float m3 = H.m((View) obj2);
                if (m2 > m3) {
                    return -1;
                }
                return m2 < m3 ? 1 : 0;
        }
    }
}
