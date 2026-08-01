package D0;

import K.H;
import K.T;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import g0.C0130p;
import java.util.Comparator;
import java.util.Locale;
import java.util.WeakHashMap;
import q.C0288f;

/* loaded from: classes.dex */
public final class o implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f218a;

    public /* synthetic */ o(int i) {
        this.f218a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r3 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        if (r3 != false) goto L25;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i = 1;
        switch (this.f218a) {
            case 0:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 1:
                String str = (String) obj;
                d1.d.b(str);
                Locale locale = Locale.ROOT;
                String lowerCase = str.toLowerCase(locale);
                d1.d.d(lowerCase, "toLowerCase(...)");
                String str2 = (String) obj2;
                d1.d.b(str2);
                String lowerCase2 = str2.toLowerCase(locale);
                d1.d.d(lowerCase2, "toLowerCase(...)");
                if (lowerCase == lowerCase2) {
                    return 0;
                }
                return lowerCase.compareTo(lowerCase2);
            case 2:
                C0130p c0130p = (C0130p) obj;
                C0130p c0130p2 = (C0130p) obj2;
                RecyclerView recyclerView = c0130p.d;
                if ((recyclerView == null) == (c0130p2.d == null)) {
                    boolean z2 = c0130p.f2461a;
                    if (z2 == c0130p2.f2461a) {
                        i = c0130p2.f2462b - c0130p.f2462b;
                        if (i == 0) {
                            int i2 = c0130p.f2463c - c0130p2.f2463c;
                            if (i2 != 0) {
                                return i2;
                            }
                            return 0;
                        }
                    }
                    return i;
                }
                break;
            case 3:
                return ((C0288f) obj).f3490b - ((C0288f) obj2).f3490b;
            default:
                WeakHashMap weakHashMap = T.f423a;
                float m2 = H.m((View) obj);
                float m3 = H.m((View) obj2);
                if (m2 > m3) {
                    return -1;
                }
                return m2 < m3 ? 1 : 0;
        }
    }
}
