package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class ja implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ ja(int i) {
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
                        } else if (zo.k(charAt, charAt2) >= 0) {
                            return 1;
                        }
                    }
                }
                return -1;
            case 1:
                WeakHashMap weakHashMap = x80.a;
                float z = ((View) obj).getZ();
                float z2 = ((View) obj2).getZ();
                if (z > z2) {
                    return -1;
                }
                return z < z2 ? 1 : 0;
            case 2:
                i = ((rf) obj).a;
                i2 = ((rf) obj2).a;
                break;
            case 3:
                jm jmVar = (jm) obj;
                jm jmVar2 = (jm) obj2;
                RecyclerView recyclerView = jmVar.d;
                if ((recyclerView == null) == (jmVar2.d == null)) {
                    boolean z3 = jmVar.a;
                    if (z3 == jmVar2.a) {
                        int i4 = jmVar2.b - jmVar.b;
                        if (i4 != 0) {
                            return i4;
                        }
                        int i5 = jmVar.c - jmVar2.c;
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
                Boolean valueOf = Boolean.valueOf(((fv) obj2).e);
                Boolean valueOf2 = Boolean.valueOf(((fv) obj).e);
                if (valueOf == valueOf2) {
                    return 0;
                }
                return valueOf.compareTo(valueOf2);
            case 5:
                i = ((e30) obj).g;
                i2 = ((e30) obj2).g;
                break;
            default:
                i = ((View) obj).getTop();
                i2 = ((View) obj2).getTop();
                break;
        }
        return i - i2;
    }
}
