package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.Card;
import com.stripe.hcaptcha.HCaptchaHtmlKt$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.noties.markwon.LinkResolverDef;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.TuplesKt;
import net.idrnd.face.iad.capture.Plane;
import okhttp3.internal.Tags;

@Serializable
/* loaded from: classes8.dex */
public final class ConsumerSession implements StripeModel {
    public static final Lazy[] $childSerializers;
    public final String clientSecret;
    public final AuthenticationLevel currentAuthenticationLevel;
    public final String emailAddress;
    public final LinkBrand linkBrand;
    public final AuthenticationLevel minimumAuthenticationLevel;
    public final MobileFallbackWebviewParams mobileFallbackWebviewParams;
    public final String phoneNumberCountry;
    public final String redactedFormattedPhoneNumber;
    public final String redactedPhoneNumber;
    public final String unredactedPhoneNumber;
    public final List verificationSessions;
    public static final Companion Companion = new Companion();
    public static final Parcelable.Creator<ConsumerSession> CREATOR = new Card.Creator(25);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0017B\u0019\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bj\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"com/stripe/android/model/ConsumerSession$AuthenticationLevel", "Landroid/os/Parcelable;", "", "Lcom/stripe/android/model/ConsumerSession$AuthenticationLevel;", "", "value", "", "sortOrder", "<init>", "(Ljava/lang/String;ILjava/lang/String;I)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "I", "getSortOrder", "Companion", "Unknown", "NotAuthenticated", "OneFactorAuthentication", "TwoFactorAuthentication", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @Serializable
    public final class AuthenticationLevel implements Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AuthenticationLevel[] $VALUES;
        private static final Lazy<KSerializer> $cachedSerializer$delegate;
        public static final Parcelable.Creator<AuthenticationLevel> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int sortOrder;
        private final String value;
        public static final AuthenticationLevel Unknown = new AuthenticationLevel("Unknown", 0, "", -1);
        public static final AuthenticationLevel NotAuthenticated = new AuthenticationLevel("NotAuthenticated", 1, "not_authenticated", 0);
        public static final AuthenticationLevel OneFactorAuthentication = new AuthenticationLevel("OneFactorAuthentication", 2, "1fa", 1);
        public static final AuthenticationLevel TwoFactorAuthentication = new AuthenticationLevel("TwoFactorAuthentication", 3, "2fa", 2);

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/stripe/android/model/ConsumerSession$AuthenticationLevel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/model/ConsumerSession$AuthenticationLevel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public static AuthenticationLevel fromValue(String str) {
                Object obj;
                Iterator<E> it = AuthenticationLevel.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (StringsKt__StringsJVMKt.equals(((AuthenticationLevel) obj).getValue(), str, true)) {
                        break;
                    }
                }
                AuthenticationLevel authenticationLevel = (AuthenticationLevel) obj;
                return authenticationLevel == null ? AuthenticationLevel.Unknown : authenticationLevel;
            }

            public final KSerializer serializer() {
                return (KSerializer) AuthenticationLevel.$cachedSerializer$delegate.getValue();
            }
        }

        private static final /* synthetic */ AuthenticationLevel[] $values() {
            return new AuthenticationLevel[]{Unknown, NotAuthenticated, OneFactorAuthentication, TwoFactorAuthentication};
        }

        static {
            AuthenticationLevel[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion();
            CREATOR = new Card.Creator(24);
            $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new ConsumerSession$$ExternalSyntheticLambda0(29));
        }

        private AuthenticationLevel(String str, int i, String str2, int i2) {
            this.value = str2;
            this.sortOrder = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final KSerializer _init_$_anonymous_() {
            AuthenticationLevel[] values = values();
            values.getClass();
            return new EnumSerializer("com.stripe.android.model.ConsumerSession.AuthenticationLevel", (Enum[]) values);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static AuthenticationLevel valueOf(String str) {
            return (AuthenticationLevel) Enum.valueOf(AuthenticationLevel.class, str);
        }

        public static AuthenticationLevel[] values() {
            return (AuthenticationLevel[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final int getSortOrder() {
            return this.sortOrder;
        }

        public final String getValue() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(name());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/model/ConsumerSession$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/model/ConsumerSession;", "serializer", "()Lkotlinx/serialization/KSerializer;", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return ConsumerSession$$serializer.INSTANCE;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        $childSerializers = new Lazy[]{null, null, null, null, null, null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ConsumerSession$$ExternalSyntheticLambda0(0)), null, LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ConsumerSession$$ExternalSyntheticLambda0(27)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new ConsumerSession$$ExternalSyntheticLambda0(28)), null};
    }

    public ConsumerSession(int i, String str, String str2, String str3, String str4, String str5, String str6, List list, MobileFallbackWebviewParams mobileFallbackWebviewParams, AuthenticationLevel authenticationLevel, AuthenticationLevel authenticationLevel2, LinkBrand linkBrand) {
        if (14 != (i & 14)) {
            TuplesKt.throwMissingFieldException(i, 14, ConsumerSession$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.clientSecret = (i & 1) == 0 ? "" : str;
        this.emailAddress = str2;
        this.redactedFormattedPhoneNumber = str3;
        this.redactedPhoneNumber = str4;
        if ((i & 16) == 0) {
            this.unredactedPhoneNumber = null;
        } else {
            this.unredactedPhoneNumber = str5;
        }
        if ((i & 32) == 0) {
            this.phoneNumberCountry = null;
        } else {
            this.phoneNumberCountry = str6;
        }
        if ((i & 64) == 0) {
            this.verificationSessions = EmptyList.INSTANCE;
        } else {
            this.verificationSessions = list;
        }
        if ((i & 128) == 0) {
            this.mobileFallbackWebviewParams = null;
        } else {
            this.mobileFallbackWebviewParams = mobileFallbackWebviewParams;
        }
        if ((i & 256) == 0) {
            this.currentAuthenticationLevel = null;
        } else {
            this.currentAuthenticationLevel = authenticationLevel;
        }
        if ((i & 512) == 0) {
            this.minimumAuthenticationLevel = null;
        } else {
            this.minimumAuthenticationLevel = authenticationLevel2;
        }
        if ((i & 1024) == 0) {
            this.linkBrand = null;
        } else {
            this.linkBrand = linkBrand;
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
        if (!(obj instanceof ConsumerSession)) {
            return false;
        }
        ConsumerSession consumerSession = (ConsumerSession) obj;
        return Intrinsics.areEqual(this.clientSecret, consumerSession.clientSecret) && Intrinsics.areEqual(this.emailAddress, consumerSession.emailAddress) && Intrinsics.areEqual(this.redactedFormattedPhoneNumber, consumerSession.redactedFormattedPhoneNumber) && Intrinsics.areEqual(this.redactedPhoneNumber, consumerSession.redactedPhoneNumber) && Intrinsics.areEqual(this.unredactedPhoneNumber, consumerSession.unredactedPhoneNumber) && Intrinsics.areEqual(this.phoneNumberCountry, consumerSession.phoneNumberCountry) && Intrinsics.areEqual(this.verificationSessions, consumerSession.verificationSessions) && Intrinsics.areEqual(this.mobileFallbackWebviewParams, consumerSession.mobileFallbackWebviewParams) && this.currentAuthenticationLevel == consumerSession.currentAuthenticationLevel && this.minimumAuthenticationLevel == consumerSession.minimumAuthenticationLevel && this.linkBrand == consumerSession.linkBrand;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.clientSecret.hashCode() * 31, 31, this.emailAddress), 31, this.redactedFormattedPhoneNumber), 31, this.redactedPhoneNumber);
        String str = this.unredactedPhoneNumber;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phoneNumberCountry;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.verificationSessions);
        MobileFallbackWebviewParams mobileFallbackWebviewParams = this.mobileFallbackWebviewParams;
        int hashCode2 = (m2 + (mobileFallbackWebviewParams == null ? 0 : mobileFallbackWebviewParams.hashCode())) * 31;
        AuthenticationLevel authenticationLevel = this.currentAuthenticationLevel;
        int hashCode3 = (hashCode2 + (authenticationLevel == null ? 0 : authenticationLevel.hashCode())) * 31;
        AuthenticationLevel authenticationLevel2 = this.minimumAuthenticationLevel;
        int hashCode4 = (hashCode3 + (authenticationLevel2 == null ? 0 : authenticationLevel2.hashCode())) * 31;
        LinkBrand linkBrand = this.linkBrand;
        return hashCode4 + (linkBrand != null ? linkBrand.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ConsumerSession(clientSecret=", this.clientSecret, ", emailAddress=", this.emailAddress, ", redactedFormattedPhoneNumber=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.redactedFormattedPhoneNumber, ", redactedPhoneNumber=", this.redactedPhoneNumber, ", unredactedPhoneNumber=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.unredactedPhoneNumber, ", phoneNumberCountry=", this.phoneNumberCountry, ", verificationSessions=");
        m.append(this.verificationSessions);
        m.append(", mobileFallbackWebviewParams=");
        m.append(this.mobileFallbackWebviewParams);
        m.append(", currentAuthenticationLevel=");
        m.append(this.currentAuthenticationLevel);
        m.append(", minimumAuthenticationLevel=");
        m.append(this.minimumAuthenticationLevel);
        m.append(", linkBrand=");
        m.append(this.linkBrand);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.clientSecret);
        parcel.writeString(this.emailAddress);
        parcel.writeString(this.redactedFormattedPhoneNumber);
        parcel.writeString(this.redactedPhoneNumber);
        parcel.writeString(this.unredactedPhoneNumber);
        parcel.writeString(this.phoneNumberCountry);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.verificationSessions, parcel);
        while (m.hasNext()) {
            ((VerificationSession) m.next()).writeToParcel(parcel, i);
        }
        MobileFallbackWebviewParams mobileFallbackWebviewParams = this.mobileFallbackWebviewParams;
        if (mobileFallbackWebviewParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mobileFallbackWebviewParams.writeToParcel(parcel, i);
        }
        AuthenticationLevel authenticationLevel = this.currentAuthenticationLevel;
        if (authenticationLevel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authenticationLevel.writeToParcel(parcel, i);
        }
        AuthenticationLevel authenticationLevel2 = this.minimumAuthenticationLevel;
        if (authenticationLevel2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            authenticationLevel2.writeToParcel(parcel, i);
        }
        LinkBrand linkBrand = this.linkBrand;
        if (linkBrand == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(linkBrand.name());
        }
    }

    @Serializable
    public final class VerificationSession implements StripeModel {
        public static final Lazy[] $childSerializers;
        public final SessionState state;

        /* renamed from: type, reason: collision with root package name */
        public final SessionType f1437type;
        public static final Companion Companion = new Companion();
        public static final Parcelable.Creator<VerificationSession> CREATOR = new Card.Creator(26);

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/stripe/android/model/ConsumerSession$VerificationSession$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/stripe/android/model/ConsumerSession$VerificationSession;", "serializer", "()Lkotlinx/serialization/KSerializer;", "payments-model_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return ConsumerSession$VerificationSession$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class SessionState implements Parcelable {
            public static final /* synthetic */ EnumEntriesList $ENTRIES;
            public static final /* synthetic */ SessionState[] $VALUES;
            public static final Parcelable.Creator<SessionState> CREATOR;
            public static final Plane Companion;
            public static final SessionState Unknown;
            public static final SessionState Verified;
            public final String value;

            static {
                SessionState sessionState = new SessionState("Unknown", 0, "");
                Unknown = sessionState;
                SessionState sessionState2 = new SessionState("Started", 1, "started");
                SessionState sessionState3 = new SessionState("Failed", 2, "failed");
                SessionState sessionState4 = new SessionState("Verified", 3, "verified");
                Verified = sessionState4;
                SessionState[] sessionStateArr = {sessionState, sessionState2, sessionState3, sessionState4, new SessionState("Canceled", 4, "canceled"), new SessionState("Expired", 5, "expired")};
                $VALUES = sessionStateArr;
                $ENTRIES = new EnumEntriesList(sessionStateArr);
                Companion = new Plane(12);
                CREATOR = new Card.Creator(27);
            }

            public SessionState(String str, int i, String str2) {
                this.value = str2;
            }

            public static SessionState valueOf(String str) {
                return (SessionState) Enum.valueOf(SessionState.class, str);
            }

            public static SessionState[] values() {
                return (SessionState[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(name());
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class SessionType implements Parcelable {
            public static final /* synthetic */ EnumEntriesList $ENTRIES;
            public static final /* synthetic */ SessionType[] $VALUES;
            public static final Parcelable.Creator<SessionType> CREATOR;
            public static final LinkResolverDef Companion;
            public static final SessionType SignUp;
            public static final SessionType Unknown;
            public final String value;

            static {
                SessionType sessionType = new SessionType("Unknown", 0, "");
                Unknown = sessionType;
                SessionType sessionType2 = new SessionType("LinkAuthToken", 1, "link_auth_token");
                SessionType sessionType3 = new SessionType("SignUp", 2, "signup");
                SignUp = sessionType3;
                SessionType[] sessionTypeArr = {sessionType, sessionType2, sessionType3, new SessionType("Email", 3, "email"), new SessionType("Sms", 4, "sms")};
                $VALUES = sessionTypeArr;
                $ENTRIES = new EnumEntriesList(sessionTypeArr);
                Companion = new LinkResolverDef(12);
                CREATOR = new Card.Creator(28);
            }

            public SessionType(String str, int i, String str2) {
                this.value = str2;
            }

            public static SessionType valueOf(String str) {
                return (SessionType) Enum.valueOf(SessionType.class, str);
            }

            public static SessionType[] values() {
                return (SessionType[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(name());
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, (Function0) new HCaptchaHtmlKt$$ExternalSyntheticLambda0(1)), LazyKt.lazy(lazyThreadSafetyMode, (Function0) new HCaptchaHtmlKt$$ExternalSyntheticLambda0(2))};
        }

        public /* synthetic */ VerificationSession(int i, SessionType sessionType, SessionState sessionState) {
            if (3 != (i & 3)) {
                TuplesKt.throwMissingFieldException(i, 3, ConsumerSession$VerificationSession$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.f1437type = sessionType;
            this.state = sessionState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VerificationSession)) {
                return false;
            }
            VerificationSession verificationSession = (VerificationSession) obj;
            return this.f1437type == verificationSession.f1437type && this.state == verificationSession.state;
        }

        public final int hashCode() {
            return this.state.hashCode() + (this.f1437type.hashCode() * 31);
        }

        public final String toString() {
            return "VerificationSession(type=" + this.f1437type + ", state=" + this.state + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            this.f1437type.writeToParcel(parcel, i);
            this.state.writeToParcel(parcel, i);
        }

        public VerificationSession(SessionType sessionType, SessionState sessionState) {
            sessionType.getClass();
            sessionState.getClass();
            this.f1437type = sessionType;
            this.state = sessionState;
        }
    }

    public ConsumerSession(String str, String str2, String str3, String str4, String str5, String str6, List list, MobileFallbackWebviewParams mobileFallbackWebviewParams, AuthenticationLevel authenticationLevel, AuthenticationLevel authenticationLevel2, LinkBrand linkBrand) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        this.clientSecret = str;
        this.emailAddress = str2;
        this.redactedFormattedPhoneNumber = str3;
        this.redactedPhoneNumber = str4;
        this.unredactedPhoneNumber = str5;
        this.phoneNumberCountry = str6;
        this.verificationSessions = list;
        this.mobileFallbackWebviewParams = mobileFallbackWebviewParams;
        this.currentAuthenticationLevel = authenticationLevel;
        this.minimumAuthenticationLevel = authenticationLevel2;
        this.linkBrand = linkBrand;
    }
}
