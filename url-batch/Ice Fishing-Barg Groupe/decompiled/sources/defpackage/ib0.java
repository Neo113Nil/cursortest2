package defpackage;

import android.app.Application;
import android.graphics.Typeface;
import android.os.Bundle;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ib0 implements yu, df1, zm1, nn1, rq1, qr1, l52, pk2, gu {
    public static ib0 OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public ib0(id0 id0Var) {
        this.rtx2ld2ELZv4 = 1;
        new CopyOnWriteArrayList();
    }

    public static Typeface TSizfFm2Yiuu(String str, xc0 xc0Var, int i) {
        rc0.Companion.getClass();
        if (i == 0) {
            xc0.Companion.getClass();
            if (cs0.wdg6QnbFHrFF(xc0Var, xc0.x50lh2ztY7Y5) && (str == null || str.length() == 0)) {
                return Typeface.DEFAULT;
            }
        }
        int RfyTYNmI9Srp = cs0.RfyTYNmI9Srp(xc0Var, i);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(RfyTYNmI9Srp) : Typeface.create(str, RfyTYNmI9Srp);
    }

    @Override // defpackage.nn1
    public Typeface Y1f8riQaR6yg(xc0 xc0Var, int i) {
        return TSizfFm2Yiuu(null, xc0Var, i);
    }

    @Override // defpackage.nn1
    public Typeface a92UlCVFR9N8(mg0 mg0Var, xc0 xc0Var, int i) {
        String str;
        mg0Var.getClass();
        int i2 = xc0Var.rtx2ld2ELZv4 / 100;
        if (i2 >= 0 && i2 < 2) {
            str = "sans-serif-thin";
        } else if (2 > i2 || i2 >= 4) {
            if (i2 != 4) {
                if (i2 == 5) {
                    str = "sans-serif-medium";
                } else if ((6 > i2 || i2 >= 8) && 8 <= i2 && i2 < 11) {
                    str = "sans-serif-black";
                }
            }
            str = "sans-serif";
        } else {
            str = "sans-serif-light";
        }
        Typeface typeface = null;
        if (str.length() != 0) {
            Typeface TSizfFm2Yiuu = TSizfFm2Yiuu(str, xc0Var, i);
            if (!cs0.wdg6QnbFHrFF(TSizfFm2Yiuu, Typeface.create(Typeface.DEFAULT, cs0.RfyTYNmI9Srp(xc0Var, i))) && !cs0.wdg6QnbFHrFF(TSizfFm2Yiuu, TSizfFm2Yiuu(null, xc0Var, i))) {
                typeface = TSizfFm2Yiuu;
            }
        }
        return typeface == null ? TSizfFm2Yiuu("sans-serif", xc0Var, i) : typeface;
    }

    public String toString() {
        switch (this.rtx2ld2ELZv4) {
            case 13:
                int hashCode = hashCode();
                ov2.RfyTYNmI9Srp(16);
                String num = Integer.toString(hashCode, 16);
                num.getClass();
                return "CreationExtras.Key@" + num + "<" + bu1.PxuCJdSBwIXG(qz1.class).TSizfFm2Yiuu() + ">";
            case 14:
                int hashCode2 = hashCode();
                ov2.RfyTYNmI9Srp(16);
                String num2 = Integer.toString(hashCode2, 16);
                num2.getClass();
                return "CreationExtras.Key@" + num2 + "<" + bu1.PxuCJdSBwIXG(Bundle.class).TSizfFm2Yiuu() + ">";
            case 15:
                return "SharingStarted.Lazily";
            case 16:
                return "ReusedSlotId";
            case 22:
                int hashCode3 = hashCode();
                ov2.RfyTYNmI9Srp(16);
                String num3 = Integer.toString(hashCode3, 16);
                num3.getClass();
                return "CreationExtras.Key@" + num3 + "<" + bu1.PxuCJdSBwIXG(Application.class).TSizfFm2Yiuu() + ">";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ib0(int i) {
        this.rtx2ld2ELZv4 = i;
    }

    @Override // defpackage.rq1
    public void OPXfSBeufaJ8() {
    }

    @Override // defpackage.df1
    public int PxuCJdSBwIXG(int i) {
        return i;
    }

    @Override // defpackage.df1
    public int lS5Rgt96tfkO(int i) {
        return i;
    }

    @Override // defpackage.rq1
    public void wdg6QnbFHrFF(int i, Object obj) {
    }
}
