package defpackage;

import android.view.ActionMode;
import com.ice.fishing.grenza.R;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class x2 implements p00 {
    public final /* synthetic */ int PxuCJdSBwIXG;
    public final /* synthetic */ Object lS5Rgt96tfkO;

    public /* synthetic */ x2(int i, Object obj) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = obj;
    }

    @Override // defpackage.p00
    public final void PxuCJdSBwIXG() {
        int i = this.PxuCJdSBwIXG;
        Object obj = this.lS5Rgt96tfkO;
        switch (i) {
            case 0:
                zz zzVar = (zz) obj;
                zzVar.dismiss();
                zzVar.QrzZRwfaDlRX.a92UlCVFR9N8();
                break;
            case 1:
                ap1 ap1Var = (ap1) obj;
                ap1Var.a92UlCVFR9N8();
                ap1Var.setTag(R.id.view_tree_lifecycle_owner, null);
                ap1Var.S2OOm9zPNm0h.removeViewImmediate(ap1Var);
                break;
            case 2:
                k6 k6Var = (k6) obj;
                f82 f82Var = k6Var.e9gEMXR7LXtO;
                rf1 rf1Var = f82Var.rtx2ld2ELZv4;
                if (rf1Var != null) {
                    rf1Var.lS5Rgt96tfkO();
                }
                f82Var.PxuCJdSBwIXG();
                ActionMode actionMode = k6Var.rtx2ld2ELZv4;
                if (actionMode != null) {
                    actionMode.finish();
                }
                k6Var.rtx2ld2ELZv4 = null;
                break;
            case 3:
                zc zcVar = (zc) ((ad) obj).TSizfFm2Yiuu.getValue();
                if (zcVar != null) {
                    zcVar.close();
                    break;
                }
                break;
            case 4:
                ((t00) obj).OPXfSBeufaJ8.PxuCJdSBwIXG();
                break;
            case 5:
                ((eh2) obj).QrzZRwfaDlRX();
                break;
            case 6:
                ((by0) obj).Y1f8riQaR6yg = null;
                break;
            case 7:
                ny0 ny0Var = (ny0) obj;
                jv jvVar = ny0Var.TSizfFm2Yiuu;
                if (jvVar != null) {
                    jvVar.PxuCJdSBwIXG = false;
                }
                ny0Var.TSizfFm2Yiuu = null;
                break;
            case 8:
                ((iy0) obj).a92UlCVFR9N8 = true;
                break;
            default:
                ((x12) obj).ZbWwgt3aGe7A(null);
                break;
        }
    }
}
