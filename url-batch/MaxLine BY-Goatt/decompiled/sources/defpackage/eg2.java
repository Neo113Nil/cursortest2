package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class eg2 {
    public final String a;
    public final List b;
    public final List c;

    public eg2(String str, List list, List list2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eg2)) {
            return false;
        }
        eg2 eg2Var = (eg2) obj;
        return Intrinsics.b(this.a, eg2Var.a) && Intrinsics.b(this.b, eg2Var.b) && Intrinsics.b(this.c, eg2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SearchUiState(query=" + this.a + ", atlas=" + this.b + ", jewelry=" + this.c + ")";
    }
}
