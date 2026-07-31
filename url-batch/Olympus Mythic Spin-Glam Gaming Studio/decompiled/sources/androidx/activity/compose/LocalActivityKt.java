package androidx.activity.compose;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.runtime.CompositionLocalAccessorScope;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* compiled from: LocalActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001f\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroid/app/Activity;", "LocalActivity", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalActivity", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LocalActivityKt {
    private static final ProvidableCompositionLocal LocalActivity = CompositionLocalKt.compositionLocalWithComputedDefaultOf(new Function1() { // from class: androidx.activity.compose.LocalActivityKt$LocalActivity$1
        @Override // kotlin.jvm.functions.Function1
        public final Activity invoke(CompositionLocalAccessorScope compositionLocalAccessorScope) {
            Context context = (Context) compositionLocalAccessorScope.getCurrentValue(AndroidCompositionLocals_androidKt.getLocalContext());
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    context = null;
                    break;
                }
                if (context instanceof Activity) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            return (Activity) context;
        }
    });
}
