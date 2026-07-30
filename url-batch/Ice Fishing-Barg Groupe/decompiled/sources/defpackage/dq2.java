package defpackage;

import android.os.Parcel;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class dq2 extends cq2 {
    public int OPXfSBeufaJ8;
    public final int RAsUl2FVSrh6;
    public final SparseIntArray Y1f8riQaR6yg;
    public final int a92UlCVFR9N8;
    public int dgRBjINgWbAK;
    public final Parcel e9gEMXR7LXtO;
    public final String rtx2ld2ELZv4;
    public int wdg6QnbFHrFF;

    public dq2(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new ka(0), new ka(0), new ka(0));
    }

    @Override // defpackage.cq2
    public final dq2 PxuCJdSBwIXG() {
        Parcel parcel = this.e9gEMXR7LXtO;
        int dataPosition = parcel.dataPosition();
        int i = this.wdg6QnbFHrFF;
        if (i == this.a92UlCVFR9N8) {
            i = this.RAsUl2FVSrh6;
        }
        return new dq2(parcel, dataPosition, i, o0.gPXPFXrUH4XX(new StringBuilder(), this.rtx2ld2ELZv4, "  "), this.PxuCJdSBwIXG, this.lS5Rgt96tfkO, this.TSizfFm2Yiuu);
    }

    @Override // defpackage.cq2
    public final boolean e9gEMXR7LXtO(int i) {
        while (true) {
            int i2 = this.wdg6QnbFHrFF;
            int i3 = this.dgRBjINgWbAK;
            if (i2 >= this.RAsUl2FVSrh6) {
                return i3 == i;
            }
            if (i3 == i) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i4 = this.wdg6QnbFHrFF;
            Parcel parcel = this.e9gEMXR7LXtO;
            parcel.setDataPosition(i4);
            int readInt = parcel.readInt();
            this.dgRBjINgWbAK = parcel.readInt();
            this.wdg6QnbFHrFF += readInt;
        }
    }

    @Override // defpackage.cq2
    public final void rtx2ld2ELZv4(int i) {
        int i2 = this.OPXfSBeufaJ8;
        SparseIntArray sparseIntArray = this.Y1f8riQaR6yg;
        Parcel parcel = this.e9gEMXR7LXtO;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.OPXfSBeufaJ8 = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public dq2(Parcel parcel, int i, int i2, String str, ka kaVar, ka kaVar2, ka kaVar3) {
        super(kaVar, kaVar2, kaVar3);
        this.Y1f8riQaR6yg = new SparseIntArray();
        this.OPXfSBeufaJ8 = -1;
        this.dgRBjINgWbAK = -1;
        this.e9gEMXR7LXtO = parcel;
        this.a92UlCVFR9N8 = i;
        this.RAsUl2FVSrh6 = i2;
        this.wdg6QnbFHrFF = i;
        this.rtx2ld2ELZv4 = str;
    }
}
