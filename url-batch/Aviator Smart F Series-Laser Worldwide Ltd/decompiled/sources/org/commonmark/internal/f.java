package org.commonmark.internal;

import org.commonmark.node.z;

/* loaded from: classes5.dex */
public class f implements l7.b {
    public final boolean canClose;
    public final boolean canOpen;
    public final char delimiterChar;
    public f next;
    public final z node;
    public f previous;
    public int length = 1;
    public int originalLength = 1;

    public f(z zVar, char c8, boolean z7, boolean z8, f fVar) {
        this.node = zVar;
        this.delimiterChar = c8;
        this.canOpen = z7;
        this.canClose = z8;
        this.previous = fVar;
    }

    @Override // l7.b
    public boolean canClose() {
        return this.canClose;
    }

    @Override // l7.b
    public boolean canOpen() {
        return this.canOpen;
    }

    @Override // l7.b
    public int length() {
        return this.length;
    }

    @Override // l7.b
    public int originalLength() {
        return this.originalLength;
    }
}
