package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentDeviceCustomizationBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PaymentDeviceCustomizationBlocker$Builder;", "Lcom/squareup/protos/franklin/api/PaymentDeviceCustomizationBlockerConfig;", "blocker_config", "Lcom/squareup/protos/franklin/api/PaymentDeviceCustomizationBlockerConfig;", "Lcom/squareup/protos/franklin/api/SkinsConfig;", "skins_config", "Lcom/squareup/protos/franklin/api/SkinsConfig;", "Lcom/squareup/protos/franklin/api/StampsConfig;", "stamps_config", "Lcom/squareup/protos/franklin/api/StampsConfig;", "Lcom/squareup/protos/cash/ui/Image;", "background_image", "Lcom/squareup/protos/cash/ui/Image;", "", "Lcom/squareup/protos/franklin/api/PaymentDeviceOption;", "payment_device_options", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PaymentDeviceCustomizationBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PaymentDeviceCustomizationBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 4, tag = 5)
    public final Image background_image;

    @WireField(adapter = "com.squareup.protos.franklin.api.PaymentDeviceCustomizationBlockerConfig#ADAPTER", schemaIndex = 0, tag = 1)
    public final PaymentDeviceCustomizationBlockerConfig blocker_config;

    @WireField(adapter = "com.squareup.protos.franklin.api.PaymentDeviceOption#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    public final List<PaymentDeviceOption> payment_device_options;

    @WireField(adapter = "com.squareup.protos.franklin.api.SkinsConfig#ADAPTER", schemaIndex = 2, tag = 3)
    public final SkinsConfig skins_config;

    @WireField(adapter = "com.squareup.protos.franklin.api.StampsConfig#ADAPTER", schemaIndex = 3, tag = 4)
    public final StampsConfig stamps_config;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentDeviceCustomizationBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PaymentDeviceCustomizationBlocker;", "<init>", "()V", "blocker_config", "Lcom/squareup/protos/franklin/api/PaymentDeviceCustomizationBlockerConfig;", "payment_device_options", "", "Lcom/squareup/protos/franklin/api/PaymentDeviceOption;", "skins_config", "Lcom/squareup/protos/franklin/api/SkinsConfig;", "stamps_config", "Lcom/squareup/protos/franklin/api/StampsConfig;", "background_image", "Lcom/squareup/protos/cash/ui/Image;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public Image background_image;
        public PaymentDeviceCustomizationBlockerConfig blocker_config;
        public List<PaymentDeviceOption> payment_device_options = EmptyList.INSTANCE;
        public SkinsConfig skins_config;
        public StampsConfig stamps_config;

        public final Builder background_image(Image background_image) {
            this.background_image = background_image;
            return this;
        }

        public final Builder blocker_config(PaymentDeviceCustomizationBlockerConfig blocker_config) {
            this.blocker_config = blocker_config;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public PaymentDeviceCustomizationBlocker build() {
            return new PaymentDeviceCustomizationBlocker(this.blocker_config, this.payment_device_options, this.skins_config, this.stamps_config, this.background_image, buildUnknownFields());
        }

        public final Builder payment_device_options(List<PaymentDeviceOption> payment_device_options) {
            payment_device_options.getClass();
            TransactorKt.checkElementsNotNull(payment_device_options);
            this.payment_device_options = payment_device_options;
            return this;
        }

        public final Builder skins_config(SkinsConfig skins_config) {
            this.skins_config = skins_config;
            return this;
        }

        public final Builder stamps_config(StampsConfig stamps_config) {
            this.stamps_config = stamps_config;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PaymentDeviceCustomizationBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PaymentDeviceCustomizationBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public PaymentDeviceCustomizationBlocker decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new PaymentDeviceCustomizationBlocker((PaymentDeviceCustomizationBlockerConfig) obj, m, (SkinsConfig) obj2, (StampsConfig) obj3, (Image) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(PaymentDeviceCustomizationBlockerConfig.ADAPTER, reader, obj);
                    } else if (nextTag == 2) {
                        m.add(PaymentDeviceOption.ADAPTER.decode(reader));
                    } else if (nextTag == 3) {
                        obj2 = TransactorKt.decodeMessageOrMerge(SkinsConfig.ADAPTER, reader, obj2);
                    } else if (nextTag == 4) {
                        obj3 = TransactorKt.decodeMessageOrMerge(StampsConfig.ADAPTER, reader, obj3);
                    } else if (nextTag != 5) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj4 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj4);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PaymentDeviceCustomizationBlocker value) {
                writer.getClass();
                value.getClass();
                PaymentDeviceCustomizationBlockerConfig.ADAPTER.encodeWithTag(writer, 1, value.blocker_config);
                PaymentDeviceOption.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.payment_device_options);
                SkinsConfig.ADAPTER.encodeWithTag(writer, 3, value.skins_config);
                StampsConfig.ADAPTER.encodeWithTag(writer, 4, value.stamps_config);
                Image.ADAPTER.encodeWithTag(writer, 5, value.background_image);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PaymentDeviceCustomizationBlocker value) {
                value.getClass();
                return Image.ADAPTER.encodedSizeWithTag(5, value.background_image) + StampsConfig.ADAPTER.encodedSizeWithTag(4, value.stamps_config) + SkinsConfig.ADAPTER.encodedSizeWithTag(3, value.skins_config) + PaymentDeviceOption.ADAPTER.asRepeated().encodedSizeWithTag(2, value.payment_device_options) + PaymentDeviceCustomizationBlockerConfig.ADAPTER.encodedSizeWithTag(1, value.blocker_config) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PaymentDeviceCustomizationBlocker redact(PaymentDeviceCustomizationBlocker value) {
                value.getClass();
                PaymentDeviceCustomizationBlockerConfig paymentDeviceCustomizationBlockerConfig = value.blocker_config;
                PaymentDeviceCustomizationBlockerConfig paymentDeviceCustomizationBlockerConfig2 = paymentDeviceCustomizationBlockerConfig != null ? (PaymentDeviceCustomizationBlockerConfig) PaymentDeviceCustomizationBlockerConfig.ADAPTER.redact(paymentDeviceCustomizationBlockerConfig) : null;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.payment_device_options, PaymentDeviceOption.ADAPTER);
                SkinsConfig skinsConfig = value.skins_config;
                SkinsConfig skinsConfig2 = skinsConfig != null ? (SkinsConfig) SkinsConfig.ADAPTER.redact(skinsConfig) : null;
                StampsConfig stampsConfig = value.stamps_config;
                StampsConfig stampsConfig2 = stampsConfig != null ? (StampsConfig) StampsConfig.ADAPTER.redact(stampsConfig) : null;
                Image image = value.background_image;
                Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new PaymentDeviceCustomizationBlocker(paymentDeviceCustomizationBlockerConfig2, m1169redactElements, skinsConfig2, stampsConfig2, image2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PaymentDeviceCustomizationBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                Image.ADAPTER.encodeWithTag(writer, 5, value.background_image);
                StampsConfig.ADAPTER.encodeWithTag(writer, 4, value.stamps_config);
                SkinsConfig.ADAPTER.encodeWithTag(writer, 3, value.skins_config);
                PaymentDeviceOption.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.payment_device_options);
                PaymentDeviceCustomizationBlockerConfig.ADAPTER.encodeWithTag(writer, 1, value.blocker_config);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentDeviceCustomizationBlocker(PaymentDeviceCustomizationBlockerConfig paymentDeviceCustomizationBlockerConfig, List list, SkinsConfig skinsConfig, StampsConfig stampsConfig, Image image, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.blocker_config = paymentDeviceCustomizationBlockerConfig;
        this.skins_config = skinsConfig;
        this.stamps_config = stampsConfig;
        this.background_image = image;
        this.payment_device_options = TransactorKt.immutableCopyOf("payment_device_options", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentDeviceCustomizationBlocker)) {
            return false;
        }
        PaymentDeviceCustomizationBlocker paymentDeviceCustomizationBlocker = (PaymentDeviceCustomizationBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), paymentDeviceCustomizationBlocker.unknownFields()) && Intrinsics.areEqual(this.blocker_config, paymentDeviceCustomizationBlocker.blocker_config) && Intrinsics.areEqual(this.payment_device_options, paymentDeviceCustomizationBlocker.payment_device_options) && Intrinsics.areEqual(this.skins_config, paymentDeviceCustomizationBlocker.skins_config) && Intrinsics.areEqual(this.stamps_config, paymentDeviceCustomizationBlocker.stamps_config) && Intrinsics.areEqual(this.background_image, paymentDeviceCustomizationBlocker.background_image);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        PaymentDeviceCustomizationBlockerConfig paymentDeviceCustomizationBlockerConfig = this.blocker_config;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (paymentDeviceCustomizationBlockerConfig != null ? paymentDeviceCustomizationBlockerConfig.hashCode() : 0)) * 37, 37, this.payment_device_options);
        SkinsConfig skinsConfig = this.skins_config;
        int hashCode2 = (m + (skinsConfig != null ? skinsConfig.hashCode() : 0)) * 37;
        StampsConfig stampsConfig = this.stamps_config;
        int hashCode3 = (hashCode2 + (stampsConfig != null ? stampsConfig.hashCode() : 0)) * 37;
        Image image = this.background_image;
        int hashCode4 = hashCode3 + (image != null ? image.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.blocker_config = this.blocker_config;
        builder.payment_device_options = this.payment_device_options;
        builder.skins_config = this.skins_config;
        builder.stamps_config = this.stamps_config;
        builder.background_image = this.background_image;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        PaymentDeviceCustomizationBlockerConfig paymentDeviceCustomizationBlockerConfig = this.blocker_config;
        if (paymentDeviceCustomizationBlockerConfig != null) {
            arrayList.add("blocker_config=" + paymentDeviceCustomizationBlockerConfig);
        }
        if (!this.payment_device_options.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("payment_device_options=", arrayList, this.payment_device_options);
        }
        SkinsConfig skinsConfig = this.skins_config;
        if (skinsConfig != null) {
            arrayList.add("skins_config=" + skinsConfig);
        }
        StampsConfig stampsConfig = this.stamps_config;
        if (stampsConfig != null) {
            arrayList.add("stamps_config=" + stampsConfig);
        }
        Image image = this.background_image;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("background_image=", image, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PaymentDeviceCustomizationBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PaymentDeviceCustomizationBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PaymentDeviceCustomizationBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PaymentDeviceCustomizationBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PaymentDeviceCustomizationBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PaymentDeviceCustomizationBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
