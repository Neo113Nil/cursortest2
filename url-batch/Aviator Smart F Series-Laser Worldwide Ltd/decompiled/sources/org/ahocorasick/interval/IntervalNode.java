package org.ahocorasick.interval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public class IntervalNode {
    private List<c> intervals = new ArrayList();
    private IntervalNode left;
    private int point;
    private IntervalNode right;

    private enum Direction {
        LEFT,
        RIGHT
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$org$ahocorasick$interval$IntervalNode$Direction;

        static {
            int[] iArr = new int[Direction.values().length];
            $SwitchMap$org$ahocorasick$interval$IntervalNode$Direction = iArr;
            try {
                iArr[Direction.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$ahocorasick$interval$IntervalNode$Direction[Direction.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public IntervalNode(List<c> list) {
        this.left = null;
        this.right = null;
        this.point = determineMedian(list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (c cVar : list) {
            if (cVar.getEnd() < this.point) {
                arrayList.add(cVar);
            } else if (cVar.getStart() > this.point) {
                arrayList2.add(cVar);
            } else {
                this.intervals.add(cVar);
            }
        }
        if (arrayList.size() > 0) {
            this.left = new IntervalNode(arrayList);
        }
        if (arrayList2.size() > 0) {
            this.right = new IntervalNode(arrayList2);
        }
    }

    protected void addToOverlaps(c cVar, List<c> list, List<c> list2) {
        for (c cVar2 : list2) {
            if (!cVar2.equals(cVar)) {
                list.add(cVar2);
            }
        }
    }

    protected List<c> checkForOverlaps(c cVar, Direction direction) {
        ArrayList arrayList = new ArrayList();
        for (c cVar2 : this.intervals) {
            int i8 = a.$SwitchMap$org$ahocorasick$interval$IntervalNode$Direction[direction.ordinal()];
            if (i8 != 1) {
                if (i8 == 2 && cVar2.getEnd() >= cVar.getStart()) {
                    arrayList.add(cVar2);
                }
            } else if (cVar2.getStart() <= cVar.getEnd()) {
                arrayList.add(cVar2);
            }
        }
        return arrayList;
    }

    protected List<c> checkForOverlapsToTheLeft(c cVar) {
        return checkForOverlaps(cVar, Direction.LEFT);
    }

    protected List<c> checkForOverlapsToTheRight(c cVar) {
        return checkForOverlaps(cVar, Direction.RIGHT);
    }

    public int determineMedian(List<c> list) {
        int i8 = -1;
        int i9 = -1;
        for (c cVar : list) {
            int start = cVar.getStart();
            int end = cVar.getEnd();
            if (i8 == -1 || start < i8) {
                i8 = start;
            }
            if (i9 == -1 || end > i9) {
                i9 = end;
            }
        }
        return (i8 + i9) / 2;
    }

    protected List<c> findOverlappingRanges(IntervalNode intervalNode, c cVar) {
        return intervalNode != null ? intervalNode.findOverlaps(cVar) : Collections.emptyList();
    }

    public List<c> findOverlaps(c cVar) {
        ArrayList arrayList = new ArrayList();
        if (this.point < cVar.getStart()) {
            addToOverlaps(cVar, arrayList, findOverlappingRanges(this.right, cVar));
            addToOverlaps(cVar, arrayList, checkForOverlapsToTheRight(cVar));
        } else if (this.point > cVar.getEnd()) {
            addToOverlaps(cVar, arrayList, findOverlappingRanges(this.left, cVar));
            addToOverlaps(cVar, arrayList, checkForOverlapsToTheLeft(cVar));
        } else {
            addToOverlaps(cVar, arrayList, this.intervals);
            addToOverlaps(cVar, arrayList, findOverlappingRanges(this.left, cVar));
            addToOverlaps(cVar, arrayList, findOverlappingRanges(this.right, cVar));
        }
        return arrayList;
    }
}
