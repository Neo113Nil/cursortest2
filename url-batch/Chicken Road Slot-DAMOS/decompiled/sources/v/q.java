package v;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface q extends f {
    @Override // v.f
    default b1 a(c6.s sVar) {
        return new com.google.firebase.messaging.v(this);
    }

    float b(long j, float f3, float f10, float f11);

    float c(long j, float f3, float f10, float f11);

    long d(float f3, float f10, float f11);

    default float e(float f3, float f10, float f11) {
        return c(d(f3, f10, f11), f3, f10, f11);
    }
}
