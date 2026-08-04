package androidx.sqlite.driver.bundled;

import dalvik.annotation.optimization.FastNative;
import kotlin.Metadata;

/* compiled from: BundledSQLiteConnection.jvmAndroid.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0083 \u001a\u0019\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0082 \u001a#\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0082 \u001a\u0011\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0083 ¨\u0006\f"}, d2 = {"nativeInTransaction", "", "pointer", "", "nativePrepare", "sql", "", "nativeLoadExtension", "", "fileName", "entryPoint", "nativeClose", "sqlite-bundled"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BundledSQLiteConnectionKt {
    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native void nativeClose(long j);

    /* JADX INFO: Access modifiers changed from: private */
    @FastNative
    public static final native boolean nativeInTransaction(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeLoadExtension(long j, String str, String str2);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native long nativePrepare(long j, String str);
}
