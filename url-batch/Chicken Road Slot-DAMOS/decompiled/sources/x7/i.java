package x7;

import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i extends IntegrityTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    public final String f10536a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f10537b;

    public i(String str, Long l10) {
        this.f10536a = str;
        this.f10537b = l10;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long a() {
        return this.f10537b;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String b() {
        return this.f10536a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        boolean z10;
        Long l10;
        if (obj != this) {
            if (obj instanceof IntegrityTokenRequest) {
                IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
                if (this.f10536a.equals(integrityTokenRequest.b()) && ((l10 = this.f10537b) != null ? l10.equals(integrityTokenRequest.a()) : integrityTokenRequest.a() == null)) {
                    z10 = true;
                    if (obj instanceof i) {
                        return z10;
                    }
                    if (!z10) {
                        return false;
                    }
                }
            }
            z10 = false;
            if (obj instanceof i) {
            }
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f10536a.hashCode() ^ 1000003;
        Long l10 = this.f10537b;
        return ((hashCode * 1000003) ^ (l10 == null ? 0 : l10.hashCode())) * 1000003;
    }

    public final String toString() {
        return ("IntegrityTokenRequest{nonce=" + this.f10536a + ", cloudProjectNumber=" + this.f10537b).concat(", network=null").concat("}");
    }
}
