package kotlinx.coroutines.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class j0 {
    public static final boolean systemProp(String str, boolean z7) {
        String systemProp = h0.systemProp(str);
        return systemProp != null ? Boolean.parseBoolean(systemProp) : z7;
    }

    public static /* synthetic */ int systemProp$default(String str, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i9 = 1;
        }
        if ((i11 & 8) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return h0.systemProp(str, i8, i9, i10);
    }

    public static final int systemProp(String str, int i8, int i9, int i10) {
        return (int) h0.systemProp(str, i8, i9, i10);
    }

    public static /* synthetic */ long systemProp$default(String str, long j8, long j9, long j10, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            j9 = 1;
        }
        long j11 = j9;
        if ((i8 & 8) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return h0.systemProp(str, j8, j11, j10);
    }

    public static final long systemProp(String str, long j8, long j9, long j10) {
        Long longOrNull;
        String systemProp = h0.systemProp(str);
        if (systemProp == null) {
            return j8;
        }
        longOrNull = kotlin.text.s.toLongOrNull(systemProp);
        if (longOrNull == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + systemProp + '\'').toString());
        }
        long longValue = longOrNull.longValue();
        if (j9 <= longValue && longValue <= j10) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j9 + ".." + j10 + ", but is '" + longValue + '\'').toString());
    }

    public static final String systemProp(String str, String str2) {
        String systemProp = h0.systemProp(str);
        return systemProp == null ? str2 : systemProp;
    }
}
