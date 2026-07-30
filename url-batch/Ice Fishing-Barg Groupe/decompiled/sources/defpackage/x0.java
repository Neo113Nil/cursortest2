package defpackage;

import android.content.ClipData;
import android.os.Build;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class x0 implements qk {
    public final y0 PxuCJdSBwIXG;

    public x0(y0 y0Var) {
        this.PxuCJdSBwIXG = y0Var;
    }

    public final void PxuCJdSBwIXG(nk nkVar) {
        y0 y0Var = this.PxuCJdSBwIXG;
        if (nkVar != null) {
            y0Var.PxuCJdSBwIXG().setPrimaryClip(nkVar.PxuCJdSBwIXG);
        } else if (Build.VERSION.SDK_INT >= 28) {
            y0Var.PxuCJdSBwIXG().clearPrimaryClip();
        } else {
            y0Var.PxuCJdSBwIXG().setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
