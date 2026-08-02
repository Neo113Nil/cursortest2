package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.stripe.android.core.model.serializers.EnumIgnoreUnknownSerializer;
import com.stripe.android.financialconnections.model.Cta;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;
import okhttp3.internal.Tags;

@Serializable
/* loaded from: classes8.dex */
public final class FinancialConnectionsAuthorizationSession implements Parcelable {
    public final Boolean _isOAuth;
    public final Display display;
    public final String flow;
    public final String id;
    public final Boolean institutionSkipAccountSelection;
    public final FinancialConnectionsSessionManifest.Pane nextPane;
    public final Boolean showPartnerDisclosure;
    public final Boolean skipAccountSelection;
    public final String url;
    public final String urlQrCode;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<FinancialConnectionsAuthorizationSession> CREATOR = new Cta.Creator(17);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return FinancialConnectionsAuthorizationSession$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000b\nB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b ¨\u0006!"}, d2 = {"com/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow", "", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion", "Serializer", "DIRECT", "DIRECT_WEBVIEW", "FINICITY_CONNECT_V2_FIX", "FINICITY_CONNECT_V2_LITE", "FINICITY_CONNECT_V2_OAUTH", "FINICITY_CONNECT_V2_OAUTH_REDIRECT", "FINICITY_CONNECT_V2_OAUTH_WEBVIEW", "MX_CONNECT", "MX_OAUTH", "MX_OAUTH_APP2APP", "MX_OAUTH_REDIRECT", "MX_OAUTH_WEBVIEW", "TESTMODE", "TESTMODE_OAUTH", "TESTMODE_OAUTH_WEBVIEW", "TRUELAYER_OAUTH", "TRUELAYER_OAUTH_HANDOFF", "TRUELAYER_OAUTH_WEBVIEW", "WELLS_FARGO", "WELLS_FARGO_WEBVIEW", "UNKNOWN", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @Serializable(with = Serializer.class)
    public final class Flow {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Flow[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;

        @SerialName("direct")
        public static final Flow DIRECT = new Flow("DIRECT", 0, "direct");

        @SerialName("direct_webview")
        public static final Flow DIRECT_WEBVIEW = new Flow("DIRECT_WEBVIEW", 1, "direct_webview");

        @SerialName("finicity_connect_v2_fix")
        public static final Flow FINICITY_CONNECT_V2_FIX = new Flow("FINICITY_CONNECT_V2_FIX", 2, "finicity_connect_v2_fix");

        @SerialName("finicity_connect_v2_lite")
        public static final Flow FINICITY_CONNECT_V2_LITE = new Flow("FINICITY_CONNECT_V2_LITE", 3, "finicity_connect_v2_lite");

        @SerialName("finicity_connect_v2_oauth")
        public static final Flow FINICITY_CONNECT_V2_OAUTH = new Flow("FINICITY_CONNECT_V2_OAUTH", 4, "finicity_connect_v2_oauth");

        @SerialName("finicity_connect_v2_oauth_redirect")
        public static final Flow FINICITY_CONNECT_V2_OAUTH_REDIRECT = new Flow("FINICITY_CONNECT_V2_OAUTH_REDIRECT", 5, "finicity_connect_v2_oauth_redirect");

        @SerialName("finicity_connect_v2_oauth_webview")
        public static final Flow FINICITY_CONNECT_V2_OAUTH_WEBVIEW = new Flow("FINICITY_CONNECT_V2_OAUTH_WEBVIEW", 6, "finicity_connect_v2_oauth_webview");

        @SerialName("mx_connect")
        public static final Flow MX_CONNECT = new Flow("MX_CONNECT", 7, "mx_connect");

        @SerialName("mx_oauth")
        public static final Flow MX_OAUTH = new Flow("MX_OAUTH", 8, "mx_oauth");

        @SerialName("mx_oauth_app_to_app")
        public static final Flow MX_OAUTH_APP2APP = new Flow("MX_OAUTH_APP2APP", 9, "mx_oauth_app_to_app");

        @SerialName("mx_oauth_redirect")
        public static final Flow MX_OAUTH_REDIRECT = new Flow("MX_OAUTH_REDIRECT", 10, "mx_oauth_redirect");

        @SerialName("mx_oauth_webview")
        public static final Flow MX_OAUTH_WEBVIEW = new Flow("MX_OAUTH_WEBVIEW", 11, "mx_oauth_webview");

        @SerialName("testmode")
        public static final Flow TESTMODE = new Flow("TESTMODE", 12, "testmode");

        @SerialName("testmode_oauth")
        public static final Flow TESTMODE_OAUTH = new Flow("TESTMODE_OAUTH", 13, "testmode_oauth");

        @SerialName("testmode_oauth_webview")
        public static final Flow TESTMODE_OAUTH_WEBVIEW = new Flow("TESTMODE_OAUTH_WEBVIEW", 14, "testmode_oauth_webview");

        @SerialName("truelayer_oauth")
        public static final Flow TRUELAYER_OAUTH = new Flow("TRUELAYER_OAUTH", 15, "truelayer_oauth");

        @SerialName("truelayer_oauth_handoff")
        public static final Flow TRUELAYER_OAUTH_HANDOFF = new Flow("TRUELAYER_OAUTH_HANDOFF", 16, "truelayer_oauth_handoff");

        @SerialName("truelayer_oauth_webview")
        public static final Flow TRUELAYER_OAUTH_WEBVIEW = new Flow("TRUELAYER_OAUTH_WEBVIEW", 17, "truelayer_oauth_webview");

        @SerialName("wells_fargo")
        public static final Flow WELLS_FARGO = new Flow("WELLS_FARGO", 18, "wells_fargo");

        @SerialName("wells_fargo_webview")
        public static final Flow WELLS_FARGO_WEBVIEW = new Flow("WELLS_FARGO_WEBVIEW", 19, "wells_fargo_webview");

        @SerialName("unknown")
        public static final Flow UNKNOWN = new Flow("UNKNOWN", 20, "unknown");

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsAuthorizationSession$Flow;", "serializer", "()Lkotlinx/serialization/KSerializer;", "financial-connections_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer serializer() {
                return Serializer.INSTANCE;
            }
        }

