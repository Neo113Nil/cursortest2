package F2;

/* loaded from: classes.dex */
public enum d {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO("video"),
    /* JADX INFO: Fake field, exist only in values array */
    AUDIO("audio");


    /* renamed from: a, reason: collision with root package name */
    public final String f766a;

    d(String str) {
        this.f766a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f766a;
    }
}
