package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.authenticator2.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class api {
    private static final ape b = new apl(null);
    private static final ThreadLocal c = new ThreadLocal();
    static final ArrayList a = new ArrayList();

    static qi a() {
        qi qiVar;
        ThreadLocal threadLocal = c;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (qiVar = (qi) weakReference.get()) != null) {
            return qiVar;
        }
        qi qiVar2 = new qi();
        threadLocal.set(new WeakReference(qiVar2));
        return qiVar2;
    }

    public static void b(ViewGroup viewGroup, ape apeVar) {
        ArrayList arrayList = a;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (apeVar == null) {
            apeVar = b;
        }
        ape clone = apeVar.clone();
        ArrayList arrayList2 = (ArrayList) a().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((ape) arrayList2.get(i)).r(viewGroup);
            }
        }
        if (clone != null) {
            clone.n(viewGroup, true);
        }
        if (((yl) viewGroup.getTag(R.id.transition_current_scene)) != null) {
            throw null;
        }
        viewGroup.setTag(R.id.transition_current_scene, null);
        if (clone == null || viewGroup == null) {
            return;
        }
        aph aphVar = new aph(clone, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aphVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aphVar);
    }
}
