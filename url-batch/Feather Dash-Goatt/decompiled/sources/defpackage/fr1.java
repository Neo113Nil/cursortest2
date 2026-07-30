package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class fr1 extends nr1 {
    public final ur1 c;
    public final ng1 d;
    public final /* synthetic */ hr1 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr1(hr1 hr1Var, ng1 ng1Var) {
        super(0);
        this.e = hr1Var;
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.c = new ur1("OnRequestIntegrityTokenCallback");
        this.d = ng1Var;
    }
}
