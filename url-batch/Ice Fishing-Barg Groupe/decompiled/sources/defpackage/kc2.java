package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class kc2 extends r61 {
    public final Object PxuCJdSBwIXG;
    public final PointerInputEventHandler TSizfFm2Yiuu;
    public final Object lS5Rgt96tfkO;

    public kc2(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj2 = (i & 2) != 0 ? null : obj2;
        this.PxuCJdSBwIXG = obj;
        this.lS5Rgt96tfkO = obj2;
        this.TSizfFm2Yiuu = pointerInputEventHandler;
    }

    @Override // defpackage.r61
    public final m61 Y1f8riQaR6yg() {
        return new pc2(this.PxuCJdSBwIXG, this.lS5Rgt96tfkO, this.TSizfFm2Yiuu);
    }

    @Override // defpackage.r61
    public final void a92UlCVFR9N8(m61 m61Var) {
        pc2 pc2Var = (pc2) m61Var;
        Object obj = pc2Var.VhhvGxCb8gfr;
        Object obj2 = this.PxuCJdSBwIXG;
        boolean z = !cs0.wdg6QnbFHrFF(obj, obj2);
        pc2Var.VhhvGxCb8gfr = obj2;
        Object obj3 = pc2Var.S2OOm9zPNm0h;
        Object obj4 = this.lS5Rgt96tfkO;
        if (!cs0.wdg6QnbFHrFF(obj3, obj4)) {
            z = true;
        }
        pc2Var.S2OOm9zPNm0h = obj4;
        Class<?> cls = pc2Var.ZbWwgt3aGe7A.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.TSizfFm2Yiuu;
        if (cls == pointerInputEventHandler.getClass() ? z : true) {
            pc2Var.fkblLSN2bAgv();
        }
        pc2Var.ZbWwgt3aGe7A = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kc2)) {
            return false;
        }
        kc2 kc2Var = (kc2) obj;
        return cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, kc2Var.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, kc2Var.lS5Rgt96tfkO) && this.TSizfFm2Yiuu == kc2Var.TSizfFm2Yiuu;
    }

    public final int hashCode() {
        Object obj = this.PxuCJdSBwIXG;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.lS5Rgt96tfkO;
        return this.TSizfFm2Yiuu.hashCode() + ((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 961);
    }
}
