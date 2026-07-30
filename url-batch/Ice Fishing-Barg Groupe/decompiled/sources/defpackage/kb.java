package defpackage;

import android.database.sqlite.SQLiteDatabase;
import com.ice.fishing.grenza.presentation.navigation.GameRoute;
import com.ice.fishing.grenza.presentation.navigation.HubRoute;
import com.ice.fishing.grenza.presentation.navigation.LaunchRoute;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class kb implements ae0 {
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ kb(int i) {
        this.rtx2ld2ELZv4 = i;
    }

    @Override // defpackage.ae0
    public final Object PxuCJdSBwIXG() {
        int i = this.rtx2ld2ELZv4;
        no2 no2Var = no2.PxuCJdSBwIXG;
        switch (i) {
            case 0:
                return new m82(mm2.TSizfFm2Yiuu(1308617531));
            case 1:
                t92 t92Var = hd.PxuCJdSBwIXG;
                return null;
            case 2:
                return rl.TSizfFm2Yiuu(0L, 0L, 0L, 0L, -1);
            case 3:
                t92 t92Var2 = rl.PxuCJdSBwIXG;
                return Boolean.TRUE;
            case 4:
                return no2Var;
            case 5:
                t92 t92Var3 = yp.PxuCJdSBwIXG;
                return null;
            case 6:
                mp.lS5Rgt96tfkO("Unexpected call to default provider");
                throw new tm();
            case 7:
                float f = n20.PxuCJdSBwIXG;
                return Boolean.TRUE;
            case 8:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 9:
                return pd0.lS5Rgt96tfkO();
            case 10:
                return new re1("com.ice.fishing.grenza.presentation.navigation.GameRoute", GameRoute.INSTANCE, new Annotation[0]);
            case 11:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 12:
                return new re1("com.ice.fishing.grenza.presentation.navigation.HubRoute", HubRoute.INSTANCE, new Annotation[0]);
            case 13:
                fq fqVar = vn0.PxuCJdSBwIXG;
                return gw.PxuCJdSBwIXG;
            case 14:
                t92 t92Var4 = cq0.PxuCJdSBwIXG;
                return null;
            case 15:
                ak0 ak0Var = nr0.PxuCJdSBwIXG;
                return Boolean.TRUE;
            case 16:
                return new k10(48.0f);
            case 17:
            case 18:
                return no2Var;
            case 19:
                return au0.lS5Rgt96tfkO;
            case 20:
                return xt0.lS5Rgt96tfkO;
            case 21:
                return vt0.lS5Rgt96tfkO;
            case 22:
                return zt0.lS5Rgt96tfkO;
            case 23:
                return jt0.lS5Rgt96tfkO;
            case 24:
                return new re1("com.ice.fishing.grenza.presentation.navigation.LaunchRoute", LaunchRoute.INSTANCE, new Annotation[0]);
            case 25:
                return new jz0(0, 0);
            case 26:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 27:
                fq fqVar2 = g21.PxuCJdSBwIXG;
                return null;
            case 28:
                fq fqVar3 = h21.PxuCJdSBwIXG;
                return null;
            default:
                t92 t92Var5 = i21.PxuCJdSBwIXG;
                return ih0.gPXPFXrUH4XX;
        }
    }

    public /* synthetic */ kb(ns0 ns0Var, int i) {
        this.rtx2ld2ELZv4 = i;
    }
}
