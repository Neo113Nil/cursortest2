package com.squareup.protos.franklin.ui;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Illustration;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.protos.franklin.ui.ReceiptSection;
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
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \n2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\r\u000b\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Builder;", "", "title", "Ljava/lang/String;", "", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry;", "entries", "Ljava/util/List;", "Companion", "Builder", "Entry", "DetailRow", "ActionRow", "ItemsGroup", "ProgressRow", "LocationRow", "URLRow", "TextBlock", "Upsell", "TimelineEntry", "ImageRow", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ReceiptSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ReceiptSection> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.ui.ReceiptSection$Entry#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    public final List<Entry> entries;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String title;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001b\u001c\u001dBe\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0082\u0004J\n\u0010\u0017\u001a\u00020\u0018H\u0096\u0080\u0004J\b\u0010\u0019\u001a\u00020\u0004H\u0016Jd\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$ActionRow;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ActionRow$Builder;", AnnotatedPrivateKey.LABEL, "", "payment_history_button", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton;", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "secondary_label", "accessory_icon", "accessory_label", "accessory_label_treatment", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ActionRow$AccessoryLabelTreatment;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/franklin/ui/PaymentHistoryButton;Lcom/squareup/protos/cash/ui/Icon;Ljava/lang/String;Lcom/squareup/protos/cash/ui/Icon;Ljava/lang/String;Lcom/squareup/protos/franklin/ui/ReceiptSection$ActionRow$AccessoryLabelTreatment;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "AccessoryLabelTreatment", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ActionRow extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ActionRow> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 4, tag = 5)
        public final Icon accessory_icon;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
        public final String accessory_label;

        @WireField(adapter = "com.squareup.protos.franklin.ui.ReceiptSection$ActionRow$AccessoryLabelTreatment#ADAPTER", schemaIndex = 6, tag = 7)
        public final AccessoryLabelTreatment accessory_label_treatment;

        @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 2, tag = 3)
        public final Icon icon;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String label;

        @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryButton#ADAPTER", schemaIndex = 1, tag = 2)
        public final PaymentHistoryButton payment_history_button;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String secondary_label;

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\nJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$ActionRow$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ActionRow;", "<init>", "()V", AnnotatedPrivateKey.LABEL, "", "payment_history_button", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton;", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "secondary_label", "accessory_icon", "accessory_label", "accessory_label_treatment", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ActionRow$AccessoryLabelTreatment;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Icon accessory_icon;
            public String accessory_label;
            public AccessoryLabelTreatment accessory_label_treatment;
            public Icon icon;
            public String label;
            public PaymentHistoryButton payment_history_button;
            public String secondary_label;

            public final Builder accessory_icon(Icon accessory_icon) {
                this.accessory_icon = accessory_icon;
                return this;
            }

            public final Builder accessory_label(String accessory_label) {
                this.accessory_label = accessory_label;
                return this;
            }

            public final Builder accessory_label_treatment(AccessoryLabelTreatment accessory_label_treatment) {
                this.accessory_label_treatment = accessory_label_treatment;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public ActionRow build() {
                return new ActionRow(this.label, this.payment_history_button, this.icon, this.secondary_label, this.accessory_icon, this.accessory_label, this.accessory_label_treatment, buildUnknownFields());
            }

            public final Builder icon(Icon icon) {
                this.icon = icon;
                return this;
            }

            public final Builder label(String label) {
                this.label = label;
                return this;
            }

            public final Builder payment_history_button(PaymentHistoryButton payment_history_button) {
                this.payment_history_button = payment_history_button;
                return this;
            }

            public final Builder secondary_label(String secondary_label) {
                this.secondary_label = secondary_label;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ActionRow.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.ReceiptSection$ActionRow$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public ReceiptSection.ActionRow decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    Object obj6 = null;
                    Object obj7 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new ReceiptSection.ActionRow((String) obj, (PaymentHistoryButton) obj2, (Icon) obj3, (String) obj4, (Icon) obj5, (String) obj6, (ReceiptSection.ActionRow.AccessoryLabelTreatment) obj7, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                obj2 = TransactorKt.decodeMessageOrMerge(PaymentHistoryButton.ADAPTER, reader, obj2);
                                break;
                            case 3:
                                obj3 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, reader, obj3);
                                break;
                            case 4:
                                obj4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                obj5 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, reader, obj5);
                                break;
                            case 6:
                                obj6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                try {
                                    obj7 = ReceiptSection.ActionRow.AccessoryLabelTreatment.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ReceiptSection.ActionRow value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.label);
                    PaymentHistoryButton.ADAPTER.encodeWithTag(writer, 2, value.payment_history_button);
                    ProtoAdapter protoAdapter3 = Icon.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 3, value.icon);
                    protoAdapter2.encodeWithTag(writer, 4, value.secondary_label);
                    protoAdapter3.encodeWithTag(writer, 5, value.accessory_icon);
                    protoAdapter2.encodeWithTag(writer, 6, value.accessory_label);
                    ReceiptSection.ActionRow.AccessoryLabelTreatment.ADAPTER.encodeWithTag(writer, 7, value.accessory_label_treatment);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ReceiptSection.ActionRow value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    int encodedSizeWithTag = PaymentHistoryButton.ADAPTER.encodedSizeWithTag(2, value.payment_history_button) + protoAdapter2.encodedSizeWithTag(1, value.label) + size$okio;
                    ProtoAdapter protoAdapter3 = Icon.ADAPTER;
                    return ReceiptSection.ActionRow.AccessoryLabelTreatment.ADAPTER.encodedSizeWithTag(7, value.accessory_label_treatment) + protoAdapter2.encodedSizeWithTag(6, value.accessory_label) + protoAdapter3.encodedSizeWithTag(5, value.accessory_icon) + protoAdapter2.encodedSizeWithTag(4, value.secondary_label) + protoAdapter3.encodedSizeWithTag(3, value.icon) + encodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ReceiptSection.ActionRow redact(ReceiptSection.ActionRow value) {
                    value.getClass();
                    PaymentHistoryButton paymentHistoryButton = value.payment_history_button;
                    PaymentHistoryButton paymentHistoryButton2 = paymentHistoryButton != null ? (PaymentHistoryButton) PaymentHistoryButton.ADAPTER.redact(paymentHistoryButton) : null;
                    Icon icon = value.icon;
                    Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
                    Icon icon3 = value.accessory_icon;
                    return ReceiptSection.ActionRow.copy$default(value, null, paymentHistoryButton2, icon2, null, icon3 != null ? (Icon) Icon.ADAPTER.redact(icon3) : null, null, null, ByteString.EMPTY, 105, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ReceiptSection.ActionRow value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ReceiptSection.ActionRow.AccessoryLabelTreatment.ADAPTER.encodeWithTag(writer, 7, value.accessory_label_treatment);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 6, value.accessory_label);
                    ProtoAdapter protoAdapter3 = Icon.ADAPTER;
                    protoAdapter3.encodeWithTag(writer, 5, value.accessory_icon);
                    protoAdapter2.encodeWithTag(writer, 4, value.secondary_label);
                    protoAdapter3.encodeWithTag(writer, 3, value.icon);
                    PaymentHistoryButton.ADAPTER.encodeWithTag(writer, 2, value.payment_history_button);
                    protoAdapter2.encodeWithTag(writer, 1, value.label);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ActionRow(String str, PaymentHistoryButton paymentHistoryButton, Icon icon, String str2, Icon icon2, String str3, AccessoryLabelTreatment accessoryLabelTreatment, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : paymentHistoryButton, (i & 4) != 0 ? null : icon, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : icon2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : accessoryLabelTreatment, (i & 128) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ActionRow copy$default(ActionRow actionRow, String str, PaymentHistoryButton paymentHistoryButton, Icon icon, String str2, Icon icon2, String str3, AccessoryLabelTreatment accessoryLabelTreatment, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = actionRow.label;
            }
            if ((i & 2) != 0) {
                paymentHistoryButton = actionRow.payment_history_button;
            }
            if ((i & 4) != 0) {
                icon = actionRow.icon;
            }
            if ((i & 8) != 0) {
                str2 = actionRow.secondary_label;
            }
            if ((i & 16) != 0) {
                icon2 = actionRow.accessory_icon;
            }
            if ((i & 32) != 0) {
                str3 = actionRow.accessory_label;
            }
            if ((i & 64) != 0) {
                accessoryLabelTreatment = actionRow.accessory_label_treatment;
            }
            if ((i & 128) != 0) {
                byteString = actionRow.unknownFields();
            }
            AccessoryLabelTreatment accessoryLabelTreatment2 = accessoryLabelTreatment;
            ByteString byteString2 = byteString;
            Icon icon3 = icon2;
            String str4 = str3;
            return actionRow.copy(str, paymentHistoryButton, icon, str2, icon3, str4, accessoryLabelTreatment2, byteString2);
        }

        public final ActionRow copy(String label, PaymentHistoryButton payment_history_button, Icon icon, String secondary_label, Icon accessory_icon, String accessory_label, AccessoryLabelTreatment accessory_label_treatment, ByteString unknownFields) {
            unknownFields.getClass();
            return new ActionRow(label, payment_history_button, icon, secondary_label, accessory_icon, accessory_label, accessory_label_treatment, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ActionRow)) {
                return false;
            }
            ActionRow actionRow = (ActionRow) other;
            return Intrinsics.areEqual(unknownFields(), actionRow.unknownFields()) && Intrinsics.areEqual(this.label, actionRow.label) && Intrinsics.areEqual(this.payment_history_button, actionRow.payment_history_button) && Intrinsics.areEqual(this.icon, actionRow.icon) && Intrinsics.areEqual(this.secondary_label, actionRow.secondary_label) && Intrinsics.areEqual(this.accessory_icon, actionRow.accessory_icon) && Intrinsics.areEqual(this.accessory_label, actionRow.accessory_label) && this.accessory_label_treatment == actionRow.accessory_label_treatment;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.label;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            PaymentHistoryButton paymentHistoryButton = this.payment_history_button;
            int hashCode3 = (hashCode2 + (paymentHistoryButton != null ? paymentHistoryButton.hashCode() : 0)) * 37;
            Icon icon = this.icon;
            int hashCode4 = (hashCode3 + (icon != null ? icon.hashCode() : 0)) * 37;
            String str2 = this.secondary_label;
            int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Icon icon2 = this.accessory_icon;
            int hashCode6 = (hashCode5 + (icon2 != null ? icon2.hashCode() : 0)) * 37;
            String str3 = this.accessory_label;
            int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 37;
            AccessoryLabelTreatment accessoryLabelTreatment = this.accessory_label_treatment;
            int hashCode8 = hashCode7 + (accessoryLabelTreatment != null ? accessoryLabelTreatment.hashCode() : 0);
            this.hashCode = hashCode8;
            return hashCode8;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.label = this.label;
            builder.payment_history_button = this.payment_history_button;
            builder.icon = this.icon;
            builder.secondary_label = this.secondary_label;
            builder.accessory_icon = this.accessory_icon;
            builder.accessory_label = this.accessory_label;
            builder.accessory_label_treatment = this.accessory_label_treatment;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.label;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
            }
            PaymentHistoryButton paymentHistoryButton = this.payment_history_button;
            if (paymentHistoryButton != null) {
                arrayList.add("payment_history_button=" + paymentHistoryButton);
            }
            Icon icon = this.icon;
            if (icon != null) {
                Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
            }
            String str2 = this.secondary_label;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "secondary_label=", arrayList);
            }
            Icon icon2 = this.accessory_icon;
            if (icon2 != null) {
                Matcher$$ExternalSyntheticOutline0.m("accessory_icon=", icon2, arrayList);
            }
            String str3 = this.accessory_label;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "accessory_label=", arrayList);
            }
            AccessoryLabelTreatment accessoryLabelTreatment = this.accessory_label_treatment;
            if (accessoryLabelTreatment != null) {
                arrayList.add("accessory_label_treatment=" + accessoryLabelTreatment);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ActionRow{", "}", 0, null, null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$ActionRow$AccessoryLabelTreatment;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STANDARD", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class AccessoryLabelTreatment implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ AccessoryLabelTreatment[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final AccessoryLabelTreatment STANDARD = new AccessoryLabelTreatment("STANDARD", 0, 1);
            private final int value;

            private static final /* synthetic */ AccessoryLabelTreatment[] $values() {
                return new AccessoryLabelTreatment[]{STANDARD};
            }

            static {
                AccessoryLabelTreatment[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AccessoryLabelTreatment.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.ReceiptSection$ActionRow$AccessoryLabelTreatment$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public ReceiptSection.ActionRow.AccessoryLabelTreatment fromValue(int value) {
                        return ReceiptSection.ActionRow.AccessoryLabelTreatment.INSTANCE.fromValue(value);
                    }
                };
            }

            private AccessoryLabelTreatment(String str, int i, int i2) {
                this.value = i2;
            }

            public static final AccessoryLabelTreatment fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static AccessoryLabelTreatment valueOf(String str) {
                return (AccessoryLabelTreatment) Enum.valueOf(AccessoryLabelTreatment.class, str);
            }

            public static AccessoryLabelTreatment[] values() {
                return (AccessoryLabelTreatment[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$ActionRow$AccessoryLabelTreatment$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ActionRow$AccessoryLabelTreatment;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final AccessoryLabelTreatment fromValue(int value) {
                    if (value == 1) {
                        return AccessoryLabelTreatment.STANDARD;
                    }
                    return null;
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$ActionRow$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ActionRow$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ActionRow;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/ReceiptSection$ActionRow;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ActionRow build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ActionRow() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionRow(String str, PaymentHistoryButton paymentHistoryButton, Icon icon, String str2, Icon icon2, String str3, AccessoryLabelTreatment accessoryLabelTreatment, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.label = str;
            this.payment_history_button = paymentHistoryButton;
            this.icon = icon;
            this.secondary_label = str2;
            this.accessory_icon = icon2;
            this.accessory_label = str3;
            this.accessory_label_treatment = accessoryLabelTreatment;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/ReceiptSection;", "<init>", "()V", "title", "", "entries", "", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<Entry> entries = EmptyList.INSTANCE;
        public String title;

        @Override // com.squareup.wire.Message.Builder
        public ReceiptSection build() {
            return new ReceiptSection(this.title, this.entries, buildUnknownFields());
        }

        public final Builder entries(List<Entry> entries) {
            entries.getClass();
            TransactorKt.checkElementsNotNull(entries);
            this.entries = entries;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0018\u0019\u001aBM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0082\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u0096\u0080\u0004J\b\u0010\u0016\u001a\u00020\u0004H\u0016JL\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$DetailRow;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$DetailRow$Builder;", "title", "", "subtitle", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "copyable_body", "detail_treatment", "Lcom/squareup/protos/franklin/ui/ReceiptSection$DetailRow$DetailTreatment;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/ui/Icon;Ljava/lang/String;Lcom/squareup/protos/franklin/ui/ReceiptSection$DetailRow$DetailTreatment;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "DetailTreatment", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class DetailRow extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<DetailRow> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String copyable_body;

        @WireField(adapter = "com.squareup.protos.franklin.ui.ReceiptSection$DetailRow$DetailTreatment#ADAPTER", schemaIndex = 4, tag = 5)
        public final DetailTreatment detail_treatment;

        @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 2, tag = 3)
        public final Icon icon;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
        public final String subtitle;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$DetailRow$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$DetailRow;", "<init>", "()V", "title", "", "subtitle", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "copyable_body", "detail_treatment", "Lcom/squareup/protos/franklin/ui/ReceiptSection$DetailRow$DetailTreatment;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String copyable_body;
            public DetailTreatment detail_treatment;
            public Icon icon;
            public String subtitle;
            public String title;

            @Override // com.squareup.wire.Message.Builder
            public DetailRow build() {
                return new DetailRow(this.title, this.subtitle, this.icon, this.copyable_body, this.detail_treatment, buildUnknownFields());
            }

            public final Builder copyable_body(String copyable_body) {
                this.copyable_body = copyable_body;
                return this;
            }

            public final Builder detail_treatment(DetailTreatment detail_treatment) {
                this.detail_treatment = detail_treatment;
                return this;
            }

            public final Builder icon(Icon icon) {
                this.icon = icon;
                return this;
            }

            public final Builder subtitle(String subtitle) {
                this.subtitle = subtitle;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DetailRow.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.ReceiptSection$DetailRow$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public ReceiptSection.DetailRow decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new ReceiptSection.DetailRow((String) obj, (String) obj2, (Icon) obj3, (String) obj4, (ReceiptSection.DetailRow.DetailTreatment) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            obj3 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, reader, obj3);
                        } else if (nextTag == 4) {
                            obj4 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 5) {
                            reader.readUnknownField(nextTag);
                        } else {
                            try {
                                obj5 = ReceiptSection.DetailRow.DetailTreatment.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ReceiptSection.DetailRow value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                    Icon.ADAPTER.encodeWithTag(writer, 3, value.icon);
                    protoAdapter2.encodeWithTag(writer, 4, value.copyable_body);
                    ReceiptSection.DetailRow.DetailTreatment.ADAPTER.encodeWithTag(writer, 5, value.detail_treatment);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ReceiptSection.DetailRow value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return ReceiptSection.DetailRow.DetailTreatment.ADAPTER.encodedSizeWithTag(5, value.detail_treatment) + protoAdapter2.encodedSizeWithTag(4, value.copyable_body) + Icon.ADAPTER.encodedSizeWithTag(3, value.icon) + protoAdapter2.encodedSizeWithTag(2, value.subtitle) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ReceiptSection.DetailRow redact(ReceiptSection.DetailRow value) {
                    value.getClass();
                    Icon icon = value.icon;
                    return ReceiptSection.DetailRow.copy$default(value, null, null, icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null, null, null, ByteString.EMPTY, 24, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ReceiptSection.DetailRow value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ReceiptSection.DetailRow.DetailTreatment.ADAPTER.encodeWithTag(writer, 5, value.detail_treatment);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 4, value.copyable_body);
                    Icon.ADAPTER.encodeWithTag(writer, 3, value.icon);
                    protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ DetailRow(String str, String str2, Icon icon, String str3, DetailTreatment detailTreatment, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : icon, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : detailTreatment, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ DetailRow copy$default(DetailRow detailRow, String str, String str2, Icon icon, String str3, DetailTreatment detailTreatment, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = detailRow.title;
            }
            if ((i & 2) != 0) {
                str2 = detailRow.subtitle;
            }
            if ((i & 4) != 0) {
                icon = detailRow.icon;
            }
            if ((i & 8) != 0) {
                str3 = detailRow.copyable_body;
            }
            if ((i & 16) != 0) {
                detailTreatment = detailRow.detail_treatment;
            }
            if ((i & 32) != 0) {
                byteString = detailRow.unknownFields();
            }
            DetailTreatment detailTreatment2 = detailTreatment;
            ByteString byteString2 = byteString;
            return detailRow.copy(str, str2, icon, str3, detailTreatment2, byteString2);
        }

        public final DetailRow copy(String title, String subtitle, Icon icon, String copyable_body, DetailTreatment detail_treatment, ByteString unknownFields) {
            unknownFields.getClass();
            return new DetailRow(title, subtitle, icon, copyable_body, detail_treatment, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof DetailRow)) {
                return false;
            }
            DetailRow detailRow = (DetailRow) other;
            return Intrinsics.areEqual(unknownFields(), detailRow.unknownFields()) && Intrinsics.areEqual(this.title, detailRow.title) && Intrinsics.areEqual(this.subtitle, detailRow.subtitle) && Intrinsics.areEqual(this.icon, detailRow.icon) && Intrinsics.areEqual(this.copyable_body, detailRow.copyable_body) && this.detail_treatment == detailRow.detail_treatment;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.subtitle;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Icon icon = this.icon;
            int hashCode4 = (hashCode3 + (icon != null ? icon.hashCode() : 0)) * 37;
            String str3 = this.copyable_body;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
            DetailTreatment detailTreatment = this.detail_treatment;
            int hashCode6 = hashCode5 + (detailTreatment != null ? detailTreatment.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.subtitle = this.subtitle;
            builder.icon = this.icon;
            builder.copyable_body = this.copyable_body;
            builder.detail_treatment = this.detail_treatment;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.title != null) {
                arrayList.add("title=██");
            }
            if (this.subtitle != null) {
                arrayList.add("subtitle=██");
            }
            Icon icon = this.icon;
            if (icon != null) {
                Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
            }
            String str = this.copyable_body;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "copyable_body=", arrayList);
            }
            DetailTreatment detailTreatment = this.detail_treatment;
            if (detailTreatment != null) {
                arrayList.add("detail_treatment=" + detailTreatment);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "DetailRow{", "}", 0, null, null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$DetailRow$DetailTreatment;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STANDARD", "WARNING", "DANGER", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class DetailTreatment implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ DetailTreatment[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final int value;
            public static final DetailTreatment STANDARD = new DetailTreatment("STANDARD", 0, 1);
            public static final DetailTreatment WARNING = new DetailTreatment("WARNING", 1, 2);
            public static final DetailTreatment DANGER = new DetailTreatment("DANGER", 2, 3);

            private static final /* synthetic */ DetailTreatment[] $values() {
                return new DetailTreatment[]{STANDARD, WARNING, DANGER};
            }

            static {
                DetailTreatment[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DetailTreatment.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.ReceiptSection$DetailRow$DetailTreatment$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public ReceiptSection.DetailRow.DetailTreatment fromValue(int value) {
                        return ReceiptSection.DetailRow.DetailTreatment.INSTANCE.fromValue(value);
                    }
                };
            }

            private DetailTreatment(String str, int i, int i2) {
                this.value = i2;
            }

            public static final DetailTreatment fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static DetailTreatment valueOf(String str) {
                return (DetailTreatment) Enum.valueOf(DetailTreatment.class, str);
            }

            public static DetailTreatment[] values() {
                return (DetailTreatment[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$DetailRow$DetailTreatment$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$DetailRow$DetailTreatment;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final DetailTreatment fromValue(int value) {
                    if (value == 1) {
                        return DetailTreatment.STANDARD;
                    }
                    if (value == 2) {
                        return DetailTreatment.WARNING;
                    }
                    if (value != 3) {
                        return null;
                    }
                    return DetailTreatment.DANGER;
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$DetailRow$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$DetailRow$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/ReceiptSection$DetailRow;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/ReceiptSection$DetailRow;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ DetailRow build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public DetailRow() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DetailRow(String str, String str2, Icon icon, String str3, DetailTreatment detailTreatment, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.subtitle = str2;
            this.icon = icon;
            this.copyable_body = str3;
            this.detail_treatment = detailTreatment;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0014\u0015\u0016\u0017B!\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$ItemsGroup;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ItemsGroup$Builder;", "items", "", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ItemsGroup$Item;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "ItemTreatment", "Item", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ItemsGroup extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ItemsGroup> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.ui.ReceiptSection$ItemsGroup$Item#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        public final List<Item> items;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$ItemsGroup$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ItemsGroup;", "<init>", "()V", "items", "", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ItemsGroup$Item;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<Item> items = EmptyList.INSTANCE;

            @Override // com.squareup.wire.Message.Builder
            public ItemsGroup build() {
                return new ItemsGroup(this.items, buildUnknownFields());
            }

            public final Builder items(List<Item> items) {
                items.getClass();
                TransactorKt.checkElementsNotNull(items);
                this.items = items;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ItemsGroup.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.ReceiptSection$ItemsGroup$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public ReceiptSection.ItemsGroup decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new ReceiptSection.ItemsGroup(m, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            m.add(ReceiptSection.ItemsGroup.Item.ADAPTER.decode(reader));
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ReceiptSection.ItemsGroup value) {
                    writer.getClass();
                    value.getClass();
                    ReceiptSection.ItemsGroup.Item.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.items);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ReceiptSection.ItemsGroup value) {
                    value.getClass();
                    return ReceiptSection.ItemsGroup.Item.ADAPTER.asRepeated().encodedSizeWithTag(1, value.items) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ReceiptSection.ItemsGroup redact(ReceiptSection.ItemsGroup value) {
                    value.getClass();
                    return value.copy(TransactorKt.m1169redactElements(value.items, ReceiptSection.ItemsGroup.Item.ADAPTER), ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ReceiptSection.ItemsGroup value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ReceiptSection.ItemsGroup.Item.ADAPTER.asRepeated().encodeWithTag(writer, 1, value.items);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ItemsGroup(List<Item> list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.items = TransactorKt.immutableCopyOf("items", list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ItemsGroup copy$default(ItemsGroup itemsGroup, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = itemsGroup.items;
            }
            if ((i & 2) != 0) {
                byteString = itemsGroup.unknownFields();
            }
            return itemsGroup.copy(list, byteString);
        }

        public final ItemsGroup copy(List<Item> items, ByteString unknownFields) {
            items.getClass();
            unknownFields.getClass();
            return new ItemsGroup(items, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ItemsGroup)) {
                return false;
            }
            ItemsGroup itemsGroup = (ItemsGroup) other;
            return Intrinsics.areEqual(unknownFields(), itemsGroup.unknownFields()) && Intrinsics.areEqual(this.items, itemsGroup.items);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.items.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.items = this.items;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.items.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("items=", arrayList, this.items);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ItemsGroup{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0004H\u0016J4\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$ItemsGroup$Item;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ItemsGroup$Item$Builder;", AnnotatedPrivateKey.LABEL, "", "value", "treatment", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ItemsGroup$ItemTreatment;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/franklin/ui/ReceiptSection$ItemsGroup$ItemTreatment;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Item extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<Item> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String label;

            @WireField(adapter = "com.squareup.protos.franklin.ui.ReceiptSection$ItemsGroup$ItemTreatment#ADAPTER", schemaIndex = 2, tag = 3)
            public final ItemTreatment treatment;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
            public final String value;

            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$ItemsGroup$Item$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ItemsGroup$Item;", "<init>", "()V", AnnotatedPrivateKey.LABEL, "", "value", "treatment", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ItemsGroup$ItemTreatment;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String label;
                public ItemTreatment treatment;
                public String value;

                @Override // com.squareup.wire.Message.Builder
                public Item build() {
                    return new Item(this.label, this.value, this.treatment, buildUnknownFields());
                }

                public final Builder label(String label) {
                    this.label = label;
                    return this;
                }

                public final Builder treatment(ItemTreatment treatment) {
                    this.treatment = treatment;
                    return this;
                }

                public final Builder value(String value) {
                    this.value = value;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Item.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.ReceiptSection$ItemsGroup$Item$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public ReceiptSection.ItemsGroup.Item decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new ReceiptSection.ItemsGroup.Item((String) obj, (String) obj2, (ReceiptSection.ItemsGroup.ItemTreatment) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag == 2) {
                                obj2 = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag != 3) {
                                reader.readUnknownField(nextTag);
                            } else {
                                try {
                                    obj3 = ReceiptSection.ItemsGroup.ItemTreatment.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, ReceiptSection.ItemsGroup.Item value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.label);
                        protoAdapter2.encodeWithTag(writer, 2, value.value);
                        ReceiptSection.ItemsGroup.ItemTreatment.ADAPTER.encodeWithTag(writer, 3, value.treatment);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(ReceiptSection.ItemsGroup.Item value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return ReceiptSection.ItemsGroup.ItemTreatment.ADAPTER.encodedSizeWithTag(3, value.treatment) + protoAdapter2.encodedSizeWithTag(2, value.value) + protoAdapter2.encodedSizeWithTag(1, value.label) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public ReceiptSection.ItemsGroup.Item redact(ReceiptSection.ItemsGroup.Item value) {
                        value.getClass();
                        return ReceiptSection.ItemsGroup.Item.copy$default(value, null, null, null, ByteString.EMPTY, 5, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, ReceiptSection.ItemsGroup.Item value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ReceiptSection.ItemsGroup.ItemTreatment.ADAPTER.encodeWithTag(writer, 3, value.treatment);
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 2, value.value);
                        protoAdapter2.encodeWithTag(writer, 1, value.label);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ Item(String str, String str2, ItemTreatment itemTreatment, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : itemTreatment, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ Item copy$default(Item item, String str, String str2, ItemTreatment itemTreatment, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = item.label;
                }
                if ((i & 2) != 0) {
                    str2 = item.value;
                }
                if ((i & 4) != 0) {
                    itemTreatment = item.treatment;
                }
                if ((i & 8) != 0) {
                    byteString = item.unknownFields();
                }
                return item.copy(str, str2, itemTreatment, byteString);
            }

            public final Item copy(String label, String value, ItemTreatment treatment, ByteString unknownFields) {
                unknownFields.getClass();
                return new Item(label, value, treatment, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Item)) {
                    return false;
                }
                Item item = (Item) other;
                return Intrinsics.areEqual(unknownFields(), item.unknownFields()) && Intrinsics.areEqual(this.label, item.label) && Intrinsics.areEqual(this.value, item.value) && this.treatment == item.treatment;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.label;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.value;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                ItemTreatment itemTreatment = this.treatment;
                int hashCode4 = hashCode3 + (itemTreatment != null ? itemTreatment.hashCode() : 0);
                this.hashCode = hashCode4;
                return hashCode4;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.label = this.label;
                builder.value = this.value;
                builder.treatment = this.treatment;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.label;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
                }
                if (this.value != null) {
                    arrayList.add("value=██");
                }
                ItemTreatment itemTreatment = this.treatment;
                if (itemTreatment != null) {
                    arrayList.add("treatment=" + itemTreatment);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "Item{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$ItemsGroup$Item$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ItemsGroup$Item$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ItemsGroup$Item;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/ReceiptSection$ItemsGroup$Item;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ Item build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public Item() {
                this(null, null, null, null, 15, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Item(String str, String str2, ItemTreatment itemTreatment, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.label = str;
                this.value = str2;
                this.treatment = itemTreatment;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$ItemsGroup$ItemTreatment;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NORMAL", "STRIKETHROUGH", "BOLD", "SUBTLE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ItemTreatment implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ ItemTreatment[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final int value;
            public static final ItemTreatment NORMAL = new ItemTreatment("NORMAL", 0, 1);
            public static final ItemTreatment STRIKETHROUGH = new ItemTreatment("STRIKETHROUGH", 1, 2);
            public static final ItemTreatment BOLD = new ItemTreatment("BOLD", 2, 3);
            public static final ItemTreatment SUBTLE = new ItemTreatment("SUBTLE", 3, 4);

            private static final /* synthetic */ ItemTreatment[] $values() {
                return new ItemTreatment[]{NORMAL, STRIKETHROUGH, BOLD, SUBTLE};
            }

            static {
                ItemTreatment[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ItemTreatment.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.ReceiptSection$ItemsGroup$ItemTreatment$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public ReceiptSection.ItemsGroup.ItemTreatment fromValue(int value) {
                        return ReceiptSection.ItemsGroup.ItemTreatment.INSTANCE.fromValue(value);
                    }
                };
            }

            private ItemTreatment(String str, int i, int i2) {
                this.value = i2;
            }

            public static final ItemTreatment fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static ItemTreatment valueOf(String str) {
                return (ItemTreatment) Enum.valueOf(ItemTreatment.class, str);
            }

            public static ItemTreatment[] values() {
                return (ItemTreatment[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$ItemsGroup$ItemTreatment$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ItemsGroup$ItemTreatment;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final ItemTreatment fromValue(int value) {
                    if (value == 1) {
                        return ItemTreatment.NORMAL;
                    }
                    if (value == 2) {
                        return ItemTreatment.STRIKETHROUGH;
                    }
                    if (value == 3) {
                        return ItemTreatment.BOLD;
                    }
                    if (value != 4) {
                        return null;
                    }
                    return ItemTreatment.SUBTLE;
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$ItemsGroup$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ItemsGroup$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ItemsGroup;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/ReceiptSection$ItemsGroup;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ItemsGroup build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ItemsGroup(List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EmptyList.INSTANCE : list, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public ItemsGroup() {
            this(null, null, 3, null);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u001a\u001b\u001c\u001dBA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u00020\u0002H\u0016J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0082\u0004J\n\u0010\u0014\u001a\u00020\u0015H\u0096\u0080\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0016JE\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\u0019R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000eR\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$Builder;", "leading_text_stack", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$TextStack;", "trailing_text_stack", "progress_percentage", "", "progress_treatment", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$ProgressTreatment;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$TextStack;Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$TextStack;Ljava/lang/Float;Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$ProgressTreatment;Lokio/ByteString;)V", "Ljava/lang/Float;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "(Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$TextStack;Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$TextStack;Ljava/lang/Float;Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$ProgressTreatment;Lokio/ByteString;)Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow;", "Builder", "Companion", "ProgressTreatment", "TextStack", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ProgressRow extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ProgressRow> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.ui.ReceiptSection$ProgressRow$TextStack#ADAPTER", schemaIndex = 0, tag = 1)
        public final TextStack leading_text_stack;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 2, tag = 3)
        public final Float progress_percentage;

        @WireField(adapter = "com.squareup.protos.franklin.ui.ReceiptSection$ProgressRow$ProgressTreatment#ADAPTER", schemaIndex = 3, tag = 4)
        public final ProgressTreatment progress_treatment;

        @WireField(adapter = "com.squareup.protos.franklin.ui.ReceiptSection$ProgressRow$TextStack#ADAPTER", schemaIndex = 1, tag = 2)
        public final TextStack trailing_text_stack;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\rJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow;", "<init>", "()V", "leading_text_stack", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$TextStack;", "trailing_text_stack", "progress_percentage", "", "Ljava/lang/Float;", "progress_treatment", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$ProgressTreatment;", "(Ljava/lang/Float;)Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public TextStack leading_text_stack;
            public Float progress_percentage;
            public ProgressTreatment progress_treatment;
            public TextStack trailing_text_stack;

            @Override // com.squareup.wire.Message.Builder
            public ProgressRow build() {
                return new ProgressRow(this.leading_text_stack, this.trailing_text_stack, this.progress_percentage, this.progress_treatment, buildUnknownFields());
            }

            public final Builder leading_text_stack(TextStack leading_text_stack) {
                this.leading_text_stack = leading_text_stack;
                return this;
            }

            public final Builder progress_percentage(Float progress_percentage) {
                this.progress_percentage = progress_percentage;
                return this;
            }

            public final Builder progress_treatment(ProgressTreatment progress_treatment) {
                this.progress_treatment = progress_treatment;
                return this;
            }

            public final Builder trailing_text_stack(TextStack trailing_text_stack) {
                this.trailing_text_stack = trailing_text_stack;
                return this;
            }
        }

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0017\u0018\u0019BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0082\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\b\u0010\u0015\u001a\u00020\u0004H\u0016J@\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$TextStack;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$TextStack$Builder;", AnnotatedPrivateKey.LABEL, "", "value", "value_color", "Lcom/squareup/protos/cash/ui/Color;", "treatment", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$TextStack$ValueTreatment;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/ui/Color;Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$TextStack$ValueTreatment;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "ValueTreatment", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class TextStack extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<TextStack> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String label;

            @WireField(adapter = "com.squareup.protos.franklin.ui.ReceiptSection$ProgressRow$TextStack$ValueTreatment#ADAPTER", schemaIndex = 3, tag = 4)
            public final ValueTreatment treatment;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
            public final String value;

            @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 2, tag = 3)
            public final Color value_color;

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$TextStack$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$TextStack;", "<init>", "()V", AnnotatedPrivateKey.LABEL, "", "value", "value_color", "Lcom/squareup/protos/cash/ui/Color;", "treatment", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$TextStack$ValueTreatment;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String label;
                public ValueTreatment treatment;
                public String value;
                public Color value_color;

                @Override // com.squareup.wire.Message.Builder
                public TextStack build() {
                    return new TextStack(this.label, this.value, this.value_color, this.treatment, buildUnknownFields());
                }

                public final Builder label(String label) {
                    this.label = label;
                    return this;
                }

                public final Builder treatment(ValueTreatment treatment) {
                    this.treatment = treatment;
                    return this;
                }

                public final Builder value(String value) {
                    this.value = value;
                    return this;
                }

                public final Builder value_color(Color value_color) {
                    this.value_color = value_color;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TextStack.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.ReceiptSection$ProgressRow$TextStack$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public ReceiptSection.ProgressRow.TextStack decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        Object obj4 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new ReceiptSection.ProgressRow.TextStack((String) obj, (String) obj2, (Color) obj3, (ReceiptSection.ProgressRow.TextStack.ValueTreatment) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag == 2) {
                                obj2 = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag == 3) {
                                obj3 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj3);
                            } else if (nextTag != 4) {
                                reader.readUnknownField(nextTag);
                            } else {
                                try {
                                    obj4 = ReceiptSection.ProgressRow.TextStack.ValueTreatment.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, ReceiptSection.ProgressRow.TextStack value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.label);
                        protoAdapter2.encodeWithTag(writer, 2, value.value);
                        Color.ADAPTER.encodeWithTag(writer, 3, value.value_color);
                        ReceiptSection.ProgressRow.TextStack.ValueTreatment.ADAPTER.encodeWithTag(writer, 4, value.treatment);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(ReceiptSection.ProgressRow.TextStack value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        return ReceiptSection.ProgressRow.TextStack.ValueTreatment.ADAPTER.encodedSizeWithTag(4, value.treatment) + Color.ADAPTER.encodedSizeWithTag(3, value.value_color) + protoAdapter2.encodedSizeWithTag(2, value.value) + protoAdapter2.encodedSizeWithTag(1, value.label) + size$okio;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public ReceiptSection.ProgressRow.TextStack redact(ReceiptSection.ProgressRow.TextStack value) {
                        value.getClass();
                        Color color = value.value_color;
                        return ReceiptSection.ProgressRow.TextStack.copy$default(value, null, null, color != null ? (Color) Color.ADAPTER.redact(color) : null, null, ByteString.EMPTY, 11, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, ReceiptSection.ProgressRow.TextStack value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ReceiptSection.ProgressRow.TextStack.ValueTreatment.ADAPTER.encodeWithTag(writer, 4, value.treatment);
                        Color.ADAPTER.encodeWithTag(writer, 3, value.value_color);
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 2, value.value);
                        protoAdapter2.encodeWithTag(writer, 1, value.label);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ TextStack(String str, String str2, Color color, ValueTreatment valueTreatment, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : color, (i & 8) != 0 ? null : valueTreatment, (i & 16) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ TextStack copy$default(TextStack textStack, String str, String str2, Color color, ValueTreatment valueTreatment, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = textStack.label;
                }
                if ((i & 2) != 0) {
                    str2 = textStack.value;
                }
                if ((i & 4) != 0) {
                    color = textStack.value_color;
                }
                if ((i & 8) != 0) {
                    valueTreatment = textStack.treatment;
                }
                if ((i & 16) != 0) {
                    byteString = textStack.unknownFields();
                }
                ByteString byteString2 = byteString;
                Color color2 = color;
                return textStack.copy(str, str2, color2, valueTreatment, byteString2);
            }

            public final TextStack copy(String label, String value, Color value_color, ValueTreatment treatment, ByteString unknownFields) {
                unknownFields.getClass();
                return new TextStack(label, value, value_color, treatment, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof TextStack)) {
                    return false;
                }
                TextStack textStack = (TextStack) other;
                return Intrinsics.areEqual(unknownFields(), textStack.unknownFields()) && Intrinsics.areEqual(this.label, textStack.label) && Intrinsics.areEqual(this.value, textStack.value) && Intrinsics.areEqual(this.value_color, textStack.value_color) && this.treatment == textStack.treatment;
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.label;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                String str2 = this.value;
                int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
                Color color = this.value_color;
                int hashCode4 = (hashCode3 + (color != null ? color.hashCode() : 0)) * 37;
                ValueTreatment valueTreatment = this.treatment;
                int hashCode5 = hashCode4 + (valueTreatment != null ? valueTreatment.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.label = this.label;
                builder.value = this.value;
                builder.value_color = this.value_color;
                builder.treatment = this.treatment;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.label;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
                }
                String str2 = this.value;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "value=", arrayList);
                }
                Color color = this.value_color;
                if (color != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("value_color=", color, arrayList);
                }
                ValueTreatment valueTreatment = this.treatment;
                if (valueTreatment != null) {
                    arrayList.add("treatment=" + valueTreatment);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "TextStack{", "}", 0, null, null, 56);
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$TextStack$ValueTreatment;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NORMAL", "STRIKETHROUGH", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class ValueTreatment implements WireEnum {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ ValueTreatment[] $VALUES;
                public static final ProtoAdapter ADAPTER;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE;
                public static final ValueTreatment NORMAL = new ValueTreatment("NORMAL", 0, 1);
                public static final ValueTreatment STRIKETHROUGH = new ValueTreatment("STRIKETHROUGH", 1, 2);
                private final int value;

                private static final /* synthetic */ ValueTreatment[] $values() {
                    return new ValueTreatment[]{NORMAL, STRIKETHROUGH};
                }

                static {
                    ValueTreatment[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = Tags.enumEntries($values);
                    INSTANCE = new Companion(null);
                    final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ValueTreatment.class);
                    final Syntax syntax = Syntax.PROTO_2;
                    ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.ReceiptSection$ProgressRow$TextStack$ValueTreatment$Companion$ADAPTER$1
                        @Override // com.squareup.wire.EnumAdapter
                        public ReceiptSection.ProgressRow.TextStack.ValueTreatment fromValue(int value) {
                            return ReceiptSection.ProgressRow.TextStack.ValueTreatment.INSTANCE.fromValue(value);
                        }
                    };
                }

                private ValueTreatment(String str, int i, int i2) {
                    this.value = i2;
                }

                public static final ValueTreatment fromValue(int i) {
                    return INSTANCE.fromValue(i);
                }

                public static EnumEntries getEntries() {
                    return $ENTRIES;
                }

                public static ValueTreatment valueOf(String str) {
                    return (ValueTreatment) Enum.valueOf(ValueTreatment.class, str);
                }

                public static ValueTreatment[] values() {
                    return (ValueTreatment[]) $VALUES.clone();
                }

                @Override // com.squareup.wire.WireEnum
                public int getValue() {
                    return this.value;
                }

                @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$TextStack$ValueTreatment$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$TextStack$ValueTreatment;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final ValueTreatment fromValue(int value) {
                        if (value == 1) {
                            return ValueTreatment.NORMAL;
                        }
                        if (value != 2) {
                            return null;
                        }
                        return ValueTreatment.STRIKETHROUGH;
                    }

                    private Companion() {
                    }
                }
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$TextStack$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$TextStack$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$TextStack;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$TextStack;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ TextStack build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public TextStack() {
                this(null, null, null, null, null, 31, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TextStack(String str, String str2, Color color, ValueTreatment valueTreatment, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.label = str;
                this.value = str2;
                this.value_color = color;
                this.treatment = valueTreatment;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ProgressRow.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.ReceiptSection$ProgressRow$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public ReceiptSection.ProgressRow decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new ReceiptSection.ProgressRow((ReceiptSection.ProgressRow.TextStack) obj, (ReceiptSection.ProgressRow.TextStack) obj2, (Float) obj3, (ReceiptSection.ProgressRow.ProgressTreatment) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(ReceiptSection.ProgressRow.TextStack.ADAPTER, reader, obj);
                        } else if (nextTag == 2) {
                            obj2 = TransactorKt.decodeMessageOrMerge(ReceiptSection.ProgressRow.TextStack.ADAPTER, reader, obj2);
                        } else if (nextTag == 3) {
                            obj3 = ProtoAdapter.FLOAT.decode(reader);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            try {
                                obj4 = ReceiptSection.ProgressRow.ProgressTreatment.ADAPTER.decode(reader);
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ReceiptSection.ProgressRow value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ReceiptSection.ProgressRow.TextStack.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 1, value.leading_text_stack);
                    protoAdapter2.encodeWithTag(writer, 2, value.trailing_text_stack);
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, value.progress_percentage);
                    ReceiptSection.ProgressRow.ProgressTreatment.ADAPTER.encodeWithTag(writer, 4, value.progress_treatment);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ReceiptSection.ProgressRow value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ReceiptSection.ProgressRow.TextStack.ADAPTER;
                    return ReceiptSection.ProgressRow.ProgressTreatment.ADAPTER.encodedSizeWithTag(4, value.progress_treatment) + ProtoAdapter.FLOAT.encodedSizeWithTag(3, value.progress_percentage) + protoAdapter2.encodedSizeWithTag(2, value.trailing_text_stack) + protoAdapter2.encodedSizeWithTag(1, value.leading_text_stack) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ReceiptSection.ProgressRow redact(ReceiptSection.ProgressRow value) {
                    value.getClass();
                    ReceiptSection.ProgressRow.TextStack textStack = value.leading_text_stack;
                    ReceiptSection.ProgressRow.TextStack textStack2 = textStack != null ? (ReceiptSection.ProgressRow.TextStack) ReceiptSection.ProgressRow.TextStack.ADAPTER.redact(textStack) : null;
                    ReceiptSection.ProgressRow.TextStack textStack3 = value.trailing_text_stack;
                    return ReceiptSection.ProgressRow.copy$default(value, textStack2, textStack3 != null ? (ReceiptSection.ProgressRow.TextStack) ReceiptSection.ProgressRow.TextStack.ADAPTER.redact(textStack3) : null, null, null, ByteString.EMPTY, 12, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ReceiptSection.ProgressRow value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ReceiptSection.ProgressRow.ProgressTreatment.ADAPTER.encodeWithTag(writer, 4, value.progress_treatment);
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, value.progress_percentage);
                    ProtoAdapter protoAdapter2 = ReceiptSection.ProgressRow.TextStack.ADAPTER;
                    protoAdapter2.encodeWithTag(writer, 2, value.trailing_text_stack);
                    protoAdapter2.encodeWithTag(writer, 1, value.leading_text_stack);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ProgressRow(TextStack textStack, TextStack textStack2, Float f, ProgressTreatment progressTreatment, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : textStack, (i & 2) != 0 ? null : textStack2, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : progressTreatment, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ProgressRow copy$default(ProgressRow progressRow, TextStack textStack, TextStack textStack2, Float f, ProgressTreatment progressTreatment, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                textStack = progressRow.leading_text_stack;
            }
            if ((i & 2) != 0) {
                textStack2 = progressRow.trailing_text_stack;
            }
            if ((i & 4) != 0) {
                f = progressRow.progress_percentage;
            }
            if ((i & 8) != 0) {
                progressTreatment = progressRow.progress_treatment;
            }
            if ((i & 16) != 0) {
                byteString = progressRow.unknownFields();
            }
            ByteString byteString2 = byteString;
            Float f2 = f;
            return progressRow.copy(textStack, textStack2, f2, progressTreatment, byteString2);
        }

        public final ProgressRow copy(TextStack leading_text_stack, TextStack trailing_text_stack, Float progress_percentage, ProgressTreatment progress_treatment, ByteString unknownFields) {
            unknownFields.getClass();
            return new ProgressRow(leading_text_stack, trailing_text_stack, progress_percentage, progress_treatment, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ProgressRow)) {
                return false;
            }
            ProgressRow progressRow = (ProgressRow) other;
            return Intrinsics.areEqual(unknownFields(), progressRow.unknownFields()) && Intrinsics.areEqual(this.leading_text_stack, progressRow.leading_text_stack) && Intrinsics.areEqual(this.trailing_text_stack, progressRow.trailing_text_stack) && Intrinsics.areEqual(this.progress_percentage, progressRow.progress_percentage) && this.progress_treatment == progressRow.progress_treatment;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            TextStack textStack = this.leading_text_stack;
            int hashCode2 = (hashCode + (textStack != null ? textStack.hashCode() : 0)) * 37;
            TextStack textStack2 = this.trailing_text_stack;
            int hashCode3 = (hashCode2 + (textStack2 != null ? textStack2.hashCode() : 0)) * 37;
            Float f = this.progress_percentage;
            int hashCode4 = (hashCode3 + (f != null ? Float.hashCode(f.floatValue()) : 0)) * 37;
            ProgressTreatment progressTreatment = this.progress_treatment;
            int hashCode5 = hashCode4 + (progressTreatment != null ? progressTreatment.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.leading_text_stack = this.leading_text_stack;
            builder.trailing_text_stack = this.trailing_text_stack;
            builder.progress_percentage = this.progress_percentage;
            builder.progress_treatment = this.progress_treatment;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            TextStack textStack = this.leading_text_stack;
            if (textStack != null) {
                arrayList.add("leading_text_stack=" + textStack);
            }
            TextStack textStack2 = this.trailing_text_stack;
            if (textStack2 != null) {
                arrayList.add("trailing_text_stack=" + textStack2);
            }
            Float f = this.progress_percentage;
            if (f != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("progress_percentage=", f, arrayList);
            }
            ProgressTreatment progressTreatment = this.progress_treatment;
            if (progressTreatment != null) {
                arrayList.add("progress_treatment=" + progressTreatment);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ProgressRow{", "}", 0, null, null, 56);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$ProgressTreatment;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NORMAL", "ATTENTION", "LENDING_NORMAL", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class ProgressTreatment implements WireEnum {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ ProgressTreatment[] $VALUES;
            public static final ProtoAdapter ADAPTER;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final int value;
            public static final ProgressTreatment NORMAL = new ProgressTreatment("NORMAL", 0, 1);
            public static final ProgressTreatment ATTENTION = new ProgressTreatment("ATTENTION", 1, 2);
            public static final ProgressTreatment LENDING_NORMAL = new ProgressTreatment("LENDING_NORMAL", 2, 3);

            private static final /* synthetic */ ProgressTreatment[] $values() {
                return new ProgressTreatment[]{NORMAL, ATTENTION, LENDING_NORMAL};
            }

            static {
                ProgressTreatment[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Tags.enumEntries($values);
                INSTANCE = new Companion(null);
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ProgressTreatment.class);
                final Syntax syntax = Syntax.PROTO_2;
                ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.ReceiptSection$ProgressRow$ProgressTreatment$Companion$ADAPTER$1
                    @Override // com.squareup.wire.EnumAdapter
                    public ReceiptSection.ProgressRow.ProgressTreatment fromValue(int value) {
                        return ReceiptSection.ProgressRow.ProgressTreatment.INSTANCE.fromValue(value);
                    }
                };
            }

            private ProgressTreatment(String str, int i, int i2) {
                this.value = i2;
            }

            public static final ProgressTreatment fromValue(int i) {
                return INSTANCE.fromValue(i);
            }

            public static EnumEntries getEntries() {
                return $ENTRIES;
            }

            public static ProgressTreatment valueOf(String str) {
                return (ProgressTreatment) Enum.valueOf(ProgressTreatment.class, str);
            }

            public static ProgressTreatment[] values() {
                return (ProgressTreatment[]) $VALUES.clone();
            }

            @Override // com.squareup.wire.WireEnum
            public int getValue() {
                return this.value;
            }

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$ProgressTreatment$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$ProgressTreatment;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final ProgressTreatment fromValue(int value) {
                    if (value == 1) {
                        return ProgressTreatment.NORMAL;
                    }
                    if (value == 2) {
                        return ProgressTreatment.ATTENTION;
                    }
                    if (value != 3) {
                        return null;
                    }
                    return ProgressTreatment.LENDING_NORMAL;
                }

                private Companion() {
                }
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ProgressRow build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ProgressRow() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProgressRow(TextStack textStack, TextStack textStack2, Float f, ProgressTreatment progressTreatment, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.leading_text_stack = textStack;
            this.trailing_text_stack = textStack2;
            this.progress_percentage = f;
            this.progress_treatment = progressTreatment;
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0016\u0017\u0018\u0019B-\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0014H\u0016J,\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$Builder;", "timeline", "Lcom/squareup/protos/franklin/ui/Timeline;", "event_details_overlays", "", "Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$EventDetailsOverlay;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/ui/Timeline;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Companion", "EventDetailsOverlay", "UnorderedListItem", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TimelineEntry extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TimelineEntry> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.franklin.ui.ReceiptSection$TimelineEntry$EventDetailsOverlay#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
        public final List<EventDetailsOverlay> event_details_overlays;

        @WireField(adapter = "com.squareup.protos.franklin.ui.Timeline#ADAPTER", schemaIndex = 0, tag = 1)
        public final Timeline timeline;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry;", "<init>", "()V", "timeline", "Lcom/squareup/protos/franklin/ui/Timeline;", "event_details_overlays", "", "Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$EventDetailsOverlay;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<EventDetailsOverlay> event_details_overlays = EmptyList.INSTANCE;
            public Timeline timeline;

            @Override // com.squareup.wire.Message.Builder
            public TimelineEntry build() {
                return new TimelineEntry(this.timeline, this.event_details_overlays, buildUnknownFields());
            }

            public final Builder event_details_overlays(List<EventDetailsOverlay> event_details_overlays) {
                event_details_overlays.getClass();
                TransactorKt.checkElementsNotNull(event_details_overlays);
                this.event_details_overlays = event_details_overlays;
                return this;
            }

            public final Builder timeline(Timeline timeline) {
                this.timeline = timeline;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TimelineEntry.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.ReceiptSection$TimelineEntry$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public ReceiptSection.TimelineEntry decode(ProtoReader reader) {
                    ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new ReceiptSection.TimelineEntry((Timeline) obj, m, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(Timeline.ADAPTER, reader, obj);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            m.add(ReceiptSection.TimelineEntry.EventDetailsOverlay.ADAPTER.decode(reader));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ReceiptSection.TimelineEntry value) {
                    writer.getClass();
                    value.getClass();
                    Timeline.ADAPTER.encodeWithTag(writer, 1, value.timeline);
                    ReceiptSection.TimelineEntry.EventDetailsOverlay.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.event_details_overlays);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ReceiptSection.TimelineEntry value) {
                    value.getClass();
                    return ReceiptSection.TimelineEntry.EventDetailsOverlay.ADAPTER.asRepeated().encodedSizeWithTag(2, value.event_details_overlays) + Timeline.ADAPTER.encodedSizeWithTag(1, value.timeline) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ReceiptSection.TimelineEntry redact(ReceiptSection.TimelineEntry value) {
                    value.getClass();
                    Timeline timeline = value.timeline;
                    return value.copy(timeline != null ? (Timeline) Timeline.ADAPTER.redact(timeline) : null, TransactorKt.m1169redactElements(value.event_details_overlays, ReceiptSection.TimelineEntry.EventDetailsOverlay.ADAPTER), ByteString.EMPTY);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ReceiptSection.TimelineEntry value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ReceiptSection.TimelineEntry.EventDetailsOverlay.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.event_details_overlays);
                    Timeline.ADAPTER.encodeWithTag(writer, 1, value.timeline);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TimelineEntry(Timeline timeline, List<EventDetailsOverlay> list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.timeline = timeline;
            this.event_details_overlays = TransactorKt.immutableCopyOf("event_details_overlays", list);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TimelineEntry copy$default(TimelineEntry timelineEntry, Timeline timeline, List list, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                timeline = timelineEntry.timeline;
            }
            if ((i & 2) != 0) {
                list = timelineEntry.event_details_overlays;
            }
            if ((i & 4) != 0) {
                byteString = timelineEntry.unknownFields();
            }
            return timelineEntry.copy(timeline, list, byteString);
        }

        public final TimelineEntry copy(Timeline timeline, List<EventDetailsOverlay> event_details_overlays, ByteString unknownFields) {
            event_details_overlays.getClass();
            unknownFields.getClass();
            return new TimelineEntry(timeline, event_details_overlays, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TimelineEntry)) {
                return false;
            }
            TimelineEntry timelineEntry = (TimelineEntry) other;
            return Intrinsics.areEqual(unknownFields(), timelineEntry.unknownFields()) && Intrinsics.areEqual(this.timeline, timelineEntry.timeline) && Intrinsics.areEqual(this.event_details_overlays, timelineEntry.event_details_overlays);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Timeline timeline = this.timeline;
            int hashCode2 = this.event_details_overlays.hashCode() + ((hashCode + (timeline != null ? timeline.hashCode() : 0)) * 37);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.timeline = this.timeline;
            builder.event_details_overlays = this.event_details_overlays;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Timeline timeline = this.timeline;
            if (timeline != null) {
                arrayList.add("timeline=" + timeline);
            }
            if (!this.event_details_overlays.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("event_details_overlays=", arrayList, this.event_details_overlays);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TimelineEntry{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001e\u001f By\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0082\u0004J\n\u0010\u001a\u001a\u00020\u001bH\u0096\u0080\u0004J\b\u0010\u001c\u001a\u00020\u0004H\u0016Jx\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$EventDetailsOverlay;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$EventDetailsOverlay$Builder;", "event_id", "", "title", "Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$EventDetailsOverlay$Title;", "subtitle_text", "subtitle_text_color", "Lcom/squareup/protos/cash/ui/Color;", "body_text", "list_items", "", "Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$UnorderedListItem;", "legal_text", "legal_text_attribute_ranges", "Lcom/squareup/protos/franklin/ui/AttributeRange;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$EventDetailsOverlay$Title;Ljava/lang/String;Lcom/squareup/protos/cash/ui/Color;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Title", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class EventDetailsOverlay extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<EventDetailsOverlay> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 6)
            public final String body_text;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String event_id;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 8)
            public final String legal_text;

            @WireField(adapter = "com.squareup.protos.franklin.ui.AttributeRange#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 9)
            public final List<AttributeRange> legal_text_attribute_ranges;

            @WireField(adapter = "com.squareup.protos.franklin.ui.ReceiptSection$TimelineEntry$UnorderedListItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 7)
            public final List<UnorderedListItem> list_items;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 4)
            public final String subtitle_text;

            @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 3, tag = 5)
            public final Color subtitle_text_color;

            @WireSealedOneof(schemaIndex = 1)
            public final Title title;

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\r\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0011\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000eJ\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\u0013\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$EventDetailsOverlay$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$EventDetailsOverlay;", "<init>", "()V", "event_id", "", "title", "Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$EventDetailsOverlay$Title;", "subtitle_text", "subtitle_text_color", "Lcom/squareup/protos/cash/ui/Color;", "body_text", "list_items", "", "Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$UnorderedListItem;", "legal_text", "legal_text_attribute_ranges", "Lcom/squareup/protos/franklin/ui/AttributeRange;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String body_text;
                public String event_id;
                public String legal_text;
                public List<AttributeRange> legal_text_attribute_ranges;
                public List<UnorderedListItem> list_items;
                public String subtitle_text;
                public Color subtitle_text_color;
                public Title title;

                public Builder() {
                    EmptyList emptyList = EmptyList.INSTANCE;
                    this.list_items = emptyList;
                    this.legal_text_attribute_ranges = emptyList;
                }

                public final Builder body_text(String body_text) {
                    this.body_text = body_text;
                    return this;
                }

                @Override // com.squareup.wire.Message.Builder
                public EventDetailsOverlay build() {
                    return new EventDetailsOverlay(this.event_id, this.title, this.subtitle_text, this.subtitle_text_color, this.body_text, this.list_items, this.legal_text, this.legal_text_attribute_ranges, buildUnknownFields());
                }

                public final Builder event_id(String event_id) {
                    this.event_id = event_id;
                    return this;
                }

                public final Builder legal_text(String legal_text) {
                    this.legal_text = legal_text;
                    return this;
                }

                public final Builder legal_text_attribute_ranges(List<AttributeRange> legal_text_attribute_ranges) {
                    legal_text_attribute_ranges.getClass();
                    TransactorKt.checkElementsNotNull(legal_text_attribute_ranges);
                    this.legal_text_attribute_ranges = legal_text_attribute_ranges;
                    return this;
                }

                public final Builder list_items(List<UnorderedListItem> list_items) {
                    list_items.getClass();
                    TransactorKt.checkElementsNotNull(list_items);
                    this.list_items = list_items;
                    return this;
                }

                public final Builder subtitle_text(String subtitle_text) {
                    this.subtitle_text = subtitle_text;
                    return this;
                }

                public final Builder subtitle_text_color(Color subtitle_text_color) {
                    this.subtitle_text_color = subtitle_text_color;
                    return this;
                }

                public final Builder title(Title title) {
                    this.title = title;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(EventDetailsOverlay.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.ReceiptSection$TimelineEntry$EventDetailsOverlay$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public ReceiptSection.TimelineEntry.EventDetailsOverlay decode(ProtoReader reader) {
                        ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                        ArrayList arrayList = new ArrayList();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        ReceiptSection.TimelineEntry.EventDetailsOverlay.Title title = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        Object obj4 = null;
                        Object obj5 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new ReceiptSection.TimelineEntry.EventDetailsOverlay((String) obj, title, (String) obj2, (Color) obj3, (String) obj4, m, (String) obj5, arrayList, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            switch (nextTag) {
                                case 1:
                                    obj = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    title = new ReceiptSection.TimelineEntry.EventDetailsOverlay.Title.TitleText((String) ProtoAdapter.STRING.decode(reader));
                                    break;
                                case 3:
                                    title = new ReceiptSection.TimelineEntry.EventDetailsOverlay.Title.TitleTimestamp(((Number) ProtoAdapter.INT64.decode(reader)).longValue());
                                    break;
                                case 4:
                                    obj2 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 5:
                                    obj3 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj3);
                                    break;
                                case 6:
                                    obj4 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 7:
                                    m.add(ReceiptSection.TimelineEntry.UnorderedListItem.ADAPTER.decode(reader));
                                    break;
                                case 8:
                                    obj5 = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 9:
                                    arrayList.add(AttributeRange.ADAPTER.decode(reader));
                                    break;
                                default:
                                    reader.readUnknownField(nextTag);
                                    break;
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, ReceiptSection.TimelineEntry.EventDetailsOverlay value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ReceiptSection.TimelineEntry.EventDetailsOverlay.Title title = value.title;
                        if (title instanceof ReceiptSection.TimelineEntry.EventDetailsOverlay.Title.TitleText) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 2, ((ReceiptSection.TimelineEntry.EventDetailsOverlay.Title.TitleText) title).getValue());
                        } else if (title instanceof ReceiptSection.TimelineEntry.EventDetailsOverlay.Title.TitleTimestamp) {
                            ProtoAdapter.INT64.encodeWithTag(writer, 3, Long.valueOf(((ReceiptSection.TimelineEntry.EventDetailsOverlay.Title.TitleTimestamp) title).getValue()));
                        } else if (title != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        AttributeRange.ADAPTER.asRepeated().encodeWithTag(writer, 9, value.legal_text_attribute_ranges);
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 8, value.legal_text);
                        ReceiptSection.TimelineEntry.UnorderedListItem.ADAPTER.asRepeated().encodeWithTag(writer, 7, value.list_items);
                        protoAdapter2.encodeWithTag(writer, 6, value.body_text);
                        Color.ADAPTER.encodeWithTag(writer, 5, value.subtitle_text_color);
                        protoAdapter2.encodeWithTag(writer, 4, value.subtitle_text);
                        protoAdapter2.encodeWithTag(writer, 1, value.event_id);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(ReceiptSection.TimelineEntry.EventDetailsOverlay value) {
                        int encodedSizeWithTag;
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(1, value.event_id) + size$okio;
                        ReceiptSection.TimelineEntry.EventDetailsOverlay.Title title = value.title;
                        if (title instanceof ReceiptSection.TimelineEntry.EventDetailsOverlay.Title.TitleText) {
                            encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(2, ((ReceiptSection.TimelineEntry.EventDetailsOverlay.Title.TitleText) title).getValue());
                        } else {
                            if (!(title instanceof ReceiptSection.TimelineEntry.EventDetailsOverlay.Title.TitleTimestamp)) {
                                if (title != null) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return 0;
                                }
                                return AttributeRange.ADAPTER.asRepeated().encodedSizeWithTag(9, value.legal_text_attribute_ranges) + protoAdapter2.encodedSizeWithTag(8, value.legal_text) + ReceiptSection.TimelineEntry.UnorderedListItem.ADAPTER.asRepeated().encodedSizeWithTag(7, value.list_items) + protoAdapter2.encodedSizeWithTag(6, value.body_text) + Color.ADAPTER.encodedSizeWithTag(5, value.subtitle_text_color) + protoAdapter2.encodedSizeWithTag(4, value.subtitle_text) + encodedSizeWithTag2;
                            }
                            encodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(3, Long.valueOf(((ReceiptSection.TimelineEntry.EventDetailsOverlay.Title.TitleTimestamp) title).getValue()));
                        }
                        encodedSizeWithTag2 += encodedSizeWithTag;
                        return AttributeRange.ADAPTER.asRepeated().encodedSizeWithTag(9, value.legal_text_attribute_ranges) + protoAdapter2.encodedSizeWithTag(8, value.legal_text) + ReceiptSection.TimelineEntry.UnorderedListItem.ADAPTER.asRepeated().encodedSizeWithTag(7, value.list_items) + protoAdapter2.encodedSizeWithTag(6, value.body_text) + Color.ADAPTER.encodedSizeWithTag(5, value.subtitle_text_color) + protoAdapter2.encodedSizeWithTag(4, value.subtitle_text) + encodedSizeWithTag2;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public ReceiptSection.TimelineEntry.EventDetailsOverlay redact(ReceiptSection.TimelineEntry.EventDetailsOverlay value) {
                        value.getClass();
                        Color color = value.subtitle_text_color;
                        return ReceiptSection.TimelineEntry.EventDetailsOverlay.copy$default(value, null, null, null, color != null ? (Color) Color.ADAPTER.redact(color) : null, null, TransactorKt.m1169redactElements(value.list_items, ReceiptSection.TimelineEntry.UnorderedListItem.ADAPTER), null, TransactorKt.m1169redactElements(value.legal_text_attribute_ranges, AttributeRange.ADAPTER), ByteString.EMPTY, 87, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, ReceiptSection.TimelineEntry.EventDetailsOverlay value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.event_id);
                        protoAdapter2.encodeWithTag(writer, 4, value.subtitle_text);
                        Color.ADAPTER.encodeWithTag(writer, 5, value.subtitle_text_color);
                        protoAdapter2.encodeWithTag(writer, 6, value.body_text);
                        ReceiptSection.TimelineEntry.UnorderedListItem.ADAPTER.asRepeated().encodeWithTag(writer, 7, value.list_items);
                        protoAdapter2.encodeWithTag(writer, 8, value.legal_text);
                        AttributeRange.ADAPTER.asRepeated().encodeWithTag(writer, 9, value.legal_text_attribute_ranges);
                        ReceiptSection.TimelineEntry.EventDetailsOverlay.Title title = value.title;
                        if (title instanceof ReceiptSection.TimelineEntry.EventDetailsOverlay.Title.TitleText) {
                            protoAdapter2.encodeWithTag(writer, 2, ((ReceiptSection.TimelineEntry.EventDetailsOverlay.Title.TitleText) title).getValue());
                        } else if (title instanceof ReceiptSection.TimelineEntry.EventDetailsOverlay.Title.TitleTimestamp) {
                            ProtoAdapter.INT64.encodeWithTag(writer, 3, Long.valueOf(((ReceiptSection.TimelineEntry.EventDetailsOverlay.Title.TitleTimestamp) title).getValue()));
                        } else if (title != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        writer.writeBytes(value.unknownFields());
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public EventDetailsOverlay(String str, Title title, String str2, Color color, String str3, List list, String str4, List list2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : title, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : color, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? EmptyList.INSTANCE : list, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? EmptyList.INSTANCE : list2, (i & 256) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ EventDetailsOverlay copy$default(EventDetailsOverlay eventDetailsOverlay, String str, Title title, String str2, Color color, String str3, List list, String str4, List list2, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = eventDetailsOverlay.event_id;
                }
                if ((i & 2) != 0) {
                    title = eventDetailsOverlay.title;
                }
                if ((i & 4) != 0) {
                    str2 = eventDetailsOverlay.subtitle_text;
                }
                if ((i & 8) != 0) {
                    color = eventDetailsOverlay.subtitle_text_color;
                }
                if ((i & 16) != 0) {
                    str3 = eventDetailsOverlay.body_text;
                }
                if ((i & 32) != 0) {
                    list = eventDetailsOverlay.list_items;
                }
                if ((i & 64) != 0) {
                    str4 = eventDetailsOverlay.legal_text;
                }
                if ((i & 128) != 0) {
                    list2 = eventDetailsOverlay.legal_text_attribute_ranges;
                }
                if ((i & 256) != 0) {
                    byteString = eventDetailsOverlay.unknownFields();
                }
                List list3 = list2;
                ByteString byteString2 = byteString;
                List list4 = list;
                String str5 = str4;
                String str6 = str3;
                String str7 = str2;
                return eventDetailsOverlay.copy(str, title, str7, color, str6, list4, str5, list3, byteString2);
            }

            public final EventDetailsOverlay copy(String event_id, Title title, String subtitle_text, Color subtitle_text_color, String body_text, List<UnorderedListItem> list_items, String legal_text, List<AttributeRange> legal_text_attribute_ranges, ByteString unknownFields) {
                list_items.getClass();
                legal_text_attribute_ranges.getClass();
                unknownFields.getClass();
                return new EventDetailsOverlay(event_id, title, subtitle_text, subtitle_text_color, body_text, list_items, legal_text, legal_text_attribute_ranges, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof EventDetailsOverlay)) {
                    return false;
                }
                EventDetailsOverlay eventDetailsOverlay = (EventDetailsOverlay) other;
                return Intrinsics.areEqual(unknownFields(), eventDetailsOverlay.unknownFields()) && Intrinsics.areEqual(this.event_id, eventDetailsOverlay.event_id) && Intrinsics.areEqual(this.title, eventDetailsOverlay.title) && Intrinsics.areEqual(this.subtitle_text, eventDetailsOverlay.subtitle_text) && Intrinsics.areEqual(this.subtitle_text_color, eventDetailsOverlay.subtitle_text_color) && Intrinsics.areEqual(this.body_text, eventDetailsOverlay.body_text) && Intrinsics.areEqual(this.list_items, eventDetailsOverlay.list_items) && Intrinsics.areEqual(this.legal_text, eventDetailsOverlay.legal_text) && Intrinsics.areEqual(this.legal_text_attribute_ranges, eventDetailsOverlay.legal_text_attribute_ranges);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.event_id;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                Title title = this.title;
                int hashCode3 = (hashCode2 + (title != null ? title.hashCode() : 0)) * 37;
                String str2 = this.subtitle_text;
                int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
                Color color = this.subtitle_text_color;
                int hashCode5 = (hashCode4 + (color != null ? color.hashCode() : 0)) * 37;
                String str3 = this.body_text;
                int m = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.list_items);
                String str4 = this.legal_text;
                int hashCode6 = this.legal_text_attribute_ranges.hashCode() + ((m + (str4 != null ? str4.hashCode() : 0)) * 37);
                this.hashCode = hashCode6;
                return hashCode6;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.event_id = this.event_id;
                builder.title = this.title;
                builder.subtitle_text = this.subtitle_text;
                builder.subtitle_text_color = this.subtitle_text_color;
                builder.body_text = this.body_text;
                builder.list_items = this.list_items;
                builder.legal_text = this.legal_text;
                builder.legal_text_attribute_ranges = this.legal_text_attribute_ranges;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.event_id;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "event_id=", arrayList);
                }
                Title title = this.title;
                if (title != null) {
                    arrayList.add("title=" + title);
                }
                String str2 = this.subtitle_text;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle_text=", arrayList);
                }
                Color color = this.subtitle_text_color;
                if (color != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("subtitle_text_color=", color, arrayList);
                }
                String str3 = this.body_text;
                if (str3 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "body_text=", arrayList);
                }
                if (!this.list_items.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("list_items=", arrayList, this.list_items);
                }
                String str4 = this.legal_text;
                if (str4 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "legal_text=", arrayList);
                }
                if (!this.legal_text_attribute_ranges.isEmpty()) {
                    re$$ExternalSyntheticOutline0.m("legal_text_attribute_ranges=", arrayList, this.legal_text_attribute_ranges);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "EventDetailsOverlay{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$EventDetailsOverlay$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$EventDetailsOverlay$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$EventDetailsOverlay;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$EventDetailsOverlay;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ EventDetailsOverlay build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$EventDetailsOverlay$Title;", "", "<init>", "()V", "TitleText", "TitleTimestamp", "Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$EventDetailsOverlay$Title$TitleText;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$EventDetailsOverlay$Title$TitleTimestamp;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static abstract class Title {

                @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#STRING", declaredName = "title_text", tag = 2)
                @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$EventDetailsOverlay$Title$TitleText;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$EventDetailsOverlay$Title;", "value", "", "<init>", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                public static final /* data */ class TitleText extends Title {
                    private final String value;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public TitleText(String str) {
                        super(null);
                        str.getClass();
                        this.value = str;
                    }

                    public static /* synthetic */ TitleText copy$default(TitleText titleText, String str, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = titleText.value;
                        }
                        return titleText.copy(str);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final String getValue() {
                        return this.value;
                    }

                    public final TitleText copy(String value) {
                        value.getClass();
                        return new TitleText(value);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof TitleText) && Intrinsics.areEqual(this.value, ((TitleText) other).value);
                    }

                    public final String getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("TitleText(value=", this.value, ")");
                    }
                }

                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$EventDetailsOverlay$Title$TitleTimestamp;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$EventDetailsOverlay$Title;", "value", "", "<init>", "(J)V", "getValue", "()J", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
                @WireOneofField(adapter = "com.squareup.wire.ProtoAdapter#INT64", declaredName = "title_timestamp", tag = 3)
                @Deprecated
                public static final /* data */ class TitleTimestamp extends Title {
                    private final long value;

                    public TitleTimestamp(long j) {
                        super(null);
                        this.value = j;
                    }

                    public static /* synthetic */ TitleTimestamp copy$default(TitleTimestamp titleTimestamp, long j, int i, Object obj) {
                        if ((i & 1) != 0) {
                            j = titleTimestamp.value;
                        }
                        return titleTimestamp.copy(j);
                    }

                    /* renamed from: component1, reason: from getter */
                    public final long getValue() {
                        return this.value;
                    }

                    public final TitleTimestamp copy(long value) {
                        return new TitleTimestamp(value);
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof TitleTimestamp) && this.value == ((TitleTimestamp) other).value;
                    }

                    public final long getValue() {
                        return this.value;
                    }

                    public int hashCode() {
                        return Long.hashCode(this.value);
                    }

                    public String toString() {
                        return Boxes$$ExternalSyntheticOutline1.m(this.value, "TitleTimestamp(value=", ")");
                    }
                }

                public /* synthetic */ Title(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Title() {
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EventDetailsOverlay(String str, Title title, String str2, Color color, String str3, List<UnorderedListItem> list, String str4, List<AttributeRange> list2, ByteString byteString) {
                super(ADAPTER, byteString);
                BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
                this.event_id = str;
                this.title = title;
                this.subtitle_text = str2;
                this.subtitle_text_color = color;
                this.body_text = str3;
                this.legal_text = str4;
                this.list_items = TransactorKt.immutableCopyOf("list_items", list);
                this.legal_text_attribute_ranges = TransactorKt.immutableCopyOf("legal_text_attribute_ranges", list2);
            }

            public EventDetailsOverlay() {
                this(null, null, null, null, null, null, null, null, null, 511, null);
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0016\u0017BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0082\u0004J\n\u0010\u0012\u001a\u00020\u0013H\u0096\u0080\u0004J\b\u0010\u0014\u001a\u00020\u0004H\u0016J@\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\nR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$UnorderedListItem;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$UnorderedListItem$Builder;", AnnotatedPrivateKey.LABEL, "", "label_color", "Lcom/squareup/protos/cash/ui/Color;", "value", "value_color", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/squareup/protos/cash/ui/Color;Ljava/lang/String;Lcom/squareup/protos/cash/ui/Color;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class UnorderedListItem extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<UnorderedListItem> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String label;

            @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 1, tag = 2)
            public final Color label_color;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
            public final String value;

            @WireField(adapter = "com.squareup.protos.cash.ui.Color#ADAPTER", schemaIndex = 3, tag = 4)
            public final Color value_color;

            @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$UnorderedListItem$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$UnorderedListItem;", "<init>", "()V", AnnotatedPrivateKey.LABEL, "", "label_color", "Lcom/squareup/protos/cash/ui/Color;", "value", "value_color", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String label;
                public Color label_color;
                public String value;
                public Color value_color;

                @Override // com.squareup.wire.Message.Builder
                public UnorderedListItem build() {
                    return new UnorderedListItem(this.label, this.label_color, this.value, this.value_color, buildUnknownFields());
                }

                public final Builder label(String label) {
                    this.label = label;
                    return this;
                }

                public final Builder label_color(Color label_color) {
                    this.label_color = label_color;
                    return this;
                }

                public final Builder value(String value) {
                    this.value = value;
                    return this;
                }

                public final Builder value_color(Color value_color) {
                    this.value_color = value_color;
                    return this;
                }
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UnorderedListItem.class);
                final Syntax syntax = Syntax.PROTO_2;
                ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.ReceiptSection$TimelineEntry$UnorderedListItem$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public ReceiptSection.TimelineEntry.UnorderedListItem decode(ProtoReader reader) {
                        reader.getClass();
                        long beginMessage = reader.beginMessage();
                        Object obj = null;
                        Object obj2 = null;
                        Object obj3 = null;
                        Object obj4 = null;
                        while (true) {
                            int nextTag = reader.nextTag();
                            if (nextTag == -1) {
                                return new ReceiptSection.TimelineEntry.UnorderedListItem((String) obj, (Color) obj2, (String) obj3, (Color) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                            }
                            if (nextTag == 1) {
                                obj = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag == 2) {
                                obj2 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj2);
                            } else if (nextTag == 3) {
                                obj3 = ProtoAdapter.STRING.decode(reader);
                            } else if (nextTag != 4) {
                                reader.readUnknownField(nextTag);
                            } else {
                                obj4 = TransactorKt.decodeMessageOrMerge(Color.ADAPTER, reader, obj4);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, ReceiptSection.TimelineEntry.UnorderedListItem value) {
                        writer.getClass();
                        value.getClass();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        protoAdapter2.encodeWithTag(writer, 1, value.label);
                        ProtoAdapter protoAdapter3 = Color.ADAPTER;
                        protoAdapter3.encodeWithTag(writer, 2, value.label_color);
                        protoAdapter2.encodeWithTag(writer, 3, value.value);
                        protoAdapter3.encodeWithTag(writer, 4, value.value_color);
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(ReceiptSection.TimelineEntry.UnorderedListItem value) {
                        value.getClass();
                        int size$okio = value.unknownFields().getSize$okio();
                        ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                        int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(1, value.label) + size$okio;
                        ProtoAdapter protoAdapter3 = Color.ADAPTER;
                        return protoAdapter3.encodedSizeWithTag(4, value.value_color) + protoAdapter2.encodedSizeWithTag(3, value.value) + protoAdapter3.encodedSizeWithTag(2, value.label_color) + encodedSizeWithTag;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public ReceiptSection.TimelineEntry.UnorderedListItem redact(ReceiptSection.TimelineEntry.UnorderedListItem value) {
                        value.getClass();
                        Color color = value.label_color;
                        Color color2 = color != null ? (Color) Color.ADAPTER.redact(color) : null;
                        Color color3 = value.value_color;
                        return ReceiptSection.TimelineEntry.UnorderedListItem.copy$default(value, null, color2, null, color3 != null ? (Color) Color.ADAPTER.redact(color3) : null, ByteString.EMPTY, 5, null);
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, ReceiptSection.TimelineEntry.UnorderedListItem value) {
                        writer.getClass();
                        value.getClass();
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter protoAdapter2 = Color.ADAPTER;
                        protoAdapter2.encodeWithTag(writer, 4, value.value_color);
                        ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                        protoAdapter3.encodeWithTag(writer, 3, value.value);
                        protoAdapter2.encodeWithTag(writer, 2, value.label_color);
                        protoAdapter3.encodeWithTag(writer, 1, value.label);
                    }
                };
                ADAPTER = protoAdapter;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
            }

            public /* synthetic */ UnorderedListItem(String str, Color color, String str2, Color color2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : color, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : color2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
            }

            public static /* synthetic */ UnorderedListItem copy$default(UnorderedListItem unorderedListItem, String str, Color color, String str2, Color color2, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = unorderedListItem.label;
                }
                if ((i & 2) != 0) {
                    color = unorderedListItem.label_color;
                }
                if ((i & 4) != 0) {
                    str2 = unorderedListItem.value;
                }
                if ((i & 8) != 0) {
                    color2 = unorderedListItem.value_color;
                }
                if ((i & 16) != 0) {
                    byteString = unorderedListItem.unknownFields();
                }
                ByteString byteString2 = byteString;
                String str3 = str2;
                return unorderedListItem.copy(str, color, str3, color2, byteString2);
            }

            public final UnorderedListItem copy(String label, Color label_color, String value, Color value_color, ByteString unknownFields) {
                unknownFields.getClass();
                return new UnorderedListItem(label, label_color, value, value_color, unknownFields);
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof UnorderedListItem)) {
                    return false;
                }
                UnorderedListItem unorderedListItem = (UnorderedListItem) other;
                return Intrinsics.areEqual(unknownFields(), unorderedListItem.unknownFields()) && Intrinsics.areEqual(this.label, unorderedListItem.label) && Intrinsics.areEqual(this.label_color, unorderedListItem.label_color) && Intrinsics.areEqual(this.value, unorderedListItem.value) && Intrinsics.areEqual(this.value_color, unorderedListItem.value_color);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.label;
                int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
                Color color = this.label_color;
                int hashCode3 = (hashCode2 + (color != null ? color.hashCode() : 0)) * 37;
                String str2 = this.value;
                int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
                Color color2 = this.value_color;
                int hashCode5 = hashCode4 + (color2 != null ? color2.hashCode() : 0);
                this.hashCode = hashCode5;
                return hashCode5;
            }

            @Override // com.squareup.wire.Message
            public Builder newBuilder() {
                Builder builder = new Builder();
                builder.label = this.label;
                builder.label_color = this.label_color;
                builder.value = this.value;
                builder.value_color = this.value_color;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.label;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
                }
                Color color = this.label_color;
                if (color != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("label_color=", color, arrayList);
                }
                String str2 = this.value;
                if (str2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "value=", arrayList);
                }
                Color color2 = this.value_color;
                if (color2 != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m("value_color=", color2, arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "UnorderedListItem{", "}", 0, null, null, 56);
            }

            @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$UnorderedListItem$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$UnorderedListItem$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$UnorderedListItem;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$UnorderedListItem;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ UnorderedListItem build(Function1<? super Builder, Unit> body) {
                    body.getClass();
                    Builder builder = new Builder();
                    body.invoke(builder);
                    return builder.build();
                }

                private Companion() {
                }
            }

            public UnorderedListItem() {
                this(null, null, null, null, null, 31, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UnorderedListItem(String str, Color color, String str2, Color color2, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.label = str;
                this.label_color = color;
                this.value = str2;
                this.value_color = color2;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ TimelineEntry build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public TimelineEntry(Timeline timeline, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : timeline, (i & 2) != 0 ? EmptyList.INSTANCE : list, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public TimelineEntry() {
            this(null, null, null, 7, null);
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ReceiptSection.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.ReceiptSection$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public ReceiptSection decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new ReceiptSection((String) obj, m, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 2) {
                        reader.readUnknownField(nextTag);
                    } else {
                        m.add(ReceiptSection.Entry.ADAPTER.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ReceiptSection value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.title);
                ReceiptSection.Entry.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.entries);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ReceiptSection value) {
                value.getClass();
                return ReceiptSection.Entry.ADAPTER.asRepeated().encodedSizeWithTag(2, value.entries) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.title) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ReceiptSection redact(ReceiptSection value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.entries, ReceiptSection.Entry.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = value.title;
                byteString.getClass();
                return new ReceiptSection(str, m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ReceiptSection value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ReceiptSection.Entry.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.entries);
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiptSection(String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = str;
        this.entries = TransactorKt.immutableCopyOf("entries", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ReceiptSection)) {
            return false;
        }
        ReceiptSection receiptSection = (ReceiptSection) obj;
        return Intrinsics.areEqual(unknownFields(), receiptSection.unknownFields()) && Intrinsics.areEqual(this.title, receiptSection.title) && Intrinsics.areEqual(this.entries, receiptSection.entries);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = this.entries.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.entries = this.entries;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        if (!this.entries.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("entries=", arrayList, this.entries);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ReceiptSection{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0013\u0014\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Builder;", "type", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Builder", "Type", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Entry extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Entry> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireSealedOneof(schemaIndex = 0)
        public final Type type;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry;", "<init>", "()V", "type", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public Type type;

            @Override // com.squareup.wire.Message.Builder
            public Entry build() {
                return new Entry(this.type, buildUnknownFields());
            }

            public final Builder type(Type type2) {
                this.type = type2;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Entry.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.ReceiptSection$Entry$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public ReceiptSection.Entry decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    ReceiptSection.Entry.Type type2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new ReceiptSection.Entry(type2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                type2 = new ReceiptSection.Entry.Type.DetailRow((ReceiptSection.DetailRow) ReceiptSection.DetailRow.ADAPTER.decode(reader));
                                break;
                            case 2:
                                type2 = new ReceiptSection.Entry.Type.ActionRow((ReceiptSection.ActionRow) ReceiptSection.ActionRow.ADAPTER.decode(reader));
                                break;
                            case 3:
                                type2 = new ReceiptSection.Entry.Type.ItemsGroup((ReceiptSection.ItemsGroup) ReceiptSection.ItemsGroup.ADAPTER.decode(reader));
                                break;
                            case 4:
                                type2 = new ReceiptSection.Entry.Type.ProgressRow((ReceiptSection.ProgressRow) ReceiptSection.ProgressRow.ADAPTER.decode(reader));
                                break;
                            case 5:
                                type2 = new ReceiptSection.Entry.Type.Timeline((Timeline) Timeline.ADAPTER.decode(reader));
                                break;
                            case 6:
                                type2 = new ReceiptSection.Entry.Type.LocationRow((ReceiptSection.LocationRow) ReceiptSection.LocationRow.ADAPTER.decode(reader));
                                break;
                            case 7:
                                type2 = new ReceiptSection.Entry.Type.UrlRow((ReceiptSection.URLRow) ReceiptSection.URLRow.ADAPTER.decode(reader));
                                break;
                            case 8:
                                type2 = new ReceiptSection.Entry.Type.TextBlock((ReceiptSection.TextBlock) ReceiptSection.TextBlock.ADAPTER.decode(reader));
                                break;
                            case 9:
                                type2 = new ReceiptSection.Entry.Type.Upsell((ReceiptSection.Upsell) ReceiptSection.Upsell.ADAPTER.decode(reader));
                                break;
                            case 10:
                                type2 = new ReceiptSection.Entry.Type.TimelineEntry((ReceiptSection.TimelineEntry) ReceiptSection.TimelineEntry.ADAPTER.decode(reader));
                                break;
                            case 11:
                                type2 = new ReceiptSection.Entry.Type.ImageRow((ReceiptSection.ImageRow) ReceiptSection.ImageRow.ADAPTER.decode(reader));
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ReceiptSection.Entry value) {
                    writer.getClass();
                    value.getClass();
                    ReceiptSection.Entry.Type type2 = value.type;
                    if (type2 instanceof ReceiptSection.Entry.Type.DetailRow) {
                        ReceiptSection.DetailRow.ADAPTER.encodeWithTag(writer, 1, ((ReceiptSection.Entry.Type.DetailRow) type2).getValue());
                    } else if (type2 instanceof ReceiptSection.Entry.Type.ActionRow) {
                        ReceiptSection.ActionRow.ADAPTER.encodeWithTag(writer, 2, ((ReceiptSection.Entry.Type.ActionRow) type2).getValue());
                    } else if (type2 instanceof ReceiptSection.Entry.Type.ItemsGroup) {
                        ReceiptSection.ItemsGroup.ADAPTER.encodeWithTag(writer, 3, ((ReceiptSection.Entry.Type.ItemsGroup) type2).getValue());
                    } else if (type2 instanceof ReceiptSection.Entry.Type.ProgressRow) {
                        ReceiptSection.ProgressRow.ADAPTER.encodeWithTag(writer, 4, ((ReceiptSection.Entry.Type.ProgressRow) type2).getValue());
                    } else if (type2 instanceof ReceiptSection.Entry.Type.Timeline) {
                        Timeline.ADAPTER.encodeWithTag(writer, 5, ((ReceiptSection.Entry.Type.Timeline) type2).getValue());
                    } else if (type2 instanceof ReceiptSection.Entry.Type.LocationRow) {
                        ReceiptSection.LocationRow.ADAPTER.encodeWithTag(writer, 6, ((ReceiptSection.Entry.Type.LocationRow) type2).getValue());
                    } else if (type2 instanceof ReceiptSection.Entry.Type.UrlRow) {
                        ReceiptSection.URLRow.ADAPTER.encodeWithTag(writer, 7, ((ReceiptSection.Entry.Type.UrlRow) type2).getValue());
                    } else if (type2 instanceof ReceiptSection.Entry.Type.TextBlock) {
                        ReceiptSection.TextBlock.ADAPTER.encodeWithTag(writer, 8, ((ReceiptSection.Entry.Type.TextBlock) type2).getValue());
                    } else if (type2 instanceof ReceiptSection.Entry.Type.Upsell) {
                        ReceiptSection.Upsell.ADAPTER.encodeWithTag(writer, 9, ((ReceiptSection.Entry.Type.Upsell) type2).getValue());
                    } else if (type2 instanceof ReceiptSection.Entry.Type.TimelineEntry) {
                        ReceiptSection.TimelineEntry.ADAPTER.encodeWithTag(writer, 10, ((ReceiptSection.Entry.Type.TimelineEntry) type2).getValue());
                    } else if (type2 instanceof ReceiptSection.Entry.Type.ImageRow) {
                        ReceiptSection.ImageRow.ADAPTER.encodeWithTag(writer, 11, ((ReceiptSection.Entry.Type.ImageRow) type2).getValue());
                    } else if (type2 != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ReceiptSection.Entry value) {
                    int encodedSizeWithTag;
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ReceiptSection.Entry.Type type2 = value.type;
                    if (type2 instanceof ReceiptSection.Entry.Type.DetailRow) {
                        encodedSizeWithTag = ReceiptSection.DetailRow.ADAPTER.encodedSizeWithTag(1, ((ReceiptSection.Entry.Type.DetailRow) type2).getValue());
                    } else if (type2 instanceof ReceiptSection.Entry.Type.ActionRow) {
                        encodedSizeWithTag = ReceiptSection.ActionRow.ADAPTER.encodedSizeWithTag(2, ((ReceiptSection.Entry.Type.ActionRow) type2).getValue());
                    } else if (type2 instanceof ReceiptSection.Entry.Type.ItemsGroup) {
                        encodedSizeWithTag = ReceiptSection.ItemsGroup.ADAPTER.encodedSizeWithTag(3, ((ReceiptSection.Entry.Type.ItemsGroup) type2).getValue());
                    } else if (type2 instanceof ReceiptSection.Entry.Type.ProgressRow) {
                        encodedSizeWithTag = ReceiptSection.ProgressRow.ADAPTER.encodedSizeWithTag(4, ((ReceiptSection.Entry.Type.ProgressRow) type2).getValue());
                    } else if (type2 instanceof ReceiptSection.Entry.Type.Timeline) {
                        encodedSizeWithTag = Timeline.ADAPTER.encodedSizeWithTag(5, ((ReceiptSection.Entry.Type.Timeline) type2).getValue());
                    } else if (type2 instanceof ReceiptSection.Entry.Type.LocationRow) {
                        encodedSizeWithTag = ReceiptSection.LocationRow.ADAPTER.encodedSizeWithTag(6, ((ReceiptSection.Entry.Type.LocationRow) type2).getValue());
                    } else if (type2 instanceof ReceiptSection.Entry.Type.UrlRow) {
                        encodedSizeWithTag = ReceiptSection.URLRow.ADAPTER.encodedSizeWithTag(7, ((ReceiptSection.Entry.Type.UrlRow) type2).getValue());
                    } else if (type2 instanceof ReceiptSection.Entry.Type.TextBlock) {
                        encodedSizeWithTag = ReceiptSection.TextBlock.ADAPTER.encodedSizeWithTag(8, ((ReceiptSection.Entry.Type.TextBlock) type2).getValue());
                    } else if (type2 instanceof ReceiptSection.Entry.Type.Upsell) {
                        encodedSizeWithTag = ReceiptSection.Upsell.ADAPTER.encodedSizeWithTag(9, ((ReceiptSection.Entry.Type.Upsell) type2).getValue());
                    } else if (type2 instanceof ReceiptSection.Entry.Type.TimelineEntry) {
                        encodedSizeWithTag = ReceiptSection.TimelineEntry.ADAPTER.encodedSizeWithTag(10, ((ReceiptSection.Entry.Type.TimelineEntry) type2).getValue());
                    } else {
                        if (!(type2 instanceof ReceiptSection.Entry.Type.ImageRow)) {
                            if (type2 == null) {
                                return size$okio;
                            }
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return 0;
                        }
                        encodedSizeWithTag = ReceiptSection.ImageRow.ADAPTER.encodedSizeWithTag(11, ((ReceiptSection.Entry.Type.ImageRow) type2).getValue());
                    }
                    return encodedSizeWithTag + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ReceiptSection.Entry redact(ReceiptSection.Entry value) {
                    value.getClass();
                    return ReceiptSection.Entry.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ReceiptSection.Entry value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ReceiptSection.Entry.Type type2 = value.type;
                    if (type2 instanceof ReceiptSection.Entry.Type.DetailRow) {
                        ReceiptSection.DetailRow.ADAPTER.encodeWithTag(writer, 1, ((ReceiptSection.Entry.Type.DetailRow) type2).getValue());
                        return;
                    }
                    if (type2 instanceof ReceiptSection.Entry.Type.ActionRow) {
                        ReceiptSection.ActionRow.ADAPTER.encodeWithTag(writer, 2, ((ReceiptSection.Entry.Type.ActionRow) type2).getValue());
                        return;
                    }
                    if (type2 instanceof ReceiptSection.Entry.Type.ItemsGroup) {
                        ReceiptSection.ItemsGroup.ADAPTER.encodeWithTag(writer, 3, ((ReceiptSection.Entry.Type.ItemsGroup) type2).getValue());
                        return;
                    }
                    if (type2 instanceof ReceiptSection.Entry.Type.ProgressRow) {
                        ReceiptSection.ProgressRow.ADAPTER.encodeWithTag(writer, 4, ((ReceiptSection.Entry.Type.ProgressRow) type2).getValue());
                        return;
                    }
                    if (type2 instanceof ReceiptSection.Entry.Type.Timeline) {
                        Timeline.ADAPTER.encodeWithTag(writer, 5, ((ReceiptSection.Entry.Type.Timeline) type2).getValue());
                        return;
                    }
                    if (type2 instanceof ReceiptSection.Entry.Type.LocationRow) {
                        ReceiptSection.LocationRow.ADAPTER.encodeWithTag(writer, 6, ((ReceiptSection.Entry.Type.LocationRow) type2).getValue());
                        return;
                    }
                    if (type2 instanceof ReceiptSection.Entry.Type.UrlRow) {
                        ReceiptSection.URLRow.ADAPTER.encodeWithTag(writer, 7, ((ReceiptSection.Entry.Type.UrlRow) type2).getValue());
                        return;
                    }
                    if (type2 instanceof ReceiptSection.Entry.Type.TextBlock) {
                        ReceiptSection.TextBlock.ADAPTER.encodeWithTag(writer, 8, ((ReceiptSection.Entry.Type.TextBlock) type2).getValue());
                        return;
                    }
                    if (type2 instanceof ReceiptSection.Entry.Type.Upsell) {
                        ReceiptSection.Upsell.ADAPTER.encodeWithTag(writer, 9, ((ReceiptSection.Entry.Type.Upsell) type2).getValue());
                        return;
                    }
                    if (type2 instanceof ReceiptSection.Entry.Type.TimelineEntry) {
                        ReceiptSection.TimelineEntry.ADAPTER.encodeWithTag(writer, 10, ((ReceiptSection.Entry.Type.TimelineEntry) type2).getValue());
                    } else if (type2 instanceof ReceiptSection.Entry.Type.ImageRow) {
                        ReceiptSection.ImageRow.ADAPTER.encodeWithTag(writer, 11, ((ReceiptSection.Entry.Type.ImageRow) type2).getValue());
                    } else {
                        if (type2 == null) {
                            return;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                    }
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Entry(Type type2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : type2, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Entry copy$default(Entry entry, Type type2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                type2 = entry.type;
            }
            if ((i & 2) != 0) {
                byteString = entry.unknownFields();
            }
            return entry.copy(type2, byteString);
        }

        public final Entry copy(Type type2, ByteString unknownFields) {
            unknownFields.getClass();
            return new Entry(type2, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) other;
            return Intrinsics.areEqual(unknownFields(), entry.unknownFields()) && Intrinsics.areEqual(this.type, entry.type);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Type type2 = this.type;
            int hashCode2 = hashCode + (type2 != null ? type2.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.type = this.type;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Type type2 = this.type;
            if (type2 != null) {
                arrayList.add("type=" + type2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Entry{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Entry build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u000b\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u000b\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type;", "", "<init>", "()V", "DetailRow", "ActionRow", "ItemsGroup", "ProgressRow", "Timeline", "LocationRow", "UrlRow", "TextBlock", "Upsell", "TimelineEntry", "ImageRow", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type$ActionRow;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type$DetailRow;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type$ImageRow;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type$ItemsGroup;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type$LocationRow;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type$ProgressRow;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type$TextBlock;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type$Timeline;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type$TimelineEntry;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type$Upsell;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type$UrlRow;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class Type {

            @WireOneofField(adapter = "com.squareup.protos.franklin.ui.ReceiptSection$ActionRow#ADAPTER", declaredName = "action_row", tag = 2)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type$ActionRow;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type;", "value", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ActionRow;", "<init>", "(Lcom/squareup/protos/franklin/ui/ReceiptSection$ActionRow;)V", "getValue", "()Lcom/squareup/protos/franklin/ui/ReceiptSection$ActionRow;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class ActionRow extends Type {
                private final ActionRow value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ActionRow(ActionRow actionRow) {
                    super(null);
                    actionRow.getClass();
                    this.value = actionRow;
                }

                public static /* synthetic */ ActionRow copy$default(ActionRow actionRow, ActionRow actionRow2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        actionRow2 = actionRow.value;
                    }
                    return actionRow.copy(actionRow2);
                }

                /* renamed from: component1, reason: from getter */
                public final ActionRow getValue() {
                    return this.value;
                }

                public final ActionRow copy(ActionRow value) {
                    value.getClass();
                    return new ActionRow(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ActionRow) && Intrinsics.areEqual(this.value, ((ActionRow) other).value);
                }

                public final ActionRow getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ActionRow(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.ui.ReceiptSection$DetailRow#ADAPTER", declaredName = "detail_row", tag = 1)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type$DetailRow;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type;", "value", "Lcom/squareup/protos/franklin/ui/ReceiptSection$DetailRow;", "<init>", "(Lcom/squareup/protos/franklin/ui/ReceiptSection$DetailRow;)V", "getValue", "()Lcom/squareup/protos/franklin/ui/ReceiptSection$DetailRow;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class DetailRow extends Type {
                private final DetailRow value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public DetailRow(DetailRow detailRow) {
                    super(null);
                    detailRow.getClass();
                    this.value = detailRow;
                }

                public static /* synthetic */ DetailRow copy$default(DetailRow detailRow, DetailRow detailRow2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        detailRow2 = detailRow.value;
                    }
                    return detailRow.copy(detailRow2);
                }

                /* renamed from: component1, reason: from getter */
                public final DetailRow getValue() {
                    return this.value;
                }

                public final DetailRow copy(DetailRow value) {
                    value.getClass();
                    return new DetailRow(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof DetailRow) && Intrinsics.areEqual(this.value, ((DetailRow) other).value);
                }

                public final DetailRow getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "DetailRow(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.ui.ReceiptSection$ImageRow#ADAPTER", declaredName = "image_row", tag = 11)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type$ImageRow;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type;", "value", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ImageRow;", "<init>", "(Lcom/squareup/protos/franklin/ui/ReceiptSection$ImageRow;)V", "getValue", "()Lcom/squareup/protos/franklin/ui/ReceiptSection$ImageRow;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class ImageRow extends Type {
                private final ImageRow value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ImageRow(ImageRow imageRow) {
                    super(null);
                    imageRow.getClass();
                    this.value = imageRow;
                }

                public static /* synthetic */ ImageRow copy$default(ImageRow imageRow, ImageRow imageRow2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        imageRow2 = imageRow.value;
                    }
                    return imageRow.copy(imageRow2);
                }

                /* renamed from: component1, reason: from getter */
                public final ImageRow getValue() {
                    return this.value;
                }

                public final ImageRow copy(ImageRow value) {
                    value.getClass();
                    return new ImageRow(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ImageRow) && Intrinsics.areEqual(this.value, ((ImageRow) other).value);
                }

                public final ImageRow getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ImageRow(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.ui.ReceiptSection$ItemsGroup#ADAPTER", declaredName = "items_group", tag = 3)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type$ItemsGroup;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type;", "value", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ItemsGroup;", "<init>", "(Lcom/squareup/protos/franklin/ui/ReceiptSection$ItemsGroup;)V", "getValue", "()Lcom/squareup/protos/franklin/ui/ReceiptSection$ItemsGroup;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class ItemsGroup extends Type {
                private final ItemsGroup value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ItemsGroup(ItemsGroup itemsGroup) {
                    super(null);
                    itemsGroup.getClass();
                    this.value = itemsGroup;
                }

                public static /* synthetic */ ItemsGroup copy$default(ItemsGroup itemsGroup, ItemsGroup itemsGroup2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        itemsGroup2 = itemsGroup.value;
                    }
                    return itemsGroup.copy(itemsGroup2);
                }

                /* renamed from: component1, reason: from getter */
                public final ItemsGroup getValue() {
                    return this.value;
                }

                public final ItemsGroup copy(ItemsGroup value) {
                    value.getClass();
                    return new ItemsGroup(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ItemsGroup) && Intrinsics.areEqual(this.value, ((ItemsGroup) other).value);
                }

                public final ItemsGroup getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ItemsGroup(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.ui.ReceiptSection$LocationRow#ADAPTER", declaredName = "location_row", tag = 6)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type$LocationRow;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type;", "value", "Lcom/squareup/protos/franklin/ui/ReceiptSection$LocationRow;", "<init>", "(Lcom/squareup/protos/franklin/ui/ReceiptSection$LocationRow;)V", "getValue", "()Lcom/squareup/protos/franklin/ui/ReceiptSection$LocationRow;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class LocationRow extends Type {
                private final LocationRow value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public LocationRow(LocationRow locationRow) {
                    super(null);
                    locationRow.getClass();
                    this.value = locationRow;
                }

                public static /* synthetic */ LocationRow copy$default(LocationRow locationRow, LocationRow locationRow2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        locationRow2 = locationRow.value;
                    }
                    return locationRow.copy(locationRow2);
                }

                /* renamed from: component1, reason: from getter */
                public final LocationRow getValue() {
                    return this.value;
                }

                public final LocationRow copy(LocationRow value) {
                    value.getClass();
                    return new LocationRow(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof LocationRow) && Intrinsics.areEqual(this.value, ((LocationRow) other).value);
                }

                public final LocationRow getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "LocationRow(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.ui.ReceiptSection$ProgressRow#ADAPTER", declaredName = "progress_row", tag = 4)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type$ProgressRow;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type;", "value", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow;", "<init>", "(Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow;)V", "getValue", "()Lcom/squareup/protos/franklin/ui/ReceiptSection$ProgressRow;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class ProgressRow extends Type {
                private final ProgressRow value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ProgressRow(ProgressRow progressRow) {
                    super(null);
                    progressRow.getClass();
                    this.value = progressRow;
                }

                public static /* synthetic */ ProgressRow copy$default(ProgressRow progressRow, ProgressRow progressRow2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        progressRow2 = progressRow.value;
                    }
                    return progressRow.copy(progressRow2);
                }

                /* renamed from: component1, reason: from getter */
                public final ProgressRow getValue() {
                    return this.value;
                }

                public final ProgressRow copy(ProgressRow value) {
                    value.getClass();
                    return new ProgressRow(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof ProgressRow) && Intrinsics.areEqual(this.value, ((ProgressRow) other).value);
                }

                public final ProgressRow getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "ProgressRow(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.ui.ReceiptSection$TextBlock#ADAPTER", declaredName = "text_block", tag = 8)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type$TextBlock;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type;", "value", "Lcom/squareup/protos/franklin/ui/ReceiptSection$TextBlock;", "<init>", "(Lcom/squareup/protos/franklin/ui/ReceiptSection$TextBlock;)V", "getValue", "()Lcom/squareup/protos/franklin/ui/ReceiptSection$TextBlock;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class TextBlock extends Type {
                private final TextBlock value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public TextBlock(TextBlock textBlock) {
                    super(null);
                    textBlock.getClass();
                    this.value = textBlock;
                }

                public static /* synthetic */ TextBlock copy$default(TextBlock textBlock, TextBlock textBlock2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        textBlock2 = textBlock.value;
                    }
                    return textBlock.copy(textBlock2);
                }

                /* renamed from: component1, reason: from getter */
                public final TextBlock getValue() {
                    return this.value;
                }

                public final TextBlock copy(TextBlock value) {
                    value.getClass();
                    return new TextBlock(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof TextBlock) && Intrinsics.areEqual(this.value, ((TextBlock) other).value);
                }

                public final TextBlock getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "TextBlock(value=" + this.value + ")";
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type$Timeline;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type;", "value", "Lcom/squareup/protos/franklin/ui/Timeline;", "<init>", "(Lcom/squareup/protos/franklin/ui/Timeline;)V", "getValue", "()Lcom/squareup/protos/franklin/ui/Timeline;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            @WireOneofField(adapter = "com.squareup.protos.franklin.ui.Timeline#ADAPTER", declaredName = "timeline", tag = 5)
            @Deprecated
            public static final /* data */ class Timeline extends Type {
                private final com.squareup.protos.franklin.ui.Timeline value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Timeline(com.squareup.protos.franklin.ui.Timeline timeline) {
                    super(null);
                    timeline.getClass();
                    this.value = timeline;
                }

                public static /* synthetic */ Timeline copy$default(Timeline timeline, com.squareup.protos.franklin.ui.Timeline timeline2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        timeline2 = timeline.value;
                    }
                    return timeline.copy(timeline2);
                }

                /* renamed from: component1, reason: from getter */
                public final com.squareup.protos.franklin.ui.Timeline getValue() {
                    return this.value;
                }

                public final Timeline copy(com.squareup.protos.franklin.ui.Timeline value) {
                    value.getClass();
                    return new Timeline(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Timeline) && Intrinsics.areEqual(this.value, ((Timeline) other).value);
                }

                public final com.squareup.protos.franklin.ui.Timeline getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Timeline(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.ui.ReceiptSection$TimelineEntry#ADAPTER", declaredName = "timeline_entry", tag = 10)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type$TimelineEntry;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type;", "value", "Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry;", "<init>", "(Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry;)V", "getValue", "()Lcom/squareup/protos/franklin/ui/ReceiptSection$TimelineEntry;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class TimelineEntry extends Type {
                private final TimelineEntry value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public TimelineEntry(TimelineEntry timelineEntry) {
                    super(null);
                    timelineEntry.getClass();
                    this.value = timelineEntry;
                }

                public static /* synthetic */ TimelineEntry copy$default(TimelineEntry timelineEntry, TimelineEntry timelineEntry2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        timelineEntry2 = timelineEntry.value;
                    }
                    return timelineEntry.copy(timelineEntry2);
                }

                /* renamed from: component1, reason: from getter */
                public final TimelineEntry getValue() {
                    return this.value;
                }

                public final TimelineEntry copy(TimelineEntry value) {
                    value.getClass();
                    return new TimelineEntry(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof TimelineEntry) && Intrinsics.areEqual(this.value, ((TimelineEntry) other).value);
                }

                public final TimelineEntry getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "TimelineEntry(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.ui.ReceiptSection$Upsell#ADAPTER", declaredName = "upsell", tag = 9)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type$Upsell;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type;", "value", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Upsell;", "<init>", "(Lcom/squareup/protos/franklin/ui/ReceiptSection$Upsell;)V", "getValue", "()Lcom/squareup/protos/franklin/ui/ReceiptSection$Upsell;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class Upsell extends Type {
                private final Upsell value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Upsell(Upsell upsell) {
                    super(null);
                    upsell.getClass();
                    this.value = upsell;
                }

                public static /* synthetic */ Upsell copy$default(Upsell upsell, Upsell upsell2, int i, Object obj) {
                    if ((i & 1) != 0) {
                        upsell2 = upsell.value;
                    }
                    return upsell.copy(upsell2);
                }

                /* renamed from: component1, reason: from getter */
                public final Upsell getValue() {
                    return this.value;
                }

                public final Upsell copy(Upsell value) {
                    value.getClass();
                    return new Upsell(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Upsell) && Intrinsics.areEqual(this.value, ((Upsell) other).value);
                }

                public final Upsell getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "Upsell(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.franklin.ui.ReceiptSection$URLRow#ADAPTER", declaredName = "url_row", tag = 7)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type$UrlRow;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Entry$Type;", "value", "Lcom/squareup/protos/franklin/ui/ReceiptSection$URLRow;", "<init>", "(Lcom/squareup/protos/franklin/ui/ReceiptSection$URLRow;)V", "getValue", "()Lcom/squareup/protos/franklin/ui/ReceiptSection$URLRow;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class UrlRow extends Type {
                private final URLRow value;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public UrlRow(URLRow uRLRow) {
                    super(null);
                    uRLRow.getClass();
                    this.value = uRLRow;
                }

                public static /* synthetic */ UrlRow copy$default(UrlRow urlRow, URLRow uRLRow, int i, Object obj) {
                    if ((i & 1) != 0) {
                        uRLRow = urlRow.value;
                    }
                    return urlRow.copy(uRLRow);
                }

                /* renamed from: component1, reason: from getter */
                public final URLRow getValue() {
                    return this.value;
                }

                public final UrlRow copy(URLRow value) {
                    value.getClass();
                    return new UrlRow(value);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof UrlRow) && Intrinsics.areEqual(this.value, ((UrlRow) other).value);
                }

                public final URLRow getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return this.value.hashCode();
                }

                public String toString() {
                    return "UrlRow(value=" + this.value + ")";
                }
            }

            public /* synthetic */ Type(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Type() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Entry() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Entry(Type type2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.type = type2;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bBM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0010\u001a\u00020\u0002H\u0016J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0082\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u0096\u0080\u0004J\b\u0010\u0017\u001a\u00020\u0006H\u0016JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\u0019R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0012\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$ImageRow;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ImageRow$Builder;", "image", "Lcom/squareup/protos/cash/ui/Image;", "tap_action_url", "", "corner_radius", "", "aspect_ratio", "accessibility_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/squareup/protos/cash/ui/Image;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Lokio/ByteString;)V", "Ljava/lang/Float;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "(Lcom/squareup/protos/cash/ui/Image;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Lokio/ByteString;)Lcom/squareup/protos/franklin/ui/ReceiptSection$ImageRow;", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ImageRow extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ImageRow> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
        public final String accessibility_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 3, tag = 4)
        public final Float aspect_ratio;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", schemaIndex = 2, tag = 3)
        public final Float corner_radius;

        @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 0, tag = 1)
        public final Image image;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String tap_action_url;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000eJ\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000eJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\bJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$ImageRow$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ImageRow;", "<init>", "()V", "image", "Lcom/squareup/protos/cash/ui/Image;", "tap_action_url", "", "corner_radius", "", "Ljava/lang/Float;", "aspect_ratio", "accessibility_text", "(Ljava/lang/Float;)Lcom/squareup/protos/franklin/ui/ReceiptSection$ImageRow$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String accessibility_text;
            public Float aspect_ratio;
            public Float corner_radius;
            public Image image;
            public String tap_action_url;

            public final Builder accessibility_text(String accessibility_text) {
                this.accessibility_text = accessibility_text;
                return this;
            }

            public final Builder aspect_ratio(Float aspect_ratio) {
                this.aspect_ratio = aspect_ratio;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public ImageRow build() {
                return new ImageRow(this.image, this.tap_action_url, this.corner_radius, this.aspect_ratio, this.accessibility_text, buildUnknownFields());
            }

            public final Builder corner_radius(Float corner_radius) {
                this.corner_radius = corner_radius;
                return this;
            }

            public final Builder image(Image image) {
                this.image = image;
                return this;
            }

            public final Builder tap_action_url(String tap_action_url) {
                this.tap_action_url = tap_action_url;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ImageRow.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.ReceiptSection$ImageRow$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public ReceiptSection.ImageRow decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new ReceiptSection.ImageRow((Image) obj, (String) obj2, (Float) obj3, (Float) obj4, (String) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            obj3 = ProtoAdapter.FLOAT.decode(reader);
                        } else if (nextTag == 4) {
                            obj4 = ProtoAdapter.FLOAT.decode(reader);
                        } else if (nextTag != 5) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj5 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ReceiptSection.ImageRow value) {
                    writer.getClass();
                    value.getClass();
                    Image.ADAPTER.encodeWithTag(writer, 1, value.image);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.tap_action_url);
                    ProtoAdapter protoAdapter3 = ProtoAdapter.FLOAT;
                    protoAdapter3.encodeWithTag(writer, 3, value.corner_radius);
                    protoAdapter3.encodeWithTag(writer, 4, value.aspect_ratio);
                    protoAdapter2.encodeWithTag(writer, 5, value.accessibility_text);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ReceiptSection.ImageRow value) {
                    value.getClass();
                    int encodedSizeWithTag = Image.ADAPTER.encodedSizeWithTag(1, value.image) + value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(2, value.tap_action_url) + encodedSizeWithTag;
                    ProtoAdapter protoAdapter3 = ProtoAdapter.FLOAT;
                    return protoAdapter2.encodedSizeWithTag(5, value.accessibility_text) + protoAdapter3.encodedSizeWithTag(4, value.aspect_ratio) + protoAdapter3.encodedSizeWithTag(3, value.corner_radius) + encodedSizeWithTag2;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ReceiptSection.ImageRow redact(ReceiptSection.ImageRow value) {
                    value.getClass();
                    Image image = value.image;
                    return ReceiptSection.ImageRow.copy$default(value, image != null ? (Image) Image.ADAPTER.redact(image) : null, null, null, null, null, ByteString.EMPTY, 30, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ReceiptSection.ImageRow value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 5, value.accessibility_text);
                    ProtoAdapter protoAdapter3 = ProtoAdapter.FLOAT;
                    protoAdapter3.encodeWithTag(writer, 4, value.aspect_ratio);
                    protoAdapter3.encodeWithTag(writer, 3, value.corner_radius);
                    protoAdapter2.encodeWithTag(writer, 2, value.tap_action_url);
                    Image.ADAPTER.encodeWithTag(writer, 1, value.image);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ ImageRow(Image image, String str, Float f, Float f2, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : image, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : f, (i & 8) != 0 ? null : f2, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ ImageRow copy$default(ImageRow imageRow, Image image, String str, Float f, Float f2, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                image = imageRow.image;
            }
            if ((i & 2) != 0) {
                str = imageRow.tap_action_url;
            }
            if ((i & 4) != 0) {
                f = imageRow.corner_radius;
            }
            if ((i & 8) != 0) {
                f2 = imageRow.aspect_ratio;
            }
            if ((i & 16) != 0) {
                str2 = imageRow.accessibility_text;
            }
            if ((i & 32) != 0) {
                byteString = imageRow.unknownFields();
            }
            String str3 = str2;
            ByteString byteString2 = byteString;
            return imageRow.copy(image, str, f, f2, str3, byteString2);
        }

        public final ImageRow copy(Image image, String tap_action_url, Float corner_radius, Float aspect_ratio, String accessibility_text, ByteString unknownFields) {
            unknownFields.getClass();
            return new ImageRow(image, tap_action_url, corner_radius, aspect_ratio, accessibility_text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ImageRow)) {
                return false;
            }
            ImageRow imageRow = (ImageRow) other;
            return Intrinsics.areEqual(unknownFields(), imageRow.unknownFields()) && Intrinsics.areEqual(this.image, imageRow.image) && Intrinsics.areEqual(this.tap_action_url, imageRow.tap_action_url) && Intrinsics.areEqual(this.corner_radius, imageRow.corner_radius) && Intrinsics.areEqual(this.aspect_ratio, imageRow.aspect_ratio) && Intrinsics.areEqual(this.accessibility_text, imageRow.accessibility_text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Image image = this.image;
            int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
            String str = this.tap_action_url;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            Float f = this.corner_radius;
            int hashCode4 = (hashCode3 + (f != null ? Float.hashCode(f.floatValue()) : 0)) * 37;
            Float f2 = this.aspect_ratio;
            int hashCode5 = (hashCode4 + (f2 != null ? Float.hashCode(f2.floatValue()) : 0)) * 37;
            String str2 = this.accessibility_text;
            int hashCode6 = hashCode5 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode6;
            return hashCode6;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.image = this.image;
            builder.tap_action_url = this.tap_action_url;
            builder.corner_radius = this.corner_radius;
            builder.aspect_ratio = this.aspect_ratio;
            builder.accessibility_text = this.accessibility_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            Image image = this.image;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
            }
            String str = this.tap_action_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "tap_action_url=", arrayList);
            }
            Float f = this.corner_radius;
            if (f != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("corner_radius=", f, arrayList);
            }
            Float f2 = this.aspect_ratio;
            if (f2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("aspect_ratio=", f2, arrayList);
            }
            String str2 = this.accessibility_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "accessibility_text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ImageRow{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$ImageRow$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ImageRow$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/ReceiptSection$ImageRow;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/ReceiptSection$ImageRow;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ImageRow build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public ImageRow() {
            this(null, null, null, null, null, null, 63, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageRow(Image image, String str, Float f, Float f2, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.image = image;
            this.tap_action_url = str;
            this.corner_radius = f;
            this.aspect_ratio = f2;
            this.accessibility_text = str2;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0013B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0082\u0004J\n\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u001c\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$LocationRow;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$LocationRow$Builder;", "location", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class LocationRow extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LocationRow> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String location;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$LocationRow$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$LocationRow;", "<init>", "()V", "location", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String location;

            @Override // com.squareup.wire.Message.Builder
            public LocationRow build() {
                return new LocationRow(this.location, buildUnknownFields());
            }

            public final Builder location(String location) {
                this.location = location;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LocationRow.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.ReceiptSection$LocationRow$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public ReceiptSection.LocationRow decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new ReceiptSection.LocationRow((String) obj, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(nextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ReceiptSection.LocationRow value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.location);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ReceiptSection.LocationRow value) {
                    value.getClass();
                    return ProtoAdapter.STRING.encodedSizeWithTag(1, value.location) + value.unknownFields().getSize$okio();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ReceiptSection.LocationRow redact(ReceiptSection.LocationRow value) {
                    value.getClass();
                    return ReceiptSection.LocationRow.copy$default(value, null, ByteString.EMPTY, 1, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ReceiptSection.LocationRow value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, value.location);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ LocationRow(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ LocationRow copy$default(LocationRow locationRow, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = locationRow.location;
            }
            if ((i & 2) != 0) {
                byteString = locationRow.unknownFields();
            }
            return locationRow.copy(str, byteString);
        }

        public final LocationRow copy(String location, ByteString unknownFields) {
            unknownFields.getClass();
            return new LocationRow(location, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof LocationRow)) {
                return false;
            }
            LocationRow locationRow = (LocationRow) other;
            return Intrinsics.areEqual(unknownFields(), locationRow.unknownFields()) && Intrinsics.areEqual(this.location, locationRow.location);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.location;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.location = this.location;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.location;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "location=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LocationRow{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$LocationRow$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$LocationRow$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/ReceiptSection$LocationRow;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/ReceiptSection$LocationRow;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ LocationRow build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public LocationRow() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LocationRow(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.location = str;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$TextBlock;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$TextBlock$Builder;", "content", "", "arcade_text_style", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TextBlock extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TextBlock> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String arcade_text_style;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String content;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$TextBlock$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$TextBlock;", "<init>", "()V", "content", "", "arcade_text_style", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String arcade_text_style;
            public String content;

            public final Builder arcade_text_style(String arcade_text_style) {
                this.arcade_text_style = arcade_text_style;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public TextBlock build() {
                return new TextBlock(this.content, this.arcade_text_style, buildUnknownFields());
            }

            public final Builder content(String content) {
                this.content = content;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TextBlock.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.ReceiptSection$TextBlock$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public ReceiptSection.TextBlock decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new ReceiptSection.TextBlock((String) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ReceiptSection.TextBlock value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.content);
                    protoAdapter2.encodeWithTag(writer, 2, value.arcade_text_style);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ReceiptSection.TextBlock value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(2, value.arcade_text_style) + protoAdapter2.encodedSizeWithTag(1, value.content) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ReceiptSection.TextBlock redact(ReceiptSection.TextBlock value) {
                    value.getClass();
                    return ReceiptSection.TextBlock.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ReceiptSection.TextBlock value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.arcade_text_style);
                    protoAdapter2.encodeWithTag(writer, 1, value.content);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ TextBlock(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ TextBlock copy$default(TextBlock textBlock, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = textBlock.content;
            }
            if ((i & 2) != 0) {
                str2 = textBlock.arcade_text_style;
            }
            if ((i & 4) != 0) {
                byteString = textBlock.unknownFields();
            }
            return textBlock.copy(str, str2, byteString);
        }

        public final TextBlock copy(String content, String arcade_text_style, ByteString unknownFields) {
            unknownFields.getClass();
            return new TextBlock(content, arcade_text_style, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TextBlock)) {
                return false;
            }
            TextBlock textBlock = (TextBlock) other;
            return Intrinsics.areEqual(unknownFields(), textBlock.unknownFields()) && Intrinsics.areEqual(this.content, textBlock.content) && Intrinsics.areEqual(this.arcade_text_style, textBlock.arcade_text_style);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.content;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.arcade_text_style;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.content = this.content;
            builder.arcade_text_style = this.arcade_text_style;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.content;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "content=", arrayList);
            }
            String str2 = this.arcade_text_style;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "arcade_text_style=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TextBlock{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$TextBlock$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$TextBlock$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/ReceiptSection$TextBlock;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/ReceiptSection$TextBlock;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ TextBlock build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public TextBlock() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextBlock(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.content = str;
            this.arcade_text_style = str2;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$URLRow;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$URLRow$Builder;", AnnotatedPrivateKey.LABEL, "", "url", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class URLRow extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<URLRow> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String label;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String url;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$URLRow$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$URLRow;", "<init>", "()V", AnnotatedPrivateKey.LABEL, "", "url", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String label;
            public String url;

            @Override // com.squareup.wire.Message.Builder
            public URLRow build() {
                return new URLRow(this.label, this.url, buildUnknownFields());
            }

            public final Builder label(String label) {
                this.label = label;
                return this;
            }

            public final Builder url(String url) {
                this.url = url;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(URLRow.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.ReceiptSection$URLRow$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public ReceiptSection.URLRow decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new ReceiptSection.URLRow((String) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ReceiptSection.URLRow value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.label);
                    protoAdapter2.encodeWithTag(writer, 2, value.url);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ReceiptSection.URLRow value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(2, value.url) + protoAdapter2.encodedSizeWithTag(1, value.label) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ReceiptSection.URLRow redact(ReceiptSection.URLRow value) {
                    value.getClass();
                    return ReceiptSection.URLRow.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ReceiptSection.URLRow value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.url);
                    protoAdapter2.encodeWithTag(writer, 1, value.label);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ URLRow(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ URLRow copy$default(URLRow uRLRow, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = uRLRow.label;
            }
            if ((i & 2) != 0) {
                str2 = uRLRow.url;
            }
            if ((i & 4) != 0) {
                byteString = uRLRow.unknownFields();
            }
            return uRLRow.copy(str, str2, byteString);
        }

        public final URLRow copy(String label, String url, ByteString unknownFields) {
            unknownFields.getClass();
            return new URLRow(label, url, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof URLRow)) {
                return false;
            }
            URLRow uRLRow = (URLRow) other;
            return Intrinsics.areEqual(unknownFields(), uRLRow.unknownFields()) && Intrinsics.areEqual(this.label, uRLRow.label) && Intrinsics.areEqual(this.url, uRLRow.url);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.label;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.url;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.label = this.label;
            builder.url = this.url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.label;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
            }
            String str2 = this.url;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "URLRow{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$URLRow$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$URLRow$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/ReceiptSection$URLRow;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/ReceiptSection$URLRow;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ URLRow build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public URLRow() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public URLRow(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.label = str;
            this.url = str2;
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001d\u001eBe\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0082\u0004J\n\u0010\u0019\u001a\u00020\u001aH\u0096\u0080\u0004J\b\u0010\u001b\u001a\u00020\u0004H\u0016Jd\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$Upsell;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Upsell$Builder;", "header", "", "body", "image", "Lcom/squareup/protos/cash/ui/Image;", "illustration", "Lcom/squareup/protos/cash/ui/Illustration;", "button", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton;", "product_discovery_data", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$UpsellElement$ProductDiscoveryData;", "on_demand_message_data", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$UpsellElement$OnDemandMessageData;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/ui/Image;Lcom/squareup/protos/cash/ui/Illustration;Lcom/squareup/protos/franklin/ui/PaymentHistoryButton;Lcom/squareup/protos/franklin/api/FormBlocker$Element$UpsellElement$ProductDiscoveryData;Lcom/squareup/protos/franklin/api/FormBlocker$Element$UpsellElement$OnDemandMessageData;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Upsell extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Upsell> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String body;

        @WireField(adapter = "com.squareup.protos.franklin.ui.PaymentHistoryButton#ADAPTER", schemaIndex = 4, tag = 4)
        public final PaymentHistoryButton button;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String header;

        @WireField(adapter = "com.squareup.protos.cash.ui.Illustration#ADAPTER", schemaIndex = 3, tag = 6)
        public final Illustration illustration;

        @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 2, tag = 3)
        public final Image image;

        @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker$Element$UpsellElement$OnDemandMessageData#ADAPTER", schemaIndex = 6, tag = 7)
        public final FormBlocker.Element.UpsellElement.OnDemandMessageData on_demand_message_data;

        @WireField(adapter = "com.squareup.protos.franklin.api.FormBlocker$Element$UpsellElement$ProductDiscoveryData#ADAPTER", schemaIndex = 5, tag = 5)
        public final FormBlocker.Element.UpsellElement.ProductDiscoveryData product_discovery_data;

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$Upsell$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Upsell;", "<init>", "()V", "header", "", "body", "image", "Lcom/squareup/protos/cash/ui/Image;", "illustration", "Lcom/squareup/protos/cash/ui/Illustration;", "button", "Lcom/squareup/protos/franklin/ui/PaymentHistoryButton;", "product_discovery_data", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$UpsellElement$ProductDiscoveryData;", "on_demand_message_data", "Lcom/squareup/protos/franklin/api/FormBlocker$Element$UpsellElement$OnDemandMessageData;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String body;
            public PaymentHistoryButton button;
            public String header;
            public Illustration illustration;
            public Image image;
            public FormBlocker.Element.UpsellElement.OnDemandMessageData on_demand_message_data;
            public FormBlocker.Element.UpsellElement.ProductDiscoveryData product_discovery_data;

            public final Builder body(String body) {
                this.body = body;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public Upsell build() {
                return new Upsell(this.header, this.body, this.image, this.illustration, this.button, this.product_discovery_data, this.on_demand_message_data, buildUnknownFields());
            }

            public final Builder button(PaymentHistoryButton button) {
                this.button = button;
                return this;
            }

            public final Builder header(String header) {
                this.header = header;
                return this;
            }

            public final Builder illustration(Illustration illustration) {
                this.illustration = illustration;
                return this;
            }

            public final Builder image(Image image) {
                this.image = image;
                return this;
            }

            public final Builder on_demand_message_data(FormBlocker.Element.UpsellElement.OnDemandMessageData on_demand_message_data) {
                this.on_demand_message_data = on_demand_message_data;
                return this;
            }

            public final Builder product_discovery_data(FormBlocker.Element.UpsellElement.ProductDiscoveryData product_discovery_data) {
                this.product_discovery_data = product_discovery_data;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Upsell.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.ui.ReceiptSection$Upsell$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public ReceiptSection.Upsell decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    Object obj5 = null;
                    Object obj6 = null;
                    Object obj7 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new ReceiptSection.Upsell((String) obj, (String) obj2, (Image) obj3, (Illustration) obj4, (PaymentHistoryButton) obj5, (FormBlocker.Element.UpsellElement.ProductDiscoveryData) obj6, (FormBlocker.Element.UpsellElement.OnDemandMessageData) obj7, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        switch (nextTag) {
                            case 1:
                                obj = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                obj2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                obj3 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj3);
                                break;
                            case 4:
                                obj5 = TransactorKt.decodeMessageOrMerge(PaymentHistoryButton.ADAPTER, reader, obj5);
                                break;
                            case 5:
                                obj6 = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.UpsellElement.ProductDiscoveryData.ADAPTER, reader, obj6);
                                break;
                            case 6:
                                obj4 = TransactorKt.decodeMessageOrMerge(Illustration.ADAPTER, reader, obj4);
                                break;
                            case 7:
                                obj7 = TransactorKt.decodeMessageOrMerge(FormBlocker.Element.UpsellElement.OnDemandMessageData.ADAPTER, reader, obj7);
                                break;
                            default:
                                reader.readUnknownField(nextTag);
                                break;
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ReceiptSection.Upsell value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.header);
                    protoAdapter2.encodeWithTag(writer, 2, value.body);
                    Image.ADAPTER.encodeWithTag(writer, 3, value.image);
                    Illustration.ADAPTER.encodeWithTag(writer, 6, value.illustration);
                    PaymentHistoryButton.ADAPTER.encodeWithTag(writer, 4, value.button);
                    FormBlocker.Element.UpsellElement.ProductDiscoveryData.ADAPTER.encodeWithTag(writer, 5, value.product_discovery_data);
                    FormBlocker.Element.UpsellElement.OnDemandMessageData.ADAPTER.encodeWithTag(writer, 7, value.on_demand_message_data);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ReceiptSection.Upsell value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return FormBlocker.Element.UpsellElement.OnDemandMessageData.ADAPTER.encodedSizeWithTag(7, value.on_demand_message_data) + FormBlocker.Element.UpsellElement.ProductDiscoveryData.ADAPTER.encodedSizeWithTag(5, value.product_discovery_data) + PaymentHistoryButton.ADAPTER.encodedSizeWithTag(4, value.button) + Illustration.ADAPTER.encodedSizeWithTag(6, value.illustration) + Image.ADAPTER.encodedSizeWithTag(3, value.image) + protoAdapter2.encodedSizeWithTag(2, value.body) + protoAdapter2.encodedSizeWithTag(1, value.header) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ReceiptSection.Upsell redact(ReceiptSection.Upsell value) {
                    value.getClass();
                    Image image = value.image;
                    Image image2 = image != null ? (Image) Image.ADAPTER.redact(image) : null;
                    Illustration illustration = value.illustration;
                    Illustration illustration2 = illustration != null ? (Illustration) Illustration.ADAPTER.redact(illustration) : null;
                    PaymentHistoryButton paymentHistoryButton = value.button;
                    PaymentHistoryButton paymentHistoryButton2 = paymentHistoryButton != null ? (PaymentHistoryButton) PaymentHistoryButton.ADAPTER.redact(paymentHistoryButton) : null;
                    FormBlocker.Element.UpsellElement.ProductDiscoveryData productDiscoveryData = value.product_discovery_data;
                    FormBlocker.Element.UpsellElement.ProductDiscoveryData productDiscoveryData2 = productDiscoveryData != null ? (FormBlocker.Element.UpsellElement.ProductDiscoveryData) FormBlocker.Element.UpsellElement.ProductDiscoveryData.ADAPTER.redact(productDiscoveryData) : null;
                    FormBlocker.Element.UpsellElement.OnDemandMessageData onDemandMessageData = value.on_demand_message_data;
                    return ReceiptSection.Upsell.copy$default(value, null, null, image2, illustration2, paymentHistoryButton2, productDiscoveryData2, onDemandMessageData != null ? (FormBlocker.Element.UpsellElement.OnDemandMessageData) FormBlocker.Element.UpsellElement.OnDemandMessageData.ADAPTER.redact(onDemandMessageData) : null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ReceiptSection.Upsell value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    FormBlocker.Element.UpsellElement.OnDemandMessageData.ADAPTER.encodeWithTag(writer, 7, value.on_demand_message_data);
                    FormBlocker.Element.UpsellElement.ProductDiscoveryData.ADAPTER.encodeWithTag(writer, 5, value.product_discovery_data);
                    PaymentHistoryButton.ADAPTER.encodeWithTag(writer, 4, value.button);
                    Illustration.ADAPTER.encodeWithTag(writer, 6, value.illustration);
                    Image.ADAPTER.encodeWithTag(writer, 3, value.image);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.body);
                    protoAdapter2.encodeWithTag(writer, 1, value.header);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ Upsell(String str, String str2, Image image, Illustration illustration, PaymentHistoryButton paymentHistoryButton, FormBlocker.Element.UpsellElement.ProductDiscoveryData productDiscoveryData, FormBlocker.Element.UpsellElement.OnDemandMessageData onDemandMessageData, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : image, (i & 8) != 0 ? null : illustration, (i & 16) != 0 ? null : paymentHistoryButton, (i & 32) != 0 ? null : productDiscoveryData, (i & 64) != 0 ? null : onDemandMessageData, (i & 128) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ Upsell copy$default(Upsell upsell, String str, String str2, Image image, Illustration illustration, PaymentHistoryButton paymentHistoryButton, FormBlocker.Element.UpsellElement.ProductDiscoveryData productDiscoveryData, FormBlocker.Element.UpsellElement.OnDemandMessageData onDemandMessageData, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = upsell.header;
            }
            if ((i & 2) != 0) {
                str2 = upsell.body;
            }
            if ((i & 4) != 0) {
                image = upsell.image;
            }
            if ((i & 8) != 0) {
                illustration = upsell.illustration;
            }
            if ((i & 16) != 0) {
                paymentHistoryButton = upsell.button;
            }
            if ((i & 32) != 0) {
                productDiscoveryData = upsell.product_discovery_data;
            }
            if ((i & 64) != 0) {
                onDemandMessageData = upsell.on_demand_message_data;
            }
            if ((i & 128) != 0) {
                byteString = upsell.unknownFields();
            }
            FormBlocker.Element.UpsellElement.OnDemandMessageData onDemandMessageData2 = onDemandMessageData;
            ByteString byteString2 = byteString;
            PaymentHistoryButton paymentHistoryButton2 = paymentHistoryButton;
            FormBlocker.Element.UpsellElement.ProductDiscoveryData productDiscoveryData2 = productDiscoveryData;
            return upsell.copy(str, str2, image, illustration, paymentHistoryButton2, productDiscoveryData2, onDemandMessageData2, byteString2);
        }

        public final Upsell copy(String header, String body, Image image, Illustration illustration, PaymentHistoryButton button, FormBlocker.Element.UpsellElement.ProductDiscoveryData product_discovery_data, FormBlocker.Element.UpsellElement.OnDemandMessageData on_demand_message_data, ByteString unknownFields) {
            unknownFields.getClass();
            return new Upsell(header, body, image, illustration, button, product_discovery_data, on_demand_message_data, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Upsell)) {
                return false;
            }
            Upsell upsell = (Upsell) other;
            return Intrinsics.areEqual(unknownFields(), upsell.unknownFields()) && Intrinsics.areEqual(this.header, upsell.header) && Intrinsics.areEqual(this.body, upsell.body) && Intrinsics.areEqual(this.image, upsell.image) && Intrinsics.areEqual(this.illustration, upsell.illustration) && Intrinsics.areEqual(this.button, upsell.button) && Intrinsics.areEqual(this.product_discovery_data, upsell.product_discovery_data) && Intrinsics.areEqual(this.on_demand_message_data, upsell.on_demand_message_data);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.header;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.body;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Image image = this.image;
            int hashCode4 = (hashCode3 + (image != null ? image.hashCode() : 0)) * 37;
            Illustration illustration = this.illustration;
            int hashCode5 = (hashCode4 + (illustration != null ? illustration.hashCode() : 0)) * 37;
            PaymentHistoryButton paymentHistoryButton = this.button;
            int hashCode6 = (hashCode5 + (paymentHistoryButton != null ? paymentHistoryButton.hashCode() : 0)) * 37;
            FormBlocker.Element.UpsellElement.ProductDiscoveryData productDiscoveryData = this.product_discovery_data;
            int hashCode7 = (hashCode6 + (productDiscoveryData != null ? productDiscoveryData.hashCode() : 0)) * 37;
            FormBlocker.Element.UpsellElement.OnDemandMessageData onDemandMessageData = this.on_demand_message_data;
            int hashCode8 = hashCode7 + (onDemandMessageData != null ? onDemandMessageData.hashCode() : 0);
            this.hashCode = hashCode8;
            return hashCode8;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.header = this.header;
            builder.body = this.body;
            builder.image = this.image;
            builder.illustration = this.illustration;
            builder.button = this.button;
            builder.product_discovery_data = this.product_discovery_data;
            builder.on_demand_message_data = this.on_demand_message_data;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.header;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "header=", arrayList);
            }
            String str2 = this.body;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "body=", arrayList);
            }
            Image image = this.image;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
            }
            Illustration illustration = this.illustration;
            if (illustration != null) {
                arrayList.add("illustration=" + illustration);
            }
            PaymentHistoryButton paymentHistoryButton = this.button;
            if (paymentHistoryButton != null) {
                arrayList.add("button=" + paymentHistoryButton);
            }
            FormBlocker.Element.UpsellElement.ProductDiscoveryData productDiscoveryData = this.product_discovery_data;
            if (productDiscoveryData != null) {
                arrayList.add("product_discovery_data=" + productDiscoveryData);
            }
            FormBlocker.Element.UpsellElement.OnDemandMessageData onDemandMessageData = this.on_demand_message_data;
            if (onDemandMessageData != null) {
                arrayList.add("on_demand_message_data=" + onDemandMessageData);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Upsell{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$Upsell$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Upsell$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Upsell;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/ReceiptSection$Upsell;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Upsell build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public Upsell() {
            this(null, null, null, null, null, null, null, null, 255, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Upsell(String str, String str2, Image image, Illustration illustration, PaymentHistoryButton paymentHistoryButton, FormBlocker.Element.UpsellElement.ProductDiscoveryData productDiscoveryData, FormBlocker.Element.UpsellElement.OnDemandMessageData onDemandMessageData, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.header = str;
            this.body = str2;
            this.image = image;
            this.illustration = illustration;
            this.button = paymentHistoryButton;
            this.product_discovery_data = productDiscoveryData;
            this.on_demand_message_data = onDemandMessageData;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/ui/ReceiptSection$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/ui/ReceiptSection$Builder;", "", "body", "Lcom/squareup/protos/franklin/ui/ReceiptSection;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/ui/ReceiptSection;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ ReceiptSection build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
