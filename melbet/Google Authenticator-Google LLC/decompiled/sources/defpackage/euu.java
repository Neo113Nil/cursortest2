package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class euu extends euv {
    private volatile long d;

    public euu(String str, String str2, evj evjVar) {
        super(str, str2, evjVar);
    }

    @Override // defpackage.eui
    protected final /* synthetic */ Object b(Object obj) {
        return (Long) obj;
    }

    @Override // defpackage.eui
    protected final /* bridge */ /* synthetic */ Object c(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    @Override // defpackage.eul
    public final /* bridge */ /* synthetic */ Object d() {
        return Long.valueOf(this.d);
    }

    @Override // defpackage.eul
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        this.d = ((Long) obj).longValue();
    }
}
