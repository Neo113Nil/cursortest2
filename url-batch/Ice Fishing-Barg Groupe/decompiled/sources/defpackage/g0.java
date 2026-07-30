package defpackage;

import com.ice.fishing.grenza.data.remote.AnatoliaRequestFrame;
import com.ice.fishing.grenza.data.remote.AnatoliaTablePayload;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class g0 {
    public final if1 PxuCJdSBwIXG;
    public final tt0 TSizfFm2Yiuu;
    public final String lS5Rgt96tfkO;

    public g0(if1 if1Var, String str) {
        this.PxuCJdSBwIXG = if1Var;
        this.lS5Rgt96tfkO = str;
        gt0 gt0Var = ht0.Y1f8riQaR6yg;
        gt0Var.getClass();
        lt0 lt0Var = gt0Var.PxuCJdSBwIXG;
        ak akVar = lt0Var.lS5Rgt96tfkO;
        k42 k42Var = gt0Var.lS5Rgt96tfkO;
        lt0 lt0Var2 = new lt0(true, akVar, lt0Var.TSizfFm2Yiuu);
        k42Var.getClass();
        tt0 tt0Var = new tt0(lt0Var2, k42Var);
        k42Var.equals(cs0.jJwa0q7P5wHq);
        this.TSizfFm2Yiuu = tt0Var;
    }

    public static final void PxuCJdSBwIXG(g0 g0Var, vs1 vs1Var, AtomicBoolean atomicBoolean, bi biVar, String str) {
        Object uv1Var;
        if (atomicBoolean.compareAndSet(false, true)) {
            vs1Var.lS5Rgt96tfkO(null, 1000);
            try {
                tt0 tt0Var = g0Var.TSizfFm2Yiuu;
                tt0Var.getClass();
                uv1Var = (AnatoliaTablePayload) tt0Var.PxuCJdSBwIXG(str, AnatoliaTablePayload.Companion.serializer());
            } catch (Throwable th) {
                uv1Var = new uv1(th);
            }
            Throwable PxuCJdSBwIXG = vv1.PxuCJdSBwIXG(uv1Var);
            biVar.RAsUl2FVSrh6(PxuCJdSBwIXG == null ? (AnatoliaTablePayload) uv1Var : new uv1(PxuCJdSBwIXG));
        }
    }

    public static final void lS5Rgt96tfkO(g0 g0Var, bi biVar, AtomicBoolean atomicBoolean, Exception exc) {
        if (atomicBoolean.compareAndSet(false, true)) {
            biVar.RAsUl2FVSrh6(new uv1(exc));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object TSizfFm2Yiuu(String str, String str2, String str3, ct ctVar) {
        f0 f0Var;
        int i;
        AnatoliaTablePayload anatoliaTablePayload;
        if (ctVar instanceof f0) {
            f0Var = (f0) ctVar;
            int i2 = f0Var.cpQdD2nAriOS;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f0Var.cpQdD2nAriOS = i2 - Integer.MIN_VALUE;
                Object obj = f0Var.dgRBjINgWbAK;
                i = f0Var.cpQdD2nAriOS;
                bt btVar = null;
                if (i != 0) {
                    ng0.tmVwIGCQF4zR(obj);
                    a92UlCVFR9N8 a92ulcvfr9n8 = new a92UlCVFR9N8(this, new AnatoliaRequestFrame(str, str2, str3), btVar, 4);
                    f0Var.cpQdD2nAriOS = 1;
                    obj = kj0.nxJAScVArhE9(80000L, a92ulcvfr9n8, f0Var);
                    su suVar = su.rtx2ld2ELZv4;
                    if (obj == suVar) {
                        return suVar;
                    }
                } else {
                    if (i != 1) {
                        u9.rtx2ld2ELZv4("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ng0.tmVwIGCQF4zR(obj);
                }
                anatoliaTablePayload = (AnatoliaTablePayload) obj;
                if (anatoliaTablePayload == null) {
                    return anatoliaTablePayload;
                }
                u9.S9EYkSpbGuxq("WebSocket response timed out");
                return null;
            }
        }
        f0Var = new f0(this, ctVar);
        Object obj2 = f0Var.dgRBjINgWbAK;
        i = f0Var.cpQdD2nAriOS;
        bt btVar2 = null;
        if (i != 0) {
        }
        anatoliaTablePayload = (AnatoliaTablePayload) obj2;
        if (anatoliaTablePayload == null) {
        }
    }
}
