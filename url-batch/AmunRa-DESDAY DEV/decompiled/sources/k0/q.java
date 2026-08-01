package k0;

import android.widget.FrameLayout;
import com.visualfortune.eyerest.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final C0177a f2747a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f2748b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f2749c;

    static {
        C0177a c0177a = new C0177a();
        c0177a.f2688A = new ArrayList();
        c0177a.f2691D = false;
        c0177a.f2692E = 0;
        c0177a.f2689B = false;
        c0177a.I(new C0184h(2));
        c0177a.I(new C0182f());
        c0177a.I(new C0184h(1));
        f2747a = c0177a;
        f2748b = new ThreadLocal();
        f2749c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, m mVar) {
        ArrayList arrayList = f2749c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (mVar == null) {
            mVar = f2747a;
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
        pVar.f2745a = clone;
        pVar.f2746b = frameLayout;
        frameLayout.addOnAttachStateChangeListener(pVar);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(pVar);
    }

    public static o.b b() {
        o.b bVar;
        ThreadLocal threadLocal = f2748b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (o.b) weakReference.get()) != null) {
            return bVar;
        }
        o.b bVar2 = new o.b();
        threadLocal.set(new WeakReference(bVar2));
        return bVar2;
    }
}
