package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class un0 implements Iterable, fu0 {
    public final Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ un0(int i, Object obj) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.rtx2ld2ELZv4;
        Object obj = this.OPXfSBeufaJ8;
        switch (i) {
            case 0:
                return new q30(f2.ZbWwgt3aGe7A((Object[]) ((o5) obj).OPXfSBeufaJ8));
            case 1:
                return new ey((fy) obj);
            default:
                return new ZbWwgt3aGe7A((j60) obj);
        }
    }
}
