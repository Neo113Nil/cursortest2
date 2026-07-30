package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class cf0 extends dr2 {
    public final l92 OPXfSBeufaJ8;
    public final l92 RAsUl2FVSrh6;
    public final l92 TSizfFm2Yiuu;
    public final l92 Y1f8riQaR6yg;
    public final l92 a92UlCVFR9N8;
    public final l92 dgRBjINgWbAK;
    public final l92 e9gEMXR7LXtO;
    public final l92 lS5Rgt96tfkO;
    public final l92 rtx2ld2ELZv4;
    public final l92 wdg6QnbFHrFF;
    public final List x50lh2ztY7Y5;

    public cf0() {
        ArrayList arrayList = new ArrayList(9);
        for (int i = 0; i < 9; i++) {
            arrayList.add("");
        }
        l92 RAsUl2FVSrh6 = hq0.RAsUl2FVSrh6(arrayList);
        this.lS5Rgt96tfkO = RAsUl2FVSrh6;
        this.TSizfFm2Yiuu = RAsUl2FVSrh6;
        l92 RAsUl2FVSrh62 = hq0.RAsUl2FVSrh6("X");
        this.Y1f8riQaR6yg = RAsUl2FVSrh62;
        this.e9gEMXR7LXtO = RAsUl2FVSrh62;
        l92 RAsUl2FVSrh63 = hq0.RAsUl2FVSrh6("");
        this.a92UlCVFR9N8 = RAsUl2FVSrh63;
        this.RAsUl2FVSrh6 = RAsUl2FVSrh63;
        l92 RAsUl2FVSrh64 = hq0.RAsUl2FVSrh6(Boolean.FALSE);
        this.rtx2ld2ELZv4 = RAsUl2FVSrh64;
        this.OPXfSBeufaJ8 = RAsUl2FVSrh64;
        l92 RAsUl2FVSrh65 = hq0.RAsUl2FVSrh6(p50.rtx2ld2ELZv4);
        this.wdg6QnbFHrFF = RAsUl2FVSrh65;
        this.dgRBjINgWbAK = RAsUl2FVSrh65;
        this.x50lh2ztY7Y5 = fx1.D0aTLcX6Uhyo(fx1.D0aTLcX6Uhyo(0, 1, 2), fx1.D0aTLcX6Uhyo(3, 4, 5), fx1.D0aTLcX6Uhyo(6, 7, 8), fx1.D0aTLcX6Uhyo(0, 3, 6), fx1.D0aTLcX6Uhyo(1, 4, 7), fx1.D0aTLcX6Uhyo(2, 5, 8), fx1.D0aTLcX6Uhyo(0, 4, 8), fx1.D0aTLcX6Uhyo(2, 4, 6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a2, code lost:
    
        if (r8.isEmpty() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a5, code lost:
    
        r7 = r8.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        if (r9 >= r7) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        r10 = r8.get(r9);
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b7, code lost:
    
        if (defpackage.cs0.wdg6QnbFHrFF((java.lang.String) r10, "O") != false) goto L62;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e9gEMXR7LXtO(int i) {
        Object obj;
        l92 l92Var = this.rtx2ld2ELZv4;
        if (((Boolean) l92Var.getValue()).booleanValue()) {
            return;
        }
        l92 l92Var2 = this.lS5Rgt96tfkO;
        if (((CharSequence) ((List) l92Var2.getValue()).get(i)).length() > 0) {
            return;
        }
        ArrayList j = zk.j((Collection) l92Var2.getValue());
        l92 l92Var3 = this.Y1f8riQaR6yg;
        j.set(i, l92Var3.getValue());
        bt btVar = null;
        l92Var2.OPXfSBeufaJ8(null, j);
        Iterator it = this.x50lh2ztY7Y5.iterator();
        loop0: while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(al.KZw9XyiywG4x(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add((String) ((List) l92Var2.getValue()).get(((Number) it2.next()).intValue()));
            }
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        break loop0;
                    }
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    if (!cs0.wdg6QnbFHrFF((String) obj2, "X")) {
                        break;
                    }
                }
            } else {
                break;
            }
        }
        List list2 = (List) obj;
        if (list2 != null) {
            l92 l92Var4 = this.wdg6QnbFHrFF;
            l92Var4.getClass();
            l92Var4.OPXfSBeufaJ8(null, list2);
            this.a92UlCVFR9N8.rtx2ld2ELZv4(l92Var3.getValue());
            l92Var.OPXfSBeufaJ8(null, Boolean.TRUE);
            return;
        }
        Iterable iterable = (Iterable) l92Var2.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it3 = iterable.iterator();
            while (it3.hasNext()) {
                if (((String) it3.next()).length() == 0) {
                    l92Var3.OPXfSBeufaJ8(null, cs0.wdg6QnbFHrFF(l92Var3.getValue(), "X") ? "O" : "X");
                    if (cs0.wdg6QnbFHrFF(l92Var3.getValue(), "O")) {
                        fx1.KUoIVIumpKat(fx1.nxJAScVArhE9(this), null, new ew(this, btVar, 4), 3);
                        return;
                    }
                    return;
                }
            }
        }
        l92Var.OPXfSBeufaJ8(null, Boolean.TRUE);
    }
}
