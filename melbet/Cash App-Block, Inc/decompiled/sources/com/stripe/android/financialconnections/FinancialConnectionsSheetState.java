package com.stripe.android.financialconnections;

import com.datadog.trace.core.util.GlobPattern;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetActivityArgs;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class FinancialConnectionsSheetState {
    public final boolean activityRecreated;
    public final FinancialConnectionsSheetActivityArgs initialArgs;
    public final FinancialConnectionsSessionManifest manifest;
    public final GlobPattern viewEffect;
    public final AuthFlowStatus webAuthFlowStatus;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AuthFlowStatus {
        public static final /* synthetic */ AuthFlowStatus[] $VALUES;
        public static final AuthFlowStatus INTERMEDIATE_DEEPLINK;
        public static final AuthFlowStatus NONE;
        public static final AuthFlowStatus ON_EXTERNAL_ACTIVITY;

        static {
            AuthFlowStatus authFlowStatus = new AuthFlowStatus("ON_EXTERNAL_ACTIVITY", 0);
            ON_EXTERNAL_ACTIVITY = authFlowStatus;
            AuthFlowStatus authFlowStatus2 = new AuthFlowStatus("INTERMEDIATE_DEEPLINK", 1);
            INTERMEDIATE_DEEPLINK = authFlowStatus2;
            AuthFlowStatus authFlowStatus3 = new AuthFlowStatus("NONE", 2);
            NONE = authFlowStatus3;
            $VALUES = new AuthFlowStatus[]{authFlowStatus, authFlowStatus2, authFlowStatus3};
        }

        public static AuthFlowStatus valueOf(String str) {
            return (AuthFlowStatus) Enum.valueOf(AuthFlowStatus.class, str);
        }

        public static AuthFlowStatus[] values() {
            return (AuthFlowStatus[]) $VALUES.clone();
        }
    }

    public FinancialConnectionsSheetState(FinancialConnectionsSheetActivityArgs financialConnectionsSheetActivityArgs, boolean z, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, AuthFlowStatus authFlowStatus, GlobPattern globPattern) {
        this.initialArgs = financialConnectionsSheetActivityArgs;
        this.activityRecreated = z;
        this.manifest = financialConnectionsSessionManifest;
        this.webAuthFlowStatus = authFlowStatus;
        this.viewEffect = globPattern;
    }

    public static FinancialConnectionsSheetState copy$default(FinancialConnectionsSheetState financialConnectionsSheetState, boolean z, FinancialConnectionsSessionManifest financialConnectionsSessionManifest, AuthFlowStatus authFlowStatus, GlobPattern globPattern, int i) {
        boolean z2 = z;
        FinancialConnectionsSheetActivityArgs financialConnectionsSheetActivityArgs = financialConnectionsSheetState.initialArgs;
        if ((i & 2) != 0) {
            z2 = financialConnectionsSheetState.activityRecreated;
        }
        if ((i & 4) != 0) {
            financialConnectionsSessionManifest = financialConnectionsSheetState.manifest;
        }
        if ((i & 8) != 0) {
            authFlowStatus = financialConnectionsSheetState.webAuthFlowStatus;
        }
        if ((i & 16) != 0) {
            globPattern = financialConnectionsSheetState.viewEffect;
        }
        GlobPattern globPattern2 = globPattern;
        financialConnectionsSheetState.getClass();
        AuthFlowStatus authFlowStatus2 = authFlowStatus;
        return new FinancialConnectionsSheetState(financialConnectionsSheetActivityArgs, z2, financialConnectionsSessionManifest, authFlowStatus2, globPattern2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinancialConnectionsSheetState)) {
            return false;
        }
        FinancialConnectionsSheetState financialConnectionsSheetState = (FinancialConnectionsSheetState) obj;
        return this.initialArgs.equals(financialConnectionsSheetState.initialArgs) && this.activityRecreated == financialConnectionsSheetState.activityRecreated && Intrinsics.areEqual(this.manifest, financialConnectionsSheetState.manifest) && this.webAuthFlowStatus == financialConnectionsSheetState.webAuthFlowStatus && Intrinsics.areEqual(this.viewEffect, financialConnectionsSheetState.viewEffect);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.initialArgs.hashCode() * 31, 31, this.activityRecreated);
        FinancialConnectionsSessionManifest financialConnectionsSessionManifest = this.manifest;
        int hashCode = (this.webAuthFlowStatus.hashCode() + ((m + (financialConnectionsSessionManifest == null ? 0 : financialConnectionsSessionManifest.hashCode())) * 31)) * 31;
        GlobPattern globPattern = this.viewEffect;
        return hashCode + (globPattern != null ? globPattern.hashCode() : 0);
    }

    public final String toString() {
        return "FinancialConnectionsSheetState(initialArgs=" + this.initialArgs + ", activityRecreated=" + this.activityRecreated + ", manifest=" + this.manifest + ", webAuthFlowStatus=" + this.webAuthFlowStatus + ", viewEffect=" + this.viewEffect + ")";
    }
}
