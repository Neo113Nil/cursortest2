package com.squareup.protos.cash.kgoose.syncentity;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.janus.api.ContactAlias;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.api.FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class CashGlobalUserSettings extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashGlobalUserSettings> CREATOR;
    public final String body_text;
    public final String button_title;
    public final String heading_text;
    public final String image_string;
    public final Map memory_tool_labels;
    public final String moneybot_first_time_disclosure_agreement;
    public final String moneybot_persistent_disclosure_agreement;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(CashGlobalUserSettings.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.kgoose.syncentity.CashGlobalUserSettings$Companion$ADAPTER$1
            public final Lazy memory_tool_labelsAdapter$delegate;

            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
                this.memory_tool_labelsAdapter$delegate = LazyKt.lazy(new FormBlocker$Companion$ADAPTER$1$$ExternalSyntheticLambda0(16));
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                LinkedHashMap m = SizeMode$EnumUnboxingLocalUtility.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new CashGlobalUserSettings((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            obj3 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            obj4 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            obj5 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            m.putAll((Map) ((ProtoAdapter) this.memory_tool_labelsAdapter$delegate.getValue()).decode(protoReader));
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                CashGlobalUserSettings cashGlobalUserSettings = (CashGlobalUserSettings) obj;
                reverseProtoWriter.getClass();
                cashGlobalUserSettings.getClass();
                reverseProtoWriter.writeBytes(cashGlobalUserSettings.unknownFields());
                ((ProtoAdapter) this.memory_tool_labelsAdapter$delegate.getValue()).encodeWithTag(reverseProtoWriter, 7, cashGlobalUserSettings.memory_tool_labels);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 6, cashGlobalUserSettings.image_string);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, cashGlobalUserSettings.heading_text);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, cashGlobalUserSettings.button_title);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, cashGlobalUserSettings.body_text);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, cashGlobalUserSettings.moneybot_persistent_disclosure_agreement);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, cashGlobalUserSettings.moneybot_first_time_disclosure_agreement);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                CashGlobalUserSettings cashGlobalUserSettings = (CashGlobalUserSettings) obj;
                cashGlobalUserSettings.getClass();
                int size$okio = cashGlobalUserSettings.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return ((ProtoAdapter) this.memory_tool_labelsAdapter$delegate.getValue()).encodedSizeWithTag(7, cashGlobalUserSettings.memory_tool_labels) + protoAdapter2.encodedSizeWithTag(6, cashGlobalUserSettings.image_string) + protoAdapter2.encodedSizeWithTag(5, cashGlobalUserSettings.heading_text) + protoAdapter2.encodedSizeWithTag(4, cashGlobalUserSettings.button_title) + protoAdapter2.encodedSizeWithTag(3, cashGlobalUserSettings.body_text) + protoAdapter2.encodedSizeWithTag(2, cashGlobalUserSettings.moneybot_persistent_disclosure_agreement) + protoAdapter2.encodedSizeWithTag(1, cashGlobalUserSettings.moneybot_first_time_disclosure_agreement) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                CashGlobalUserSettings cashGlobalUserSettings = (CashGlobalUserSettings) obj;
                cashGlobalUserSettings.getClass();
                LinkedHashMap m1170redactElements = TransactorKt.m1170redactElements(cashGlobalUserSettings.memory_tool_labels, LocalizableString.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = cashGlobalUserSettings.moneybot_first_time_disclosure_agreement;
                String str2 = cashGlobalUserSettings.moneybot_persistent_disclosure_agreement;
                String str3 = cashGlobalUserSettings.body_text;
                String str4 = cashGlobalUserSettings.button_title;
                String str5 = cashGlobalUserSettings.heading_text;
                String str6 = cashGlobalUserSettings.image_string;
                byteString.getClass();
                return new CashGlobalUserSettings(str, str2, str3, str4, str5, str6, m1170redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                CashGlobalUserSettings cashGlobalUserSettings = (CashGlobalUserSettings) obj;
                cashGlobalUserSettings.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, cashGlobalUserSettings.moneybot_first_time_disclosure_agreement);
                protoAdapter2.encodeWithTag(protoWriter, 2, cashGlobalUserSettings.moneybot_persistent_disclosure_agreement);
                protoAdapter2.encodeWithTag(protoWriter, 3, cashGlobalUserSettings.body_text);
                protoAdapter2.encodeWithTag(protoWriter, 4, cashGlobalUserSettings.button_title);
                protoAdapter2.encodeWithTag(protoWriter, 5, cashGlobalUserSettings.heading_text);
                protoAdapter2.encodeWithTag(protoWriter, 6, cashGlobalUserSettings.image_string);
                ((ProtoAdapter) this.memory_tool_labelsAdapter$delegate.getValue()).encodeWithTag(protoWriter, 7, cashGlobalUserSettings.memory_tool_labels);
                protoWriter.writeBytes(cashGlobalUserSettings.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashGlobalUserSettings(String str, String str2, String str3, String str4, String str5, String str6, Map map, ByteString byteString) {
        super(ADAPTER, byteString);
        map.getClass();
        byteString.getClass();
        this.moneybot_first_time_disclosure_agreement = str;
        this.moneybot_persistent_disclosure_agreement = str2;
        this.body_text = str3;
        this.button_title = str4;
        this.heading_text = str5;
        this.image_string = str6;
        this.memory_tool_labels = TransactorKt.immutableCopyOf("memory_tool_labels", map);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashGlobalUserSettings)) {
            return false;
        }
        CashGlobalUserSettings cashGlobalUserSettings = (CashGlobalUserSettings) obj;
        return Intrinsics.areEqual(unknownFields(), cashGlobalUserSettings.unknownFields()) && Intrinsics.areEqual(this.moneybot_first_time_disclosure_agreement, cashGlobalUserSettings.moneybot_first_time_disclosure_agreement) && Intrinsics.areEqual(this.moneybot_persistent_disclosure_agreement, cashGlobalUserSettings.moneybot_persistent_disclosure_agreement) && Intrinsics.areEqual(this.body_text, cashGlobalUserSettings.body_text) && Intrinsics.areEqual(this.button_title, cashGlobalUserSettings.button_title) && Intrinsics.areEqual(this.heading_text, cashGlobalUserSettings.heading_text) && Intrinsics.areEqual(this.image_string, cashGlobalUserSettings.image_string) && Intrinsics.areEqual(this.memory_tool_labels, cashGlobalUserSettings.memory_tool_labels);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.moneybot_first_time_disclosure_agreement;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.moneybot_persistent_disclosure_agreement;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.body_text;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.button_title;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.heading_text;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.image_string;
        int hashCode7 = this.memory_tool_labels.hashCode() + ((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ContactAlias.Builder builder = new ContactAlias.Builder(29, false);
        EmptyMap.INSTANCE.getClass();
        builder.customer_token = this.moneybot_first_time_disclosure_agreement;
        builder.alias_value = this.moneybot_persistent_disclosure_agreement;
        builder.hashed_alias_token = this.body_text;
        builder.alias_type = this.button_title;
        builder.updated_at = this.heading_text;
        builder.linked_at = this.image_string;
        builder.version = this.memory_tool_labels;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.moneybot_first_time_disclosure_agreement;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "moneybot_first_time_disclosure_agreement=", arrayList);
        }
        String str2 = this.moneybot_persistent_disclosure_agreement;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "moneybot_persistent_disclosure_agreement=", arrayList);
        }
        String str3 = this.body_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "body_text=", arrayList);
        }
        String str4 = this.button_title;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "button_title=", arrayList);
        }
        String str5 = this.heading_text;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "heading_text=", arrayList);
        }
        String str6 = this.image_string;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "image_string=", arrayList);
        }
        Map map = this.memory_tool_labels;
        if (!map.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("memory_tool_labels=", map, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashGlobalUserSettings{", "}", 0, null, null, 56);
    }
}
