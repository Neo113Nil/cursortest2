package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zb0 implements sl2 {
    public final Context a;

    public zb0(Context context) {
        this.a = context;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zb0) {
            return Intrinsics.b(this.a, ((zb0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.sl2
    public final Object i(a72 a72Var) {
        DisplayMetrics displayMetrics = this.a.getResources().getDisplayMetrics();
        gb0 gb0Var = new gb0(Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels));
        return new pl2(gb0Var, gb0Var);
    }
}
