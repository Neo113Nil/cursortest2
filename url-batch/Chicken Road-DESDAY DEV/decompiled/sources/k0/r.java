package k0;

import android.widget.FrameLayout;
import com.playgen.securelock.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final C0180a f2760a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f2761b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f2762c;

    static {
        C0180a c0180a = new C0180a();
        c0180a.f2698A = new ArrayList();
        c0180a.f2701D = false;
        c0180a.f2702E = 0;
        c0180a.f2699B = false;
        c0180a.I(new C0187h(2));
        c0180a.I(new C0185f());
        c0180a.I(new C0187h(1));
        f2760a = c0180a;
        f2761b = new ThreadLocal();
        f2762c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, n nVar) {
        ArrayList arrayList = f2762c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (nVar == null) {
            nVar = f2760a;
        }
        n clone = nVar.clone();
        ArrayList arrayList2 = (ArrayList) b().getOrDefault(frameLayout, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((n) it.next()).w(frameLayout);
            }
        }
        clone.h(frameLayout, true);
        if (frameLayout.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        q qVar = new q();
        qVar.f2758a = clone;
        qVar.f2759b = frameLayout;
        frameLayout.addOnAttachStateChangeListener(qVar);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(qVar);
    }

    public static o.b b() {
        o.b bVar;
        ThreadLocal threadLocal = f2761b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (o.b) weakReference.get()) != null) {
            return bVar;
        }
        o.b bVar2 = new o.b();
        threadLocal.set(new WeakReference(bVar2));
        return bVar2;
    }
}
