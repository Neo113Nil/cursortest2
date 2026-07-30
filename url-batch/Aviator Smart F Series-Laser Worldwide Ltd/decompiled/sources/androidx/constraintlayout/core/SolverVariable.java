package androidx.constraintlayout.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes.dex */
public class SolverVariable implements Comparable<SolverVariable> {
    private static final boolean DO_NOT_USE = false;
    private static final boolean INTERNAL_DEBUG = false;
    static final int MAX_STRENGTH = 9;
    public static final int STRENGTH_BARRIER = 6;
    public static final int STRENGTH_CENTERING = 7;
    public static final int STRENGTH_EQUALITY = 5;
    public static final int STRENGTH_FIXED = 8;
    public static final int STRENGTH_HIGH = 3;
    public static final int STRENGTH_HIGHEST = 4;
    public static final int STRENGTH_LOW = 1;
    public static final int STRENGTH_MEDIUM = 2;
    public static final int STRENGTH_NONE = 0;
    private static final boolean VAR_USE_HASH = false;
    private static int sUniqueConstantId = 1;
    private static int sUniqueErrorId = 1;
    private static int sUniqueId = 1;
    private static int sUniqueSlackId = 1;
    private static int sUniqueUnrestrictedId = 1;
    public float computedValue;
    public int id;
    public boolean inGoal;
    public boolean isFinalValue;
    ArrayRow[] mClientEquations;
    int mClientEquationsCount;
    int mDefinitionId;
    float[] mGoalStrengthVector;
    HashSet<ArrayRow> mInRows;
    boolean mIsSynonym;
    private String mName;
    float[] mStrengthVector;
    int mSynonym;
    float mSynonymDelta;
    Type mType;
    public int strength;
    public int usageInRowCount;

    public enum Type {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public SolverVariable(String str, Type type) {
        this.id = -1;
        this.mDefinitionId = -1;
        this.strength = 0;
        this.isFinalValue = false;
        this.mStrengthVector = new float[9];
        this.mGoalStrengthVector = new float[9];
        this.mClientEquations = new ArrayRow[16];
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.mIsSynonym = false;
        this.mSynonym = -1;
        this.mSynonymDelta = 0.0f;
        this.mInRows = null;
        this.mName = str;
        this.mType = type;
    }

    private static String getUniqueName(Type type, String str) {
        if (str != null) {
            return str + sUniqueErrorId;
        }
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("U");
            int i8 = sUniqueUnrestrictedId + 1;
            sUniqueUnrestrictedId = i8;
            sb.append(i8);
            return sb.toString();
        }
        if (ordinal == 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("C");
            int i9 = sUniqueConstantId + 1;
            sUniqueConstantId = i9;
            sb2.append(i9);
            return sb2.toString();
        }
        if (ordinal == 2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(ExifInterface.LATITUDE_SOUTH);
            int i10 = sUniqueSlackId + 1;
            sUniqueSlackId = i10;
            sb3.append(i10);
            return sb3.toString();
        }
        if (ordinal == 3) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append("e");
            int i11 = sUniqueErrorId + 1;
            sUniqueErrorId = i11;
            sb4.append(i11);
            return sb4.toString();
        }
        if (ordinal != 4) {
            throw new AssertionError(type.name());
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("V");
        int i12 = sUniqueId + 1;
        sUniqueId = i12;
        sb5.append(i12);
        return sb5.toString();
    }

    static void increaseErrorId() {
        sUniqueErrorId++;
    }

    public final void addToRow(ArrayRow arrayRow) {
        int i8 = 0;
        while (true) {
            int i9 = this.mClientEquationsCount;
            if (i8 >= i9) {
                ArrayRow[] arrayRowArr = this.mClientEquations;
                if (i9 >= arrayRowArr.length) {
                    this.mClientEquations = (ArrayRow[]) Arrays.copyOf(arrayRowArr, arrayRowArr.length * 2);
                }
                ArrayRow[] arrayRowArr2 = this.mClientEquations;
                int i10 = this.mClientEquationsCount;
                arrayRowArr2[i10] = arrayRow;
                this.mClientEquationsCount = i10 + 1;
                return;
            }
            if (this.mClientEquations[i8] == arrayRow) {
                return;
            } else {
                i8++;
            }
        }
    }

    void clearStrengths() {
        for (int i8 = 0; i8 < 9; i8++) {
            this.mStrengthVector[i8] = 0.0f;
        }
    }

