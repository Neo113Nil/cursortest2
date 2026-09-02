package U1;

/* loaded from: classes.dex */
public final class h {
    private final boolean isEnabled;
    private final i2.c logLevel;

    /* JADX WARN: Multi-variable type inference failed */
    public h() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public final i2.c getLogLevel() {
        return this.logLevel;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public h(i2.c cVar, boolean z5) {
        this.logLevel = cVar;
        this.isEnabled = z5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ h(i2.c cVar, boolean z5, int i7, kotlin.jvm.internal.e eVar) {
        this(cVar, (i7 & 2) != 0 ? cVar != null : z5);
        cVar = (i7 & 1) != 0 ? null : cVar;
    }
}
