package io.noties.markwon.core.spans;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.Log;
import android.view.View;
import io.noties.markwon.LinkResolverDef;
import io.noties.markwon.core.MarkwonTheme;

/* loaded from: classes9.dex */
public final class LinkSpan extends URLSpan {
    public final String link;
    public final LinkResolverDef resolver;
    public final MarkwonTheme theme;

    public LinkSpan(MarkwonTheme markwonTheme, String str, LinkResolverDef linkResolverDef) {
        super(str);
        this.theme = markwonTheme;
        this.link = str;
        this.resolver = linkResolverDef;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.resolver.getClass();
        String str = this.link;
        Uri parse = Uri.parse(str);
        if (TextUtils.isEmpty(parse.getScheme())) {
            parse = parse.buildUpon().scheme("https").build();
        }
        Context context = view.getContext();
        Intent intent = new Intent("android.intent.action.VIEW", parse);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Log.w("LinkResolverDef", "Actvity was not found for the link: '" + str + "'");
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        this.theme.getClass();
        textPaint.setUnderlineText(true);
        textPaint.setColor(textPaint.linkColor);
    }
}
