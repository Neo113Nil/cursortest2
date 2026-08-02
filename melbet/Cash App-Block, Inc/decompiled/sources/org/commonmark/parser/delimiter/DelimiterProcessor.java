package org.commonmark.parser.delimiter;

import org.commonmark.internal.Delimiter;
import org.commonmark.node.Text;

/* loaded from: classes10.dex */
public interface DelimiterProcessor {
    char getClosingCharacter();

    int getDelimiterUse(Delimiter delimiter, Delimiter delimiter2);

    int getMinLength();

    char getOpeningCharacter();

    void process(Text text, Text text2, int i);
}
