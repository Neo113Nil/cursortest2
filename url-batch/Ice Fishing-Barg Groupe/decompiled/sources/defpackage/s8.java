package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class s8 implements Appendable {
    public final ArrayList OPXfSBeufaJ8;
    public final StringBuilder rtx2ld2ELZv4 = new StringBuilder(16);

    public s8(v8 v8Var) {
        new ArrayList();
        this.OPXfSBeufaJ8 = new ArrayList();
        new ArrayList();
        PxuCJdSBwIXG(v8Var);
    }

    public final void PxuCJdSBwIXG(v8 v8Var) {
        StringBuilder sb = this.rtx2ld2ELZv4;
        int length = sb.length();
        sb.append(v8Var.OPXfSBeufaJ8);
        List list = v8Var.rtx2ld2ELZv4;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                u8 u8Var = (u8) list.get(i);
                this.OPXfSBeufaJ8.add(new r8(u8Var.lS5Rgt96tfkO + length, u8Var.TSizfFm2Yiuu + length, u8Var.PxuCJdSBwIXG, u8Var.Y1f8riQaR6yg));
            }
        }
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        boolean z = charSequence instanceof v8;
        StringBuilder sb = this.rtx2ld2ELZv4;
        if (!z) {
            sb.append(charSequence, i, i2);
            return this;
        }
        v8 v8Var = (v8) charSequence;
        int length = sb.length();
        sb.append((CharSequence) v8Var.OPXfSBeufaJ8, i, i2);
        List PxuCJdSBwIXG = w8.PxuCJdSBwIXG(v8Var, i, i2, null);
        if (PxuCJdSBwIXG != null) {
            int size = PxuCJdSBwIXG.size();
            for (int i3 = 0; i3 < size; i3++) {
                u8 u8Var = (u8) PxuCJdSBwIXG.get(i3);
                this.OPXfSBeufaJ8.add(new r8(u8Var.lS5Rgt96tfkO + length, u8Var.TSizfFm2Yiuu + length, u8Var.PxuCJdSBwIXG, u8Var.Y1f8riQaR6yg));
            }
        }
        return this;
    }

    public final v8 lS5Rgt96tfkO() {
        StringBuilder sb = this.rtx2ld2ELZv4;
        String sb2 = sb.toString();
        ArrayList arrayList = this.OPXfSBeufaJ8;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            r8 r8Var = (r8) arrayList.get(i);
            int length = sb.length();
            int i2 = r8Var.TSizfFm2Yiuu;
            if (i2 != Integer.MIN_VALUE) {
                length = i2;
            }
            if (length == Integer.MIN_VALUE) {
                fp0.lS5Rgt96tfkO("Item.end should be set first");
            }
            arrayList2.add(new u8(r8Var.lS5Rgt96tfkO, length, r8Var.PxuCJdSBwIXG, r8Var.Y1f8riQaR6yg));
        }
        return new v8(sb2, arrayList2);
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence instanceof v8) {
            PxuCJdSBwIXG((v8) charSequence);
            return this;
        }
        this.rtx2ld2ELZv4.append(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.rtx2ld2ELZv4.append(c);
        return this;
    }
}
