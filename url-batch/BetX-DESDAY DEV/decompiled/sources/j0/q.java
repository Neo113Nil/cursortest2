package j0;

import android.widget.FrameLayout;
import com.luckyarcade.spinthrow.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final C0178a f2958a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f2959b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f2960c;

    static {
        C0178a c0178a = new C0178a();
        c0178a.f2895A = new ArrayList();
        c0178a.f2898D = false;
        c0178a.f2899E = 0;
        c0178a.f2896B = false;
        c0178a.I(new h(2));
        c0178a.I(new C0183f());
        c0178a.I(new h(1));
        f2958a = c0178a;
        f2959b = new ThreadLocal();
        f2960c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, m mVar) {
        ArrayList arrayList = f2960c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (mVar == null) {
            mVar = f2958a;
        }
        m clone = mVar.clone();
        ArrayList arrayList2 = (ArrayList) b().getOrDefault(frameLayout, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((m) it.next()).w(frameLayout);
            }
        }
        clone.h(frameLayout, true);
        if (frameLayout.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        p pVar = new p();
        pVar.f2956a = clone;
        pVar.f2957b = frameLayout;
        frameLayout.addOnAttachStateChangeListener(pVar);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(pVar);
    }

    public static o.b b() {
        o.b bVar;
        ThreadLocal threadLocal = f2959b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (o.b) weakReference.get()) != null) {
            return bVar;
        }
        o.b bVar2 = new o.b();
        threadLocal.set(new WeakReference(bVar2));
        return bVar2;
    }
}
