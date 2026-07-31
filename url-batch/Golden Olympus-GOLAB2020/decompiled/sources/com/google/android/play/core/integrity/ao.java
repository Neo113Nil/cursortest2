package com.google.android.play.core.integrity;

/* loaded from: classes.dex */
final class ao extends IntegrityTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    private final String f13508a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f13509b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f13510c = null;

    /* synthetic */ ao(String str, Long l4, Object obj, an anVar) {
        this.f13508a = str;
        this.f13509b = l4;
    }

    private static boolean a() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f13509b;
    }

    public final boolean equals(Object obj) {
        boolean z4;
        Long l4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (this.f13508a.equals(integrityTokenRequest.nonce()) && ((l4 = this.f13509b) != null ? l4.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() == null)) {
                z4 = true;
                if ((obj instanceof ao) || !a()) {
                    return z4;
                }
                ao aoVar = (ao) obj;
                if (!z4) {
                    return false;
                }
                Object obj2 = aoVar.f13510c;
                return true;
            }
        }
        z4 = false;
        if (obj instanceof ao) {
        }
        return z4;
    }

    public final int hashCode() {
        int hashCode = this.f13508a.hashCode() ^ 1000003;
        Long l4 = this.f13509b;
        int hashCode2 = (hashCode * 1000003) ^ (l4 == null ? 0 : l4.hashCode());
        return a() ? hashCode2 * 1000003 : hashCode2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f13508a;
    }

    public final String toString() {
        String str = "IntegrityTokenRequest{nonce=" + this.f13508a + ", cloudProjectNumber=" + this.f13509b;
        if (a()) {
            str = str.concat(", network=null");
        }
        return str.concat("}");
    }
}
