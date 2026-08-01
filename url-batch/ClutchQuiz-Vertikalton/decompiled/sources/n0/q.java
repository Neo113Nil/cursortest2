package n0;

import android.widget.FrameLayout;
import com.clutchquizarena.app.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final C0258a f3190a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f3191b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f3192c;

    static {
        C0258a c0258a = new C0258a();
        c0258a.f3131A = new ArrayList();
        c0258a.f3134D = false;
        c0258a.f3135E = 0;
        c0258a.f3132B = false;
        c0258a.I(new h(2));
        c0258a.I(new C0263f());
        c0258a.I(new h(1));
        f3190a = c0258a;
        f3191b = new ThreadLocal();
        f3192c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, m mVar) {
        ArrayList arrayList = f3192c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (mVar == null) {
            mVar = f3190a;
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
        pVar.f3188a = clone;
        pVar.f3189b = frameLayout;
        frameLayout.addOnAttachStateChangeListener(pVar);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(pVar);
    }

    public static o.b b() {
        o.b bVar;
        ThreadLocal threadLocal = f3191b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (o.b) weakReference.get()) != null) {
            return bVar;
        }
        o.b bVar2 = new o.b();
        threadLocal.set(new WeakReference(bVar2));
        return bVar2;
    }
}
