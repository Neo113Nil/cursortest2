package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class v61 implements u61 {
    public at OPXfSBeufaJ8;
    public z82 dgRBjINgWbAK;
    public final Context rtx2ld2ELZv4;
    public final fj1 wdg6QnbFHrFF = new fj1(1.0f);

    public v61(Context context) {
        this.rtx2ld2ELZv4 = context;
    }

    @Override // defpackage.hu
    public final Object IAToe7bXGz4N(pe0 pe0Var, Object obj) {
        return pe0Var.rtx2ld2ELZv4(obj, this);
    }

    @Override // defpackage.hu
    public final hu RfyTYNmI9Srp(hu huVar) {
        return f2.xfACYKDMU6Dj(this, huVar);
    }

    @Override // defpackage.hu
    public final fu S2OOm9zPNm0h(gu guVar) {
        return f2.EcgxDIVH5in8(this, guVar);
    }

    @Override // defpackage.hu
    public final hu kpCQ9veP6n3I(gu guVar) {
        return f2.IAToe7bXGz4N(this, guVar);
    }

    @Override // defpackage.u61
    public final float rZjpSjn4zoMv() {
        bt btVar;
        j92 j92Var;
        if (this.dgRBjINgWbAK == null) {
            Context context = this.rtx2ld2ELZv4;
            v81 v81Var = qu2.PxuCJdSBwIXG;
            synchronized (v81Var) {
                try {
                    Object RAsUl2FVSrh6 = v81Var.RAsUl2FVSrh6(context);
                    btVar = null;
                    if (RAsUl2FVSrh6 == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        eg PxuCJdSBwIXG = mm2.PxuCJdSBwIXG(-1, 6, null);
                        ny1 ny1Var = new ny1(new ou2(contentResolver, uriFor, new pu2(PxuCJdSBwIXG, ni0.r3s1LDPKFs1S(Looper.getMainLooper())), PxuCJdSBwIXG, context, null));
                        mb2 mb2Var = new mb2(null);
                        yw ywVar = j00.PxuCJdSBwIXG;
                        at atVar = new at(f2.xfACYKDMU6Dj(mb2Var, h41.PxuCJdSBwIXG));
                        l52.Companion.getClass();
                        RAsUl2FVSrh6 = hq0.wLFCmsViZrNT(ny1Var, atVar, new h92(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        v81Var.cpQdD2nAriOS(context, RAsUl2FVSrh6);
                    }
                    j92Var = (j92) RAsUl2FVSrh6;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.wdg6QnbFHrFF.OPXfSBeufaJ8(((Number) j92Var.getValue()).floatValue());
            at atVar2 = this.OPXfSBeufaJ8;
            if (atVar2 == null) {
                u9.rtx2ld2ELZv4("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.dgRBjINgWbAK = fx1.KUoIVIumpKat(atVar2, null, new a92UlCVFR9N8(j92Var, this, btVar, 19), 3);
        }
        return this.wdg6QnbFHrFF.rtx2ld2ELZv4();
    }
}
