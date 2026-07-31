package androidx.compose.ui.platform;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidUriHandler.android.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/AndroidUriHandler;", "Landroidx/compose/ui/platform/UriHandler;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/content/Context;", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AndroidUriHandler implements UriHandler {
    private final Context context;

    public AndroidUriHandler(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }
}
