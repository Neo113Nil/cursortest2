package D0;

import android.widget.FrameLayout;
import com.icefishing.icefishingliveapp.C5284R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final C0299a f665a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f666b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f667c;

    static {
        C0299a c0299a = new C0299a();
        c0299a.f596T = new ArrayList();
        c0299a.f599W = false;
        c0299a.f600X = 0;
        c0299a.f597U = false;
        c0299a.N(new C0306h(2));
        c0299a.N(new C0304f());
        c0299a.N(new C0306h(1));
        f665a = c0299a;
        f666b = new ThreadLocal();
        f667c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, o oVar) {
        ArrayList arrayList = f667c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (oVar == null) {
            oVar = f665a;
        }
        o clone = oVar.clone();
        ArrayList arrayList2 = (ArrayList) b().getOrDefault(frameLayout, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((o) it.next()).B(frameLayout);
            }
        }
        clone.m(frameLayout, true);
        if (frameLayout.getTag(C5284R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        frameLayout.setTag(C5284R.id.transition_current_scene, null);
        r rVar = new r();
        rVar.f663n = clone;
        rVar.f664u = frameLayout;
        frameLayout.addOnAttachStateChangeListener(rVar);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(rVar);
    }

    public static s.b b() {
        s.b bVar;
        ThreadLocal threadLocal = f666b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (s.b) weakReference.get()) != null) {
            return bVar;
        }
        s.b bVar2 = new s.b();
        threadLocal.set(new WeakReference(bVar2));
        return bVar2;
    }
}
