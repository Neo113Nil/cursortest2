package com.onesignal.user.internal.operations.impl.executors;

import t0.AbstractC5051n;

/* loaded from: classes2.dex */
public final class f {
    public static final a Companion = new a(null);
    private final String aliasLabel;
    private final String aliasValue;
    private final String jwt;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final f legacyFor(String onesignalId) {
            kotlin.jvm.internal.h.e(onesignalId, "onesignalId");
            return new f("onesignal_id", onesignalId, null);
        }

        private a() {
        }
    }

    public f(String aliasLabel, String aliasValue, String str) {
        kotlin.jvm.internal.h.e(aliasLabel, "aliasLabel");
        kotlin.jvm.internal.h.e(aliasValue, "aliasValue");
        this.aliasLabel = aliasLabel;
        this.aliasValue = aliasValue;
        this.jwt = str;
    }

    public static /* synthetic */ f copy$default(f fVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fVar.aliasLabel;
        }
        if ((i & 2) != 0) {
            str2 = fVar.aliasValue;
        }
        if ((i & 4) != 0) {
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
        kotlin.jvm.internal.h.e(aliasLabel, "aliasLabel");
        kotlin.jvm.internal.h.e(aliasValue, "aliasValue");
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
        return kotlin.jvm.internal.h.a(this.aliasLabel, fVar.aliasLabel) && kotlin.jvm.internal.h.a(this.aliasValue, fVar.aliasValue) && kotlin.jvm.internal.h.a(this.jwt, fVar.jwt);
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
        int k6 = AbstractC5051n.k(this.aliasLabel.hashCode() * 31, 31, this.aliasValue);
        String str = this.jwt;
        return k6 + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "IvBackendParams(aliasLabel=" + this.aliasLabel + ", aliasValue=" + this.aliasValue + ", jwt=" + this.jwt + ')';
    }
}
