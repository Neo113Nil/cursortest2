package androidx.compose.foundation.text.contextmenu.internal;

import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DefaultTextContextMenuDropdownProvider.android.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
final /* synthetic */ class DefaultTextContextMenuDropdownProvider_androidKt$OpenContextMenu$2$data$2$1 extends FunctionReferenceImpl implements Function0<TextContextMenuData> {
    DefaultTextContextMenuDropdownProvider_androidKt$OpenContextMenu$2$data$2$1(Object obj) {
        super(0, obj, TextContextMenuDataProvider.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final TextContextMenuData invoke() {
        return ((TextContextMenuDataProvider) this.receiver).data();
    }
}
