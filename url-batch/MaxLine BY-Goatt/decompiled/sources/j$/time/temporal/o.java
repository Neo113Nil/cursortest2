package j$.time.temporal;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes2.dex */
public final /* synthetic */ class o implements n {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ o(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // j$.time.temporal.n
    public final m c(m mVar) {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                int e = mVar.e(a.DAY_OF_WEEK);
                if (e == i2) {
                    return mVar;
                }
                return mVar.l(e - i2 >= 0 ? 7 - r0 : -r0, b.DAYS);
            default:
                int e2 = mVar.e(a.DAY_OF_WEEK);
                if (e2 == i2) {
                    return mVar;
                }
                return mVar.a(i2 - e2 >= 0 ? 7 - r2 : -r2, b.DAYS);
        }
    }
}
