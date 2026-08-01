package f1;

import android.widget.FrameLayout;
import com.gglhk.bofio.fortunetiger.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1719a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f1720b;
    public static final ArrayList c;

    static {
        a aVar = new a();
        aVar.F = new ArrayList();
        aVar.I = false;
        aVar.J = 0;
        aVar.G = false;
        aVar.I(new h(2));
        aVar.I(new f());
        aVar.I(new h(1));
        f1719a = aVar;
        f1720b = new ThreadLocal();
        c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, o oVar) {
        ArrayList arrayList = c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (oVar == null) {
            oVar = f1719a;
        }
        o clone = oVar.clone();
        ArrayList arrayList2 = (ArrayList) b().get(frameLayout);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                ((o) obj).w(frameLayout);
            }
        }
        clone.h(frameLayout, true);
        if (frameLayout.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        r rVar = new r();
        rVar.f1718f = clone;
        rVar.g = frameLayout;
        frameLayout.addOnAttachStateChangeListener(rVar);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(rVar);
    }

    public static n.f b() {
        n.f fVar;
        ThreadLocal threadLocal = f1720b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (fVar = (n.f) weakReference.get()) != null) {
            return fVar;
        }
        n.f fVar2 = new n.f(0);
        threadLocal.set(new WeakReference(fVar2));
        return fVar2;
    }
}
