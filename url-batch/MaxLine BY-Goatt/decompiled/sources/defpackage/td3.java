package defpackage;

import com.google.firebase.encoders.json.BuildConfig;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class td3 {
    public static final /* synthetic */ int b = 0;
    public final int a;

    public td3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof td3)) {
            return false;
        }
        int i = ((td3) obj).a;
        int i2 = this.a;
        if (i2 != 0) {
            return i2 == i;
        }
        throw null;
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return ((i ^ (-485106924)) * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i = this.a;
        String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        StringBuilder sb = new StringBuilder("READ_AND_WRITE".length() + str.length() + BuildConfig.FLAVOR.length() + 73 + 91 + 1);
        sb.append("FileComplianceOptions{fileOwner=, hasDifferentDmaOwner=false, fileChecks=");
        sb.append(str);
        sb.append(", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=");
        sb.append("READ_AND_WRITE");
        sb.append("}");
        return sb.toString();
    }
}
