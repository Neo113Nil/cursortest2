package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class cb implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ cb(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                int min = Math.min(str.length(), str2.length());
                int i3 = 4;
                while (true) {
                    if (i3 >= min) {
                        int length = str.length();
                        int length2 = str2.length();
                        if (length == length2) {
                            return 0;
                        }
                        if (length >= length2) {
                            return 1;
                        }
                    } else {
                        char charAt = str.charAt(i3);
                        char charAt2 = str2.charAt(i3);
                        if (charAt == charAt2) {
                            i3++;
                        } else if (kr.k(charAt, charAt2) >= 0) {
                            return 1;
                        }
                    }
                }
                return -1;
            case 1:
                WeakHashMap weakHashMap = ic0.a;
                float z = ((View) obj).getZ();
                float z2 = ((View) obj2).getZ();
                if (z > z2) {
                    return -1;
                }
                return z < z2 ? 1 : 0;
            case 2:
                i = ((qh) obj).a;
                i2 = ((qh) obj2).a;
                break;
            case 3:
                so soVar = (so) obj;
                so soVar2 = (so) obj2;
                RecyclerView recyclerView = soVar.d;
                if ((recyclerView == null) == (soVar2.d == null)) {
                    boolean z3 = soVar.a;
                    if (z3 == soVar2.a) {
                        int i4 = soVar2.b - soVar.b;
                        if (i4 != 0) {
                            return i4;
                        }
                        int i5 = soVar.c - soVar2.c;
                        if (i5 != 0) {
                            return i5;
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
                i = ((g60) obj).g;
                i2 = ((g60) obj2).g;
                break;
            default:
                i = ((View) obj).getTop();
                i2 = ((View) obj2).getTop();
                break;
        }
        return i - i2;
    }
}
