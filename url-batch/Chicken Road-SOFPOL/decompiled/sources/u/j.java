package u;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l.r f7026a;

    public j(l.r rVar) {
        this.f7026a = rVar;
    }

    @Override // u.l0
    public final float a(float f6) {
        if (Float.isNaN(f6)) {
            return 0.0f;
        }
        l.r rVar = this.f7026a;
        float floatValue = ((Number) ((p6.c) rVar.f4393a).i(Float.valueOf(f6))).floatValue();
        ((m0.h1) rVar.f4397e).setValue(Boolean.valueOf(floatValue > 0.0f));
        ((m0.h1) rVar.f4398f).setValue(Boolean.valueOf(floatValue < 0.0f));
        return floatValue;
    }
}
