package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u0019R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u0012\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0015\u0010\u000eR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetUserSessionsRequest;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetUserSessionsRequest$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/OnBehalfOf;", "on_behalf_of", "Lcom/squareup/protos/cash/kgoose/api/v3/OnBehalfOf;", "", "limit", "Ljava/lang/Long;", "cursor", "Lcom/squareup/protos/cash/kgoose/api/v3/Tenancy;", "tenancy", "Lcom/squareup/protos/cash/kgoose/api/v3/Tenancy;", "getTenancy$annotations", "()V", "", "include_read_state", "Ljava/lang/Boolean;", "", "tenacies", "Ljava/util/List;", "getTenacies$annotations", "Lcom/squareup/protos/cash/kgoose/api/v3/Source;", "chat_sources", "tenancies", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GetUserSessionsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetUserSessionsRequest> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Source#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
    public final List<Source> chat_sources;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 2, tag = 3)
    public final Long cursor;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 7, tag = 8)
    public final Boolean include_read_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 1, tag = 2)
    public final Long limit;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.OnBehalfOf#ADAPTER", schemaIndex = 0, tag = 1)
    public final OnBehalfOf on_behalf_of;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Tenancy#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    public final List<Tenancy> tenacies;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Tenancy#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
    public final List<Tenancy> tenancies;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.Tenancy#ADAPTER", schemaIndex = 3, tag = 4)
    public final Tenancy tenancy;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0015J\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0015J\u0012\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u0016\u0010\r\u001a\u00020\u00002\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000eH\u0007J\u0014\u0010\u000f\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000eJ\u0014\u0010\u0011\u001a\u00020\u00002\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000eJ\u0015\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/GetUserSessionsRequest$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/GetUserSessionsRequest;", "<init>", "()V", "on_behalf_of", "Lcom/squareup/protos/cash/kgoose/api/v3/OnBehalfOf;", "limit", "", "Ljava/lang/Long;", "cursor", "tenancy", "Lcom/squareup/protos/cash/kgoose/api/v3/Tenancy;", "tenacies", "", "chat_sources", "Lcom/squareup/protos/cash/kgoose/api/v3/Source;", "tenancies", "include_read_state", "", "Ljava/lang/Boolean;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/kgoose/api/v3/GetUserSessionsRequest$Builder;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/api/v3/GetUserSessionsRequest$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public List<? extends Source> chat_sources;
        public Long cursor;
        public Boolean include_read_state;
        public Long limit;
        public OnBehalfOf on_behalf_of;
        public List<? extends Tenancy> tenacies;
        public List<? extends Tenancy> tenancies;
        public Tenancy tenancy;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.tenacies = emptyList;
            this.chat_sources = emptyList;
            this.tenancies = emptyList;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetUserSessionsRequest build() {
            return new GetUserSessionsRequest(this.on_behalf_of, this.limit, this.cursor, this.tenancy, this.tenacies, this.chat_sources, this.tenancies, this.include_read_state, buildUnknownFields());
        }

        public final Builder chat_sources(List<? extends Source> chat_sources) {
            chat_sources.getClass();
            TransactorKt.checkElementsNotNull(chat_sources);
            this.chat_sources = chat_sources;
            return this;
        }

        public final Builder cursor(Long cursor) {
            this.cursor = cursor;
            return this;
        }

        public final Builder include_read_state(Boolean include_read_state) {
            this.include_read_state = include_read_state;
            return this;
        }

        public final Builder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        public final Builder on_behalf_of(OnBehalfOf on_behalf_of) {
            this.on_behalf_of = on_behalf_of;
            return this;
        }

        @Deprecated
        public final Builder tenacies(List<? extends Tenancy> tenacies) {
            tenacies.getClass();
            TransactorKt.checkElementsNotNull(tenacies);
            this.tenacies = tenacies;
            return this;
        }

        public final Builder tenancies(List<? extends Tenancy> tenancies) {
            tenancies.getClass();
            TransactorKt.checkElementsNotNull(tenancies);
            this.tenancies = tenancies;
            return this;
        }

        @Deprecated
        public final Builder tenancy(Tenancy tenancy) {
            this.tenancy = tenancy;
            return this;
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(GetUserSessionsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.kgoose.api.v3.GetUserSessionsRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new GetUserSessionsRequest((OnBehalfOf) obj, (Long) obj2, (Long) obj3, (Tenancy) obj4, m, arrayList, arrayList2, (Boolean) obj5, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = TransactorKt.decodeMessageOrMerge(OnBehalfOf.ADAPTER, protoReader, obj);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 3:
                            obj3 = ProtoAdapter.INT64.decode(protoReader);
                            break;
                        case 4:
                            try {
                                obj4 = Tenancy.ADAPTER.decode(protoReader);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 5:
                            try {
                                Tenancy.ADAPTER.tryDecode(protoReader, m);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                break;
                            }
                        case 6:
                            try {
                                Source.ADAPTER.tryDecode(protoReader, arrayList);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                break;
                            }
                        case 7:
                            try {
                                Tenancy.ADAPTER.tryDecode(protoReader, arrayList2);
                                break;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                break;
                            }
                        case 8:
                            obj5 = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        default:
                            protoReader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                GetUserSessionsRequest getUserSessionsRequest = (GetUserSessionsRequest) obj;
                reverseProtoWriter.getClass();
                getUserSessionsRequest.getClass();
                reverseProtoWriter.writeBytes(getUserSessionsRequest.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 8, getUserSessionsRequest.include_read_state);
                ProtoAdapter protoAdapter2 = Tenancy.ADAPTER;
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 7, getUserSessionsRequest.tenancies);
                Source.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 6, getUserSessionsRequest.chat_sources);
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 5, getUserSessionsRequest.tenacies);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 4, getUserSessionsRequest.tenancy);
                ProtoAdapter protoAdapter3 = ProtoAdapter.INT64;
                protoAdapter3.encodeWithTag(reverseProtoWriter, 3, getUserSessionsRequest.cursor);
                protoAdapter3.encodeWithTag(reverseProtoWriter, 2, getUserSessionsRequest.limit);
                OnBehalfOf.ADAPTER.encodeWithTag(reverseProtoWriter, 1, getUserSessionsRequest.on_behalf_of);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                GetUserSessionsRequest getUserSessionsRequest = (GetUserSessionsRequest) obj;
                getUserSessionsRequest.getClass();
                int encodedSizeWithTag = OnBehalfOf.ADAPTER.encodedSizeWithTag(1, getUserSessionsRequest.on_behalf_of) + getUserSessionsRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(3, getUserSessionsRequest.cursor) + protoAdapter2.encodedSizeWithTag(2, getUserSessionsRequest.limit) + encodedSizeWithTag;
                ProtoAdapter protoAdapter3 = Tenancy.ADAPTER;
                return ProtoAdapter.BOOL.encodedSizeWithTag(8, getUserSessionsRequest.include_read_state) + protoAdapter3.asRepeated().encodedSizeWithTag(7, getUserSessionsRequest.tenancies) + Source.ADAPTER.asRepeated().encodedSizeWithTag(6, getUserSessionsRequest.chat_sources) + protoAdapter3.asRepeated().encodedSizeWithTag(5, getUserSessionsRequest.tenacies) + protoAdapter3.encodedSizeWithTag(4, getUserSessionsRequest.tenancy) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                GetUserSessionsRequest getUserSessionsRequest = (GetUserSessionsRequest) obj;
                getUserSessionsRequest.getClass();
                OnBehalfOf onBehalfOf = getUserSessionsRequest.on_behalf_of;
                OnBehalfOf onBehalfOf2 = onBehalfOf != null ? (OnBehalfOf) OnBehalfOf.ADAPTER.redact(onBehalfOf) : null;
                ByteString byteString = ByteString.EMPTY;
                Long l = getUserSessionsRequest.limit;
                Long l2 = getUserSessionsRequest.cursor;
                Tenancy tenancy = getUserSessionsRequest.tenancy;
                List<Tenancy> list = getUserSessionsRequest.tenacies;
                List<Source> list2 = getUserSessionsRequest.chat_sources;
                List<Tenancy> list3 = getUserSessionsRequest.tenancies;
                Boolean bool = getUserSessionsRequest.include_read_state;
                list.getClass();
                list2.getClass();
                list3.getClass();
                byteString.getClass();
                return new GetUserSessionsRequest(onBehalfOf2, l, l2, tenancy, list, list2, list3, bool, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                GetUserSessionsRequest getUserSessionsRequest = (GetUserSessionsRequest) obj;
                getUserSessionsRequest.getClass();
                OnBehalfOf.ADAPTER.encodeWithTag(protoWriter, 1, getUserSessionsRequest.on_behalf_of);
                ProtoAdapter protoAdapter2 = ProtoAdapter.INT64;
                protoAdapter2.encodeWithTag(protoWriter, 2, getUserSessionsRequest.limit);
                protoAdapter2.encodeWithTag(protoWriter, 3, getUserSessionsRequest.cursor);
                ProtoAdapter protoAdapter3 = Tenancy.ADAPTER;
                protoAdapter3.encodeWithTag(protoWriter, 4, getUserSessionsRequest.tenancy);
                protoAdapter3.asRepeated().encodeWithTag(protoWriter, 5, getUserSessionsRequest.tenacies);
                Source.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, getUserSessionsRequest.chat_sources);
                protoAdapter3.asRepeated().encodeWithTag(protoWriter, 7, getUserSessionsRequest.tenancies);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 8, getUserSessionsRequest.include_read_state);
                protoWriter.writeBytes(getUserSessionsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUserSessionsRequest(OnBehalfOf onBehalfOf, Long l, Long l2, Tenancy tenancy, List list, List list2, List list3, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.on_behalf_of = onBehalfOf;
        this.limit = l;
        this.cursor = l2;
        this.tenancy = tenancy;
        this.include_read_state = bool;
        this.tenacies = TransactorKt.immutableCopyOf("tenacies", list);
        this.chat_sources = TransactorKt.immutableCopyOf("chat_sources", list2);
        this.tenancies = TransactorKt.immutableCopyOf("tenancies", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetUserSessionsRequest)) {
            return false;
        }
        GetUserSessionsRequest getUserSessionsRequest = (GetUserSessionsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), getUserSessionsRequest.unknownFields()) && Intrinsics.areEqual(this.on_behalf_of, getUserSessionsRequest.on_behalf_of) && Intrinsics.areEqual(this.limit, getUserSessionsRequest.limit) && Intrinsics.areEqual(this.cursor, getUserSessionsRequest.cursor) && this.tenancy == getUserSessionsRequest.tenancy && Intrinsics.areEqual(this.tenacies, getUserSessionsRequest.tenacies) && Intrinsics.areEqual(this.chat_sources, getUserSessionsRequest.chat_sources) && Intrinsics.areEqual(this.tenancies, getUserSessionsRequest.tenancies) && Intrinsics.areEqual(this.include_read_state, getUserSessionsRequest.include_read_state);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        OnBehalfOf onBehalfOf = this.on_behalf_of;
        int hashCode2 = (hashCode + (onBehalfOf != null ? onBehalfOf.hashCode() : 0)) * 37;
        Long l = this.limit;
        int hashCode3 = (hashCode2 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.cursor;
        int hashCode4 = (hashCode3 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Tenancy tenancy = this.tenancy;
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode4 + (tenancy != null ? tenancy.hashCode() : 0)) * 37, 37, this.tenacies), 37, this.chat_sources), 37, this.tenancies);
        Boolean bool = this.include_read_state;
        int hashCode5 = m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.on_behalf_of = this.on_behalf_of;
        builder.limit = this.limit;
        builder.cursor = this.cursor;
        builder.tenancy = this.tenancy;
        builder.tenacies = this.tenacies;
        builder.chat_sources = this.chat_sources;
        builder.tenancies = this.tenancies;
        builder.include_read_state = this.include_read_state;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        OnBehalfOf onBehalfOf = this.on_behalf_of;
        if (onBehalfOf != null) {
            arrayList.add("on_behalf_of=" + onBehalfOf);
        }
        Long l = this.limit;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("limit=", l, arrayList);
        }
        Long l2 = this.cursor;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("cursor=", l2, arrayList);
        }
        Tenancy tenancy = this.tenancy;
        if (tenancy != null) {
            arrayList.add("tenancy=" + tenancy);
        }
        if (!this.tenacies.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("tenacies=", arrayList, this.tenacies);
        }
        if (!this.chat_sources.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("chat_sources=", arrayList, this.chat_sources);
        }
        if (!this.tenancies.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("tenancies=", arrayList, this.tenancies);
        }
        Boolean bool = this.include_read_state;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("include_read_state=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetUserSessionsRequest{", "}", 0, null, null, 56);
    }
}
