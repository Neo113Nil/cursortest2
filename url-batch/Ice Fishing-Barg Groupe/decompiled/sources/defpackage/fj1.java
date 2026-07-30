package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fj1 extends q92 implements Parcelable, w72, i92, d91 {
    public t72 OPXfSBeufaJ8;
    public static final ej1 Companion = new ej1();
    public static final Parcelable.Creator<fj1> CREATOR = new BUo4iHFctTZi(3);

    public fj1(float f) {
        j72 OPXfSBeufaJ8 = s72.OPXfSBeufaJ8();
        t72 t72Var = new t72(OPXfSBeufaJ8.RAsUl2FVSrh6(), f);
        if (!(OPXfSBeufaJ8 instanceof wg0)) {
            t72Var.lS5Rgt96tfkO = new t72(1L, f);
        }
        this.OPXfSBeufaJ8 = t72Var;
    }

    public final void OPXfSBeufaJ8(float f) {
        j72 OPXfSBeufaJ8;
        t72 t72Var = (t72) s72.RAsUl2FVSrh6(this.OPXfSBeufaJ8);
        if (t72Var.TSizfFm2Yiuu == f) {
            return;
        }
        t72 t72Var2 = this.OPXfSBeufaJ8;
        synchronized (s72.TSizfFm2Yiuu) {
            j72.Companion.getClass();
            OPXfSBeufaJ8 = s72.OPXfSBeufaJ8();
            ((t72) s72.r3s1LDPKFs1S(t72Var2, this, OPXfSBeufaJ8, t72Var)).TSizfFm2Yiuu = f;
        }
        s72.cpQdD2nAriOS(OPXfSBeufaJ8, this);
    }

    @Override // defpackage.p92
    public final r92 PxuCJdSBwIXG() {
        return this.OPXfSBeufaJ8;
    }

    @Override // defpackage.p92
    public final void Y1f8riQaR6yg(r92 r92Var) {
        r92Var.getClass();
        this.OPXfSBeufaJ8 = (t72) r92Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.w72
    public final y72 e9gEMXR7LXtO() {
        return jx1.S2OOm9zPNm0h;
    }

    @Override // defpackage.i92
    public final Object getValue() {
        return Float.valueOf(rtx2ld2ELZv4());
    }

    @Override // defpackage.p92
    public final r92 lS5Rgt96tfkO(r92 r92Var, r92 r92Var2, r92 r92Var3) {
        if (((t72) r92Var2).TSizfFm2Yiuu == ((t72) r92Var3).TSizfFm2Yiuu) {
            return r92Var2;
        }
        return null;
    }

    public final float rtx2ld2ELZv4() {
        return ((t72) s72.RfyTYNmI9Srp(this.OPXfSBeufaJ8, this)).TSizfFm2Yiuu;
    }

    @Override // defpackage.d91
    public final void setValue(Object obj) {
        OPXfSBeufaJ8(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((t72) s72.RAsUl2FVSrh6(this.OPXfSBeufaJ8)).TSizfFm2Yiuu + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(rtx2ld2ELZv4());
    }
}
