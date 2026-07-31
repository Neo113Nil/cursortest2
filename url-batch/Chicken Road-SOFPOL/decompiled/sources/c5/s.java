package c5;

import android.widget.FrameLayout;
import com.snovikpovik.vuevnxsj.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1728a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f1729b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f1730c;

    static {
        a aVar = new a();
        aVar.D = new ArrayList();
        aVar.G = false;
        aVar.H = 0;
        aVar.E = false;
        aVar.I(new h(2));
        aVar.I(new f());
        aVar.I(new h(1));
        f1728a = aVar;
        f1729b = new ThreadLocal();
        f1730c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, o oVar) {
        ArrayList arrayList = f1730c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (oVar == null) {
            oVar = f1728a;
        }
        o clone = oVar.clone();
        ArrayList arrayList2 = (ArrayList) b().get(frameLayout);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((o) obj).w(frameLayout);
            }
        }
        clone.h(frameLayout, true);
        if (frameLayout.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        r rVar = new r();
        rVar.f1726d = clone;
        rVar.f1727e = frameLayout;
        frameLayout.addOnAttachStateChangeListener(rVar);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(rVar);
    }

    public static o.e b() {
        o.e eVar;
        ThreadLocal threadLocal = f1729b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (eVar = (o.e) weakReference.get()) != null) {
            return eVar;
        }
        o.e eVar2 = new o.e(0);
        threadLocal.set(new WeakReference(eVar2));
        return eVar2;
    }
}
