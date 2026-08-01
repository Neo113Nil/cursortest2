package D0;

import K.H;
import K.T;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import g0.C0131o;
import java.util.Comparator;
import java.util.WeakHashMap;
import q.C0291f;

/* loaded from: classes.dex */
public final class o implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180a;

    public /* synthetic */ o(int i) {
        this.f180a = i;
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
        switch (this.f180a) {
            case 0:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 1:
                C0131o c0131o = (C0131o) obj;
                C0131o c0131o2 = (C0131o) obj2;
                RecyclerView recyclerView = c0131o.d;
                if ((recyclerView == null) == (c0131o2.d == null)) {
                    boolean z2 = c0131o.f2491a;
                    if (z2 == c0131o2.f2491a) {
                        i = c0131o2.f2492b - c0131o.f2492b;
                        if (i == 0) {
                            int i2 = c0131o.f2493c - c0131o2.f2493c;
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
                return ((C0291f) obj).f3376b - ((C0291f) obj2).f3376b;
            default:
                WeakHashMap weakHashMap = T.f440a;
                float m2 = H.m((View) obj);
                float m3 = H.m((View) obj2);
                if (m2 > m3) {
                    return -1;
                }
                return m2 < m3 ? 1 : 0;
        }
    }
}
