package a0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import g1.p;
import g1.z;
import java.time.ZoneId;
import java.util.Comparator;
import java.util.Locale;
import java.util.WeakHashMap;
import n0.p0;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class j implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96a;

    public /* synthetic */ j(int i) {
        this.f96a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i4;
        long c5;
        long c6;
        switch (this.f96a) {
            case 0:
                WeakHashMap weakHashMap = p0.f2816a;
                float z4 = ((View) obj).getZ();
                float z5 = ((View) obj2).getZ();
                if (z4 > z5) {
                    return -1;
                }
                return z4 < z5 ? 1 : 0;
            case 1:
                i = ((p) obj).f1749a;
                i4 = ((p) obj2).f1749a;
                break;
            case 2:
                z zVar = (z) obj;
                z zVar2 = (z) obj2;
                RecyclerView recyclerView = zVar.d;
                if ((recyclerView == null) == (zVar2.d == null)) {
                    boolean z6 = zVar.f1862a;
                    if (z6 == zVar2.f1862a) {
                        int i5 = zVar2.f1863b - zVar.f1863b;
                        if (i5 != 0) {
                            return i5;
                        }
                        int i6 = zVar.f1864c - zVar2.f1864c;
                        if (i6 != 0) {
                            return i6;
                        }
                        return 0;
                    }
                    if (!z6) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            case 3:
                i = ((View) obj).getTop();
                i4 = ((View) obj2).getTop();
                break;
            case 4:
                String str = ((o1.h) obj).f2899b;
                Locale locale = Locale.getDefault();
                i3.d.d(locale, "getDefault(...)");
                String lowerCase = str.toLowerCase(locale);
                i3.d.d(lowerCase, "toLowerCase(...)");
                String str2 = ((o1.h) obj2).f2899b;
                Locale locale2 = Locale.getDefault();
                i3.d.d(locale2, "getDefault(...)");
                String lowerCase2 = str2.toLowerCase(locale2);
                i3.d.d(lowerCase2, "toLowerCase(...)");
                if (lowerCase == lowerCase2) {
                    return 0;
                }
                return lowerCase.compareTo(lowerCase2);
            case 5:
                ZoneId zoneId = o1.d.f2892a;
                c5 = o1.d.c(((o1.h) obj).f2900c, o1.d.e());
                Long valueOf = Long.valueOf(c5);
                c6 = o1.d.c(((o1.h) obj2).f2900c, o1.d.e());
                Long valueOf2 = Long.valueOf(c6);
                if (valueOf == valueOf2) {
                    return 0;
                }
                return valueOf.compareTo(valueOf2);
            default:
                i = ((t.f) obj).f3376g;
                i4 = ((t.f) obj2).f3376g;
                break;
        }
        return i - i4;
    }
}
