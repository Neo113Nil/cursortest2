package org.intellij.markdown.flavours.gfm;

import org.intellij.markdown.MarkdownElementType;

/* loaded from: classes10.dex */
public abstract class GFMTokenTypes {
    public static final MarkdownElementType TILDE = new MarkdownElementType("~", true, 0);
    public static final MarkdownElementType TABLE_SEPARATOR = new MarkdownElementType("TABLE_SEPARATOR", true, 0);
    public static final MarkdownElementType GFM_AUTOLINK = new MarkdownElementType("GFM_AUTOLINK", true, 0);
    public static final MarkdownElementType CHECK_BOX = new MarkdownElementType("CHECK_BOX", true, 0);
    public static final MarkdownElementType CELL = new MarkdownElementType("CELL", true, 0);
    public static final MarkdownElementType DOLLAR = new MarkdownElementType("DOLLAR", true, 0);
}
