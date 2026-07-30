package defpackage;

import android.util.Base64;
import com.google.firebase.encoders.json.BuildConfig;
import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class gm {
    public final String a;
    public final byte[] b;
    public final y42 c;

    public gm(String str, byte[] bArr, y42 y42Var) {
        this.a = str;
        this.b = bArr;
        this.c = y42Var;
    }

    public static mh a() {
        mh mhVar = new mh(3, false);
        mhVar.p = y42.m;
        return mhVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gm) {
            gm gmVar = (gm) obj;
            if (this.a.equals(gmVar.a) && Arrays.equals(this.b, gmVar.b) && this.c.equals(gmVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.b;
        String encodeToString = bArr == null ? BuildConfig.FLAVOR : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return q40.p(sb, encodeToString, ")");
    }
}
