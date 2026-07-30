package defpackage;

import android.content.Context;
import android.os.Build;
import com.ice.fishing.grenza.R;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class v3 implements nh0 {
    public static final u3 Companion = new u3();
    public static boolean a92UlCVFR9N8 = true;
    public final r1 PxuCJdSBwIXG;
    public cr2 TSizfFm2Yiuu;
    public boolean Y1f8riQaR6yg;
    public final s3 e9gEMXR7LXtO;
    public final Object lS5Rgt96tfkO = new Object();

    public v3(r1 r1Var) {
        this.PxuCJdSBwIXG = r1Var;
        s3 s3Var = new s3();
        this.e9gEMXR7LXtO = s3Var;
        if (r1Var.isAttachedToWindow()) {
            Context context = r1Var.getContext();
            if (!this.Y1f8riQaR6yg) {
                context.getApplicationContext().registerComponentCallbacks(s3Var);
                this.Y1f8riQaR6yg = true;
            }
        }
        r1Var.addOnAttachStateChangeListener(new t3(0, this));
    }

    @Override // defpackage.nh0
    public final void PxuCJdSBwIXG(ph0 ph0Var) {
        synchronized (this.lS5Rgt96tfkO) {
            if (!ph0Var.RfyTYNmI9Srp) {
                ph0Var.RfyTYNmI9Srp = true;
                ph0Var.lS5Rgt96tfkO();
            }
        }
    }

    public final g30 TSizfFm2Yiuu(r1 r1Var) {
        cr2 cr2Var = this.TSizfFm2Yiuu;
        if (cr2Var != null) {
            return cr2Var;
        }
        cr2 cr2Var2 = new cr2(r1Var.getContext());
        cr2Var2.setClipChildren(false);
        cr2Var2.setClipToPadding(false);
        cr2Var2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        r1Var.addView(cr2Var2, -1);
        this.TSizfFm2Yiuu = cr2Var2;
        return cr2Var2;
    }

    @Override // defpackage.nh0
    public final ph0 lS5Rgt96tfkO() {
        sh0 ci0Var;
        sh0 sh0Var;
        ph0 ph0Var;
        synchronized (this.lS5Rgt96tfkO) {
            try {
                r1 r1Var = this.PxuCJdSBwIXG;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    r1Var.getUniqueDrawingId();
                }
                if (i >= 29) {
                    sh0Var = new zh0();
                } else {
                    if (a92UlCVFR9N8) {
                        try {
                            ci0Var = new xh0(this.PxuCJdSBwIXG, new ki(), new ji());
                        } catch (Throwable unused) {
                            a92UlCVFR9N8 = false;
                            ci0Var = new ci0(TSizfFm2Yiuu(this.PxuCJdSBwIXG));
                        }
                    } else {
                        ci0Var = new ci0(TSizfFm2Yiuu(this.PxuCJdSBwIXG));
                    }
                    sh0Var = ci0Var;
                }
                ph0Var = new ph0(sh0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return ph0Var;
    }
}
