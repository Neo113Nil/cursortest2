package com.stripe.android.financialconnections.domain;

import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class PollAuthorizationSessionAccountsKt$WhenMappings {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[FinancialConnectionsAuthorizationSession.Flow.values().length];
        try {
            iArr[FinancialConnectionsAuthorizationSession.Flow.TESTMODE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FinancialConnectionsAuthorizationSession.Flow.TESTMODE_OAUTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FinancialConnectionsAuthorizationSession.Flow.TESTMODE_OAUTH_WEBVIEW.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FinancialConnectionsAuthorizationSession.Flow.FINICITY_CONNECT_V2_LITE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[FinancialConnectionsAuthorizationSession.Flow.MX_CONNECT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
