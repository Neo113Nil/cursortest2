package defpackage;

import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final /* synthetic */ class KZw9XyiywG4x implements le0 {
    public final /* synthetic */ Object OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;
    public final /* synthetic */ int wdg6QnbFHrFF;

    public /* synthetic */ KZw9XyiywG4x(int i, Collection collection) {
        this.rtx2ld2ELZv4 = 2;
        this.wdg6QnbFHrFF = i;
        this.OPXfSBeufaJ8 = collection;
    }

    @Override // defpackage.le0
    public final Object OPXfSBeufaJ8(Object obj) {
        int i = this.rtx2ld2ELZv4;
        no2 no2Var = no2.PxuCJdSBwIXG;
        Object obj2 = this.OPXfSBeufaJ8;
        int i2 = this.wdg6QnbFHrFF;
        switch (i) {
            case 0:
                dm1.RAsUl2FVSrh6((dm1) obj, (em1) obj2, 0, -i2);
                return no2Var;
            case 1:
                dm1.RAsUl2FVSrh6((dm1) obj, (em1) obj2, -i2, 0);
                return no2Var;
            default:
                return Boolean.valueOf(((List) obj).addAll(i2, (Collection) obj2));
        }
    }

    public /* synthetic */ KZw9XyiywG4x(int i, int i2, em1 em1Var) {
        this.rtx2ld2ELZv4 = i2;
        this.OPXfSBeufaJ8 = em1Var;
        this.wdg6QnbFHrFF = i;
    }
}
