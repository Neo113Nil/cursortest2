package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class cd2 {
    public final String PxuCJdSBwIXG;
    public final String TSizfFm2Yiuu;
    public final ArrayList Y1f8riQaR6yg;
    public final ArrayList e9gEMXR7LXtO;
    public final String lS5Rgt96tfkO;

    public cd2(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.PxuCJdSBwIXG = str;
        this.lS5Rgt96tfkO = str2;
        this.TSizfFm2Yiuu = str3;
        this.Y1f8riQaR6yg = arrayList;
        this.e9gEMXR7LXtO = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd2)) {
            return false;
        }
        cd2 cd2Var = (cd2) obj;
        if (cs0.wdg6QnbFHrFF(this.PxuCJdSBwIXG, cd2Var.PxuCJdSBwIXG) && cs0.wdg6QnbFHrFF(this.lS5Rgt96tfkO, cd2Var.lS5Rgt96tfkO) && cs0.wdg6QnbFHrFF(this.TSizfFm2Yiuu, cd2Var.TSizfFm2Yiuu) && this.Y1f8riQaR6yg.equals(cd2Var.Y1f8riQaR6yg)) {
            return this.e9gEMXR7LXtO.equals(cd2Var.e9gEMXR7LXtO);
        }
        return false;
    }

    public final int hashCode() {
        return this.e9gEMXR7LXtO.hashCode() + ((this.Y1f8riQaR6yg.hashCode() + ((this.TSizfFm2Yiuu.hashCode() + ((this.lS5Rgt96tfkO.hashCode() + (this.PxuCJdSBwIXG.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return ja2.POWyO8hTM6YC(ja2.zf8DYfih6EZu("\n            |ForeignKey {\n            |   referenceTable = '" + this.PxuCJdSBwIXG + "',\n            |   onDelete = '" + this.lS5Rgt96tfkO + "',\n            |   onUpdate = '" + this.TSizfFm2Yiuu + "',\n            |   columnNames = {" + vi0.nLZGh9p8gVSu(zk.c(this.Y1f8riQaR6yg)) + "\n            |   referenceColumnNames = {" + vi0.xfACYKDMU6Dj(zk.c(this.e9gEMXR7LXtO)) + "\n            |}\n        "));
    }
}
