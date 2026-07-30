package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class dt0 implements pn0 {
    public static final /* synthetic */ long cpQdD2nAriOS;
    public static final /* synthetic */ AtomicReferenceFieldUpdater dgRBjINgWbAK;
    public static final /* synthetic */ long x50lh2ztY7Y5;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;
    public final rd1 rtx2ld2ELZv4;
    public static final /* synthetic */ AtomicIntegerFieldUpdater OPXfSBeufaJ8 = AtomicIntegerFieldUpdater.newUpdater(dt0.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater wdg6QnbFHrFF = AtomicReferenceFieldUpdater.newUpdater(dt0.class, Object.class, "_rootCause$volatile");

    static {
        Unsafe unsafe = ty1.PxuCJdSBwIXG;
        cpQdD2nAriOS = unsafe.objectFieldOffset(dt0.class.getDeclaredField("_rootCause$volatile"));
        dgRBjINgWbAK = AtomicReferenceFieldUpdater.newUpdater(dt0.class, Object.class, "_exceptionsHolder$volatile");
        x50lh2ztY7Y5 = unsafe.objectFieldOffset(dt0.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public dt0(rd1 rd1Var, Throwable th) {
        this.rtx2ld2ELZv4 = rd1Var;
        this._rootCause$volatile = th;
    }

    public final void OPXfSBeufaJ8(Throwable th) {
        wdg6QnbFHrFF.getClass();
        ty1.PxuCJdSBwIXG.putObjectVolatile(this, cpQdD2nAriOS, th);
    }

    public final void PxuCJdSBwIXG(Throwable th) {
        Throwable e9gEMXR7LXtO = e9gEMXR7LXtO();
        if (e9gEMXR7LXtO == null) {
            OPXfSBeufaJ8(th);
            return;
        }
        if (th == e9gEMXR7LXtO) {
            return;
        }
        Object TSizfFm2Yiuu = TSizfFm2Yiuu();
        if (TSizfFm2Yiuu == null) {
            rtx2ld2ELZv4(th);
            return;
        }
        if (!(TSizfFm2Yiuu instanceof Throwable)) {
            if (TSizfFm2Yiuu instanceof ArrayList) {
                ((ArrayList) TSizfFm2Yiuu).add(th);
                return;
            } else {
                u9.BRwzKIf41E4i(TSizfFm2Yiuu, "State is ");
                return;
            }
        }
        if (th == TSizfFm2Yiuu) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(TSizfFm2Yiuu);
        arrayList.add(th);
        rtx2ld2ELZv4(arrayList);
    }

    public final ArrayList RAsUl2FVSrh6(Throwable th) {
        ArrayList arrayList;
        Object TSizfFm2Yiuu = TSizfFm2Yiuu();
        if (TSizfFm2Yiuu == null) {
            arrayList = new ArrayList(4);
        } else if (TSizfFm2Yiuu instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(TSizfFm2Yiuu);
            arrayList = arrayList2;
        } else {
            if (!(TSizfFm2Yiuu instanceof ArrayList)) {
                u9.BRwzKIf41E4i(TSizfFm2Yiuu, "State is ");
                return null;
            }
            arrayList = (ArrayList) TSizfFm2Yiuu;
        }
        Throwable e9gEMXR7LXtO = e9gEMXR7LXtO();
        if (e9gEMXR7LXtO != null) {
            arrayList.add(0, e9gEMXR7LXtO);
        }
        if (th != null && !th.equals(e9gEMXR7LXtO)) {
            arrayList.add(th);
        }
        rtx2ld2ELZv4(f2.gPXPFXrUH4XX);
        return arrayList;
    }

    public final Object TSizfFm2Yiuu() {
        dgRBjINgWbAK.getClass();
        return ty1.PxuCJdSBwIXG.getObjectVolatile(this, x50lh2ztY7Y5);
    }

    @Override // defpackage.pn0
    public final rd1 Y1f8riQaR6yg() {
        return this.rtx2ld2ELZv4;
    }

    public final boolean a92UlCVFR9N8() {
        return e9gEMXR7LXtO() != null;
    }

    public final Throwable e9gEMXR7LXtO() {
        wdg6QnbFHrFF.getClass();
        return (Throwable) ty1.PxuCJdSBwIXG.getObjectVolatile(this, cpQdD2nAriOS);
    }

    @Override // defpackage.pn0
    public final boolean lS5Rgt96tfkO() {
        return e9gEMXR7LXtO() == null;
    }

    public final void rtx2ld2ELZv4(Object obj) {
        dgRBjINgWbAK.getClass();
        ty1.PxuCJdSBwIXG.putObjectVolatile(this, x50lh2ztY7Y5, obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(a92UlCVFR9N8());
        sb.append(", completing=");
        sb.append(OPXfSBeufaJ8.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(e9gEMXR7LXtO());
        sb.append(", exceptions=");
        sb.append(TSizfFm2Yiuu());
        sb.append(", list=");
        sb.append(this.rtx2ld2ELZv4);
        sb.append(']');
        return sb.toString();
    }
}
