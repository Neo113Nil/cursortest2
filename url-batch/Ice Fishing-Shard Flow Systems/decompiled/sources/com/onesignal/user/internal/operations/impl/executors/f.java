package com.onesignal.user.internal.operations.impl.executors;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {
    public static final a Companion = new a(null);
    private final String aliasLabel;
    private final String aliasValue;
    private final String jwt;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f legacyFor(String onesignalId) {
            Intrinsics.checkNotNullParameter(onesignalId, "onesignalId");
            return new f("onesignal_id", onesignalId, null);
        }

        private a() {
        }
    }

    public f(String aliasLabel, String aliasValue, String str) {
        Intrinsics.checkNotNullParameter(aliasLabel, "aliasLabel");
        Intrinsics.checkNotNullParameter(aliasValue, "aliasValue");
        this.aliasLabel = aliasLabel;
        this.aliasValue = aliasValue;
        this.jwt = str;
    }

    public static /* synthetic */ f copy$default(f fVar, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = fVar.aliasLabel;
        }
        if ((i2 & 2) != 0) {
            str2 = fVar.aliasValue;
        }
        if ((i2 & 4) != 0) {
            str3 = fVar.jwt;
        }
        return fVar.copy(str, str2, str3);
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

    public final f copy(String aliasLabel, String aliasValue, String str) {
        Intrinsics.checkNotNullParameter(aliasLabel, "aliasLabel");
        Intrinsics.checkNotNullParameter(aliasValue, "aliasValue");
        return new f(aliasLabel, aliasValue, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.a(this.aliasLabel, fVar.aliasLabel) && Intrinsics.a(this.aliasValue, fVar.aliasValue) && Intrinsics.a(this.jwt, fVar.jwt);
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
        int e7 = C4.p.e(this.aliasValue, this.aliasLabel.hashCode() * 31, 31);
        String str = this.jwt;
        return e7 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "IvBackendParams(aliasLabel=" + this.aliasLabel + ", aliasValue=" + this.aliasValue + ", jwt=" + this.jwt + ')';
    }
}
