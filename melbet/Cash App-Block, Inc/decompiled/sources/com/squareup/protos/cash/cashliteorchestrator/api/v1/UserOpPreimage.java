package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0012R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/UserOpPreimage;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/UserOpPreimage$Builder;", "Lokio/ByteString;", "user_op_json", "Lokio/ByteString;", "", "entry_point", "Ljava/lang/String;", "", "chain_id", "Ljava/lang/Long;", "", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/Call;", "inner_calls", "Ljava/util/List;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/AbiEntry;", "abis", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UserOpPreimage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UserOpPreimage> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.AbiEntry#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 4, tag = 5)
    public final List<AbiEntry> abis;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", schemaIndex = 2, tag = 3)
    public final Long chain_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String entry_point;

    @WireField(adapter = "com.squareup.protos.cash.cashliteorchestrator.api.v1.Call#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    public final List<Call> inner_calls;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", schemaIndex = 0, tag = 1)
    public final ByteString user_op_json;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0011J\u0014\u0010\f\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0014\u0010\u000f\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\rJ\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/UserOpPreimage$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/UserOpPreimage;", "<init>", "()V", "user_op_json", "Lokio/ByteString;", "entry_point", "", "chain_id", "", "Ljava/lang/Long;", "inner_calls", "", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/Call;", "abis", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/AbiEntry;", "(Ljava/lang/Long;)Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/UserOpPreimage$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<AbiEntry> abis;
        public Long chain_id;
        public String entry_point;
        public List<Call> inner_calls;
        public ByteString user_op_json;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.inner_calls = emptyList;
            this.abis = emptyList;
        }

        public final Builder abis(List<AbiEntry> abis) {
            abis.getClass();
            TransactorKt.checkElementsNotNull(abis);
            this.abis = abis;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public UserOpPreimage build() {
            return new UserOpPreimage(this.user_op_json, this.entry_point, this.chain_id, this.inner_calls, this.abis, buildUnknownFields());
        }

        public final Builder chain_id(Long chain_id) {
            this.chain_id = chain_id;
            return this;
        }

        public final Builder entry_point(String entry_point) {
            this.entry_point = entry_point;
            return this;
        }

        public final Builder inner_calls(List<Call> inner_calls) {
            inner_calls.getClass();
            TransactorKt.checkElementsNotNull(inner_calls);
            this.inner_calls = inner_calls;
            return this;
        }

        public final Builder user_op_json(ByteString user_op_json) {
            this.user_op_json = user_op_json;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UserOpPreimage.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.cashliteorchestrator.api.v1.UserOpPreimage$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public UserOpPreimage decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                ArrayList arrayList = new ArrayList();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new UserOpPreimage((ByteString) obj, (String) obj2, (Long) obj3, m, arrayList, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.BYTES.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.INT64.decode(reader);
                    } else if (nextTag == 4) {
                        m.add(Call.ADAPTER.decode(reader));
                    } else if (nextTag != 5) {
                        reader.readUnknownField(nextTag);
                    } else {
                        arrayList.add(AbiEntry.ADAPTER.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UserOpPreimage value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.user_op_json);
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.entry_point);
                ProtoAdapter.INT64.encodeWithTag(writer, 3, value.chain_id);
                Call.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.inner_calls);
                AbiEntry.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.abis);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UserOpPreimage value) {
                value.getClass();
                return AbiEntry.ADAPTER.asRepeated().encodedSizeWithTag(5, value.abis) + Call.ADAPTER.asRepeated().encodedSizeWithTag(4, value.inner_calls) + ProtoAdapter.INT64.encodedSizeWithTag(3, value.chain_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, value.entry_point) + ProtoAdapter.BYTES.encodedSizeWithTag(1, value.user_op_json) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UserOpPreimage redact(UserOpPreimage value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.inner_calls, Call.ADAPTER);
                ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(value.abis, AbiEntry.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                ByteString byteString2 = value.user_op_json;
                String str = value.entry_point;
                Long l = value.chain_id;
                byteString.getClass();
                return new UserOpPreimage(byteString2, str, l, m1169redactElements, m1169redactElements2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UserOpPreimage value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                AbiEntry.ADAPTER.asRepeated().encodeWithTag(writer, 5, value.abis);
                Call.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.inner_calls);
                ProtoAdapter.INT64.encodeWithTag(writer, 3, value.chain_id);
                ProtoAdapter.STRING.encodeWithTag(writer, 2, value.entry_point);
                ProtoAdapter.BYTES.encodeWithTag(writer, 1, value.user_op_json);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserOpPreimage(ByteString byteString, String str, Long l, List list, List list2, ByteString byteString2) {
        super(ADAPTER, byteString2);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString2);
        this.user_op_json = byteString;
        this.entry_point = str;
        this.chain_id = l;
        this.inner_calls = TransactorKt.immutableCopyOf("inner_calls", list);
        this.abis = TransactorKt.immutableCopyOf("abis", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserOpPreimage)) {
            return false;
        }
        UserOpPreimage userOpPreimage = (UserOpPreimage) obj;
        return Intrinsics.areEqual(unknownFields(), userOpPreimage.unknownFields()) && Intrinsics.areEqual(this.user_op_json, userOpPreimage.user_op_json) && Intrinsics.areEqual(this.entry_point, userOpPreimage.entry_point) && Intrinsics.areEqual(this.chain_id, userOpPreimage.chain_id) && Intrinsics.areEqual(this.inner_calls, userOpPreimage.inner_calls) && Intrinsics.areEqual(this.abis, userOpPreimage.abis);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ByteString byteString = this.user_op_json;
        int hashCode2 = (hashCode + (byteString != null ? byteString.hashCode() : 0)) * 37;
        String str = this.entry_point;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        Long l = this.chain_id;
        int hashCode4 = this.abis.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37, 37, this.inner_calls);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.user_op_json = this.user_op_json;
        builder.entry_point = this.entry_point;
        builder.chain_id = this.chain_id;
        builder.inner_calls = this.inner_calls;
        builder.abis = this.abis;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ByteString byteString = this.user_op_json;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("user_op_json=", byteString, arrayList);
        }
        String str = this.entry_point;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "entry_point=", arrayList);
        }
        Long l = this.chain_id;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("chain_id=", l, arrayList);
        }
        if (!this.inner_calls.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("inner_calls=", arrayList, this.inner_calls);
        }
        if (!this.abis.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("abis=", arrayList, this.abis);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UserOpPreimage{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/UserOpPreimage$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/UserOpPreimage$Builder;", "", "body", "Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/UserOpPreimage;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/cashliteorchestrator/api/v1/UserOpPreimage;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ UserOpPreimage build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
