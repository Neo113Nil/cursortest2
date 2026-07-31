package k1;

import j1.e;
import j1.h;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import l4.d;
import o2.z;

/* loaded from: classes.dex */
public final class b extends h {
    private static j1.a c(z zVar) {
        zVar.r(12);
        int d7 = (zVar.d() + zVar.h(12)) - 4;
        zVar.r(44);
        zVar.s(zVar.h(12));
        zVar.r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (zVar.d() >= d7) {
                break;
            }
            zVar.r(48);
            int h7 = zVar.h(8);
            zVar.r(4);
            int d8 = zVar.d() + zVar.h(12);
            String str2 = null;
            while (zVar.d() < d8) {
                int h8 = zVar.h(8);
                int h9 = zVar.h(8);
                int d9 = zVar.d() + h9;
                if (h8 == 2) {
                    int h10 = zVar.h(16);
                    zVar.r(8);
                    if (h10 == 3) {
                        while (zVar.d() < d9) {
                            str = zVar.l(zVar.h(8), d.f18612a);
                            int h11 = zVar.h(8);
                            for (int i7 = 0; i7 < h11; i7++) {
                                zVar.s(zVar.h(8));
                            }
                        }
                    }
                } else if (h8 == 21) {
                    str2 = zVar.l(h9, d.f18612a);
                }
                zVar.p(d9 * 8);
            }
            zVar.p(d8 * 8);
            if (str != null && str2 != null) {
                arrayList.add(new a(h7, str + str2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new j1.a(arrayList);
    }

    @Override // j1.h
    protected j1.a b(e eVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return c(new z(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
