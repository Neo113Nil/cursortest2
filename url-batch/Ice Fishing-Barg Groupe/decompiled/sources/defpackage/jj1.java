package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class jj1 extends q92 implements Parcelable, w72, i92, d91 {
    public v72 OPXfSBeufaJ8;
    public static final ij1 Companion = new ij1();
    public static final Parcelable.Creator<jj1> CREATOR = new BUo4iHFctTZi(5);

    public jj1(long j) {
        j72 OPXfSBeufaJ8 = s72.OPXfSBeufaJ8();
        v72 v72Var = new v72(OPXfSBeufaJ8.RAsUl2FVSrh6(), j);
        if (!(OPXfSBeufaJ8 instanceof wg0)) {
            v72Var.lS5Rgt96tfkO = new v72(1L, j);
        }
        this.OPXfSBeufaJ8 = v72Var;
    }

    public final void OPXfSBeufaJ8(long j) {
        j72 OPXfSBeufaJ8;
        v72 v72Var = (v72) s72.RAsUl2FVSrh6(this.OPXfSBeufaJ8);
        if (v72Var.TSizfFm2Yiuu != j) {
            v72 v72Var2 = this.OPXfSBeufaJ8;
            synchronized (s72.TSizfFm2Yiuu) {
                j72.Companion.getClass();
                OPXfSBeufaJ8 = s72.OPXfSBeufaJ8();
                ((v72) s72.r3s1LDPKFs1S(v72Var2, this, OPXfSBeufaJ8, v72Var)).TSizfFm2Yiuu = j;
            }
            s72.cpQdD2nAriOS(OPXfSBeufaJ8, this);
        }
    }

    @Override // defpackage.p92
    public final r92 PxuCJdSBwIXG() {
        return this.OPXfSBeufaJ8;
    }

    @Override // defpackage.p92
    public final void Y1f8riQaR6yg(r92 r92Var) {
        r92Var.getClass();
        this.OPXfSBeufaJ8 = (v72) r92Var;
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
        return Long.valueOf(rtx2ld2ELZv4());
    }

    @Override // defpackage.p92
    public final r92 lS5Rgt96tfkO(r92 r92Var, r92 r92Var2, r92 r92Var3) {
        if (((v72) r92Var2).TSizfFm2Yiuu == ((v72) r92Var3).TSizfFm2Yiuu) {
            return r92Var2;
        }
        return null;
    }

    public final long rtx2ld2ELZv4() {
        return ((v72) s72.RfyTYNmI9Srp(this.OPXfSBeufaJ8, this)).TSizfFm2Yiuu;
    }

    @Override // defpackage.d91
    public final void setValue(Object obj) {
        OPXfSBeufaJ8(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((v72) s72.RAsUl2FVSrh6(this.OPXfSBeufaJ8)).TSizfFm2Yiuu + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(rtx2ld2ELZv4());
    }
}
