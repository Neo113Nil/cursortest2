package org.commonmark.parser.block;

/* loaded from: classes5.dex */
public interface d {
    void addLine(CharSequence charSequence);

    boolean canContain(org.commonmark.node.a aVar);

    boolean canHaveLazyContinuationLines();

    void closeBlock();

    org.commonmark.node.a getBlock();

    boolean isContainer();

    void parseInlines(org.commonmark.parser.a aVar);

    c tryContinue(h hVar);
}
