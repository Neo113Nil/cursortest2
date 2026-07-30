package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class hz extends RuntimeException {
    public final so rtx2ld2ELZv4;

    public hz(so soVar) {
        this.rtx2ld2ELZv4 = soVar;
        if (soVar.lS5Rgt96tfkO) {
            return;
        }
        int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
        List list = soVar.PxuCJdSBwIXG;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            uo uoVar = (uo) list.get(i);
            if (!na.jJwa0q7P5wHq(iArr, uoVar.PxuCJdSBwIXG)) {
                if (uoVar.PxuCJdSBwIXG == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((uo) list.get(i3)).PxuCJdSBwIXG == 1000) {
                        break;
                    } else {
                        el.X1HMmH2Ks65g(arrayList);
                    }
                } else {
                    arrayList.add(uoVar);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", "m$" + ((uo) arrayList.get(i4)).PxuCJdSBwIXG, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        so soVar = this.rtx2ld2ELZv4;
        if (!soVar.lS5Rgt96tfkO) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        z11 BjEWd04qc7Mw = fx1.BjEWd04qc7Mw();
        List list = soVar.PxuCJdSBwIXG;
        list.getClass();
        y41 y41Var = new y41(list);
        int PxuCJdSBwIXG = y41Var.PxuCJdSBwIXG();
        for (int i = 0; i < PxuCJdSBwIXG; i++) {
            ((uo) y41Var.get(i)).getClass();
        }
        z11 ZbWwgt3aGe7A = fx1.ZbWwgt3aGe7A(BjEWd04qc7Mw);
        ZbWwgt3aGe7A.getClass();
        y41 y41Var2 = new y41(ZbWwgt3aGe7A);
        int PxuCJdSBwIXG2 = y41Var2.PxuCJdSBwIXG();
        for (int i2 = 0; i2 < PxuCJdSBwIXG2; i2++) {
            String str = (String) y41Var2.get(i2);
            sb.append("\tat ");
            sb.append(str);
            sb.append('\n');
        }
        return sb.toString();
    }
}
