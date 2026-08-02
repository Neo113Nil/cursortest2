package com.stripe.android.uicore.elements;

import androidx.camera.core.LegacySessionConfig;
import com.datadog.opentelemetry.trace.OtelConventions;
import com.google.android.gms.internal.mlkit_vision_common.zzg;
import com.squareup.cash.R;
import com.squareup.cash.filament.util.IblLoaderKt;
import com.squareup.workflow1.internal.SubtreeManager;
import com.stripe.android.core.model.Country;
import com.stripe.android.core.model.CountryUtils;
import com.stripe.android.uicore.elements.PhoneNumberFormatter;
import com.stripe.android.uicore.utils.FlowToStateFlow;
import com.stripe.hcaptcha.encode.EncodeKt$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.CharRange;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes8.dex */
public final class PhoneNumberController {
    public final StateFlowImpl _fieldValue;
    public final StateFlowImpl _hasFocus;
    public final SubtreeManager countryConfig;
    public final LegacySessionConfig countryDropdownController;
    public final ReadonlyStateFlow fieldValue;
    public final FlowToStateFlow formFieldValue;
    public final String initialPhoneNumber;
    public final FlowToStateFlow isComplete;
    public final ReadonlyStateFlow label = IblLoaderKt.stateFlowOf(OtelConventions.resolvableString$default(R.string.stripe_address_label_phone_number, new Object[0]));
    public final FlowToStateFlow phoneNumberFormatter;
    public final FlowToStateFlow placeholder;
    public final FlowToStateFlow validationMessage;
    public final FlowToStateFlow visualTransformation;

