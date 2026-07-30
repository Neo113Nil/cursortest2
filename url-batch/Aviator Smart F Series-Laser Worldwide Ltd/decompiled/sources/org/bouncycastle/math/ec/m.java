package org.bouncycastle.math.ec;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class m {
    public static final String PRECOMP_NAME = "bc_fixed_point";

    static class a implements p {
        final /* synthetic */ e val$c;
        final /* synthetic */ i val$p;

        a(e eVar, i iVar) {
            this.val$c = eVar;
            this.val$p = iVar;
        }

        private boolean checkExisting(l lVar, int i8) {
            return lVar != null && checkTable(lVar.getLookupTable(), i8);
        }

        private boolean checkTable(g gVar, int i8) {
            return gVar != null && gVar.getSize() >= i8;
        }

        @Override // org.bouncycastle.math.ec.p
        public q precompute(q qVar) {
            l lVar = qVar instanceof l ? (l) qVar : null;
            int combSize = m.getCombSize(this.val$c);
            int i8 = combSize > 250 ? 6 : 5;
            int i9 = 1 << i8;
            if (checkExisting(lVar, i9)) {
                return lVar;
            }
            int i10 = ((combSize + i8) - 1) / i8;
            i[] iVarArr = new i[i8 + 1];
            iVarArr[0] = this.val$p;
            for (int i11 = 1; i11 < i8; i11++) {
                iVarArr[i11] = iVarArr[i11 - 1].timesPow2(i10);
            }
            iVarArr[i8] = iVarArr[0].subtract(iVarArr[1]);
            this.val$c.normalizeAll(iVarArr);
            i[] iVarArr2 = new i[i9];
            iVarArr2[0] = iVarArr[0];
            for (int i12 = i8 - 1; i12 >= 0; i12--) {
                i iVar = iVarArr[i12];
                int i13 = 1 << i12;
                for (int i14 = i13; i14 < i9; i14 += i13 << 1) {
                    iVarArr2[i14] = iVarArr2[i14 - i13].add(iVar);
                }
            }
            this.val$c.normalizeAll(iVarArr2);
            l lVar2 = new l();
            lVar2.setLookupTable(this.val$c.createCacheSafeLookupTable(iVarArr2, 0, i9));
            lVar2.setOffset(iVarArr[i8]);
            lVar2.setWidth(i8);
            return lVar2;
        }
    }

    public static int getCombSize(e eVar) {
        BigInteger order = eVar.getOrder();
        return order == null ? eVar.getFieldSize() + 1 : order.bitLength();
    }

    public static l getFixedPointPreCompInfo(q qVar) {
        if (qVar instanceof l) {
            return (l) qVar;
        }
        return null;
    }

    public static l precompute(i iVar) {
        e curve = iVar.getCurve();
        return (l) curve.precompute(iVar, PRECOMP_NAME, new a(curve, iVar));
    }
}
