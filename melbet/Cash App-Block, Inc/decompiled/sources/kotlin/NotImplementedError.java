package kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/NotImplementedError;", "Ljava/lang/Error;", "Lkotlin/Error;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NotImplementedError extends Error {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NotImplementedError(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        super(str);
        str = (i & 1) != 0 ? "An operation is not implemented." : str;
        str.getClass();
    }

    public NotImplementedError() {
        this(null, 1, null);
    }
}
