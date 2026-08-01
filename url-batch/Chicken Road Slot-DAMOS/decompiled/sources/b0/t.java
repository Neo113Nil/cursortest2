package b0;

import android.view.View;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final t f900b = new t(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f901a;

    public /* synthetic */ t(int i3) {
        this.f901a = i3;
    }

    public static final a c(int i3, String str) {
        WeakHashMap weakHashMap = e1.f818v;
        return new a(i3, str);
    }

    public static final b1 d(int i3, String str) {
        WeakHashMap weakHashMap = e1.f818v;
        return new b1(new h0(0, 0, 0, 0), str);
    }

    public static e1 f(View view) {
        e1 e1Var;
        WeakHashMap weakHashMap = e1.f818v;
        synchronized (weakHashMap) {
            try {
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new e1(view);
                    weakHashMap.put(view, obj);
                }
                e1Var = (e1) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return e1Var;
    }

    @Override // b0.c
    public void b(x2.c cVar, int i3, int[] iArr, x2.l lVar, int[] iArr2) {
        if (lVar == x2.l.f10330d) {
            g.b(iArr, iArr2, false);
        } else {
            g.c(i3, iArr, iArr2, true);
        }
    }

    public d1.l e(d1.l lVar, d1.d dVar) {
        return lVar.c(new l(dVar));
    }

    public String toString() {
        switch (this.f901a) {
            case 1:
                return "Arrangement#Start";
            default:
                return super.toString();
        }
    }
}
