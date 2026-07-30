package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yc2<T> implements o30, c50 {
    private static final a n = new a(null);
    public static final AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(yc2.class, Object.class, "result");
    public static final /* synthetic */ long p = hd2.a.objectFieldOffset(yc2.class.getDeclaredField("result"));
    public final o30 m;
    private volatile Object result;

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public yc2(o30 o30Var, b50 b50Var) {
        o30Var.getClass();
        this.m = o30Var;
        this.result = b50Var;
    }

    public final Object a() {
        Object obj = this.result;
        b50 b50Var = b50.n;
        if (obj == b50Var) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
            b50 b50Var2 = b50.m;
            while (true) {
                atomicReferenceFieldUpdater.getClass();
                Unsafe unsafe = hd2.a;
                long j = p;
                yc2<T> yc2Var = this;
                if (unsafe.compareAndSwapObject(yc2Var, j, b50Var, b50Var2)) {
                    return b50.m;
                }
                if (unsafe.getObjectVolatile(yc2Var, j) != b50Var) {
                    obj = yc2Var.result;
                    break;
                }
                this = yc2Var;
            }
        }
        if (obj == b50.o) {
            return b50.m;
        }
        if (obj instanceof ba2) {
            throw ((ba2) obj).m;
        }
        return obj;
    }

    @Override // defpackage.c50
    public final c50 getCallerFrame() {
        o30 o30Var = this.m;
        if (o30Var instanceof c50) {
            return (c50) o30Var;
        }
        return null;
    }

    @Override // defpackage.o30
    public final CoroutineContext getContext() {
        return this.m.getContext();
    }

    @Override // defpackage.o30
    public final void resumeWith(Object obj) {
        yc2<T> yc2Var;
        Object obj2;
        Unsafe unsafe;
        long j;
        while (true) {
            Object obj3 = this.result;
            b50 b50Var = b50.n;
            if (obj3 == b50Var) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe2 = hd2.a;
                    long j2 = p;
                    yc2Var = this;
                    obj2 = obj;
                    if (unsafe2.compareAndSwapObject(yc2Var, j2, b50Var, obj2)) {
                        return;
                    }
                    if (unsafe2.getObjectVolatile(yc2Var, j2) != b50Var) {
                        break;
                    }
                    this = yc2Var;
                    obj = obj2;
                }
            } else {
                yc2Var = this;
                obj2 = obj;
                b50 b50Var2 = b50.m;
                if (obj3 != b50Var2) {
                    lh.g("Already resumed");
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = o;
                b50 b50Var3 = b50.o;
                do {
                    atomicReferenceFieldUpdater2.getClass();
                    unsafe = hd2.a;
                    j = p;
                    if (unsafe.compareAndSwapObject(yc2Var, j, b50Var2, b50Var3)) {
                        yc2Var.m.resumeWith(obj2);
                        return;
                    }
                } while (unsafe.getObjectVolatile(yc2Var, j) == b50Var2);
            }
            this = yc2Var;
            obj = obj2;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.m;
    }
}
