package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class qb extends at0 {
    public final /* synthetic */ sb BRwzKIf41E4i;
    public final bi QrzZRwfaDlRX;
    private volatile /* synthetic */ Object _disposer$volatile;
    public s00 gPXPFXrUH4XX;
    public static final /* synthetic */ AtomicReferenceFieldUpdater XL4ISE6Oc65B = AtomicReferenceFieldUpdater.newUpdater(qb.class, Object.class, "_disposer$volatile");
    public static final /* synthetic */ long RfyTYNmI9Srp = ty1.PxuCJdSBwIXG.objectFieldOffset(qb.class.getDeclaredField("_disposer$volatile"));

    public qb(sb sbVar, bi biVar) {
        this.BRwzKIf41E4i = sbVar;
        this.QrzZRwfaDlRX = biVar;
    }

    public final rb EcgxDIVH5in8() {
        XL4ISE6Oc65B.getClass();
        return (rb) ty1.PxuCJdSBwIXG.getObjectVolatile(this, RfyTYNmI9Srp);
    }

    @Override // defpackage.at0
    public final void RfyTYNmI9Srp(Throwable th) {
        bi biVar = this.QrzZRwfaDlRX;
        if (th != null) {
            f50 EpkonXwzFgDB = biVar.EpkonXwzFgDB(new sm(th, false), null);
            if (EpkonXwzFgDB != null) {
                biVar.BRwzKIf41E4i(EpkonXwzFgDB);
                rb EcgxDIVH5in8 = EcgxDIVH5in8();
                if (EcgxDIVH5in8 != null) {
                    EcgxDIVH5in8.lS5Rgt96tfkO();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = sb.lS5Rgt96tfkO;
        sb sbVar = this.BRwzKIf41E4i;
        if (atomicIntegerFieldUpdater.decrementAndGet(sbVar) == 0) {
            mx[] mxVarArr = sbVar.PxuCJdSBwIXG;
            ArrayList arrayList = new ArrayList(mxVarArr.length);
            for (mx mxVar : mxVarArr) {
                arrayList.add(mxVar.OPXfSBeufaJ8());
            }
            biVar.RAsUl2FVSrh6(arrayList);
        }
    }

    public final void S9EYkSpbGuxq(rb rbVar) {
        XL4ISE6Oc65B.getClass();
        ty1.PxuCJdSBwIXG.putObjectVolatile(this, RfyTYNmI9Srp, rbVar);
    }

    @Override // defpackage.at0
    public final boolean XL4ISE6Oc65B() {
        return false;
    }
}
