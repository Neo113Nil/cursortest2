package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class pk extends IllegalStateException {
    public final String d;

    public pk(String str) {
        this.d = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.d;
    }
}
