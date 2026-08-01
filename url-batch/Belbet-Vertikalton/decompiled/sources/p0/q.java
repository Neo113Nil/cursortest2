package p0;

import android.widget.FrameLayout;
import com.winpower.neonfit.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final C0325a f3865a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f3866b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f3867c;

    static {
        C0325a c0325a = new C0325a();
        c0325a.f3806A = new ArrayList();
        c0325a.f3809D = false;
        c0325a.f3810E = 0;
        c0325a.f3807B = false;
        c0325a.I(new g(2));
        c0325a.I(new C0329e());
        c0325a.I(new g(1));
        f3865a = c0325a;
        f3866b = new ThreadLocal();
        f3867c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, m mVar) {
        ArrayList arrayList = f3867c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (mVar == null) {
            mVar = f3865a;
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
        pVar.f3863a = clone;
        pVar.f3864b = frameLayout;
        frameLayout.addOnAttachStateChangeListener(pVar);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(pVar);
    }

    public static q.b b() {
        q.b bVar;
        ThreadLocal threadLocal = f3866b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (q.b) weakReference.get()) != null) {
            return bVar;
        }
        q.b bVar2 = new q.b();
        threadLocal.set(new WeakReference(bVar2));
        return bVar2;
    }
}
