package com.stripe.android.core.model;

import androidx.camera.video.VideoCapture$$ExternalSyntheticLambda6;
import com.squareup.wire.internal.FieldBinding$$ExternalSyntheticLambda5;
import com.stripe.android.core.model.CountryCode;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.imaging.formats.pnm.PnmImageParser;

/* loaded from: classes9.dex */
public abstract class CountryUtils {
    public static volatile Locale cachedCountriesLocale;
    public static volatile List cachedOrderedLocalizedCountries;
    public static final Set supportedBillingCountries = ArraysKt___ArraysKt.toSet(new String[]{"AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CV", "CW", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MK", "ML", "MM", "MN", "MO", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NG", "NI", "NL", PnmImageParser.PARAM_VALUE_PNM_RAWBITS_NO, "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SZ", "TA", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VN", "VU", "WF", "WS", "XK", "YE", "YT", "ZA", "ZM", "ZW"});

    static {
        ArraysKt___ArraysKt.toSet(new String[]{"US", "GB", "CA"});
        cachedOrderedLocalizedCountries = EmptyList.INSTANCE;
    }

    public static List getSortedLocalizedCountries(Locale locale) {
        Object obj;
        if (locale.equals(cachedCountriesLocale)) {
            return cachedOrderedLocalizedCountries;
        }
        Set<String> set = supportedBillingCountries;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
        for (String str : set) {
            CountryCode.Companion.getClass();
            CountryCode create = CountryCode.Companion.create(str);
            String displayCountry = new Locale("", str).getDisplayCountry(locale);
            displayCountry.getClass();
            arrayList.add(new Country(create, displayCountry));
        }
        Collator collator = Collator.getInstance(locale);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            CountryCode countryCode = ((Country) obj).code;
            CountryCode.Companion companion = CountryCode.Companion;
            String country = locale.getCountry();
            country.getClass();
            companion.getClass();
            if (Intrinsics.areEqual(countryCode, CountryCode.Companion.create(country))) {
                break;
            }
        }
        List listOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(obj);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            CountryCode countryCode2 = ((Country) next).code;
            CountryCode.Companion companion2 = CountryCode.Companion;
            String country2 = locale.getCountry();
            country2.getClass();
            companion2.getClass();
            if (!Intrinsics.areEqual(countryCode2, CountryCode.Companion.create(country2))) {
                arrayList2.add(next);
            }
        }
        cachedOrderedLocalizedCountries = CollectionsKt.plus((Iterable) CollectionsKt.sortedWith(arrayList2, new VideoCapture$$ExternalSyntheticLambda6(new FieldBinding$$ExternalSyntheticLambda5(collator, 3), 11)), (Collection) listOfNotNull);
        cachedCountriesLocale = locale;
        return cachedOrderedLocalizedCountries;
    }
}
