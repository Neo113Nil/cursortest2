package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class my1 implements bt, tu {
    private static final ly1 Companion = new ly1();
    public static final AtomicReferenceFieldUpdater OPXfSBeufaJ8 = AtomicReferenceFieldUpdater.newUpdater(my1.class, Object.class, "result");
    public static final /* synthetic */ long wdg6QnbFHrFF = ty1.PxuCJdSBwIXG.objectFieldOffset(my1.class.getDeclaredField("result"));
    private volatile Object result;
    public final bt rtx2ld2ELZv4;

    public my1(bt btVar) {
        su suVar = su.rtx2ld2ELZv4;
        this.rtx2ld2ELZv4 = btVar;
        this.result = suVar;
    }

    @Override // defpackage.bt
    public final void RAsUl2FVSrh6(Object obj) {
        my1 my1Var;
        Object obj2;
        Unsafe unsafe;
        long j;
        while (true) {
            Object obj3 = this.result;
            su suVar = su.OPXfSBeufaJ8;
            if (obj3 == suVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = OPXfSBeufaJ8;
                while (true) {
                    atomicReferenceFieldUpdater.getClass();
                    Unsafe unsafe2 = ty1.PxuCJdSBwIXG;
                    long j2 = wdg6QnbFHrFF;
                    my1Var = this;
                    obj2 = obj;
                    if (unsafe2.compareAndSwapObject(my1Var, j2, suVar, obj2)) {
                        return;
                    }
                    if (unsafe2.getObjectVolatile(my1Var, j2) != suVar) {
                        break;
                    }
                    this = my1Var;
                    obj = obj2;
                }
            } else {
                my1Var = this;
                obj2 = obj;
                su suVar2 = su.rtx2ld2ELZv4;
                if (obj3 != suVar2) {
                    u9.rtx2ld2ELZv4("Already resumed");
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = OPXfSBeufaJ8;
                su suVar3 = su.wdg6QnbFHrFF;
                do {
                    atomicReferenceFieldUpdater2.getClass();
                    unsafe = ty1.PxuCJdSBwIXG;
                    j = wdg6QnbFHrFF;
                    if (unsafe.compareAndSwapObject(my1Var, j, suVar2, suVar3)) {
                        my1Var.rtx2ld2ELZv4.RAsUl2FVSrh6(obj2);
                        return;
                    }
                } while (unsafe.getObjectVolatile(my1Var, j) == suVar2);
            }
            this = my1Var;
            obj = obj2;
        }
    }

    @Override // defpackage.tu
    public final tu TSizfFm2Yiuu() {
        bt btVar = this.rtx2ld2ELZv4;
        if (btVar instanceof tu) {
            return (tu) btVar;
        }
        return null;
    }

    @Override // defpackage.bt
    public final hu e9gEMXR7LXtO() {
        return this.rtx2ld2ELZv4.e9gEMXR7LXtO();
    }

    public final String toString() {
        return "SafeContinuation for " + this.rtx2ld2ELZv4;
    }
}
