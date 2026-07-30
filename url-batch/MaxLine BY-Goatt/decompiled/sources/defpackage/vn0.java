package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class vn0 extends o81 implements xt0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ int[] n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vn0(int[] iArr, int i) {
        super(3);
        this.m = i;
        this.n = iArr;
    }

    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        int i = this.m;
        int[] iArr = this.n;
        switch (i) {
            case 0:
                int intValue = ((Number) obj2).intValue();
                ((Number) obj3).intValue();
                return Integer.valueOf(iArr[intValue]);
            default:
                int intValue2 = ((Number) obj2).intValue();
                ((Number) obj3).intValue();
                return Integer.valueOf(iArr[intValue2]);
        }
    }
}
