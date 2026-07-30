package defpackage;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bk1 {
    public final Bitmap a;
    public final Map b;

    public bk1(Bitmap bitmap, Map map) {
        this.a = bitmap;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk1)) {
            return false;
        }
        bk1 bk1Var = (bk1) obj;
        return this.a.equals(bk1Var.a) && Intrinsics.b(this.b, bk1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.a + ", extras=" + this.b + ')';
    }
}
