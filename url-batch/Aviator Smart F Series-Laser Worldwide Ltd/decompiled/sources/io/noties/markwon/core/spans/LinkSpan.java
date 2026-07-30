package io.noties.markwon.core.spans;

import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class LinkSpan extends URLSpan {
    private final String link;
    private final io.noties.markwon.c resolver;
    private final io.noties.markwon.core.b theme;

    public LinkSpan(@NonNull io.noties.markwon.core.b bVar, @NonNull String str, @NonNull io.noties.markwon.c cVar) {
        super(str);
        this.theme = bVar;
        this.link = str;
        this.resolver = cVar;
    }

    @NonNull
    public String getLink() {
        return this.link;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public void onClick(View view) {
        this.resolver.resolve(view, this.link);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(@NonNull TextPaint textPaint) {
        this.theme.applyLinkStyle(textPaint);
    }
}
