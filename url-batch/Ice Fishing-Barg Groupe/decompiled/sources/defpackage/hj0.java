package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class hj0 implements Iterable, fu0 {
    public static final gj0 Companion = new gj0();
    public static final hj0 OPXfSBeufaJ8 = new hj0(new String[0]);
    public final String[] rtx2ld2ELZv4;

    public hj0(String[] strArr) {
        strArr.getClass();
        this.rtx2ld2ELZv4 = strArr;
    }

    public final String PxuCJdSBwIXG(String str) {
        String[] strArr = this.rtx2ld2ELZv4;
        strArr.getClass();
        int length = strArr.length - 2;
        int aF05bpZJlKEP = kj0.aF05bpZJlKEP(length, 0, -2);
        if (aF05bpZJlKEP > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == aF05bpZJlKEP) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final jd0 TSizfFm2Yiuu() {
        jd0 jd0Var = new jd0(1);
        ArrayList arrayList = jd0Var.PxuCJdSBwIXG;
        arrayList.getClass();
        String[] strArr = this.rtx2ld2ELZv4;
        strArr.getClass();
        List asList = Arrays.asList(strArr);
        asList.getClass();
        arrayList.addAll(asList);
        return jd0Var;
    }

    public final String Y1f8riQaR6yg(int i) {
        String str = (String) na.cJeY36nTk9tz((i * 2) + 1, this.rtx2ld2ELZv4);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hj0) {
            return Arrays.equals(this.rtx2ld2ELZv4, ((hj0) obj).rtx2ld2ELZv4);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.rtx2ld2ELZv4);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        vi1[] vi1VarArr = new vi1[size];
        for (int i = 0; i < size; i++) {
            vi1VarArr[i] = new vi1(lS5Rgt96tfkO(i), Y1f8riQaR6yg(i));
        }
        return new ZbWwgt3aGe7A(vi1VarArr);
    }

    public final String lS5Rgt96tfkO(int i) {
        String str = (String) na.cJeY36nTk9tz(i * 2, this.rtx2ld2ELZv4);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    public final int size() {
        return this.rtx2ld2ELZv4.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String lS5Rgt96tfkO = lS5Rgt96tfkO(i);
            String Y1f8riQaR6yg = Y1f8riQaR6yg(i);
            sb.append(lS5Rgt96tfkO);
            sb.append(": ");
            if (kv2.wdg6QnbFHrFF(lS5Rgt96tfkO)) {
                Y1f8riQaR6yg = "██";
            }
            sb.append(Y1f8riQaR6yg);
            sb.append("\n");
        }
        return sb.toString();
    }
}
