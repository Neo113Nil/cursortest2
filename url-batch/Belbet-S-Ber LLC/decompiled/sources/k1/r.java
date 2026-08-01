package k1;

import android.widget.FrameLayout;
import com.gdmhkmf.belbet.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2370a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f2371b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f2372c;

    static {
        a aVar = new a();
        aVar.F = new ArrayList();
        aVar.I = false;
        aVar.J = 0;
        aVar.G = false;
        aVar.I(new h(2));
        aVar.I(new f());
        aVar.I(new h(1));
        f2370a = aVar;
        f2371b = new ThreadLocal();
        f2372c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, n nVar) {
        ArrayList arrayList = f2372c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (nVar == null) {
            nVar = f2370a;
        }
        n clone = nVar.clone();
        ArrayList arrayList2 = (ArrayList) b().get(frameLayout);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((n) obj).w(frameLayout);
            }
        }
        clone.h(frameLayout, true);
        if (frameLayout.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        q qVar = new q();
        qVar.f2368f = clone;
        qVar.f2369g = frameLayout;
        frameLayout.addOnAttachStateChangeListener(qVar);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(qVar);
    }

    public static q.f b() {
        q.f fVar;
        ThreadLocal threadLocal = f2371b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (fVar = (q.f) weakReference.get()) != null) {
            return fVar;
        }
        q.f fVar2 = new q.f(0);
        threadLocal.set(new WeakReference(fVar2));
        return fVar2;
    }
}
