package com.squareup.protos.franklin.common.scenarios;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0014R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/RatePlanConfig;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/scenarios/RatePlanConfig$Builder;", "", "personal_title", "Ljava/lang/String;", "personal_description", "business_title", "business_description", "", "business_fee_bps", "Ljava/lang/Long;", "business_text1", "business_text2", "business_text3", "sample_cashtag", "", "Lcom/squareup/protos/franklin/common/scenarios/IntendedUsageItem;", "intended_usage_items", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class RatePlanConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RatePlanConfig> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String business_description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 4, tag = 5)
    public final Long business_fee_bps;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    public final String business_text1;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    public final String business_text2;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
    public final String business_text3;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String business_title;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.IntendedUsageItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 9, tag = 10)
    public final List<IntendedUsageItem> intended_usage_items;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String personal_description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String personal_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 9)
    public final String sample_cashtag;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u0014J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0011\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/RatePlanConfig$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/RatePlanConfig;", "<init>", "()V", "personal_title", "", "personal_description", "business_title", "business_description", "business_fee_bps", "", "Ljava/lang/Long;", "business_text1", "business_text2", "business_text3", "sample_cashtag", "intended_usage_items", "", "Lcom/squareup/protos/franklin/common/scenarios/IntendedUsageItem;", "(Ljava/lang/Long;)Lcom/squareup/protos/franklin/common/scenarios/RatePlanConfig$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String business_description;
        public Long business_fee_bps;
        public String business_text1;
        public String business_text2;
        public String business_text3;
        public String business_title;
        public List<IntendedUsageItem> intended_usage_items = EmptyList.INSTANCE;
        public String personal_description;
        public String personal_title;
        public String sample_cashtag;

        @Override // com.squareup.wire.Message.Builder
        public RatePlanConfig build() {
            return new RatePlanConfig(this.personal_title, this.personal_description, this.business_title, this.business_description, this.business_fee_bps, this.business_text1, this.business_text2, this.business_text3, this.sample_cashtag, this.intended_usage_items, buildUnknownFields());
        }

        public final Builder business_description(String business_description) {
            this.business_description = business_description;
            return this;
        }

        public final Builder business_fee_bps(Long business_fee_bps) {
            this.business_fee_bps = business_fee_bps;
            return this;
        }

        public final Builder business_text1(String business_text1) {
            this.business_text1 = business_text1;
            return this;
        }

        public final Builder business_text2(String business_text2) {
            this.business_text2 = business_text2;
            return this;
        }

        public final Builder business_text3(String business_text3) {
            this.business_text3 = business_text3;
            return this;
        }

        public final Builder business_title(String business_title) {
            this.business_title = business_title;
            return this;
        }

        public final Builder intended_usage_items(List<IntendedUsageItem> intended_usage_items) {
            intended_usage_items.getClass();
            TransactorKt.checkElementsNotNull(intended_usage_items);
            this.intended_usage_items = intended_usage_items;
            return this;
        }

        public final Builder personal_description(String personal_description) {
            this.personal_description = personal_description;
            return this;
        }

        public final Builder personal_title(String personal_title) {
            this.personal_title = personal_title;
            return this;
        }

        public final Builder sample_cashtag(String sample_cashtag) {
            this.sample_cashtag = sample_cashtag;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RatePlanConfig.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.scenarios.RatePlanConfig$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public RatePlanConfig decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new RatePlanConfig((String) obj, (String) obj2, (String) obj3, (String) obj4, (Long) obj5, (String) obj6, (String) obj7, (String) obj8, (String) obj9, m, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            obj3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            obj5 = ProtoAdapter.INT64.decode(reader);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 7:
                            obj7 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 8:
                            obj8 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 9:
                            obj9 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 10:
                            m.add(IntendedUsageItem.ADAPTER.decode(reader));
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RatePlanConfig value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.personal_title);
                protoAdapter2.encodeWithTag(writer, 2, value.personal_description);
                protoAdapter2.encodeWithTag(writer, 3, value.business_title);
                protoAdapter2.encodeWithTag(writer, 4, value.business_description);
                ProtoAdapter.INT64.encodeWithTag(writer, 5, value.business_fee_bps);
                protoAdapter2.encodeWithTag(writer, 6, value.business_text1);
                protoAdapter2.encodeWithTag(writer, 7, value.business_text2);
                protoAdapter2.encodeWithTag(writer, 8, value.business_text3);
                protoAdapter2.encodeWithTag(writer, 9, value.sample_cashtag);
                IntendedUsageItem.ADAPTER.asRepeated().encodeWithTag(writer, 10, value.intended_usage_items);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RatePlanConfig value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return IntendedUsageItem.ADAPTER.asRepeated().encodedSizeWithTag(10, value.intended_usage_items) + protoAdapter2.encodedSizeWithTag(9, value.sample_cashtag) + protoAdapter2.encodedSizeWithTag(8, value.business_text3) + protoAdapter2.encodedSizeWithTag(7, value.business_text2) + protoAdapter2.encodedSizeWithTag(6, value.business_text1) + ProtoAdapter.INT64.encodedSizeWithTag(5, value.business_fee_bps) + protoAdapter2.encodedSizeWithTag(4, value.business_description) + protoAdapter2.encodedSizeWithTag(3, value.business_title) + protoAdapter2.encodedSizeWithTag(2, value.personal_description) + protoAdapter2.encodedSizeWithTag(1, value.personal_title) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RatePlanConfig redact(RatePlanConfig value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.intended_usage_items, IntendedUsageItem.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = value.personal_title;
                String str2 = value.personal_description;
                String str3 = value.business_title;
                String str4 = value.business_description;
                Long l = value.business_fee_bps;
                String str5 = value.business_text1;
                String str6 = value.business_text2;
                String str7 = value.business_text3;
                String str8 = value.sample_cashtag;
                byteString.getClass();
                return new RatePlanConfig(str, str2, str3, str4, l, str5, str6, str7, str8, m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RatePlanConfig value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                IntendedUsageItem.ADAPTER.asRepeated().encodeWithTag(writer, 10, value.intended_usage_items);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 9, value.sample_cashtag);
                protoAdapter2.encodeWithTag(writer, 8, value.business_text3);
                protoAdapter2.encodeWithTag(writer, 7, value.business_text2);
                protoAdapter2.encodeWithTag(writer, 6, value.business_text1);
                ProtoAdapter.INT64.encodeWithTag(writer, 5, value.business_fee_bps);
                protoAdapter2.encodeWithTag(writer, 4, value.business_description);
                protoAdapter2.encodeWithTag(writer, 3, value.business_title);
                protoAdapter2.encodeWithTag(writer, 2, value.personal_description);
                protoAdapter2.encodeWithTag(writer, 1, value.personal_title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RatePlanConfig(String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, String str8, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.personal_title = str;
        this.personal_description = str2;
        this.business_title = str3;
        this.business_description = str4;
        this.business_fee_bps = l;
        this.business_text1 = str5;
        this.business_text2 = str6;
        this.business_text3 = str7;
        this.sample_cashtag = str8;
        this.intended_usage_items = TransactorKt.immutableCopyOf("intended_usage_items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RatePlanConfig)) {
            return false;
        }
        RatePlanConfig ratePlanConfig = (RatePlanConfig) obj;
        return Intrinsics.areEqual(unknownFields(), ratePlanConfig.unknownFields()) && Intrinsics.areEqual(this.personal_title, ratePlanConfig.personal_title) && Intrinsics.areEqual(this.personal_description, ratePlanConfig.personal_description) && Intrinsics.areEqual(this.business_title, ratePlanConfig.business_title) && Intrinsics.areEqual(this.business_description, ratePlanConfig.business_description) && Intrinsics.areEqual(this.business_fee_bps, ratePlanConfig.business_fee_bps) && Intrinsics.areEqual(this.business_text1, ratePlanConfig.business_text1) && Intrinsics.areEqual(this.business_text2, ratePlanConfig.business_text2) && Intrinsics.areEqual(this.business_text3, ratePlanConfig.business_text3) && Intrinsics.areEqual(this.sample_cashtag, ratePlanConfig.sample_cashtag) && Intrinsics.areEqual(this.intended_usage_items, ratePlanConfig.intended_usage_items);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.personal_title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.personal_description;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.business_title;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.business_description;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Long l = this.business_fee_bps;
        int hashCode6 = (hashCode5 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str5 = this.business_text1;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.business_text2;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.business_text3;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.sample_cashtag;
        int hashCode10 = this.intended_usage_items.hashCode() + ((hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 37);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.personal_title = this.personal_title;
        builder.personal_description = this.personal_description;
        builder.business_title = this.business_title;
        builder.business_description = this.business_description;
        builder.business_fee_bps = this.business_fee_bps;
        builder.business_text1 = this.business_text1;
        builder.business_text2 = this.business_text2;
        builder.business_text3 = this.business_text3;
        builder.sample_cashtag = this.sample_cashtag;
        builder.intended_usage_items = this.intended_usage_items;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.personal_title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "personal_title=", arrayList);
        }
        String str2 = this.personal_description;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "personal_description=", arrayList);
        }
        String str3 = this.business_title;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "business_title=", arrayList);
        }
        String str4 = this.business_description;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "business_description=", arrayList);
        }
        Long l = this.business_fee_bps;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("business_fee_bps=", l, arrayList);
        }
        String str5 = this.business_text1;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "business_text1=", arrayList);
        }
        String str6 = this.business_text2;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "business_text2=", arrayList);
        }
        String str7 = this.business_text3;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "business_text3=", arrayList);
        }
        String str8 = this.sample_cashtag;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "sample_cashtag=", arrayList);
        }
        if (!this.intended_usage_items.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("intended_usage_items=", arrayList, this.intended_usage_items);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RatePlanConfig{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/RatePlanConfig$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/scenarios/RatePlanConfig$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/scenarios/RatePlanConfig;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/scenarios/RatePlanConfig;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ RatePlanConfig build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
