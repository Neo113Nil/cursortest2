package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.banklin.card_activation.CardActivationRiskResult;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.cards.TouchData;
import com.squareup.protos.franklin.common.IssuedCard;
import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.protos.wire.roster.mds.Unit;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class IssuedCard extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<IssuedCard> CREATOR;
    public final Boolean activated;
    public final String apple_pay_description;
    public final String apple_pay_identifier;
    public final List apple_pay_identifiers;
    public final CardActivationRiskResult card_activation_risk_result;
    public final String card_status_text;
    public final CardTheme card_theme;
    public final String cardholder_name;
    public final Boolean dimmed;
    public final Boolean enabled;
    public final String expiration;
    public final InstrumentType instrument_type;
    public final Long issued_at;
    public final Issuer issuer;
    public final String last_four;
    public final LocalizableString localizable_card_status_text;
    public final Boolean locked;
    public final String pan;
    public final PhysicalCardData physical_card_data;
    public final String security_code;
    public final Boolean sponsor_locked;
    public final Boolean sponsored;
    public final String token;
    public final TouchData touch_data;
    public final String version_token;
    public final Boolean virtual;

    /* loaded from: classes8.dex */
    public enum Issuer implements WireEnum {
        SHAZAM(1),
        MARQETA(2),
        VISA_DPS(3);

        public final int value;
        public static final LinkResult.Companion Companion = new LinkResult.Companion();
        public static final IssuedCard$Issuer$Companion$ADAPTER$1 ADAPTER = new IssuedCard$Issuer$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Issuer.class), Syntax.PROTO_2, null);

        Issuer(int i) {
            this.value = i;
        }

        public static final Issuer fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return SHAZAM;
            }
            if (i == 2) {
                return MARQETA;
            }
            if (i != 3) {
                return null;
            }
            return VISA_DPS;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(IssuedCard.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.common.IssuedCard$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v33, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v39, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v45, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v61 */
            /* JADX WARN: Type inference failed for: r0v66 */
            /* JADX WARN: Type inference failed for: r0v67 */
            /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                InstrumentType instrumentType;
                String str;
                Boolean bool;
                ?? decode;
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                String str2 = null;
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                InstrumentType instrumentType2 = null;
                String str3 = null;
                Boolean bool2 = null;
                Boolean bool3 = null;
                Boolean bool4 = null;
                Boolean bool5 = null;
                String str4 = null;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                Boolean bool6 = null;
                String str8 = null;
                String str9 = null;
                Boolean bool7 = null;
                Boolean bool8 = null;
                IssuedCard.Issuer issuer = null;
                Long l = null;
                String str10 = null;
                CardActivationRiskResult cardActivationRiskResult = null;
                String str11 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new IssuedCard(str2, str7, str9, str10, str11, instrumentType2, str3, bool2, bool3, bool4, bool5, str4, str5, str6, (PhysicalCardData) obj, (CardTheme) obj2, bool6, str8, (LocalizableString) obj3, bool7, bool8, issuer, l, (TouchData) obj4, m, cardActivationRiskResult, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            decode = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            str7 = ProtoAdapter.STRING.decode(protoReader);
                            decode = str2;
                            break;
                        case 3:
                            str9 = ProtoAdapter.STRING.decode(protoReader);
                            decode = str2;
                            break;
                        case 4:
                            str10 = ProtoAdapter.STRING.decode(protoReader);
                            decode = str2;
                            break;
                        case 5:
                            str11 = ProtoAdapter.STRING.decode(protoReader);
                            decode = str2;
                            break;
                        case 6:
                            instrumentType = instrumentType2;
                            str = str3;
                            bool = bool2;
                            try {
                                instrumentType2 = InstrumentType.ADAPTER.decode(protoReader);
                                str3 = str;
                                bool2 = bool;
                                decode = str2;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 7:
                            str3 = ProtoAdapter.STRING.decode(protoReader);
                            decode = str2;
                            break;
                        case 8:
                            bool3 = ProtoAdapter.BOOL.decode(protoReader);
                            decode = str2;
                            break;
                        case 9:
                            bool4 = ProtoAdapter.BOOL.decode(protoReader);
                            decode = str2;
                            break;
                        case 10:
                            bool5 = ProtoAdapter.BOOL.decode(protoReader);
                            decode = str2;
                            break;
                        case 11:
                            str4 = ProtoAdapter.STRING.decode(protoReader);
                            decode = str2;
                            break;
                        case 12:
                            str5 = ProtoAdapter.STRING.decode(protoReader);
                            decode = str2;
                            break;
                        case 13:
                            str6 = ProtoAdapter.STRING.decode(protoReader);
                            decode = str2;
                            break;
                        case 14:
                            bool2 = ProtoAdapter.BOOL.decode(protoReader);
                            decode = str2;
                            break;
                        case 15:
                            obj = TransactorKt.decodeMessageOrMerge(PhysicalCardData.ADAPTER, protoReader, obj);
                            decode = str2;
                            break;
                        case 16:
                        case 18:
                        default:
                            protoReader.readUnknownField(nextTag);
                            instrumentType = instrumentType2;
                            str = str3;
                            bool = bool2;
                            decode = str2;
                            instrumentType2 = instrumentType;
                            str3 = str;
                            bool2 = bool;
                            break;
                        case 17:
                            obj2 = TransactorKt.decodeMessageOrMerge(CardTheme.ADAPTER, protoReader, obj2);
                            decode = str2;
                            break;
                        case 19:
                            bool6 = ProtoAdapter.BOOL.decode(protoReader);
                            decode = str2;
                            break;
                        case 20:
                            str8 = ProtoAdapter.STRING.decode(protoReader);
                            decode = str2;
                            break;
                        case 21:
                            bool7 = ProtoAdapter.BOOL.decode(protoReader);
                            decode = str2;
                            break;
                        case 22:
                            bool8 = ProtoAdapter.BOOL.decode(protoReader);
                            decode = str2;
                            break;
                        case 23:
                            instrumentType = instrumentType2;
                            str = str3;
                            bool = bool2;
                            try {
                                issuer = IssuedCard.Issuer.ADAPTER.decode(protoReader);
                                instrumentType2 = instrumentType;
                                str3 = str;
                                bool2 = bool;
                                decode = str2;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 24:
                            l = ProtoAdapter.INT64.decode(protoReader);
                            decode = str2;
                            break;
                        case 25:
                            obj4 = TransactorKt.decodeMessageOrMerge(TouchData.ADAPTER, protoReader, obj4);
                            decode = str2;
                            break;
                        case 26:
                            obj3 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, protoReader, obj3);
                            decode = str2;
                            break;
                        case 27:
                            instrumentType = instrumentType2;
                            str = str3;
                            bool = bool2;
                            m.add(ProtoAdapter.STRING.decode(protoReader));
                            decode = str2;
                            instrumentType2 = instrumentType;
                            str3 = str;
                            bool2 = bool;
                            break;
                        case 28:
                            try {
                                cardActivationRiskResult = CardActivationRiskResult.ADAPTER.decode(protoReader);
                                decode = str2;
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                instrumentType = instrumentType2;
                                str = str3;
                                bool = bool2;
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                break;
                            }
                    }
                    str2 = decode;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                IssuedCard issuedCard = (IssuedCard) obj;
                reverseProtoWriter.getClass();
                issuedCard.getClass();
                reverseProtoWriter.writeBytes(issuedCard.unknownFields());
                CardActivationRiskResult.ADAPTER.encodeWithTag(reverseProtoWriter, 28, issuedCard.card_activation_risk_result);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 27, issuedCard.apple_pay_identifiers);
                TouchData.ADAPTER.encodeWithTag(reverseProtoWriter, 25, issuedCard.touch_data);
                ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 24, issuedCard.issued_at);
                IssuedCard.Issuer.ADAPTER.encodeWithTag(reverseProtoWriter, 23, issuedCard.issuer);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(reverseProtoWriter, 22, issuedCard.sponsor_locked);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 21, issuedCard.dimmed);
                LocalizableString.ADAPTER.encodeWithTag(reverseProtoWriter, 26, issuedCard.localizable_card_status_text);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 20, issuedCard.card_status_text);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 19, issuedCard.sponsored);
                CardTheme.ADAPTER.encodeWithTag(reverseProtoWriter, 17, issuedCard.card_theme);
                PhysicalCardData.ADAPTER.encodeWithTag(reverseProtoWriter, 15, issuedCard.physical_card_data);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 13, issuedCard.version_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 12, issuedCard.apple_pay_description);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 11, issuedCard.apple_pay_identifier);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 10, issuedCard.locked);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 9, issuedCard.virtual);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 8, issuedCard.enabled);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 14, issuedCard.activated);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 7, issuedCard.cardholder_name);
                InstrumentType.ADAPTER.encodeWithTag(reverseProtoWriter, 6, issuedCard.instrument_type);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, issuedCard.last_four);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, issuedCard.security_code);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, issuedCard.expiration);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, issuedCard.pan);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, issuedCard.token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                IssuedCard issuedCard = (IssuedCard) obj;
                issuedCard.getClass();
                int size$okio = issuedCard.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(7, issuedCard.cardholder_name) + InstrumentType.ADAPTER.encodedSizeWithTag(6, issuedCard.instrument_type) + protoAdapter2.encodedSizeWithTag(5, issuedCard.last_four) + protoAdapter2.encodedSizeWithTag(4, issuedCard.security_code) + protoAdapter2.encodedSizeWithTag(3, issuedCard.expiration) + protoAdapter2.encodedSizeWithTag(2, issuedCard.pan) + protoAdapter2.encodedSizeWithTag(1, issuedCard.token) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                return CardActivationRiskResult.ADAPTER.encodedSizeWithTag(28, issuedCard.card_activation_risk_result) + protoAdapter2.asRepeated().encodedSizeWithTag(27, issuedCard.apple_pay_identifiers) + TouchData.ADAPTER.encodedSizeWithTag(25, issuedCard.touch_data) + ProtoAdapter.INT64.encodedSizeWithTag(24, issuedCard.issued_at) + IssuedCard.Issuer.ADAPTER.encodedSizeWithTag(23, issuedCard.issuer) + protoAdapter3.encodedSizeWithTag(22, issuedCard.sponsor_locked) + protoAdapter3.encodedSizeWithTag(21, issuedCard.dimmed) + LocalizableString.ADAPTER.encodedSizeWithTag(26, issuedCard.localizable_card_status_text) + protoAdapter2.encodedSizeWithTag(20, issuedCard.card_status_text) + protoAdapter3.encodedSizeWithTag(19, issuedCard.sponsored) + CardTheme.ADAPTER.encodedSizeWithTag(17, issuedCard.card_theme) + PhysicalCardData.ADAPTER.encodedSizeWithTag(15, issuedCard.physical_card_data) + protoAdapter2.encodedSizeWithTag(13, issuedCard.version_token) + protoAdapter2.encodedSizeWithTag(12, issuedCard.apple_pay_description) + protoAdapter2.encodedSizeWithTag(11, issuedCard.apple_pay_identifier) + protoAdapter3.encodedSizeWithTag(10, issuedCard.locked) + protoAdapter3.encodedSizeWithTag(9, issuedCard.virtual) + protoAdapter3.encodedSizeWithTag(8, issuedCard.enabled) + protoAdapter3.encodedSizeWithTag(14, issuedCard.activated) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                IssuedCard issuedCard = (IssuedCard) obj;
                issuedCard.getClass();
                PhysicalCardData physicalCardData = issuedCard.physical_card_data;
                PhysicalCardData physicalCardData2 = physicalCardData != null ? (PhysicalCardData) PhysicalCardData.ADAPTER.redact(physicalCardData) : null;
                CardTheme cardTheme = issuedCard.card_theme;
                CardTheme cardTheme2 = cardTheme != null ? (CardTheme) CardTheme.ADAPTER.redact(cardTheme) : null;
                LocalizableString localizableString = issuedCard.localizable_card_status_text;
                LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
                TouchData touchData = issuedCard.touch_data;
                TouchData touchData2 = touchData != null ? (TouchData) TouchData.ADAPTER.redact(touchData) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = issuedCard.token;
                String str2 = issuedCard.last_four;
                InstrumentType instrumentType = issuedCard.instrument_type;
                Boolean bool = issuedCard.activated;
                Boolean bool2 = issuedCard.enabled;
                Boolean bool3 = issuedCard.virtual;
                Boolean bool4 = issuedCard.locked;
                String str3 = issuedCard.apple_pay_identifier;
                String str4 = issuedCard.apple_pay_description;
                String str5 = issuedCard.version_token;
                Boolean bool5 = issuedCard.sponsored;
                String str6 = issuedCard.card_status_text;
                Boolean bool6 = issuedCard.dimmed;
                Boolean bool7 = issuedCard.sponsor_locked;
                IssuedCard.Issuer issuer = issuedCard.issuer;
                Long l = issuedCard.issued_at;
                List list = issuedCard.apple_pay_identifiers;
                CardActivationRiskResult cardActivationRiskResult = issuedCard.card_activation_risk_result;
                list.getClass();
                byteString.getClass();
                return new IssuedCard(str, null, null, null, str2, instrumentType, null, bool, bool2, bool3, bool4, str3, str4, str5, physicalCardData2, cardTheme2, bool5, str6, localizableString2, bool6, bool7, issuer, l, touchData2, list, cardActivationRiskResult, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                IssuedCard issuedCard = (IssuedCard) obj;
                issuedCard.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, issuedCard.token);
                protoAdapter2.encodeWithTag(protoWriter, 2, issuedCard.pan);
                protoAdapter2.encodeWithTag(protoWriter, 3, issuedCard.expiration);
                protoAdapter2.encodeWithTag(protoWriter, 4, issuedCard.security_code);
                protoAdapter2.encodeWithTag(protoWriter, 5, issuedCard.last_four);
                InstrumentType.ADAPTER.encodeWithTag(protoWriter, 6, issuedCard.instrument_type);
                protoAdapter2.encodeWithTag(protoWriter, 7, issuedCard.cardholder_name);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(protoWriter, 14, issuedCard.activated);
                protoAdapter3.encodeWithTag(protoWriter, 8, issuedCard.enabled);
                protoAdapter3.encodeWithTag(protoWriter, 9, issuedCard.virtual);
                protoAdapter3.encodeWithTag(protoWriter, 10, issuedCard.locked);
                protoAdapter2.encodeWithTag(protoWriter, 11, issuedCard.apple_pay_identifier);
                protoAdapter2.encodeWithTag(protoWriter, 12, issuedCard.apple_pay_description);
                protoAdapter2.encodeWithTag(protoWriter, 13, issuedCard.version_token);
                PhysicalCardData.ADAPTER.encodeWithTag(protoWriter, 15, issuedCard.physical_card_data);
                CardTheme.ADAPTER.encodeWithTag(protoWriter, 17, issuedCard.card_theme);
                protoAdapter3.encodeWithTag(protoWriter, 19, issuedCard.sponsored);
                protoAdapter2.encodeWithTag(protoWriter, 20, issuedCard.card_status_text);
                LocalizableString.ADAPTER.encodeWithTag(protoWriter, 26, issuedCard.localizable_card_status_text);
                protoAdapter3.encodeWithTag(protoWriter, 21, issuedCard.dimmed);
                protoAdapter3.encodeWithTag(protoWriter, 22, issuedCard.sponsor_locked);
                IssuedCard.Issuer.ADAPTER.encodeWithTag(protoWriter, 23, issuedCard.issuer);
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 24, issuedCard.issued_at);
                TouchData.ADAPTER.encodeWithTag(protoWriter, 25, issuedCard.touch_data);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 27, issuedCard.apple_pay_identifiers);
                CardActivationRiskResult.ADAPTER.encodeWithTag(protoWriter, 28, issuedCard.card_activation_risk_result);
                protoWriter.writeBytes(issuedCard.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IssuedCard(String str, String str2, String str3, String str4, String str5, InstrumentType instrumentType, String str6, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str7, String str8, String str9, PhysicalCardData physicalCardData, CardTheme cardTheme, Boolean bool5, String str10, LocalizableString localizableString, Boolean bool6, Boolean bool7, Issuer issuer, Long l, TouchData touchData, List list, CardActivationRiskResult cardActivationRiskResult, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.token = str;
        this.pan = str2;
        this.expiration = str3;
        this.security_code = str4;
        this.last_four = str5;
        this.instrument_type = instrumentType;
        this.cardholder_name = str6;
        this.activated = bool;
        this.enabled = bool2;
        this.virtual = bool3;
        this.locked = bool4;
        this.apple_pay_identifier = str7;
        this.apple_pay_description = str8;
        this.version_token = str9;
        this.physical_card_data = physicalCardData;
        this.card_theme = cardTheme;
        this.sponsored = bool5;
        this.card_status_text = str10;
        this.localizable_card_status_text = localizableString;
        this.dimmed = bool6;
        this.sponsor_locked = bool7;
        this.issuer = issuer;
        this.issued_at = l;
        this.touch_data = touchData;
        this.card_activation_risk_result = cardActivationRiskResult;
        this.apple_pay_identifiers = TransactorKt.immutableCopyOf("apple_pay_identifiers", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IssuedCard)) {
            return false;
        }
        IssuedCard issuedCard = (IssuedCard) obj;
        return Intrinsics.areEqual(unknownFields(), issuedCard.unknownFields()) && Intrinsics.areEqual(this.token, issuedCard.token) && Intrinsics.areEqual(this.pan, issuedCard.pan) && Intrinsics.areEqual(this.expiration, issuedCard.expiration) && Intrinsics.areEqual(this.security_code, issuedCard.security_code) && Intrinsics.areEqual(this.last_four, issuedCard.last_four) && this.instrument_type == issuedCard.instrument_type && Intrinsics.areEqual(this.cardholder_name, issuedCard.cardholder_name) && Intrinsics.areEqual(this.activated, issuedCard.activated) && Intrinsics.areEqual(this.enabled, issuedCard.enabled) && Intrinsics.areEqual(this.virtual, issuedCard.virtual) && Intrinsics.areEqual(this.locked, issuedCard.locked) && Intrinsics.areEqual(this.apple_pay_identifier, issuedCard.apple_pay_identifier) && Intrinsics.areEqual(this.apple_pay_description, issuedCard.apple_pay_description) && Intrinsics.areEqual(this.version_token, issuedCard.version_token) && Intrinsics.areEqual(this.physical_card_data, issuedCard.physical_card_data) && Intrinsics.areEqual(this.card_theme, issuedCard.card_theme) && Intrinsics.areEqual(this.sponsored, issuedCard.sponsored) && Intrinsics.areEqual(this.card_status_text, issuedCard.card_status_text) && Intrinsics.areEqual(this.localizable_card_status_text, issuedCard.localizable_card_status_text) && Intrinsics.areEqual(this.dimmed, issuedCard.dimmed) && Intrinsics.areEqual(this.sponsor_locked, issuedCard.sponsor_locked) && this.issuer == issuedCard.issuer && Intrinsics.areEqual(this.issued_at, issuedCard.issued_at) && Intrinsics.areEqual(this.touch_data, issuedCard.touch_data) && Intrinsics.areEqual(this.apple_pay_identifiers, issuedCard.apple_pay_identifiers) && this.card_activation_risk_result == issuedCard.card_activation_risk_result;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.pan;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.expiration;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.security_code;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.last_four;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        InstrumentType instrumentType = this.instrument_type;
        int hashCode7 = (hashCode6 + (instrumentType != null ? instrumentType.hashCode() : 0)) * 37;
        String str6 = this.cardholder_name;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Boolean bool = this.activated;
        int hashCode9 = (hashCode8 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.enabled;
        int hashCode10 = (hashCode9 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.virtual;
        int hashCode11 = (hashCode10 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        Boolean bool4 = this.locked;
        int hashCode12 = (hashCode11 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        String str7 = this.apple_pay_identifier;
        int hashCode13 = (hashCode12 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.apple_pay_description;
        int hashCode14 = (hashCode13 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.version_token;
        int hashCode15 = (hashCode14 + (str9 != null ? str9.hashCode() : 0)) * 37;
        PhysicalCardData physicalCardData = this.physical_card_data;
        int hashCode16 = (hashCode15 + (physicalCardData != null ? physicalCardData.hashCode() : 0)) * 37;
        CardTheme cardTheme = this.card_theme;
        int hashCode17 = (hashCode16 + (cardTheme != null ? cardTheme.hashCode() : 0)) * 37;
        Boolean bool5 = this.sponsored;
        int hashCode18 = (hashCode17 + (bool5 != null ? Boolean.hashCode(bool5.booleanValue()) : 0)) * 37;
        String str10 = this.card_status_text;
        int hashCode19 = (hashCode18 + (str10 != null ? str10.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_card_status_text;
        int hashCode20 = (hashCode19 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
        Boolean bool6 = this.dimmed;
        int hashCode21 = (hashCode20 + (bool6 != null ? Boolean.hashCode(bool6.booleanValue()) : 0)) * 37;
        Boolean bool7 = this.sponsor_locked;
        int hashCode22 = (hashCode21 + (bool7 != null ? Boolean.hashCode(bool7.booleanValue()) : 0)) * 37;
        Issuer issuer = this.issuer;
        int hashCode23 = (hashCode22 + (issuer != null ? issuer.hashCode() : 0)) * 37;
        Long l = this.issued_at;
        int hashCode24 = (hashCode23 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        TouchData touchData = this.touch_data;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode24 + (touchData != null ? touchData.hashCode() : 0)) * 37, 37, this.apple_pay_identifiers);
        CardActivationRiskResult cardActivationRiskResult = this.card_activation_risk_result;
        int hashCode25 = m + (cardActivationRiskResult != null ? cardActivationRiskResult.hashCode() : 0);
        this.hashCode = hashCode25;
        return hashCode25;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Unit.Builder builder = new Unit.Builder(1);
        builder.token = this.token;
        builder.merchant_token = this.pan;
        builder.nickname = this.expiration;
        builder.business_type = this.security_code;
        builder.mcc = this.last_four;
        builder.created_ts = this.instrument_type;
        builder.time_zone = this.cardholder_name;
        builder.frozen = this.activated;
        builder.has_no_automatic_point_of_sale_image = this.enabled;
        builder.updated_ts = this.virtual;
        builder.unit_id = this.locked;
        builder.legal_entity_token = this.apple_pay_identifier;
        builder.merchant = this.apple_pay_description;
        builder.name = this.version_token;
        builder.currency_code = this.physical_card_data;
        builder.images = this.card_theme;
        builder.contact_methods = this.sponsored;
        builder.locale = this.card_status_text;
        builder.status = this.localizable_card_status_text;
        builder.business_ids = this.dimmed;
        builder.capabilities = this.sponsor_locked;
        builder.business_hours = this.issuer;
        builder.version = this.issued_at;
        builder.special_hours = this.touch_data;
        builder.addresses = this.apple_pay_identifiers;
        builder.business_unit = this.card_activation_risk_result;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        if (this.pan != null) {
            arrayList.add("pan=██");
        }
        if (this.expiration != null) {
            arrayList.add("expiration=██");
        }
        if (this.security_code != null) {
            arrayList.add("security_code=██");
        }
        String str2 = this.last_four;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "last_four=", arrayList);
        }
        InstrumentType instrumentType = this.instrument_type;
        if (instrumentType != null) {
            arrayList.add("instrument_type=" + instrumentType);
        }
        if (this.cardholder_name != null) {
            arrayList.add("cardholder_name=██");
        }
        Boolean bool = this.activated;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("activated=", bool, arrayList);
        }
        Boolean bool2 = this.enabled;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("enabled=", bool2, arrayList);
        }
        Boolean bool3 = this.virtual;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("virtual=", bool3, arrayList);
        }
        Boolean bool4 = this.locked;
        if (bool4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("locked=", bool4, arrayList);
        }
        String str3 = this.apple_pay_identifier;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "apple_pay_identifier=", arrayList);
        }
        String str4 = this.apple_pay_description;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "apple_pay_description=", arrayList);
        }
        String str5 = this.version_token;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "version_token=", arrayList);
        }
        PhysicalCardData physicalCardData = this.physical_card_data;
        if (physicalCardData != null) {
            arrayList.add("physical_card_data=" + physicalCardData);
        }
        CardTheme cardTheme = this.card_theme;
        if (cardTheme != null) {
            arrayList.add("card_theme=" + cardTheme);
        }
        Boolean bool5 = this.sponsored;
        if (bool5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("sponsored=", bool5, arrayList);
        }
        String str6 = this.card_status_text;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "card_status_text=", arrayList);
        }
        LocalizableString localizableString = this.localizable_card_status_text;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_card_status_text=", localizableString, arrayList);
        }
        Boolean bool6 = this.dimmed;
        if (bool6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("dimmed=", bool6, arrayList);
        }
        Boolean bool7 = this.sponsor_locked;
        if (bool7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("sponsor_locked=", bool7, arrayList);
        }
        Issuer issuer = this.issuer;
        if (issuer != null) {
            arrayList.add("issuer=" + issuer);
        }
        Long l = this.issued_at;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("issued_at=", l, arrayList);
        }
        TouchData touchData = this.touch_data;
        if (touchData != null) {
            arrayList.add("touch_data=" + touchData);
        }
        List list = this.apple_pay_identifiers;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("apple_pay_identifiers=", arrayList, list);
        }
        CardActivationRiskResult cardActivationRiskResult = this.card_activation_risk_result;
        if (cardActivationRiskResult != null) {
            arrayList.add("card_activation_risk_result=" + cardActivationRiskResult);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IssuedCard{", "}", 0, null, null, 56);
    }
}
