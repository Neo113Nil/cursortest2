package defpackage;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sb3 implements kc3 {
    public final boolean m;

    public sb3(Boolean bool) {
        this.m = bool == null ? false : bool.booleanValue();
    }

    @Override // defpackage.kc3
    public final Boolean a() {
        return Boolean.valueOf(this.m);
    }

    @Override // defpackage.kc3
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sb3) && this.m == ((sb3) obj).m;
    }

    @Override // defpackage.kc3
    public final Double f() {
        return Double.valueOf(true != this.m ? 0.0d : 1.0d);
    }

    public final int hashCode() {
        return Boolean.valueOf(this.m).hashCode();
    }

    @Override // defpackage.kc3
    public final kc3 j(String str, js0 js0Var, ArrayList arrayList) {
        boolean equals = InAppPurchaseConstants.METHOD_TO_STRING.equals(str);
        boolean z = this.m;
        if (equals) {
            return new pc3(Boolean.toString(z));
        }
        throw new IllegalArgumentException(Boolean.toString(z) + "." + str + " is not a function.");
    }

    @Override // defpackage.kc3
    public final kc3 k() {
        return new sb3(Boolean.valueOf(this.m));
    }

    public final String toString() {
        return String.valueOf(this.m);
    }

    @Override // defpackage.kc3
    public final String zzc() {
        return Boolean.toString(this.m);
    }
}
