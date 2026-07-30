package defpackage;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class jv {
    public boolean PxuCJdSBwIXG;
    public Object TSizfFm2Yiuu;
    public Object Y1f8riQaR6yg;
    public final Object lS5Rgt96tfkO;

    public jv(int i) {
        switch (i) {
            case 2:
                this.lS5Rgt96tfkO = new Object();
                this.TSizfFm2Yiuu = new ArrayList();
                this.Y1f8riQaR6yg = new ArrayList();
                this.PxuCJdSBwIXG = true;
                break;
            default:
                this.lS5Rgt96tfkO = new Intent("android.intent.action.VIEW");
                this.TSizfFm2Yiuu = new jx1(27);
                this.PxuCJdSBwIXG = true;
                break;
        }
    }

    public static IOException PxuCJdSBwIXG(jv jvVar, boolean z, IOException iOException, int i) {
        boolean z2 = (i & 4) == 0;
        boolean z3 = (i & 8) == 0;
        if (iOException != null) {
            jvVar.a92UlCVFR9N8(iOException);
        }
        if (z3) {
            s60 s60Var = ((js1) jvVar.lS5Rgt96tfkO).dgRBjINgWbAK;
            if (iOException != null) {
                s60Var.getClass();
            } else {
                s60Var.getClass();
            }
        }
        if (z2) {
            s60 s60Var2 = ((js1) jvVar.lS5Rgt96tfkO).dgRBjINgWbAK;
            if (iOException != null) {
                s60Var2.getClass();
            } else {
                s60Var2.getClass();
            }
        }
        return ((js1) jvVar.lS5Rgt96tfkO).RAsUl2FVSrh6(jvVar, z3 && !z, z2 && !z, z2 && z, z3 && z, iOException);
    }

    public m9 RAsUl2FVSrh6() {
        js1 js1Var = (js1) this.lS5Rgt96tfkO;
        if (js1Var.BRwzKIf41E4i) {
            u9.rtx2ld2ELZv4("Check failed.");
            return null;
        }
        js1Var.BRwzKIf41E4i = true;
        js1Var.x50lh2ztY7Y5.dgRBjINgWbAK();
        synchronized (js1Var) {
            if (js1Var.pnx5pC0XzaCw == null) {
                throw new IllegalStateException("Check failed.");
            }
            if (js1Var.S9EYkSpbGuxq || js1Var.VhhvGxCb8gfr) {
                throw new IllegalStateException("Check failed.");
            }
            if (js1Var.RfyTYNmI9Srp) {
                throw new IllegalStateException("Check failed.");
            }
            if (!js1Var.EcgxDIVH5in8) {
                throw new IllegalStateException("Check failed.");
            }
            js1Var.EcgxDIVH5in8 = false;
            js1Var.S9EYkSpbGuxq = true;
            js1Var.VhhvGxCb8gfr = true;
        }
        b70 RAsUl2FVSrh6 = ((d70) this.Y1f8riQaR6yg).RAsUl2FVSrh6();
        RAsUl2FVSrh6.getClass();
        ls1 ls1Var = (ls1) RAsUl2FVSrh6;
        ls1Var.e9gEMXR7LXtO.setSoTimeout(0);
        ls1Var.rtx2ld2ELZv4();
        return new m9(this);
    }

    public ls1 TSizfFm2Yiuu() {
        b70 RAsUl2FVSrh6 = ((d70) this.Y1f8riQaR6yg).RAsUl2FVSrh6();
        ls1 ls1Var = RAsUl2FVSrh6 instanceof ls1 ? (ls1) RAsUl2FVSrh6 : null;
        if (ls1Var != null) {
            return ls1Var;
        }
        u9.rtx2ld2ELZv4("no connection for CONNECT tunnels");
        return null;
    }

    public qs1 Y1f8riQaR6yg(nv1 nv1Var) {
        jv jvVar;
        String PxuCJdSBwIXG;
        long rtx2ld2ELZv4;
        try {
            PxuCJdSBwIXG = nv1Var.cpQdD2nAriOS.PxuCJdSBwIXG("Content-Type");
            if (PxuCJdSBwIXG == null) {
                PxuCJdSBwIXG = null;
            }
            rtx2ld2ELZv4 = ((d70) this.Y1f8riQaR6yg).rtx2ld2ELZv4(nv1Var);
            jvVar = this;
        } catch (IOException e) {
            e = e;
            jvVar = this;
        }
        try {
            return new qs1(PxuCJdSBwIXG, rtx2ld2ELZv4, new es1(new a70(jvVar, ((d70) this.Y1f8riQaR6yg).lS5Rgt96tfkO(nv1Var), rtx2ld2ELZv4, false)));
        } catch (IOException e2) {
            e = e2;
            IOException iOException = e;
            ((js1) jvVar.lS5Rgt96tfkO).dgRBjINgWbAK.getClass();
            jvVar.a92UlCVFR9N8(iOException);
            throw iOException;
        }
    }

    public void a92UlCVFR9N8(IOException iOException) {
        this.PxuCJdSBwIXG = true;
        ((d70) this.Y1f8riQaR6yg).RAsUl2FVSrh6().lS5Rgt96tfkO((js1) this.lS5Rgt96tfkO, iOException);
    }

    public mv1 e9gEMXR7LXtO(boolean z) {
        try {
            mv1 OPXfSBeufaJ8 = ((d70) this.Y1f8riQaR6yg).OPXfSBeufaJ8(z);
            if (OPXfSBeufaJ8 == null) {
                return OPXfSBeufaJ8;
            }
            OPXfSBeufaJ8.r3s1LDPKFs1S = this;
            return OPXfSBeufaJ8;
        } catch (IOException e) {
            ((js1) this.lS5Rgt96tfkO).dgRBjINgWbAK.getClass();
            a92UlCVFR9N8(e);
            throw e;
        }
    }

    public op0 lS5Rgt96tfkO() {
        Intent intent = (Intent) this.lS5Rgt96tfkO;
        if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            intent.putExtras(bundle);
        }
        intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.PxuCJdSBwIXG);
        ((jx1) this.TSizfFm2Yiuu).getClass();
        intent.putExtras(new Bundle());
        intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        String languageTag = adjustedDefault.size() > 0 ? adjustedDefault.get(0).toLanguageTag() : null;
        if (!TextUtils.isEmpty(languageTag)) {
            Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
            if (!bundleExtra.containsKey("Accept-Language")) {
                bundleExtra.putString("Accept-Language", languageTag);
                intent.putExtra("com.android.browser.headers", bundleExtra);
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            if (((ActivityOptions) this.Y1f8riQaR6yg) == null) {
                this.Y1f8riQaR6yg = ActivityOptions.makeBasic();
            }
            ngxnMNrpiKat.rtx2ld2ELZv4((ActivityOptions) this.Y1f8riQaR6yg);
        }
        if (i >= 36) {
            if (((ActivityOptions) this.Y1f8riQaR6yg) == null) {
                this.Y1f8riQaR6yg = ActivityOptions.makeBasic();
            }
            GlTbNTgfSMqy.e9gEMXR7LXtO((ActivityOptions) this.Y1f8riQaR6yg, !intent.getBooleanExtra("androidx.browser.customtabs.extra.DISABLE_BACKGROUND_INTERACTION", false));
        }
        ActivityOptions activityOptions = (ActivityOptions) this.Y1f8riQaR6yg;
        return new op0(12, intent, activityOptions != null ? activityOptions.toBundle() : null);
    }

    public jv(cy0 cy0Var, gb2 gb2Var, pp1 pp1Var) {
        this.lS5Rgt96tfkO = cy0Var;
        this.TSizfFm2Yiuu = gb2Var;
        this.Y1f8riQaR6yg = pp1Var;
        this.PxuCJdSBwIXG = true;
    }

    public jv(js1 js1Var, e70 e70Var, d70 d70Var) {
        e70Var.getClass();
        this.lS5Rgt96tfkO = js1Var;
        this.TSizfFm2Yiuu = e70Var;
        this.Y1f8riQaR6yg = d70Var;
    }
}
