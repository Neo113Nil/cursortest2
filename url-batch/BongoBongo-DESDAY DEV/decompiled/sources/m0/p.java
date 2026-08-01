package m0;

import android.widget.FrameLayout;
import com.winfour.winrandom.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final C0258a f3302a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f3303b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f3304c;

    static {
        C0258a c0258a = new C0258a();
        c0258a.f3242A = new ArrayList();
        c0258a.f3245D = false;
        c0258a.f3246E = 0;
        c0258a.f3243B = false;
        c0258a.I(new g(2));
        c0258a.I(new C0262e());
        c0258a.I(new g(1));
        f3302a = c0258a;
        f3303b = new ThreadLocal();
        f3304c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, l lVar) {
        ArrayList arrayList = f3304c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (lVar == null) {
            lVar = f3302a;
        }
        l clone = lVar.clone();
        ArrayList arrayList2 = (ArrayList) b().getOrDefault(frameLayout, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((l) it.next()).w(frameLayout);
            }
        }
        clone.h(frameLayout, true);
        if (frameLayout.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        o oVar = new o();
        oVar.f3300a = clone;
        oVar.f3301b = frameLayout;
        frameLayout.addOnAttachStateChangeListener(oVar);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(oVar);
    }

    public static p.b b() {
        p.b bVar;
        ThreadLocal threadLocal = f3303b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (p.b) weakReference.get()) != null) {
            return bVar;
        }
        p.b bVar2 = new p.b();
        threadLocal.set(new WeakReference(bVar2));
        return bVar2;
    }
}
