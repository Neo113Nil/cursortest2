package m2;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;
import m2.v;
import m4.q;
import n2.g0;
import r0.w3;
import t1.x0;
import t1.z0;

/* loaded from: classes.dex */
public final class b0 {
    public static w3 a(v.a aVar, List<? extends w>[] listArr) {
        boolean z6;
        q.a aVar2 = new q.a();
        for (int i7 = 0; i7 < aVar.d(); i7++) {
            z0 f7 = aVar.f(i7);
            List<? extends w> list = listArr[i7];
            for (int i8 = 0; i8 < f7.f22275f; i8++) {
                x0 b7 = f7.b(i8);
                boolean z7 = aVar.a(i7, i8, false) != 0;
                int i9 = b7.f22259f;
                int[] iArr = new int[i9];
                boolean[] zArr = new boolean[i9];
                for (int i10 = 0; i10 < b7.f22259f; i10++) {
                    iArr[i10] = aVar.g(i7, i8, i10);
                    int i11 = 0;
                    while (true) {
                        if (i11 >= list.size()) {
                            z6 = false;
                            break;
                        }
                        w wVar = list.get(i11);
                        if (wVar.c().equals(b7) && wVar.e(i10) != -1) {
                            z6 = true;
                            break;
                        }
                        i11++;
                    }
                    zArr[i10] = z6;
                }
                aVar2.a(new w3.a(b7, z7, iArr, zArr));
            }
        }
        z0 h7 = aVar.h();
        for (int i12 = 0; i12 < h7.f22275f; i12++) {
            x0 b8 = h7.b(i12);
            int[] iArr2 = new int[b8.f22259f];
            Arrays.fill(iArr2, 0);
            aVar2.a(new w3.a(b8, false, iArr2, new boolean[b8.f22259f]));
        }
        return new w3(aVar2.h());
    }

    public static w3 b(v.a aVar, w[] wVarArr) {
        List[] listArr = new List[wVarArr.length];
        for (int i7 = 0; i7 < wVarArr.length; i7++) {
            w wVar = wVarArr[i7];
            listArr[i7] = wVar != null ? m4.q.y(wVar) : m4.q.x();
        }
        return a(aVar, listArr);
    }

    public static g0.a c(t tVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = tVar.length();
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            if (tVar.i(i8, elapsedRealtime)) {
                i7++;
            }
        }
        return new g0.a(1, 0, length, i7);
    }
}
