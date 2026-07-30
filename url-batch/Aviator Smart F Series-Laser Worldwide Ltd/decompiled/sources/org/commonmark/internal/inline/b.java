package org.commonmark.internal.inline;

import org.commonmark.node.i;
import org.commonmark.node.u;
import org.commonmark.node.y;
import org.commonmark.node.z;

/* loaded from: classes5.dex */
public abstract class b implements l7.a {
    private final char delimiterChar;

    protected b(char c8) {
        this.delimiterChar = c8;
    }

    @Override // l7.a
    public char getClosingCharacter() {
        return this.delimiterChar;
    }

    @Override // l7.a
    public int getDelimiterUse(l7.b bVar, l7.b bVar2) {
        if ((bVar.canClose() || bVar2.canOpen()) && bVar2.originalLength() % 3 != 0 && (bVar.originalLength() + bVar2.originalLength()) % 3 == 0) {
            return 0;
        }
        return (bVar.length() < 2 || bVar2.length() < 2) ? 1 : 2;
    }

    @Override // l7.a
    public int getMinLength() {
        return 1;
    }

    @Override // l7.a
    public char getOpeningCharacter() {
        return this.delimiterChar;
    }

    @Override // l7.a
    public void process(z zVar, z zVar2, int i8) {
        u yVar;
        String valueOf = String.valueOf(getOpeningCharacter());
        if (i8 == 1) {
            yVar = new i(valueOf);
        } else {
            yVar = new y(valueOf + valueOf);
        }
        u next = zVar.getNext();
        while (next != null && next != zVar2) {
            u next2 = next.getNext();
            yVar.appendChild(next);
            next = next2;
        }
        zVar.insertAfter(yVar);
    }
}
