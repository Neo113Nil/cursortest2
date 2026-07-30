package androidx.constraintlayout.core.utils;

import com.baidu.ar.util.SystemInfoUtil;
import java.lang.reflect.Array;
import java.util.Arrays;

/* loaded from: classes.dex */
public class GridEngine {
    private static final int DEFAULT_SIZE = 3;
    public static final int HORIZONTAL = 0;
    private static final int MAX_COLUMNS = 50;
    private static final int MAX_ROWS = 50;
    public static final int VERTICAL = 1;
    private int mColumns;
    private int mColumnsSet;
    private int[][] mConstraintMatrix;
    private int mNextAvailableIndex = 0;
    private int mNumWidgets;
    private int mOrientation;
    private boolean[][] mPositionMatrix;
    private int mRows;
    private int mRowsSet;
    private String mStrSkips;
    private String mStrSpans;

    public GridEngine() {
    }

    private void addAllConstraintPositions() {
        for (int i8 = 0; i8 < this.mNumWidgets; i8++) {
            if (leftOfWidget(i8) == -1) {
                int nextPosition = getNextPosition();
                int rowByIndex = getRowByIndex(nextPosition);
                int colByIndex = getColByIndex(nextPosition);
                if (nextPosition == -1) {
                    return;
                } else {
                    addConstraintPosition(i8, rowByIndex, colByIndex, 1, 1);
                }
            }
        }
    }

    private void addConstraintPosition(int i8, int i9, int i10, int i11, int i12) {
        int[] iArr = this.mConstraintMatrix[i8];
        iArr[0] = i10;
        iArr[1] = i9;
        iArr[2] = (i10 + i12) - 1;
        iArr[3] = (i9 + i11) - 1;
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
        String str = this.mStrSkips;
        if (str != null && !str.trim().isEmpty() && (parseSpans2 = parseSpans(this.mStrSkips)) != null) {
            handleSkips(parseSpans2);
        }
        String str2 = this.mStrSpans;
        if (str2 != null && !str2.trim().isEmpty() && (parseSpans = parseSpans(this.mStrSpans)) != null) {
            handleSpans(parseSpans);
        }
        addAllConstraintPositions();
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
        for (int i8 = 0; i8 < iArr.length; i8++) {
            int rowByIndex = getRowByIndex(iArr[i8][0]);
            int colByIndex = getColByIndex(iArr[i8][0]);
            int[] iArr2 = iArr[i8];
            if (!invalidatePositions(rowByIndex, colByIndex, iArr2[1], iArr2[2])) {
                return;
            }
        }
    }

    private void handleSpans(int[][] iArr) {
        for (int i8 = 0; i8 < iArr.length; i8++) {
            int rowByIndex = getRowByIndex(iArr[i8][0]);
            int colByIndex = getColByIndex(iArr[i8][0]);
            int[] iArr2 = iArr[i8];
            if (!invalidatePositions(rowByIndex, colByIndex, iArr2[1], iArr2[2])) {
                return;
            }
            int[] iArr3 = iArr[i8];
            addConstraintPosition(i8, rowByIndex, colByIndex, iArr3[1], iArr3[2]);
        }
    }

    private void initVariables() {
        boolean[][] zArr = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, this.mRows, this.mColumns);
        this.mPositionMatrix = zArr;
        for (boolean[] zArr2 : zArr) {
            Arrays.fill(zArr2, true);
        }
        int i8 = this.mNumWidgets;
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

    private boolean isSpansValid(CharSequence charSequence) {
        return charSequence != null;
    }

