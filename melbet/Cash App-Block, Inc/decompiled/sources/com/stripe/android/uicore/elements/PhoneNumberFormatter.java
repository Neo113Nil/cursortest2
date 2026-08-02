package com.stripe.android.uicore.elements;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.input.VisualTransformation$Companion$$ExternalSyntheticLambda0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.scrubbing.USPhoneNumberVisualTransformer;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.CharRange;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.apache.commons.imaging.formats.pnm.PnmImageParser;
import org.slf4j.Marker;

/* loaded from: classes9.dex */
public abstract class PhoneNumberFormatter {
    public static final CharRange VALID_INPUT_RANGE = new CharRange('0', '9');
    public static final Map allMetadata;

    /* loaded from: classes8.dex */
    public final class UnknownRegion extends PhoneNumberFormatter {
        public final String countryCode;
        public final VisualTransformation$Companion$$ExternalSyntheticLambda0 visualTransformation;

        public UnknownRegion(String str) {
            str.getClass();
            this.countryCode = str;
            this.visualTransformation = new VisualTransformation$Companion$$ExternalSyntheticLambda0(1);
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public final String getCountryCode() {
            return this.countryCode;
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public final String getPlaceholder() {
            return "+############";
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public final String getPrefix() {
            return "";
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public final VisualTransformation getVisualTransformation() {
            return this.visualTransformation;
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public final String toE164Format(String str) {
            str.getClass();
            return Recorder$$ExternalSyntheticOutline2.m(Marker.ANY_NON_NULL_MARKER, StringsKt.trimStart(userInputFilter(str), '0'));
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public final String userInputFilter(String str) {
            str.getClass();
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (PhoneNumberFormatter.VALID_INPUT_RANGE.contains(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            return sb2.substring(0, Math.min(sb2.length(), 15));
        }
    }

    /* loaded from: classes8.dex */
    public final class WithRegion extends PhoneNumberFormatter {
        public final String countryCode;
        public final Metadata metadata;
        public final String placeholder;
        public final String prefix;
        public final USPhoneNumberVisualTransformer visualTransformation;

        public WithRegion(Metadata metadata) {
            this.metadata = metadata;
            this.prefix = metadata.prefix;
            String str = metadata.pattern;
            this.placeholder = str != null ? StringsKt__StringsJVMKt.replace(str, '#', '5', false) : "";
            this.countryCode = metadata.regionCode;
            this.visualTransformation = new USPhoneNumberVisualTransformer(this);
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public final String getCountryCode() {
            return this.countryCode;
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public final String getPlaceholder() {
            return this.placeholder;
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public final String getPrefix() {
            return this.prefix;
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public final VisualTransformation getVisualTransformation() {
            return this.visualTransformation;
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public final String toE164Format(String str) {
            str.getClass();
            return Recorder$$ExternalSyntheticOutline2.m$1(this.prefix, StringsKt.trimStart(userInputFilter(str), '0'));
        }

        @Override // com.stripe.android.uicore.elements.PhoneNumberFormatter
        public final String userInputFilter(String str) {
            str.getClass();
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (PhoneNumberFormatter.VALID_INPUT_RANGE.contains(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            return sb2.substring(0, Math.min(sb2.length(), 15));
        }
    }

    static {
        String str = "+262";
        allMetadata = MapsKt__MapsKt.mapOf(SizeMode$EnumUnboxingLocalUtility.m("+1", "US", "(###) ###-####", "US"), SizeMode$EnumUnboxingLocalUtility.m("+1", "CA", "(###) ###-####", "CA"), SizeMode$EnumUnboxingLocalUtility.m("+1", "AG", "(###) ###-####", "AG"), SizeMode$EnumUnboxingLocalUtility.m("+1", "AS", "(###) ###-####", "AS"), SizeMode$EnumUnboxingLocalUtility.m("+1", "AI", "(###) ###-####", "AI"), SizeMode$EnumUnboxingLocalUtility.m("+1", "BB", "(###) ###-####", "BB"), SizeMode$EnumUnboxingLocalUtility.m("+1", "BM", "(###) ###-####", "BM"), SizeMode$EnumUnboxingLocalUtility.m("+1", "BS", "(###) ###-####", "BS"), SizeMode$EnumUnboxingLocalUtility.m("+1", "DM", "(###) ###-####", "DM"), SizeMode$EnumUnboxingLocalUtility.m("+1", "DO", "(###) ###-####", "DO"), SizeMode$EnumUnboxingLocalUtility.m("+1", "GD", "(###) ###-####", "GD"), SizeMode$EnumUnboxingLocalUtility.m("+1", "GU", "(###) ###-####", "GU"), SizeMode$EnumUnboxingLocalUtility.m("+1", "JM", "(###) ###-####", "JM"), SizeMode$EnumUnboxingLocalUtility.m("+1", "KN", "(###) ###-####", "KN"), SizeMode$EnumUnboxingLocalUtility.m("+1", "KY", "(###) ###-####", "KY"), SizeMode$EnumUnboxingLocalUtility.m("+1", "LC", "(###) ###-####", "LC"), SizeMode$EnumUnboxingLocalUtility.m("+1", "MP", "(###) ###-####", "MP"), SizeMode$EnumUnboxingLocalUtility.m("+1", "MS", "(###) ###-####", "MS"), SizeMode$EnumUnboxingLocalUtility.m("+1", "PR", "(###) ###-####", "PR"), SizeMode$EnumUnboxingLocalUtility.m("+1", "SX", "(###) ###-####", "SX"), SizeMode$EnumUnboxingLocalUtility.m("+1", "TC", "(###) ###-####", "TC"), SizeMode$EnumUnboxingLocalUtility.m("+1", "TT", "(###) ###-####", "TT"), SizeMode$EnumUnboxingLocalUtility.m("+1", "VC", "(###) ###-####", "VC"), SizeMode$EnumUnboxingLocalUtility.m("+1", "VG", "(###) ###-####", "VG"), SizeMode$EnumUnboxingLocalUtility.m("+1", "VI", "(###) ###-####", "VI"), SizeMode$EnumUnboxingLocalUtility.m("+20", "EG", "### ### ####", "EG"), SizeMode$EnumUnboxingLocalUtility.m("+211", "SS", "### ### ###", "SS"), SizeMode$EnumUnboxingLocalUtility.m("+212", "MA", "###-######", "MA"), SizeMode$EnumUnboxingLocalUtility.m("+212", "EH", "###-######", "EH"), SizeMode$EnumUnboxingLocalUtility.m("+213", "DZ", "### ## ## ##", "DZ"), SizeMode$EnumUnboxingLocalUtility.m("+216", "TN", "## ### ###", "TN"), SizeMode$EnumUnboxingLocalUtility.m("+218", "LY", "##-#######", "LY"), SizeMode$EnumUnboxingLocalUtility.m("+220", "GM", "### ####", "GM"), SizeMode$EnumUnboxingLocalUtility.m("+221", "SN", "## ### ## ##", "SN"), SizeMode$EnumUnboxingLocalUtility.m("+222", "MR", "## ## ## ##", "MR"), SizeMode$EnumUnboxingLocalUtility.m("+223", "ML", "## ## ## ##", "ML"), SizeMode$EnumUnboxingLocalUtility.m("+224", "GN", "### ## ## ##", "GN"), SizeMode$EnumUnboxingLocalUtility.m("+225", "CI", "## ## ## ##", "CI"), SizeMode$EnumUnboxingLocalUtility.m("+226", "BF", "## ## ## ##", "BF"), SizeMode$EnumUnboxingLocalUtility.m("+227", "NE", "## ## ## ##", "NE"), SizeMode$EnumUnboxingLocalUtility.m("+228", "TG", "## ## ## ##", "TG"), SizeMode$EnumUnboxingLocalUtility.m("+229", "BJ", "## ## ## ##", "BJ"), SizeMode$EnumUnboxingLocalUtility.m("+230", "MU", "#### ####", "MU"), SizeMode$EnumUnboxingLocalUtility.m("+231", "LR", "### ### ###", "LR"), SizeMode$EnumUnboxingLocalUtility.m("+232", "SL", "## ######", "SL"), SizeMode$EnumUnboxingLocalUtility.m("+233", "GH", "## ### ####", "GH"), SizeMode$EnumUnboxingLocalUtility.m("+234", "NG", "### ### ####", "NG"), SizeMode$EnumUnboxingLocalUtility.m("+235", "TD", "## ## ## ##", "TD"), SizeMode$EnumUnboxingLocalUtility.m("+236", "CF", "## ## ## ##", "CF"), SizeMode$EnumUnboxingLocalUtility.m("+237", "CM", "## ## ## ##", "CM"), SizeMode$EnumUnboxingLocalUtility.m("+238", "CV", "### ## ##", "CV"), SizeMode$EnumUnboxingLocalUtility.m("+239", "ST", "### ####", "ST"), SizeMode$EnumUnboxingLocalUtility.m("+240", "GQ", "### ### ###", "GQ"), SizeMode$EnumUnboxingLocalUtility.m("+241", "GA", "## ## ## ##", "GA"), SizeMode$EnumUnboxingLocalUtility.m("+242", "CG", "## ### ####", "CG"), SizeMode$EnumUnboxingLocalUtility.m("+243", "CD", "### ### ###", "CD"), SizeMode$EnumUnboxingLocalUtility.m("+244", "AO", "### ### ###", "AO"), SizeMode$EnumUnboxingLocalUtility.m("+245", "GW", "### ####", "GW"), SizeMode$EnumUnboxingLocalUtility.m("+246", "IO", "### ####", "IO"), TuplesKt.to("AC", new Metadata("+247", "AC")), SizeMode$EnumUnboxingLocalUtility.m("+248", "SC", "# ### ###", "SC"), SizeMode$EnumUnboxingLocalUtility.m("+250", "RW", "### ### ###", "RW"), SizeMode$EnumUnboxingLocalUtility.m("+251", "ET", "## ### ####", "ET"), SizeMode$EnumUnboxingLocalUtility.m("+252", "SO", "## #######", "SO"), SizeMode$EnumUnboxingLocalUtility.m("+253", "DJ", "## ## ## ##", "DJ"), SizeMode$EnumUnboxingLocalUtility.m("+254", "KE", "## #######", "KE"), SizeMode$EnumUnboxingLocalUtility.m("+255", "TZ", "### ### ###", "TZ"), SizeMode$EnumUnboxingLocalUtility.m("+256", "UG", "### ######", "UG"), SizeMode$EnumUnboxingLocalUtility.m("+257", "BI", "## ## ## ##", "BI"), SizeMode$EnumUnboxingLocalUtility.m("+258", "MZ", "## ### ####", "MZ"), SizeMode$EnumUnboxingLocalUtility.m("+260", "ZM", "## #######", "ZM"), SizeMode$EnumUnboxingLocalUtility.m("+261", "MG", "## ## ### ##", "MG"), TuplesKt.to("RE", new Metadata(str, "RE")), TuplesKt.to("TF", new Metadata(str, "TF")), SizeMode$EnumUnboxingLocalUtility.m("+262", "YT", "### ## ## ##", "YT"), SizeMode$EnumUnboxingLocalUtility.m("+263", "ZW", "## ### ####", "ZW"), SizeMode$EnumUnboxingLocalUtility.m("+264", "NA", "## ### ####", "NA"), SizeMode$EnumUnboxingLocalUtility.m("+265", "MW", "### ## ## ##", "MW"), SizeMode$EnumUnboxingLocalUtility.m("+266", "LS", "#### ####", "LS"), SizeMode$EnumUnboxingLocalUtility.m("+267", "BW", "## ### ###", "BW"), SizeMode$EnumUnboxingLocalUtility.m("+268", "SZ", "#### ####", "SZ"), SizeMode$EnumUnboxingLocalUtility.m("+269", "KM", "### ## ##", "KM"), SizeMode$EnumUnboxingLocalUtility.m("+27", "ZA", "## ### ####", "ZA"), TuplesKt.to("SH", new Metadata("+290", "SH")), TuplesKt.to("TA", new Metadata("+290", "TA")), SizeMode$EnumUnboxingLocalUtility.m("+291", "ER", "# ### ###", "ER"), SizeMode$EnumUnboxingLocalUtility.m("+297", "AW", "### ####", "AW"), SizeMode$EnumUnboxingLocalUtility.m("+298", "FO", "######", "FO"), SizeMode$EnumUnboxingLocalUtility.m("+299", "GL", "## ## ##", "GL"), SizeMode$EnumUnboxingLocalUtility.m("+30", "GR", "### ### ####", "GR"), SizeMode$EnumUnboxingLocalUtility.m("+31", "NL", "# ########", "NL"), SizeMode$EnumUnboxingLocalUtility.m("+32", "BE", "### ## ## ##", "BE"), SizeMode$EnumUnboxingLocalUtility.m("+33", "FR", "# ## ## ## ##", "FR"), SizeMode$EnumUnboxingLocalUtility.m("+34", "ES", "### ## ## ##", "ES"), SizeMode$EnumUnboxingLocalUtility.m("+350", "GI", "### #####", "GI"), SizeMode$EnumUnboxingLocalUtility.m("+351", "PT", "### ### ###", "PT"), SizeMode$EnumUnboxingLocalUtility.m("+352", "LU", "## ## ## ###", "LU"), SizeMode$EnumUnboxingLocalUtility.m("+353", "IE", "## ### ####", "IE"), SizeMode$EnumUnboxingLocalUtility.m("+354", "IS", "### ####", "IS"), SizeMode$EnumUnboxingLocalUtility.m("+355", "AL", "## ### ####", "AL"), SizeMode$EnumUnboxingLocalUtility.m("+356", "MT", "#### ####", "MT"), SizeMode$EnumUnboxingLocalUtility.m("+357", "CY", "## ######", "CY"), SizeMode$EnumUnboxingLocalUtility.m("+358", "FI", "## ### ## ##", "FI"), TuplesKt.to("AX", new Metadata("+358", "AX")), SizeMode$EnumUnboxingLocalUtility.m("+359", "BG", "### ### ##", "BG"), SizeMode$EnumUnboxingLocalUtility.m("+36", "HU", "## ### ####", "HU"), SizeMode$EnumUnboxingLocalUtility.m("+370", "LT", "### #####", "LT"), SizeMode$EnumUnboxingLocalUtility.m("+371", "LV", "## ### ###", "LV"), SizeMode$EnumUnboxingLocalUtility.m("+372", "EE", "#### ####", "EE"), SizeMode$EnumUnboxingLocalUtility.m("+373", "MD", "### ## ###", "MD"), SizeMode$EnumUnboxingLocalUtility.m("+374", "AM", "## ######", "AM"), SizeMode$EnumUnboxingLocalUtility.m("+375", "BY", "## ###-##-##", "BY"), SizeMode$EnumUnboxingLocalUtility.m("+376", "AD", "### ###", "AD"), SizeMode$EnumUnboxingLocalUtility.m("+377", "MC", "# ## ## ## ##", "MC"), SizeMode$EnumUnboxingLocalUtility.m("+378", "SM", "## ## ## ##", "SM"), TuplesKt.to("VA", new Metadata("+379", "VA")), SizeMode$EnumUnboxingLocalUtility.m("+380", "UA", "## ### ####", "UA"), SizeMode$EnumUnboxingLocalUtility.m("+381", "RS", "## #######", "RS"), SizeMode$EnumUnboxingLocalUtility.m("+382", "ME", "## ### ###", "ME"), SizeMode$EnumUnboxingLocalUtility.m("+383", "XK", "## ### ###", "XK"), SizeMode$EnumUnboxingLocalUtility.m("+385", "HR", "## ### ####", "HR"), SizeMode$EnumUnboxingLocalUtility.m("+386", "SI", "## ### ###", "SI"), SizeMode$EnumUnboxingLocalUtility.m("+387", "BA", "## ###-###", "BA"), SizeMode$EnumUnboxingLocalUtility.m("+389", "MK", "## ### ###", "MK"), SizeMode$EnumUnboxingLocalUtility.m("+39", "IT", "## #### ####", "IT"), SizeMode$EnumUnboxingLocalUtility.m("+40", "RO", "## ### ####", "RO"), SizeMode$EnumUnboxingLocalUtility.m("+41", "CH", "## ### ## ##", "CH"), SizeMode$EnumUnboxingLocalUtility.m("+420", "CZ", "### ### ###", "CZ"), SizeMode$EnumUnboxingLocalUtility.m("+421", "SK", "### ### ###", "SK"), SizeMode$EnumUnboxingLocalUtility.m("+423", "LI", "### ### ###", "LI"), SizeMode$EnumUnboxingLocalUtility.m("+43", "AT", "### ######", "AT"), SizeMode$EnumUnboxingLocalUtility.m("+44", "GB", "## #### ####", "GB"), SizeMode$EnumUnboxingLocalUtility.m("+44", "GG", "## #### ####", "GG"), SizeMode$EnumUnboxingLocalUtility.m("+44", "JE", "## #### ####", "JE"), SizeMode$EnumUnboxingLocalUtility.m("+44", "IM", "## #### ####", "IM"), SizeMode$EnumUnboxingLocalUtility.m("+45", "DK", "## ## ## ##", "DK"), SizeMode$EnumUnboxingLocalUtility.m("+46", "SE", "##-### ## ##", "SE"), SizeMode$EnumUnboxingLocalUtility.m("+47", PnmImageParser.PARAM_VALUE_PNM_RAWBITS_NO, "### ## ###", PnmImageParser.PARAM_VALUE_PNM_RAWBITS_NO), TuplesKt.to("BV", new Metadata("+47", "BV")), SizeMode$EnumUnboxingLocalUtility.m("+47", "SJ", "## ## ## ##", "SJ"), SizeMode$EnumUnboxingLocalUtility.m("+48", "PL", "## ### ## ##", "PL"), SizeMode$EnumUnboxingLocalUtility.m("+49", "DE", "### #######", "DE"), TuplesKt.to("FK", new Metadata("+500", "FK")), TuplesKt.to("GS", new Metadata("+500", "GS")), SizeMode$EnumUnboxingLocalUtility.m("+501", "BZ", "###-####", "BZ"), SizeMode$EnumUnboxingLocalUtility.m("+502", "GT", "#### ####", "GT"), SizeMode$EnumUnboxingLocalUtility.m("+503", "SV", "#### ####", "SV"), SizeMode$EnumUnboxingLocalUtility.m("+504", "HN", "####-####", "HN"), SizeMode$EnumUnboxingLocalUtility.m("+505", "NI", "#### ####", "NI"), SizeMode$EnumUnboxingLocalUtility.m("+506", "CR", "#### ####", "CR"), SizeMode$EnumUnboxingLocalUtility.m("+507", "PA", "####-####", "PA"), SizeMode$EnumUnboxingLocalUtility.m("+508", "PM", "## ## ##", "PM"), SizeMode$EnumUnboxingLocalUtility.m("+509", "HT", "## ## ####", "HT"), SizeMode$EnumUnboxingLocalUtility.m("+51", "PE", "### ### ###", "PE"), SizeMode$EnumUnboxingLocalUtility.m("+52", "MX", "### ### ####", "MX"), SizeMode$EnumUnboxingLocalUtility.m("+54", "AR", "## ##-####-####", "AR"), SizeMode$EnumUnboxingLocalUtility.m("+55", "BR", "## #####-####", "BR"), SizeMode$EnumUnboxingLocalUtility.m("+56", "CL", "# #### ####", "CL"), SizeMode$EnumUnboxingLocalUtility.m("+57", "CO", "### #######", "CO"), SizeMode$EnumUnboxingLocalUtility.m("+58", "VE", "###-#######", "VE"), SizeMode$EnumUnboxingLocalUtility.m("+590", "BL", "### ## ## ##", "BL"), TuplesKt.to("MF", new Metadata("+590", "MF")), SizeMode$EnumUnboxingLocalUtility.m("+590", "GP", "### ## ## ##", "GP"), SizeMode$EnumUnboxingLocalUtility.m("+591", "BO", "########", "BO"), SizeMode$EnumUnboxingLocalUtility.m("+592", "GY", "### ####", "GY"), SizeMode$EnumUnboxingLocalUtility.m("+593", "EC", "## ### ####", "EC"), SizeMode$EnumUnboxingLocalUtility.m("+594", "GF", "### ## ## ##", "GF"), SizeMode$EnumUnboxingLocalUtility.m("+595", "PY", "## #######", "PY"), SizeMode$EnumUnboxingLocalUtility.m("+596", "MQ", "### ## ## ##", "MQ"), SizeMode$EnumUnboxingLocalUtility.m("+597", "SR", "###-####", "SR"), SizeMode$EnumUnboxingLocalUtility.m("+598", "UY", "#### ####", "UY"), SizeMode$EnumUnboxingLocalUtility.m("+599", "CW", "# ### ####", "CW"), SizeMode$EnumUnboxingLocalUtility.m("+599", "BQ", "### ####", "BQ"), SizeMode$EnumUnboxingLocalUtility.m("+60", "MY", "##-### ####", "MY"), SizeMode$EnumUnboxingLocalUtility.m("+61", "AU", "### ### ###", "AU"), SizeMode$EnumUnboxingLocalUtility.m("+62", "ID", "###-###-###", "ID"), SizeMode$EnumUnboxingLocalUtility.m("+63", "PH", "#### ######", "PH"), SizeMode$EnumUnboxingLocalUtility.m("+64", "NZ", "## ### ####", "NZ"), SizeMode$EnumUnboxingLocalUtility.m("+65", "SG", "#### ####", "SG"), SizeMode$EnumUnboxingLocalUtility.m("+66", "TH", "## ### ####", "TH"), SizeMode$EnumUnboxingLocalUtility.m("+670", "TL", "#### ####", "TL"), SizeMode$EnumUnboxingLocalUtility.m("+672", "AQ", "## ####", "AQ"), SizeMode$EnumUnboxingLocalUtility.m("+673", "BN", "### ####", "BN"), SizeMode$EnumUnboxingLocalUtility.m("+674", "NR", "### ####", "NR"), SizeMode$EnumUnboxingLocalUtility.m("+675", "PG", "### ####", "PG"), SizeMode$EnumUnboxingLocalUtility.m("+676", "TO", "### ####", "TO"), SizeMode$EnumUnboxingLocalUtility.m("+677", "SB", "### ####", "SB"), SizeMode$EnumUnboxingLocalUtility.m("+678", "VU", "### ####", "VU"), SizeMode$EnumUnboxingLocalUtility.m("+679", "FJ", "### ####", "FJ"), SizeMode$EnumUnboxingLocalUtility.m("+681", "WF", "## ## ##", "WF"), SizeMode$EnumUnboxingLocalUtility.m("+682", "CK", "## ###", "CK"), TuplesKt.to("NU", new Metadata("+683", "NU")), TuplesKt.to("WS", new Metadata("+685", "WS")), TuplesKt.to("KI", new Metadata("+686", "KI")), SizeMode$EnumUnboxingLocalUtility.m("+687", "NC", "########", "NC"), TuplesKt.to("TV", new Metadata("+688", "TV")), SizeMode$EnumUnboxingLocalUtility.m("+689", "PF", "## ## ##", "PF"), TuplesKt.to("TK", new Metadata("+690", "TK")), SizeMode$EnumUnboxingLocalUtility.m("+7", "RU", "### ###-##-##", "RU"), TuplesKt.to("KZ", new Metadata("+7", "KZ")), SizeMode$EnumUnboxingLocalUtility.m("+81", "JP", "##-####-####", "JP"), SizeMode$EnumUnboxingLocalUtility.m("+82", "KR", "##-####-####", "KR"), SizeMode$EnumUnboxingLocalUtility.m("+84", "VN", "## ### ## ##", "VN"), SizeMode$EnumUnboxingLocalUtility.m("+852", "HK", "#### ####", "HK"), SizeMode$EnumUnboxingLocalUtility.m("+853", "MO", "#### ####", "MO"), SizeMode$EnumUnboxingLocalUtility.m("+855", "KH", "## ### ###", "KH"), SizeMode$EnumUnboxingLocalUtility.m("+856", "LA", "## ## ### ###", "LA"), SizeMode$EnumUnboxingLocalUtility.m("+86", "CN", "### #### ####", "CN"), TuplesKt.to("PN", new Metadata("+872", "PN")), SizeMode$EnumUnboxingLocalUtility.m("+880", "BD", "####-######", "BD"), SizeMode$EnumUnboxingLocalUtility.m("+886", "TW", "### ### ###", "TW"), SizeMode$EnumUnboxingLocalUtility.m("+90", "TR", "### ### ####", "TR"), SizeMode$EnumUnboxingLocalUtility.m("+91", "IN", "## ## ######", "IN"), SizeMode$EnumUnboxingLocalUtility.m("+92", "PK", "### #######", "PK"), SizeMode$EnumUnboxingLocalUtility.m("+93", "AF", "## ### ####", "AF"), SizeMode$EnumUnboxingLocalUtility.m("+94", "LK", "## # ######", "LK"), SizeMode$EnumUnboxingLocalUtility.m("+95", "MM", "# ### ####", "MM"), SizeMode$EnumUnboxingLocalUtility.m("+960", "MV", "###-####", "MV"), SizeMode$EnumUnboxingLocalUtility.m("+961", "LB", "## ### ###", "LB"), SizeMode$EnumUnboxingLocalUtility.m("+962", "JO", "# #### ####", "JO"), SizeMode$EnumUnboxingLocalUtility.m("+964", "IQ", "### ### ####", "IQ"), SizeMode$EnumUnboxingLocalUtility.m("+965", "KW", "### #####", "KW"), SizeMode$EnumUnboxingLocalUtility.m("+966", "SA", "## ### ####", "SA"), SizeMode$EnumUnboxingLocalUtility.m("+967", "YE", "### ### ###", "YE"), SizeMode$EnumUnboxingLocalUtility.m("+968", "OM", "#### ####", "OM"), SizeMode$EnumUnboxingLocalUtility.m("+970", "PS", "### ### ###", "PS"), SizeMode$EnumUnboxingLocalUtility.m("+971", "AE", "## ### ####", "AE"), SizeMode$EnumUnboxingLocalUtility.m("+972", "IL", "##-###-####", "IL"), SizeMode$EnumUnboxingLocalUtility.m("+973", "BH", "#### ####", "BH"), SizeMode$EnumUnboxingLocalUtility.m("+974", "QA", "#### ####", "QA"), SizeMode$EnumUnboxingLocalUtility.m("+975", "BT", "## ## ## ##", "BT"), SizeMode$EnumUnboxingLocalUtility.m("+976", "MN", "#### ####", "MN"), SizeMode$EnumUnboxingLocalUtility.m("+977", "NP", "###-#######", "NP"), SizeMode$EnumUnboxingLocalUtility.m("+992", "TJ", "### ## ####", "TJ"), SizeMode$EnumUnboxingLocalUtility.m("+993", "TM", "## ##-##-##", "TM"), SizeMode$EnumUnboxingLocalUtility.m("+994", "AZ", "## ### ## ##", "AZ"), SizeMode$EnumUnboxingLocalUtility.m("+995", "GE", "### ## ## ##", "GE"), SizeMode$EnumUnboxingLocalUtility.m("+996", "KG", "### ### ###", "KG"), SizeMode$EnumUnboxingLocalUtility.m("+998", "UZ", "## ### ## ##", "UZ"));
    }

    public abstract String getCountryCode();

    public abstract String getPlaceholder();

    public abstract String getPrefix();

    public abstract VisualTransformation getVisualTransformation();

    public abstract String toE164Format(String str);

    public abstract String userInputFilter(String str);

    /* loaded from: classes8.dex */
    public final class Metadata {
        public final String pattern;
        public final String prefix;
        public final String regionCode;

        public Metadata(String str, String str2, String str3) {
            this.prefix = str;
            this.regionCode = str2;
            this.pattern = str3;
            if (str3 == null || str3.length() > 0) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3("Pattern should not be empty. Set it to null if it's missing.");
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) obj;
            return Intrinsics.areEqual(this.prefix, metadata.prefix) && Intrinsics.areEqual(this.regionCode, metadata.regionCode) && Intrinsics.areEqual(this.pattern, metadata.pattern);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.prefix.hashCode() * 31, 31, this.regionCode);
            String str = this.pattern;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Metadata(prefix=", this.prefix, ", regionCode=", this.regionCode, ", pattern="), this.pattern, ")");
        }

        public /* synthetic */ Metadata(String str, String str2) {
            this(str, str2, null);
        }
    }
}
