package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import java.io.PrintStream;
import java.util.Arrays;

/* loaded from: classes.dex */
public class KeyFrameArray {

    public static class CustomArray {
        private static final int EMPTY = 999;
        int mCount;
        int[] mKeys = new int[101];
        CustomAttribute[] mValues = new CustomAttribute[101];

        public CustomArray() {
            clear();
        }

        public void append(int i8, CustomAttribute customAttribute) {
            if (this.mValues[i8] != null) {
                remove(i8);
            }
            this.mValues[i8] = customAttribute;
            int[] iArr = this.mKeys;
            int i9 = this.mCount;
            this.mCount = i9 + 1;
            iArr[i9] = i8;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.mKeys, EMPTY);
            Arrays.fill(this.mValues, (Object) null);
            this.mCount = 0;
        }

        public void dump() {
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.mKeys, this.mCount)));
            printStream.print("K: [");
            int i8 = 0;
            while (i8 < this.mCount) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i8 == 0 ? "" : ", ");
                sb.append(valueAt(i8));
                printStream2.print(sb.toString());
                i8++;
            }
            System.out.println("]");
        }

        public int keyAt(int i8) {
            return this.mKeys[i8];
        }

        public void remove(int i8) {
            this.mValues[i8] = null;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                int i11 = this.mCount;
                if (i9 >= i11) {
                    this.mCount = i11 - 1;
                    return;
                }
                int[] iArr = this.mKeys;
                if (i8 == iArr[i9]) {
                    iArr[i9] = EMPTY;
                    i10++;
                }
                if (i9 != i10) {
                    iArr[i9] = iArr[i10];
                }
                i10++;
                i9++;
            }
        }

        public int size() {
            return this.mCount;
        }

        public CustomAttribute valueAt(int i8) {
            return this.mValues[this.mKeys[i8]];
        }
    }

    public static class CustomVar {
        private static final int EMPTY = 999;
        int mCount;
        int[] mKeys = new int[101];
        CustomVariable[] mValues = new CustomVariable[101];

        public CustomVar() {
            clear();
        }

        public void append(int i8, CustomVariable customVariable) {
            if (this.mValues[i8] != null) {
                remove(i8);
            }
            this.mValues[i8] = customVariable;
            int[] iArr = this.mKeys;
            int i9 = this.mCount;
            this.mCount = i9 + 1;
            iArr[i9] = i8;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.mKeys, EMPTY);
            Arrays.fill(this.mValues, (Object) null);
            this.mCount = 0;
        }

        public void dump() {
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.mKeys, this.mCount)));
            printStream.print("K: [");
            int i8 = 0;
            while (i8 < this.mCount) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i8 == 0 ? "" : ", ");
                sb.append(valueAt(i8));
                printStream2.print(sb.toString());
                i8++;
            }
            System.out.println("]");
        }

        public int keyAt(int i8) {
            return this.mKeys[i8];
        }

        public void remove(int i8) {
            this.mValues[i8] = null;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                int i11 = this.mCount;
                if (i9 >= i11) {
                    this.mCount = i11 - 1;
                    return;
                }
                int[] iArr = this.mKeys;
                if (i8 == iArr[i9]) {
                    iArr[i9] = EMPTY;
                    i10++;
                }
                if (i9 != i10) {
                    iArr[i9] = iArr[i10];
                }
                i10++;
                i9++;
            }
        }

        public int size() {
            return this.mCount;
        }

        public CustomVariable valueAt(int i8) {
            return this.mValues[this.mKeys[i8]];
        }
    }

    static class FloatArray {
        private static final int EMPTY = 999;
        int mCount;
        int[] mKeys = new int[101];
        float[][] mValues = new float[101][];

        FloatArray() {
            clear();
        }

        public void append(int i8, float[] fArr) {
            if (this.mValues[i8] != null) {
                remove(i8);
            }
            this.mValues[i8] = fArr;
            int[] iArr = this.mKeys;
            int i9 = this.mCount;
            this.mCount = i9 + 1;
            iArr[i9] = i8;
            Arrays.sort(iArr);
        }

        public void clear() {
            Arrays.fill(this.mKeys, EMPTY);
            Arrays.fill(this.mValues, (Object) null);
            this.mCount = 0;
        }

        public void dump() {
            PrintStream printStream = System.out;
            printStream.println("V: " + Arrays.toString(Arrays.copyOf(this.mKeys, this.mCount)));
            printStream.print("K: [");
            int i8 = 0;
            while (i8 < this.mCount) {
                PrintStream printStream2 = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append(i8 == 0 ? "" : ", ");
                sb.append(Arrays.toString(valueAt(i8)));
                printStream2.print(sb.toString());
                i8++;
            }
            System.out.println("]");
        }

        public int keyAt(int i8) {
            return this.mKeys[i8];
        }

        public void remove(int i8) {
            this.mValues[i8] = null;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                int i11 = this.mCount;
                if (i9 >= i11) {
                    this.mCount = i11 - 1;
                    return;
                }
                int[] iArr = this.mKeys;
                if (i8 == iArr[i9]) {
                    iArr[i9] = EMPTY;
                    i10++;
                }
                if (i9 != i10) {
                    iArr[i9] = iArr[i10];
                }
                i10++;
                i9++;
            }
        }

        public int size() {
            return this.mCount;
        }

        public float[] valueAt(int i8) {
            return this.mValues[this.mKeys[i8]];
        }
    }
}
