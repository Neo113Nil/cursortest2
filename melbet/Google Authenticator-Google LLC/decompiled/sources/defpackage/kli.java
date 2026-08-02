package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kli implements jxl {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public kli(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.jxl
    public final void a(jxr jxrVar) {
        if (this.b != 0) {
            ((jxk) this.a).j(jxrVar.c());
        } else if (jxrVar.c() != null) {
            ((klj) this.a).a.c = true;
        }
    }
}
