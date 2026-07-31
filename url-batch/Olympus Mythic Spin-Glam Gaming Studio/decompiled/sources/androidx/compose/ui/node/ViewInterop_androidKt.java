package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewInterop.android.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "key", "", "tagKey", "(Ljava/lang/String;)I", "viewAdaptersKey", "I", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewInterop_androidKt {
    private static final int viewAdaptersKey = tagKey("ViewAdapter");

    public static final int tagKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return key.hashCode() | 50331648;
    }
}
