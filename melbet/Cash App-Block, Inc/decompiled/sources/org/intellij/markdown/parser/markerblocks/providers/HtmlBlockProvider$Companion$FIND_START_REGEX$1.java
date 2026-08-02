package org.intellij.markdown.parser.markerblocks.providers;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;

/* loaded from: classes9.dex */
public final class HtmlBlockProvider$Companion$FIND_START_REGEX$1 extends Lambda implements Function1 {
    public static final HtmlBlockProvider$Companion$FIND_START_REGEX$1 INSTANCE = new HtmlBlockProvider$Companion$FIND_START_REGEX$1(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Pair pair = (Pair) obj;
        pair.getClass();
        StringBuilder sb = new StringBuilder("(");
        String pattern = ((Regex) pair.first).nativePattern.pattern();
        pattern.getClass();
        sb.append(pattern);
        sb.append(')');
        return sb.toString();
    }
}
