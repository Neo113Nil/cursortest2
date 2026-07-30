package o;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class l implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f6675a;

    public l(m mVar) {
        this.f6675a = mVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [q6.c, r6.l] */
    @Override // o.n0
    public final float a(float f9) {
        if (Float.isNaN(f9)) {
            return 0.0f;
        }
        m mVar = this.f6675a;
        float floatValue = ((Number) mVar.f6685a.f(Float.valueOf(f9))).floatValue();
        mVar.f6689e.setValue(Boolean.valueOf(floatValue > 0.0f));
        mVar.f6690f.setValue(Boolean.valueOf(floatValue < 0.0f));
        return floatValue;
    }
}
