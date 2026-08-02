package org.bouncycastle.math.ec.tools;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.util.Strings;

/* loaded from: classes9.dex */
public class F2mSqrtOptimizer {
    private static List enumToList(Enumeration enumeration) {
        ArrayList arrayList = new ArrayList();
        while (enumeration.hasMoreElements()) {
            arrayList.add(enumeration.nextElement());
        }
        return arrayList;
    }

    private static void implPrintRootZ(ECCurve eCCurve) {
        ECFieldElement fromBigInteger = eCCurve.fromBigInteger(BigInteger.valueOf(2L));
        ECFieldElement sqrt = fromBigInteger.sqrt();
        System.out.println(Strings.toUpperCase(sqrt.toBigInteger().toString(16)));
        if (sqrt.square().equals(fromBigInteger)) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Optimized-sqrt sanity check failed");
    }

    public static void main(String[] strArr) {
        TreeSet treeSet = new TreeSet(enumToList(ECNamedCurveTable.getNames()));
        treeSet.addAll(enumToList(CustomNamedCurves.getNames()));
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            X9ECParametersHolder byNameLazy = CustomNamedCurves.getByNameLazy(str);
            if (byNameLazy == null) {
                byNameLazy = ECNamedCurveTable.getByNameLazy(str);
            }
            if (byNameLazy != null) {
                ECCurve curve = byNameLazy.getCurve();
                if (ECAlgorithms.isF2mCurve(curve)) {
                    System.out.print(str + ":");
                    implPrintRootZ(curve);
                }
            }
        }
    }

    public static void printRootZ(ECCurve eCCurve) {
        if (ECAlgorithms.isF2mCurve(eCCurve)) {
            implPrintRootZ(eCCurve);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Sqrt optimization only defined over characteristic-2 fields");
        }
    }
}
