package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class fl implements x32 {
    public final /* synthetic */ int PxuCJdSBwIXG;
    public final /* synthetic */ Object lS5Rgt96tfkO;

    public /* synthetic */ fl(int i, Object obj) {
        this.PxuCJdSBwIXG = i;
        this.lS5Rgt96tfkO = obj;
    }

    @Override // defpackage.x32
    public final Iterator iterator() {
        int i = this.PxuCJdSBwIXG;
        Object obj = this.lS5Rgt96tfkO;
        switch (i) {
            case 0:
                return ((Iterable) obj).iterator();
            case 1:
                return (Iterator) obj;
            default:
                return new s11((String) obj);
        }
    }
}
