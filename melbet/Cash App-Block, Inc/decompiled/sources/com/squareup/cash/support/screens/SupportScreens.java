package com.squareup.cash.support.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.DialogScreen;
import app.cash.broadway.screen.NeverInBackStackScreen;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Question;
import app.cash.broadway.screen.RestoringScreen;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.screen.SingleInstanceScreen;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.customersupport.CustomerSupportPhoneViewStatus;
import com.squareup.cash.cdf.customersupport.FullTransactionPickerOrigin;
import com.squareup.cash.screens.MainScreens;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.support.backend.api.SearchPlaceholder;
import com.squareup.cash.support.backend.api.activities.Amount;
import com.squareup.cash.support.backend.api.articles.Article;
import com.squareup.cash.support.chat.backend.api.ChatStatus;
import com.squareup.cash.tax.primitives.Id;
import com.squareup.cropview.Edge;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class SupportScreens extends MainScreens {

    public abstract class ContactScreens extends SupportScreens {

        public final class ContactSupportEmailInputScreen extends ContactScreens {
            public static final Parcelable.Creator<ContactSupportEmailInputScreen> CREATOR = new Amount.Creator(26);
            public final Data data;
            public final Redacted preFilledEmail;
            public final String title;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ContactSupportEmailInputScreen(String str, Redacted redacted, Data data) {
                super(0);
                str.getClass();
                data.getClass();
                this.title = str;
                this.preFilledEmail = redacted;
                this.data = data;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.squareup.cash.screens.MainScreens
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ContactSupportEmailInputScreen)) {
                    return false;
                }
                ContactSupportEmailInputScreen contactSupportEmailInputScreen = (ContactSupportEmailInputScreen) obj;
                return Intrinsics.areEqual(this.title, contactSupportEmailInputScreen.title) && Intrinsics.areEqual(this.preFilledEmail, contactSupportEmailInputScreen.preFilledEmail) && Intrinsics.areEqual(this.data, contactSupportEmailInputScreen.data);
            }

            @Override // com.squareup.cash.screens.MainScreens
            public final int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                Redacted redacted = this.preFilledEmail;
                return this.data.hashCode() + ((hashCode + (redacted == null ? 0 : redacted.hashCode())) * 31);
            }

            public final String toString() {
                return "ContactSupportEmailInputScreen(title=" + this.title + ", preFilledEmail=" + this.preFilledEmail + ", data=" + this.data + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.title);
                parcel.writeParcelable(this.preFilledEmail, i);
                this.data.writeToParcel(parcel, i);
            }
        }

        public final class ContactSupportMessageScreen extends ContactScreens {
            public static final Parcelable.Creator<ContactSupportMessageScreen> CREATOR = new Amount.Creator(27);
            public final Data data;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ContactSupportMessageScreen(Data data) {
                super(0);
                data.getClass();
                this.data = data;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.squareup.cash.screens.MainScreens
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ContactSupportMessageScreen) && Intrinsics.areEqual(this.data, ((ContactSupportMessageScreen) obj).data);
            }

            @Override // com.squareup.cash.screens.MainScreens
            public final int hashCode() {
                return this.data.hashCode();
            }

            public final String toString() {
                return "ContactSupportMessageScreen(data=" + this.data + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                this.data.writeToParcel(parcel, i);
            }
        }

        /* loaded from: classes7.dex */
        public final class Data implements Parcelable {
            public static final Parcelable.Creator<Data> CREATOR = new Amount.Creator(28);
            public final Article.ContactOption contactOption;
            public final Redacted email;
            public final Screen exitScreen;
            public final String flowToken;
            public final Boolean includeIssueDescription;
            public final Redacted message;
            public final String paymentToken;
            public final Redacted phoneNumber;
            public final String supportNodeToken;

            public Data(String str, String str2, String str3, Article.ContactOption contactOption, Boolean bool, Redacted redacted, Redacted redacted2, Redacted redacted3, Screen screen) {
                str.getClass();
                contactOption.getClass();
                screen.getClass();
                this.flowToken = str;
                this.supportNodeToken = str2;
                this.paymentToken = str3;
                this.contactOption = contactOption;
                this.includeIssueDescription = bool;
                this.phoneNumber = redacted;
                this.email = redacted2;
                this.message = redacted3;
                this.exitScreen = screen;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r11v3, types: [com.squareup.cash.screens.Redacted] */
            /* JADX WARN: Type inference failed for: r12v2, types: [com.squareup.cash.screens.Redacted] */
            public static Data copy$default(Data data, RedactedString redactedString, RedactedString redactedString2, int i) {
                String str = data.flowToken;
                String str2 = data.supportNodeToken;
                String str3 = data.paymentToken;
                Article.ContactOption contactOption = data.contactOption;
                Boolean bool = data.includeIssueDescription;
                Redacted redacted = data.phoneNumber;
                RedactedString redactedString3 = redactedString;
                if ((i & 64) != 0) {
                    redactedString3 = data.email;
                }
                RedactedString redactedString4 = redactedString3;
                RedactedString redactedString5 = redactedString2;
                if ((i & 128) != 0) {
                    redactedString5 = data.message;
                }
                Screen screen = data.exitScreen;
                data.getClass();
                str.getClass();
                contactOption.getClass();
                screen.getClass();
                return new Data(str, str2, str3, contactOption, bool, redacted, redactedString4, redactedString5, screen);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Data)) {
                    return false;
                }
                Data data = (Data) obj;
                return Intrinsics.areEqual(this.flowToken, data.flowToken) && Intrinsics.areEqual(this.supportNodeToken, data.supportNodeToken) && Intrinsics.areEqual(this.paymentToken, data.paymentToken) && this.contactOption == data.contactOption && Intrinsics.areEqual(this.includeIssueDescription, data.includeIssueDescription) && Intrinsics.areEqual(this.phoneNumber, data.phoneNumber) && Intrinsics.areEqual(this.email, data.email) && Intrinsics.areEqual(this.message, data.message) && Intrinsics.areEqual(this.exitScreen, data.exitScreen);
            }

            public final int hashCode() {
                int hashCode = this.flowToken.hashCode() * 31;
                String str = this.supportNodeToken;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.paymentToken;
                int hashCode3 = (this.contactOption.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
                Boolean bool = this.includeIssueDescription;
                int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
                Redacted redacted = this.phoneNumber;
                int hashCode5 = (hashCode4 + (redacted == null ? 0 : redacted.hashCode())) * 31;
                Redacted redacted2 = this.email;
                int hashCode6 = (hashCode5 + (redacted2 == null ? 0 : redacted2.hashCode())) * 31;
                Redacted redacted3 = this.message;
                return this.exitScreen.hashCode() + ((hashCode6 + (redacted3 != null ? redacted3.hashCode() : 0)) * 31);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Data(flowToken=", this.flowToken, ", supportNodeToken=", this.supportNodeToken, ", paymentToken=");
                m.append(this.paymentToken);
                m.append(", contactOption=");
                m.append(this.contactOption);
                m.append(", includeIssueDescription=");
                m.append(this.includeIssueDescription);
                m.append(", phoneNumber=");
                m.append(this.phoneNumber);
                m.append(", email=");
                m.append(this.email);
                m.append(", message=");
                m.append(this.message);
                m.append(", exitScreen=");
                m.append(this.exitScreen);
                m.append(")");
                return m.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.flowToken);
                parcel.writeString(this.supportNodeToken);
                parcel.writeString(this.paymentToken);
                parcel.writeString(this.contactOption.name());
                Boolean bool = this.includeIssueDescription;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool);
                }
                parcel.writeParcelable(this.phoneNumber, i);
                parcel.writeParcelable(this.email, i);
                parcel.writeParcelable(this.message, i);
                parcel.writeParcelable(this.exitScreen, i);
            }
        }
    }

    public final class PhoneVerificationScreen extends SupportScreens implements SingleInstanceScreen {
        public static final Parcelable.Creator<PhoneVerificationScreen> CREATOR = new FlowScreens.Data.Creator(15);
        public final String flowToken;
        public final String phoneVerificationId;
        public final Source source;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes6.dex */
        public final class Source {
            public static final /* synthetic */ Source[] $VALUES;
            public static final Source NOTIFICATION;
            public static final Source SYNC_VALUE;
            public static final Source UNKNOWN;

            static {
                Source source = new Source("NOTIFICATION", 0);
                NOTIFICATION = source;
                Source source2 = new Source("SYNC_VALUE", 1);
                SYNC_VALUE = source2;
                Source source3 = new Source("UNKNOWN", 2);
                UNKNOWN = source3;
                $VALUES = new Source[]{source, source2, source3};
            }

            public static Source valueOf(String str) {
                return (Source) Enum.valueOf(Source.class, str);
            }

            public static Source[] values() {
                return (Source[]) $VALUES.clone();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PhoneVerificationScreen(String str, String str2, Source source) {
            super(0);
            str.getClass();
            str2.getClass();
            source.getClass();
            this.phoneVerificationId = str;
            this.flowToken = str2;
            this.source = source;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            PhoneVerificationScreen phoneVerificationScreen = obj instanceof PhoneVerificationScreen ? (PhoneVerificationScreen) obj : null;
            return Intrinsics.areEqual(this.phoneVerificationId, phoneVerificationScreen != null ? phoneVerificationScreen.phoneVerificationId : null);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            return this.phoneVerificationId.hashCode();
        }

        @Override // app.cash.broadway.screen.Screen
        public final String prettyName() {
            return "support_phone_verification_screen";
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PhoneVerificationScreen(phoneVerificationId=", this.phoneVerificationId, ", flowToken=", this.flowToken, ", source=");
            m.append(this.source);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.phoneVerificationId);
            parcel.writeString(this.flowToken);
            parcel.writeString(this.source.name());
        }
    }

    public abstract class ScreenshotScreen extends SupportScreens {

        public final class ScreenshotArgs implements Parcelable {
            public static final Parcelable.Creator<ScreenshotArgs> CREATOR = new FlowScreens.Data.Creator(16);
            public final String flowToken;
            public final String screenshotRequestId;
            public final SubmissionTarget submissionTarget;
            public final Trigger trigger;

            public ScreenshotArgs(Trigger trigger, String str, String str2, SubmissionTarget submissionTarget) {
                trigger.getClass();
                submissionTarget.getClass();
                this.trigger = trigger;
                this.flowToken = str;
                this.screenshotRequestId = str2;
                this.submissionTarget = submissionTarget;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ScreenshotArgs)) {
                    return false;
                }
                ScreenshotArgs screenshotArgs = (ScreenshotArgs) obj;
                return this.trigger == screenshotArgs.trigger && Intrinsics.areEqual(this.flowToken, screenshotArgs.flowToken) && Intrinsics.areEqual(this.screenshotRequestId, screenshotArgs.screenshotRequestId) && this.submissionTarget == screenshotArgs.submissionTarget;
            }

            public final int hashCode() {
                int hashCode = this.trigger.hashCode() * 31;
                String str = this.flowToken;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.screenshotRequestId;
                return this.submissionTarget.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            public final String toString() {
                return "ScreenshotArgs(trigger=" + this.trigger + ", flowToken=" + this.flowToken + ", screenshotRequestId=" + this.screenshotRequestId + ", submissionTarget=" + this.submissionTarget + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.trigger.name());
                parcel.writeString(this.flowToken);
                parcel.writeString(this.screenshotRequestId);
                parcel.writeString(this.submissionTarget.name());
            }
        }

        public final class ScreenshotConfirmScreen extends ScreenshotScreen implements DialogScreen {
            public static final Parcelable.Creator<ScreenshotConfirmScreen> CREATOR = new FlowScreens.Data.Creator(17);
            public final ScreenshotArgs screenshotArgs;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ScreenshotConfirmScreen(ScreenshotArgs screenshotArgs) {
                super(0);
                screenshotArgs.getClass();
                this.screenshotArgs = screenshotArgs;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.squareup.cash.screens.MainScreens
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ScreenshotConfirmScreen) && Intrinsics.areEqual(this.screenshotArgs, ((ScreenshotConfirmScreen) obj).screenshotArgs);
            }

            @Override // com.squareup.cash.screens.MainScreens
            public final int hashCode() {
                return this.screenshotArgs.hashCode();
            }

            public final String toString() {
                return "ScreenshotConfirmScreen(screenshotArgs=" + this.screenshotArgs + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                this.screenshotArgs.writeToParcel(parcel, i);
            }
        }

        public final class ScreenshotReviewScreen extends ScreenshotScreen implements NeverInBackStackScreen {
            public static final Parcelable.Creator<ScreenshotReviewScreen> CREATOR = new FlowScreens.Data.Creator(18);
            public final ScreenshotArgs screenshotArgs;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ScreenshotReviewScreen(ScreenshotArgs screenshotArgs) {
                super(0);
                screenshotArgs.getClass();
                this.screenshotArgs = screenshotArgs;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.squareup.cash.screens.MainScreens
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ScreenshotReviewScreen) && Intrinsics.areEqual(this.screenshotArgs, ((ScreenshotReviewScreen) obj).screenshotArgs);
            }

            @Override // com.squareup.cash.screens.MainScreens
            public final int hashCode() {
                return this.screenshotArgs.hashCode();
            }

            public final String toString() {
                return "ScreenshotReviewScreen(screenshotArgs=" + this.screenshotArgs + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                this.screenshotArgs.writeToParcel(parcel, i);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes6.dex */
        public final class SubmissionTarget {
            public static final /* synthetic */ SubmissionTarget[] $VALUES;
            public static final Edge.Companion Companion;
            public static final SubmissionTarget SESSION_RECORDER;
            public static final SubmissionTarget SUPPORT_CHAT;

            static {
                SubmissionTarget submissionTarget = new SubmissionTarget("SESSION_RECORDER", 0);
                SESSION_RECORDER = submissionTarget;
                SubmissionTarget submissionTarget2 = new SubmissionTarget("SUPPORT_CHAT", 1);
                SUPPORT_CHAT = submissionTarget2;
                $VALUES = new SubmissionTarget[]{submissionTarget, submissionTarget2};
                Companion = new Edge.Companion(10);
            }

            public static SubmissionTarget valueOf(String str) {
                return (SubmissionTarget) Enum.valueOf(SubmissionTarget.class, str);
            }

            public static SubmissionTarget[] values() {
                return (SubmissionTarget[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes6.dex */
        public final class Trigger {
            public static final /* synthetic */ Trigger[] $VALUES;
            public static final Trigger NOTIFICATION;
            public static final Trigger SUPPORT_CHAT;

            /* JADX INFO: Fake field, exist only in values array */
            Trigger EF0;

            static {
                Trigger trigger = new Trigger("DEBUG_MENU", 0);
                Trigger trigger2 = new Trigger("NOTIFICATION", 1);
                NOTIFICATION = trigger2;
                Trigger trigger3 = new Trigger("SUPPORT_CHAT", 2);
                SUPPORT_CHAT = trigger3;
                $VALUES = new Trigger[]{trigger, trigger2, trigger3};
            }

            public static Trigger valueOf(String str) {
                return (Trigger) Enum.valueOf(Trigger.class, str);
            }

            public static Trigger[] values() {
                return (Trigger[]) $VALUES.clone();
            }
        }
    }

    public final class SupportLoadClientScenarioScreen extends FlowScreens {
        public static final Parcelable.Creator<SupportLoadClientScenarioScreen> CREATOR = new FlowScreens.Data.Creator(20);
        public final FlowScreens.Data data;
        public final String scenarioString;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SupportLoadClientScenarioScreen(String str, FlowScreens.Data data) {
            super(0);
            str.getClass();
            data.getClass();
            this.scenarioString = str;
            this.data = data;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SupportLoadClientScenarioScreen)) {
                return false;
            }
            SupportLoadClientScenarioScreen supportLoadClientScenarioScreen = (SupportLoadClientScenarioScreen) obj;
            return Intrinsics.areEqual(this.scenarioString, supportLoadClientScenarioScreen.scenarioString) && Intrinsics.areEqual(this.data, supportLoadClientScenarioScreen.data);
        }

        @Override // com.squareup.cash.support.screens.SupportScreens.FlowScreens
        public final FlowScreens.Data getData() {
            return this.data;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            return this.data.hashCode() + (this.scenarioString.hashCode() * 31);
        }

        public final String toString() {
            return "SupportLoadClientScenarioScreen(scenarioString=" + this.scenarioString + ", data=" + this.data + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.scenarioString);
            this.data.writeToParcel(parcel, i);
        }
    }

    public final class SupportPhoneStatusScreen extends SupportScreens {
        public static final Parcelable.Creator<SupportPhoneStatusScreen> CREATOR = new FlowScreens.Data.Creator(21);
        public final String flowToken;
        public final CustomerSupportPhoneViewStatus.Trigger trigger;
        public final boolean useCachedStatus;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SupportPhoneStatusScreen(boolean z, String str, CustomerSupportPhoneViewStatus.Trigger trigger) {
            super(0);
            trigger.getClass();
            this.useCachedStatus = z;
            this.flowToken = str;
            this.trigger = trigger;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SupportPhoneStatusScreen)) {
                return false;
            }
            SupportPhoneStatusScreen supportPhoneStatusScreen = (SupportPhoneStatusScreen) obj;
            return this.useCachedStatus == supportPhoneStatusScreen.useCachedStatus && Intrinsics.areEqual(this.flowToken, supportPhoneStatusScreen.flowToken) && this.trigger == supportPhoneStatusScreen.trigger;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.useCachedStatus) * 31;
            String str = this.flowToken;
            return this.trigger.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("SupportPhoneStatusScreen(useCachedStatus=", ", flowToken=", this.flowToken, ", trigger=", this.useCachedStatus);
            m.append(this.trigger);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.useCachedStatus ? 1 : 0);
            parcel.writeString(this.flowToken);
            parcel.writeString(this.trigger.name());
        }
    }

    public final class UnauthenticatedArticleScreen extends SupportScreens {
        public static final Parcelable.Creator<UnauthenticatedArticleScreen> CREATOR = new Id.Close.Creator(2);
        public final String flowToken;
        public final String parentTitle;
        public final String title;
        public final String token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnauthenticatedArticleScreen(String str, String str2, String str3, String str4) {
            super(0);
            str.getClass();
            str2.getClass();
            this.token = str;
            this.flowToken = str2;
            this.parentTitle = str3;
            this.title = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnauthenticatedArticleScreen)) {
                return false;
            }
            UnauthenticatedArticleScreen unauthenticatedArticleScreen = (UnauthenticatedArticleScreen) obj;
            return Intrinsics.areEqual(this.token, unauthenticatedArticleScreen.token) && Intrinsics.areEqual(this.flowToken, unauthenticatedArticleScreen.flowToken) && Intrinsics.areEqual(this.parentTitle, unauthenticatedArticleScreen.parentTitle) && Intrinsics.areEqual(this.title, unauthenticatedArticleScreen.title);
        }

        @Override // com.squareup.cash.screens.MainScreens
        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.flowToken);
            String str = this.parentTitle;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.title;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // app.cash.broadway.screen.Screen
        public final String prettyName() {
            return "support_unauthenticated_article_screen";
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UnauthenticatedArticleScreen(token=", this.token, ", flowToken=", this.flowToken, ", parentTitle="), this.parentTitle, ", title=", this.title, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.token);
            parcel.writeString(this.flowToken);
            parcel.writeString(this.parentTitle);
            parcel.writeString(this.title);
        }
    }

    public abstract class SupportSheets extends FlowScreens implements OnlyOneOverlayTreatment {

        public final class SupportTransactionConfirmationSheet extends SupportSheets {
            public static final Parcelable.Creator<SupportTransactionConfirmationSheet> CREATOR = new FlowScreens.Data.Creator(27);
            public final FlowScreens.Data data;
            public final AskedQuestion question;

            /* loaded from: classes7.dex */
            public final class TransactionConfirmationQuestion implements Question {
                public static final Parcelable.Creator<TransactionConfirmationQuestion> CREATOR = new FlowScreens.Data.Creator(28);
                public final String articleToken;
                public final Article.ContactOption contactOption;

                public TransactionConfirmationQuestion(String str, Article.ContactOption contactOption) {
                    str.getClass();
                    contactOption.getClass();
                    this.articleToken = str;
                    this.contactOption = contactOption;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof TransactionConfirmationQuestion)) {
                        return false;
                    }
                    TransactionConfirmationQuestion transactionConfirmationQuestion = (TransactionConfirmationQuestion) obj;
                    return Intrinsics.areEqual(this.articleToken, transactionConfirmationQuestion.articleToken) && this.contactOption == transactionConfirmationQuestion.contactOption;
                }

                public final int hashCode() {
                    return this.contactOption.hashCode() + (this.articleToken.hashCode() * 31);
                }

                public final String toString() {
                    return "TransactionConfirmationQuestion(articleToken=" + this.articleToken + ", contactOption=" + this.contactOption + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.articleToken);
                    parcel.writeString(this.contactOption.name());
                }
            }

            /* loaded from: classes7.dex */
            public interface TransactionConfirmationResult extends Parcelable {

                public final class No implements TransactionConfirmationResult {
                    public static final No INSTANCE = new No();
                    public static final Parcelable.Creator<No> CREATOR = new FlowScreens.Data.Creator(29);

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof No);
                    }

                    public final int hashCode() {
                        return 111003131;
                    }

                    public final String toString() {
                        return "No";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
                        parcel.getClass();
                        parcel.writeInt(1);
                    }
                }

                public final class Yes implements TransactionConfirmationResult {
                    public static final Yes INSTANCE = new Yes();
                    public static final Parcelable.Creator<Yes> CREATOR = new Id.Close.Creator(1);

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof Yes);
                    }

                    public final int hashCode() {
                        return -853859859;
                    }

                    public final String toString() {
                        return "Yes";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
                        parcel.getClass();
                        parcel.writeInt(1);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SupportTransactionConfirmationSheet(FlowScreens.Data data, AskedQuestion askedQuestion) {
                super(0);
                data.getClass();
                askedQuestion.getClass();
                this.data = data;
                this.question = askedQuestion;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.squareup.cash.screens.MainScreens
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SupportTransactionConfirmationSheet)) {
                    return false;
                }
                SupportTransactionConfirmationSheet supportTransactionConfirmationSheet = (SupportTransactionConfirmationSheet) obj;
                return Intrinsics.areEqual(this.data, supportTransactionConfirmationSheet.data) && Intrinsics.areEqual(this.question, supportTransactionConfirmationSheet.question);
            }

            @Override // com.squareup.cash.support.screens.SupportScreens.FlowScreens
            public final FlowScreens.Data getData() {
                return this.data;
            }

            @Override // com.squareup.cash.screens.MainScreens
            public final int hashCode() {
                return this.question.hashCode() + (this.data.hashCode() * 31);
            }

            public final String toString() {
                return "SupportTransactionConfirmationSheet(data=" + this.data + ", question=" + this.question + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                this.data.writeToParcel(parcel, i);
                parcel.writeParcelable(this.question, i);
            }
        }

        public final class SupportHomeContactOptionsSheetScreen extends SupportSheets {
            public static final Parcelable.Creator<SupportHomeContactOptionsSheetScreen> CREATOR = new FlowScreens.Data.Creator(23);
            public final List contactOptions;
            public final FlowScreens.Data data;
            public final AskedQuestion question;

            /* loaded from: classes7.dex */
            public final class SupportHomeContactOptionsSheetQuestion implements Question {
                public static final SupportHomeContactOptionsSheetQuestion INSTANCE = new SupportHomeContactOptionsSheetQuestion();
                public static final Parcelable.Creator<SupportHomeContactOptionsSheetQuestion> CREATOR = new FlowScreens.Data.Creator(24);

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof SupportHomeContactOptionsSheetQuestion);
                }

                public final int hashCode() {
                    return -381958337;
                }

                public final String toString() {
                    return "SupportHomeContactOptionsSheetQuestion";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(1);
                }
            }

            /* loaded from: classes7.dex */
            public abstract class SupportHomeContactOptionsSheetResult implements Parcelable {

                public final class Chat extends SupportHomeContactOptionsSheetResult {
                    public static final Chat INSTANCE = new Chat();
                    public static final Parcelable.Creator<Chat> CREATOR = new FlowScreens.Data.Creator(25);

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof Chat);
                    }

                    public final int hashCode() {
                        return 1194527920;
                    }

                    public final String toString() {
                        return "Chat";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
                        parcel.getClass();
                        parcel.writeInt(1);
                    }
                }

                public final class Phone extends SupportHomeContactOptionsSheetResult {
                    public static final Phone INSTANCE = new Phone();
                    public static final Parcelable.Creator<Phone> CREATOR = new FlowScreens.Data.Creator(26);

                    @Override // android.os.Parcelable
                    public final int describeContents() {
                        return 0;
                    }

                    public final boolean equals(Object obj) {
                        return this == obj || (obj instanceof Phone);
                    }

                    public final int hashCode() {
                        return -1612321002;
                    }

                    public final String toString() {
                        return "Phone";
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
                        parcel.getClass();
                        parcel.writeInt(1);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SupportHomeContactOptionsSheetScreen(FlowScreens.Data data, List list, AskedQuestion askedQuestion) {
                super(0);
                data.getClass();
                list.getClass();
                askedQuestion.getClass();
                this.data = data;
                this.contactOptions = list;
                this.question = askedQuestion;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.squareup.cash.screens.MainScreens
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SupportHomeContactOptionsSheetScreen)) {
                    return false;
                }
                SupportHomeContactOptionsSheetScreen supportHomeContactOptionsSheetScreen = (SupportHomeContactOptionsSheetScreen) obj;
                return Intrinsics.areEqual(this.data, supportHomeContactOptionsSheetScreen.data) && Intrinsics.areEqual(this.contactOptions, supportHomeContactOptionsSheetScreen.contactOptions) && Intrinsics.areEqual(this.question, supportHomeContactOptionsSheetScreen.question);
            }

            @Override // com.squareup.cash.support.screens.SupportScreens.FlowScreens
            public final FlowScreens.Data getData() {
                return this.data;
            }

            @Override // com.squareup.cash.screens.MainScreens
            public final int hashCode() {
                return this.question.hashCode() + Recorder$$ExternalSyntheticOutline2.m(this.data.hashCode() * 31, 31, this.contactOptions);
            }

            public final String toString() {
                return "SupportHomeContactOptionsSheetScreen(data=" + this.data + ", contactOptions=" + this.contactOptions + ", question=" + this.question + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                this.data.writeToParcel(parcel, i);
                Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.contactOptions, parcel);
                while (m.hasNext()) {
                    ((ContactOption) m.next()).writeToParcel(parcel, i);
                }
                parcel.writeParcelable(this.question, i);
            }

            /* loaded from: classes7.dex */
            public final class ContactOption implements Parcelable {
                public static final Parcelable.Creator<ContactOption> CREATOR = new FlowScreens.Data.Creator(22);
                public final boolean enabled;
                public final boolean hasNotificationBadge;
                public final String subtitle;
                public final String title;

                /* renamed from: type, reason: collision with root package name */
                public final Type f1207type;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public final class Type {
                    public static final /* synthetic */ Type[] $VALUES;
                    public static final Type CHAT;
                    public static final Type PHONE;

                    static {
                        Type type2 = new Type("CHAT", 0);
                        CHAT = type2;
                        Type type3 = new Type("PHONE", 1);
                        PHONE = type3;
                        $VALUES = new Type[]{type2, type3};
                    }

                    public static Type valueOf(String str) {
                        return (Type) Enum.valueOf(Type.class, str);
                    }

                    public static Type[] values() {
                        return (Type[]) $VALUES.clone();
                    }
                }

                public ContactOption(String str, String str2, Type type2, boolean z, boolean z2) {
                    str.getClass();
                    type2.getClass();
                    this.title = str;
                    this.subtitle = str2;
                    this.f1207type = type2;
                    this.enabled = z;
                    this.hasNotificationBadge = z2;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ContactOption)) {
                        return false;
                    }
                    ContactOption contactOption = (ContactOption) obj;
                    return Intrinsics.areEqual(this.title, contactOption.title) && Intrinsics.areEqual(this.subtitle, contactOption.subtitle) && this.f1207type == contactOption.f1207type && this.enabled == contactOption.enabled && this.hasNotificationBadge == contactOption.hasNotificationBadge;
                }

                public final int hashCode() {
                    int hashCode = this.title.hashCode() * 31;
                    String str = this.subtitle;
                    return Boolean.hashCode(this.hasNotificationBadge) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.f1207type.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.enabled);
                }

                public final String toString() {
                    StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ContactOption(title=", this.title, ", subtitle=", this.subtitle, ", type=");
                    m.append(this.f1207type);
                    m.append(", enabled=");
                    m.append(this.enabled);
                    m.append(", hasNotificationBadge=");
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.hasNotificationBadge, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.title);
                    parcel.writeString(this.subtitle);
                    parcel.writeString(this.f1207type.name());
                    parcel.writeInt(this.enabled ? 1 : 0);
                    parcel.writeInt(this.hasNotificationBadge ? 1 : 0);
                }

                public /* synthetic */ ContactOption(String str, String str2, Type type2, boolean z, boolean z2, int i) {
                    this(str, str2, type2, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2);
                }
            }
        }
    }

    public abstract class FlowScreens extends SupportScreens {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes7.dex */
        public final class BackNavigationAction {
            public static final /* synthetic */ BackNavigationAction[] $VALUES;
            public static final BackNavigationAction BACK;
            public static final BackNavigationAction CLOSE;

            static {
                BackNavigationAction backNavigationAction = new BackNavigationAction("CLOSE", 0);
                CLOSE = backNavigationAction;
                BackNavigationAction backNavigationAction2 = new BackNavigationAction("BACK", 1);
                BACK = backNavigationAction2;
                $VALUES = new BackNavigationAction[]{backNavigationAction, backNavigationAction2};
            }

            public static BackNavigationAction valueOf(String str) {
                return (BackNavigationAction) Enum.valueOf(BackNavigationAction.class, str);
            }

            public static BackNavigationAction[] values() {
                return (BackNavigationAction[]) $VALUES.clone();
            }
        }

        public final class SupportActivityPickerFullScreen extends FlowScreens {
            public static final Parcelable.Creator<SupportActivityPickerFullScreen> CREATOR = new Data.Creator(1);
            public final Data data;
            public final FullTransactionPickerOrigin origin;
            public final AskedQuestion selectTransactionQuestion;

            /* loaded from: classes7.dex */
            public final class SelectTransactionQuestion implements Question {
                public static final SelectTransactionQuestion INSTANCE = new SelectTransactionQuestion();
                public static final Parcelable.Creator<SelectTransactionQuestion> CREATOR = new Data.Creator(2);

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof SelectTransactionQuestion);
                }

                public final int hashCode() {
                    return -167191730;
                }

                public final String toString() {
                    return "SelectTransactionQuestion";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(1);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SupportActivityPickerFullScreen(Data data, FullTransactionPickerOrigin fullTransactionPickerOrigin, AskedQuestion askedQuestion) {
                super(0);
                data.getClass();
                fullTransactionPickerOrigin.getClass();
                this.data = data;
                this.origin = fullTransactionPickerOrigin;
                this.selectTransactionQuestion = askedQuestion;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.squareup.cash.screens.MainScreens
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SupportActivityPickerFullScreen)) {
                    return false;
                }
                SupportActivityPickerFullScreen supportActivityPickerFullScreen = (SupportActivityPickerFullScreen) obj;
                return Intrinsics.areEqual(this.data, supportActivityPickerFullScreen.data) && this.origin == supportActivityPickerFullScreen.origin && Intrinsics.areEqual(this.selectTransactionQuestion, supportActivityPickerFullScreen.selectTransactionQuestion);
            }

            @Override // com.squareup.cash.support.screens.SupportScreens.FlowScreens
            public final Data getData() {
                return this.data;
            }

            @Override // com.squareup.cash.screens.MainScreens
            public final int hashCode() {
                int hashCode = (this.origin.hashCode() + (this.data.hashCode() * 31)) * 31;
                AskedQuestion askedQuestion = this.selectTransactionQuestion;
                return hashCode + (askedQuestion == null ? 0 : askedQuestion.hashCode());
            }

            @Override // app.cash.broadway.screen.Screen
            public final String prettyName() {
                return "support_transaction_picker_screen";
            }

            public final String toString() {
                return "SupportActivityPickerFullScreen(data=" + this.data + ", origin=" + this.origin + ", selectTransactionQuestion=" + this.selectTransactionQuestion + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                this.data.writeToParcel(parcel, i);
                parcel.writeString(this.origin.name());
                parcel.writeParcelable(this.selectTransactionQuestion, i);
            }
        }

        /* loaded from: classes7.dex */
        public interface SupportArticleConfig extends Parcelable {

            public final class ByArticleToken implements SupportArticleConfig {
                public static final Parcelable.Creator<ByArticleToken> CREATOR = new Data.Creator(4);
                public final String articleToken;

                public ByArticleToken(String str) {
                    str.getClass();
                    this.articleToken = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof ByArticleToken) && Intrinsics.areEqual(this.articleToken, ((ByArticleToken) obj).articleToken);
                }

                public final int hashCode() {
                    return this.articleToken.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ByArticleToken(articleToken=", this.articleToken, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.articleToken);
                }
            }

            public final class ByArticleTokenAndTransaction implements SupportArticleConfig {
                public static final Parcelable.Creator<ByArticleTokenAndTransaction> CREATOR = new Data.Creator(5);
                public final String articleToken;
                public final Redacted transaction;

                public ByArticleTokenAndTransaction(Redacted redacted, String str) {
                    str.getClass();
                    redacted.getClass();
                    this.articleToken = str;
                    this.transaction = redacted;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ByArticleTokenAndTransaction)) {
                        return false;
                    }
                    ByArticleTokenAndTransaction byArticleTokenAndTransaction = (ByArticleTokenAndTransaction) obj;
                    return Intrinsics.areEqual(this.articleToken, byArticleTokenAndTransaction.articleToken) && Intrinsics.areEqual(this.transaction, byArticleTokenAndTransaction.transaction);
                }

                public final int hashCode() {
                    return this.transaction.hashCode() + (this.articleToken.hashCode() * 31);
                }

                public final String toString() {
                    return "ByArticleTokenAndTransaction(articleToken=" + this.articleToken + ", transaction=" + this.transaction + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.articleToken);
                    parcel.writeParcelable(this.transaction, i);
                }
            }

            public final class ByArticleTokenAndTransactionId implements SupportArticleConfig {
                public static final Parcelable.Creator<ByArticleTokenAndTransactionId> CREATOR = new Data.Creator(6);
                public final String articleToken;

                public ByArticleTokenAndTransactionId(String str) {
                    str.getClass();
                    this.articleToken = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof ByArticleTokenAndTransactionId) && Intrinsics.areEqual(this.articleToken, ((ByArticleTokenAndTransactionId) obj).articleToken);
                }

                public final int hashCode() {
                    return this.articleToken.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ByArticleTokenAndTransactionId(articleToken=", this.articleToken, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.articleToken);
                }
            }

            public final class ByTransaction implements SupportArticleConfig {
                public static final Parcelable.Creator<ByTransaction> CREATOR = new Data.Creator(7);
                public final Redacted transaction;

                public ByTransaction(Redacted redacted) {
                    redacted.getClass();
                    this.transaction = redacted;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof ByTransaction) && Intrinsics.areEqual(this.transaction, ((ByTransaction) obj).transaction);
                }

                public final int hashCode() {
                    return this.transaction.hashCode();
                }

                public final String toString() {
                    return "ByTransaction(transaction=" + this.transaction + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeParcelable(this.transaction, i);
                }
            }

            public final class ByTransactionId implements SupportArticleConfig {
                public static final ByTransactionId INSTANCE = new ByTransactionId();
                public static final Parcelable.Creator<ByTransactionId> CREATOR = new Data.Creator(8);

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof ByTransactionId);
                }

                public final int hashCode() {
                    return -2103701904;
                }

                public final String toString() {
                    return "ByTransactionId";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(1);
                }
            }
        }

        public final class SupportArticleIncidentsSheetScreen extends FlowScreens implements BottomSheetScreen {
            public static final Parcelable.Creator<SupportArticleIncidentsSheetScreen> CREATOR = new Data.Creator(9);
            public final Data data;
            public final ArrayList incidents;
            public final AskedQuestion question;

            /* loaded from: classes7.dex */
            public final class IncidentsSheetQuestion implements Question {
                public static final IncidentsSheetQuestion INSTANCE = new IncidentsSheetQuestion();
                public static final Parcelable.Creator<IncidentsSheetQuestion> CREATOR = new Data.Creator(10);

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public final class Result {
                    public static final /* synthetic */ Result[] $VALUES;
                    public static final Result DISMISSED;
                    public static final Result NAVIGATED;

                    static {
                        Result result = new Result("DISMISSED", 0);
                        DISMISSED = result;
                        Result result2 = new Result("NAVIGATED", 1);
                        NAVIGATED = result2;
                        $VALUES = new Result[]{result, result2};
                    }

                    public static Result valueOf(String str) {
                        return (Result) Enum.valueOf(Result.class, str);
                    }

                    public static Result[] values() {
                        return (Result[]) $VALUES.clone();
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof IncidentsSheetQuestion);
                }

                public final int hashCode() {
                    return 1576966926;
                }

                public final String toString() {
                    return "IncidentsSheetQuestion";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(1);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SupportArticleIncidentsSheetScreen(Data data, ArrayList arrayList, AskedQuestion askedQuestion) {
                super(0);
                data.getClass();
                askedQuestion.getClass();
                this.data = data;
                this.incidents = arrayList;
                this.question = askedQuestion;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.squareup.cash.screens.MainScreens
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SupportArticleIncidentsSheetScreen)) {
                    return false;
                }
                SupportArticleIncidentsSheetScreen supportArticleIncidentsSheetScreen = (SupportArticleIncidentsSheetScreen) obj;
                return Intrinsics.areEqual(this.data, supportArticleIncidentsSheetScreen.data) && this.incidents.equals(supportArticleIncidentsSheetScreen.incidents) && Intrinsics.areEqual(this.question, supportArticleIncidentsSheetScreen.question);
            }

            @Override // com.squareup.cash.support.screens.SupportScreens.FlowScreens
            public final Data getData() {
                return this.data;
            }

            @Override // com.squareup.cash.screens.MainScreens
            public final int hashCode() {
                return this.question.hashCode() + CameraState$Type$EnumUnboxingLocalUtility.m(this.incidents, this.data.hashCode() * 31, 31);
            }

            public final String toString() {
                return "SupportArticleIncidentsSheetScreen(data=" + this.data + ", incidents=" + this.incidents + ", question=" + this.question + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                this.data.writeToParcel(parcel, i);
                Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.incidents, parcel);
                while (m.hasNext()) {
                    parcel.writeParcelable((Parcelable) m.next(), i);
                }
                parcel.writeParcelable(this.question, i);
            }
        }

        public final class SupportDisputeTrackerScreen extends FlowScreens {
            public static final Parcelable.Creator<SupportDisputeTrackerScreen> CREATOR = new Data.Creator(11);
            public final Data data;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SupportDisputeTrackerScreen(Data data) {
                super(0);
                data.getClass();
                this.data = data;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.squareup.cash.screens.MainScreens
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SupportDisputeTrackerScreen) && Intrinsics.areEqual(this.data, ((SupportDisputeTrackerScreen) obj).data);
            }

            @Override // com.squareup.cash.support.screens.SupportScreens.FlowScreens
            public final Data getData() {
                return this.data;
            }

            @Override // com.squareup.cash.screens.MainScreens
            public final int hashCode() {
                return this.data.hashCode();
            }

            @Override // app.cash.broadway.screen.Screen
            public final String prettyName() {
                return "support_disputes_list_screen";
            }

            public final String toString() {
                return "SupportDisputeTrackerScreen(data=" + this.data + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                this.data.writeToParcel(parcel, i);
            }
        }

        public final class SupportIncidentDetailsScreen extends FlowScreens implements RestoringScreen {
            public static final Parcelable.Creator<SupportIncidentDetailsScreen> CREATOR = new Data.Creator(13);
            public final Data data;
            public final String incidentId;
            public final Source source;
            public final boolean useCachedIncident;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* loaded from: classes7.dex */
            public final class Source {
                public static final /* synthetic */ Source[] $VALUES;
                public static final Source HOME;
                public static final Source NODE;
                public static final Source NOTIFICATION;
                public static final Source UNKNOWN;

                static {
                    Source source = new Source("HOME", 0);
                    HOME = source;
                    Source source2 = new Source("NODE", 1);
                    NODE = source2;
                    Source source3 = new Source("NOTIFICATION", 2);
                    NOTIFICATION = source3;
                    Source source4 = new Source("UNKNOWN", 3);
                    UNKNOWN = source4;
                    $VALUES = new Source[]{source, source2, source3, source4};
                }

                public static Source valueOf(String str) {
                    return (Source) Enum.valueOf(Source.class, str);
                }

                public static Source[] values() {
                    return (Source[]) $VALUES.clone();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SupportIncidentDetailsScreen(Data data, String str, boolean z, Source source) {
                super(0);
                data.getClass();
                str.getClass();
                source.getClass();
                this.data = data;
                this.incidentId = str;
                this.useCachedIncident = z;
                this.source = source;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.squareup.cash.screens.MainScreens
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SupportIncidentDetailsScreen)) {
                    return false;
                }
                SupportIncidentDetailsScreen supportIncidentDetailsScreen = (SupportIncidentDetailsScreen) obj;
                return Intrinsics.areEqual(this.data, supportIncidentDetailsScreen.data) && Intrinsics.areEqual(this.incidentId, supportIncidentDetailsScreen.incidentId) && this.useCachedIncident == supportIncidentDetailsScreen.useCachedIncident && this.source == supportIncidentDetailsScreen.source;
            }

            @Override // com.squareup.cash.support.screens.SupportScreens.FlowScreens
            public final Data getData() {
                return this.data;
            }

            @Override // com.squareup.cash.screens.MainScreens
            public final int hashCode() {
                return this.source.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.data.hashCode() * 31, 31, this.incidentId), 31, this.useCachedIncident);
            }

            @Override // app.cash.broadway.screen.Screen
            public final String prettyName() {
                return "support_incident_details_screen";
            }

            public final String toString() {
                return "SupportIncidentDetailsScreen(data=" + this.data + ", incidentId=" + this.incidentId + ", useCachedIncident=" + this.useCachedIncident + ", source=" + this.source + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                this.data.writeToParcel(parcel, i);
                parcel.writeString(this.incidentId);
                parcel.writeInt(this.useCachedIncident ? 1 : 0);
                parcel.writeString(this.source.name());
            }
        }

        public final class SupportSearchScreen extends FlowScreens {
            public static final Parcelable.Creator<SupportSearchScreen> CREATOR = new Data.Creator(14);
            public final Data data;
            public final String nodeToken;
            public final SearchPlaceholder searchPlaceholder;
            public final List suggestedArticles;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SupportSearchScreen(Data data, String str, List list, SearchPlaceholder searchPlaceholder) {
                super(0);
                data.getClass();
                str.getClass();
                list.getClass();
                searchPlaceholder.getClass();
                this.data = data;
                this.nodeToken = str;
                this.suggestedArticles = list;
                this.searchPlaceholder = searchPlaceholder;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.squareup.cash.screens.MainScreens
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SupportSearchScreen)) {
                    return false;
                }
                SupportSearchScreen supportSearchScreen = (SupportSearchScreen) obj;
                return Intrinsics.areEqual(this.data, supportSearchScreen.data) && Intrinsics.areEqual(this.nodeToken, supportSearchScreen.nodeToken) && Intrinsics.areEqual(this.suggestedArticles, supportSearchScreen.suggestedArticles) && Intrinsics.areEqual(this.searchPlaceholder, supportSearchScreen.searchPlaceholder);
            }

            @Override // com.squareup.cash.support.screens.SupportScreens.FlowScreens
            public final Data getData() {
                return this.data;
            }

            @Override // com.squareup.cash.screens.MainScreens
            public final int hashCode() {
                return this.searchPlaceholder.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.data.hashCode() * 31, 31, this.nodeToken), 31, this.suggestedArticles);
            }

            @Override // app.cash.broadway.screen.Screen
            public final String prettyName() {
                return "support_search_screen";
            }

            public final String toString() {
                return "SupportSearchScreen(data=" + this.data + ", nodeToken=" + this.nodeToken + ", suggestedArticles=" + this.suggestedArticles + ", searchPlaceholder=" + this.searchPlaceholder + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                this.data.writeToParcel(parcel, i);
                parcel.writeString(this.nodeToken);
                Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.suggestedArticles, parcel);
                while (m.hasNext()) {
                    parcel.writeParcelable((Parcelable) m.next(), i);
                }
                parcel.writeParcelable(this.searchPlaceholder, i);
            }
        }

        public abstract Data getData();

        public final class ArticleScreen extends FlowScreens implements RestoringScreen {
            public static final Parcelable.Creator<ArticleScreen> CREATOR = new Amount.Creator(29);
            public final SupportArticleConfig articleConfig;
            public final Data data;
            public final boolean fallBackToSupportHome;
            public final boolean showIncidents;
            public final String title;

            public /* synthetic */ ArticleScreen(SupportArticleConfig supportArticleConfig, Data data, boolean z, int i) {
                this(supportArticleConfig, data, null, (i & 8) == 0, (i & 16) != 0 ? false : z);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.squareup.cash.screens.MainScreens
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ArticleScreen)) {
                    return false;
                }
                ArticleScreen articleScreen = (ArticleScreen) obj;
                return Intrinsics.areEqual(this.articleConfig, articleScreen.articleConfig) && Intrinsics.areEqual(this.data, articleScreen.data) && Intrinsics.areEqual(this.title, articleScreen.title) && this.fallBackToSupportHome == articleScreen.fallBackToSupportHome && this.showIncidents == articleScreen.showIncidents;
            }

            @Override // com.squareup.cash.support.screens.SupportScreens.FlowScreens
            public final Data getData() {
                return this.data;
            }

            @Override // com.squareup.cash.screens.MainScreens
            public final int hashCode() {
                int hashCode = (this.data.hashCode() + (this.articleConfig.hashCode() * 31)) * 31;
                String str = this.title;
                return Boolean.hashCode(this.showIncidents) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.fallBackToSupportHome);
            }

            @Override // app.cash.broadway.screen.Screen
            public final String prettyName() {
                return "support_article_screen";
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ArticleScreen(articleConfig=");
                sb.append(this.articleConfig);
                sb.append(", data=");
                sb.append(this.data);
                sb.append(", title=");
                NavAction$$ExternalSyntheticOutline0.m(sb, this.title, ", fallBackToSupportHome=", this.fallBackToSupportHome, ", showIncidents=");
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.showIncidents, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.articleConfig, i);
                this.data.writeToParcel(parcel, i);
                parcel.writeString(this.title);
                parcel.writeInt(this.fallBackToSupportHome ? 1 : 0);
                parcel.writeInt(this.showIncidents ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ArticleScreen(SupportArticleConfig supportArticleConfig, Data data, String str, boolean z, boolean z2) {
                super(0);
                supportArticleConfig.getClass();
                data.getClass();
                this.articleConfig = supportArticleConfig;
                this.data = data;
                this.title = str;
                this.fallBackToSupportHome = z;
                this.showIncidents = z2;
            }
        }

        /* loaded from: classes7.dex */
        public final class Data implements Parcelable {
            public static final Parcelable.Creator<Data> CREATOR = new Creator(0);
            public final Article.ContactOption contactOption;
            public final Screen exitScreen;
            public final String flowToken;
            public final Boolean includeIssueDescription;
            public final String parentNodeToken;
            public final String paymentToken;
            public final String rootNodeToken;
            public final String searchText;

            public final class Creator implements Parcelable.Creator {
                public final /* synthetic */ int $r8$classId;

                public /* synthetic */ Creator(int i) {
                    this.$r8$classId = i;
                }

                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    int i = 0;
                    switch (this.$r8$classId) {
                        case 0:
                            parcel.getClass();
                            String readString = parcel.readString();
                            String readString2 = parcel.readString();
                            String readString3 = parcel.readString();
                            String readString4 = parcel.readString();
                            String readString5 = parcel.readString();
                            Screen screen = (Screen) parcel.readParcelable(Data.class.getClassLoader());
                            Boolean bool = null;
                            Article.ContactOption valueOf = parcel.readInt() == 0 ? null : Article.ContactOption.valueOf(parcel.readString());
                            if (parcel.readInt() != 0) {
                                bool = Boolean.valueOf(parcel.readInt() != 0);
                            }
                            return new Data(readString, readString2, readString3, readString4, readString5, screen, valueOf, bool);
                        case 1:
                            parcel.getClass();
                            return new SupportActivityPickerFullScreen(Data.CREATOR.createFromParcel(parcel), FullTransactionPickerOrigin.valueOf(parcel.readString()), (AskedQuestion) parcel.readParcelable(SupportActivityPickerFullScreen.class.getClassLoader()));
                        case 2:
                            parcel.getClass();
                            parcel.readInt();
                            return SupportActivityPickerFullScreen.SelectTransactionQuestion.INSTANCE;
                        case 3:
                            parcel.getClass();
                            return new SupportScreens$FlowScreens$SupportActivityPickerFullScreen$SelectTransactionResult$Success(parcel.readString());
                        case 4:
                            parcel.getClass();
                            return new SupportArticleConfig.ByArticleToken(parcel.readString());
                        case 5:
                            parcel.getClass();
                            return new SupportArticleConfig.ByArticleTokenAndTransaction((Redacted) parcel.readParcelable(SupportArticleConfig.ByArticleTokenAndTransaction.class.getClassLoader()), parcel.readString());
                        case 6:
                            parcel.getClass();
                            return new SupportArticleConfig.ByArticleTokenAndTransactionId(parcel.readString());
                        case 7:
                            parcel.getClass();
                            return new SupportArticleConfig.ByTransaction((Redacted) parcel.readParcelable(SupportArticleConfig.ByTransaction.class.getClassLoader()));
                        case 8:
                            parcel.getClass();
                            parcel.readInt();
                            return SupportArticleConfig.ByTransactionId.INSTANCE;
                        case 9:
                            parcel.getClass();
                            Data createFromParcel = Data.CREATOR.createFromParcel(parcel);
                            int readInt = parcel.readInt();
                            ArrayList arrayList = new ArrayList(readInt);
                            while (i != readInt) {
                                i = CameraState$Type$EnumUnboxingLocalUtility.m(SupportArticleIncidentsSheetScreen.class, parcel, arrayList, i, 1);
                            }
                            return new SupportArticleIncidentsSheetScreen(createFromParcel, arrayList, (AskedQuestion) parcel.readParcelable(SupportArticleIncidentsSheetScreen.class.getClassLoader()));
                        case 10:
                            parcel.getClass();
                            parcel.readInt();
                            return SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion.INSTANCE;
                        case 11:
                            parcel.getClass();
                            return new SupportDisputeTrackerScreen(Data.CREATOR.createFromParcel(parcel));
                        case 12:
                            parcel.getClass();
                            String readString6 = parcel.readString();
                            Data createFromParcel2 = Data.CREATOR.createFromParcel(parcel);
                            ChatStatus chatStatus = (ChatStatus) parcel.readParcelable(SupportHomeScreen.class.getClassLoader());
                            SearchPlaceholder searchPlaceholder = (SearchPlaceholder) parcel.readParcelable(SupportHomeScreen.class.getClassLoader());
                            int readInt2 = parcel.readInt();
                            ArrayList arrayList2 = new ArrayList(readInt2);
                            while (i != readInt2) {
                                i = CameraState$Type$EnumUnboxingLocalUtility.m(SupportHomeScreen.class, parcel, arrayList2, i, 1);
                            }
                            return new SupportHomeScreen(readString6, createFromParcel2, chatStatus, searchPlaceholder, arrayList2, BackNavigationAction.valueOf(parcel.readString()));
                        case 13:
                            parcel.getClass();
                            return new SupportIncidentDetailsScreen(Data.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, SupportIncidentDetailsScreen.Source.valueOf(parcel.readString()));
                        case 14:
                            parcel.getClass();
                            Data createFromParcel3 = Data.CREATOR.createFromParcel(parcel);
                            String readString7 = parcel.readString();
                            int readInt3 = parcel.readInt();
                            ArrayList arrayList3 = new ArrayList(readInt3);
                            while (i != readInt3) {
                                i = CameraState$Type$EnumUnboxingLocalUtility.m(SupportSearchScreen.class, parcel, arrayList3, i, 1);
                            }
                            return new SupportSearchScreen(createFromParcel3, readString7, arrayList3, (SearchPlaceholder) parcel.readParcelable(SupportSearchScreen.class.getClassLoader()));
                        case 15:
                            parcel.getClass();
                            return new PhoneVerificationScreen(parcel.readString(), parcel.readString(), PhoneVerificationScreen.Source.valueOf(parcel.readString()));
                        case 16:
                            parcel.getClass();
                            return new ScreenshotScreen.ScreenshotArgs(ScreenshotScreen.Trigger.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), ScreenshotScreen.SubmissionTarget.valueOf(parcel.readString()));
                        case 17:
                            parcel.getClass();
                            return new ScreenshotScreen.ScreenshotConfirmScreen(ScreenshotScreen.ScreenshotArgs.CREATOR.createFromParcel(parcel));
                        case 18:
                            parcel.getClass();
                            return new ScreenshotScreen.ScreenshotReviewScreen(ScreenshotScreen.ScreenshotArgs.CREATOR.createFromParcel(parcel));
                        case 19:
                            parcel.getClass();
                            return new SupportScreens$SupportDialogs$SupportFlowCheckConnectionScreen(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
                        case 20:
                            parcel.getClass();
                            return new SupportLoadClientScenarioScreen(parcel.readString(), Data.CREATOR.createFromParcel(parcel));
                        case 21:
                            parcel.getClass();
                            return new SupportPhoneStatusScreen(parcel.readInt() != 0, parcel.readString(), CustomerSupportPhoneViewStatus.Trigger.valueOf(parcel.readString()));
                        case 22:
                            parcel.getClass();
                            return new SupportSheets.SupportHomeContactOptionsSheetScreen.ContactOption(parcel.readString(), parcel.readString(), SupportSheets.SupportHomeContactOptionsSheetScreen.ContactOption.Type.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
                        case 23:
                            parcel.getClass();
                            Data createFromParcel4 = Data.CREATOR.createFromParcel(parcel);
                            int readInt4 = parcel.readInt();
                            ArrayList arrayList4 = new ArrayList(readInt4);
                            while (i != readInt4) {
                                i = CameraState$Type$EnumUnboxingLocalUtility.m(SupportSheets.SupportHomeContactOptionsSheetScreen.ContactOption.CREATOR, parcel, arrayList4, i, 1);
                            }
                            return new SupportSheets.SupportHomeContactOptionsSheetScreen(createFromParcel4, arrayList4, (AskedQuestion) parcel.readParcelable(SupportSheets.SupportHomeContactOptionsSheetScreen.class.getClassLoader()));
                        case 24:
                            parcel.getClass();
                            parcel.readInt();
                            return SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion.INSTANCE;
                        case 25:
                            parcel.getClass();
                            parcel.readInt();
                            return SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetResult.Chat.INSTANCE;
                        case 26:
                            parcel.getClass();
                            parcel.readInt();
                            return SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetResult.Phone.INSTANCE;
                        case 27:
                            parcel.getClass();
                            return new SupportSheets.SupportTransactionConfirmationSheet(Data.CREATOR.createFromParcel(parcel), (AskedQuestion) parcel.readParcelable(SupportSheets.SupportTransactionConfirmationSheet.class.getClassLoader()));
                        case 28:
                            parcel.getClass();
                            return new SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion(parcel.readString(), Article.ContactOption.valueOf(parcel.readString()));
                        default:
                            parcel.getClass();
                            parcel.readInt();
                            return SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationResult.No.INSTANCE;
                    }
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    switch (this.$r8$classId) {
                        case 0:
                            return new Data[i];
                        case 1:
                            return new SupportActivityPickerFullScreen[i];
                        case 2:
                            return new SupportActivityPickerFullScreen.SelectTransactionQuestion[i];
                        case 3:
                            return new SupportScreens$FlowScreens$SupportActivityPickerFullScreen$SelectTransactionResult$Success[i];
                        case 4:
                            return new SupportArticleConfig.ByArticleToken[i];
                        case 5:
                            return new SupportArticleConfig.ByArticleTokenAndTransaction[i];
                        case 6:
                            return new SupportArticleConfig.ByArticleTokenAndTransactionId[i];
                        case 7:
                            return new SupportArticleConfig.ByTransaction[i];
                        case 8:
                            return new SupportArticleConfig.ByTransactionId[i];
                        case 9:
                            return new SupportArticleIncidentsSheetScreen[i];
                        case 10:
                            return new SupportArticleIncidentsSheetScreen.IncidentsSheetQuestion[i];
                        case 11:
                            return new SupportDisputeTrackerScreen[i];
                        case 12:
                            return new SupportHomeScreen[i];
                        case 13:
                            return new SupportIncidentDetailsScreen[i];
                        case 14:
                            return new SupportSearchScreen[i];
                        case 15:
                            return new PhoneVerificationScreen[i];
                        case 16:
                            return new ScreenshotScreen.ScreenshotArgs[i];
                        case 17:
                            return new ScreenshotScreen.ScreenshotConfirmScreen[i];
                        case 18:
                            return new ScreenshotScreen.ScreenshotReviewScreen[i];
                        case 19:
                            return new SupportScreens$SupportDialogs$SupportFlowCheckConnectionScreen[i];
                        case 20:
                            return new SupportLoadClientScenarioScreen[i];
                        case 21:
                            return new SupportPhoneStatusScreen[i];
                        case 22:
                            return new SupportSheets.SupportHomeContactOptionsSheetScreen.ContactOption[i];
                        case 23:
                            return new SupportSheets.SupportHomeContactOptionsSheetScreen[i];
                        case 24:
                            return new SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetQuestion[i];
                        case 25:
                            return new SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetResult.Chat[i];
                        case 26:
                            return new SupportSheets.SupportHomeContactOptionsSheetScreen.SupportHomeContactOptionsSheetResult.Phone[i];
                        case 27:
                            return new SupportSheets.SupportTransactionConfirmationSheet[i];
                        case 28:
                            return new SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationQuestion[i];
                        default:
                            return new SupportSheets.SupportTransactionConfirmationSheet.TransactionConfirmationResult.No[i];
                    }
                }
            }

            public Data(String str, String str2, String str3, String str4, String str5, Screen screen, Article.ContactOption contactOption, Boolean bool) {
                str.getClass();
                screen.getClass();
                this.flowToken = str;
                this.rootNodeToken = str2;
                this.paymentToken = str3;
                this.parentNodeToken = str4;
                this.searchText = str5;
                this.exitScreen = screen;
                this.contactOption = contactOption;
                this.includeIssueDescription = bool;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r13v2, types: [app.cash.broadway.screen.Screen] */
            public static Data copy$default(Data data, String str, String str2, String str3, FlowScreens flowScreens, Article.ContactOption contactOption, Boolean bool, int i) {
                String str4 = data.flowToken;
                if ((i & 2) != 0) {
                    str = data.rootNodeToken;
                }
                String str5 = str;
                if ((i & 4) != 0) {
                    str2 = data.paymentToken;
                }
                String str6 = str2;
                String str7 = data.parentNodeToken;
                if ((i & 16) != 0) {
                    str3 = data.searchText;
                }
                String str8 = str3;
                FlowScreens flowScreens2 = flowScreens;
                if ((i & 32) != 0) {
                    flowScreens2 = data.exitScreen;
                }
                FlowScreens flowScreens3 = flowScreens2;
                if ((i & 64) != 0) {
                    contactOption = data.contactOption;
                }
                Article.ContactOption contactOption2 = contactOption;
                Boolean bool2 = (i & 128) != 0 ? data.includeIssueDescription : bool;
                data.getClass();
                str4.getClass();
                flowScreens3.getClass();
                return new Data(str4, str5, str6, str7, str8, flowScreens3, contactOption2, bool2);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Data)) {
                    return false;
                }
                Data data = (Data) obj;
                return Intrinsics.areEqual(this.flowToken, data.flowToken) && Intrinsics.areEqual(this.rootNodeToken, data.rootNodeToken) && Intrinsics.areEqual(this.paymentToken, data.paymentToken) && Intrinsics.areEqual(this.parentNodeToken, data.parentNodeToken) && Intrinsics.areEqual(this.searchText, data.searchText) && Intrinsics.areEqual(this.exitScreen, data.exitScreen) && this.contactOption == data.contactOption && Intrinsics.areEqual(this.includeIssueDescription, data.includeIssueDescription);
            }

            public final Screen getExitScreen() {
                return this.exitScreen;
            }

            public final int hashCode() {
                int hashCode = this.flowToken.hashCode() * 31;
                String str = this.rootNodeToken;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.paymentToken;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.parentNodeToken;
                int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.searchText;
                int m = BalanceFeedKt$$ExternalSyntheticOutline0.m(this.exitScreen, (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
                Article.ContactOption contactOption = this.contactOption;
                int hashCode5 = (m + (contactOption == null ? 0 : contactOption.hashCode())) * 31;
                Boolean bool = this.includeIssueDescription;
                return hashCode5 + (bool != null ? bool.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Data(flowToken=", this.flowToken, ", rootNodeToken=", this.rootNodeToken, ", paymentToken=");
                Boxes$$ExternalSyntheticOutline1.m(m, this.paymentToken, ", parentNodeToken=", this.parentNodeToken, ", searchText=");
                m.append(this.searchText);
                m.append(", exitScreen=");
                m.append(this.exitScreen);
                m.append(", contactOption=");
                m.append(this.contactOption);
                m.append(", includeIssueDescription=");
                m.append(this.includeIssueDescription);
                m.append(")");
                return m.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.flowToken);
                parcel.writeString(this.rootNodeToken);
                parcel.writeString(this.paymentToken);
                parcel.writeString(this.parentNodeToken);
                parcel.writeString(this.searchText);
                parcel.writeParcelable(this.exitScreen, i);
                Article.ContactOption contactOption = this.contactOption;
                if (contactOption == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeString(contactOption.name());
                }
                Boolean bool = this.includeIssueDescription;
                if (bool == null) {
                    parcel.writeInt(0);
                } else {
                    CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool);
                }
            }

            public /* synthetic */ Data(String str, String str2, String str3, Screen screen, int i) {
                this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, null, null, screen, null, null);
            }
        }

        public final class SupportHomeScreen extends FlowScreens implements SingleInstanceScreen {
            public static final Parcelable.Creator<SupportHomeScreen> CREATOR = new Data.Creator(12);
            public final BackNavigationAction backNavigationAction;
            public final ChatStatus chatStatus;
            public final Data data;
            public final String nodeToken;
            public final SearchPlaceholder searchPlaceholder;
            public final List suggestedArticles;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SupportHomeScreen(String str, Data data, ChatStatus chatStatus, SearchPlaceholder searchPlaceholder, List list, BackNavigationAction backNavigationAction) {
                super(0);
                data.getClass();
                chatStatus.getClass();
                list.getClass();
                backNavigationAction.getClass();
                this.nodeToken = str;
                this.data = data;
                this.chatStatus = chatStatus;
                this.searchPlaceholder = searchPlaceholder;
                this.suggestedArticles = list;
                this.backNavigationAction = backNavigationAction;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // com.squareup.cash.screens.MainScreens
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SupportHomeScreen)) {
                    return false;
                }
                SupportHomeScreen supportHomeScreen = (SupportHomeScreen) obj;
                return Intrinsics.areEqual(this.nodeToken, supportHomeScreen.nodeToken) && Intrinsics.areEqual(this.data, supportHomeScreen.data) && Intrinsics.areEqual(this.chatStatus, supportHomeScreen.chatStatus) && Intrinsics.areEqual(this.searchPlaceholder, supportHomeScreen.searchPlaceholder) && Intrinsics.areEqual(this.suggestedArticles, supportHomeScreen.suggestedArticles) && this.backNavigationAction == supportHomeScreen.backNavigationAction;
            }

            @Override // com.squareup.cash.support.screens.SupportScreens.FlowScreens
            public final Data getData() {
                return this.data;
            }

            @Override // com.squareup.cash.screens.MainScreens
            public final int hashCode() {
                String str = this.nodeToken;
                int hashCode = (this.chatStatus.hashCode() + ((this.data.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31;
                SearchPlaceholder searchPlaceholder = this.searchPlaceholder;
                return this.backNavigationAction.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode + (searchPlaceholder != null ? searchPlaceholder.hashCode() : 0)) * 31, 31, this.suggestedArticles);
            }

            @Override // app.cash.broadway.screen.Screen
            public final String prettyName() {
                return "support_home_screen";
            }

            public final String toString() {
                return "SupportHomeScreen(nodeToken=" + this.nodeToken + ", data=" + this.data + ", chatStatus=" + this.chatStatus + ", searchPlaceholder=" + this.searchPlaceholder + ", suggestedArticles=" + this.suggestedArticles + ", backNavigationAction=" + this.backNavigationAction + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeString(this.nodeToken);
                this.data.writeToParcel(parcel, i);
                parcel.writeParcelable(this.chatStatus, i);
                parcel.writeParcelable(this.searchPlaceholder, i);
                Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.suggestedArticles, parcel);
                while (m.hasNext()) {
                    parcel.writeParcelable((Parcelable) m.next(), i);
                }
                parcel.writeString(this.backNavigationAction.name());
            }

            public SupportHomeScreen(String str, Data data, BackNavigationAction backNavigationAction, int i) {
                this(str, data, ChatStatus.FeatureDisabled.INSTANCE, null, EmptyList.INSTANCE, (i & 32) != 0 ? BackNavigationAction.CLOSE : backNavigationAction);
            }
        }
    }
}
