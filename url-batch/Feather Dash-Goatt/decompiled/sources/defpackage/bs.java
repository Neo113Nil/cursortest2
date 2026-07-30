package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class bs extends RuntimeException {
    public final vk d;

    public bs(vk vkVar) {
        this.d = vkVar;
        if (vkVar.a()) {
            return;
        }
        ArrayList H = yr1.H(vkVar);
        int size = H.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size];
        for (int i = 0; i < size; i++) {
            stackTraceElementArr[i] = new StackTraceElement("$$compose", "m$" + ((wk) H.get(i)).a, "SourceFile", 1);
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
        vk vkVar = this.d;
        if (!vkVar.a()) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        int i = 0;
        if (vkVar.a()) {
            vh0 vh0Var = new vh0(0, 1, null);
            List list = vkVar.a;
            list.getClass();
            jk0 jk0Var = new jk0(list);
            int a = jk0Var.a();
            for (int i2 = 0; i2 < a; i2++) {
                ((wk) jk0Var.get(i2)).getClass();
            }
            vh0 a2 = yh.a(vh0Var);
            a2.getClass();
            jk0 jk0Var2 = new jk0(a2);
            int a3 = jk0Var2.a();
            while (i < a3) {
                String str = (String) jk0Var2.get(i);
                sb.append("\tat ");
                sb.append(str);
                sb.append('\n');
                i++;
            }
        } else {
            ArrayList H = yr1.H(vkVar);
            int size = H.size();
            while (i < size) {
                wk wkVar = (wk) H.get(i);
                sb.append("\tat $$compose.m$");
                sb.append(wkVar.a);
                sb.append("(SourceFile:1)\n");
                i++;
            }
        }
        return sb.toString();
    }
}
