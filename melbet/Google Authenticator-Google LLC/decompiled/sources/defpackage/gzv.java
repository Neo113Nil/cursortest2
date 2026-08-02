package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gzv extends gyg {
    final /* synthetic */ gyv g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzv(gzz gzzVar, CharSequence charSequence, gyv gyvVar) {
        super(gzzVar, charSequence);
        this.g = gyvVar;
    }

    @Override // defpackage.gyg
    public final int a(int i) {
        return i + 1;
    }

    @Override // defpackage.gyg
    public final int b(int i) {
        return this.g.i(this.b, i);
    }
}
