package org.commonmark.internal;

import org.commonmark.node.z;

/* loaded from: classes5.dex */
public class e {
    public boolean allowed = true;
    public boolean bracketAfter = false;
    public final boolean image;
    public final int index;
    public final z node;
    public final e previous;
    public final f previousDelimiter;

    private e(z zVar, int i8, e eVar, f fVar, boolean z7) {
        this.node = zVar;
        this.index = i8;
        this.image = z7;
        this.previous = eVar;
        this.previousDelimiter = fVar;
    }

    public static e image(z zVar, int i8, e eVar, f fVar) {
        return new e(zVar, i8, eVar, fVar, true);
    }

    public static e link(z zVar, int i8, e eVar, f fVar) {
        return new e(zVar, i8, eVar, fVar, false);
    }
}
