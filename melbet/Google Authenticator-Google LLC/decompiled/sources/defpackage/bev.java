package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bev extends bme {
    public bdj a;

    @Override // defpackage.bme
    protected final /* bridge */ /* synthetic */ int a(Object obj) {
        bdv bdvVar = (bdv) obj;
        if (bdvVar == null) {
            return 1;
        }
        return bdvVar.a();
    }

    public final /* bridge */ /* synthetic */ bdv b(bbh bbhVar) {
        return (bdv) super.h(bbhVar);
    }

    @Override // defpackage.bme
    protected final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        bdv bdvVar = (bdv) obj2;
        bdj bdjVar = this.a;
        if (bdjVar == null || bdvVar == null) {
            return;
        }
        bdjVar.d.b(bdvVar, true);
    }

    public final /* bridge */ /* synthetic */ void d(bbh bbhVar, bdv bdvVar) {
    }
}
