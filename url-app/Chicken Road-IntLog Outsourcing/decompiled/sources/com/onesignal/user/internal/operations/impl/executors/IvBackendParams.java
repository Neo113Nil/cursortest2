package com.onesignal.user.internal.operations.impl.executors;

import B0.o;
import com.onesignal.user.internal.backend.IdentityConstants;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class IvBackendParams {
    public static final Companion Companion = new Companion(null);
    private final String aliasLabel;
    private final String aliasValue;
    private final String jwt;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final IvBackendParams legacyFor(String onesignalId) {
            i.e(onesignalId, "onesignalId");
            return new IvBackendParams(IdentityConstants.ONESIGNAL_ID, onesignalId, null);
        }

        private Companion() {
        }
    }

    public IvBackendParams(String aliasLabel, String aliasValue, String str) {
        i.e(aliasLabel, "aliasLabel");
        i.e(aliasValue, "aliasValue");
        this.aliasLabel = aliasLabel;
        this.aliasValue = aliasValue;
        this.jwt = str;
    }

    public static /* synthetic */ IvBackendParams copy$default(IvBackendParams ivBackendParams, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = ivBackendParams.aliasLabel;
        }
        if ((i2 & 2) != 0) {
            str2 = ivBackendParams.aliasValue;
        }
        if ((i2 & 4) != 0) {
            str3 = ivBackendParams.jwt;
        }
        return ivBackendParams.copy(str, str2, str3);
    }

    public final String component1() {
        return this.aliasLabel;
    }

    public final String component2() {
        return this.aliasValue;
    }

    public final String component3() {
        return this.jwt;
    }

    public final IvBackendParams copy(String aliasLabel, String aliasValue, String str) {
        i.e(aliasLabel, "aliasLabel");
        i.e(aliasValue, "aliasValue");
        return new IvBackendParams(aliasLabel, aliasValue, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IvBackendParams)) {
            return false;
        }
        IvBackendParams ivBackendParams = (IvBackendParams) obj;
        return i.a(this.aliasLabel, ivBackendParams.aliasLabel) && i.a(this.aliasValue, ivBackendParams.aliasValue) && i.a(this.jwt, ivBackendParams.jwt);
    }

    public final String getAliasLabel() {
        return this.aliasLabel;
    }

    public final String getAliasValue() {
        return this.aliasValue;
    }

    public final String getJwt() {
        return this.jwt;
    }

    public int hashCode() {
        int f3 = o.f(this.aliasValue, this.aliasLabel.hashCode() * 31, 31);
        String str = this.jwt;
        return f3 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IvBackendParams(aliasLabel=");
        sb.append(this.aliasLabel);
        sb.append(", aliasValue=");
        sb.append(this.aliasValue);
        sb.append(", jwt=");
        return o.l(sb, this.jwt, ')');
    }
}
