package v5;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.noties.markwon.core.CoreProps;
import io.noties.markwon.q;
import io.noties.markwon.s;

/* loaded from: classes4.dex */
public class g implements s {
    @Override // io.noties.markwon.s
    @Nullable
    public Object getSpans(@NonNull io.noties.markwon.g gVar, @NonNull q qVar) {
        if (CoreProps.ListItemType.BULLET == CoreProps.LIST_ITEM_TYPE.require(qVar)) {
            return new io.noties.markwon.core.spans.b(gVar.theme(), ((Integer) CoreProps.BULLET_LIST_ITEM_LEVEL.require(qVar)).intValue());
        }
        return new io.noties.markwon.core.spans.h(gVar.theme(), String.valueOf(CoreProps.ORDERED_LIST_ITEM_NUMBER.require(qVar)) + ". ");
    }
}
