package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ilm {
    public static final jin a(jin[] jinVarArr, int i) {
        List<jin> K = ixc.K(jinVarArr);
        int size = K.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            return (jin) ixc.j(K);
        }
        if (size != 2) {
            throw new IllegalArgumentException("Can't combine more than 2 TrailingContent elements");
        }
        ArrayList arrayList = new ArrayList(ixc.w(K));
        for (jin jinVar : K) {
            jip jipVar = jinVar instanceof jip ? (jip) jinVar : null;
            if (jipVar == null) {
                throw new IllegalArgumentException("Can't combine Trailing content with an existing TrailingContentPair");
            }
            arrayList.add(jipVar);
        }
        return new jio((jip) arrayList.get(0), (jip) arrayList.get(1), i);
    }
}
