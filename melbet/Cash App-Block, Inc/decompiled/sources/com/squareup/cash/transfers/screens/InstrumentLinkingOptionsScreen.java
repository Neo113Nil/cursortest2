package com.squareup.cash.transfers.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.tax.screens.TaxMenuSheet;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class InstrumentLinkingOptionsScreen implements TransfersScreens, Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<InstrumentLinkingOptionsScreen> CREATOR = new TaxMenuSheet.Creator(24);
    public final String body;
    public final String header;
    public final Mode mode;
    public final List options;
    public final boolean useCardArt;

    /* loaded from: classes7.dex */
    public interface Mode extends Parcelable {

        public final class Navigation implements Mode {
            public static final Parcelable.Creator<Navigation> CREATOR = new TaxMenuSheet.Creator(25);
            public final Screen exitScreen;

            public Navigation(Screen screen) {
                screen.getClass();
                this.exitScreen = screen;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Navigation) && Intrinsics.areEqual(this.exitScreen, ((Navigation) obj).exitScreen);
            }

            public final int hashCode() {
                return this.exitScreen.hashCode();
            }

            public final String toString() {
                return re$$ExternalSyntheticOutline0.m(this.exitScreen, "Navigation(exitScreen=", ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.exitScreen, i);
            }
        }

        public final class Question implements Mode {
            public static final Parcelable.Creator<Question> CREATOR = new TaxMenuSheet.Creator(26);
            public final AskedQuestion question;

            public Question(AskedQuestion askedQuestion) {
                askedQuestion.getClass();
                this.question = askedQuestion;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Question) && Intrinsics.areEqual(this.question, ((Question) obj).question);
            }

            public final int hashCode() {
                return this.question.hashCode();
            }

            public final String toString() {
                return "Question(question=" + this.question + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeParcelable(this.question, i);
            }
        }
    }

    /* loaded from: classes7.dex */
    public final class Option implements Parcelable {
        public static final Parcelable.Creator<Option> CREATOR = new TaxMenuSheet.Creator(27);
        public final Icon icon;
        public final InstrumentLinkingOption instrumentLinkingOption;
        public final String subtitle;
        public final String title;

        public interface Icon extends Parcelable {

            public final class LocalIcon implements Icon {
                public static final Parcelable.Creator<LocalIcon> CREATOR = new TaxMenuSheet.Creator(28);
                public final String iconId;

                public LocalIcon(String str) {
                    str.getClass();
                    this.iconId = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof LocalIcon) && Intrinsics.areEqual(this.iconId, ((LocalIcon) obj).iconId);
                }

                public final int hashCode() {
                    return this.iconId.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LocalIcon(iconId=", this.iconId, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.iconId);
                }
            }

            public final class LocalResource implements Icon {
                public static final Parcelable.Creator<LocalResource> CREATOR = new TaxMenuSheet.Creator(29);
                public final int darkResId;
                public final int lightResId;

                public LocalResource(int i, int i2) {
                    this.lightResId = i;
                    this.darkResId = i2;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof LocalResource)) {
                        return false;
                    }
                    LocalResource localResource = (LocalResource) obj;
                    return this.lightResId == localResource.lightResId && this.darkResId == localResource.darkResId;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.darkResId) + (Integer.hashCode(this.lightResId) * 31);
                }

                public final String toString() {
                    return Recorder$$ExternalSyntheticOutline2.m(this.lightResId, this.darkResId, "LocalResource(lightResId=", ", darkResId=", ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeInt(this.lightResId);
                    parcel.writeInt(this.darkResId);
                }
            }

            public final class RemoteIcon implements Icon {
                public static final Parcelable.Creator<RemoteIcon> CREATOR = new WalletHomeScreen.Creator(1);
                public final String iconUrl;

                public RemoteIcon(String str) {
                    str.getClass();
                    this.iconUrl = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof RemoteIcon) && Intrinsics.areEqual(this.iconUrl, ((RemoteIcon) obj).iconUrl);
                }

                public final int hashCode() {
                    return this.iconUrl.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RemoteIcon(iconUrl=", this.iconUrl, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    parcel.getClass();
                    parcel.writeString(this.iconUrl);
                }
            }
        }

        public Option(String str, String str2, InstrumentLinkingOption instrumentLinkingOption, Icon icon) {
            str.getClass();
            str2.getClass();
            instrumentLinkingOption.getClass();
            icon.getClass();
            this.title = str;
            this.subtitle = str2;
            this.instrumentLinkingOption = instrumentLinkingOption;
            this.icon = icon;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Option)) {
                return false;
            }
            Option option = (Option) obj;
            return Intrinsics.areEqual(this.title, option.title) && Intrinsics.areEqual(this.subtitle, option.subtitle) && Intrinsics.areEqual(this.instrumentLinkingOption, option.instrumentLinkingOption) && Intrinsics.areEqual(this.icon, option.icon);
        }

        public final int hashCode() {
            return this.icon.hashCode() + ((this.instrumentLinkingOption.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.subtitle)) * 31);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Option(title=", this.title, ", subtitle=", this.subtitle, ", instrumentLinkingOption=");
            m.append(this.instrumentLinkingOption);
            m.append(", icon=");
            m.append(this.icon);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeParcelable(this.instrumentLinkingOption, i);
            parcel.writeParcelable(this.icon, i);
        }
    }

    public InstrumentLinkingOptionsScreen(String str, String str2, AbstractList abstractList, Mode mode, boolean z) {
        str.getClass();
        abstractList.getClass();
        mode.getClass();
        this.header = str;
        this.body = str2;
        this.options = abstractList;
        this.mode = mode;
        this.useCardArt = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentLinkingOptionsScreen)) {
            return false;
        }
        InstrumentLinkingOptionsScreen instrumentLinkingOptionsScreen = (InstrumentLinkingOptionsScreen) obj;
        return Intrinsics.areEqual(this.header, instrumentLinkingOptionsScreen.header) && Intrinsics.areEqual(this.body, instrumentLinkingOptionsScreen.body) && Intrinsics.areEqual(this.options, instrumentLinkingOptionsScreen.options) && Intrinsics.areEqual(this.mode, instrumentLinkingOptionsScreen.mode) && this.useCardArt == instrumentLinkingOptionsScreen.useCardArt;
    }

    public final int hashCode() {
        int hashCode = this.header.hashCode() * 31;
        String str = this.body;
        return Boolean.hashCode(this.useCardArt) + ((this.mode.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.options)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InstrumentLinkingOptionsScreen(header=", this.header, ", body=", this.body, ", options=");
        m.append(this.options);
        m.append(", mode=");
        m.append(this.mode);
        m.append(", useCardArt=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.useCardArt, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.header);
        parcel.writeString(this.body);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.options, parcel);
        while (m.hasNext()) {
            ((Option) m.next()).writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.mode, i);
        parcel.writeInt(this.useCardArt ? 1 : 0);
    }
}
