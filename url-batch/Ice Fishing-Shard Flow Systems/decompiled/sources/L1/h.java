package L1;

import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* loaded from: classes.dex */
public final class h extends IntegrityTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    public final String f1678a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f1679b;

    public h(String str, Long l7) {
        this.f1678a = str;
        this.f1679b = l7;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long a() {
        return this.f1679b;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String b() {
        return this.f1678a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z7;
        Long l7;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (this.f1678a.equals(integrityTokenRequest.b()) && ((l7 = this.f1679b) != null ? l7.equals(integrityTokenRequest.a()) : integrityTokenRequest.a() == null)) {
                z7 = true;
                if (obj instanceof h) {
                    return z7;
                }
                h hVar = (h) obj;
                if (!z7) {
                    return false;
                }
                hVar.getClass();
                return true;
            }
        }
        z7 = false;
        if (obj instanceof h) {
        }
    }

    public final int hashCode() {
        int hashCode = this.f1678a.hashCode() ^ 1000003;
        Long l7 = this.f1679b;
        return ((hashCode * 1000003) ^ (l7 == null ? 0 : l7.hashCode())) * 1000003;
    }

    public final String toString() {
        return ("IntegrityTokenRequest{nonce=" + this.f1678a + ", cloudProjectNumber=" + this.f1679b).concat(", network=null").concat("}");
    }
}
