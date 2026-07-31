package androidx.sqlite.driver.bundled;

import kotlin.Metadata;

/* compiled from: BundledSQLiteStatement.jvmAndroid.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a!\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0082 \u001a!\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tH\u0082 \u001a!\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0082 \u001a!\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\fH\u0082 \u001a\u0019\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 \u001a\u0011\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0082 \u001a\u0019\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 \u001a\u0019\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 \u001a\u0019\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 \u001a\u0019\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 \u001a\u0011\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0082 \u001a\u0019\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 \u001a\u0019\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0082 \u001a\u0011\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0082 \u001a\u0011\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0082 \u001a\u0011\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0082 ¨\u0006\u001a"}, d2 = {"nativeBindBlob", "", "pointer", "", "index", "", "value", "", "nativeBindDouble", "", "nativeBindLong", "nativeBindText", "", "nativeBindNull", "nativeStep", "", "nativeGetBlob", "nativeGetDouble", "nativeGetLong", "nativeGetText", "nativeGetColumnCount", "nativeGetColumnName", "nativeGetColumnType", "nativeReset", "nativeClearBindings", "nativeClose", "sqlite-bundled"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BundledSQLiteStatementKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeBindBlob(long j, int i, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeBindDouble(long j, int i, double d);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeBindLong(long j, int i, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeBindNull(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeBindText(long j, int i, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeClearBindings(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeClose(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native byte[] nativeGetBlob(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int nativeGetColumnCount(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native String nativeGetColumnName(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native int nativeGetColumnType(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native double nativeGetDouble(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long nativeGetLong(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native String nativeGetText(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeReset(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native boolean nativeStep(long j);
}
