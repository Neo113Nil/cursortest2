package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hcb extends hce {
    final /* synthetic */ hci a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcb(hci hciVar) {
        super(hciVar);
        this.a = hciVar;
    }

    @Override // defpackage.hce
    public final /* bridge */ /* synthetic */ Object a(int i) {
        return new hcg(this.a, i);
    }
}
