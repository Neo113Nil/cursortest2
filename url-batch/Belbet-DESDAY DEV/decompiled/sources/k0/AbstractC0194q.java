package k0;

import android.widget.FrameLayout;
import com.quicktoss.winflip.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: k0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0194q {

    /* renamed from: a, reason: collision with root package name */
    public static final C0178a f2830a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f2831b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f2832c;

    static {
        C0178a c0178a = new C0178a();
        c0178a.f2771A = new ArrayList();
        c0178a.f2774D = false;
        c0178a.f2775E = 0;
        c0178a.f2772B = false;
        c0178a.I(new C0185h(2));
        c0178a.I(new C0183f());
        c0178a.I(new C0185h(1));
        f2830a = c0178a;
        f2831b = new ThreadLocal();
        f2832c = new ArrayList();
    }

    public static void a(FrameLayout frameLayout, AbstractC0190m abstractC0190m) {
        ArrayList arrayList = f2832c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (abstractC0190m == null) {
            abstractC0190m = f2830a;
        }
        AbstractC0190m clone = abstractC0190m.clone();
        ArrayList arrayList2 = (ArrayList) b().getOrDefault(frameLayout, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC0190m) it.next()).w(frameLayout);
            }
        }
        clone.h(frameLayout, true);
        if (frameLayout.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        ViewTreeObserverOnPreDrawListenerC0193p viewTreeObserverOnPreDrawListenerC0193p = new ViewTreeObserverOnPreDrawListenerC0193p();
        viewTreeObserverOnPreDrawListenerC0193p.f2828a = clone;
        viewTreeObserverOnPreDrawListenerC0193p.f2829b = frameLayout;
        frameLayout.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0193p);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0193p);
    }

    public static o.b b() {
        o.b bVar;
        ThreadLocal threadLocal = f2831b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (bVar = (o.b) weakReference.get()) != null) {
            return bVar;
        }
        o.b bVar2 = new o.b();
        threadLocal.set(new WeakReference(bVar2));
        return bVar2;
    }
}
