package com.stripe.android.core.networking;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.text.Regex;

/* loaded from: classes8.dex */
public abstract class MarkdownParser {
    public static final List markDownToHtmlRegex = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{new Pair(new Regex("\\*\\*(.*?)\\*\\*"), new MarkdownParser$$ExternalSyntheticLambda0(0)), new Pair(new Regex("__([^_]+)__"), new MarkdownParser$$ExternalSyntheticLambda0(2)), new Pair(new Regex("\\[([^]]+)]\\(([^)]+)\\)"), new MarkdownParser$$ExternalSyntheticLambda0(3))});
}
