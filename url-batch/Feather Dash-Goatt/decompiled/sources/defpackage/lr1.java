package defpackage;

import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class lr1 extends IntegrityTokenRequest {
    public final String a;
    public final Long b;

    public lr1(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long a() {
        return this.b;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String b() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z;
        Long l;
        if (obj != this) {
            if (obj instanceof IntegrityTokenRequest) {
                IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
                if (this.a.equals(integrityTokenRequest.b()) && ((l = this.b) != null ? l.equals(integrityTokenRequest.a()) : integrityTokenRequest.a() == null)) {
                    z = true;
                    if (obj instanceof lr1) {
                        return z;
                    }
                    if (!z) {
                        return false;
                    }
                }
            }
            z = false;
            if (obj instanceof lr1) {
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        Long l = this.b;
        return ((l == null ? 0 : l.hashCode()) ^ (hashCode * 1000003)) * 1000003;
    }

    public final String toString() {
        return ("IntegrityTokenRequest{nonce=" + this.a + ", cloudProjectNumber=" + this.b).concat(", network=null").concat("}");
    }
}
