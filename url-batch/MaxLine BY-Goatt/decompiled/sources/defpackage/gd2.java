package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
final class gd2<T> implements y91, Serializable {
    public static final a o = new a(null);
    public static final AtomicReferenceFieldUpdater p = AtomicReferenceFieldUpdater.newUpdater(gd2.class, Object.class, "n");
    public static final /* synthetic */ long q = hd2.a.objectFieldOffset(gd2.class.getDeclaredField("n"));
    public volatile Function0 m;
    public volatile Object n;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new f21(getValue());
    }

    @Override // defpackage.y91
    public final boolean a() {
        return this.n != r13.a;
    }

    @Override // defpackage.y91
    public final Object getValue() {
        gd2<T> gd2Var;
        Object obj = this.n;
        r13 r13Var = r13.a;
        if (obj != r13Var) {
            return obj;
        }
        Function0 function0 = this.m;
        if (function0 != null) {
            Object invoke = function0.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = hd2.a;
                long j = q;
                gd2Var = this;
                if (unsafe.compareAndSwapObject(gd2Var, j, r13Var, invoke)) {
                    gd2Var.m = null;
                    return invoke;
                }
                if (unsafe.getObjectVolatile(gd2Var, j) != r13Var) {
                    break;
                }
                this = gd2Var;
            }
        } else {
            gd2Var = this;
        }
        return gd2Var.n;
    }

    public final String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
