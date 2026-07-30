package androidx.constraintlayout.core.widgets.analyzer;

import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
class RunGroup {
    public static final int BASELINE = 2;
    public static final int END = 1;
    public static final int START = 0;
    public static int index;
    int mDirection;
    WidgetRun mFirstRun;
    int mGroupIndex;
    WidgetRun mLastRun;
    public int position = 0;
    public boolean dual = false;
    ArrayList<WidgetRun> mRuns = new ArrayList<>();

    RunGroup(WidgetRun widgetRun, int i8) {
        this.mFirstRun = null;
        this.mLastRun = null;
        int i9 = index;
        this.mGroupIndex = i9;
        index = i9 + 1;
        this.mFirstRun = widgetRun;
        this.mLastRun = widgetRun;
        this.mDirection = i8;
    }

    private boolean defineTerminalWidget(WidgetRun widgetRun, int i8) {
        DependencyNode dependencyNode;
        WidgetRun widgetRun2;
        DependencyNode dependencyNode2;
        WidgetRun widgetRun3;
        if (!widgetRun.mWidget.isTerminalWidget[i8]) {
            return false;
        }
        for (Dependency dependency : widgetRun.start.mDependencies) {
            if ((dependency instanceof DependencyNode) && (widgetRun3 = (dependencyNode2 = (DependencyNode) dependency).mRun) != widgetRun && dependencyNode2 == widgetRun3.start) {
                if (widgetRun instanceof ChainRun) {
                    Iterator<WidgetRun> it = ((ChainRun) widgetRun).mWidgets.iterator();
                    while (it.hasNext()) {
                        defineTerminalWidget(it.next(), i8);
                    }
                } else if (!(widgetRun instanceof HelperReferences)) {
                    widgetRun.mWidget.isTerminalWidget[i8] = false;
                }
                defineTerminalWidget(dependencyNode2.mRun, i8);
            }
        }
        for (Dependency dependency2 : widgetRun.end.mDependencies) {
            if ((dependency2 instanceof DependencyNode) && (widgetRun2 = (dependencyNode = (DependencyNode) dependency2).mRun) != widgetRun && dependencyNode == widgetRun2.start) {
                if (widgetRun instanceof ChainRun) {
                    Iterator<WidgetRun> it2 = ((ChainRun) widgetRun).mWidgets.iterator();
                    while (it2.hasNext()) {
                        defineTerminalWidget(it2.next(), i8);
                    }
                } else if (!(widgetRun instanceof HelperReferences)) {
                    widgetRun.mWidget.isTerminalWidget[i8] = false;
                }
                defineTerminalWidget(dependencyNode.mRun, i8);
            }
        }
        return false;
    }

