package com.stripe.android.financialconnections.features.partnerauth;

import bo.app.re$$ExternalSyntheticOutline0;
import com.stripe.android.financialconnections.model.FinancialConnectionsAuthorizationSession;
import com.stripe.android.financialconnections.model.FinancialConnectionsInstitution;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.presentation.Async;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class SharedPartnerAuthState {
    public final Async authenticationStatus;
    public final boolean inModal;
    public final FinancialConnectionsSessionManifest.Pane pane;
    public final Async payload;
    public final ViewEffect viewEffect;

    public final class AuthenticationStatus {
        public final Action action;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Action {
            public static final /* synthetic */ Action[] $VALUES;
            public static final Action AUTHENTICATING;
            public static final Action CANCELLING;

            static {
                Action action = new Action("CANCELLING", 0);
                CANCELLING = action;
                Action action2 = new Action("AUTHENTICATING", 1);
                AUTHENTICATING = action2;
                $VALUES = new Action[]{action, action2};
            }

            public static Action valueOf(String str) {
                return (Action) Enum.valueOf(Action.class, str);
            }

            public static Action[] values() {
                return (Action[]) $VALUES.clone();
            }
        }

        public AuthenticationStatus(Action action) {
            this.action = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AuthenticationStatus) && this.action == ((AuthenticationStatus) obj).action;
        }

        public final int hashCode() {
            return this.action.hashCode();
        }

        public final String toString() {
            return "AuthenticationStatus(action=" + this.action + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ClickableText {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ ClickableText[] $VALUES;

        static {
            ClickableText[] clickableTextArr = {new ClickableText("DATA", 0)};
            $VALUES = clickableTextArr;
            $ENTRIES = new EnumEntriesList(clickableTextArr);
        }

        public static ClickableText valueOf(String str) {
            return (ClickableText) Enum.valueOf(ClickableText.class, str);
        }

        public static ClickableText[] values() {
            return (ClickableText[]) $VALUES.clone();
        }
    }

    public final class Payload {
        public final FinancialConnectionsAuthorizationSession authSession;
        public final FinancialConnectionsInstitution institution;
        public final boolean isStripeDirect;

        public Payload(boolean z, FinancialConnectionsInstitution financialConnectionsInstitution, FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession) {
            financialConnectionsInstitution.getClass();
            financialConnectionsAuthorizationSession.getClass();
            this.isStripeDirect = z;
            this.institution = financialConnectionsInstitution;
            this.authSession = financialConnectionsAuthorizationSession;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payload)) {
                return false;
            }
            Payload payload = (Payload) obj;
            return this.isStripeDirect == payload.isStripeDirect && Intrinsics.areEqual(this.institution, payload.institution) && Intrinsics.areEqual(this.authSession, payload.authSession);
        }

        public final int hashCode() {
            return this.authSession.hashCode() + ((this.institution.hashCode() + (Boolean.hashCode(this.isStripeDirect) * 31)) * 31);
        }

        public final String toString() {
            return "Payload(isStripeDirect=" + this.isStripeDirect + ", institution=" + this.institution + ", authSession=" + this.authSession + ")";
        }
    }

    public interface ViewEffect {

        public final class OpenPartnerAuth implements ViewEffect {
            public final String url;

            public OpenPartnerAuth(String str) {
                this.url = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenPartnerAuth) && this.url.equals(((OpenPartnerAuth) obj).url);
            }

            public final int hashCode() {
                return this.url.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("OpenPartnerAuth(url=", this.url, ")");
            }
        }

        /* loaded from: classes7.dex */
        public final class OpenUrl implements ViewEffect {
            public final long id;
            public final String url;

            public OpenUrl(String str, long j) {
                str.getClass();
                this.url = str;
                this.id = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenUrl)) {
                    return false;
                }
                OpenUrl openUrl = (OpenUrl) obj;
                return Intrinsics.areEqual(this.url, openUrl.url) && this.id == openUrl.id;
            }

            public final int hashCode() {
                return Long.hashCode(this.id) + (this.url.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder m = re$$ExternalSyntheticOutline0.m("OpenUrl(url=", this.url, ", id=", this.id);
                m.append(")");
                return m.toString();
            }
        }
    }

    public SharedPartnerAuthState(FinancialConnectionsSessionManifest.Pane pane, Async async, ViewEffect viewEffect, Async async2, boolean z) {
        pane.getClass();
        async.getClass();
        async2.getClass();
        this.pane = pane;
        this.payload = async;
        this.viewEffect = viewEffect;
        this.authenticationStatus = async2;
        this.inModal = z;
    }

    public static SharedPartnerAuthState copy$default(SharedPartnerAuthState sharedPartnerAuthState, Async async, ViewEffect viewEffect, Async async2, int i) {
        FinancialConnectionsSessionManifest.Pane pane = sharedPartnerAuthState.pane;
        if ((i & 2) != 0) {
            async = sharedPartnerAuthState.payload;
        }
        Async async3 = async;
        if ((i & 4) != 0) {
            viewEffect = sharedPartnerAuthState.viewEffect;
        }
        ViewEffect viewEffect2 = viewEffect;
        if ((i & 8) != 0) {
            async2 = sharedPartnerAuthState.authenticationStatus;
        }
        Async async4 = async2;
        boolean z = sharedPartnerAuthState.inModal;
        sharedPartnerAuthState.getClass();
        pane.getClass();
        async3.getClass();
        async4.getClass();
        return new SharedPartnerAuthState(pane, async3, viewEffect2, async4, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedPartnerAuthState)) {
            return false;
        }
        SharedPartnerAuthState sharedPartnerAuthState = (SharedPartnerAuthState) obj;
        return this.pane == sharedPartnerAuthState.pane && Intrinsics.areEqual(this.payload, sharedPartnerAuthState.payload) && Intrinsics.areEqual(this.viewEffect, sharedPartnerAuthState.viewEffect) && Intrinsics.areEqual(this.authenticationStatus, sharedPartnerAuthState.authenticationStatus) && this.inModal == sharedPartnerAuthState.inModal;
    }

    public final int hashCode() {
        int hashCode = (this.payload.hashCode() + (this.pane.hashCode() * 31)) * 31;
        ViewEffect viewEffect = this.viewEffect;
        return Boolean.hashCode(this.inModal) + ((this.authenticationStatus.hashCode() + ((hashCode + (viewEffect == null ? 0 : viewEffect.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SharedPartnerAuthState(pane=");
        sb.append(this.pane);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", viewEffect=");
        sb.append(this.viewEffect);
        sb.append(", authenticationStatus=");
        sb.append(this.authenticationStatus);
        sb.append(", inModal=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.inModal, ")");
    }
}
