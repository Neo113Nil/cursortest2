package j1;

import android.view.ViewGroup;
import com.oriondriftchasers.arordrft.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1961a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f1962b = new ThreadLocal();

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f1963c = new ArrayList();

    public static void a(ViewGroup viewGroup, o oVar) {
        ArrayList arrayList = f1963c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (oVar == null) {
            oVar = f1961a;
        }
        o clone = oVar.clone();
        ArrayList arrayList2 = (ArrayList) b().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((o) obj).x(viewGroup);
            }
        }
        clone.h(viewGroup, true);
        if (viewGroup.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        viewGroup.setTag(R.id.transition_current_scene, null);
        r rVar = new r();
        rVar.f1959f = clone;
        rVar.f1960g = viewGroup;
        viewGroup.addOnAttachStateChangeListener(rVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(rVar);
    }

    public static q.f b() {
        q.f fVar;
        ThreadLocal threadLocal = f1962b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (fVar = (q.f) weakReference.get()) != null) {
            return fVar;
        }
        q.f fVar2 = new q.f(0);
        threadLocal.set(new WeakReference(fVar2));
        return fVar2;
    }
}
