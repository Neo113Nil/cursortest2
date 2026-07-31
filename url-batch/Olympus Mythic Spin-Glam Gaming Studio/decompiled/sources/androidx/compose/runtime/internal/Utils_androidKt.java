package androidx.compose.runtime.internal;

import android.util.Log;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import kotlin.Metadata;

/* compiled from: Utils.android.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "message", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "", "logError", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Utils_androidKt {
    public static final void logError(String str, Throwable th) {
        Log.e("ComposeInternal", str, th);
    }
}
