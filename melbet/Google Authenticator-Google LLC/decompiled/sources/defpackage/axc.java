package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axc extends ajf {
    @Override // defpackage.ajf
    protected final String a() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }

    @Override // defpackage.ajf
    public final /* bridge */ /* synthetic */ void b(amh amhVar, Object obj) {
        axa axaVar = (axa) obj;
        amhVar.i(1, axaVar.a);
        amhVar.g(2, axaVar.b.longValue());
    }
}
