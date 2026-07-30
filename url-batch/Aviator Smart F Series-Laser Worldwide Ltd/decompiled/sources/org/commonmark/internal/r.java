package org.commonmark.internal;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import org.commonmark.node.z;

/* loaded from: classes5.dex */
class r implements l7.a {
    private final char delim;
    private int minLength = 0;
    private LinkedList<l7.a> processors = new LinkedList<>();

    r(char c8) {
        this.delim = c8;
    }

    private l7.a findProcessor(int i8) {
        Iterator<l7.a> it = this.processors.iterator();
        while (it.hasNext()) {
            l7.a next = it.next();
            if (next.getMinLength() <= i8) {
                return next;
            }
        }
        return this.processors.getFirst();
    }

    void add(l7.a aVar) {
        int minLength = aVar.getMinLength();
        ListIterator<l7.a> listIterator = this.processors.listIterator();
        while (listIterator.hasNext()) {
            int minLength2 = listIterator.next().getMinLength();
            if (minLength > minLength2) {
                listIterator.previous();
                listIterator.add(aVar);
                return;
            } else if (minLength == minLength2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.delim + "' and minimum length " + minLength);
            }
        }
        this.processors.add(aVar);
        this.minLength = minLength;
    }

    @Override // l7.a
    public char getClosingCharacter() {
        return this.delim;
    }

    @Override // l7.a
    public int getDelimiterUse(l7.b bVar, l7.b bVar2) {
        return findProcessor(bVar.length()).getDelimiterUse(bVar, bVar2);
    }

    @Override // l7.a
    public int getMinLength() {
        return this.minLength;
    }

    @Override // l7.a
    public char getOpeningCharacter() {
        return this.delim;
    }

    @Override // l7.a
    public void process(z zVar, z zVar2, int i8) {
        findProcessor(i8).process(zVar, zVar2, i8);
    }
}
