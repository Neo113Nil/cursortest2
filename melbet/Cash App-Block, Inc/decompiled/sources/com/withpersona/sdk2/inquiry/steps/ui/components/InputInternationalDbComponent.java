package com.withpersona.sdk2.inquiry.steps.ui.components;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.workflow1.ui.TextControllerImpl;
import com.withpersona.sdk2.inquiry.network.dto.JsonLogicBoolean;
import com.withpersona.sdk2.inquiry.network.dto.ui.InputSelectBoxComponentStyle;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.InputInternationalDb;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.InputSelectComponentStyle;
import com.withpersona.sdk2.inquiry.steps.ui.components.Option;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class InputInternationalDbComponent implements UiComponent, DisableableComponent, HideableComponent {
    public static final Parcelable.Creator<InputInternationalDbComponent> CREATOR = new Option.Creator(18);
    public final List allowedIdTypes;
    public final ArrayList associatedViews;
    public final List countryOptions;
    public TextControllerImpl countryOptionsController;
    public final AnonymousClass4 countrySelectComponent;
    public final JsonLogicBoolean disabled;
    public final JsonLogicBoolean hidden;
    public final boolean hideCountryField;
    public final Boolean hideCountryIfSingleChoice;
    public final boolean hideIdTypeField;
    public final Boolean hideTypeIfSingleChoice;
    public TextControllerImpl idTypeOptionsController;
    public final String idValue;
    public TextControllerImpl idValueController;
    public final InputSelectComponentStyle inputSelectStyle;
    public final String name;
    public final String selectedCountry;
    public final String selectedIdType;
    public final LinkedHashMap typesByCountryCode;

    public abstract class Companion {
        public static InputInternationalDbComponent fromConfig(InputInternationalDb inputInternationalDb) {
            List<InputInternationalDb.IdType> allowedIdTypes;
            String countryName;
            String name;
            inputInternationalDb.getClass();
            InputInternationalDb.Attributes attributes = inputInternationalDb.getAttributes();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            InputInternationalDb.Attributes attributes2 = inputInternationalDb.getAttributes();
            if (attributes2 != null && (allowedIdTypes = attributes2.getAllowedIdTypes()) != null) {
                for (InputInternationalDb.IdType idType : allowedIdTypes) {
                    String countryCode = idType.getCountryCode();
                    if (countryCode != null && (countryName = idType.getCountryName()) != null) {
                        linkedHashSet.add(new CountryOption(countryName, countryCode));
                        Object obj = linkedHashMap.get(countryCode);
                        if (obj == null) {
                            obj = new ArrayList();
                            linkedHashMap.put(countryCode, obj);
                        }
                        Collection collection = (Collection) obj;
                        String idType2 = idType.getIdType();
                        if (idType2 != null && (name = idType.getName()) != null) {
                            collection.add(new IdOption(idType2, name));
                        }
                    }
                }
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                List list = (List) ((Map.Entry) it.next()).getValue();
                if (list.size() > 1) {
                    CollectionsKt__MutableCollectionsJVMKt.sortWith(list, new InputInternationalDbComponent$special$$inlined$sortedBy$1(1));
                }
            }
            boolean z = (attributes != null ? Intrinsics.areEqual(attributes.getHideCountryIfPrefilled(), Boolean.TRUE) : false) && attributes.getPrefillIdbCountry() != null;
            boolean z2 = (attributes != null ? Intrinsics.areEqual(attributes.getHideTypeIfPrefilled(), Boolean.TRUE) : false) && attributes.getPrefillIdbType() != null;
            String name2 = inputInternationalDb.getName();
            InputInternationalDb.Attributes attributes3 = inputInternationalDb.getAttributes();
            String prefillIdbCountry = attributes3 != null ? attributes3.getPrefillIdbCountry() : null;
            InputInternationalDb.Attributes attributes4 = inputInternationalDb.getAttributes();
            String prefillIdbType = attributes4 != null ? attributes4.getPrefillIdbType() : null;
            InputInternationalDb.Attributes attributes5 = inputInternationalDb.getAttributes();
            String prefillIdbValue = attributes5 != null ? attributes5.getPrefillIdbValue() : null;
            InputInternationalDb.Attributes attributes6 = inputInternationalDb.getAttributes();
            JsonLogicBoolean hidden = attributes6 != null ? attributes6.getHidden() : null;
            InputInternationalDb.Attributes attributes7 = inputInternationalDb.getAttributes();
            JsonLogicBoolean disabled = attributes7 != null ? attributes7.getDisabled() : null;
            InputInternationalDb.Attributes attributes8 = inputInternationalDb.getAttributes();
            Boolean hideCountryIfSingleChoice = attributes8 != null ? attributes8.getHideCountryIfSingleChoice() : null;
            InputInternationalDb.Attributes attributes9 = inputInternationalDb.getAttributes();
            Boolean hideTypeIfSingleChoice = attributes9 != null ? attributes9.getHideTypeIfSingleChoice() : null;
            InputInternationalDb.Attributes attributes10 = inputInternationalDb.getAttributes();
            List<InputInternationalDb.IdType> allowedIdTypes2 = attributes10 != null ? attributes10.getAllowedIdTypes() : null;
            InputInternationalDb.InputInternationalDbComponentStyle styles = inputInternationalDb.getStyles();
            return new InputInternationalDbComponent(name2, prefillIdbCountry, prefillIdbType, prefillIdbValue, hidden, disabled, z, z2, hideCountryIfSingleChoice, hideTypeIfSingleChoice, allowedIdTypes2, styles != null ? styles.getInputSelectStyle() : null);
        }
    }

    public final class CountryOption {
        public final String countryCode;
        public final String countryName;

        public CountryOption(String str, String str2) {
            this.countryName = str;
            this.countryCode = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CountryOption)) {
                return false;
            }
            CountryOption countryOption = (CountryOption) obj;
            return this.countryName.equals(countryOption.countryName) && this.countryCode.equals(countryOption.countryCode);
        }

        public final int hashCode() {
            return this.countryCode.hashCode() + (this.countryName.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("CountryOption(countryName=", this.countryName, ", countryCode=", this.countryCode, ")");
        }
    }

    public final class IdOption {
        public final String idType;
        public final String name;

        public IdOption(String str, String str2) {
            this.idType = str;
            this.name = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdOption)) {
                return false;
            }
            IdOption idOption = (IdOption) obj;
            return this.idType.equals(idOption.idType) && this.name.equals(idOption.name);
        }

        public final int hashCode() {
            return this.name.hashCode() + (this.idType.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("IdOption(idType=", this.idType, ", name=", this.name, ")");
        }
    }

    public InputInternationalDbComponent(String str, String str2, String str3, String str4, JsonLogicBoolean jsonLogicBoolean, JsonLogicBoolean jsonLogicBoolean2, boolean z, boolean z2, Boolean bool, Boolean bool2, List list, InputSelectComponentStyle inputSelectComponentStyle) {
        Option option;
        Object obj;
        Object obj2;
        String countryName;
        String name;
        str.getClass();
        this.name = str;
        this.selectedCountry = str2;
        this.selectedIdType = str3;
        this.idValue = str4;
        this.hidden = jsonLogicBoolean;
        this.disabled = jsonLogicBoolean2;
        this.hideCountryField = z;
        this.hideIdTypeField = z2;
        this.hideCountryIfSingleChoice = bool;
        this.hideTypeIfSingleChoice = bool2;
        this.allowedIdTypes = list;
        this.inputSelectStyle = inputSelectComponentStyle;
        this.associatedViews = new ArrayList();
        this.idValueController = new TextControllerImpl(str4 == null ? "" : str4);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InputInternationalDb.IdType idType = (InputInternationalDb.IdType) it.next();
                String countryCode = idType.getCountryCode();
                if (countryCode != null && (countryName = idType.getCountryName()) != null) {
                    linkedHashSet.add(new CountryOption(countryName, countryCode));
                    Object obj3 = linkedHashMap.get(countryCode);
                    if (obj3 == null) {
                        obj3 = new ArrayList();
                        linkedHashMap.put(countryCode, obj3);
                    }
                    Collection collection = (Collection) obj3;
                    String idType2 = idType.getIdType();
                    if (idType2 != null && (name = idType.getName()) != null) {
                        collection.add(new IdOption(idType2, name));
                    }
                }
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            List list2 = (List) ((Map.Entry) it2.next()).getValue();
            if (list2.size() > 1) {
                CollectionsKt__MutableCollectionsJVMKt.sortWith(list2, new InputInternationalDbComponent$special$$inlined$sortedBy$1(2));
            }
        }
        Iterator it3 = linkedHashSet.iterator();
        while (true) {
            option = null;
            if (!it3.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it3.next();
                if (((CountryOption) obj).countryCode.equals(this.selectedCountry)) {
                    break;
                }
            }
        }
        CountryOption countryOption = (CountryOption) obj;
        Option option2 = countryOption != null ? new Option(countryOption.countryName, countryOption.countryCode) : null;
        List list3 = (List) linkedHashMap.get(option2 != null ? option2.value : null);
        if (list3 != null) {
            Iterator it4 = list3.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it4.next();
                    if (((IdOption) obj2).idType.equals(this.selectedIdType)) {
                        break;
                    }
                }
            }
            IdOption idOption = (IdOption) obj2;
            if (idOption != null) {
                option = new Option(idOption.name, idOption.idType);
            }
        }
        this.countryOptionsController = new TextControllerImpl(option2);
        this.idTypeOptionsController = new TextControllerImpl(option);
        this.countryOptions = CollectionsKt.sortedWith(CollectionsKt.toList(linkedHashSet), new InputInternationalDbComponent$special$$inlined$sortedBy$1(0));
        this.typesByCountryCode = linkedHashMap;
        this.countrySelectComponent = new AnonymousClass4(linkedHashSet);
    }

    public static InputInternationalDbComponent copy$default(InputInternationalDbComponent inputInternationalDbComponent, String str, String str2, String str3, int i) {
        String str4 = inputInternationalDbComponent.name;
        if ((i & 2) != 0) {
            str = inputInternationalDbComponent.selectedCountry;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = inputInternationalDbComponent.selectedIdType;
        }
        String str6 = str2;
        String str7 = (i & 8) != 0 ? inputInternationalDbComponent.idValue : str3;
        JsonLogicBoolean jsonLogicBoolean = inputInternationalDbComponent.hidden;
        JsonLogicBoolean jsonLogicBoolean2 = inputInternationalDbComponent.disabled;
        boolean z = inputInternationalDbComponent.hideCountryField;
        boolean z2 = inputInternationalDbComponent.hideIdTypeField;
        Boolean bool = inputInternationalDbComponent.hideCountryIfSingleChoice;
        Boolean bool2 = inputInternationalDbComponent.hideTypeIfSingleChoice;
        List list = inputInternationalDbComponent.allowedIdTypes;
        InputSelectComponentStyle inputSelectComponentStyle = inputInternationalDbComponent.inputSelectStyle;
        str4.getClass();
        return new InputInternationalDbComponent(str4, str5, str6, str7, jsonLogicBoolean, jsonLogicBoolean2, z, z2, bool, bool2, list, inputSelectComponentStyle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputInternationalDbComponent)) {
            return false;
        }
        InputInternationalDbComponent inputInternationalDbComponent = (InputInternationalDbComponent) obj;
        return Intrinsics.areEqual(this.name, inputInternationalDbComponent.name) && Intrinsics.areEqual(this.selectedCountry, inputInternationalDbComponent.selectedCountry) && Intrinsics.areEqual(this.selectedIdType, inputInternationalDbComponent.selectedIdType) && Intrinsics.areEqual(this.idValue, inputInternationalDbComponent.idValue) && Intrinsics.areEqual(this.hidden, inputInternationalDbComponent.hidden) && Intrinsics.areEqual(this.disabled, inputInternationalDbComponent.disabled) && this.hideCountryField == inputInternationalDbComponent.hideCountryField && this.hideIdTypeField == inputInternationalDbComponent.hideIdTypeField && Intrinsics.areEqual(this.hideCountryIfSingleChoice, inputInternationalDbComponent.hideCountryIfSingleChoice) && Intrinsics.areEqual(this.hideTypeIfSingleChoice, inputInternationalDbComponent.hideTypeIfSingleChoice) && Intrinsics.areEqual(this.allowedIdTypes, inputInternationalDbComponent.allowedIdTypes) && Intrinsics.areEqual(this.inputSelectStyle, inputInternationalDbComponent.inputSelectStyle);
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
        int hashCode = this.name.hashCode() * 31;
        String str = this.selectedCountry;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.selectedIdType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.idValue;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean = this.hidden;
        int hashCode5 = (hashCode4 + (jsonLogicBoolean == null ? 0 : jsonLogicBoolean.hashCode())) * 31;
        JsonLogicBoolean jsonLogicBoolean2 = this.disabled;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode5 + (jsonLogicBoolean2 == null ? 0 : jsonLogicBoolean2.hashCode())) * 31, 31, this.hideCountryField), 31, this.hideIdTypeField);
        Boolean bool = this.hideCountryIfSingleChoice;
        int hashCode6 = (m + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hideTypeIfSingleChoice;
        int hashCode7 = (hashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List list = this.allowedIdTypes;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        InputSelectComponentStyle inputSelectComponentStyle = this.inputSelectStyle;
        return hashCode8 + (inputSelectComponentStyle != null ? inputSelectComponentStyle.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("InputInternationalDbComponent(name=", this.name, ", selectedCountry=", this.selectedCountry, ", selectedIdType=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.selectedIdType, ", idValue=", this.idValue, ", hidden=");
        m.append(this.hidden);
        m.append(", disabled=");
        m.append(this.disabled);
        m.append(", hideCountryField=");
        re$$ExternalSyntheticOutline0.m(m, this.hideCountryField, ", hideIdTypeField=", this.hideIdTypeField, ", hideCountryIfSingleChoice=");
        Thread$State$EnumUnboxingLocalUtility.m(m, this.hideCountryIfSingleChoice, ", hideTypeIfSingleChoice=", this.hideTypeIfSingleChoice, ", allowedIdTypes=");
        m.append(this.allowedIdTypes);
        m.append(", inputSelectStyle=");
        m.append(this.inputSelectStyle);
        m.append(")");
        return m.toString();
    }

    public final InputInternationalDbComponent updateSelectedCountry(Option option) {
        InputInternationalDbComponent copy$default = copy$default(this, option != null ? option.value : null, null, null, 4093);
        copy$default.countryOptionsController = this.countryOptionsController;
        copy$default.idTypeOptionsController = this.idTypeOptionsController;
        copy$default.idValueController = this.idValueController;
        return copy$default;
    }

    public final InputInternationalDbComponent updateSelectedIdType(Option option) {
        InputInternationalDbComponent copy$default = copy$default(this, null, option != null ? option.value : null, null, 4091);
        copy$default.countryOptionsController = this.countryOptionsController;
        copy$default.idTypeOptionsController = this.idTypeOptionsController;
        copy$default.idValueController = this.idValueController;
        return copy$default;
    }

    public final InputInternationalDbComponent updateValue(String str) {
        InputInternationalDbComponent copy$default = copy$default(this, null, null, str, 4087);
        copy$default.countryOptionsController = this.countryOptionsController;
        copy$default.idTypeOptionsController = this.idTypeOptionsController;
        copy$default.idValueController = this.idValueController;
        return copy$default;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.name);
        parcel.writeString(this.selectedCountry);
        parcel.writeString(this.selectedIdType);
        parcel.writeString(this.idValue);
        parcel.writeParcelable(this.hidden, i);
        parcel.writeParcelable(this.disabled, i);
        parcel.writeInt(this.hideCountryField ? 1 : 0);
        parcel.writeInt(this.hideIdTypeField ? 1 : 0);
        Boolean bool = this.hideCountryIfSingleChoice;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool);
        }
        Boolean bool2 = this.hideTypeIfSingleChoice;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            CameraState$Type$EnumUnboxingLocalUtility.m(parcel, 1, bool2);
        }
        List list = this.allowedIdTypes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
            while (m.hasNext()) {
                parcel.writeParcelable((Parcelable) m.next(), i);
            }
        }
        parcel.writeParcelable(this.inputSelectStyle, i);
    }

    /* renamed from: com.withpersona.sdk2.inquiry.steps.ui.components.InputInternationalDbComponent$4, reason: invalid class name */
    public final class AnonymousClass4 implements InputSelectBoxComponent {
        public final /* synthetic */ Object $countryOptions;
        public final /* synthetic */ int $r8$classId = 0;

        public AnonymousClass4(LinkedHashSet linkedHashSet) {
            this.$countryOptions = linkedHashSet;
        }

        @Override // com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent
        public final boolean getCanSelectMultipleValues() {
            switch (this.$r8$classId) {
            }
            return false;
        }

        @Override // com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent
        public final String getLabel() {
            switch (this.$r8$classId) {
            }
            return null;
        }

        @Override // com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent
        public final List getOptions() {
            int i = this.$r8$classId;
            Object obj = this.$countryOptions;
            switch (i) {
                case 0:
                    LinkedHashSet<CountryOption> linkedHashSet = (LinkedHashSet) obj;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(linkedHashSet, 10));
                    for (CountryOption countryOption : linkedHashSet) {
                        arrayList.add(new Option(countryOption.countryName, countryOption.countryCode));
                    }
                    return arrayList;
                default:
                    List<IdOption> list = (List) obj;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    for (IdOption idOption : list) {
                        arrayList2.add(new Option(idOption.name, idOption.idType));
                    }
                    return arrayList2;
            }
        }

        @Override // com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent
        public final List getSelectedOptions() {
            switch (this.$r8$classId) {
            }
            return EmptyList.INSTANCE;
        }

        @Override // com.withpersona.sdk2.inquiry.steps.ui.components.InputSelectBoxComponent
        public final InputSelectBoxComponentStyle getStyles() {
            int i = this.$r8$classId;
            InputInternationalDbComponent inputInternationalDbComponent = InputInternationalDbComponent.this;
            switch (i) {
            }
            return inputInternationalDbComponent.inputSelectStyle;
        }

        public AnonymousClass4(List list) {
            this.$countryOptions = list;
        }
    }
}
