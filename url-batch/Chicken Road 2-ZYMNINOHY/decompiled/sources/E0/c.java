package E0;

import W.u;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: c, reason: collision with root package name */
    public long f468c;

    /* renamed from: d, reason: collision with root package name */
    public long[] f469d;

    /* renamed from: e, reason: collision with root package name */
    public long[] f470e;

    public static Serializable h(int i4, u uVar) {
        if (i4 == 0) {
            return Double.valueOf(Double.longBitsToDouble(uVar.t()));
        }
        if (i4 == 1) {
            return Boolean.valueOf(uVar.z() == 1);
        }
        if (i4 == 2) {
            return j(uVar);
        }
        if (i4 != 3) {
            if (i4 == 8) {
                return i(uVar);
            }
            if (i4 != 10) {
                if (i4 != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(uVar.t()));
                uVar.N(2);
                return date;
            }
            int D3 = uVar.D();
            ArrayList arrayList = new ArrayList(D3);
            for (int i5 = 0; i5 < D3; i5++) {
                Serializable h2 = h(uVar.z(), uVar);
                if (h2 != null) {
                    arrayList.add(h2);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String j4 = j(uVar);
            int z = uVar.z();
            if (z == 9) {
                return hashMap;
            }
            Serializable h4 = h(z, uVar);
            if (h4 != null) {
                hashMap.put(j4, h4);
            }
        }
    }

    public static HashMap i(u uVar) {
        int D3 = uVar.D();
        HashMap hashMap = new HashMap(D3);
        for (int i4 = 0; i4 < D3; i4++) {
            String j4 = j(uVar);
            Serializable h2 = h(uVar.z(), uVar);
            if (h2 != null) {
                hashMap.put(j4, h2);
            }
        }
        return hashMap;
    }

    public static String j(u uVar) {
        int G4 = uVar.G();
        int i4 = uVar.f3352b;
        uVar.N(G4);
        return new String(uVar.f3351a, i4, G4);
    }
}
