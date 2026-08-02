package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001cR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/squareup/protos/franklin/api/AuthorizeDigitalWalletPaymentBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/AuthorizeDigitalWalletPaymentBlocker$Builder;", "Lcom/squareup/protos/common/countries/Country;", "allowable_issuer_countries", "Lcom/squareup/protos/common/countries/Country;", "Lcom/squareup/protos/common/Money;", "authorization_amount", "Lcom/squareup/protos/common/Money;", "", "disclaimer_text", "Ljava/lang/String;", "", "require_payer_name", "Ljava/lang/Boolean;", "require_payer_email", "require_payer_phone", "require_billing_address", "require_shipping_address", "title", "subtitle", "processing_fee", "", "Lcom/squareup/protos/franklin/api/CashInstrumentType;", "supported_cash_instrument_types", "Ljava/util/List;", "Lcom/squareup/protos/common/instrument/InstrumentType;", "card_brand_types", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AuthorizeDigitalWalletPaymentBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AuthorizeDigitalWalletPaymentBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.common.countries.Country#ADAPTER", schemaIndex = 1, tag = 2)
    public final Country allowable_issuer_countries;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 3, tag = 4)
    public final Money authorization_amount;

    @WireField(adapter = "com.squareup.protos.common.instrument.InstrumentType#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<InstrumentType> card_brand_types;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String disclaimer_text;

    @WireField(adapter = "com.squareup.protos.common.Money#ADAPTER", schemaIndex = 12, tag = 13)
    public final Money processing_fee;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 8, tag = 9)
    public final Boolean require_billing_address;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 6, tag = 7)
    public final Boolean require_payer_email;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 5, tag = 6)
    public final Boolean require_payer_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 7, tag = 8)
    public final Boolean require_payer_phone;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 9, tag = 10)
    public final Boolean require_shipping_address;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 11, tag = 12)
    public final String subtitle;

    @WireField(adapter = "com.squareup.protos.franklin.api.CashInstrumentType#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<CashInstrumentType> supported_cash_instrument_types;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 10, tag = 11)
    public final String title;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0014\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u001aJ\u0015\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u001aJ\u0015\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u001aJ\u0015\u0010\u0015\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u001aJ\u0015\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u0017\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\rJ\b\u0010\u001b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u0014\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/squareup/protos/franklin/api/AuthorizeDigitalWalletPaymentBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/AuthorizeDigitalWalletPaymentBlocker;", "<init>", "()V", "supported_cash_instrument_types", "", "Lcom/squareup/protos/franklin/api/CashInstrumentType;", "allowable_issuer_countries", "Lcom/squareup/protos/common/countries/Country;", "card_brand_types", "Lcom/squareup/protos/common/instrument/InstrumentType;", "authorization_amount", "Lcom/squareup/protos/common/Money;", "disclaimer_text", "", "require_payer_name", "", "Ljava/lang/Boolean;", "require_payer_email", "require_payer_phone", "require_billing_address", "require_shipping_address", "title", "subtitle", "processing_fee", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/AuthorizeDigitalWalletPaymentBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public Country allowable_issuer_countries;
        public Money authorization_amount;
        public List<? extends InstrumentType> card_brand_types;
        public String disclaimer_text;
        public Money processing_fee;
        public Boolean require_billing_address;
        public Boolean require_payer_email;
        public Boolean require_payer_name;
        public Boolean require_payer_phone;
        public Boolean require_shipping_address;
        public String subtitle;
        public List<? extends CashInstrumentType> supported_cash_instrument_types;
        public String title;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.supported_cash_instrument_types = emptyList;
            this.card_brand_types = emptyList;
        }

        public final Builder allowable_issuer_countries(Country allowable_issuer_countries) {
            this.allowable_issuer_countries = allowable_issuer_countries;
            return this;
        }

        public final Builder authorization_amount(Money authorization_amount) {
            this.authorization_amount = authorization_amount;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public AuthorizeDigitalWalletPaymentBlocker build() {
            return new AuthorizeDigitalWalletPaymentBlocker(this.supported_cash_instrument_types, this.allowable_issuer_countries, this.card_brand_types, this.authorization_amount, this.disclaimer_text, this.require_payer_name, this.require_payer_email, this.require_payer_phone, this.require_billing_address, this.require_shipping_address, this.title, this.subtitle, this.processing_fee, buildUnknownFields());
        }

        public final Builder card_brand_types(List<? extends InstrumentType> card_brand_types) {
            card_brand_types.getClass();
            TransactorKt.checkElementsNotNull(card_brand_types);
            this.card_brand_types = card_brand_types;
            return this;
        }

        public final Builder disclaimer_text(String disclaimer_text) {
            this.disclaimer_text = disclaimer_text;
            return this;
        }

        public final Builder processing_fee(Money processing_fee) {
            this.processing_fee = processing_fee;
            return this;
        }

        public final Builder require_billing_address(Boolean require_billing_address) {
            this.require_billing_address = require_billing_address;
            return this;
        }

        public final Builder require_payer_email(Boolean require_payer_email) {
            this.require_payer_email = require_payer_email;
            return this;
        }

        public final Builder require_payer_name(Boolean require_payer_name) {
            this.require_payer_name = require_payer_name;
            return this;
        }

        public final Builder require_payer_phone(Boolean require_payer_phone) {
            this.require_payer_phone = require_payer_phone;
            return this;
        }

        public final Builder require_shipping_address(Boolean require_shipping_address) {
            this.require_shipping_address = require_shipping_address;
            return this;
        }

        public final Builder subtitle(String subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        public final Builder supported_cash_instrument_types(List<? extends CashInstrumentType> supported_cash_instrument_types) {
            supported_cash_instrument_types.getClass();
            TransactorKt.checkElementsNotNull(supported_cash_instrument_types);
            this.supported_cash_instrument_types = supported_cash_instrument_types;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AuthorizeDigitalWalletPaymentBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.AuthorizeDigitalWalletPaymentBlocker$Companion$ADAPTER$1
            /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0025. Please report as an issue. */
            @Override // com.squareup.wire.ProtoAdapter
            public AuthorizeDigitalWalletPaymentBlocker decode(ProtoReader reader) {
                ArrayList arrayList;
                Object obj;
                Object obj2;
                Object obj3;
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                ArrayList arrayList2 = new ArrayList();
                long beginMessage = reader.beginMessage();
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                Object obj10 = null;
                Object obj11 = null;
                Object obj12 = null;
                Object obj13 = null;
                Object obj14 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new AuthorizeDigitalWalletPaymentBlocker(m, (Country) obj4, arrayList2, (Money) obj6, (String) obj14, (Boolean) obj7, (Boolean) obj8, (Boolean) obj9, (Boolean) obj10, (Boolean) obj11, (String) obj12, (String) obj13, (Money) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            arrayList = arrayList2;
                            obj = obj5;
                            obj2 = obj6;
                            try {
                                CashInstrumentType.ADAPTER.tryDecode(reader, m);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                            obj3 = obj4;
                            obj5 = obj;
                            obj6 = obj2;
                            break;
                        case 2:
                            arrayList = arrayList2;
                            obj = obj5;
                            obj2 = obj6;
                            try {
                                obj3 = Country.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                            obj5 = obj;
                            obj6 = obj2;
                            break;
                        case 3:
                            try {
                                InstrumentType.ADAPTER.tryDecode(reader, arrayList2);
                                arrayList = arrayList2;
                                obj = obj5;
                                obj2 = obj6;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                arrayList = arrayList2;
                                obj = obj5;
                                obj2 = obj6;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                            }
                            obj3 = obj4;
                            obj5 = obj;
                            obj6 = obj2;
                            break;
                        case 4:
                            obj6 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj6);
                            arrayList = arrayList2;
                            obj3 = obj4;
                            break;
                        case 5:
                            obj14 = ProtoAdapter.STRING.decode(reader);
                            arrayList = arrayList2;
                            obj3 = obj4;
                            break;
                        case 6:
                            obj7 = ProtoAdapter.BOOL.decode(reader);
                            arrayList = arrayList2;
                            obj3 = obj4;
                            break;
                        case 7:
                            obj8 = ProtoAdapter.BOOL.decode(reader);
                            arrayList = arrayList2;
                            obj3 = obj4;
                            break;
                        case 8:
                            obj9 = ProtoAdapter.BOOL.decode(reader);
                            arrayList = arrayList2;
                            obj3 = obj4;
                            break;
                        case 9:
                            obj10 = ProtoAdapter.BOOL.decode(reader);
                            arrayList = arrayList2;
                            obj3 = obj4;
                            break;
                        case 10:
                            obj11 = ProtoAdapter.BOOL.decode(reader);
                            arrayList = arrayList2;
                            obj3 = obj4;
                            break;
                        case 11:
                            obj12 = ProtoAdapter.STRING.decode(reader);
                            arrayList = arrayList2;
                            obj3 = obj4;
                            break;
                        case 12:
                            obj13 = ProtoAdapter.STRING.decode(reader);
                            arrayList = arrayList2;
                            obj3 = obj4;
                            break;
                        case 13:
                            obj5 = TransactorKt.decodeMessageOrMerge(Money.ADAPTER, reader, obj5);
                            arrayList = arrayList2;
                            obj3 = obj4;
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            arrayList = arrayList2;
                            obj = obj5;
                            obj2 = obj6;
                            obj3 = obj4;
                            obj5 = obj;
                            obj6 = obj2;
                            break;
                    }
                    obj4 = obj3;
                    arrayList2 = arrayList;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AuthorizeDigitalWalletPaymentBlocker value) {
                writer.getClass();
                value.getClass();
                CashInstrumentType.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.supported_cash_instrument_types);
                Country.ADAPTER.encodeWithTag(writer, 2, value.allowable_issuer_countries);
                InstrumentType.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.card_brand_types);
                ProtoAdapter protoAdapter2 = Money.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 4, value.authorization_amount);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 5, value.disclaimer_text);
                ProtoAdapter protoAdapter4 = ProtoAdapter.BOOL;
                protoAdapter4.encodeWithTag(writer, 6, value.require_payer_name);
                protoAdapter4.encodeWithTag(writer, 7, value.require_payer_email);
                protoAdapter4.encodeWithTag(writer, 8, value.require_payer_phone);
                protoAdapter4.encodeWithTag(writer, 9, value.require_billing_address);
                protoAdapter4.encodeWithTag(writer, 10, value.require_shipping_address);
                protoAdapter3.encodeWithTag(writer, 11, value.title);
                protoAdapter3.encodeWithTag(writer, 12, value.subtitle);
                protoAdapter2.encodeWithTag(writer, 13, value.processing_fee);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AuthorizeDigitalWalletPaymentBlocker value) {
                value.getClass();
                int encodedSizeWithTag = InstrumentType.ADAPTER.asRepeated().encodedSizeWithTag(3, value.card_brand_types) + Country.ADAPTER.encodedSizeWithTag(2, value.allowable_issuer_countries) + CashInstrumentType.ADAPTER.asRepeated().encodedSizeWithTag(1, value.supported_cash_instrument_types) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = Money.ADAPTER;
                int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(4, value.authorization_amount) + encodedSizeWithTag;
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                int encodedSizeWithTag3 = protoAdapter3.encodedSizeWithTag(5, value.disclaimer_text) + encodedSizeWithTag2;
                ProtoAdapter protoAdapter4 = ProtoAdapter.BOOL;
                return protoAdapter2.encodedSizeWithTag(13, value.processing_fee) + protoAdapter3.encodedSizeWithTag(12, value.subtitle) + protoAdapter3.encodedSizeWithTag(11, value.title) + protoAdapter4.encodedSizeWithTag(10, value.require_shipping_address) + protoAdapter4.encodedSizeWithTag(9, value.require_billing_address) + protoAdapter4.encodedSizeWithTag(8, value.require_payer_phone) + protoAdapter4.encodedSizeWithTag(7, value.require_payer_email) + protoAdapter4.encodedSizeWithTag(6, value.require_payer_name) + encodedSizeWithTag3;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AuthorizeDigitalWalletPaymentBlocker redact(AuthorizeDigitalWalletPaymentBlocker value) {
                value.getClass();
                Money money = value.authorization_amount;
                Money money2 = money != null ? (Money) Money.ADAPTER.redact(money) : null;
                Money money3 = value.processing_fee;
                Money money4 = money3 != null ? (Money) Money.ADAPTER.redact(money3) : null;
                ByteString byteString = ByteString.EMPTY;
                List<CashInstrumentType> list = value.supported_cash_instrument_types;
                Country country = value.allowable_issuer_countries;
                List<InstrumentType> list2 = value.card_brand_types;
                String str = value.disclaimer_text;
                Boolean bool = value.require_payer_name;
                Boolean bool2 = value.require_payer_email;
                Boolean bool3 = value.require_payer_phone;
                Boolean bool4 = value.require_billing_address;
                Boolean bool5 = value.require_shipping_address;
                String str2 = value.title;
                String str3 = value.subtitle;
                list.getClass();
                list2.getClass();
                byteString.getClass();
                return new AuthorizeDigitalWalletPaymentBlocker(list, country, list2, money2, str, bool, bool2, bool3, bool4, bool5, str2, str3, money4, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AuthorizeDigitalWalletPaymentBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = Money.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 13, value.processing_fee);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 12, value.subtitle);
                protoAdapter3.encodeWithTag(writer, 11, value.title);
                ProtoAdapter protoAdapter4 = ProtoAdapter.BOOL;
                protoAdapter4.encodeWithTag(writer, 10, value.require_shipping_address);
                protoAdapter4.encodeWithTag(writer, 9, value.require_billing_address);
                protoAdapter4.encodeWithTag(writer, 8, value.require_payer_phone);
                protoAdapter4.encodeWithTag(writer, 7, value.require_payer_email);
                protoAdapter4.encodeWithTag(writer, 6, value.require_payer_name);
                protoAdapter3.encodeWithTag(writer, 5, value.disclaimer_text);
                protoAdapter2.encodeWithTag(writer, 4, value.authorization_amount);
                InstrumentType.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.card_brand_types);
                Country.ADAPTER.encodeWithTag(writer, 2, value.allowable_issuer_countries);
                CashInstrumentType.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.supported_cash_instrument_types);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizeDigitalWalletPaymentBlocker(List list, Country country, List list2, Money money, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, String str2, String str3, Money money2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.allowable_issuer_countries = country;
        this.authorization_amount = money;
        this.disclaimer_text = str;
        this.require_payer_name = bool;
        this.require_payer_email = bool2;
        this.require_payer_phone = bool3;
        this.require_billing_address = bool4;
        this.require_shipping_address = bool5;
        this.title = str2;
        this.subtitle = str3;
        this.processing_fee = money2;
        this.supported_cash_instrument_types = TransactorKt.immutableCopyOf("supported_cash_instrument_types", list);
        this.card_brand_types = TransactorKt.immutableCopyOf("card_brand_types", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AuthorizeDigitalWalletPaymentBlocker)) {
            return false;
        }
        AuthorizeDigitalWalletPaymentBlocker authorizeDigitalWalletPaymentBlocker = (AuthorizeDigitalWalletPaymentBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), authorizeDigitalWalletPaymentBlocker.unknownFields()) && Intrinsics.areEqual(this.supported_cash_instrument_types, authorizeDigitalWalletPaymentBlocker.supported_cash_instrument_types) && this.allowable_issuer_countries == authorizeDigitalWalletPaymentBlocker.allowable_issuer_countries && Intrinsics.areEqual(this.card_brand_types, authorizeDigitalWalletPaymentBlocker.card_brand_types) && Intrinsics.areEqual(this.authorization_amount, authorizeDigitalWalletPaymentBlocker.authorization_amount) && Intrinsics.areEqual(this.disclaimer_text, authorizeDigitalWalletPaymentBlocker.disclaimer_text) && Intrinsics.areEqual(this.require_payer_name, authorizeDigitalWalletPaymentBlocker.require_payer_name) && Intrinsics.areEqual(this.require_payer_email, authorizeDigitalWalletPaymentBlocker.require_payer_email) && Intrinsics.areEqual(this.require_payer_phone, authorizeDigitalWalletPaymentBlocker.require_payer_phone) && Intrinsics.areEqual(this.require_billing_address, authorizeDigitalWalletPaymentBlocker.require_billing_address) && Intrinsics.areEqual(this.require_shipping_address, authorizeDigitalWalletPaymentBlocker.require_shipping_address) && Intrinsics.areEqual(this.title, authorizeDigitalWalletPaymentBlocker.title) && Intrinsics.areEqual(this.subtitle, authorizeDigitalWalletPaymentBlocker.subtitle) && Intrinsics.areEqual(this.processing_fee, authorizeDigitalWalletPaymentBlocker.processing_fee);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.supported_cash_instrument_types);
        Country country = this.allowable_issuer_countries;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((m + (country != null ? country.hashCode() : 0)) * 37, 37, this.card_brand_types);
        Money money = this.authorization_amount;
        int hashCode = (m2 + (money != null ? money.hashCode() : 0)) * 37;
        String str = this.disclaimer_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.require_payer_name;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.require_payer_email;
        int hashCode4 = (hashCode3 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.require_payer_phone;
        int hashCode5 = (hashCode4 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0)) * 37;
        Boolean bool4 = this.require_billing_address;
        int hashCode6 = (hashCode5 + (bool4 != null ? Boolean.hashCode(bool4.booleanValue()) : 0)) * 37;
        Boolean bool5 = this.require_shipping_address;
        int hashCode7 = (hashCode6 + (bool5 != null ? Boolean.hashCode(bool5.booleanValue()) : 0)) * 37;
        String str2 = this.title;
        int hashCode8 = (hashCode7 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.subtitle;
        int hashCode9 = (hashCode8 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Money money2 = this.processing_fee;
        int hashCode10 = hashCode9 + (money2 != null ? money2.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.supported_cash_instrument_types = this.supported_cash_instrument_types;
        builder.allowable_issuer_countries = this.allowable_issuer_countries;
        builder.card_brand_types = this.card_brand_types;
        builder.authorization_amount = this.authorization_amount;
        builder.disclaimer_text = this.disclaimer_text;
        builder.require_payer_name = this.require_payer_name;
        builder.require_payer_email = this.require_payer_email;
        builder.require_payer_phone = this.require_payer_phone;
        builder.require_billing_address = this.require_billing_address;
        builder.require_shipping_address = this.require_shipping_address;
        builder.title = this.title;
        builder.subtitle = this.subtitle;
        builder.processing_fee = this.processing_fee;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.supported_cash_instrument_types.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("supported_cash_instrument_types=", arrayList, this.supported_cash_instrument_types);
        }
        Country country = this.allowable_issuer_countries;
        if (country != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("allowable_issuer_countries=", country, arrayList);
        }
        if (!this.card_brand_types.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("card_brand_types=", arrayList, this.card_brand_types);
        }
        Money money = this.authorization_amount;
        if (money != null) {
            Matcher$$ExternalSyntheticOutline0.m("authorization_amount=", money, arrayList);
        }
        String str = this.disclaimer_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "disclaimer_text=", arrayList);
        }
        Boolean bool = this.require_payer_name;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("require_payer_name=", bool, arrayList);
        }
        Boolean bool2 = this.require_payer_email;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("require_payer_email=", bool2, arrayList);
        }
        Boolean bool3 = this.require_payer_phone;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("require_payer_phone=", bool3, arrayList);
        }
        Boolean bool4 = this.require_billing_address;
        if (bool4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("require_billing_address=", bool4, arrayList);
        }
        Boolean bool5 = this.require_shipping_address;
        if (bool5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("require_shipping_address=", bool5, arrayList);
        }
        String str2 = this.title;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "title=", arrayList);
        }
        String str3 = this.subtitle;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "subtitle=", arrayList);
        }
        Money money2 = this.processing_fee;
        if (money2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("processing_fee=", money2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AuthorizeDigitalWalletPaymentBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/AuthorizeDigitalWalletPaymentBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/AuthorizeDigitalWalletPaymentBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/AuthorizeDigitalWalletPaymentBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/AuthorizeDigitalWalletPaymentBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ AuthorizeDigitalWalletPaymentBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
