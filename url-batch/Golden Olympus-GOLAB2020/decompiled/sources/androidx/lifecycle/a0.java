package androidx.lifecycle;

import androidx.fragment.app.AbstractActivityC1333h;
import androidx.lifecycle.Y;

/* loaded from: classes.dex */
public abstract class a0 {
    public static Y a(AbstractActivityC1333h abstractActivityC1333h) {
        return new Y(abstractActivityC1333h);
    }

    public static Y b(AbstractActivityC1333h abstractActivityC1333h, Y.b bVar) {
        if (bVar == null) {
            bVar = abstractActivityC1333h.getDefaultViewModelProviderFactory();
        }
        return new Y(abstractActivityC1333h.getViewModelStore(), bVar);
    }
}
