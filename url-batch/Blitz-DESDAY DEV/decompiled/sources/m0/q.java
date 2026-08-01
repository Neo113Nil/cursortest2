package m0;

import android.widget.FrameLayout;
import com.winfour.neondrop.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    public static final C0234a f3195a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f3196b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f3197c;

    static {
        C0234a c0234a = new C0234a();
        c0234a.f3135A = new ArrayList();
        c0234a.f3138D = false;
        c0234a.f3139E = 0;
        c0234a.f3136B = false;
        c0234a.I(new h(2));
        c0234a.I(new C0239f());
        c0234a.I(new h(1));
        f3195a = c0234a;
        f3196b = new ThreadLocal();
        f3197c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, m mVar) {
        ArrayList arrayList = f3197c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (mVar == null) {
            mVar = f3195a;
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
        pVar.f3193a = clone;
        pVar.f3194b = frameLayout;
        frameLayout.addOnAttachStateChangeListener(pVar);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(pVar);
    }

    public static q.b b() {
        q.b bVar;
        ThreadLocal threadLocal = f3196b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (q.b) weakReference.get()) != null) {
            return bVar;
        }
        q.b bVar2 = new q.b();
        threadLocal.set(new WeakReference(bVar2));
        return bVar2;
    }
}
