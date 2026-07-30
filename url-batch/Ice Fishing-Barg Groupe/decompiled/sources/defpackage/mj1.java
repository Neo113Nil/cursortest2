package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class mj1 extends q92 implements Parcelable, w72 {
    public final y72 OPXfSBeufaJ8;
    public x72 wdg6QnbFHrFF;
    public static final lj1 Companion = new lj1();
    public static final Parcelable.Creator<mj1> CREATOR = new kj1();

    public mj1(Object obj, y72 y72Var) {
        this.OPXfSBeufaJ8 = y72Var;
        j72 OPXfSBeufaJ8 = s72.OPXfSBeufaJ8();
        x72 x72Var = new x72(OPXfSBeufaJ8.RAsUl2FVSrh6(), obj);
        if (!(OPXfSBeufaJ8 instanceof wg0)) {
            x72Var.lS5Rgt96tfkO = new x72(1L, obj);
        }
        this.wdg6QnbFHrFF = x72Var;
    }

    @Override // defpackage.p92
    public final r92 PxuCJdSBwIXG() {
        return this.wdg6QnbFHrFF;
    }

    @Override // defpackage.p92
    public final void Y1f8riQaR6yg(r92 r92Var) {
        r92Var.getClass();
        this.wdg6QnbFHrFF = (x72) r92Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.w72
    public final y72 e9gEMXR7LXtO() {
        return this.OPXfSBeufaJ8;
    }

    @Override // defpackage.i92
    public final Object getValue() {
        return ((x72) s72.RfyTYNmI9Srp(this.wdg6QnbFHrFF, this)).TSizfFm2Yiuu;
    }

    @Override // defpackage.p92
    public final r92 lS5Rgt96tfkO(r92 r92Var, r92 r92Var2, r92 r92Var3) {
        if (this.OPXfSBeufaJ8.TSizfFm2Yiuu(((x72) r92Var2).TSizfFm2Yiuu, ((x72) r92Var3).TSizfFm2Yiuu)) {
            return r92Var2;
        }
        return null;
    }

    @Override // defpackage.d91
    public final void setValue(Object obj) {
        j72 OPXfSBeufaJ8;
        x72 x72Var = (x72) s72.RAsUl2FVSrh6(this.wdg6QnbFHrFF);
        if (this.OPXfSBeufaJ8.TSizfFm2Yiuu(x72Var.TSizfFm2Yiuu, obj)) {
            return;
        }
        x72 x72Var2 = this.wdg6QnbFHrFF;
        synchronized (s72.TSizfFm2Yiuu) {
            j72.Companion.getClass();
            OPXfSBeufaJ8 = s72.OPXfSBeufaJ8();
            ((x72) s72.r3s1LDPKFs1S(x72Var2, this, OPXfSBeufaJ8, x72Var)).TSizfFm2Yiuu = obj;
        }
        s72.cpQdD2nAriOS(OPXfSBeufaJ8, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((x72) s72.RAsUl2FVSrh6(this.wdg6QnbFHrFF)).TSizfFm2Yiuu + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        ih0 ih0Var = ih0.EcgxDIVH5in8;
        y72 y72Var = this.OPXfSBeufaJ8;
        if (cs0.wdg6QnbFHrFF(y72Var, ih0Var)) {
            i2 = 0;
        } else if (cs0.wdg6QnbFHrFF(y72Var, jx1.S2OOm9zPNm0h)) {
            i2 = 1;
        } else {
            if (!cs0.wdg6QnbFHrFF(y72Var, jx1.S9EYkSpbGuxq)) {
                u9.rtx2ld2ELZv4("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
