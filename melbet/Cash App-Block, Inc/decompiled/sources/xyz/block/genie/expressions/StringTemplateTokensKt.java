package xyz.block.genie.expressions;

import kotlin.text.Regex;

/* loaded from: classes10.dex */
public abstract class StringTemplateTokensKt {
    public static final Regex FORMAT_STRING_TOKEN_REGEX = new Regex("\\{\\{([^{}]+)\\}\\}");
}
