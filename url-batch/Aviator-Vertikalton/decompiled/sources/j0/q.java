package j0;

import android.widget.FrameLayout;
import com.fortuneink.neonpad.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final C0176a f2954a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f2955b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f2956c;

    static {
        C0176a c0176a = new C0176a();
        c0176a.f2891A = new ArrayList();
        c0176a.f2894D = false;
        c0176a.f2895E = 0;
        c0176a.f2892B = false;
        c0176a.I(new h(2));
        c0176a.I(new C0181f());
        c0176a.I(new h(1));
        f2954a = c0176a;
        f2955b = new ThreadLocal();
        f2956c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, m mVar) {
        ArrayList arrayList = f2956c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (mVar == null) {
            mVar = f2954a;
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
        pVar.f2952a = clone;
        pVar.f2953b = frameLayout;
        frameLayout.addOnAttachStateChangeListener(pVar);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(pVar);
    }

    public static o.b b() {
        o.b bVar;
        ThreadLocal threadLocal = f2955b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (o.b) weakReference.get()) != null) {
            return bVar;
        }
        o.b bVar2 = new o.b();
        threadLocal.set(new WeakReference(bVar2));
        return bVar2;
    }
}
