package org.intellij.markdown.parser;

import com.knotapi.knot.utilities.Constants;
import kotlin.ranges.IntRange;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;

/* loaded from: classes10.dex */
public final class TreeBuilder$MyEvent implements Comparable {
    public final SequentialParser.Node info;
    public final int position;
    public final int timeClosed;

    public TreeBuilder$MyEvent(int i, int i2, SequentialParser.Node node) {
        this.position = i;
        this.timeClosed = i2;
        this.info = node;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        TreeBuilder$MyEvent treeBuilder$MyEvent = (TreeBuilder$MyEvent) obj;
        treeBuilder$MyEvent.getClass();
        int i = treeBuilder$MyEvent.position;
        int i2 = this.position;
        if (i2 != i) {
            return i2 - i;
        }
        if (isStart() != treeBuilder$MyEvent.isStart()) {
            return isStart() ? 1 : -1;
        }
        IntRange intRange = this.info.range;
        int i3 = intRange.first;
        int i4 = intRange.last;
        IntRange intRange2 = treeBuilder$MyEvent.info.range;
        int i5 = intRange2.first;
        int i6 = intRange2.last;
        int i7 = (i3 + i4) - (i5 + i6);
        if (i7 != 0) {
            return (i3 == i4 || i5 == i6) ? i7 : -i7;
        }
        int i8 = this.timeClosed - treeBuilder$MyEvent.timeClosed;
        return isStart() ? -i8 : i8;
    }

    public final boolean isStart() {
        return this.info.range.last != this.position;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(isStart() ? "Open" : Constants.META_CLOSE);
        sb.append(": ");
        sb.append(this.position);
        sb.append(" (");
        sb.append(this.info);
        sb.append(')');
        return sb.toString();
    }
}
