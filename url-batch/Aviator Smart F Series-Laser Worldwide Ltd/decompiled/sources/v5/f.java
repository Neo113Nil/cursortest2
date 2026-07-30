package v5;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.noties.markwon.core.CoreProps;
import io.noties.markwon.core.spans.LinkSpan;
import io.noties.markwon.q;
import io.noties.markwon.s;

/* loaded from: classes4.dex */
public class f implements s {
    @Override // io.noties.markwon.s
    @Nullable
    public Object getSpans(@NonNull io.noties.markwon.g gVar, @NonNull q qVar) {
        return new LinkSpan(gVar.theme(), (String) CoreProps.LINK_DESTINATION.require(qVar), gVar.linkResolver());
    }
}
