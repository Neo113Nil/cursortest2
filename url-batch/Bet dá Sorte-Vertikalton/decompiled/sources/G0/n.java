package G0;

import K.G;
import K.S;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import f0.C0100n;
import java.util.Comparator;
import java.util.WeakHashMap;
import q.C0274f;

/* loaded from: classes.dex */
public final class n implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f260a;

    public /* synthetic */ n(int i) {
        this.f260a = i;
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
        switch (this.f260a) {
            case 0:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 1:
                C0100n c0100n = (C0100n) obj;
                C0100n c0100n2 = (C0100n) obj2;
                RecyclerView recyclerView = c0100n.d;
                if ((recyclerView == null) == (c0100n2.d == null)) {
                    boolean z2 = c0100n.f2241a;
                    if (z2 == c0100n2.f2241a) {
                        i = c0100n2.f2242b - c0100n.f2242b;
                        if (i == 0) {
                            int i2 = c0100n.f2243c - c0100n2.f2243c;
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
                return ((C0274f) obj).f3467b - ((C0274f) obj2).f3467b;
            default:
                WeakHashMap weakHashMap = S.f351a;
                float m2 = G.m((View) obj);
                float m3 = G.m((View) obj2);
                if (m2 > m3) {
                    return -1;
                }
                return m2 < m3 ? 1 : 0;
        }
    }
}
