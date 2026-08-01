package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class yb implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ yb(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                int min = Math.min(str.length(), str2.length());
                int i = 4;
                while (true) {
                    if (i >= min) {
                        int length = str.length();
                        int length2 = str2.length();
                        if (length == length2) {
                            return 0;
                        }
                        if (length >= length2) {
                            return 1;
                        }
                    } else {
                        char charAt = str.charAt(i);
                        char charAt2 = str2.charAt(i);
                        if (charAt == charAt2) {
                            i++;
                        } else if (mv.i(charAt, charAt2) >= 0) {
                            return 1;
                        }
                    }
                }
                return -1;
            case 1:
                WeakHashMap weakHashMap = hm0.a;
                float z = ((View) obj).getZ();
                float z2 = ((View) obj2).getZ();
                if (z > z2) {
                    return -1;
                }
                return z < z2 ? 1 : 0;
            case 2:
                return ((wj) obj).a - ((wj) obj2).a;
            case 3:
                gs gsVar = (gs) obj;
                gs gsVar2 = (gs) obj2;
                RecyclerView recyclerView = gsVar.d;
                if ((recyclerView == null) == (gsVar2.d == null)) {
                    boolean z3 = gsVar.a;
                    if (z3 == gsVar2.a) {
                        int i2 = gsVar2.b - gsVar.b;
                        if (i2 != 0) {
                            return i2;
                        }
                        int i3 = gsVar.c - gsVar2.c;
                        if (i3 != 0) {
                            return i3;
                        }
                        return 0;
                    }
                    if (!z3) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case 4:
                return ((je0) obj).g - ((je0) obj2).g;
            case 5:
                return mv.j((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 6:
                return mv.j((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 7:
                return mv.j(((ch0) obj).a, ((ch0) obj2).a);
            case 8:
                return mv.j(((eh0) obj).a, ((eh0) obj2).a);
            default:
                return ((View) obj).getTop() - ((View) obj2).getTop();
        }
    }
}
