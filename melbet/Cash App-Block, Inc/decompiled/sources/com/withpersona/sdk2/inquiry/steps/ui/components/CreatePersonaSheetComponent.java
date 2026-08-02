package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.CreatePersonaSheet;
import com.withpersona.sdk2.inquiry.steps.ui.UiComponentScreen;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class CreatePersonaSheetComponent implements SheetComponent {
    public static final Parcelable.Creator<CreatePersonaSheetComponent> CREATOR = new Creator();
    public final boolean autoCompleteOnDismiss;
    public final CreatePersonaSheet.CardCtaPage ctaCard;
    public final boolean hideWhenTappedOutside;
    public final String name;
    public final UiComponentScreen screen;
    public boolean showing;
    public boolean shown;
    public final String url;

    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            parcel.getClass();
            String readString = parcel.readString();
            CreatePersonaSheet.CardCtaPage cardCtaPage = (CreatePersonaSheet.CardCtaPage) parcel.readParcelable(CreatePersonaSheetComponent.class.getClassLoader());
            String readString2 = parcel.readString();
            boolean z4 = false;
            boolean z5 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z4 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z5 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z2;
            } else {
                z3 = z2;
                z2 = z;
            }
            if (parcel.readInt() == 0) {
                z3 = z;
            }
            return new CreatePersonaSheetComponent(readString, cardCtaPage, readString2, z4, z5, z2, z3, UiComponentScreen.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreatePersonaSheetComponent[i];
        }
    }

    public CreatePersonaSheetComponent(String str, CreatePersonaSheet.CardCtaPage cardCtaPage, String str2, boolean z, boolean z2, boolean z3, boolean z4, UiComponentScreen uiComponentScreen) {
        str.getClass();
        cardCtaPage.getClass();
        str2.getClass();
        uiComponentScreen.getClass();
        this.name = str;
        this.ctaCard = cardCtaPage;
        this.url = str2;
        this.autoCompleteOnDismiss = z;
        this.shown = z2;
        this.showing = z3;
        this.hideWhenTappedOutside = z4;
        this.screen = uiComponentScreen;
    }

    public static CreatePersonaSheetComponent copy$default(CreatePersonaSheetComponent createPersonaSheetComponent, UiComponentScreen uiComponentScreen, int i) {
        String str = createPersonaSheetComponent.name;
        CreatePersonaSheet.CardCtaPage cardCtaPage = createPersonaSheetComponent.ctaCard;
        String str2 = createPersonaSheetComponent.url;
        boolean z = createPersonaSheetComponent.autoCompleteOnDismiss;
        boolean z2 = (i & 16) != 0 ? createPersonaSheetComponent.shown : true;
        boolean z3 = (i & 32) != 0 ? createPersonaSheetComponent.showing : false;
        boolean z4 = createPersonaSheetComponent.hideWhenTappedOutside;
        if ((i & 128) != 0) {
            uiComponentScreen = createPersonaSheetComponent.screen;
        }
        UiComponentScreen uiComponentScreen2 = uiComponentScreen;
        createPersonaSheetComponent.getClass();
        str.getClass();
        cardCtaPage.getClass();
        str2.getClass();
        uiComponentScreen2.getClass();
        return new CreatePersonaSheetComponent(str, cardCtaPage, str2, z, z2, z3, z4, uiComponentScreen2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatePersonaSheetComponent)) {
            return false;
        }
        CreatePersonaSheetComponent createPersonaSheetComponent = (CreatePersonaSheetComponent) obj;
        return Intrinsics.areEqual(this.name, createPersonaSheetComponent.name) && Intrinsics.areEqual(this.ctaCard, createPersonaSheetComponent.ctaCard) && Intrinsics.areEqual(this.url, createPersonaSheetComponent.url) && this.autoCompleteOnDismiss == createPersonaSheetComponent.autoCompleteOnDismiss && this.shown == createPersonaSheetComponent.shown && this.showing == createPersonaSheetComponent.showing && this.hideWhenTappedOutside == createPersonaSheetComponent.hideWhenTappedOutside && Intrinsics.areEqual(this.screen, createPersonaSheetComponent.screen);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        return this.screen.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.ctaCard.hashCode() + (this.name.hashCode() * 31)) * 31, 31, this.url), 31, this.autoCompleteOnDismiss), 31, this.shown), 31, this.showing), 31, this.hideWhenTappedOutside);
    }

    public final String toString() {
        boolean z = this.shown;
        boolean z2 = this.showing;
        StringBuilder sb = new StringBuilder("CreatePersonaSheetComponent(name=");
        sb.append(this.name);
        sb.append(", ctaCard=");
        sb.append(this.ctaCard);
        sb.append(", url=");
        NavAction$$ExternalSyntheticOutline0.m(sb, this.url, ", autoCompleteOnDismiss=", this.autoCompleteOnDismiss, ", shown=");
        re$$ExternalSyntheticOutline0.m(sb, z, ", showing=", z2, ", hideWhenTappedOutside=");
        sb.append(this.hideWhenTappedOutside);
        sb.append(", screen=");
        sb.append(this.screen);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
        parcel.writeParcelable(this.ctaCard, i);
        parcel.writeString(this.url);
        parcel.writeInt(this.autoCompleteOnDismiss ? 1 : 0);
        parcel.writeInt(this.shown ? 1 : 0);
        parcel.writeInt(this.showing ? 1 : 0);
        parcel.writeInt(this.hideWhenTappedOutside ? 1 : 0);
        this.screen.writeToParcel(parcel, i);
    }
}
