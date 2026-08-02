package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class eus extends euv {
    private volatile double d;

    public eus(String str, evj evjVar) {
        super(str, "45687057", evjVar);
    }

    @Override // defpackage.eui
    protected final /* synthetic */ Object b(Object obj) {
        return (Double) obj;
    }

    @Override // defpackage.eui
    protected final /* bridge */ /* synthetic */ Object c(String str) {
        return Double.valueOf(Double.parseDouble(str));
    }

    @Override // defpackage.eul
    public final /* bridge */ /* synthetic */ Object d() {
        return Double.valueOf(this.d);
    }

    @Override // defpackage.eul
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        this.d = ((Double) obj).doubleValue();
    }
}
