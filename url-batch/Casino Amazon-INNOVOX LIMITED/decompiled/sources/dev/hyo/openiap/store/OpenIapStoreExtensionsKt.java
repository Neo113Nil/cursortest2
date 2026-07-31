package dev.hyo.openiap.store;

import android.content.Context;
import dev.hyo.openiap.AlternativeBillingMode;
import dev.hyo.openiap.OpenIapModule;
import dev.hyo.openiap.listener.UserChoiceBillingListener;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OpenIapStoreExtensions.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"OpenIapStore", "Ldev/hyo/openiap/store/OpenIapStore;", "context", "Landroid/content/Context;", "alternativeBillingMode", "Ldev/hyo/openiap/AlternativeBillingMode;", "userChoiceBillingListener", "Ldev/hyo/openiap/listener/UserChoiceBillingListener;", "enableAlternativeBilling", "", "openiap_playRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OpenIapStoreExtensionsKt {
    public static /* synthetic */ OpenIapStore OpenIapStore$default(Context context, AlternativeBillingMode alternativeBillingMode, UserChoiceBillingListener userChoiceBillingListener, int i, Object obj) {
        if ((i & 2) != 0) {
            alternativeBillingMode = AlternativeBillingMode.NONE;
        }
        if ((i & 4) != 0) {
            userChoiceBillingListener = null;
        }
        return OpenIapStore(context, alternativeBillingMode, userChoiceBillingListener);
    }

    public static final OpenIapStore OpenIapStore(Context context, AlternativeBillingMode alternativeBillingMode, UserChoiceBillingListener userChoiceBillingListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(alternativeBillingMode, "alternativeBillingMode");
        return new OpenIapStore(new OpenIapModule(context, alternativeBillingMode, userChoiceBillingListener, null, 8, null));
    }

    @Deprecated(message = "Use constructor with AlternativeBillingMode instead", replaceWith = @ReplaceWith(expression = "OpenIapStore(context, if (enableAlternativeBilling) AlternativeBillingMode.ALTERNATIVE_ONLY else AlternativeBillingMode.NONE)", imports = {}))
    public static final OpenIapStore OpenIapStore(Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new OpenIapStore(new OpenIapModule(context, z ? AlternativeBillingMode.ALTERNATIVE_ONLY : AlternativeBillingMode.NONE, null, null, 12, null));
    }
}
