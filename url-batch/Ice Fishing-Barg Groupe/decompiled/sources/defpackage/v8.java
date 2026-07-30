package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class v8 implements CharSequence {
    public static final t8 Companion = new t8();
    public final String OPXfSBeufaJ8;
    public final ArrayList dgRBjINgWbAK;
    public final List rtx2ld2ELZv4;
    public final ArrayList wdg6QnbFHrFF;

    static {
        cr1 cr1Var = zz1.PxuCJdSBwIXG;
    }

    public v8(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.rtx2ld2ELZv4 = list;
        this.OPXfSBeufaJ8 = str;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                u8 u8Var = (u8) list.get(i);
                Object obj = u8Var.PxuCJdSBwIXG;
                if (obj instanceof q82) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(u8Var);
                } else if (obj instanceof bj1) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(u8Var);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.wdg6QnbFHrFF = arrayList;
        this.dgRBjINgWbAK = arrayList2;
        List d = arrayList2 != null ? zk.d(arrayList2, new db0(5)) : null;
        if (d == null || d.isEmpty()) {
            return;
        }
        int i2 = ((u8) zk.MDTGUQSX7PXD(d)).TSizfFm2Yiuu;
        b81 b81Var = sq0.PxuCJdSBwIXG;
        b81 b81Var2 = new b81(1);
        b81Var2.PxuCJdSBwIXG(i2);
        int size2 = d.size();
        for (int i3 = 1; i3 < size2; i3++) {
            u8 u8Var2 = (u8) d.get(i3);
            while (true) {
                if (b81Var2.lS5Rgt96tfkO != 0) {
                    int TSizfFm2Yiuu = b81Var2.TSizfFm2Yiuu();
                    int i4 = u8Var2.lS5Rgt96tfkO;
                    int i5 = u8Var2.TSizfFm2Yiuu;
                    if (i4 >= TSizfFm2Yiuu) {
                        b81Var2.Y1f8riQaR6yg(b81Var2.lS5Rgt96tfkO - 1);
                    } else if (i5 > TSizfFm2Yiuu) {
                        fp0.PxuCJdSBwIXG("Paragraph overlap not allowed, end " + i5 + " should be less than or equal to " + TSizfFm2Yiuu);
                    }
                }
            }
            b81Var2.PxuCJdSBwIXG(u8Var2.TSizfFm2Yiuu);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0097, code lost:
    
        if (r2.isEmpty() != false) goto L29;
     */
    @Override // java.lang.CharSequence
    /* renamed from: PxuCJdSBwIXG, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v8 subSequence(int i, int i2) {
        ArrayList arrayList;
        if (!(i <= i2)) {
            fp0.PxuCJdSBwIXG("start (" + i + ") should be less or equal to end (" + i2 + ')');
        }
        String str = this.OPXfSBeufaJ8;
        if (i == 0 && i2 == str.length()) {
            return this;
        }
        String substring = str.substring(i, i2);
        v8 v8Var = w8.PxuCJdSBwIXG;
        if (i > i2) {
            fp0.PxuCJdSBwIXG("start (" + i + ") should be less than or equal to end (" + i2 + ')');
        }
        List list = this.rtx2ld2ELZv4;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                u8 u8Var = (u8) list.get(i3);
                int i4 = u8Var.lS5Rgt96tfkO;
                int i5 = u8Var.TSizfFm2Yiuu;
                if (w8.lS5Rgt96tfkO(i, i2, i4, i5)) {
                    arrayList.add(new u8(Math.max(i, u8Var.lS5Rgt96tfkO) - i, Math.min(i2, i5) - i, u8Var.PxuCJdSBwIXG, u8Var.Y1f8riQaR6yg));
                }
            }
        }
        arrayList = null;
        return new v8(arrayList, substring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.OPXfSBeufaJ8.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8)) {
            return false;
        }
        v8 v8Var = (v8) obj;
        return cs0.wdg6QnbFHrFF(this.OPXfSBeufaJ8, v8Var.OPXfSBeufaJ8) && cs0.wdg6QnbFHrFF(this.rtx2ld2ELZv4, v8Var.rtx2ld2ELZv4);
    }

    public final int hashCode() {
        int hashCode = this.OPXfSBeufaJ8.hashCode() * 31;
        List list = this.rtx2ld2ELZv4;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.OPXfSBeufaJ8.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.OPXfSBeufaJ8;
    }

    public /* synthetic */ v8(String str) {
        this(str, p50.rtx2ld2ELZv4);
    }

    public v8(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
