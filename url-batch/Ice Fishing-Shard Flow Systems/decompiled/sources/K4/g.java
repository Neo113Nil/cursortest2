package K4;

/* loaded from: classes.dex */
public interface g {
    static g a(M4.a aVar) {
        Object obj;
        int i2 = 0;
        while (true) {
            Object[] objArr = aVar.f1743a;
            if (i2 >= objArr.length) {
                obj = null;
                break;
            }
            if (objArr[i2] == i.f1462a) {
                obj = objArr[i2 + 1];
                break;
            }
            i2 += 2;
        }
        g gVar = (g) obj;
        return gVar == null ? f.f1460b : gVar;
    }
}
