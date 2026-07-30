package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class i50 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof i50) {
            return Intrinsics.b(this.a, ((i50) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.a + ')';
    }
}
