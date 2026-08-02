package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.protos.franklin.api.Instrument;
import com.squareup.protos.franklin.api.NotificationPreference;
import com.squareup.protos.franklin.api.RatePlan;
import com.squareup.protos.franklin.api.Region;
import com.squareup.protos.franklin.privacy.IncomingRequestPolicy;
import com.squareup.protos.franklin.ui.ScenarioPlanMap;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;
import squareup.cash.cryptocurrency.BitcoinDisplayUnits;

/* loaded from: classes.dex */
public final class Profile extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Profile> CREATOR;
    public final List aliases;
    public final Boolean app_message_notifications_enabled;
    public final List app_message_tokens;
    public final List available_p2p_target_regions;
    public final BalanceData balance_data;
    public final BitcoinDisplayUnits bitcoin_display_units;
    public final Boolean can_upgrade_to_business;
    public final CardScheme card_scheme;
    public final CashDrawerData cash_drawer_data;
    public final String cashtag;
    public final String cashtag_qr_image_url;
    public final String cashtag_qr_svg_url;
    public final String cashtag_url;
    public final String cashtag_url_display_text;
    public final Boolean cashtag_url_enabled;
    public final String cashtag_with_currency_symbol;
    public final Country country_code;
    public final Long customer_since;
    public final String customer_token;
    public final CurrencyCode default_currency;
    public final DepositPreference deposit_preference;
    public final DepositPreferenceData deposit_preference_data;
    public final DirectDepositAccount direct_deposit_account;
    public final Boolean direct_deposit_account_enabled;
    public final String full_name;
    public final Boolean has_passcode;
    public final Boolean has_passed_idv;
    public final IncomingRequestPolicy incoming_request_policy;
    public final List instrument_linking_options;
    public final List instruments;
    public final Boolean is_verified_account;
    public final IssuedCard issued_card;
    public final NearbyVisibility nearby_visibility;
    public final List notification_preferences;
    public final List pending_instruments;
    public final String photo_url;
    public final GlobalAddress postal_address;
    public final String printable_cashtag_qr_image_url;
    public final RatePlan rate_plan;
    public final Region region;
    public final Integer require_minimum_initiator_notes_length_for_requests;
    public final Boolean require_passcode_confirmation;
    public final Boolean sca_required;
    public final ScenarioPlanMap scenario_plan_map;
    public final Boolean show_tax_information_link;
    public final Boolean suppress_review_prompt;
    public final String synopsis;
    public final String verification_instrument_token;

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public List aliases;
        public Boolean app_message_notifications_enabled;
        public List app_message_tokens;
        public List available_p2p_target_regions;
        public BalanceData balance_data;
        public BitcoinDisplayUnits bitcoin_display_units;
        public Boolean can_upgrade_to_business;
        public CardScheme card_scheme;
        public CashDrawerData cash_drawer_data;
        public String cashtag;
        public String cashtag_qr_image_url;
        public String cashtag_qr_svg_url;
        public String cashtag_url;
        public String cashtag_url_display_text;
        public Boolean cashtag_url_enabled;
        public String cashtag_with_currency_symbol;
        public Country country_code;
        public Long customer_since;
        public String customer_token;
        public CurrencyCode default_currency;
        public DepositPreference deposit_preference;
        public DepositPreferenceData deposit_preference_data;
        public DirectDepositAccount direct_deposit_account;
        public Boolean direct_deposit_account_enabled;
        public String full_name;
        public Boolean has_passcode;
        public Boolean has_passed_idv;
        public IncomingRequestPolicy incoming_request_policy;
        public List instrument_linking_options;
        public List instruments;
        public Boolean is_verified_account;
        public IssuedCard issued_card;
        public NearbyVisibility nearby_visibility;
        public List notification_preferences;
        public List pending_instruments;
        public String photo_url;
        public GlobalAddress postal_address;
        public String printable_cashtag_qr_image_url;
        public RatePlan rate_plan;
        public Region region;
        public Integer require_minimum_initiator_notes_length_for_requests;
        public Boolean require_passcode_confirmation;
        public Boolean sca_required;
        public ScenarioPlanMap scenario_plan_map;
        public Boolean show_tax_information_link;
        public Boolean suppress_review_prompt;
        public String synopsis;
        public String verification_instrument_token;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.aliases = emptyList;
            this.notification_preferences = emptyList;
            this.app_message_tokens = emptyList;
            this.instruments = emptyList;
            this.instrument_linking_options = emptyList;
            this.available_p2p_target_regions = emptyList;
            this.pending_instruments = emptyList;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            return new Profile(this.full_name, this.photo_url, this.customer_token, this.require_passcode_confirmation, this.has_passcode, this.sca_required, this.aliases, this.notification_preferences, this.nearby_visibility, this.cashtag, this.cashtag_with_currency_symbol, this.cashtag_url, this.cashtag_url_display_text, this.cashtag_url_enabled, this.cashtag_qr_image_url, this.cashtag_qr_svg_url, this.printable_cashtag_qr_image_url, this.synopsis, this.rate_plan, this.can_upgrade_to_business, this.is_verified_account, this.app_message_notifications_enabled, this.app_message_tokens, this.instruments, this.verification_instrument_token, this.deposit_preference, this.balance_data, this.scenario_plan_map, this.show_tax_information_link, this.customer_since, this.postal_address, this.issued_card, this.deposit_preference_data, this.suppress_review_prompt, this.require_minimum_initiator_notes_length_for_requests, this.cash_drawer_data, this.has_passed_idv, this.default_currency, this.country_code, this.direct_deposit_account, this.instrument_linking_options, this.incoming_request_policy, this.available_p2p_target_regions, this.region, this.direct_deposit_account_enabled, this.pending_instruments, this.bitcoin_display_units, this.card_scheme, buildUnknownFields());
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Profile.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.common.Profile$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v101, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v107, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v108 */
            /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v110, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v115, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v117, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v119, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v121, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v123, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v126 */
            /* JADX WARN: Type inference failed for: r0v129 */
            /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v130 */
            /* JADX WARN: Type inference failed for: r0v131 */
            /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v66, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v87, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v9 */
            /* JADX WARN: Type inference failed for: r0v92, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                Object obj;
                ArrayList arrayList;
                ArrayList arrayList2;
                ?? r0;
                ArrayList arrayList3;
                ArrayList arrayList4;
                ArrayList arrayList5;
                ArrayList arrayList6;
                ArrayList arrayList7;
                ArrayList arrayList8;
                ArrayList arrayList9;
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                ArrayList arrayList10 = new ArrayList();
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                ArrayList arrayList14 = new ArrayList();
                ArrayList arrayList15 = new ArrayList();
                long beginMessage = protoReader.beginMessage();
                String str = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Boolean bool = null;
                NearbyVisibility nearbyVisibility = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String str5 = null;
                Boolean bool2 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                RatePlan ratePlan = null;
                Boolean bool3 = null;
                Boolean bool4 = null;
                Boolean bool5 = null;
                String str10 = null;
                DepositPreference depositPreference = null;
                String str11 = null;
                Boolean bool6 = null;
                Long l = null;
                String str12 = null;
                Boolean bool7 = null;
                Boolean bool8 = null;
                Boolean bool9 = null;
                Integer num = null;
                CurrencyCode currencyCode = null;
                Country country = null;
                Boolean bool10 = null;
                IncomingRequestPolicy incomingRequestPolicy = null;
                Region region = null;
                Boolean bool11 = null;
                BitcoinDisplayUnits bitcoinDisplayUnits = null;
                ArrayList arrayList16 = m;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                while (true) {
                    ArrayList arrayList17 = arrayList10;
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        Object obj10 = obj7;
                        return new Profile(str, str11, str12, bool7, bool8, bool, arrayList16, arrayList17, nearbyVisibility, str2, str3, str4, str5, bool2, str6, str7, str8, str9, ratePlan, bool3, bool4, bool5, arrayList11, arrayList12, str10, depositPreference, (BalanceData) obj2, (ScenarioPlanMap) obj3, bool6, l, (GlobalAddress) obj4, (IssuedCard) obj5, (DepositPreferenceData) obj6, bool9, num, (CashDrawerData) obj8, bool10, currencyCode, country, (DirectDepositAccount) obj9, arrayList13, incomingRequestPolicy, arrayList14, region, bool11, arrayList15, bitcoinDisplayUnits, (CardScheme) obj10, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            arrayList = arrayList12;
                            arrayList2 = arrayList15;
                            obj = obj7;
                            arrayList10 = arrayList17;
                            arrayList3 = arrayList11;
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            r0 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            arrayList = arrayList12;
                            arrayList2 = arrayList15;
                            obj = obj7;
                            arrayList10 = arrayList17;
                            arrayList3 = arrayList11;
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            str11 = ProtoAdapter.STRING.decode(protoReader);
                            r0 = str;
                            break;
                        case 3:
                        case 8:
                        case 17:
                        case 23:
                        case 26:
                        case 27:
                        case 37:
                        case 38:
                        case 39:
                        case 42:
                        case 47:
                        case 49:
                        case 51:
                        case 61:
                        case 62:
                        default:
                            protoReader.readUnknownField(nextTag);
                            arrayList = arrayList12;
                            arrayList2 = arrayList15;
                            obj = obj7;
                            arrayList10 = arrayList17;
                            arrayList3 = arrayList11;
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            r0 = str;
                            break;
                        case 4:
                            arrayList = arrayList12;
                            arrayList2 = arrayList15;
                            obj = obj7;
                            arrayList10 = arrayList17;
                            arrayList3 = arrayList11;
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            bool7 = ProtoAdapter.BOOL.decode(protoReader);
                            r0 = str;
                            break;
                        case 5:
                            arrayList = arrayList12;
                            arrayList2 = arrayList15;
                            obj = obj7;
                            arrayList10 = arrayList17;
                            arrayList3 = arrayList11;
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList5.add(ProfileAlias.ADAPTER.decode(protoReader));
                            r0 = str;
                            break;
                        case 6:
                            arrayList = arrayList12;
                            arrayList2 = arrayList15;
                            obj = obj7;
                            arrayList3 = arrayList11;
                            arrayList4 = arrayList13;
                            arrayList10 = arrayList17;
                            arrayList10.add(NotificationPreference.ADAPTER.decode(protoReader));
                            arrayList5 = arrayList16;
                            r0 = str;
                            break;
                        case 7:
                            arrayList = arrayList12;
                            arrayList2 = arrayList15;
                            obj = obj7;
                            arrayList3 = arrayList11;
                            try {
                                nearbyVisibility = NearbyVisibility.ADAPTER.decode(protoReader);
                                arrayList4 = arrayList13;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                arrayList4 = arrayList13;
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            r0 = str;
                            break;
                        case 9:
                            arrayList = arrayList12;
                            arrayList2 = arrayList15;
                            obj = obj7;
                            arrayList3 = arrayList11;
                            str2 = ProtoAdapter.STRING.decode(protoReader);
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            r0 = str;
                            break;
                        case 10:
                            arrayList = arrayList12;
                            arrayList2 = arrayList15;
                            obj = obj7;
                            arrayList3 = arrayList11;
                            str4 = ProtoAdapter.STRING.decode(protoReader);
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            r0 = str;
                            break;
                        case 11:
                            arrayList = arrayList12;
                            arrayList2 = arrayList15;
                            obj = obj7;
                            arrayList3 = arrayList11;
                            str5 = ProtoAdapter.STRING.decode(protoReader);
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            r0 = str;
                            break;
                        case 12:
                            arrayList = arrayList12;
                            arrayList2 = arrayList15;
                            obj = obj7;
                            arrayList3 = arrayList11;
                            str9 = ProtoAdapter.STRING.decode(protoReader);
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            r0 = str;
                            break;
                        case 13:
                            ArrayList arrayList18 = arrayList15;
                            arrayList3 = arrayList11;
                            arrayList6 = arrayList12;
                            arrayList7 = arrayList18;
                            obj = obj7;
                            try {
                                ratePlan = RatePlan.ADAPTER.decode(protoReader);
                                arrayList = arrayList6;
                                arrayList2 = arrayList7;
                                arrayList4 = arrayList13;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                arrayList = arrayList6;
                                arrayList2 = arrayList7;
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            r0 = str;
                            break;
                        case 14:
                            ArrayList arrayList19 = arrayList15;
                            arrayList3 = arrayList11;
                            arrayList6 = arrayList12;
                            arrayList7 = arrayList19;
                            obj = obj7;
                            bool2 = ProtoAdapter.BOOL.decode(protoReader);
                            arrayList = arrayList6;
                            arrayList2 = arrayList7;
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            r0 = str;
                            break;
                        case 15:
                            ArrayList arrayList20 = arrayList15;
                            arrayList3 = arrayList11;
                            arrayList6 = arrayList12;
                            arrayList7 = arrayList20;
                            obj = obj7;
                            bool3 = ProtoAdapter.BOOL.decode(protoReader);
                            arrayList = arrayList6;
                            arrayList2 = arrayList7;
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            r0 = str;
                            break;
                        case 16:
                            ArrayList arrayList21 = arrayList15;
                            arrayList3 = arrayList11;
                            arrayList6 = arrayList12;
                            arrayList7 = arrayList21;
                            obj = obj7;
                            bool4 = ProtoAdapter.BOOL.decode(protoReader);
                            arrayList = arrayList6;
                            arrayList2 = arrayList7;
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            r0 = str;
                            break;
                        case 18:
                            ArrayList arrayList22 = arrayList15;
                            arrayList3 = arrayList11;
                            arrayList6 = arrayList12;
                            arrayList7 = arrayList22;
                            obj = obj7;
                            bool5 = ProtoAdapter.BOOL.decode(protoReader);
                            arrayList = arrayList6;
                            arrayList2 = arrayList7;
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            r0 = str;
                            break;
                        case 19:
                            ArrayList arrayList23 = arrayList11;
                            ArrayList arrayList24 = arrayList12;
                            ArrayList arrayList25 = arrayList15;
                            obj = obj7;
                            arrayList3 = arrayList23;
                            arrayList3.add(ProtoAdapter.STRING.decode(protoReader));
                            arrayList = arrayList24;
                            arrayList2 = arrayList25;
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            r0 = str;
                            break;
                        case 20:
                            arrayList8 = arrayList11;
                            arrayList = arrayList12;
                            arrayList9 = arrayList15;
                            obj = obj7;
                            arrayList.add(Instrument.ADAPTER.decode(protoReader));
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            arrayList3 = arrayList8;
                            arrayList2 = arrayList9;
                            r0 = str;
                            break;
                        case 21:
                            arrayList8 = arrayList11;
                            arrayList = arrayList12;
                            arrayList9 = arrayList15;
                            obj = obj7;
                            str10 = ProtoAdapter.STRING.decode(protoReader);
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            arrayList3 = arrayList8;
                            r0 = str;
                            arrayList2 = arrayList9;
                            break;
                        case 22:
                            arrayList8 = arrayList11;
                            arrayList = arrayList12;
                            arrayList9 = arrayList15;
                            obj = obj7;
                            try {
                                depositPreference = DepositPreference.ADAPTER.decode(protoReader);
                                arrayList4 = arrayList13;
                                arrayList5 = arrayList16;
                                arrayList10 = arrayList17;
                                arrayList3 = arrayList8;
                                r0 = str;
                                arrayList2 = arrayList9;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                break;
                            }
                        case 24:
                            arrayList8 = arrayList11;
                            arrayList = arrayList12;
                            arrayList9 = arrayList15;
                            obj = obj7;
                            obj3 = TransactorKt.decodeMessageOrMerge(ScenarioPlanMap.ADAPTER, protoReader, obj3);
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            arrayList3 = arrayList8;
                            r0 = str;
                            arrayList2 = arrayList9;
                            break;
                        case 25:
                            arrayList8 = arrayList11;
                            arrayList = arrayList12;
                            arrayList9 = arrayList15;
                            obj = obj7;
                            bool6 = ProtoAdapter.BOOL.decode(protoReader);
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            arrayList3 = arrayList8;
                            r0 = str;
                            arrayList2 = arrayList9;
                            break;
                        case 28:
                            arrayList8 = arrayList11;
                            arrayList = arrayList12;
                            arrayList9 = arrayList15;
                            obj = obj7;
                            obj2 = TransactorKt.decodeMessageOrMerge(BalanceData.ADAPTER, protoReader, obj2);
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            arrayList3 = arrayList8;
                            r0 = str;
                            arrayList2 = arrayList9;
                            break;
                        case 29:
                            arrayList8 = arrayList11;
                            arrayList = arrayList12;
                            arrayList9 = arrayList15;
                            obj = obj7;
                            bool8 = ProtoAdapter.BOOL.decode(protoReader);
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            arrayList3 = arrayList8;
                            r0 = str;
                            arrayList2 = arrayList9;
                            break;
                        case 30:
                            arrayList8 = arrayList11;
                            arrayList = arrayList12;
                            arrayList9 = arrayList15;
                            obj = obj7;
                            l = ProtoAdapter.INT64.decode(protoReader);
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            arrayList3 = arrayList8;
                            r0 = str;
                            arrayList2 = arrayList9;
                            break;
                        case 31:
                            arrayList8 = arrayList11;
                            arrayList = arrayList12;
                            arrayList9 = arrayList15;
                            obj = obj7;
                            obj4 = TransactorKt.decodeMessageOrMerge(GlobalAddress.ADAPTER, protoReader, obj4);
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            arrayList3 = arrayList8;
                            r0 = str;
                            arrayList2 = arrayList9;
                            break;
                        case 32:
                            arrayList8 = arrayList11;
                            arrayList = arrayList12;
                            arrayList9 = arrayList15;
                            obj = obj7;
                            obj5 = TransactorKt.decodeMessageOrMerge(IssuedCard.ADAPTER, protoReader, obj5);
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            arrayList3 = arrayList8;
                            r0 = str;
                            arrayList2 = arrayList9;
                            break;
                        case 33:
                            arrayList8 = arrayList11;
                            arrayList = arrayList12;
                            arrayList9 = arrayList15;
                            obj = obj7;
                            obj6 = TransactorKt.decodeMessageOrMerge(DepositPreferenceData.ADAPTER, protoReader, obj6);
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            arrayList3 = arrayList8;
                            r0 = str;
                            arrayList2 = arrayList9;
                            break;
                        case 34:
                            arrayList8 = arrayList11;
                            arrayList = arrayList12;
                            arrayList9 = arrayList15;
                            obj = obj7;
                            str12 = ProtoAdapter.STRING.decode(protoReader);
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            arrayList3 = arrayList8;
                            r0 = str;
                            arrayList2 = arrayList9;
                            break;
                        case 35:
                            arrayList8 = arrayList11;
                            arrayList = arrayList12;
                            arrayList9 = arrayList15;
                            obj = obj7;
                            bool9 = ProtoAdapter.BOOL.decode(protoReader);
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            arrayList3 = arrayList8;
                            r0 = str;
                            arrayList2 = arrayList9;
                            break;
                        case 36:
                            arrayList8 = arrayList11;
                            arrayList = arrayList12;
                            arrayList9 = arrayList15;
                            obj = obj7;
                            num = ProtoAdapter.INT32.decode(protoReader);
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            arrayList3 = arrayList8;
                            r0 = str;
                            arrayList2 = arrayList9;
                            break;
                        case 40:
                            arrayList8 = arrayList11;
                            arrayList = arrayList12;
                            arrayList9 = arrayList15;
                            obj = obj7;
                            obj8 = TransactorKt.decodeMessageOrMerge(CashDrawerData.ADAPTER, protoReader, obj8);
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            arrayList3 = arrayList8;
                            r0 = str;
                            arrayList2 = arrayList9;
                            break;
                        case 41:
                            arrayList8 = arrayList11;
                            arrayList = arrayList12;
                            arrayList9 = arrayList15;
                            obj = obj7;
                            bool10 = ProtoAdapter.BOOL.decode(protoReader);
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            arrayList3 = arrayList8;
                            r0 = str;
                            arrayList2 = arrayList9;
                            break;
                        case 43:
                            arrayList8 = arrayList11;
                            arrayList = arrayList12;
                            arrayList9 = arrayList15;
                            obj = obj7;
                            try {
                                currencyCode = CurrencyCode.ADAPTER.decode(protoReader);
                                arrayList4 = arrayList13;
                                arrayList5 = arrayList16;
                                arrayList10 = arrayList17;
                                arrayList3 = arrayList8;
                                r0 = str;
                                arrayList2 = arrayList9;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                break;
                            }
                        case 44:
                            arrayList8 = arrayList11;
                            arrayList = arrayList12;
                            arrayList9 = arrayList15;
                            obj = obj7;
                            try {
                                country = Country.ADAPTER.decode(protoReader);
                                arrayList4 = arrayList13;
                                arrayList5 = arrayList16;
                                arrayList10 = arrayList17;
                                arrayList3 = arrayList8;
                                r0 = str;
                                arrayList2 = arrayList9;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                break;
                            }
                        case 45:
                            arrayList8 = arrayList11;
                            arrayList = arrayList12;
                            arrayList9 = arrayList15;
                            obj = obj7;
                            obj9 = TransactorKt.decodeMessageOrMerge(DirectDepositAccount.ADAPTER, protoReader, obj9);
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            arrayList3 = arrayList8;
                            r0 = str;
                            arrayList2 = arrayList9;
                            break;
                        case 46:
                            arrayList8 = arrayList11;
                            arrayList = arrayList12;
                            arrayList9 = arrayList15;
                            obj = obj7;
                            arrayList13.add(InstrumentLinkingOption.ADAPTER.decode(protoReader));
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            arrayList3 = arrayList8;
                            arrayList2 = arrayList9;
                            r0 = str;
                            break;
                        case 48:
                            arrayList8 = arrayList11;
                            arrayList = arrayList12;
                            arrayList9 = arrayList15;
                            obj = obj7;
                            try {
                                incomingRequestPolicy = IncomingRequestPolicy.ADAPTER.decode(protoReader);
                                arrayList4 = arrayList13;
                                arrayList5 = arrayList16;
                                arrayList10 = arrayList17;
                                arrayList3 = arrayList8;
                                r0 = str;
                                arrayList2 = arrayList9;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e6) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e6.value));
                                break;
                            }
                        case 50:
                            arrayList8 = arrayList11;
                            arrayList = arrayList12;
                            arrayList9 = arrayList15;
                            obj = obj7;
                            try {
                                Region.ADAPTER.tryDecode(protoReader, arrayList14);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e7) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e7.value));
                            }
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            arrayList3 = arrayList8;
                            arrayList2 = arrayList9;
                            r0 = str;
                            break;
                        case 52:
                            arrayList8 = arrayList11;
                            arrayList = arrayList12;
                            arrayList9 = arrayList15;
                            obj = obj7;
                            str6 = ProtoAdapter.STRING.decode(protoReader);
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            arrayList3 = arrayList8;
                            r0 = str;
                            arrayList2 = arrayList9;
                            break;
                        case 53:
                            arrayList8 = arrayList11;
                            arrayList = arrayList12;
                            arrayList9 = arrayList15;
                            obj = obj7;
                            str3 = ProtoAdapter.STRING.decode(protoReader);
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            arrayList3 = arrayList8;
                            r0 = str;
                            arrayList2 = arrayList9;
                            break;
                        case 54:
                            arrayList8 = arrayList11;
                            arrayList = arrayList12;
                            obj = obj7;
                            try {
                                arrayList2 = arrayList15;
                                arrayList3 = arrayList8;
                                region = Region.ADAPTER.decode(protoReader);
                                arrayList4 = arrayList13;
                                arrayList5 = arrayList16;
                                arrayList10 = arrayList17;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e8) {
                                arrayList9 = arrayList15;
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e8.value));
                                break;
                            }
                            r0 = str;
                            break;
                        case 55:
                            arrayList = arrayList12;
                            obj = obj7;
                            arrayList2 = arrayList15;
                            arrayList3 = arrayList11;
                            str8 = ProtoAdapter.STRING.decode(protoReader);
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            r0 = str;
                            break;
                        case 56:
                            arrayList = arrayList12;
                            obj = obj7;
                            arrayList2 = arrayList15;
                            arrayList3 = arrayList11;
                            str7 = ProtoAdapter.STRING.decode(protoReader);
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            r0 = str;
                            break;
                        case 57:
                            arrayList = arrayList12;
                            obj = obj7;
                            arrayList2 = arrayList15;
                            arrayList3 = arrayList11;
                            bool = ProtoAdapter.BOOL.decode(protoReader);
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            r0 = str;
                            break;
                        case 58:
                            arrayList = arrayList12;
                            obj = obj7;
                            arrayList2 = arrayList15;
                            arrayList3 = arrayList11;
                            bool11 = ProtoAdapter.BOOL.decode(protoReader);
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            r0 = str;
                            break;
                        case 59:
                            arrayList = arrayList12;
                            obj = obj7;
                            arrayList15.add(Instrument.ADAPTER.decode(protoReader));
                            arrayList2 = arrayList15;
                            arrayList3 = arrayList11;
                            arrayList4 = arrayList13;
                            arrayList5 = arrayList16;
                            arrayList10 = arrayList17;
                            r0 = str;
                            break;
                        case 60:
                            try {
                                bitcoinDisplayUnits = BitcoinDisplayUnits.ADAPTER.decode(protoReader);
                                arrayList = arrayList12;
                                arrayList2 = arrayList15;
                                obj = obj7;
                                arrayList10 = arrayList17;
                                r0 = str;
                                arrayList3 = arrayList11;
                                arrayList4 = arrayList13;
                                arrayList5 = arrayList16;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e9) {
                                obj = obj7;
                                arrayList = arrayList12;
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e9.value));
                                arrayList11 = arrayList11;
                                break;
                            }
                        case 63:
                            obj = TransactorKt.decodeMessageOrMerge(CardScheme.ADAPTER, protoReader, obj7);
                            arrayList = arrayList12;
                            arrayList4 = arrayList13;
                            arrayList2 = arrayList15;
                            arrayList10 = arrayList17;
                            r0 = str;
                            arrayList3 = arrayList11;
                            arrayList5 = arrayList16;
                            break;
                    }
                    str = r0;
                    arrayList16 = arrayList5;
                    arrayList11 = arrayList3;
                    arrayList13 = arrayList4;
                    obj7 = obj;
                    arrayList15 = arrayList2;
                    arrayList12 = arrayList;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                Profile profile = (Profile) obj;
                reverseProtoWriter.getClass();
                profile.getClass();
                reverseProtoWriter.writeBytes(profile.unknownFields());
                CardScheme.ADAPTER.encodeWithTag(reverseProtoWriter, 63, profile.card_scheme);
                BitcoinDisplayUnits.ADAPTER.encodeWithTag(reverseProtoWriter, 60, profile.bitcoin_display_units);
                ProtoAdapter protoAdapter2 = Instrument.ADAPTER;
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 59, profile.pending_instruments);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(reverseProtoWriter, 58, profile.direct_deposit_account_enabled);
                ProtoAdapter protoAdapter4 = Region.ADAPTER;
                protoAdapter4.encodeWithTag(reverseProtoWriter, 54, profile.region);
                protoAdapter4.asRepeated().encodeWithTag(reverseProtoWriter, 50, profile.available_p2p_target_regions);
                IncomingRequestPolicy.ADAPTER.encodeWithTag(reverseProtoWriter, 48, profile.incoming_request_policy);
                InstrumentLinkingOption.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 46, profile.instrument_linking_options);
                DirectDepositAccount.ADAPTER.encodeWithTag(reverseProtoWriter, 45, profile.direct_deposit_account);
                Country.ADAPTER.encodeWithTag(reverseProtoWriter, 44, profile.country_code);
                CurrencyCode.ADAPTER.encodeWithTag(reverseProtoWriter, 43, profile.default_currency);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 41, profile.has_passed_idv);
                CashDrawerData.ADAPTER.encodeWithTag(reverseProtoWriter, 40, profile.cash_drawer_data);
                ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 36, profile.require_minimum_initiator_notes_length_for_requests);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 35, profile.suppress_review_prompt);
                DepositPreferenceData.ADAPTER.encodeWithTag(reverseProtoWriter, 33, profile.deposit_preference_data);
                IssuedCard.ADAPTER.encodeWithTag(reverseProtoWriter, 32, profile.issued_card);
                GlobalAddress.ADAPTER.encodeWithTag(reverseProtoWriter, 31, profile.postal_address);
                ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 30, profile.customer_since);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 25, profile.show_tax_information_link);
                ScenarioPlanMap.ADAPTER.encodeWithTag(reverseProtoWriter, 24, profile.scenario_plan_map);
                BalanceData.ADAPTER.encodeWithTag(reverseProtoWriter, 28, profile.balance_data);
                DepositPreference.ADAPTER.encodeWithTag(reverseProtoWriter, 22, profile.deposit_preference);
                ProtoAdapter protoAdapter5 = ProtoAdapter.STRING;
                protoAdapter5.encodeWithTag(reverseProtoWriter, 21, profile.verification_instrument_token);
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 20, profile.instruments);
                protoAdapter5.asRepeated().encodeWithTag(reverseProtoWriter, 19, profile.app_message_tokens);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 18, profile.app_message_notifications_enabled);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 16, profile.is_verified_account);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 15, profile.can_upgrade_to_business);
                RatePlan.ADAPTER.encodeWithTag(reverseProtoWriter, 13, profile.rate_plan);
                protoAdapter5.encodeWithTag(reverseProtoWriter, 12, profile.synopsis);
                protoAdapter5.encodeWithTag(reverseProtoWriter, 55, profile.printable_cashtag_qr_image_url);
                protoAdapter5.encodeWithTag(reverseProtoWriter, 56, profile.cashtag_qr_svg_url);
                protoAdapter5.encodeWithTag(reverseProtoWriter, 52, profile.cashtag_qr_image_url);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 14, profile.cashtag_url_enabled);
                protoAdapter5.encodeWithTag(reverseProtoWriter, 11, profile.cashtag_url_display_text);
                protoAdapter5.encodeWithTag(reverseProtoWriter, 10, profile.cashtag_url);
                protoAdapter5.encodeWithTag(reverseProtoWriter, 53, profile.cashtag_with_currency_symbol);
                protoAdapter5.encodeWithTag(reverseProtoWriter, 9, profile.cashtag);
                NearbyVisibility.ADAPTER.encodeWithTag(reverseProtoWriter, 7, profile.nearby_visibility);
                NotificationPreference.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, profile.notification_preferences);
                ProfileAlias.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 5, profile.aliases);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 57, profile.sca_required);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 29, profile.has_passcode);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 4, profile.require_passcode_confirmation);
                protoAdapter5.encodeWithTag(reverseProtoWriter, 34, profile.customer_token);
                protoAdapter5.encodeWithTag(reverseProtoWriter, 2, profile.photo_url);
                protoAdapter5.encodeWithTag(reverseProtoWriter, 1, profile.full_name);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                Profile profile = (Profile) obj;
                profile.getClass();
                int size$okio = profile.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(34, profile.customer_token) + protoAdapter2.encodedSizeWithTag(2, profile.photo_url) + protoAdapter2.encodedSizeWithTag(1, profile.full_name) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                int encodedSizeWithTag2 = protoAdapter2.asRepeated().encodedSizeWithTag(19, profile.app_message_tokens) + protoAdapter3.encodedSizeWithTag(18, profile.app_message_notifications_enabled) + protoAdapter3.encodedSizeWithTag(16, profile.is_verified_account) + protoAdapter3.encodedSizeWithTag(15, profile.can_upgrade_to_business) + RatePlan.ADAPTER.encodedSizeWithTag(13, profile.rate_plan) + protoAdapter2.encodedSizeWithTag(12, profile.synopsis) + protoAdapter2.encodedSizeWithTag(55, profile.printable_cashtag_qr_image_url) + protoAdapter2.encodedSizeWithTag(56, profile.cashtag_qr_svg_url) + protoAdapter2.encodedSizeWithTag(52, profile.cashtag_qr_image_url) + protoAdapter3.encodedSizeWithTag(14, profile.cashtag_url_enabled) + protoAdapter2.encodedSizeWithTag(11, profile.cashtag_url_display_text) + protoAdapter2.encodedSizeWithTag(10, profile.cashtag_url) + protoAdapter2.encodedSizeWithTag(53, profile.cashtag_with_currency_symbol) + protoAdapter2.encodedSizeWithTag(9, profile.cashtag) + NearbyVisibility.ADAPTER.encodedSizeWithTag(7, profile.nearby_visibility) + NotificationPreference.ADAPTER.asRepeated().encodedSizeWithTag(6, profile.notification_preferences) + ProfileAlias.ADAPTER.asRepeated().encodedSizeWithTag(5, profile.aliases) + protoAdapter3.encodedSizeWithTag(57, profile.sca_required) + protoAdapter3.encodedSizeWithTag(29, profile.has_passcode) + protoAdapter3.encodedSizeWithTag(4, profile.require_passcode_confirmation) + encodedSizeWithTag;
                ProtoAdapter protoAdapter4 = Instrument.ADAPTER;
                int encodedSizeWithTag3 = IncomingRequestPolicy.ADAPTER.encodedSizeWithTag(48, profile.incoming_request_policy) + InstrumentLinkingOption.ADAPTER.asRepeated().encodedSizeWithTag(46, profile.instrument_linking_options) + DirectDepositAccount.ADAPTER.encodedSizeWithTag(45, profile.direct_deposit_account) + Country.ADAPTER.encodedSizeWithTag(44, profile.country_code) + CurrencyCode.ADAPTER.encodedSizeWithTag(43, profile.default_currency) + protoAdapter3.encodedSizeWithTag(41, profile.has_passed_idv) + CashDrawerData.ADAPTER.encodedSizeWithTag(40, profile.cash_drawer_data) + ProtoAdapter.INT32.encodedSizeWithTag(36, profile.require_minimum_initiator_notes_length_for_requests) + protoAdapter3.encodedSizeWithTag(35, profile.suppress_review_prompt) + DepositPreferenceData.ADAPTER.encodedSizeWithTag(33, profile.deposit_preference_data) + IssuedCard.ADAPTER.encodedSizeWithTag(32, profile.issued_card) + GlobalAddress.ADAPTER.encodedSizeWithTag(31, profile.postal_address) + ProtoAdapter.INT64.encodedSizeWithTag(30, profile.customer_since) + protoAdapter3.encodedSizeWithTag(25, profile.show_tax_information_link) + ScenarioPlanMap.ADAPTER.encodedSizeWithTag(24, profile.scenario_plan_map) + BalanceData.ADAPTER.encodedSizeWithTag(28, profile.balance_data) + DepositPreference.ADAPTER.encodedSizeWithTag(22, profile.deposit_preference) + protoAdapter2.encodedSizeWithTag(21, profile.verification_instrument_token) + protoAdapter4.asRepeated().encodedSizeWithTag(20, profile.instruments) + encodedSizeWithTag2;
                ProtoAdapter protoAdapter5 = Region.ADAPTER;
                return CardScheme.ADAPTER.encodedSizeWithTag(63, profile.card_scheme) + BitcoinDisplayUnits.ADAPTER.encodedSizeWithTag(60, profile.bitcoin_display_units) + protoAdapter4.asRepeated().encodedSizeWithTag(59, profile.pending_instruments) + protoAdapter3.encodedSizeWithTag(58, profile.direct_deposit_account_enabled) + protoAdapter5.encodedSizeWithTag(54, profile.region) + protoAdapter5.asRepeated().encodedSizeWithTag(50, profile.available_p2p_target_regions) + encodedSizeWithTag3;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                Profile profile = (Profile) obj;
                profile.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(profile.aliases, ProfileAlias.ADAPTER);
                ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(profile.notification_preferences, NotificationPreference.ADAPTER);
                List list = profile.instruments;
                ProtoAdapter protoAdapter2 = Instrument.ADAPTER;
                ArrayList m1169redactElements3 = TransactorKt.m1169redactElements(list, protoAdapter2);
                BalanceData balanceData = profile.balance_data;
                BalanceData balanceData2 = balanceData != null ? (BalanceData) BalanceData.ADAPTER.redact(balanceData) : null;
                ScenarioPlanMap scenarioPlanMap = profile.scenario_plan_map;
                ScenarioPlanMap scenarioPlanMap2 = scenarioPlanMap != null ? (ScenarioPlanMap) ScenarioPlanMap.ADAPTER.redact(scenarioPlanMap) : null;
                GlobalAddress globalAddress = profile.postal_address;
                GlobalAddress globalAddress2 = globalAddress != null ? (GlobalAddress) GlobalAddress.ADAPTER.redact(globalAddress) : null;
                IssuedCard issuedCard = profile.issued_card;
                IssuedCard issuedCard2 = issuedCard != null ? (IssuedCard) IssuedCard.ADAPTER.redact(issuedCard) : null;
                DepositPreferenceData depositPreferenceData = profile.deposit_preference_data;
                DepositPreferenceData depositPreferenceData2 = depositPreferenceData != null ? (DepositPreferenceData) DepositPreferenceData.ADAPTER.redact(depositPreferenceData) : null;
                CashDrawerData cashDrawerData = profile.cash_drawer_data;
                CashDrawerData cashDrawerData2 = cashDrawerData != null ? (CashDrawerData) CashDrawerData.ADAPTER.redact(cashDrawerData) : null;
                DirectDepositAccount directDepositAccount = profile.direct_deposit_account;
                DirectDepositAccount directDepositAccount2 = directDepositAccount != null ? (DirectDepositAccount) DirectDepositAccount.ADAPTER.redact(directDepositAccount) : null;
                ArrayList m1169redactElements4 = TransactorKt.m1169redactElements(profile.instrument_linking_options, InstrumentLinkingOption.ADAPTER);
                ArrayList m1169redactElements5 = TransactorKt.m1169redactElements(profile.pending_instruments, protoAdapter2);
                CardScheme cardScheme = profile.card_scheme;
                CardScheme cardScheme2 = cardScheme != null ? (CardScheme) CardScheme.ADAPTER.redact(cardScheme) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = profile.customer_token;
                Boolean bool = profile.require_passcode_confirmation;
                Boolean bool2 = profile.has_passcode;
                Boolean bool3 = profile.sca_required;
                NearbyVisibility nearbyVisibility = profile.nearby_visibility;
                Boolean bool4 = profile.cashtag_url_enabled;
                RatePlan ratePlan = profile.rate_plan;
                Boolean bool5 = profile.can_upgrade_to_business;
                Boolean bool6 = profile.is_verified_account;
                Boolean bool7 = profile.app_message_notifications_enabled;
                List list2 = profile.app_message_tokens;
                String str2 = profile.verification_instrument_token;
                DepositPreference depositPreference = profile.deposit_preference;
                Boolean bool8 = profile.show_tax_information_link;
                Long l = profile.customer_since;
                Boolean bool9 = profile.suppress_review_prompt;
                Integer num = profile.require_minimum_initiator_notes_length_for_requests;
                Boolean bool10 = profile.has_passed_idv;
                CurrencyCode currencyCode = profile.default_currency;
                Country country = profile.country_code;
                IncomingRequestPolicy incomingRequestPolicy = profile.incoming_request_policy;
                List list3 = profile.available_p2p_target_regions;
                Region region = profile.region;
                Boolean bool11 = profile.direct_deposit_account_enabled;
                BitcoinDisplayUnits bitcoinDisplayUnits = profile.bitcoin_display_units;
                list2.getClass();
                list3.getClass();
                byteString.getClass();
                return new Profile(null, null, str, bool, bool2, bool3, m1169redactElements, m1169redactElements2, nearbyVisibility, null, null, null, null, bool4, null, null, null, null, ratePlan, bool5, bool6, bool7, list2, m1169redactElements3, str2, depositPreference, balanceData2, scenarioPlanMap2, bool8, l, globalAddress2, issuedCard2, depositPreferenceData2, bool9, num, cashDrawerData2, bool10, currencyCode, country, directDepositAccount2, m1169redactElements4, incomingRequestPolicy, list3, region, bool11, m1169redactElements5, bitcoinDisplayUnits, cardScheme2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                Profile profile = (Profile) obj;
                profile.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, profile.full_name);
                protoAdapter2.encodeWithTag(protoWriter, 2, profile.photo_url);
                protoAdapter2.encodeWithTag(protoWriter, 34, profile.customer_token);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(protoWriter, 4, profile.require_passcode_confirmation);
                protoAdapter3.encodeWithTag(protoWriter, 29, profile.has_passcode);
                protoAdapter3.encodeWithTag(protoWriter, 57, profile.sca_required);
                ProfileAlias.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, profile.aliases);
                NotificationPreference.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, profile.notification_preferences);
                NearbyVisibility.ADAPTER.encodeWithTag(protoWriter, 7, profile.nearby_visibility);
                protoAdapter2.encodeWithTag(protoWriter, 9, profile.cashtag);
                protoAdapter2.encodeWithTag(protoWriter, 53, profile.cashtag_with_currency_symbol);
                protoAdapter2.encodeWithTag(protoWriter, 10, profile.cashtag_url);
                protoAdapter2.encodeWithTag(protoWriter, 11, profile.cashtag_url_display_text);
                protoAdapter3.encodeWithTag(protoWriter, 14, profile.cashtag_url_enabled);
                protoAdapter2.encodeWithTag(protoWriter, 52, profile.cashtag_qr_image_url);
                protoAdapter2.encodeWithTag(protoWriter, 56, profile.cashtag_qr_svg_url);
                protoAdapter2.encodeWithTag(protoWriter, 55, profile.printable_cashtag_qr_image_url);
                protoAdapter2.encodeWithTag(protoWriter, 12, profile.synopsis);
                RatePlan.ADAPTER.encodeWithTag(protoWriter, 13, profile.rate_plan);
                protoAdapter3.encodeWithTag(protoWriter, 15, profile.can_upgrade_to_business);
                protoAdapter3.encodeWithTag(protoWriter, 16, profile.is_verified_account);
                protoAdapter3.encodeWithTag(protoWriter, 18, profile.app_message_notifications_enabled);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 19, profile.app_message_tokens);
                ProtoAdapter protoAdapter4 = Instrument.ADAPTER;
                protoAdapter4.asRepeated().encodeWithTag(protoWriter, 20, profile.instruments);
                protoAdapter2.encodeWithTag(protoWriter, 21, profile.verification_instrument_token);
                DepositPreference.ADAPTER.encodeWithTag(protoWriter, 22, profile.deposit_preference);
                BalanceData.ADAPTER.encodeWithTag(protoWriter, 28, profile.balance_data);
                ScenarioPlanMap.ADAPTER.encodeWithTag(protoWriter, 24, profile.scenario_plan_map);
                protoAdapter3.encodeWithTag(protoWriter, 25, profile.show_tax_information_link);
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 30, profile.customer_since);
                GlobalAddress.ADAPTER.encodeWithTag(protoWriter, 31, profile.postal_address);
                IssuedCard.ADAPTER.encodeWithTag(protoWriter, 32, profile.issued_card);
                DepositPreferenceData.ADAPTER.encodeWithTag(protoWriter, 33, profile.deposit_preference_data);
                protoAdapter3.encodeWithTag(protoWriter, 35, profile.suppress_review_prompt);
                ProtoAdapter.INT32.encodeWithTag(protoWriter, 36, profile.require_minimum_initiator_notes_length_for_requests);
                CashDrawerData.ADAPTER.encodeWithTag(protoWriter, 40, profile.cash_drawer_data);
                protoAdapter3.encodeWithTag(protoWriter, 41, profile.has_passed_idv);
                CurrencyCode.ADAPTER.encodeWithTag(protoWriter, 43, profile.default_currency);
                Country.ADAPTER.encodeWithTag(protoWriter, 44, profile.country_code);
                DirectDepositAccount.ADAPTER.encodeWithTag(protoWriter, 45, profile.direct_deposit_account);
                InstrumentLinkingOption.ADAPTER.asRepeated().encodeWithTag(protoWriter, 46, profile.instrument_linking_options);
                IncomingRequestPolicy.ADAPTER.encodeWithTag(protoWriter, 48, profile.incoming_request_policy);
                ProtoAdapter protoAdapter5 = Region.ADAPTER;
                protoAdapter5.asRepeated().encodeWithTag(protoWriter, 50, profile.available_p2p_target_regions);
                protoAdapter5.encodeWithTag(protoWriter, 54, profile.region);
                protoAdapter3.encodeWithTag(protoWriter, 58, profile.direct_deposit_account_enabled);
                protoAdapter4.asRepeated().encodeWithTag(protoWriter, 59, profile.pending_instruments);
                BitcoinDisplayUnits.ADAPTER.encodeWithTag(protoWriter, 60, profile.bitcoin_display_units);
                CardScheme.ADAPTER.encodeWithTag(protoWriter, 63, profile.card_scheme);
                protoWriter.writeBytes(profile.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Profile(String str, String str2, String str3, Boolean bool, Boolean bool2, Boolean bool3, List list, List list2, NearbyVisibility nearbyVisibility, String str4, String str5, String str6, String str7, Boolean bool4, String str8, String str9, String str10, String str11, RatePlan ratePlan, Boolean bool5, Boolean bool6, Boolean bool7, List list3, List list4, String str12, DepositPreference depositPreference, BalanceData balanceData, ScenarioPlanMap scenarioPlanMap, Boolean bool8, Long l, GlobalAddress globalAddress, IssuedCard issuedCard, DepositPreferenceData depositPreferenceData, Boolean bool9, Integer num, CashDrawerData cashDrawerData, Boolean bool10, CurrencyCode currencyCode, Country country, DirectDepositAccount directDepositAccount, List list5, IncomingRequestPolicy incomingRequestPolicy, List list6, Region region, Boolean bool11, List list7, BitcoinDisplayUnits bitcoinDisplayUnits, CardScheme cardScheme, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list6, list7, byteString);
        this.full_name = str;
        this.photo_url = str2;
        this.customer_token = str3;
        this.require_passcode_confirmation = bool;
        this.has_passcode = bool2;
        this.sca_required = bool3;
        this.nearby_visibility = nearbyVisibility;
        this.cashtag = str4;
        this.cashtag_with_currency_symbol = str5;
        this.cashtag_url = str6;
        this.cashtag_url_display_text = str7;
        this.cashtag_url_enabled = bool4;
        this.cashtag_qr_image_url = str8;
        this.cashtag_qr_svg_url = str9;
        this.printable_cashtag_qr_image_url = str10;
        this.synopsis = str11;
        this.rate_plan = ratePlan;
        this.can_upgrade_to_business = bool5;
        this.is_verified_account = bool6;
        this.app_message_notifications_enabled = bool7;
        this.verification_instrument_token = str12;
        this.deposit_preference = depositPreference;
        this.balance_data = balanceData;
        this.scenario_plan_map = scenarioPlanMap;
        this.show_tax_information_link = bool8;
        this.customer_since = l;
        this.postal_address = globalAddress;
        this.issued_card = issuedCard;
        this.deposit_preference_data = depositPreferenceData;
        this.suppress_review_prompt = bool9;
        this.require_minimum_initiator_notes_length_for_requests = num;
        this.cash_drawer_data = cashDrawerData;
        this.has_passed_idv = bool10;
        this.default_currency = currencyCode;
        this.country_code = country;
        this.direct_deposit_account = directDepositAccount;
        this.incoming_request_policy = incomingRequestPolicy;
        this.region = region;
        this.direct_deposit_account_enabled = bool11;
        this.bitcoin_display_units = bitcoinDisplayUnits;
        this.card_scheme = cardScheme;
        this.aliases = TransactorKt.immutableCopyOf("aliases", list);
        this.notification_preferences = TransactorKt.immutableCopyOf("notification_preferences", list2);
        this.app_message_tokens = TransactorKt.immutableCopyOf("app_message_tokens", list3);
        this.instruments = TransactorKt.immutableCopyOf("instruments", list4);
        this.instrument_linking_options = TransactorKt.immutableCopyOf("instrument_linking_options", list5);
        this.available_p2p_target_regions = TransactorKt.immutableCopyOf("available_p2p_target_regions", list6);
        this.pending_instruments = TransactorKt.immutableCopyOf("pending_instruments", list7);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) obj;
        return Intrinsics.areEqual(unknownFields(), profile.unknownFields()) && Intrinsics.areEqual(this.full_name, profile.full_name) && Intrinsics.areEqual(this.photo_url, profile.photo_url) && Intrinsics.areEqual(this.customer_token, profile.customer_token) && Intrinsics.areEqual(this.require_passcode_confirmation, profile.require_passcode_confirmation) && Intrinsics.areEqual(this.has_passcode, profile.has_passcode) && Intrinsics.areEqual(this.sca_required, profile.sca_required) && Intrinsics.areEqual(this.aliases, profile.aliases) && Intrinsics.areEqual(this.notification_preferences, profile.notification_preferences) && this.nearby_visibility == profile.nearby_visibility && Intrinsics.areEqual(this.cashtag, profile.cashtag) && Intrinsics.areEqual(this.cashtag_with_currency_symbol, profile.cashtag_with_currency_symbol) && Intrinsics.areEqual(this.cashtag_url, profile.cashtag_url) && Intrinsics.areEqual(this.cashtag_url_display_text, profile.cashtag_url_display_text) && Intrinsics.areEqual(this.cashtag_url_enabled, profile.cashtag_url_enabled) && Intrinsics.areEqual(this.cashtag_qr_image_url, profile.cashtag_qr_image_url) && Intrinsics.areEqual(this.cashtag_qr_svg_url, profile.cashtag_qr_svg_url) && Intrinsics.areEqual(this.printable_cashtag_qr_image_url, profile.printable_cashtag_qr_image_url) && Intrinsics.areEqual(this.synopsis, profile.synopsis) && this.rate_plan == profile.rate_plan && Intrinsics.areEqual(this.can_upgrade_to_business, profile.can_upgrade_to_business) && Intrinsics.areEqual(this.is_verified_account, profile.is_verified_account) && Intrinsics.areEqual(this.app_message_notifications_enabled, profile.app_message_notifications_enabled) && Intrinsics.areEqual(this.app_message_tokens, profile.app_message_tokens) && Intrinsics.areEqual(this.instruments, profile.instruments) && Intrinsics.areEqual(this.verification_instrument_token, profile.verification_instrument_token) && this.deposit_preference == profile.deposit_preference && Intrinsics.areEqual(this.balance_data, profile.balance_data) && Intrinsics.areEqual(this.scenario_plan_map, profile.scenario_plan_map) && Intrinsics.areEqual(this.show_tax_information_link, profile.show_tax_information_link) && Intrinsics.areEqual(this.customer_since, profile.customer_since) && Intrinsics.areEqual(this.postal_address, profile.postal_address) && Intrinsics.areEqual(this.issued_card, profile.issued_card) && Intrinsics.areEqual(this.deposit_preference_data, profile.deposit_preference_data) && Intrinsics.areEqual(this.suppress_review_prompt, profile.suppress_review_prompt) && Intrinsics.areEqual(this.require_minimum_initiator_notes_length_for_requests, profile.require_minimum_initiator_notes_length_for_requests) && Intrinsics.areEqual(this.cash_drawer_data, profile.cash_drawer_data) && Intrinsics.areEqual(this.has_passed_idv, profile.has_passed_idv) && this.default_currency == profile.default_currency && this.country_code == profile.country_code && Intrinsics.areEqual(this.direct_deposit_account, profile.direct_deposit_account) && Intrinsics.areEqual(this.instrument_linking_options, profile.instrument_linking_options) && this.incoming_request_policy == profile.incoming_request_policy && Intrinsics.areEqual(this.available_p2p_target_regions, profile.available_p2p_target_regions) && this.region == profile.region && Intrinsics.areEqual(this.direct_deposit_account_enabled, profile.direct_deposit_account_enabled) && Intrinsics.areEqual(this.pending_instruments, profile.pending_instruments) && this.bitcoin_display_units == profile.bitcoin_display_units && Intrinsics.areEqual(this.card_scheme, profile.card_scheme);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.full_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.photo_url;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.customer_token;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Boolean bool = this.require_passcode_confirmation;
        int hashCode5 = (hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.has_passcode;
        int hashCode6 = (hashCode5 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.sca_required;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode6 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37, 37, this.aliases), 37, this.notification_preferences);
        NearbyVisibility nearbyVisibility = this.nearby_visibility;
        int hashCode7 = (m + (nearbyVisibility != null ? nearbyVisibility.hashCode() : 0)) * 37;
        String str4 = this.cashtag;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.cashtag_with_currency_symbol;
        int hashCode9 = (hashCode8 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.cashtag_url;
        int hashCode10 = (hashCode9 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.cashtag_url_display_text;
        int hashCode11 = (hashCode10 + (str7 != null ? str7.hashCode() : 0)) * 37;
        Boolean bool4 = this.cashtag_url_enabled;
        int hashCode12 = (hashCode11 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        String str8 = this.cashtag_qr_image_url;
        int hashCode13 = (hashCode12 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.cashtag_qr_svg_url;
        int hashCode14 = (hashCode13 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.printable_cashtag_qr_image_url;
        int hashCode15 = (hashCode14 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.synopsis;
        int hashCode16 = (hashCode15 + (str11 != null ? str11.hashCode() : 0)) * 37;
        RatePlan ratePlan = this.rate_plan;
        int hashCode17 = (hashCode16 + (ratePlan != null ? ratePlan.hashCode() : 0)) * 37;
        Boolean bool5 = this.can_upgrade_to_business;
        int hashCode18 = (hashCode17 + (bool5 != null ? Boolean.hashCode(bool5.booleanValue()) : 0)) * 37;
        Boolean bool6 = this.is_verified_account;
        int hashCode19 = (hashCode18 + (bool6 != null ? Boolean.hashCode(bool6.booleanValue()) : 0)) * 37;
        Boolean bool7 = this.app_message_notifications_enabled;
        int m2 = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode19 + (bool7 != null ? Boolean.hashCode(bool7.booleanValue()) : 0)) * 37, 37, this.app_message_tokens), 37, this.instruments);
        String str12 = this.verification_instrument_token;
        int hashCode20 = (m2 + (str12 != null ? str12.hashCode() : 0)) * 37;
        DepositPreference depositPreference = this.deposit_preference;
        int hashCode21 = (hashCode20 + (depositPreference != null ? depositPreference.hashCode() : 0)) * 37;
        BalanceData balanceData = this.balance_data;
        int hashCode22 = (hashCode21 + (balanceData != null ? balanceData.hashCode() : 0)) * 37;
        ScenarioPlanMap scenarioPlanMap = this.scenario_plan_map;
        int hashCode23 = (hashCode22 + (scenarioPlanMap != null ? scenarioPlanMap.hashCode() : 0)) * 37;
        Boolean bool8 = this.show_tax_information_link;
        int hashCode24 = (hashCode23 + (bool8 != null ? Boolean.hashCode(bool8.booleanValue()) : 0)) * 37;
        Long l = this.customer_since;
        int hashCode25 = (hashCode24 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        GlobalAddress globalAddress = this.postal_address;
        int hashCode26 = (hashCode25 + (globalAddress != null ? globalAddress.hashCode() : 0)) * 37;
        IssuedCard issuedCard = this.issued_card;
        int hashCode27 = (hashCode26 + (issuedCard != null ? issuedCard.hashCode() : 0)) * 37;
        DepositPreferenceData depositPreferenceData = this.deposit_preference_data;
        int hashCode28 = (hashCode27 + (depositPreferenceData != null ? depositPreferenceData.hashCode() : 0)) * 37;
        Boolean bool9 = this.suppress_review_prompt;
        int hashCode29 = (hashCode28 + (bool9 != null ? Boolean.hashCode(bool9.booleanValue()) : 0)) * 37;
        Integer num = this.require_minimum_initiator_notes_length_for_requests;
        int hashCode30 = (hashCode29 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        CashDrawerData cashDrawerData = this.cash_drawer_data;
        int hashCode31 = (hashCode30 + (cashDrawerData != null ? cashDrawerData.hashCode() : 0)) * 37;
        Boolean bool10 = this.has_passed_idv;
        int hashCode32 = (hashCode31 + (bool10 != null ? Boolean.hashCode(bool10.booleanValue()) : 0)) * 37;
        CurrencyCode currencyCode = this.default_currency;
        int hashCode33 = (hashCode32 + (currencyCode != null ? currencyCode.hashCode() : 0)) * 37;
        Country country = this.country_code;
        int hashCode34 = (hashCode33 + (country != null ? country.hashCode() : 0)) * 37;
        DirectDepositAccount directDepositAccount = this.direct_deposit_account;
        int m3 = Recorder$$ExternalSyntheticOutline2.m((hashCode34 + (directDepositAccount != null ? directDepositAccount.hashCode() : 0)) * 37, 37, this.instrument_linking_options);
        IncomingRequestPolicy incomingRequestPolicy = this.incoming_request_policy;
        int m4 = Recorder$$ExternalSyntheticOutline2.m((m3 + (incomingRequestPolicy != null ? incomingRequestPolicy.hashCode() : 0)) * 37, 37, this.available_p2p_target_regions);
        Region region = this.region;
        int hashCode35 = (m4 + (region != null ? region.hashCode() : 0)) * 37;
        Boolean bool11 = this.direct_deposit_account_enabled;
        int m5 = Recorder$$ExternalSyntheticOutline2.m((hashCode35 + (bool11 != null ? Boolean.hashCode(bool11.booleanValue()) : 0)) * 37, 37, this.pending_instruments);
        BitcoinDisplayUnits bitcoinDisplayUnits = this.bitcoin_display_units;
        int hashCode36 = (m5 + (bitcoinDisplayUnits != null ? bitcoinDisplayUnits.hashCode() : 0)) * 37;
        CardScheme cardScheme = this.card_scheme;
        int hashCode37 = hashCode36 + (cardScheme != null ? cardScheme.hashCode() : 0);
        this.hashCode = hashCode37;
        return hashCode37;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.full_name = this.full_name;
        builder.photo_url = this.photo_url;
        builder.customer_token = this.customer_token;
        builder.require_passcode_confirmation = this.require_passcode_confirmation;
        builder.has_passcode = this.has_passcode;
        builder.sca_required = this.sca_required;
        builder.aliases = this.aliases;
        builder.notification_preferences = this.notification_preferences;
        builder.nearby_visibility = this.nearby_visibility;
        builder.cashtag = this.cashtag;
        builder.cashtag_with_currency_symbol = this.cashtag_with_currency_symbol;
        builder.cashtag_url = this.cashtag_url;
        builder.cashtag_url_display_text = this.cashtag_url_display_text;
        builder.cashtag_url_enabled = this.cashtag_url_enabled;
        builder.cashtag_qr_image_url = this.cashtag_qr_image_url;
        builder.cashtag_qr_svg_url = this.cashtag_qr_svg_url;
        builder.printable_cashtag_qr_image_url = this.printable_cashtag_qr_image_url;
        builder.synopsis = this.synopsis;
        builder.rate_plan = this.rate_plan;
        builder.can_upgrade_to_business = this.can_upgrade_to_business;
        builder.is_verified_account = this.is_verified_account;
        builder.app_message_notifications_enabled = this.app_message_notifications_enabled;
        builder.app_message_tokens = this.app_message_tokens;
        builder.instruments = this.instruments;
        builder.verification_instrument_token = this.verification_instrument_token;
        builder.deposit_preference = this.deposit_preference;
        builder.balance_data = this.balance_data;
        builder.scenario_plan_map = this.scenario_plan_map;
        builder.show_tax_information_link = this.show_tax_information_link;
        builder.customer_since = this.customer_since;
        builder.postal_address = this.postal_address;
        builder.issued_card = this.issued_card;
        builder.deposit_preference_data = this.deposit_preference_data;
        builder.suppress_review_prompt = this.suppress_review_prompt;
        builder.require_minimum_initiator_notes_length_for_requests = this.require_minimum_initiator_notes_length_for_requests;
        builder.cash_drawer_data = this.cash_drawer_data;
        builder.has_passed_idv = this.has_passed_idv;
        builder.default_currency = this.default_currency;
        builder.country_code = this.country_code;
        builder.direct_deposit_account = this.direct_deposit_account;
        builder.instrument_linking_options = this.instrument_linking_options;
        builder.incoming_request_policy = this.incoming_request_policy;
        builder.available_p2p_target_regions = this.available_p2p_target_regions;
        builder.region = this.region;
        builder.direct_deposit_account_enabled = this.direct_deposit_account_enabled;
        builder.pending_instruments = this.pending_instruments;
        builder.bitcoin_display_units = this.bitcoin_display_units;
        builder.card_scheme = this.card_scheme;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.full_name != null) {
            arrayList.add("full_name=██");
        }
        if (this.photo_url != null) {
            arrayList.add("photo_url=██");
        }
        String str = this.customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "customer_token=", arrayList);
        }
        Boolean bool = this.require_passcode_confirmation;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("require_passcode_confirmation=", bool, arrayList);
        }
        Boolean bool2 = this.has_passcode;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_passcode=", bool2, arrayList);
        }
        Boolean bool3 = this.sca_required;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("sca_required=", bool3, arrayList);
        }
        List list = this.aliases;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("aliases=", arrayList, list);
        }
        List list2 = this.notification_preferences;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("notification_preferences=", arrayList, list2);
        }
        NearbyVisibility nearbyVisibility = this.nearby_visibility;
        if (nearbyVisibility != null) {
            arrayList.add("nearby_visibility=" + nearbyVisibility);
        }
        if (this.cashtag != null) {
            arrayList.add("cashtag=██");
        }
        if (this.cashtag_with_currency_symbol != null) {
            arrayList.add("cashtag_with_currency_symbol=██");
        }
        if (this.cashtag_url != null) {
            arrayList.add("cashtag_url=██");
        }
        if (this.cashtag_url_display_text != null) {
            arrayList.add("cashtag_url_display_text=██");
        }
        Boolean bool4 = this.cashtag_url_enabled;
        if (bool4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("cashtag_url_enabled=", bool4, arrayList);
        }
        if (this.cashtag_qr_image_url != null) {
            arrayList.add("cashtag_qr_image_url=██");
        }
        if (this.cashtag_qr_svg_url != null) {
            arrayList.add("cashtag_qr_svg_url=██");
        }
        if (this.printable_cashtag_qr_image_url != null) {
            arrayList.add("printable_cashtag_qr_image_url=██");
        }
        if (this.synopsis != null) {
            arrayList.add("synopsis=██");
        }
        RatePlan ratePlan = this.rate_plan;
        if (ratePlan != null) {
            arrayList.add("rate_plan=" + ratePlan);
        }
        Boolean bool5 = this.can_upgrade_to_business;
        if (bool5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("can_upgrade_to_business=", bool5, arrayList);
        }
        Boolean bool6 = this.is_verified_account;
        if (bool6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_verified_account=", bool6, arrayList);
        }
        Boolean bool7 = this.app_message_notifications_enabled;
        if (bool7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("app_message_notifications_enabled=", bool7, arrayList);
        }
        List list3 = this.app_message_tokens;
        if (!list3.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("app_message_tokens=", arrayList, list3);
        }
        List list4 = this.instruments;
        if (!list4.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("instruments=", arrayList, list4);
        }
        String str2 = this.verification_instrument_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "verification_instrument_token=", arrayList);
        }
        DepositPreference depositPreference = this.deposit_preference;
        if (depositPreference != null) {
            arrayList.add("deposit_preference=" + depositPreference);
        }
        BalanceData balanceData = this.balance_data;
        if (balanceData != null) {
            arrayList.add("balance_data=" + balanceData);
        }
        ScenarioPlanMap scenarioPlanMap = this.scenario_plan_map;
        if (scenarioPlanMap != null) {
            arrayList.add("scenario_plan_map=" + scenarioPlanMap);
        }
        Boolean bool8 = this.show_tax_information_link;
        if (bool8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_tax_information_link=", bool8, arrayList);
        }
        Long l = this.customer_since;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("customer_since=", l, arrayList);
        }
        GlobalAddress globalAddress = this.postal_address;
        if (globalAddress != null) {
            arrayList.add("postal_address=" + globalAddress);
        }
        IssuedCard issuedCard = this.issued_card;
        if (issuedCard != null) {
            arrayList.add("issued_card=" + issuedCard);
        }
        DepositPreferenceData depositPreferenceData = this.deposit_preference_data;
        if (depositPreferenceData != null) {
            arrayList.add("deposit_preference_data=" + depositPreferenceData);
        }
        Boolean bool9 = this.suppress_review_prompt;
        if (bool9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("suppress_review_prompt=", bool9, arrayList);
        }
        Integer num = this.require_minimum_initiator_notes_length_for_requests;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("require_minimum_initiator_notes_length_for_requests=", num, arrayList);
        }
        CashDrawerData cashDrawerData = this.cash_drawer_data;
        if (cashDrawerData != null) {
            arrayList.add("cash_drawer_data=" + cashDrawerData);
        }
        Boolean bool10 = this.has_passed_idv;
        if (bool10 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_passed_idv=", bool10, arrayList);
        }
        CurrencyCode currencyCode = this.default_currency;
        if (currencyCode != null) {
            Matcher$$ExternalSyntheticOutline0.m("default_currency=", currencyCode, arrayList);
        }
        Country country = this.country_code;
        if (country != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("country_code=", country, arrayList);
        }
        DirectDepositAccount directDepositAccount = this.direct_deposit_account;
        if (directDepositAccount != null) {
            arrayList.add("direct_deposit_account=" + directDepositAccount);
        }
        List list5 = this.instrument_linking_options;
        if (!list5.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("instrument_linking_options=", arrayList, list5);
        }
        IncomingRequestPolicy incomingRequestPolicy = this.incoming_request_policy;
        if (incomingRequestPolicy != null) {
            arrayList.add("incoming_request_policy=" + incomingRequestPolicy);
        }
        List list6 = this.available_p2p_target_regions;
        if (!list6.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("available_p2p_target_regions=", arrayList, list6);
        }
        Region region = this.region;
        if (region != null) {
            arrayList.add("region=" + region);
        }
        Boolean bool11 = this.direct_deposit_account_enabled;
        if (bool11 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("direct_deposit_account_enabled=", bool11, arrayList);
        }
        List list7 = this.pending_instruments;
        if (!list7.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("pending_instruments=", arrayList, list7);
        }
        BitcoinDisplayUnits bitcoinDisplayUnits = this.bitcoin_display_units;
        if (bitcoinDisplayUnits != null) {
            arrayList.add("bitcoin_display_units=" + bitcoinDisplayUnits);
        }
        CardScheme cardScheme = this.card_scheme;
        if (cardScheme != null) {
            arrayList.add("card_scheme=" + cardScheme);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Profile{", "}", 0, null, null, 56);
    }
}