    private long traverseEnd(DependencyNode dependencyNode, long j8) {
        WidgetRun widgetRun = dependencyNode.mRun;
        if (widgetRun instanceof HelperReferences) {
            return j8;
        }
        int size = dependencyNode.mDependencies.size();
        long j9 = j8;
        for (int i8 = 0; i8 < size; i8++) {
            Dependency dependency = dependencyNode.mDependencies.get(i8);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.mRun != widgetRun) {
                    j9 = Math.min(j9, traverseEnd(dependencyNode2, dependencyNode2.mMargin + j8));
                }
            }
        }
        if (dependencyNode != widgetRun.end) {
            return j9;
        }
        long wrapDimension = j8 - widgetRun.getWrapDimension();
        return Math.min(Math.min(j9, traverseEnd(widgetRun.start, wrapDimension)), wrapDimension - widgetRun.start.mMargin);
    }

    private long traverseStart(DependencyNode dependencyNode, long j8) {
        WidgetRun widgetRun = dependencyNode.mRun;
        if (widgetRun instanceof HelperReferences) {
            return j8;
        }
        int size = dependencyNode.mDependencies.size();
        long j9 = j8;
        for (int i8 = 0; i8 < size; i8++) {
            Dependency dependency = dependencyNode.mDependencies.get(i8);
            if (dependency instanceof DependencyNode) {
                DependencyNode dependencyNode2 = (DependencyNode) dependency;
                if (dependencyNode2.mRun != widgetRun) {
                    j9 = Math.max(j9, traverseStart(dependencyNode2, dependencyNode2.mMargin + j8));
                }
            }
        }
        if (dependencyNode != widgetRun.start) {
            return j9;
        }
        long wrapDimension = j8 + widgetRun.getWrapDimension();
        return Math.max(Math.max(j9, traverseStart(widgetRun.end, wrapDimension)), wrapDimension - widgetRun.end.mMargin);
    }

    public void add(WidgetRun widgetRun) {
        this.mRuns.add(widgetRun);
        this.mLastRun = widgetRun;
    }

    public long computeWrapSize(ConstraintWidgetContainer constraintWidgetContainer, int i8) {
        long wrapDimension;
        int i9;
        WidgetRun widgetRun = this.mFirstRun;
        if (widgetRun instanceof ChainRun) {
            if (((ChainRun) widgetRun).orientation != i8) {
                return 0L;
            }
        } else if (i8 == 0) {
            if (!(widgetRun instanceof HorizontalWidgetRun)) {
                return 0L;
            }
        } else if (!(widgetRun instanceof VerticalWidgetRun)) {
            return 0L;
        }
        DependencyNode dependencyNode = (i8 == 0 ? constraintWidgetContainer.mHorizontalRun : constraintWidgetContainer.mVerticalRun).start;
        DependencyNode dependencyNode2 = (i8 == 0 ? constraintWidgetContainer.mHorizontalRun : constraintWidgetContainer.mVerticalRun).end;
        boolean contains = widgetRun.start.mTargets.contains(dependencyNode);
        boolean contains2 = this.mFirstRun.end.mTargets.contains(dependencyNode2);
        long wrapDimension2 = this.mFirstRun.getWrapDimension();
        if (contains && contains2) {
            long traverseStart = traverseStart(this.mFirstRun.start, 0L);
            long traverseEnd = traverseEnd(this.mFirstRun.end, 0L);
            long j8 = traverseStart - wrapDimension2;
            WidgetRun widgetRun2 = this.mFirstRun;
            int i10 = widgetRun2.end.mMargin;
            if (j8 >= (-i10)) {
                j8 += i10;
            }
            int i11 = widgetRun2.start.mMargin;
            long j9 = ((-traverseEnd) - wrapDimension2) - i11;
            if (j9 >= i11) {
                j9 -= i11;
            }
            float biasPercent = widgetRun2.mWidget.getBiasPercent(i8);
            float f8 = biasPercent > 0.0f ? (long) ((j9 / biasPercent) + (j8 / (1.0f - biasPercent))) : 0L;
            long j10 = ((long) ((f8 * biasPercent) + 0.5f)) + wrapDimension2 + ((long) ((f8 * (1.0f - biasPercent)) + 0.5f));
            wrapDimension = r13.start.mMargin + j10;
            i9 = this.mFirstRun.end.mMargin;
        } else {
            if (contains) {
                return Math.max(traverseStart(this.mFirstRun.start, r13.mMargin), this.mFirstRun.start.mMargin + wrapDimension2);
            }
            if (contains2) {
                return Math.max(-traverseEnd(this.mFirstRun.end, r13.mMargin), (-this.mFirstRun.end.mMargin) + wrapDimension2);
            }
            wrapDimension = r13.start.mMargin + this.mFirstRun.getWrapDimension();
            i9 = this.mFirstRun.end.mMargin;
        }
        return wrapDimension - i9;
    }

    public void defineTerminalWidgets(boolean z7, boolean z8) {
        if (z7) {
            WidgetRun widgetRun = this.mFirstRun;
            if (widgetRun instanceof HorizontalWidgetRun) {
                defineTerminalWidget(widgetRun, 0);
            }
        }
        if (z8) {
            WidgetRun widgetRun2 = this.mFirstRun;
            if (widgetRun2 instanceof VerticalWidgetRun) {
                defineTerminalWidget(widgetRun2, 1);
            }
        }
    }
}
