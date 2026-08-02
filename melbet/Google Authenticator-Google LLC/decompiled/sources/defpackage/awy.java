package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awy extends ajf {
    @Override // defpackage.ajf
    protected final String a() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }

    @Override // defpackage.ajf
    public final /* bridge */ /* synthetic */ void b(amh amhVar, Object obj) {
        brr brrVar = (brr) obj;
        amhVar.i(1, (String) brrVar.a);
        amhVar.i(2, (String) brrVar.b);
    }
}