    public PhoneNumberController(String str, String str2, Set set) {
        this.initialPhoneNumber = str;
        final int i = 0;
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(str);
        this._fieldValue = MutableStateFlow;
        ReadonlyStateFlow asStateFlow = FlowKt.asStateFlow(MutableStateFlow);
        this.fieldValue = asStateFlow;
        Boolean bool = Boolean.FALSE;
        StateFlowImpl MutableStateFlow2 = FlowKt.MutableStateFlow(bool);
        StateFlowImpl MutableStateFlow3 = FlowKt.MutableStateFlow(bool);
        this._hasFocus = MutableStateFlow3;
        final int i2 = 1;
        EncodeKt$$ExternalSyntheticLambda0 encodeKt$$ExternalSyntheticLambda0 = new EncodeKt$$ExternalSyntheticLambda0(i2);
        EncodeKt$$ExternalSyntheticLambda0 encodeKt$$ExternalSyntheticLambda02 = new EncodeKt$$ExternalSyntheticLambda0(4);
        Locale locale = Locale.getDefault();
        locale.getClass();
        set.getClass();
        SubtreeManager subtreeManager = new SubtreeManager();
        subtreeManager.snapshotCache = set;
        subtreeManager.contextForChildren = DropdownConfig$Mode$Condensed.INSTANCE;
        subtreeManager.emitActionToParent = encodeKt$$ExternalSyntheticLambda0;
        subtreeManager.workflowSession = OtelConventions.resolvableString$default(R.string.stripe_address_label_country_or_region, new Object[0]);
        List sortedLocalizedCountries = CountryUtils.getSortedLocalizedCountries(locale);
        ArrayList arrayList = new ArrayList();
        for (Object obj : sortedLocalizedCountries) {
            Country country = (Country) obj;
            if (((Set) subtreeManager.snapshotCache).isEmpty() || ((Set) subtreeManager.snapshotCache).contains(country.code.value)) {
                arrayList.add(obj);
            }
        }
        subtreeManager.interceptor = arrayList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Country) it.next()).code.value);
        }
        subtreeManager.idCounter = arrayList2;
        ArrayList arrayList3 = (ArrayList) subtreeManager.interceptor;
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(encodeKt$$ExternalSyntheticLambda02.invoke(it2.next()));
        }
        subtreeManager.children = arrayList4;
        this.countryConfig = subtreeManager;
        LegacySessionConfig legacySessionConfig = new LegacySessionConfig(subtreeManager, str2);
        this.countryDropdownController = legacySessionConfig;
        StateFlowImpl stateFlowImpl = (StateFlowImpl) legacySessionConfig.requiredFeatureGroup;
        FlowToStateFlow mapAsStateFlow = IblLoaderKt.mapAsStateFlow(stateFlowImpl, new Function1(this) { // from class: com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda3
            public final /* synthetic */ PhoneNumberController f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String str3;
                int i3 = i;
                PhoneNumberController phoneNumberController = this.f$0;
                Integer num = (Integer) obj2;
                switch (i3) {
                    case 0:
                        CharRange charRange = PhoneNumberFormatter.VALID_INPUT_RANGE;
                        return zzg.forCountry(((Country) ((ArrayList) phoneNumberController.countryConfig.interceptor).get(num != null ? num.intValue() : 0)).code.value);
                    default:
                        CharRange charRange2 = PhoneNumberFormatter.VALID_INPUT_RANGE;
                        String str4 = ((Country) ((ArrayList) phoneNumberController.countryConfig.interceptor).get(num != null ? num.intValue() : 0)).code.value;
                        str4.getClass();
                        Map map = PhoneNumberFormatter.allMetadata;
                        String upperCase = str4.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        PhoneNumberFormatter.Metadata metadata = (PhoneNumberFormatter.Metadata) map.get(upperCase);
                        if (metadata == null || (str3 = metadata.pattern) == null) {
                            return null;
                        }
                        int i4 = 0;
                        while (r1 < str3.length()) {
                            if (str3.charAt(r1) == '#') {
                                i4++;
                            }
                            r1++;
                        }
                        return Integer.valueOf(i4);
                }
            }
        });
        this.phoneNumberFormatter = mapAsStateFlow;
        FlowToStateFlow combineAsStateFlow = IblLoaderKt.combineAsStateFlow(asStateFlow, IblLoaderKt.mapAsStateFlow(stateFlowImpl, new Function1(this) { // from class: com.stripe.android.uicore.elements.PhoneNumberController$$ExternalSyntheticLambda3
            public final /* synthetic */ PhoneNumberController f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String str3;
                int i3 = i2;
                PhoneNumberController phoneNumberController = this.f$0;
                Integer num = (Integer) obj2;
                switch (i3) {
                    case 0:
                        CharRange charRange = PhoneNumberFormatter.VALID_INPUT_RANGE;
                        return zzg.forCountry(((Country) ((ArrayList) phoneNumberController.countryConfig.interceptor).get(num != null ? num.intValue() : 0)).code.value);
                    default:
                        CharRange charRange2 = PhoneNumberFormatter.VALID_INPUT_RANGE;
                        String str4 = ((Country) ((ArrayList) phoneNumberController.countryConfig.interceptor).get(num != null ? num.intValue() : 0)).code.value;
                        str4.getClass();
                        Map map = PhoneNumberFormatter.allMetadata;
                        String upperCase = str4.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        PhoneNumberFormatter.Metadata metadata = (PhoneNumberFormatter.Metadata) map.get(upperCase);
                        if (metadata == null || (str3 = metadata.pattern) == null) {
                            return null;
                        }
                        int i4 = 0;
                        while (r1 < str3.length()) {
                            if (str3.charAt(r1) == '#') {
                                i4++;
                            }
                            r1++;
                        }
                        return Integer.valueOf(i4);
                }
            }
        }), new PhoneNumberController$$ExternalSyntheticLambda5(this));
        FlowToStateFlow combineAsStateFlow2 = IblLoaderKt.combineAsStateFlow(asStateFlow, mapAsStateFlow, new PhoneNumberController$$ExternalSyntheticLambda5(25));
        FlowToStateFlow mapAsStateFlow2 = IblLoaderKt.mapAsStateFlow(combineAsStateFlow, new EncodeKt$$ExternalSyntheticLambda0(5));
        this.isComplete = mapAsStateFlow2;
        this.formFieldValue = IblLoaderKt.combineAsStateFlow(combineAsStateFlow2, mapAsStateFlow2, new PhoneNumberController$$ExternalSyntheticLambda5(26));
        this.validationMessage = IblLoaderKt.combineAsStateFlow(combineAsStateFlow, MutableStateFlow3, MutableStateFlow2, new PhoneNumberController$$ExternalSyntheticLambda9(i));
        this.placeholder = IblLoaderKt.mapAsStateFlow(mapAsStateFlow, new EncodeKt$$ExternalSyntheticLambda0(2));
        this.visualTransformation = IblLoaderKt.mapAsStateFlow(mapAsStateFlow, new EncodeKt$$ExternalSyntheticLambda0(3));
    }

    public final String getCountryCode() {
        return ((PhoneNumberFormatter) this.phoneNumberFormatter.produceValue.invoke()).getCountryCode();
    }
}
