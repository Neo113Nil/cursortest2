package defpackage;

import android.view.VelocityTracker;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xy {
    public static final Map a = DesugarCollections.synchronizedMap(new WeakHashMap());

    public static xz a(VelocityTracker velocityTracker) {
        return (xz) a.get(velocityTracker);
    }
}
