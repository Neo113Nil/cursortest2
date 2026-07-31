package gbcorp.c312.merkmarker.info.data;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: SharedPreferencesExt.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0000\u001a\u000f\u0012\u000b\u0012\t\u0018\u00010\u0002¢\u0006\u0002\b\u00030\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¨\u0006\u0007"}, d2 = {"observeStringValue", "Lkotlinx/coroutines/flow/Flow;", "", "Lkotlin/jvm/internal/EnhancedNullability;", "Landroid/content/SharedPreferences;", "key", "default", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SharedPreferencesExtKt {
    public static final Flow<String> observeStringValue(SharedPreferences sharedPreferences, String key, String str) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return FlowKt.callbackFlow(new SharedPreferencesExtKt$observeStringValue$1(sharedPreferences, key, str, null));
    }

    public static /* synthetic */ Flow observeStringValue$default(SharedPreferences sharedPreferences, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return observeStringValue(sharedPreferences, str, str2);
    }
}
