package androidx.compose.foundation.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.Placeholder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

/* compiled from: InlineTextContent.kt */
@Immutable
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R(\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/foundation/text/InlineTextContent;", "", "Landroidx/compose/ui/text/Placeholder;", "placeholder", "Landroidx/compose/ui/text/Placeholder;", "getPlaceholder", "()Landroidx/compose/ui/text/Placeholder;", "Lkotlin/Function1;", "", "", "Landroidx/compose/runtime/Composable;", "children", "Lkotlin/jvm/functions/Function3;", "getChildren", "()Lkotlin/jvm/functions/Function3;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InlineTextContent {
    private final Function3 children;
    private final Placeholder placeholder;

    public final Placeholder getPlaceholder() {
        return this.placeholder;
    }

    public final Function3 getChildren() {
        return this.children;
    }
}
