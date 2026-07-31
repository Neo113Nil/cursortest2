package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;

/* loaded from: classes12.dex */
public class KeyFrameArray {

    static class FloatArray {
    }

    public static class CustomArray {
        int count;
        int[] keys;
        CustomAttribute[] values;

        public int size() {
            return this.count;
        }

        public CustomAttribute valueAt(int i) {
            return this.values[this.keys[i]];
        }

        public int keyAt(int i) {
            return this.keys[i];
        }
    }

    public static class CustomVar {
        int count;
        int[] keys;
        CustomVariable[] values;

        public int size() {
            return this.count;
        }

        public CustomVariable valueAt(int i) {
            return this.values[this.keys[i]];
        }

        public int keyAt(int i) {
            return this.keys[i];
        }
    }
}
