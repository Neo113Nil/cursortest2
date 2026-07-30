package defpackage;

import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class fb0 implements cm0, nd1, gu, nn1, rq1, yu, l52, y92, up2 {
    public final /* synthetic */ int rtx2ld2ELZv4;

    public fb0(y4 y4Var) {
        this.rtx2ld2ELZv4 = 19;
        qt1.Companion.getClass();
    }

    public static Typeface XL4ISE6Oc65B(String str, xc0 xc0Var, int i) {
        Typeface create;
        rc0.Companion.getClass();
        if (i == 0) {
            xc0.Companion.getClass();
            if (cs0.wdg6QnbFHrFF(xc0Var, xc0.x50lh2ztY7Y5) && (str == null || str.length() == 0)) {
                return Typeface.DEFAULT;
            }
        }
        create = Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), xc0Var.rtx2ld2ELZv4, i == 1);
        return create;
    }

    @Override // defpackage.nd1
    public boolean BRwzKIf41E4i(vw0 vw0Var) {
        z22 S2OOm9zPNm0h = vw0Var.S2OOm9zPNm0h();
        boolean z = false;
        if (S2OOm9zPNm0h != null && S2OOm9zPNm0h.dgRBjINgWbAK) {
            z = true;
        }
        return !z;
    }

    public boolean EcgxDIVH5in8(CharSequence charSequence) {
        return false;
    }

    @Override // defpackage.rq1
    public void OPXfSBeufaJ8() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.sp2
    public o8 QrzZRwfaDlRX(long j, o8 o8Var, o8 o8Var2, o8 o8Var3) {
        return j < 0 ? o8Var : o8Var2;
    }

    @Override // defpackage.nd1
    public boolean RAsUl2FVSrh6(m61 m61Var) {
        return bs0.pnx5pC0XzaCw(ki0.rtx2ld2ELZv4(zv.zf8DYfih6EZu(m61Var), false));
    }

    public void RfyTYNmI9Srp(View view, Rect rect) {
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        rect.set(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public void S9EYkSpbGuxq(String str) {
        km1.Companion.getClass();
        km1.PxuCJdSBwIXG.OPXfSBeufaJ8(str, 4, null);
    }

    @Override // defpackage.nd1
    public boolean TSizfFm2Yiuu(m61 m61Var) {
        return false;
    }

    @Override // defpackage.nn1
    public Typeface Y1f8riQaR6yg(xc0 xc0Var, int i) {
        return XL4ISE6Oc65B(null, xc0Var, i);
    }

    @Override // defpackage.nn1
    public Typeface a92UlCVFR9N8(mg0 mg0Var, xc0 xc0Var, int i) {
        mg0Var.getClass();
        return XL4ISE6Oc65B("sans-serif", xc0Var, i);
    }

    @Override // defpackage.nd1
    public boolean cpQdD2nAriOS(zj0 zj0Var, vw0 vw0Var) {
        return false;
    }

    @Override // defpackage.up2
    public int dgRBjINgWbAK() {
        return 0;
    }

    @Override // defpackage.nd1
    public int e9gEMXR7LXtO() {
        return 8;
    }

    @Override // defpackage.up2
    public int r3s1LDPKFs1S() {
        return 0;
    }

    @Override // defpackage.nd1
    public void rtx2ld2ELZv4(vw0 vw0Var, long j, zj0 zj0Var, int i, boolean z) {
        vw0Var.e6tOsSdd2EFb(j, zj0Var, z);
    }

    public String toString() {
        switch (this.rtx2ld2ELZv4) {
            case 14:
                int hashCode = hashCode();
                ov2.RfyTYNmI9Srp(16);
                String num = Integer.toString(hashCode, 16);
                num.getClass();
                return "CreationExtras.Key@" + num + "<" + bu1.PxuCJdSBwIXG(pr2.class).TSizfFm2Yiuu() + ">";
            case 15:
                return "SharingStarted.Eagerly";
            case 23:
                int hashCode2 = hashCode();
                ov2.RfyTYNmI9Srp(16);
                String num2 = Integer.toString(hashCode2, 16);
                num2.getClass();
                return "CreationExtras.Key@" + num2 + "<" + bu1.PxuCJdSBwIXG(String.class).TSizfFm2Yiuu() + ">";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.rq1
    public void wdg6QnbFHrFF(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    public /* synthetic */ fb0(int i) {
        this.rtx2ld2ELZv4 = i;
    }

    public void VhhvGxCb8gfr(ap1 ap1Var, int i, int i2) {
    }

    @Override // defpackage.sp2
    public o8 x50lh2ztY7Y5(long j, o8 o8Var, o8 o8Var2, o8 o8Var3) {
        return o8Var3;
    }
}
