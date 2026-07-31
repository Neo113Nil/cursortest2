package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.Nullable;

/* compiled from: SemanticsProperties.android.kt */
@StabilityInferred
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsPropertiesAndroid;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "TestTagsAsResourceId", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getTestTagsAsResourceId", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "getTestTagsAsResourceId$annotations", "ui_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SemanticsPropertiesAndroid {
    public static final SemanticsPropertiesAndroid INSTANCE = new SemanticsPropertiesAndroid();
    private static final SemanticsPropertyKey TestTagsAsResourceId = new SemanticsPropertyKey("TestTagsAsResourceId", new Function2() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesAndroid$TestTagsAsResourceId$1
        @Nullable
        public final Boolean invoke(@Nullable Boolean bool, boolean z) {
            return bool;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke((Boolean) obj, ((Boolean) obj2).booleanValue());
        }
    });

    private SemanticsPropertiesAndroid() {
    }

    public final SemanticsPropertyKey getTestTagsAsResourceId() {
        return TestTagsAsResourceId;
    }
}
