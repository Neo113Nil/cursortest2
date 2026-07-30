package v5;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.noties.markwon.core.CoreProps;
import io.noties.markwon.q;
import io.noties.markwon.s;

/* loaded from: classes4.dex */
public class e implements s {
    @Override // io.noties.markwon.s
    @Nullable
    public Object getSpans(@NonNull io.noties.markwon.g gVar, @NonNull q qVar) {
        return new io.noties.markwon.core.spans.f(gVar.theme(), ((Integer) CoreProps.HEADING_LEVEL.require(qVar)).intValue());
    }
}
