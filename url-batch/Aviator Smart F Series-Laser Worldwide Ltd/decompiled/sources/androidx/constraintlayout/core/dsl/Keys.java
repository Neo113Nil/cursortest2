package androidx.constraintlayout.core.dsl;

import java.util.Arrays;

/* loaded from: classes.dex */
public class Keys {
    protected void append(StringBuilder sb, String str, int i8) {
        if (i8 != Integer.MIN_VALUE) {
            sb.append(str);
            sb.append(":'");
            sb.append(i8);
            sb.append("',\n");
        }
    }

    protected String unpack(String[] strArr) {
        StringBuilder sb = new StringBuilder("[");
        int i8 = 0;
        while (i8 < strArr.length) {
            sb.append(i8 == 0 ? "'" : ",'");
            sb.append(strArr[i8]);
            sb.append("'");
            i8++;
        }
        sb.append("]");
        return sb.toString();
    }

    protected void append(StringBuilder sb, String str, String str2) {
        if (str2 != null) {
            sb.append(str);
            sb.append(":'");
            sb.append(str2);
            sb.append("',\n");
        }
    }

    protected void append(StringBuilder sb, String str, float f8) {
        if (Float.isNaN(f8)) {
            return;
        }
        sb.append(str);
        sb.append(":");
        sb.append(f8);
        sb.append(",\n");
    }

    protected void append(StringBuilder sb, String str, String[] strArr) {
        if (strArr != null) {
            sb.append(str);
            sb.append(":");
            sb.append(unpack(strArr));
            sb.append(",\n");
        }
    }

    protected void append(StringBuilder sb, String str, float[] fArr) {
        if (fArr != null) {
            sb.append(str);
            sb.append("percentWidth:");
            sb.append(Arrays.toString(fArr));
            sb.append(",\n");
        }
    }
}
