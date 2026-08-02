package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axj extends ajf {
    @Override // defpackage.ajf
    protected final String a() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }

    @Override // defpackage.ajf
    public final /* bridge */ /* synthetic */ void b(amh amhVar, Object obj) {
        amhVar.i(1, ((axh) obj).a);
        amhVar.g(2, r4.b);
        amhVar.g(3, r4.c);
    }
}
