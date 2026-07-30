package org.commonmark.parser.block;

/* loaded from: classes5.dex */
public abstract class f {
    protected f() {
    }

    public static f none() {
        return null;
    }

    public static f of(d... dVarArr) {
        return new org.commonmark.internal.d(dVarArr);
    }

    public abstract f atColumn(int i8);

    public abstract f atIndex(int i8);

    public abstract f replaceActiveBlockParser();
}