        public final class Serializer extends EnumIgnoreUnknownSerializer {
            public static final Serializer INSTANCE = new Serializer((Enum[]) Flow.getEntries().toArray(new Flow[0]), Flow.UNKNOWN);
        }

        private static final /* synthetic */ Flow[] $values() {
            return new Flow[]{DIRECT, DIRECT_WEBVIEW, FINICITY_CONNECT_V2_FIX, FINICITY_CONNECT_V2_LITE, FINICITY_CONNECT_V2_OAUTH, FINICITY_CONNECT_V2_OAUTH_REDIRECT, FINICITY_CONNECT_V2_OAUTH_WEBVIEW, MX_CONNECT, MX_OAUTH, MX_OAUTH_APP2APP, MX_OAUTH_REDIRECT, MX_OAUTH_WEBVIEW, TESTMODE, TESTMODE_OAUTH, TESTMODE_OAUTH_WEBVIEW, TRUELAYER_OAUTH, TRUELAYER_OAUTH_HANDOFF, TRUELAYER_OAUTH_WEBVIEW, WELLS_FARGO, WELLS_FARGO_WEBVIEW, UNKNOWN};
        }

        static {
            Flow[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion();
        }

        private Flow(String str, int i, String str2) {
            this.value = str2;
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Flow valueOf(String str) {
            return (Flow) Enum.valueOf(Flow.class, str);
        }

        public static Flow[] values() {
            return (Flow[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    public /* synthetic */ FinancialConnectionsAuthorizationSession(int i, String str, FinancialConnectionsSessionManifest.Pane pane, String str2, Boolean bool, Boolean bool2, Boolean bool3, String str3, String str4, Boolean bool4, Display display) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, FinancialConnectionsAuthorizationSession$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        this.nextPane = pane;
        if ((i & 4) == 0) {
            this.flow = null;
        } else {
            this.flow = str2;
        }
        if ((i & 8) == 0) {
            this.institutionSkipAccountSelection = null;
        } else {
            this.institutionSkipAccountSelection = bool;
        }
        if ((i & 16) == 0) {
            this.showPartnerDisclosure = null;
        } else {
            this.showPartnerDisclosure = bool2;
        }
        if ((i & 32) == 0) {
            this.skipAccountSelection = null;
        } else {
            this.skipAccountSelection = bool3;
        }
        if ((i & 64) == 0) {
            this.url = null;
        } else {
            this.url = str3;
        }
        if ((i & 128) == 0) {
            this.urlQrCode = null;
        } else {
            this.urlQrCode = str4;
        }
        if ((i & 256) == 0) {
            this._isOAuth = Boolean.FALSE;
        } else {
            this._isOAuth = bool4;
        }
        if ((i & 512) == 0) {
            this.display = null;
        } else {
            this.display = display;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinancialConnectionsAuthorizationSession)) {
            return false;
        }
        FinancialConnectionsAuthorizationSession financialConnectionsAuthorizationSession = (FinancialConnectionsAuthorizationSession) obj;
        return Intrinsics.areEqual(this.id, financialConnectionsAuthorizationSession.id) && this.nextPane == financialConnectionsAuthorizationSession.nextPane && Intrinsics.areEqual(this.flow, financialConnectionsAuthorizationSession.flow) && Intrinsics.areEqual(this.institutionSkipAccountSelection, financialConnectionsAuthorizationSession.institutionSkipAccountSelection) && Intrinsics.areEqual(this.showPartnerDisclosure, financialConnectionsAuthorizationSession.showPartnerDisclosure) && Intrinsics.areEqual(this.skipAccountSelection, financialConnectionsAuthorizationSession.skipAccountSelection) && Intrinsics.areEqual(this.url, financialConnectionsAuthorizationSession.url) && Intrinsics.areEqual(this.urlQrCode, financialConnectionsAuthorizationSession.urlQrCode) && Intrinsics.areEqual(this._isOAuth, financialConnectionsAuthorizationSession._isOAuth) && Intrinsics.areEqual(this.display, financialConnectionsAuthorizationSession.display);
    }

    public final int hashCode() {
        int hashCode = (this.nextPane.hashCode() + (this.id.hashCode() * 31)) * 31;
        String str = this.flow;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.institutionSkipAccountSelection;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.showPartnerDisclosure;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.skipAccountSelection;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str2 = this.url;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.urlQrCode;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool4 = this._isOAuth;
        int hashCode8 = (hashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Display display = this.display;
        return hashCode8 + (display != null ? display.hashCode() : 0);
    }

    public final boolean isOAuth() {
        Boolean bool = this._isOAuth;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FinancialConnectionsAuthorizationSession(id=");
        sb.append(this.id);
        sb.append(", nextPane=");
        sb.append(this.nextPane);
        sb.append(", flow=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.flow, ", institutionSkipAccountSelection=", this.institutionSkipAccountSelection, ", showPartnerDisclosure=");
        Thread$State$EnumUnboxingLocalUtility.m(sb, this.showPartnerDisclosure, ", skipAccountSelection=", this.skipAccountSelection, ", url=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.url, ", urlQrCode=", this.urlQrCode, ", _isOAuth=");
        sb.append(this._isOAuth);
        sb.append(", display=");
        sb.append(this.display);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.nextPane.name());
        parcel.writeString(this.flow);
        Boolean bool = this.institutionSkipAccountSelection;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool);
        }
        Boolean bool2 = this.showPartnerDisclosure;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool2);
        }
        Boolean bool3 = this.skipAccountSelection;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool3);
        }
        parcel.writeString(this.url);
        parcel.writeString(this.urlQrCode);
        Boolean bool4 = this._isOAuth;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool4);
        }
        Display display = this.display;
        if (display == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            display.writeToParcel(parcel, i);
        }
    }

    public FinancialConnectionsAuthorizationSession(String str, FinancialConnectionsSessionManifest.Pane pane, String str2, Boolean bool, Boolean bool2, Boolean bool3, String str3, String str4, Boolean bool4, Display display) {
        str.getClass();
        pane.getClass();
        this.id = str;
        this.nextPane = pane;
        this.flow = str2;
        this.institutionSkipAccountSelection = bool;
        this.showPartnerDisclosure = bool2;
        this.skipAccountSelection = bool3;
        this.url = str3;
        this.urlQrCode = str4;
        this._isOAuth = bool4;
        this.display = display;
    }
}
