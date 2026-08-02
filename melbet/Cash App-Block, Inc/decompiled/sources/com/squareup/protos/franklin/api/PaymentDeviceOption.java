package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.PaymentDeviceOption;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005 !\u001f\"#R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006$"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentDeviceOption;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PaymentDeviceOption$Builder;", "", "payment_device_id", "Ljava/lang/String;", "Lcom/squareup/protos/franklin/api/PaymentDeviceOption$PaymentDeviceType;", "payment_device_type", "Lcom/squareup/protos/franklin/api/PaymentDeviceOption$PaymentDeviceType;", "payment_device_name", "accessibility_text", "offered_price", "Lcom/squareup/protos/franklin/api/PaymentDeviceOption$AvailabilityState;", "availability_state", "Lcom/squareup/protos/franklin/api/PaymentDeviceOption$AvailabilityState;", "availability_pill_label", "Lcom/squareup/protos/franklin/api/LabelTreatment;", "availability_pill_treatment", "Lcom/squareup/protos/franklin/api/LabelTreatment;", "", "customization_eligible", "Ljava/lang/Boolean;", "Lcom/squareup/protos/franklin/api/ProductDetailsPage;", "product_details_page", "Lcom/squareup/protos/franklin/api/ProductDetailsPage;", "Lcom/squareup/protos/franklin/api/PaymentDeviceOption$PaymentDeviceConfig;", "payment_device_config", "Lcom/squareup/protos/franklin/api/PaymentDeviceOption$PaymentDeviceConfig;", "Lcom/squareup/protos/cash/ui/Image;", "background_image", "Lcom/squareup/protos/cash/ui/Image;", "Companion", "Builder", "PaymentDeviceConfig", "PaymentDeviceType", "AvailabilityState", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentDeviceOption extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentDeviceOption> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String accessibility_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    public final String availability_pill_label;

    @WireField(adapter = "com.squareup.protos.franklin.api.LabelTreatment#ADAPTER", schemaIndex = 7, tag = 8)
    public final LabelTreatment availability_pill_treatment;

    @WireField(adapter = "com.squareup.protos.franklin.api.PaymentDeviceOption$AvailabilityState#ADAPTER", schemaIndex = 5, tag = 6)
    public final AvailabilityState availability_state;

    @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 11, tag = 14)
    public final Image background_image;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 8, tag = 9)
    public final Boolean customization_eligible;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String offered_price;

    @WireSealedOneof(schemaIndex = 10)
    public final PaymentDeviceConfig payment_device_config;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String payment_device_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String payment_device_name;

    @WireField(adapter = "com.squareup.protos.franklin.api.PaymentDeviceOption$PaymentDeviceType#ADAPTER", schemaIndex = 1, tag = 2)
    public final PaymentDeviceType payment_device_type;

    @WireField(adapter = "com.squareup.protos.franklin.api.ProductDetailsPage#ADAPTER", schemaIndex = 9, tag = 12)
    public final ProductDetailsPage product_details_page;

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0015\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\b\u0010\u001b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0013R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentDeviceOption$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PaymentDeviceOption;", "<init>", "()V", "payment_device_id", "", "payment_device_type", "Lcom/squareup/protos/franklin/api/PaymentDeviceOption$PaymentDeviceType;", "payment_device_name", "accessibility_text", "offered_price", "availability_state", "Lcom/squareup/protos/franklin/api/PaymentDeviceOption$AvailabilityState;", "availability_pill_label", "availability_pill_treatment", "Lcom/squareup/protos/franklin/api/LabelTreatment;", "customization_eligible", "", "Ljava/lang/Boolean;", "product_details_page", "Lcom/squareup/protos/franklin/api/ProductDetailsPage;", "payment_device_config", "Lcom/squareup/protos/franklin/api/PaymentDeviceOption$PaymentDeviceConfig;", "background_image", "Lcom/squareup/protos/cash/ui/Image;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/PaymentDeviceOption$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String accessibility_text;
        public String availability_pill_label;
        public LabelTreatment availability_pill_treatment;
        public AvailabilityState availability_state;
        public Image background_image;
        public Boolean customization_eligible;
        public String offered_price;
        public PaymentDeviceConfig payment_device_config;
        public String payment_device_id;
        public String payment_device_name;
        public PaymentDeviceType payment_device_type;
        public ProductDetailsPage product_details_page;

        public final Builder accessibility_text(String accessibility_text) {
            this.accessibility_text = accessibility_text;
            return this;
        }

        public final Builder availability_pill_label(String availability_pill_label) {
            this.availability_pill_label = availability_pill_label;
            return this;
        }

        public final Builder availability_pill_treatment(LabelTreatment availability_pill_treatment) {
            this.availability_pill_treatment = availability_pill_treatment;
            return this;
        }

        public final Builder availability_state(AvailabilityState availability_state) {
            this.availability_state = availability_state;
            return this;
        }

        public final Builder background_image(Image background_image) {
            this.background_image = background_image;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public PaymentDeviceOption build() {
            return new PaymentDeviceOption(this.payment_device_id, this.payment_device_type, this.payment_device_name, this.accessibility_text, this.offered_price, this.availability_state, this.availability_pill_label, this.availability_pill_treatment, this.customization_eligible, this.product_details_page, this.payment_device_config, this.background_image, buildUnknownFields());
        }

        public final Builder customization_eligible(Boolean customization_eligible) {
            this.customization_eligible = customization_eligible;
            return this;
        }

        public final Builder offered_price(String offered_price) {
            this.offered_price = offered_price;
            return this;
        }

        public final Builder payment_device_config(PaymentDeviceConfig payment_device_config) {
            this.payment_device_config = payment_device_config;
            return this;
        }

        public final Builder payment_device_id(String payment_device_id) {
            this.payment_device_id = payment_device_id;
            return this;
        }

        public final Builder payment_device_name(String payment_device_name) {
            this.payment_device_name = payment_device_name;
            return this;
        }

        public final Builder payment_device_type(PaymentDeviceType payment_device_type) {
            this.payment_device_type = payment_device_type;
            return this;
        }

        public final Builder product_details_page(ProductDetailsPage product_details_page) {
            this.product_details_page = product_details_page;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PaymentDeviceOption.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PaymentDeviceOption$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public PaymentDeviceOption decode(ProtoReader reader) {
                Object obj;
                Object obj2;
                Object obj3;
                reader.getClass();
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
                PaymentDeviceOption.PaymentDeviceConfig.PaymentCard paymentCard = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new PaymentDeviceOption((String) obj4, (PaymentDeviceOption.PaymentDeviceType) obj5, (String) obj6, (String) obj7, (String) obj8, (PaymentDeviceOption.AvailabilityState) obj9, (String) obj10, (LabelTreatment) obj11, (Boolean) obj12, (ProductDetailsPage) obj13, paymentCard, (Image) obj14, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj = obj4;
                            obj2 = obj5;
                            obj3 = obj6;
                            try {
                                obj4 = obj;
                                obj5 = PaymentDeviceOption.PaymentDeviceType.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                            obj6 = obj3;
                            break;
                        case 3:
                            obj6 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            obj7 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            obj8 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            try {
                                obj9 = PaymentDeviceOption.AvailabilityState.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                obj = obj4;
                                obj2 = obj5;
                                obj3 = obj6;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 7:
                            obj10 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 8:
                            obj11 = TransactorKt.decodeMessageOrMerge(LabelTreatment.ADAPTER, reader, obj11);
                            break;
                        case 9:
                            obj12 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 10:
                        case 11:
                        default:
                            reader.readUnknownField(nextTag);
                            obj = obj4;
                            obj2 = obj5;
                            obj3 = obj6;
                            obj4 = obj;
                            obj5 = obj2;
                            obj6 = obj3;
                            break;
                        case 12:
                            obj13 = TransactorKt.decodeMessageOrMerge(ProductDetailsPage.ADAPTER, reader, obj13);
                            break;
                        case 13:
                            paymentCard = new PaymentDeviceOption.PaymentDeviceConfig.PaymentCard((PaymentCardConfig) PaymentCardConfig.ADAPTER.decode(reader));
                            break;
                        case 14:
                            obj14 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj14);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PaymentDeviceOption value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.payment_device_id);
                PaymentDeviceOption.PaymentDeviceType.ADAPTER.encodeWithTag(writer, 2, value.payment_device_type);
                protoAdapter2.encodeWithTag(writer, 3, value.payment_device_name);
                protoAdapter2.encodeWithTag(writer, 4, value.accessibility_text);
                protoAdapter2.encodeWithTag(writer, 5, value.offered_price);
                PaymentDeviceOption.AvailabilityState.ADAPTER.encodeWithTag(writer, 6, value.availability_state);
                protoAdapter2.encodeWithTag(writer, 7, value.availability_pill_label);
                LabelTreatment.ADAPTER.encodeWithTag(writer, 8, value.availability_pill_treatment);
                ProtoAdapter.BOOL.encodeWithTag(writer, 9, value.customization_eligible);
                ProductDetailsPage.ADAPTER.encodeWithTag(writer, 12, value.product_details_page);
                Image.ADAPTER.encodeWithTag(writer, 14, value.background_image);
                PaymentDeviceOption.PaymentDeviceConfig paymentDeviceConfig = value.payment_device_config;
                if (paymentDeviceConfig instanceof PaymentDeviceOption.PaymentDeviceConfig.PaymentCard) {
                    PaymentCardConfig.ADAPTER.encodeWithTag(writer, 13, ((PaymentDeviceOption.PaymentDeviceConfig.PaymentCard) paymentDeviceConfig).getValue());
                } else if (paymentDeviceConfig != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PaymentDeviceOption value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = ProductDetailsPage.ADAPTER.encodedSizeWithTag(12, value.product_details_page) + ProtoAdapter.BOOL.encodedSizeWithTag(9, value.customization_eligible) + LabelTreatment.ADAPTER.encodedSizeWithTag(8, value.availability_pill_treatment) + protoAdapter2.encodedSizeWithTag(7, value.availability_pill_label) + PaymentDeviceOption.AvailabilityState.ADAPTER.encodedSizeWithTag(6, value.availability_state) + protoAdapter2.encodedSizeWithTag(5, value.offered_price) + protoAdapter2.encodedSizeWithTag(4, value.accessibility_text) + protoAdapter2.encodedSizeWithTag(3, value.payment_device_name) + PaymentDeviceOption.PaymentDeviceType.ADAPTER.encodedSizeWithTag(2, value.payment_device_type) + protoAdapter2.encodedSizeWithTag(1, value.payment_device_id) + size$okio;
                PaymentDeviceOption.PaymentDeviceConfig paymentDeviceConfig = value.payment_device_config;
                if (paymentDeviceConfig instanceof PaymentDeviceOption.PaymentDeviceConfig.PaymentCard) {
                    encodedSizeWithTag += PaymentCardConfig.ADAPTER.encodedSizeWithTag(13, ((PaymentDeviceOption.PaymentDeviceConfig.PaymentCard) paymentDeviceConfig).getValue());
                } else if (paymentDeviceConfig != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                return Image.ADAPTER.encodedSizeWithTag(14, value.background_image) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PaymentDeviceOption redact(PaymentDeviceOption value) {
                value.getClass();
                LabelTreatment labelTreatment = value.availability_pill_treatment;
                LabelTreatment labelTreatment2 = labelTreatment != null ? (LabelTreatment) LabelTreatment.ADAPTER.redact(labelTreatment) : null;
                ProductDetailsPage productDetailsPage = value.product_details_page;
                ProductDetailsPage productDetailsPage2 = productDetailsPage != null ? (ProductDetailsPage) ProductDetailsPage.ADAPTER.redact(productDetailsPage) : null;
                Image image = value.background_image;
                Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.payment_device_id;
                PaymentDeviceOption.PaymentDeviceType paymentDeviceType = value.payment_device_type;
                String str2 = value.payment_device_name;
                String str3 = value.accessibility_text;
                String str4 = value.offered_price;
                PaymentDeviceOption.AvailabilityState availabilityState = value.availability_state;
                String str5 = value.availability_pill_label;
                Boolean bool = value.customization_eligible;
                PaymentDeviceOption.PaymentDeviceConfig paymentDeviceConfig = value.payment_device_config;
                byteString.getClass();
                return new PaymentDeviceOption(str, paymentDeviceType, str2, str3, str4, availabilityState, str5, labelTreatment2, bool, productDetailsPage2, paymentDeviceConfig, image2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PaymentDeviceOption value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                PaymentDeviceOption.PaymentDeviceConfig paymentDeviceConfig = value.payment_device_config;
                if (paymentDeviceConfig instanceof PaymentDeviceOption.PaymentDeviceConfig.PaymentCard) {
                    PaymentCardConfig.ADAPTER.encodeWithTag(writer, 13, ((PaymentDeviceOption.PaymentDeviceConfig.PaymentCard) paymentDeviceConfig).getValue());
                } else if (paymentDeviceConfig != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                Image.ADAPTER.encodeWithTag(writer, 14, value.background_image);
                ProductDetailsPage.ADAPTER.encodeWithTag(writer, 12, value.product_details_page);
                ProtoAdapter.BOOL.encodeWithTag(writer, 9, value.customization_eligible);
                LabelTreatment.ADAPTER.encodeWithTag(writer, 8, value.availability_pill_treatment);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 7, value.availability_pill_label);
                PaymentDeviceOption.AvailabilityState.ADAPTER.encodeWithTag(writer, 6, value.availability_state);
                protoAdapter2.encodeWithTag(writer, 5, value.offered_price);
                protoAdapter2.encodeWithTag(writer, 4, value.accessibility_text);
                protoAdapter2.encodeWithTag(writer, 3, value.payment_device_name);
                PaymentDeviceOption.PaymentDeviceType.ADAPTER.encodeWithTag(writer, 2, value.payment_device_type);
                protoAdapter2.encodeWithTag(writer, 1, value.payment_device_id);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentDeviceOption(String str, PaymentDeviceType paymentDeviceType, String str2, String str3, String str4, AvailabilityState availabilityState, String str5, LabelTreatment labelTreatment, Boolean bool, ProductDetailsPage productDetailsPage, PaymentDeviceConfig paymentDeviceConfig, Image image, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.payment_device_id = str;
        this.payment_device_type = paymentDeviceType;
        this.payment_device_name = str2;
        this.accessibility_text = str3;
        this.offered_price = str4;
        this.availability_state = availabilityState;
        this.availability_pill_label = str5;
        this.availability_pill_treatment = labelTreatment;
        this.customization_eligible = bool;
        this.product_details_page = productDetailsPage;
        this.payment_device_config = paymentDeviceConfig;
        this.background_image = image;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentDeviceOption)) {
            return false;
        }
        PaymentDeviceOption paymentDeviceOption = (PaymentDeviceOption) obj;
        return Intrinsics.areEqual(unknownFields(), paymentDeviceOption.unknownFields()) && Intrinsics.areEqual(this.payment_device_id, paymentDeviceOption.payment_device_id) && this.payment_device_type == paymentDeviceOption.payment_device_type && Intrinsics.areEqual(this.payment_device_name, paymentDeviceOption.payment_device_name) && Intrinsics.areEqual(this.accessibility_text, paymentDeviceOption.accessibility_text) && Intrinsics.areEqual(this.offered_price, paymentDeviceOption.offered_price) && this.availability_state == paymentDeviceOption.availability_state && Intrinsics.areEqual(this.availability_pill_label, paymentDeviceOption.availability_pill_label) && Intrinsics.areEqual(this.availability_pill_treatment, paymentDeviceOption.availability_pill_treatment) && Intrinsics.areEqual(this.customization_eligible, paymentDeviceOption.customization_eligible) && Intrinsics.areEqual(this.product_details_page, paymentDeviceOption.product_details_page) && Intrinsics.areEqual(this.payment_device_config, paymentDeviceOption.payment_device_config) && Intrinsics.areEqual(this.background_image, paymentDeviceOption.background_image);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.payment_device_id;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        PaymentDeviceType paymentDeviceType = this.payment_device_type;
        int hashCode3 = (hashCode2 + (paymentDeviceType != null ? paymentDeviceType.hashCode() : 0)) * 37;
        String str2 = this.payment_device_name;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.accessibility_text;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.offered_price;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        AvailabilityState availabilityState = this.availability_state;
        int hashCode7 = (hashCode6 + (availabilityState != null ? availabilityState.hashCode() : 0)) * 37;
        String str5 = this.availability_pill_label;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37;
        LabelTreatment labelTreatment = this.availability_pill_treatment;
        int hashCode9 = (hashCode8 + (labelTreatment != null ? labelTreatment.hashCode() : 0)) * 37;
        Boolean bool = this.customization_eligible;
        int hashCode10 = (hashCode9 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        ProductDetailsPage productDetailsPage = this.product_details_page;
        int hashCode11 = (hashCode10 + (productDetailsPage != null ? productDetailsPage.hashCode() : 0)) * 37;
        PaymentDeviceConfig paymentDeviceConfig = this.payment_device_config;
        int hashCode12 = (hashCode11 + (paymentDeviceConfig != null ? paymentDeviceConfig.hashCode() : 0)) * 37;
        Image image = this.background_image;
        int hashCode13 = hashCode12 + (image != null ? image.hashCode() : 0);
        this.hashCode = hashCode13;
        return hashCode13;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.payment_device_id = this.payment_device_id;
        builder.payment_device_type = this.payment_device_type;
        builder.payment_device_name = this.payment_device_name;
        builder.accessibility_text = this.accessibility_text;
        builder.offered_price = this.offered_price;
        builder.availability_state = this.availability_state;
        builder.availability_pill_label = this.availability_pill_label;
        builder.availability_pill_treatment = this.availability_pill_treatment;
        builder.customization_eligible = this.customization_eligible;
        builder.product_details_page = this.product_details_page;
        builder.payment_device_config = this.payment_device_config;
        builder.background_image = this.background_image;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.payment_device_id;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "payment_device_id=", arrayList);
        }
        PaymentDeviceType paymentDeviceType = this.payment_device_type;
        if (paymentDeviceType != null) {
            arrayList.add("payment_device_type=" + paymentDeviceType);
        }
        String str2 = this.payment_device_name;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "payment_device_name=", arrayList);
        }
        String str3 = this.accessibility_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "accessibility_text=", arrayList);
        }
        String str4 = this.offered_price;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "offered_price=", arrayList);
        }
        AvailabilityState availabilityState = this.availability_state;
        if (availabilityState != null) {
            arrayList.add("availability_state=" + availabilityState);
        }
        String str5 = this.availability_pill_label;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "availability_pill_label=", arrayList);
        }
        LabelTreatment labelTreatment = this.availability_pill_treatment;
        if (labelTreatment != null) {
            arrayList.add("availability_pill_treatment=" + labelTreatment);
        }
        Boolean bool = this.customization_eligible;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("customization_eligible=", bool, arrayList);
        }
        ProductDetailsPage productDetailsPage = this.product_details_page;
        if (productDetailsPage != null) {
            arrayList.add("product_details_page=" + productDetailsPage);
        }
        PaymentDeviceConfig paymentDeviceConfig = this.payment_device_config;
        if (paymentDeviceConfig != null) {
            arrayList.add("payment_device_config=" + paymentDeviceConfig);
        }
        Image image = this.background_image;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("background_image=", image, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentDeviceOption{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentDeviceOption$AvailabilityState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "AVAILABILITY_STATE_UNSPECIFIED", "TEASER", "COMING_SOON", "AVAILABLE", "NEW", "SOLD_OUT", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AvailabilityState implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ AvailabilityState[] $VALUES;
        public static final ProtoAdapter ADAPTER;
        public static final AvailabilityState AVAILABILITY_STATE_UNSPECIFIED;
        public static final AvailabilityState AVAILABLE;
        public static final AvailabilityState COMING_SOON;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final AvailabilityState NEW;
        public static final AvailabilityState SOLD_OUT;
        public static final AvailabilityState TEASER;
        private final int value;

        private static final /* synthetic */ AvailabilityState[] $values() {
            return new AvailabilityState[]{AVAILABILITY_STATE_UNSPECIFIED, TEASER, COMING_SOON, AVAILABLE, NEW, SOLD_OUT};
        }

        static {
            final AvailabilityState availabilityState = new AvailabilityState("AVAILABILITY_STATE_UNSPECIFIED", 0, 0);
            AVAILABILITY_STATE_UNSPECIFIED = availabilityState;
            TEASER = new AvailabilityState("TEASER", 1, 1);
            COMING_SOON = new AvailabilityState("COMING_SOON", 2, 2);
            AVAILABLE = new AvailabilityState("AVAILABLE", 3, 3);
            NEW = new AvailabilityState("NEW", 4, 4);
            SOLD_OUT = new AvailabilityState("SOLD_OUT", 5, 5);
            AvailabilityState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AvailabilityState.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, availabilityState) { // from class: com.squareup.protos.franklin.api.PaymentDeviceOption$AvailabilityState$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public PaymentDeviceOption.AvailabilityState fromValue(int value) {
                    return PaymentDeviceOption.AvailabilityState.INSTANCE.fromValue(value);
                }
            };
        }

        private AvailabilityState(String str, int i, int i2) {
            this.value = i2;
        }

        public static final AvailabilityState fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static AvailabilityState valueOf(String str) {
            return (AvailabilityState) Enum.valueOf(AvailabilityState.class, str);
        }

        public static AvailabilityState[] values() {
            return (AvailabilityState[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentDeviceOption$AvailabilityState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/PaymentDeviceOption$AvailabilityState;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final AvailabilityState fromValue(int value) {
                if (value == 0) {
                    return AvailabilityState.AVAILABILITY_STATE_UNSPECIFIED;
                }
                if (value == 1) {
                    return AvailabilityState.TEASER;
                }
                if (value == 2) {
                    return AvailabilityState.COMING_SOON;
                }
                if (value == 3) {
                    return AvailabilityState.AVAILABLE;
                }
                if (value == 4) {
                    return AvailabilityState.NEW;
                }
                if (value != 5) {
                    return null;
                }
                return AvailabilityState.SOLD_OUT;
            }

            private Companion() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentDeviceOption$PaymentDeviceType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PAYMENT_DEVICE_TYPE_UNSPECIFIED", "PAYMENT_CARD", "PAYMENT_TOKEN_DEVICE", "PAYMENT_CARD_LITE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PaymentDeviceType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PaymentDeviceType[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final PaymentDeviceType PAYMENT_CARD;
        public static final PaymentDeviceType PAYMENT_CARD_LITE;
        public static final PaymentDeviceType PAYMENT_DEVICE_TYPE_UNSPECIFIED;
        public static final PaymentDeviceType PAYMENT_TOKEN_DEVICE;
        private final int value;

        private static final /* synthetic */ PaymentDeviceType[] $values() {
            return new PaymentDeviceType[]{PAYMENT_DEVICE_TYPE_UNSPECIFIED, PAYMENT_CARD, PAYMENT_TOKEN_DEVICE, PAYMENT_CARD_LITE};
        }

        static {
            final PaymentDeviceType paymentDeviceType = new PaymentDeviceType("PAYMENT_DEVICE_TYPE_UNSPECIFIED", 0, 0);
            PAYMENT_DEVICE_TYPE_UNSPECIFIED = paymentDeviceType;
            PAYMENT_CARD = new PaymentDeviceType("PAYMENT_CARD", 1, 1);
            PAYMENT_TOKEN_DEVICE = new PaymentDeviceType("PAYMENT_TOKEN_DEVICE", 2, 2);
            PAYMENT_CARD_LITE = new PaymentDeviceType("PAYMENT_CARD_LITE", 3, 3);
            PaymentDeviceType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PaymentDeviceType.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, paymentDeviceType) { // from class: com.squareup.protos.franklin.api.PaymentDeviceOption$PaymentDeviceType$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public PaymentDeviceOption.PaymentDeviceType fromValue(int value) {
                    return PaymentDeviceOption.PaymentDeviceType.INSTANCE.fromValue(value);
                }
            };
        }

        private PaymentDeviceType(String str, int i, int i2) {
            this.value = i2;
        }

        public static final PaymentDeviceType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static PaymentDeviceType valueOf(String str) {
            return (PaymentDeviceType) Enum.valueOf(PaymentDeviceType.class, str);
        }

        public static PaymentDeviceType[] values() {
            return (PaymentDeviceType[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentDeviceOption$PaymentDeviceType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/PaymentDeviceOption$PaymentDeviceType;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final PaymentDeviceType fromValue(int value) {
                if (value == 0) {
                    return PaymentDeviceType.PAYMENT_DEVICE_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return PaymentDeviceType.PAYMENT_CARD;
                }
                if (value == 2) {
                    return PaymentDeviceType.PAYMENT_TOKEN_DEVICE;
                }
                if (value != 3) {
                    return null;
                }
                return PaymentDeviceType.PAYMENT_CARD_LITE;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentDeviceOption$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PaymentDeviceOption$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PaymentDeviceOption;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PaymentDeviceOption;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PaymentDeviceOption build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentDeviceOption$PaymentDeviceConfig;", "", "<init>", "()V", "PaymentCard", "Lcom/squareup/protos/franklin/api/PaymentDeviceOption$PaymentDeviceConfig$PaymentCard;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class PaymentDeviceConfig {

        @WireOneofField(adapter = "com.squareup.protos.franklin.api.PaymentCardConfig#ADAPTER", declaredName = "payment_card", tag = 13)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentDeviceOption$PaymentDeviceConfig$PaymentCard;", "Lcom/squareup/protos/franklin/api/PaymentDeviceOption$PaymentDeviceConfig;", "value", "Lcom/squareup/protos/franklin/api/PaymentCardConfig;", "<init>", "(Lcom/squareup/protos/franklin/api/PaymentCardConfig;)V", "getValue", "()Lcom/squareup/protos/franklin/api/PaymentCardConfig;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class PaymentCard extends PaymentDeviceConfig {
            private final PaymentCardConfig value;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaymentCard(PaymentCardConfig paymentCardConfig) {
                super(null);
                paymentCardConfig.getClass();
                this.value = paymentCardConfig;
            }

            public static /* synthetic */ PaymentCard copy$default(PaymentCard paymentCard, PaymentCardConfig paymentCardConfig, int i, Object obj) {
                if ((i & 1) != 0) {
                    paymentCardConfig = paymentCard.value;
                }
                return paymentCard.copy(paymentCardConfig);
            }

            /* renamed from: component1, reason: from getter */
            public final PaymentCardConfig getValue() {
                return this.value;
            }

            public final PaymentCard copy(PaymentCardConfig value) {
                value.getClass();
                return new PaymentCard(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof PaymentCard) && Intrinsics.areEqual(this.value, ((PaymentCard) other).value);
            }

            public final PaymentCardConfig getValue() {
                return this.value;
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "PaymentCard(value=" + this.value + ")";
            }
        }

        public /* synthetic */ PaymentDeviceConfig(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private PaymentDeviceConfig() {
        }
    }
}
