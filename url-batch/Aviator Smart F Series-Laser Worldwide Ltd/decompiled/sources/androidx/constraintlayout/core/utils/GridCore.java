package androidx.constraintlayout.core.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.LinearSystem;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.VirtualLayout;
import com.baidu.ar.util.SystemInfoUtil;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class GridCore extends VirtualLayout {
    private static final int DEFAULT_SIZE = 3;
    public static final int HORIZONTAL = 0;
    private static final int MAX_COLUMNS = 50;
    private static final int MAX_ROWS = 50;
    public static final int SPANS_RESPECT_WIDGET_ORDER = 2;
    public static final int SUB_GRID_BY_COL_ROW = 1;
    public static final int VERTICAL = 1;
    private ConstraintWidget[] mBoxWidgets;
    private String mColumnWeights;
    private int mColumns;
    private int mColumnsSet;
    private int[][] mConstraintMatrix;
    ConstraintWidgetContainer mContainer;
    private int mFlags;
    private float mHorizontalGaps;
    private int mOrientation;
    private boolean[][] mPositionMatrix;
    private String mRowWeights;
    private int mRows;
    private int mRowsSet;
    private String mSkips;
    private int[][] mSpanMatrix;
    private String mSpans;
    private float mVerticalGaps;
    private boolean mExtraSpaceHandled = false;
    private int mNextAvailableIndex = 0;
    Set<String> mSpanIds = new HashSet();
    private int mSpanIndex = 0;

    public GridCore() {
        updateActualRowsAndColumns();
        initMatrices();
    }

    private void addConstraints() {
        setBoxWidgetVerticalChains();
        setBoxWidgetHorizontalChains();
        arrangeWidgets();
    }

    private void arrangeWidgets() {
        int[][] iArr;
        int i8;
        for (int i9 = 0; i9 < this.mWidgetsCount; i9++) {
            if (!this.mSpanIds.contains(this.mWidgets[i9].stringId)) {
                int nextPosition = getNextPosition();
                int rowByIndex = getRowByIndex(nextPosition);
                int colByIndex = getColByIndex(nextPosition);
                if (nextPosition == -1) {
                    return;
                }
                if (isSpansRespectWidgetOrder() && (iArr = this.mSpanMatrix) != null && (i8 = this.mSpanIndex) < iArr.length) {
                    int[] iArr2 = iArr[i8];
                    if (iArr2[0] == nextPosition) {
                        this.mPositionMatrix[rowByIndex][colByIndex] = true;
                        if (invalidatePositions(rowByIndex, colByIndex, iArr2[1], iArr2[2])) {
                            ConstraintWidget constraintWidget = this.mWidgets[i9];
                            int[] iArr3 = this.mSpanMatrix[this.mSpanIndex];
                            connectWidget(constraintWidget, rowByIndex, colByIndex, iArr3[1], iArr3[2]);
                            this.mSpanIndex++;
                        }
                    }
                }
                connectWidget(this.mWidgets[i9], rowByIndex, colByIndex, 1, 1);
            }
        }
    }

    private void clearHorizontalAttributes(ConstraintWidget constraintWidget) {
        constraintWidget.setHorizontalWeight(-1.0f);
        constraintWidget.mLeft.reset();
        constraintWidget.mRight.reset();
    }

    private void clearVerticalAttributes(ConstraintWidget constraintWidget) {
        constraintWidget.setVerticalWeight(-1.0f);
        constraintWidget.mTop.reset();
        constraintWidget.mBottom.reset();
        constraintWidget.mBaseline.reset();
    }

    private void connectWidget(ConstraintWidget constraintWidget, int i8, int i9, int i10, int i11) {
        constraintWidget.mLeft.connect(this.mBoxWidgets[i9].mLeft, 0);
        constraintWidget.mTop.connect(this.mBoxWidgets[i8].mTop, 0);
        constraintWidget.mRight.connect(this.mBoxWidgets[(i9 + i11) - 1].mRight, 0);
        constraintWidget.mBottom.connect(this.mBoxWidgets[(i8 + i10) - 1].mBottom, 0);
    }

    private void createBoxes() {
        int max = Math.max(this.mRows, this.mColumns);
        ConstraintWidget[] constraintWidgetArr = this.mBoxWidgets;
        int i8 = 0;
        if (constraintWidgetArr == null) {
            this.mBoxWidgets = new ConstraintWidget[max];
            while (true) {
                ConstraintWidget[] constraintWidgetArr2 = this.mBoxWidgets;
                if (i8 >= constraintWidgetArr2.length) {
                    return;
                }
                constraintWidgetArr2[i8] = makeNewWidget();
                i8++;
            }
        } else {
            if (max == constraintWidgetArr.length) {
                return;
            }
            ConstraintWidget[] constraintWidgetArr3 = new ConstraintWidget[max];
            while (i8 < max) {
                ConstraintWidget[] constraintWidgetArr4 = this.mBoxWidgets;
                if (i8 < constraintWidgetArr4.length) {
                    constraintWidgetArr3[i8] = constraintWidgetArr4[i8];
                } else {
                    constraintWidgetArr3[i8] = makeNewWidget();
                }
                i8++;
            }
            while (true) {
                ConstraintWidget[] constraintWidgetArr5 = this.mBoxWidgets;
                if (max >= constraintWidgetArr5.length) {
                    this.mBoxWidgets = constraintWidgetArr3;
                    return;
                } else {
                    this.mContainer.remove(constraintWidgetArr5[max]);
                    max++;
                }
            }
        }
    }

    private void fillConstraintMatrix(boolean z7) {
        int[][] parseSpans;
        int[][] parseSpans2;
        if (z7) {
            for (int i8 = 0; i8 < this.mPositionMatrix.length; i8++) {
                int i9 = 0;
                while (true) {
                    boolean[][] zArr = this.mPositionMatrix;
                    if (i9 < zArr[0].length) {
                        zArr[i8][i9] = true;
                        i9++;
                    }
                }
            }
            for (int i10 = 0; i10 < this.mConstraintMatrix.length; i10++) {
                int i11 = 0;
                while (true) {
                    int[][] iArr = this.mConstraintMatrix;
                    if (i11 < iArr[0].length) {
                        iArr[i10][i11] = -1;
                        i11++;
                    }
                }
            }
        }
        this.mNextAvailableIndex = 0;
        String str = this.mSkips;
        if (str != null && !str.trim().isEmpty() && (parseSpans2 = parseSpans(this.mSkips, false)) != null) {
            handleSkips(parseSpans2);
        }
        String str2 = this.mSpans;
        if (str2 == null || str2.trim().isEmpty() || (parseSpans = parseSpans(this.mSpans, true)) == null) {
            return;
        }
        handleSpans(parseSpans);
    }

    private int getColByIndex(int i8) {
        return this.mOrientation == 1 ? i8 / this.mRows : i8 % this.mColumns;
    }

    private int getNextPosition() {
        boolean z7 = false;
        int i8 = 0;
        while (!z7) {
            i8 = this.mNextAvailableIndex;
            if (i8 >= this.mRows * this.mColumns) {
                return -1;
            }
            int rowByIndex = getRowByIndex(i8);
            int colByIndex = getColByIndex(this.mNextAvailableIndex);
            boolean[] zArr = this.mPositionMatrix[rowByIndex];
            if (zArr[colByIndex]) {
                zArr[colByIndex] = false;
                z7 = true;
            }
            this.mNextAvailableIndex++;
        }
        return i8;
    }

    private int getRowByIndex(int i8) {
        return this.mOrientation == 1 ? i8 % this.mRows : i8 / this.mColumns;
    }

    private void handleSkips(int[][] iArr) {
        for (int[] iArr2 : iArr) {
            if (!invalidatePositions(getRowByIndex(iArr2[0]), getColByIndex(iArr2[0]), iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    private void handleSpans(int[][] iArr) {
        if (isSpansRespectWidgetOrder()) {
            return;
        }
        for (int i8 = 0; i8 < iArr.length; i8++) {
            int rowByIndex = getRowByIndex(iArr[i8][0]);
            int colByIndex = getColByIndex(iArr[i8][0]);
            int[] iArr2 = iArr[i8];
            if (!invalidatePositions(rowByIndex, colByIndex, iArr2[1], iArr2[2])) {
                return;
            }
            ConstraintWidget constraintWidget = this.mWidgets[i8];
            int[] iArr3 = iArr[i8];
            connectWidget(constraintWidget, rowByIndex, colByIndex, iArr3[1], iArr3[2]);
            this.mSpanIds.add(this.mWidgets[i8].stringId);
        }
    }

    private void initMatrices() {
        boolean[][] zArr;
        int[][] iArr = this.mConstraintMatrix;
        boolean z7 = false;
        if (iArr != null && iArr.length == this.mWidgetsCount && (zArr = this.mPositionMatrix) != null && zArr.length == this.mRows && zArr[0].length == this.mColumns) {
            z7 = true;
        }
        if (!z7) {
            initVariables();
        }
        fillConstraintMatrix(z7);
    }

    private void initVariables() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.mRows, this.mColumns);
        this.mPositionMatrix = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i8 = this.mWidgetsCount;
        if (i8 > 0) {
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i8, 4);
            this.mConstraintMatrix = iArr;
            for (int[] iArr2 : iArr) {
                Arrays.fill(iArr2, -1);
            }
        }
    }

    private boolean invalidatePositions(int i8, int i9, int i10, int i11) {
        for (int i12 = i8; i12 < i8 + i10; i12++) {
            for (int i13 = i9; i13 < i9 + i11; i13++) {
                boolean[][] zArr = this.mPositionMatrix;
                if (i12 < zArr.length && i13 < zArr[0].length) {
                    boolean[] zArr2 = zArr[i12];
                    if (zArr2[i13]) {
                        zArr2[i13] = false;
                    }
                }
                return false;
            }
        }
        return true;
    }

    private boolean isSpansRespectWidgetOrder() {
        return (this.mFlags & 2) > 0;
    }

    private boolean isSubGridByColRow() {
        return (this.mFlags & 1) > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$parseSpans$0(String str, String str2) {
        return Integer.parseInt(str.split(":")[0]) - Integer.parseInt(str2.split(":")[0]);
    }

    private ConstraintWidget makeNewWidget() {
        ConstraintWidget constraintWidget = new ConstraintWidget();
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.mListDimensionBehaviors;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
        dimensionBehaviourArr[0] = dimensionBehaviour;
        dimensionBehaviourArr[1] = dimensionBehaviour;
        constraintWidget.stringId = String.valueOf(constraintWidget.hashCode());
        return constraintWidget;
    }

    private int[][] parseSpans(String str, boolean z7) {
        try {
            String[] split = str.split(SystemInfoUtil.COMMA);
            Arrays.sort(split, new Comparator() { // from class: androidx.constraintlayout.core.utils.a
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int lambda$parseSpans$0;
                    lambda$parseSpans$0 = GridCore.lambda$parseSpans$0((String) obj, (String) obj2);
                    return lambda$parseSpans$0;
                }
            });
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, split.length, 3);
            if (this.mRows != 1 && this.mColumns != 1) {
                for (int i8 = 0; i8 < split.length; i8++) {
                    String[] split2 = split[i8].trim().split(":");
                    String[] split3 = split2[1].split("x");
                    iArr[i8][0] = Integer.parseInt(split2[0]);
                    if (isSubGridByColRow()) {
                        iArr[i8][1] = Integer.parseInt(split3[1]);
                        iArr[i8][2] = Integer.parseInt(split3[0]);
                    } else {
                        iArr[i8][1] = Integer.parseInt(split3[0]);
                        iArr[i8][2] = Integer.parseInt(split3[1]);
                    }
                }
                return iArr;
            }
            int i9 = 0;
            int i10 = 0;
            for (int i11 = 0; i11 < split.length; i11++) {
                String[] split4 = split[i11].trim().split(":");
                iArr[i11][0] = Integer.parseInt(split4[0]);
                int[] iArr2 = iArr[i11];
                iArr2[1] = 1;
                iArr2[2] = 1;
                if (this.mColumns == 1) {
                    iArr2[1] = Integer.parseInt(split4[1]);
                    i9 += iArr[i11][1];
                    if (z7) {
                        i9--;
                    }
                }
                if (this.mRows == 1) {
                    iArr[i11][2] = Integer.parseInt(split4[1]);
                    i10 += iArr[i11][2];
                    if (z7) {
                        i10--;
                    }
                }
            }
            if (i9 != 0 && !this.mExtraSpaceHandled) {
                setRows(this.mRows + i9);
            }
            if (i10 != 0 && !this.mExtraSpaceHandled) {
                setColumns(this.mColumns + i10);
            }
            this.mExtraSpaceHandled = true;
            return iArr;
        } catch (Exception unused) {
            return null;
        }
    }

    private float[] parseWeights(int i8, String str) {
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        String[] split = str.split(SystemInfoUtil.COMMA);
        float[] fArr = new float[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 < split.length) {
                try {
                    fArr[i9] = Float.parseFloat(split[i9]);
                } catch (Exception e8) {
                    System.err.println("Error parsing `" + split[i9] + "`: " + e8.getMessage());
                    fArr[i9] = 1.0f;
                }
            } else {
                fArr[i9] = 1.0f;
            }
        }
        return fArr;
    }

    private void setBoxWidgetHorizontalChains() {
        int i8;
        int max = Math.max(this.mRows, this.mColumns);
        ConstraintWidget constraintWidget = this.mBoxWidgets[0];
        float[] parseWeights = parseWeights(this.mColumns, this.mColumnWeights);
        if (this.mColumns == 1) {
            clearHorizontalAttributes(constraintWidget);
            constraintWidget.mLeft.connect(this.mLeft, 0);
            constraintWidget.mRight.connect(this.mRight, 0);
            return;
        }
        int i9 = 0;
        while (true) {
            i8 = this.mColumns;
            if (i9 >= i8) {
                break;
            }
            ConstraintWidget constraintWidget2 = this.mBoxWidgets[i9];
            clearHorizontalAttributes(constraintWidget2);
            if (parseWeights != null) {
                constraintWidget2.setHorizontalWeight(parseWeights[i9]);
            }
            if (i9 > 0) {
                constraintWidget2.mLeft.connect(this.mBoxWidgets[i9 - 1].mRight, 0);
            } else {
                constraintWidget2.mLeft.connect(this.mLeft, 0);
            }
            if (i9 < this.mColumns - 1) {
                constraintWidget2.mRight.connect(this.mBoxWidgets[i9 + 1].mLeft, 0);
            } else {
                constraintWidget2.mRight.connect(this.mRight, 0);
            }
            if (i9 > 0) {
                constraintWidget2.mLeft.mMargin = (int) this.mHorizontalGaps;
            }
            i9++;
        }
        while (i8 < max) {
            ConstraintWidget constraintWidget3 = this.mBoxWidgets[i8];
            clearHorizontalAttributes(constraintWidget3);
            constraintWidget3.mLeft.connect(this.mLeft, 0);
            constraintWidget3.mRight.connect(this.mRight, 0);
            i8++;
        }
    }

    private void setBoxWidgetVerticalChains() {
        int i8;
        int max = Math.max(this.mRows, this.mColumns);
        ConstraintWidget constraintWidget = this.mBoxWidgets[0];
        float[] parseWeights = parseWeights(this.mRows, this.mRowWeights);
        if (this.mRows == 1) {
            clearVerticalAttributes(constraintWidget);
            constraintWidget.mTop.connect(this.mTop, 0);
            constraintWidget.mBottom.connect(this.mBottom, 0);
            return;
        }
        int i9 = 0;
        while (true) {
            i8 = this.mRows;
            if (i9 >= i8) {
                break;
            }
            ConstraintWidget constraintWidget2 = this.mBoxWidgets[i9];
            clearVerticalAttributes(constraintWidget2);
            if (parseWeights != null) {
                constraintWidget2.setVerticalWeight(parseWeights[i9]);
            }
            if (i9 > 0) {
                constraintWidget2.mTop.connect(this.mBoxWidgets[i9 - 1].mBottom, 0);
            } else {
                constraintWidget2.mTop.connect(this.mTop, 0);
            }
            if (i9 < this.mRows - 1) {
                constraintWidget2.mBottom.connect(this.mBoxWidgets[i9 + 1].mTop, 0);
            } else {
                constraintWidget2.mBottom.connect(this.mBottom, 0);
            }
            if (i9 > 0) {
                constraintWidget2.mTop.mMargin = (int) this.mVerticalGaps;
            }
            i9++;
        }
        while (i8 < max) {
            ConstraintWidget constraintWidget3 = this.mBoxWidgets[i8];
            clearVerticalAttributes(constraintWidget3);
            constraintWidget3.mTop.connect(this.mTop, 0);
            constraintWidget3.mBottom.connect(this.mBottom, 0);
            i8++;
        }
    }

    private void setupGrid(boolean z7) {
        int[][] parseSpans;
        if (this.mRows < 1 || this.mColumns < 1) {
            return;
        }
        if (z7) {
            for (int i8 = 0; i8 < this.mPositionMatrix.length; i8++) {
                int i9 = 0;
                while (true) {
                    boolean[][] zArr = this.mPositionMatrix;
                    if (i9 < zArr[0].length) {
                        zArr[i8][i9] = true;
                        i9++;
                    }
                }
            }
            this.mSpanIds.clear();
        }
        this.mNextAvailableIndex = 0;
        String str = this.mSkips;
        if (str != null && !str.trim().isEmpty() && (parseSpans = parseSpans(this.mSkips, false)) != null) {
            handleSkips(parseSpans);
        }
        String str2 = this.mSpans;
        if (str2 != null && !str2.trim().isEmpty()) {
            this.mSpanMatrix = parseSpans(this.mSpans, true);
        }
        createBoxes();
        int[][] iArr = this.mSpanMatrix;
        if (iArr != null) {
            handleSpans(iArr);
        }
    }

    private void updateActualRowsAndColumns() {
        int i8;
        int i9 = this.mRowsSet;
        if (i9 != 0 && (i8 = this.mColumnsSet) != 0) {
            this.mRows = i9;
            this.mColumns = i8;
            return;
        }
        int i10 = this.mColumnsSet;
        if (i10 > 0) {
            this.mColumns = i10;
            this.mRows = ((this.mWidgetsCount + i10) - 1) / i10;
        } else if (i9 > 0) {
            this.mRows = i9;
            this.mColumns = ((this.mWidgetsCount + i9) - 1) / i9;
        } else {
            int sqrt = (int) (Math.sqrt(this.mWidgetsCount) + 1.5d);
            this.mRows = sqrt;
            this.mColumns = ((this.mWidgetsCount + sqrt) - 1) / sqrt;
        }
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(@Nullable LinearSystem linearSystem, boolean z7) {
        super.addToSolver(linearSystem, z7);
        addConstraints();
    }

    @Nullable
    public String getColumnWeights() {
        return this.mColumnWeights;
    }

    @Nullable
    public ConstraintWidgetContainer getContainer() {
        return this.mContainer;
    }

    public int getFlags() {
        return this.mFlags;
    }

    public float getHorizontalGaps() {
        return this.mHorizontalGaps;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    @Nullable
    public String getRowWeights() {
        return this.mRowWeights;
    }

    public float getVerticalGaps() {
        return this.mVerticalGaps;
    }

    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public void measure(int i8, int i9, int i10, int i11) {
        super.measure(i8, i9, i10, i11);
        this.mContainer = (ConstraintWidgetContainer) getParent();
        setupGrid(false);
        this.mContainer.add(this.mBoxWidgets);
    }

    public void setColumnWeights(@NonNull String str) {
        String str2 = this.mColumnWeights;
        if (str2 == null || !str2.equals(str)) {
            this.mColumnWeights = str;
        }
    }

    public void setColumns(int i8) {
        if (i8 <= 50 && this.mColumnsSet != i8) {
            this.mColumnsSet = i8;
            updateActualRowsAndColumns();
            initVariables();
        }
    }

    public void setContainer(@NonNull ConstraintWidgetContainer constraintWidgetContainer) {
        this.mContainer = constraintWidgetContainer;
    }

    public void setFlags(int i8) {
        this.mFlags = i8;
    }

    public void setHorizontalGaps(float f8) {
        if (f8 >= 0.0f && this.mHorizontalGaps != f8) {
            this.mHorizontalGaps = f8;
        }
    }

    public void setOrientation(int i8) {
        if ((i8 == 0 || i8 == 1) && this.mOrientation != i8) {
            this.mOrientation = i8;
        }
    }

    public void setRowWeights(@NonNull String str) {
        String str2 = this.mRowWeights;
        if (str2 == null || !str2.equals(str)) {
            this.mRowWeights = str;
        }
    }

    public void setRows(int i8) {
        if (i8 <= 50 && this.mRowsSet != i8) {
            this.mRowsSet = i8;
            updateActualRowsAndColumns();
            initVariables();
        }
    }

    public void setSkips(@NonNull String str) {
        String str2 = this.mSkips;
        if (str2 == null || !str2.equals(str)) {
            this.mExtraSpaceHandled = false;
            this.mSkips = str;
        }
    }

    public void setSpans(@NonNull CharSequence charSequence) {
        String str = this.mSpans;
        if (str == null || !str.equals(charSequence.toString())) {
            this.mExtraSpaceHandled = false;
            this.mSpans = charSequence.toString();
        }
    }

    public void setVerticalGaps(float f8) {
        if (f8 >= 0.0f && this.mVerticalGaps != f8) {
            this.mVerticalGaps = f8;
        }
    }

    public GridCore(int i8, int i9) {
        this.mRowsSet = i8;
        this.mColumnsSet = i9;
        if (i8 > 50) {
            this.mRowsSet = 3;
        }
        if (i9 > 50) {
            this.mColumnsSet = 3;
        }
        updateActualRowsAndColumns();
        initMatrices();
    }
}
