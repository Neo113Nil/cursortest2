package org.intellij.markdown.parser.markerblocks;

/* loaded from: classes10.dex */
public final class MarkerBlock$ProcessingResult {
    public final int childrenAction;
    public final int eventAction;
    public final int selfAction;
    public static final MarkerBlock$ProcessingResult PASS = new MarkerBlock$ProcessingResult(4, 4, 1);
    public static final MarkerBlock$ProcessingResult CANCEL = new MarkerBlock$ProcessingResult(4, 4, 2);
    public static final MarkerBlock$ProcessingResult DEFAULT = new MarkerBlock$ProcessingResult(3, 1, 1);

    public MarkerBlock$ProcessingResult(int i, int i2, int i3) {
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            throw null;
        }
        this.childrenAction = i;
        this.selfAction = i2;
        this.eventAction = i3;
    }
}
