package Y2;

import G0.C0051a;
import a3.C0182a;

/* loaded from: classes.dex */
public interface g {
    static g a(C0182a c0182a) {
        Object obj;
        C0051a c0051a = i.f3695a;
        int i2 = 0;
        while (true) {
            Object[] objArr = c0182a.f3859a;
            if (i2 >= objArr.length) {
                obj = null;
                break;
            }
            if (objArr[i2] == c0051a) {
                obj = objArr[i2 + 1];
                break;
            }
            i2 += 2;
        }
        g gVar = (g) obj;
        return gVar == null ? f.f3693b : gVar;
    }
}
