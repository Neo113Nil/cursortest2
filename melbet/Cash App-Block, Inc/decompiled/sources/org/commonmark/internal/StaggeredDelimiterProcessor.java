package org.commonmark.internal;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import org.commonmark.node.Text;
import org.commonmark.parser.delimiter.DelimiterProcessor;

/* loaded from: classes10.dex */
public final class StaggeredDelimiterProcessor implements DelimiterProcessor {
    public final char delim;
    public int minLength = 0;
    public final LinkedList processors = new LinkedList();

    public StaggeredDelimiterProcessor(char c) {
        this.delim = c;
    }

    public final void add(DelimiterProcessor delimiterProcessor) {
        int minLength = delimiterProcessor.getMinLength();
        LinkedList linkedList = this.processors;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int minLength2 = ((DelimiterProcessor) listIterator.next()).getMinLength();
            if (minLength > minLength2) {
                listIterator.previous();
                listIterator.add(delimiterProcessor);
                return;
            } else if (minLength == minLength2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.delim + "' and minimum length " + minLength);
            }
        }
        linkedList.add(delimiterProcessor);
        this.minLength = minLength;
    }

    @Override // org.commonmark.parser.delimiter.DelimiterProcessor
    public final char getClosingCharacter() {
        return this.delim;
    }

    @Override // org.commonmark.parser.delimiter.DelimiterProcessor
    public final int getDelimiterUse(Delimiter delimiter, Delimiter delimiter2) {
        DelimiterProcessor delimiterProcessor;
        int i = delimiter.length;
        LinkedList linkedList = this.processors;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                delimiterProcessor = (DelimiterProcessor) linkedList.getFirst();
                break;
            }
            delimiterProcessor = (DelimiterProcessor) it.next();
            if (delimiterProcessor.getMinLength() <= i) {
                break;
            }
        }
        return delimiterProcessor.getDelimiterUse(delimiter, delimiter2);
    }

    @Override // org.commonmark.parser.delimiter.DelimiterProcessor
    public final int getMinLength() {
        return this.minLength;
    }

    @Override // org.commonmark.parser.delimiter.DelimiterProcessor
    public final char getOpeningCharacter() {
        return this.delim;
    }

    @Override // org.commonmark.parser.delimiter.DelimiterProcessor
    public final void process(Text text, Text text2, int i) {
        DelimiterProcessor delimiterProcessor;
        LinkedList linkedList = this.processors;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                delimiterProcessor = (DelimiterProcessor) linkedList.getFirst();
                break;
            } else {
                delimiterProcessor = (DelimiterProcessor) it.next();
                if (delimiterProcessor.getMinLength() <= i) {
                    break;
                }
            }
        }
        delimiterProcessor.process(text, text2, i);
    }
}
