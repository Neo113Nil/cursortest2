package com.onesignal.user.internal.operations.impl.executors;

import com.onesignal.core.BuildConfig;
import com.onesignal.user.internal.backend.IdentityConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExecutorsIvExtensions.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0016"}, d2 = {"Lcom/onesignal/user/internal/operations/impl/executors/IvBackendParams;", "", "aliasLabel", "", "aliasValue", "jwt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAliasLabel", "()Ljava/lang/String;", "getAliasValue", "getJwt", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class IvBackendParams {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String aliasLabel;
    private final String aliasValue;
    private final String jwt;

    public static /* synthetic */ IvBackendParams copy$default(IvBackendParams ivBackendParams, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ivBackendParams.aliasLabel;
        }
        if ((i & 2) != 0) {
            str2 = ivBackendParams.aliasValue;
        }
        if ((i & 4) != 0) {
            str3 = ivBackendParams.jwt;
        }
        return ivBackendParams.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAliasLabel() {
        return this.aliasLabel;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAliasValue() {
        return this.aliasValue;
    }

    /* renamed from: component3, reason: from getter */
    public final String getJwt() {
        return this.jwt;
    }

    public final IvBackendParams copy(String aliasLabel, String aliasValue, String jwt) {
        Intrinsics.checkNotNullParameter(aliasLabel, "aliasLabel");
        Intrinsics.checkNotNullParameter(aliasValue, "aliasValue");
        return new IvBackendParams(aliasLabel, aliasValue, jwt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IvBackendParams)) {
            return false;
        }
        IvBackendParams ivBackendParams = (IvBackendParams) other;
        return Intrinsics.areEqual(this.aliasLabel, ivBackendParams.aliasLabel) && Intrinsics.areEqual(this.aliasValue, ivBackendParams.aliasValue) && Intrinsics.areEqual(this.jwt, ivBackendParams.jwt);
    }

    public int hashCode() {
        int hashCode = ((this.aliasLabel.hashCode() * 31) + this.aliasValue.hashCode()) * 31;
        String str = this.jwt;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "IvBackendParams(aliasLabel=" + this.aliasLabel + ", aliasValue=" + this.aliasValue + ", jwt=" + this.jwt + ')';
    }

    public IvBackendParams(String aliasLabel, String aliasValue, String str) {
        Intrinsics.checkNotNullParameter(aliasLabel, "aliasLabel");
        Intrinsics.checkNotNullParameter(aliasValue, "aliasValue");
        this.aliasLabel = aliasLabel;
        this.aliasValue = aliasValue;
        this.jwt = str;
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

    /* compiled from: ExecutorsIvExtensions.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/onesignal/user/internal/operations/impl/executors/IvBackendParams$Companion;", "", "()V", "legacyFor", "Lcom/onesignal/user/internal/operations/impl/executors/IvBackendParams;", "onesignalId", "", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final IvBackendParams legacyFor(String onesignalId) {
            Intrinsics.checkNotNullParameter(onesignalId, "onesignalId");
            return new IvBackendParams(IdentityConstants.ONESIGNAL_ID, onesignalId, null);
        }
    }
}
