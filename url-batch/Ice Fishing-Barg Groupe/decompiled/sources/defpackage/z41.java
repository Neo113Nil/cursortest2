package defpackage;

import java.util.Iterator;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class z41 extends QrzZRwfaDlRX {
    public final Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ z41(int i, Object obj) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
    }

    @Override // defpackage.QrzZRwfaDlRX
    public final int PxuCJdSBwIXG() {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                return ((Matcher) ((e0) obj).OPXfSBeufaJ8).groupCount() + 1;
            default:
                kl1 kl1Var = (kl1) obj;
                kl1Var.getClass();
                return kl1Var.OPXfSBeufaJ8;
        }
    }

    @Override // defpackage.QrzZRwfaDlRX, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                if (obj == null ? true : obj instanceof x41) {
                    return super.contains((x41) obj);
                }
                return false;
            default:
                return ((kl1) this.OPXfSBeufaJ8).containsValue(obj);
        }
    }

    @Override // defpackage.QrzZRwfaDlRX, java.util.Collection
    public boolean isEmpty() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.rtx2ld2ELZv4) {
            case 0:
                return new zk2(new hd2(new fl(0, new br0(0, size() - 1, 1)), new r3s1LDPKFs1S(18, this), 1));
            default:
                tl2 tl2Var = ((kl1) this.OPXfSBeufaJ8).rtx2ld2ELZv4;
                ul2[] ul2VarArr = new ul2[8];
                for (int i = 0; i < 8; i++) {
                    ul2VarArr[i] = new vl2(2);
                }
                return new rl1(tl2Var, ul2VarArr);
        }
    }

    public x41 lS5Rgt96tfkO(int i) {
        Matcher matcher = (Matcher) ((e0) this.OPXfSBeufaJ8).OPXfSBeufaJ8;
        br0 nLZGh9p8gVSu = ng0.nLZGh9p8gVSu(matcher.start(i), matcher.end(i));
        if (nLZGh9p8gVSu.rtx2ld2ELZv4 < 0) {
            return null;
        }
        String group = matcher.group(i);
        group.getClass();
        return new x41(group, nLZGh9p8gVSu);
    }
}
