package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.moshi.Json;
import com.squareup.workflow1.ui.TextControllerImpl;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import com.withpersona.sdk2.inquiry.steps.ui.components.utils.AddressAutocompleteMethod;
import com.withpersona.sdk2.inquiry.steps.ui.network.Suggestion;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003R(\u0010\u0005\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\r\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u0010\u0010\f\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\nR(\u0010\u0011\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010\u0006\u0012\u0004\b\u0014\u0010\f\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR(\u0010\u0015\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0015\u0010\u0006\u0012\u0004\b\u0018\u0010\f\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\nR(\u0010\u0019\u001a\u00020\u00048\u0016@\u0016X\u0097\u000e¢\u0006\u0018\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001c\u0010\f\u001a\u0004\b\u001a\u0010\b\"\u0004\b\u001b\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/steps/ui/components/InputAddressComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/DisableableComponent;", "Lcom/withpersona/sdk2/inquiry/steps/ui/components/HideableComponent;", "Lcom/squareup/workflow1/ui/TextControllerImpl;", "textControllerForAddressStreet1", "Lcom/squareup/workflow1/ui/TextControllerImpl;", "getTextControllerForAddressStreet1", "()Lcom/squareup/workflow1/ui/TextControllerImpl;", "setTextControllerForAddressStreet1", "(Lcom/squareup/workflow1/ui/TextControllerImpl;)V", "getTextControllerForAddressStreet1$annotations", "()V", "textControllerForAddressStreet2", "getTextControllerForAddressStreet2", "setTextControllerForAddressStreet2", "getTextControllerForAddressStreet2$annotations", "textControllerForAddressCity", "getTextControllerForAddressCity", "setTextControllerForAddressCity", "getTextControllerForAddressCity$annotations", "textControllerForAddressSubdivision", "getTextControllerForAddressSubdivision", "setTextControllerForAddressSubdivision", "getTextControllerForAddressSubdivision$annotations", "textControllerForAddressPostalCode", "getTextControllerForAddressPostalCode", "setTextControllerForAddressPostalCode", "getTextControllerForAddressPostalCode$annotations", "ui-step-renderer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class InputAddressComponent implements UiComponent, DisableableComponent, HideableComponent {
    public static final Parcelable.Creator<InputAddressComponent> CREATOR = new Option.Creator(11);
    public final ArrayList associatedViews;
    public final AddressAutocompleteMethod autocompleteMethod;
    public final String city;
    public final JsonLogicBoolean disabled;
    public final JsonLogicBoolean hidden;
    public final Boolean isAddressAutocompleteLoading;
    public Boolean isAddressComponentsCollapsed;
    public TextControllerImpl isAddressFieldCollapsed;
    public final String name;
    public final String postalCode;
    public final String searchQuery;
    public final List searchResults;
    public final String selectedSearchResultId;
    public final String street1;
    public final String street2;
    public final String subdivision;
    public TextControllerImpl textControllerForAddressCity;
    public TextControllerImpl textControllerForAddressPostalCode;
    public TextControllerImpl textControllerForAddressStreet1;
    public TextControllerImpl textControllerForAddressStreet2;
    public TextControllerImpl textControllerForAddressSubdivision;

    public InputAddressComponent(String str, String str2, String str3, String str4, String str5, String str6, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, AddressAutocompleteMethod addressAutocompleteMethod, String str7, List list, String str8, Boolean bool, Boolean bool2) {
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        str6.getClass();
        addressAutocompleteMethod.getClass();
        this.name = str;
        this.street1 = str2;
        this.street2 = str3;
        this.city = str4;
        this.subdivision = str5;
        this.postalCode = str6;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.autocompleteMethod = addressAutocompleteMethod;
        this.searchQuery = str7;
        this.searchResults = list;
        this.selectedSearchResultId = str8;
        this.isAddressAutocompleteLoading = bool;
        this.isAddressComponentsCollapsed = bool2;
        this.associatedViews = new ArrayList();
        Boolean bool3 = this.isAddressComponentsCollapsed;
        this.isAddressFieldCollapsed = new TextControllerImpl(bool3 != null ? bool3.booleanValue() : true);
        this.textControllerForAddressStreet1 = new TextControllerImpl(str2);
        this.textControllerForAddressStreet2 = new TextControllerImpl(str3);
        this.textControllerForAddressCity = new TextControllerImpl(str4);
        this.textControllerForAddressSubdivision = new TextControllerImpl(str5);
        this.textControllerForAddressPostalCode = new TextControllerImpl(str6);
    }

    public static InputAddressComponent copy$default(InputAddressComponent inputAddressComponent, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, Boolean bool, Boolean bool2, int i) {
        String str8 = inputAddressComponent.name;
        String str9 = (i & 2) != 0 ? inputAddressComponent.street1 : str;
        String str10 = (i & 4) != 0 ? inputAddressComponent.street2 : str2;
        String str11 = (i & 8) != 0 ? inputAddressComponent.city : str3;
        String str12 = (i & 16) != 0 ? inputAddressComponent.subdivision : str4;
        String str13 = (i & 32) != 0 ? inputAddressComponent.postalCode : str5;
        JsonLogicBoolean jsonLogicBoolean = inputAddressComponent.hidden;
        JsonLogicBoolean jsonLogicBoolean2 = inputAddressComponent.disabled;
        AddressAutocompleteMethod addressAutocompleteMethod = inputAddressComponent.autocompleteMethod;
        String str14 = (i & 512) != 0 ? inputAddressComponent.searchQuery : str6;
        List list2 = (i & 1024) != 0 ? inputAddressComponent.searchResults : list;
        String str15 = (i & 2048) != 0 ? inputAddressComponent.selectedSearchResultId : str7;
        Boolean bool3 = (i & 4096) != 0 ? inputAddressComponent.isAddressAutocompleteLoading : bool;
        Boolean bool4 = (i & PKIFailureInfo.certRevoked) != 0 ? inputAddressComponent.isAddressComponentsCollapsed : bool2;
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, str9, str10, str11, str12);
        str13.getClass();
        addressAutocompleteMethod.getClass();
        return new InputAddressComponent(str8, str9, str10, str11, str12, str13, jsonLogicBoolean, jsonLogicBoolean2, addressAutocompleteMethod, str14, list2, str15, bool3, bool4);
    }

    @Json(ignore = true)
    public static /* synthetic */ void getTextControllerForAddressCity$annotations() {
    }

    @Json(ignore = true)
    public static /* synthetic */ void getTextControllerForAddressPostalCode$annotations() {
    }

    @Json(ignore = true)
    public static /* synthetic */ void getTextControllerForAddressStreet1$annotations() {
    }

    @Json(ignore = true)
    public static /* synthetic */ void getTextControllerForAddressStreet2$annotations() {
    }

    @Json(ignore = true)
    public static /* synthetic */ void getTextControllerForAddressSubdivision$annotations() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputAddressComponent)) {
            return false;
        }
        InputAddressComponent inputAddressComponent = (InputAddressComponent) obj;
        return Intrinsics.areEqual(this.name, inputAddressComponent.name) && Intrinsics.areEqual(this.street1, inputAddressComponent.street1) && Intrinsics.areEqual(this.street2, inputAddressComponent.street2) && Intrinsics.areEqual(this.city, inputAddressComponent.city) && Intrinsics.areEqual(this.subdivision, inputAddressComponent.subdivision) && Intrinsics.areEqual(this.postalCode, inputAddressComponent.postalCode) && Intrinsics.areEqual(this.hidden, inputAddressComponent.hidden) && Intrinsics.areEqual(this.disabled, inputAddressComponent.disabled) && this.autocompleteMethod == inputAddressComponent.autocompleteMethod && Intrinsics.areEqual(this.searchQuery, inputAddressComponent.searchQuery) && Intrinsics.areEqual(this.searchResults, inputAddressComponent.searchResults) && Intrinsics.areEqual(this.selectedSearchResultId, inputAddressComponent.selectedSearchResultId) && Intrinsics.areEqual(this.isAddressAutocompleteLoading, inputAddressComponent.isAddressAutocompleteLoading) && Intrinsics.areEqual(this.isAddressComponentsCollapsed, inputAddressComponent.isAddressComponentsCollapsed);
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.HideableComponent
    public final ArrayList getAssociatedViews() {
        return this.associatedViews;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.DisableableComponent
    public final JsonLogicBoolean getDisabled() {
        return this.disabled;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.HideableComponent
    public final JsonLogicBoolean getHidden() {
        return this.hidden;
    }

    @Override // com.withpersona.sdk2.inquiry.steps.ui.components.UiComponent
    public final String getName() {
        return this.name;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.street1), 31, this.street2), 31, this.city), 31, this.subdivision), 31, this.postalCode);
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int hashCode = (m + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int hashCode2 = (this.autocompleteMethod.hashCode() + ((hashCode + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31)) * 31;
        String str = this.searchQuery;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.searchResults;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.selectedSearchResultId;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.isAddressAutocompleteLoading;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isAddressComponentsCollapsed;
        return hashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.isAddressComponentsCollapsed;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InputAddressComponent(name=", this.name, ", street1=", this.street1, ", street2=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.street2, ", city=", this.city, ", subdivision=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.subdivision, ", postalCode=", this.postalCode, ", hidden=");
        m.append(this.hidden);
        m.append(", disabled=");
        m.append(this.disabled);
        m.append(", autocompleteMethod=");
        m.append(this.autocompleteMethod);
        m.append(", searchQuery=");
        m.append(this.searchQuery);
        m.append(", searchResults=");
        Recorder$$ExternalSyntheticOutline2.m(", selectedSearchResultId=", this.selectedSearchResultId, ", isAddressAutocompleteLoading=", m, this.searchResults);
        m.append(this.isAddressAutocompleteLoading);
        m.append(", isAddressComponentsCollapsed=");
        m.append(bool);
        m.append(")");
        return m.toString();
    }

    public final InputAddressComponent updateAddressCity(String str) {
        if (str == null) {
            str = "";
        }
        InputAddressComponent copy$default = copy$default(this, null, null, str, null, null, null, null, null, null, null, 16375);
        InputAddressComponentKt.access$copyControllers(copy$default, this);
        return copy$default;
    }

    public final InputAddressComponent updateAddressPostalCode(String str) {
        if (str == null) {
            str = "";
        }
        InputAddressComponent copy$default = copy$default(this, null, null, null, null, str, null, null, null, null, null, 16351);
        InputAddressComponentKt.access$copyControllers(copy$default, this);
        return copy$default;
    }

    public final InputAddressComponent updateAddressStreet1(String str) {
        if (str == null) {
            str = "";
        }
        InputAddressComponent copy$default = copy$default(this, str, null, null, null, null, null, null, null, null, null, 16381);
        InputAddressComponentKt.access$copyControllers(copy$default, this);
        return copy$default;
    }

    public final InputAddressComponent updateAddressStreet2(String str) {
        if (str == null) {
            str = "";
        }
        InputAddressComponent copy$default = copy$default(this, null, str, null, null, null, null, null, null, null, null, 16379);
        InputAddressComponentKt.access$copyControllers(copy$default, this);
        return copy$default;
    }

    public final InputAddressComponent updateAddressSubdivision(String str) {
        if (str == null) {
            str = "";
        }
        InputAddressComponent copy$default = copy$default(this, null, null, null, str, null, null, null, null, null, null, 16367);
        InputAddressComponentKt.access$copyControllers(copy$default, this);
        return copy$default;
    }

    public final InputAddressComponent updateCollapsedState(Boolean bool) {
        InputAddressComponent copy$default = copy$default(this, null, null, null, null, null, null, null, null, null, bool, 8191);
        InputAddressComponentKt.access$copyControllers(copy$default, this);
        return copy$default;
    }

    public final InputAddressComponent updateIsAddressAutocompleteLoading(Boolean bool) {
        InputAddressComponent copy$default = copy$default(this, null, null, null, null, null, null, null, null, bool, null, 12287);
        InputAddressComponentKt.access$copyControllers(copy$default, this);
        return copy$default;
    }

    public final InputAddressComponent updateSearchQuery(String str) {
        InputAddressComponent copy$default = copy$default(this, null, null, null, null, null, str, null, null, null, null, 15871);
        InputAddressComponentKt.access$copyControllers(copy$default, this);
        return copy$default;
    }

    public final InputAddressComponent updateSelectedSearchResultId(String str) {
        InputAddressComponent copy$default = copy$default(this, null, null, null, null, null, null, null, str, null, null, 14335);
        InputAddressComponentKt.access$copyControllers(copy$default, this);
        return copy$default;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
        parcel.writeString(this.street1);
        parcel.writeString(this.street2);
        parcel.writeString(this.city);
        parcel.writeString(this.subdivision);
        parcel.writeString(this.postalCode);
        parcel.writeParcelable(this.hidden, i);
        parcel.writeParcelable(this.disabled, i);
        parcel.writeString(this.autocompleteMethod.name());
        parcel.writeString(this.searchQuery);
        List list = this.searchResults;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
            while (m.hasNext()) {
                ((Suggestion) m.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.selectedSearchResultId);
        Boolean bool = this.isAddressAutocompleteLoading;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool);
        }
        Boolean bool2 = this.isAddressComponentsCollapsed;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool2);
        }
    }
}
