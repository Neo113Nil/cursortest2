package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public abstract class to {
    public final Object PxuCJdSBwIXG;

    public to(int i) {
        switch (i) {
            case 1:
                this.PxuCJdSBwIXG = new Object();
                break;
            case 2:
                this.PxuCJdSBwIXG = sj0.tmVwIGCQF4zR(Boolean.FALSE);
                break;
            default:
                this.PxuCJdSBwIXG = new ArrayList();
                break;
        }
    }

    public abstract void OPXfSBeufaJ8(ui uiVar);

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean PxuCJdSBwIXG(int i, vf0 vf0Var, Object obj) {
        ArrayList arrayList = vf0Var.PxuCJdSBwIXG;
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Object obj2 = arrayList.get(i2);
                if (!(obj2 instanceof nf0)) {
                    if (!(obj2 instanceof vf0)) {
                        u9.BRwzKIf41E4i(obj2, "Unexpected child source info ");
                        break;
                    }
                    if (PxuCJdSBwIXG(i, (vf0) obj2, obj)) {
                        lS5Rgt96tfkO(0, vf0Var, obj2);
                        return true;
                    }
                } else if (obj2 == obj) {
                    lS5Rgt96tfkO(0, vf0Var, obj2);
                    return true;
                }
                i2++;
            }
        } else {
            lS5Rgt96tfkO(i, vf0Var, null);
            return true;
        }
    }

    public void RAsUl2FVSrh6(int i, Object obj, vf0 vf0Var, Object obj2) {
        hp.Companion.getClass();
        if (cs0.wdg6QnbFHrFF(obj, fp.lS5Rgt96tfkO)) {
            lS5Rgt96tfkO(i, vf0Var, null);
        }
    }

    public abstract void TSizfFm2Yiuu(v32 v32Var);

    public abstract void Y1f8riQaR6yg();

    public abstract Object a92UlCVFR9N8();

    public abstract void dgRBjINgWbAK(gl2 gl2Var);

    public abstract void e9gEMXR7LXtO();

    public void lS5Rgt96tfkO(int i, vf0 vf0Var, Object obj) {
        ((ArrayList) this.PxuCJdSBwIXG).add(new uo(i, null, null));
    }

    public abstract le0 rtx2ld2ELZv4(v32 v32Var);

    public abstract void wdg6QnbFHrFF(Object obj);

    public abstract void x50lh2ztY7Y5();
}
