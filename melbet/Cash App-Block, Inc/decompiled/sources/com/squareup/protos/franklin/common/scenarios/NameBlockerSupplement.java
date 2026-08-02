package com.squareup.protos.franklin.common.scenarios;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.RatePlan;
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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Deprecated
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0011R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/NameBlockerSupplement;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/scenarios/NameBlockerSupplement$Builder;", "Lcom/squareup/protos/franklin/api/RatePlan;", "rate_plan", "Lcom/squareup/protos/franklin/api/RatePlan;", "", "main_text", "Ljava/lang/String;", "name_prefill", "hint_text", "", "min_length", "Ljava/lang/Integer;", "max_length", "footer_text", "instruction_text", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NameBlockerSupplement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<NameBlockerSupplement> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    public final String footer_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String hint_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
    public final String instruction_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String main_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 5, tag = 6)
    public final Integer max_length;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 4, tag = 5)
    public final Integer min_length;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 2, tag = 3)
    public final String name_prefill;

    @WireField(adapter = "com.squareup.protos.franklin.api.RatePlan#ADAPTER", schemaIndex = 0, tag = 1)
    public final RatePlan rate_plan;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0011J\u0015\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0011J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/NameBlockerSupplement$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/NameBlockerSupplement;", "<init>", "()V", "rate_plan", "Lcom/squareup/protos/franklin/api/RatePlan;", "main_text", "", "name_prefill", "hint_text", "min_length", "", "Ljava/lang/Integer;", "max_length", "footer_text", "instruction_text", "(Ljava/lang/Integer;)Lcom/squareup/protos/franklin/common/scenarios/NameBlockerSupplement$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String footer_text;
        public String hint_text;
        public String instruction_text;
        public String main_text;
        public Integer max_length;
        public Integer min_length;
        public String name_prefill;
        public RatePlan rate_plan;

        @Override // com.squareup.wire.Message.Builder
        public NameBlockerSupplement build() {
            return new NameBlockerSupplement(this.rate_plan, this.main_text, this.name_prefill, this.hint_text, this.min_length, this.max_length, this.footer_text, this.instruction_text, buildUnknownFields());
        }

        public final Builder footer_text(String footer_text) {
            this.footer_text = footer_text;
            return this;
        }

        public final Builder hint_text(String hint_text) {
            this.hint_text = hint_text;
            return this;
        }

        public final Builder instruction_text(String instruction_text) {
            this.instruction_text = instruction_text;
            return this;
        }

        public final Builder main_text(String main_text) {
            this.main_text = main_text;
            return this;
        }

        public final Builder max_length(Integer max_length) {
            this.max_length = max_length;
            return this;
        }

        public final Builder min_length(Integer min_length) {
            this.min_length = min_length;
            return this;
        }

        public final Builder name_prefill(String name_prefill) {
            this.name_prefill = name_prefill;
            return this;
        }

        public final Builder rate_plan(RatePlan rate_plan) {
            this.rate_plan = rate_plan;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(NameBlockerSupplement.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.scenarios.NameBlockerSupplement$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public NameBlockerSupplement decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new NameBlockerSupplement((RatePlan) obj, (String) obj2, (String) obj3, (String) obj4, (Integer) obj5, (Integer) obj6, (String) obj7, (String) obj8, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            try {
                                obj = RatePlan.ADAPTER.decode(reader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
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
                            obj5 = ProtoAdapter.INT32.decode(reader);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.INT32.decode(reader);
                            break;
                        case 7:
                            obj7 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 8:
                            obj8 = ProtoAdapter.STRING.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, NameBlockerSupplement value) {
                writer.getClass();
                value.getClass();
                RatePlan.ADAPTER.encodeWithTag(writer, 1, value.rate_plan);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 2, value.main_text);
                protoAdapter2.encodeWithTag(writer, 3, value.name_prefill);
                protoAdapter2.encodeWithTag(writer, 4, value.hint_text);
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT32;
                protoAdapter3.encodeWithTag(writer, 5, value.min_length);
                protoAdapter3.encodeWithTag(writer, 6, value.max_length);
                protoAdapter2.encodeWithTag(writer, 7, value.footer_text);
                protoAdapter2.encodeWithTag(writer, 8, value.instruction_text);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(NameBlockerSupplement value) {
                value.getClass();
                int encodedSizeWithTag = RatePlan.ADAPTER.encodedSizeWithTag(1, value.rate_plan) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(4, value.hint_text) + protoAdapter2.encodedSizeWithTag(3, value.name_prefill) + protoAdapter2.encodedSizeWithTag(2, value.main_text) + encodedSizeWithTag;
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT32;
                return protoAdapter2.encodedSizeWithTag(8, value.instruction_text) + protoAdapter2.encodedSizeWithTag(7, value.footer_text) + protoAdapter3.encodedSizeWithTag(6, value.max_length) + protoAdapter3.encodedSizeWithTag(5, value.min_length) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public NameBlockerSupplement redact(NameBlockerSupplement value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                RatePlan ratePlan = value.rate_plan;
                String str = value.main_text;
                String str2 = value.hint_text;
                Integer num = value.min_length;
                Integer num2 = value.max_length;
                String str3 = value.footer_text;
                String str4 = value.instruction_text;
                value.getClass();
                byteString.getClass();
                return new NameBlockerSupplement(ratePlan, str, null, str2, num, num2, str3, str4, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, NameBlockerSupplement value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 8, value.instruction_text);
                protoAdapter2.encodeWithTag(writer, 7, value.footer_text);
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT32;
                protoAdapter3.encodeWithTag(writer, 6, value.max_length);
                protoAdapter3.encodeWithTag(writer, 5, value.min_length);
                protoAdapter2.encodeWithTag(writer, 4, value.hint_text);
                protoAdapter2.encodeWithTag(writer, 3, value.name_prefill);
                protoAdapter2.encodeWithTag(writer, 2, value.main_text);
                RatePlan.ADAPTER.encodeWithTag(writer, 1, value.rate_plan);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NameBlockerSupplement(RatePlan ratePlan, String str, String str2, String str3, Integer num, Integer num2, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.rate_plan = ratePlan;
        this.main_text = str;
        this.name_prefill = str2;
        this.hint_text = str3;
        this.min_length = num;
        this.max_length = num2;
        this.footer_text = str4;
        this.instruction_text = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NameBlockerSupplement)) {
            return false;
        }
        NameBlockerSupplement nameBlockerSupplement = (NameBlockerSupplement) obj;
        return Intrinsics.areEqual(unknownFields(), nameBlockerSupplement.unknownFields()) && this.rate_plan == nameBlockerSupplement.rate_plan && Intrinsics.areEqual(this.main_text, nameBlockerSupplement.main_text) && Intrinsics.areEqual(this.name_prefill, nameBlockerSupplement.name_prefill) && Intrinsics.areEqual(this.hint_text, nameBlockerSupplement.hint_text) && Intrinsics.areEqual(this.min_length, nameBlockerSupplement.min_length) && Intrinsics.areEqual(this.max_length, nameBlockerSupplement.max_length) && Intrinsics.areEqual(this.footer_text, nameBlockerSupplement.footer_text) && Intrinsics.areEqual(this.instruction_text, nameBlockerSupplement.instruction_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RatePlan ratePlan = this.rate_plan;
        int hashCode2 = (hashCode + (ratePlan != null ? ratePlan.hashCode() : 0)) * 37;
        String str = this.main_text;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.name_prefill;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.hint_text;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Integer num = this.min_length;
        int hashCode6 = (hashCode5 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.max_length;
        int hashCode7 = (hashCode6 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        String str4 = this.footer_text;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.instruction_text;
        int hashCode9 = hashCode8 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.rate_plan = this.rate_plan;
        builder.main_text = this.main_text;
        builder.name_prefill = this.name_prefill;
        builder.hint_text = this.hint_text;
        builder.min_length = this.min_length;
        builder.max_length = this.max_length;
        builder.footer_text = this.footer_text;
        builder.instruction_text = this.instruction_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RatePlan ratePlan = this.rate_plan;
        if (ratePlan != null) {
            arrayList.add("rate_plan=" + ratePlan);
        }
        String str = this.main_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "main_text=", arrayList);
        }
        if (this.name_prefill != null) {
            arrayList.add("name_prefill=██");
        }
        String str2 = this.hint_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "hint_text=", arrayList);
        }
        Integer num = this.min_length;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("min_length=", num, arrayList);
        }
        Integer num2 = this.max_length;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("max_length=", num2, arrayList);
        }
        String str3 = this.footer_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "footer_text=", arrayList);
        }
        String str4 = this.instruction_text;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "instruction_text=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "NameBlockerSupplement{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/NameBlockerSupplement$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/scenarios/NameBlockerSupplement$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/scenarios/NameBlockerSupplement;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/scenarios/NameBlockerSupplement;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ NameBlockerSupplement build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
