package defpackage;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public class it2 extends ht2 {
    public it2(rt2 rt2Var, WindowInsets windowInsets) {
        super(rt2Var, windowInsets);
    }

    @Override // defpackage.ot2
    public rt2 PxuCJdSBwIXG() {
        WindowInsets consumeDisplayCutout;
        consumeDisplayCutout = this.TSizfFm2Yiuu.consumeDisplayCutout();
        return rt2.TSizfFm2Yiuu(consumeDisplayCutout, null);
    }

    @Override // defpackage.ot2
    public l00 RAsUl2FVSrh6() {
        DisplayCutout displayCutout;
        displayCutout = this.TSizfFm2Yiuu.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new l00(displayCutout);
    }

    @Override // defpackage.gt2, defpackage.ot2
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it2)) {
            return false;
        }
        it2 it2Var = (it2) obj;
        return Objects.equals(this.TSizfFm2Yiuu, it2Var.TSizfFm2Yiuu) && Objects.equals(this.RAsUl2FVSrh6, it2Var.RAsUl2FVSrh6) && gt2.nLZGh9p8gVSu(this.rtx2ld2ELZv4, it2Var.rtx2ld2ELZv4);
    }

    @Override // defpackage.ot2
    public int hashCode() {
        return this.TSizfFm2Yiuu.hashCode();
    }
}
