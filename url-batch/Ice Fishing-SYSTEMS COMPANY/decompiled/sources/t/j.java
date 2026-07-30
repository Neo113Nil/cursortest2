package t;

/* loaded from: classes.dex */
public final class j extends AbstractC5016g {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ k f40555A;

    public j(k kVar) {
        this.f40555A = kVar;
    }

    @Override // t.AbstractC5016g
    public final String h() {
        h hVar = (h) this.f40555A.f40556n.get();
        if (hVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + hVar.f40551a + "]";
    }
}
