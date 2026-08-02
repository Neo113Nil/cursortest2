package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class fyt extends dja {
    final /* synthetic */ fyx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fyt(fyx fyxVar) {
        super(null);
        this.a = fyxVar;
    }

    @Override // defpackage.dja
    public final /* bridge */ /* synthetic */ void k(Object obj, int i) {
        fuf fufVar = (fuf) obj;
        fao.c();
        if (i - 1 != 0) {
            return;
        }
        fyx fyxVar = this.a;
        if (fufVar != null) {
            fyxVar.h(fufVar);
            return;
        }
        fuf fufVar2 = fyxVar.g;
        fufVar2.getClass();
        fyxVar.h(fufVar2);
    }
}
