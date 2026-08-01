package k0;

import android.widget.FrameLayout;
import com.glasspulse.glasspulse.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final C0172a f2793a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f2794b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f2795c;

    static {
        C0172a c0172a = new C0172a();
        c0172a.f2734A = new ArrayList();
        c0172a.f2737D = false;
        c0172a.f2738E = 0;
        c0172a.f2735B = false;
        c0172a.I(new C0179h(2));
        c0172a.I(new C0177f());
        c0172a.I(new C0179h(1));
        f2793a = c0172a;
        f2794b = new ThreadLocal();
        f2795c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, m mVar) {
        ArrayList arrayList = f2795c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (mVar == null) {
            mVar = f2793a;
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
        pVar.f2791a = clone;
        pVar.f2792b = frameLayout;
        frameLayout.addOnAttachStateChangeListener(pVar);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(pVar);
    }

    public static o.b b() {
        o.b bVar;
        ThreadLocal threadLocal = f2794b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (o.b) weakReference.get()) != null) {
            return bVar;
        }
        o.b bVar2 = new o.b();
        threadLocal.set(new WeakReference(bVar2));
        return bVar2;
    }
}
