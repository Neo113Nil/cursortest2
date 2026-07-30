package defpackage;

import com.google.firebase.encoders.json.BuildConfig;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xw implements vl1 {
    public final vl1 a;
    public final vl1 b;

    public xw(vl1 vl1Var, vl1 vl1Var2) {
        this.a = vl1Var;
        this.b = vl1Var2;
    }

    @Override // defpackage.vl1
    public final boolean b(Function1 function1) {
        return this.a.b(function1) && this.b.b(function1);
    }

    @Override // defpackage.vl1
    public final Object d(Object obj, Function2 function2) {
        return this.b.d(this.a.d(obj, function2), function2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xw)) {
            return false;
        }
        xw xwVar = (xw) obj;
        return this.a.equals(xwVar.a) && Intrinsics.b(this.b, xwVar.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return in1.m(new StringBuilder("["), (String) d(BuildConfig.FLAVOR, sc.p), ']');
    }
}
