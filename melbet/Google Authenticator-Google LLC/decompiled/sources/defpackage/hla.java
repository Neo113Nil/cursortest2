package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hla extends hld {
    final /* synthetic */ hld a;
    final /* synthetic */ hld b;

    public hla(hld hldVar, hld hldVar2) {
        this.a = hldVar;
        this.b = hldVar2;
    }

    @Override // defpackage.hld
    public final void a() {
        try {
            this.a.a();
        } finally {
            this.b.a();
        }
    }
}
