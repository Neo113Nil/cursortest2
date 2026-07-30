package com.google.common.html;

import cn.hutool.core.util.i1;
import com.google.common.annotations.GwtCompatible;
import com.google.common.escape.Escaper;
import com.google.common.escape.Escapers;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class HtmlEscapers {
    private static final Escaper HTML_ESCAPER = Escapers.builder().addEscape('\"', i1.QUOTE).addEscape('\'', "&#39;").addEscape('&', i1.AMP).addEscape('<', i1.LT).addEscape('>', i1.GT).build();

    private HtmlEscapers() {
    }

    public static Escaper htmlEscaper() {
        return HTML_ESCAPER;
    }
}