    public String getName() {
        return this.mName;
    }

    public final void removeFromRow(ArrayRow arrayRow) {
        int i8 = this.mClientEquationsCount;
        int i9 = 0;
        while (i9 < i8) {
            if (this.mClientEquations[i9] == arrayRow) {
                while (i9 < i8 - 1) {
                    ArrayRow[] arrayRowArr = this.mClientEquations;
                    int i10 = i9 + 1;
                    arrayRowArr[i9] = arrayRowArr[i10];
                    i9 = i10;
                }
                this.mClientEquationsCount--;
                return;
            }
            i9++;
        }
    }

    public void reset() {
        this.mName = null;
        this.mType = Type.UNKNOWN;
        this.strength = 0;
        this.id = -1;
        this.mDefinitionId = -1;
        this.computedValue = 0.0f;
        this.isFinalValue = false;
        this.mIsSynonym = false;
        this.mSynonym = -1;
        this.mSynonymDelta = 0.0f;
        int i8 = this.mClientEquationsCount;
        for (int i9 = 0; i9 < i8; i9++) {
            this.mClientEquations[i9] = null;
        }
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.inGoal = false;
        Arrays.fill(this.mGoalStrengthVector, 0.0f);
    }

    public void setFinalValue(LinearSystem linearSystem, float f8) {
        this.computedValue = f8;
        this.isFinalValue = true;
        this.mIsSynonym = false;
        this.mSynonym = -1;
        this.mSynonymDelta = 0.0f;
        int i8 = this.mClientEquationsCount;
        this.mDefinitionId = -1;
        for (int i9 = 0; i9 < i8; i9++) {
            this.mClientEquations[i9].updateFromFinalVariable(linearSystem, this, false);
        }
        this.mClientEquationsCount = 0;
    }

    public void setName(String str) {
        this.mName = str;
    }

    public void setSynonym(LinearSystem linearSystem, SolverVariable solverVariable, float f8) {
        this.mIsSynonym = true;
        this.mSynonym = solverVariable.id;
        this.mSynonymDelta = f8;
        int i8 = this.mClientEquationsCount;
        this.mDefinitionId = -1;
        for (int i9 = 0; i9 < i8; i9++) {
            this.mClientEquations[i9].updateFromSynonymVariable(linearSystem, this, false);
        }
        this.mClientEquationsCount = 0;
        linearSystem.displayReadableRows();
    }

    public void setType(Type type, String str) {
        this.mType = type;
    }

    String strengthsToString() {
        String str = this + "[";
        boolean z7 = false;
        boolean z8 = true;
        for (int i8 = 0; i8 < this.mStrengthVector.length; i8++) {
            String str2 = str + this.mStrengthVector[i8];
            float[] fArr = this.mStrengthVector;
            float f8 = fArr[i8];
            if (f8 > 0.0f) {
                z7 = false;
            } else if (f8 < 0.0f) {
                z7 = true;
            }
            if (f8 != 0.0f) {
                z8 = false;
            }
            str = i8 < fArr.length - 1 ? str2 + ", " : str2 + "] ";
        }
        if (z7) {
            str = str + " (-)";
        }
        if (!z8) {
            return str;
        }
        return str + " (*)";
    }

    public String toString() {
        if (this.mName != null) {
            return "" + this.mName;
        }
        return "" + this.id;
    }

    public final void updateReferencesWithNewDefinition(LinearSystem linearSystem, ArrayRow arrayRow) {
        int i8 = this.mClientEquationsCount;
        for (int i9 = 0; i9 < i8; i9++) {
            this.mClientEquations[i9].updateFromRow(linearSystem, arrayRow, false);
        }
        this.mClientEquationsCount = 0;
    }

    public SolverVariable(Type type, String str) {
        this.id = -1;
        this.mDefinitionId = -1;
        this.strength = 0;
        this.isFinalValue = false;
        this.mStrengthVector = new float[9];
        this.mGoalStrengthVector = new float[9];
        this.mClientEquations = new ArrayRow[16];
        this.mClientEquationsCount = 0;
        this.usageInRowCount = 0;
        this.mIsSynonym = false;
        this.mSynonym = -1;
        this.mSynonymDelta = 0.0f;
        this.mInRows = null;
        this.mType = type;
    }

    @Override // java.lang.Comparable
    public int compareTo(SolverVariable solverVariable) {
        return this.id - solverVariable.id;
    }
}
