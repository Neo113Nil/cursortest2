package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axn extends ajf {
    @Override // defpackage.ajf
    protected final String a() {
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
    }

    @Override // defpackage.ajf
    public final /* bridge */ /* synthetic */ void b(amh amhVar, Object obj) {
        brr brrVar = (brr) obj;
        amhVar.i(1, (String) brrVar.b);
        amhVar.i(2, (String) brrVar.a);
    }
}
