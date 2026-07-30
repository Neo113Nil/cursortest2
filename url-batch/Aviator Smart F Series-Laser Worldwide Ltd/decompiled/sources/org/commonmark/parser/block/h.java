package org.commonmark.parser.block;

/* loaded from: classes5.dex */
public interface h {
    d getActiveBlockParser();

    int getColumn();

    int getIndent();

    int getIndex();

    CharSequence getLine();

    int getNextNonSpaceIndex();

    boolean isBlank();
}
