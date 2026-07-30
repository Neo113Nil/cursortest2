package w2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class h {
    private final boolean isEnabled;
    private final K2.c logLevel;

    /* JADX WARN: Multi-variable type inference failed */
    public h() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public final K2.c getLogLevel() {
        return this.logLevel;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public h(K2.c cVar, boolean z7) {
        this.logLevel = cVar;
        this.isEnabled = z7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ h(K2.c cVar, boolean z7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, (i2 & 2) != 0 ? cVar != null : z7);
        cVar = (i2 & 1) != 0 ? null : cVar;
    }
}
