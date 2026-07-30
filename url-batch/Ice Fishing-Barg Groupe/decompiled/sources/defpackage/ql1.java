package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class ql1 extends zf8DYfih6EZu {
    public final kl1 OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ ql1(kl1 kl1Var, int i) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = kl1Var;
    }

    @Override // defpackage.QrzZRwfaDlRX
    public final int PxuCJdSBwIXG() {
        int i = this.rtx2ld2ELZv4;
        kl1 kl1Var = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                kl1Var.getClass();
                break;
            default:
                kl1Var.getClass();
                break;
        }
        return kl1Var.OPXfSBeufaJ8;
    }

    @Override // defpackage.QrzZRwfaDlRX, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.rtx2ld2ELZv4;
        kl1 kl1Var = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = kl1Var.get(entry.getKey());
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && kl1Var.containsKey(entry.getKey());
            default:
                return kl1Var.containsKey(obj);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                tl2 tl2Var = this.OPXfSBeufaJ8.rtx2ld2ELZv4;
                ul2[] ul2VarArr = new ul2[8];
                for (int i = 0; i < 8; i++) {
                    ul2VarArr[i] = new vl2(0);
                }
                return new rl1(tl2Var, ul2VarArr);
            default:
                tl2 tl2Var2 = this.OPXfSBeufaJ8.rtx2ld2ELZv4;
                ul2[] ul2VarArr2 = new ul2[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    ul2VarArr2[i2] = new vl2(1);
                }
                return new rl1(tl2Var2, ul2VarArr2);
        }
    }
}
