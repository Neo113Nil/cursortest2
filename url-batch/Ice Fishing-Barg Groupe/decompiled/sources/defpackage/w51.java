package defpackage;

import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class w51 {
    public final us0 PxuCJdSBwIXG;

    public w51(us0 us0Var) {
        this.PxuCJdSBwIXG = us0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        if (r8 == r7) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object PxuCJdSBwIXG(ct ctVar) {
        v51 v51Var;
        Object obj;
        int i;
        us0 us0Var = this.PxuCJdSBwIXG;
        ex1 ex1Var = us0Var.PxuCJdSBwIXG;
        if (ctVar instanceof v51) {
            v51Var = (v51) ctVar;
            int i2 = v51Var.cpQdD2nAriOS;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v51Var.cpQdD2nAriOS = i2 - Integer.MIN_VALUE;
                obj = v51Var.dgRBjINgWbAK;
                i = v51Var.cpQdD2nAriOS;
                no2 no2Var = no2.PxuCJdSBwIXG;
                su suVar = su.rtx2ld2ELZv4;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    v51Var.cpQdD2nAriOS = 1;
                    obj = fx1.fRTaYY6FBZcX(v51Var, new wnqUPcAvl7HT(27), ex1Var, true, false);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ng0.tmVwIGCQF4zR(obj);
                            return no2Var;
                        }
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ng0.tmVwIGCQF4zR(obj);
                }
                if (((Number) obj).intValue() == 0) {
                    List list = n12.PxuCJdSBwIXG;
                    v51Var.cpQdD2nAriOS = 2;
                    Object fRTaYY6FBZcX = fx1.fRTaYY6FBZcX(v51Var, new e9gEMXR7LXtO(16, us0Var, list), ex1Var, false, true);
                    if (fRTaYY6FBZcX != suVar) {
                        fRTaYY6FBZcX = no2Var;
                    }
                    if (fRTaYY6FBZcX == suVar) {
                        return suVar;
                    }
                }
                return no2Var;
            }
        }
        v51Var = new v51(this, ctVar);
        obj = v51Var.dgRBjINgWbAK;
        i = v51Var.cpQdD2nAriOS;
        no2 no2Var2 = no2.PxuCJdSBwIXG;
        su suVar2 = su.rtx2ld2ELZv4;
        if (i != 0) {
        }
        if (((Number) obj).intValue() == 0) {
        }
        return no2Var2;
    }
}
