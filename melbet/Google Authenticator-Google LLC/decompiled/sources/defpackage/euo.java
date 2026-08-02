package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
class euo extends euv {
    private volatile boolean d;

    public euo(String str, String str2, evj evjVar) {
        super(str, str2, evjVar);
    }

    @Override // defpackage.eui
    protected final /* synthetic */ Object b(Object obj) {
        return (Boolean) obj;
    }

    @Override // defpackage.eui
    protected final /* bridge */ /* synthetic */ Object c(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    @Override // defpackage.eul
    public final /* bridge */ /* synthetic */ Object d() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.eul
    public final /* bridge */ /* synthetic */ void g(Object obj) {
        this.d = ((Boolean) obj).booleanValue();
    }
}
