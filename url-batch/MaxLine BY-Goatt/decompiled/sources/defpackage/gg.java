package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gg extends tq0 {
    public final /* synthetic */ ng v;
    public final /* synthetic */ qg w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg(qg qgVar, qg qgVar2, ng ngVar) {
        super(qgVar2);
        this.w = qgVar;
        this.v = ngVar;
    }

    @Override // defpackage.tq0
    public final cl2 b() {
        return this.v;
    }

    @Override // defpackage.tq0
    public final boolean c() {
        qg qgVar = this.w;
        if (qgVar.getInternalPopup().a()) {
            return true;
        }
        qgVar.r.m(qgVar.getTextDirection(), qgVar.getTextAlignment());
        return true;
    }
}
