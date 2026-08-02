package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kfm implements kfo {
    private final /* synthetic */ int a;

    public kfm(int i) {
        this.a = i;
    }

    @Override // defpackage.kfp
    public final /* synthetic */ int a(kkb kkbVar, int i, Object obj, int i2) {
        int i3 = this.a;
        if (i3 == 0) {
            kkbVar.k(i);
            return 0;
        }
        if (i3 != 1) {
            kkbVar.j((byte[]) obj, i2, i);
            return i2 + i;
        }
        return kkbVar.e();
    }
}
