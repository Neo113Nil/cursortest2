package org.commonmark.parser.block;

/* loaded from: classes5.dex */
public class c {
    protected c() {
    }

    public static c atColumn(int i8) {
        return new org.commonmark.internal.b(-1, i8, false);
    }

    public static c atIndex(int i8) {
        return new org.commonmark.internal.b(i8, -1, false);
    }

    public static c finished() {
        return new org.commonmark.internal.b(-1, -1, true);
    }

    public static c none() {
        return null;
    }
}
