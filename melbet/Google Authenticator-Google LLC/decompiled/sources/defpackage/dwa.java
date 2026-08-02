package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dwa extends kqw {
    /* synthetic */ Object a;
    final /* synthetic */ dwb b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwa(dwb dwbVar, kqj kqjVar) {
        super(kqjVar);
        this.b = dwbVar;
    }

    @Override // defpackage.kqu
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
