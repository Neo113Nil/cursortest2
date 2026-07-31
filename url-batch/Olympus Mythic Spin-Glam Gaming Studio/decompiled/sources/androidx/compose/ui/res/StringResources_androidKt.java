package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StringResources.android.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "id", "", "stringResource", "(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "Landroid/content/res/Resources;", "resources", "(Landroidx/compose/runtime/Composer;I)Landroid/content/res/Resources;", "ui_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StringResources_androidKt {
    public static final String stringResource(int i, Composer composer, int i2) {
        String string = resources(composer, 0).getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(id)");
        return string;
    }

    private static final Resources resources(Composer composer, int i) {
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "LocalContext.current.resources");
        return resources;
    }
}
