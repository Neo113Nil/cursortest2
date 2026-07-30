package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gz2 {
    public final fk0 a;
    public final boolean b;
    public final Map c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Map] */
    public /* synthetic */ gz2(fk0 fk0Var, ap apVar, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : fk0Var, (i & 8) != 0 ? null : apVar, (i & 16) == 0, (i & 32) != 0 ? mi1.c() : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz2)) {
            return false;
        }
        gz2 gz2Var = (gz2) obj;
        return Intrinsics.b(this.a, gz2Var.a) && Intrinsics.b(null, null) && this.b == gz2Var.b && Intrinsics.b(this.c, gz2Var.c);
    }

    public final int hashCode() {
        fk0 fk0Var = this.a;
        return this.c.hashCode() + in1.i((((fk0Var == null ? 0 : fk0Var.hashCode()) * 29791) + 0) * 31, 31, this.b);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.a + ", slide=null, changeSize=null, scale=" + ((Object) null) + ", hold=" + this.b + ", effectsMap=" + this.c + ')';
    }

    public gz2(fk0 fk0Var, ap apVar, boolean z, Map map) {
        this.a = fk0Var;
        this.b = z;
        this.c = map;
    }
}
