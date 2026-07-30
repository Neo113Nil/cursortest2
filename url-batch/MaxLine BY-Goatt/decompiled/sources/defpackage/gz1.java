package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gz1 implements Iterable, k71 {
    public static final gz1 n = new gz1(mi1.c());
    public final Map m;

    public gz1(Map map) {
        this.m = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gz1) {
            return Intrinsics.b(this.m, ((gz1) obj).m);
        }
        return false;
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Map map = this.m;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (entry.getValue() != null) {
                b71.o();
                return null;
            }
            arrayList.add(new Pair(str, null));
        }
        return arrayList.iterator();
    }

    public final String toString() {
        return "Parameters(entries=" + this.m + ')';
    }
}
