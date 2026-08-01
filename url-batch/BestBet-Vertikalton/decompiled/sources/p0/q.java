package p0;

import android.widget.FrameLayout;
import com.fortunequest.neontrack.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final C0299a f3700a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f3701b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f3702c;

    static {
        C0299a c0299a = new C0299a();
        c0299a.f3641A = new ArrayList();
        c0299a.f3644D = false;
        c0299a.f3645E = 0;
        c0299a.f3642B = false;
        c0299a.I(new h(2));
        c0299a.I(new C0304f());
        c0299a.I(new h(1));
        f3700a = c0299a;
        f3701b = new ThreadLocal();
        f3702c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, m mVar) {
        ArrayList arrayList = f3702c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (mVar == null) {
            mVar = f3700a;
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
        pVar.f3698a = clone;
        pVar.f3699b = frameLayout;
        frameLayout.addOnAttachStateChangeListener(pVar);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(pVar);
    }

    public static o.b b() {
        o.b bVar;
        ThreadLocal threadLocal = f3701b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (o.b) weakReference.get()) != null) {
            return bVar;
        }
        o.b bVar2 = new o.b();
        threadLocal.set(new WeakReference(bVar2));
        return bVar2;
    }
}
