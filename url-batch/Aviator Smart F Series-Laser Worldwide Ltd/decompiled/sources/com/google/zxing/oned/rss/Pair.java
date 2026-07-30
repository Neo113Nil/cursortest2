package com.google.zxing.oned.rss;

/* loaded from: classes4.dex */
final class Pair extends DataCharacter {
    private int count;
    private final FinderPattern finderPattern;

    Pair(int i8, int i9, FinderPattern finderPattern) {
        super(i8, i9);
        this.finderPattern = finderPattern;
    }

    int getCount() {
        return this.count;
    }

    FinderPattern getFinderPattern() {
        return this.finderPattern;
    }

    void incrementCount() {
        this.count++;
    }
}
