package a2;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.WeakHashMap;
import k0.b0;
import k0.j0;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class q implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65a;

    public /* synthetic */ q(int i4) {
        this.f65a = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        if (r0 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0049, code lost:
    
        if (r0 != false) goto L28;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int top;
        int top2;
        switch (this.f65a) {
            case 0:
                top = ((View) obj).getTop();
                top2 = ((View) obj2).getTop();
                break;
            case 1:
                b1.p pVar = (b1.p) obj;
                b1.p pVar2 = (b1.p) obj2;
                RecyclerView recyclerView = pVar.f894d;
                if ((recyclerView == null) == (pVar2.f894d == null)) {
                    boolean z3 = pVar.f892a;
                    if (z3 == pVar2.f892a) {
                        int i4 = pVar2.f893b - pVar.f893b;
                        if (i4 != 0) {
                            return i4;
                        }
                        int i5 = pVar.c - pVar2.c;
                        if (i5 != 0) {
                            return i5;
                        }
                        return 0;
                    }
                }
                break;
            case 2:
                top = ((q.f) obj).g;
                top2 = ((q.f) obj2).g;
                break;
            default:
                WeakHashMap weakHashMap = j0.f2752a;
                float f4 = b0.f((View) obj);
                float f5 = b0.f((View) obj2);
                if (f4 > f5) {
                    return -1;
                }
                return f4 < f5 ? 1 : 0;
        }
        return top - top2;
    }
}
