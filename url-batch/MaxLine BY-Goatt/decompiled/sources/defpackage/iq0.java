package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class iq0 {
    public final ArrayList a;

    public iq0(hq0... hq0VarArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (hq0VarArr.length > 0) {
            hq0 hq0Var = hq0VarArr[0];
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() != 1) {
                StringBuilder sb = new StringBuilder("'");
                sb.append(str);
                sb.append("' must be unique. Actual [ [");
                lh.c(in1.m(sb, zv.A(list, null, null, null, null, 63), ']'));
                throw null;
            }
            vv.o(list, arrayList);
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.a = arrayList2;
        if (arrayList2.size() <= 0) {
            return;
        }
        arrayList2.get(0).getClass();
        b71.o();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof iq0) {
            return Intrinsics.b(this.a, ((iq0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
