package k0;

import android.widget.FrameLayout;
import com.neonpulse.gridlogic.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final C0179a f2809a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f2810b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f2811c;

    static {
        C0179a c0179a = new C0179a();
        c0179a.f2747A = new ArrayList();
        c0179a.f2750D = false;
        c0179a.f2751E = 0;
        c0179a.f2748B = false;
        c0179a.I(new C0186h(2));
        c0179a.I(new C0184f());
        c0179a.I(new C0186h(1));
        f2809a = c0179a;
        f2810b = new ThreadLocal();
        f2811c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, n nVar) {
        ArrayList arrayList = f2811c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (nVar == null) {
            nVar = f2809a;
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
        qVar.f2807a = clone;
        qVar.f2808b = frameLayout;
        frameLayout.addOnAttachStateChangeListener(qVar);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(qVar);
    }

    public static o.b b() {
        o.b bVar;
        ThreadLocal threadLocal = f2810b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (o.b) weakReference.get()) != null) {
            return bVar;
        }
        o.b bVar2 = new o.b();
        threadLocal.set(new WeakReference(bVar2));
        return bVar2;
    }
}
