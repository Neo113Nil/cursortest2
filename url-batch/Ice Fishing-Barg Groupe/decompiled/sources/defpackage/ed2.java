package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ed2 {
    public static final dd2 Companion = new dd2();
    public final String PxuCJdSBwIXG;
    public final List TSizfFm2Yiuu;
    public final List Y1f8riQaR6yg;
    public final boolean lS5Rgt96tfkO;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public ed2(String str, boolean z, List list, List list2) {
        str.getClass();
        this.PxuCJdSBwIXG = str;
        this.lS5Rgt96tfkO = z;
        this.TSizfFm2Yiuu = list;
        this.Y1f8riQaR6yg = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.Y1f8riQaR6yg = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ed2) {
            ed2 ed2Var = (ed2) obj;
            String str = ed2Var.PxuCJdSBwIXG;
            if (this.lS5Rgt96tfkO == ed2Var.lS5Rgt96tfkO && this.TSizfFm2Yiuu.equals(ed2Var.TSizfFm2Yiuu) && cs0.wdg6QnbFHrFF(this.Y1f8riQaR6yg, ed2Var.Y1f8riQaR6yg)) {
                String str2 = this.PxuCJdSBwIXG;
                return pa2.yQRudnv4La6p(str2, "index_", false) ? pa2.yQRudnv4La6p(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.PxuCJdSBwIXG;
        return this.Y1f8riQaR6yg.hashCode() + ((this.TSizfFm2Yiuu.hashCode() + ((((pa2.yQRudnv4La6p(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.lS5Rgt96tfkO ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return ja2.POWyO8hTM6YC(ja2.zf8DYfih6EZu("\n            |Index {\n            |   name = '" + this.PxuCJdSBwIXG + "',\n            |   unique = '" + this.lS5Rgt96tfkO + "',\n            |   columns = {" + vi0.nLZGh9p8gVSu(this.TSizfFm2Yiuu) + "\n            |   orders = {" + vi0.xfACYKDMU6Dj(this.Y1f8riQaR6yg) + "\n            |}\n        "));
    }
}
