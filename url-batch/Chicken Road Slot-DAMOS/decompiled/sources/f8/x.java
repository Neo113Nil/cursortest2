package f8;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class x extends k {

    /* renamed from: x, reason: collision with root package name */
    public static final k7.e f4197x;

    /* renamed from: y, reason: collision with root package name */
    public static final Logger f4198y = Logger.getLogger(x.class.getName());

    /* renamed from: v, reason: collision with root package name */
    public volatile Set f4199v;

    /* renamed from: w, reason: collision with root package name */
    public volatile int f4200w;

    static {
        k7.e wVar;
        try {
            wVar = new v(AtomicReferenceFieldUpdater.newUpdater(x.class, Set.class, "v"), AtomicIntegerFieldUpdater.newUpdater(x.class, "w"));
            th = null;
        } catch (Throwable th) {
            th = th;
            wVar = new w();
        }
        f4197x = wVar;
        if (th != null) {
            f4198y.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }
}