    private int[][] parseSpans(String str) {
        if (!isSpansValid(str)) {
            return null;
        }
        String[] split = str.split(SystemInfoUtil.COMMA);
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, split.length, 3);
        for (int i8 = 0; i8 < split.length; i8++) {
            String[] split2 = split[i8].trim().split(":");
            String[] split3 = split2[1].split("x");
            iArr[i8][0] = Integer.parseInt(split2[0]);
            iArr[i8][1] = Integer.parseInt(split3[0]);
            iArr[i8][2] = Integer.parseInt(split3[1]);
        }
        return iArr;
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
            this.mRows = ((this.mNumWidgets + i10) - 1) / i10;
        } else if (i9 > 0) {
            this.mRows = i9;
            this.mColumns = ((this.mNumWidgets + i9) - 1) / i9;
        } else {
            int sqrt = (int) (Math.sqrt(this.mNumWidgets) + 1.5d);
            this.mRows = sqrt;
            this.mColumns = ((this.mNumWidgets + sqrt) - 1) / sqrt;
        }
    }

    public int bottomOfWidget(int i8) {
        int[][] iArr = this.mConstraintMatrix;
        if (iArr == null || i8 >= iArr.length) {
            return 0;
        }
        return iArr[i8][3];
    }

    public int leftOfWidget(int i8) {
        int[][] iArr = this.mConstraintMatrix;
        if (iArr == null || i8 >= iArr.length) {
            return 0;
        }
        return iArr[i8][0];
    }

    public int rightOfWidget(int i8) {
        int[][] iArr = this.mConstraintMatrix;
        if (iArr == null || i8 >= iArr.length) {
            return 0;
        }
        return iArr[i8][2];
    }

    public void setColumns(int i8) {
        if (i8 <= 50 && this.mColumnsSet != i8) {
            this.mColumnsSet = i8;
            updateActualRowsAndColumns();
        }
    }

    public void setNumWidgets(int i8) {
        if (i8 > this.mRows * this.mColumns) {
            return;
        }
        this.mNumWidgets = i8;
    }

    public void setOrientation(int i8) {
        if ((i8 == 0 || i8 == 1) && this.mOrientation != i8) {
            this.mOrientation = i8;
        }
    }

    public void setRows(int i8) {
        if (i8 <= 50 && this.mRowsSet != i8) {
            this.mRowsSet = i8;
            updateActualRowsAndColumns();
        }
    }

    public void setSkips(String str) {
        String str2 = this.mStrSkips;
        if (str2 == null || !str2.equals(str)) {
            this.mStrSkips = str;
        }
    }

    public void setSpans(CharSequence charSequence) {
        String str = this.mStrSpans;
        if (str == null || !str.equals(charSequence.toString())) {
            this.mStrSpans = charSequence.toString();
        }
    }

    public void setup() {
        boolean[][] zArr;
        int[][] iArr = this.mConstraintMatrix;
        boolean z7 = false;
        if (iArr != null && iArr.length == this.mNumWidgets && (zArr = this.mPositionMatrix) != null && zArr.length == this.mRows && zArr[0].length == this.mColumns) {
            z7 = true;
        }
        if (!z7) {
            initVariables();
        }
        fillConstraintMatrix(z7);
    }

    public int topOfWidget(int i8) {
        int[][] iArr = this.mConstraintMatrix;
        if (iArr == null || i8 >= iArr.length) {
            return 0;
        }
        return iArr[i8][1];
    }

    public GridEngine(int i8, int i9) {
        this.mRowsSet = i8;
        this.mColumnsSet = i9;
        if (i8 > 50) {
            this.mRowsSet = 3;
        }
        if (i9 > 50) {
            this.mColumnsSet = 3;
        }
        updateActualRowsAndColumns();
        initVariables();
    }

    public GridEngine(int i8, int i9, int i10) {
        this.mRowsSet = i8;
        this.mColumnsSet = i9;
        this.mNumWidgets = i10;
        if (i8 > 50) {
            this.mRowsSet = 3;
        }
        if (i9 > 50) {
            this.mColumnsSet = 3;
        }
        updateActualRowsAndColumns();
        int i11 = this.mRows;
        int i12 = this.mColumns;
        if (i10 > i11 * i12 || i10 < 1) {
            this.mNumWidgets = i11 * i12;
        }
        initVariables();
        fillConstraintMatrix(false);
    }
}
