package com.squareup.protos.franklin.api;

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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectAllowlistCustomerBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SelectAllowlistCustomerBlocker$Builder;", "", "for_customer_token", "Ljava/lang/String;", "Lcom/squareup/protos/franklin/api/BlockerAction;", "back_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "", "allowlist_limit", "Ljava/lang/Integer;", "skip_action", "managed_account_first_name", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectAllowlistCustomerBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SelectAllowlistCustomerBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 2, tag = 3)
    public final Integer allowlist_limit;

    @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 1, tag = 2)
    public final BlockerAction back_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String for_customer_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 4, tag = 5)
    public final String managed_account_first_name;

    @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 3, tag = 4)
    public final BlockerAction skip_action;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0015\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000eJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\bJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectAllowlistCustomerBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/SelectAllowlistCustomerBlocker;", "<init>", "()V", "for_customer_token", "", "back_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "allowlist_limit", "", "Ljava/lang/Integer;", "skip_action", "managed_account_first_name", "(Ljava/lang/Integer;)Lcom/squareup/protos/franklin/api/SelectAllowlistCustomerBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public Integer allowlist_limit;
        public BlockerAction back_action;
        public String for_customer_token;
        public String managed_account_first_name;
        public BlockerAction skip_action;

        public final Builder allowlist_limit(Integer allowlist_limit) {
            this.allowlist_limit = allowlist_limit;
            return this;
        }

        public final Builder back_action(BlockerAction back_action) {
            this.back_action = back_action;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public SelectAllowlistCustomerBlocker build() {
            return new SelectAllowlistCustomerBlocker(this.for_customer_token, this.back_action, this.allowlist_limit, this.skip_action, this.managed_account_first_name, buildUnknownFields());
        }

        public final Builder for_customer_token(String for_customer_token) {
            this.for_customer_token = for_customer_token;
            return this;
        }

        public final Builder managed_account_first_name(String managed_account_first_name) {
            this.managed_account_first_name = managed_account_first_name;
            return this;
        }

        public final Builder skip_action(BlockerAction skip_action) {
            this.skip_action = skip_action;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SelectAllowlistCustomerBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SelectAllowlistCustomerBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public SelectAllowlistCustomerBlocker decode(ProtoReader reader) {
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
                        return new SelectAllowlistCustomerBlocker((String) obj, (BlockerAction) obj2, (Integer) obj3, (BlockerAction) obj4, (String) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj2);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.INT32.decode(reader);
                    } else if (nextTag == 4) {
                        obj4 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj4);
                    } else if (nextTag != 5) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj5 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SelectAllowlistCustomerBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.for_customer_token);
                ProtoAdapter protoAdapter3 = BlockerAction.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 2, value.back_action);
                ProtoAdapter.INT32.encodeWithTag(writer, 3, value.allowlist_limit);
                protoAdapter3.encodeWithTag(writer, 4, value.skip_action);
                protoAdapter2.encodeWithTag(writer, 5, value.managed_account_first_name);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SelectAllowlistCustomerBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(1, value.for_customer_token) + size$okio;
                ProtoAdapter protoAdapter3 = BlockerAction.ADAPTER;
                return protoAdapter2.encodedSizeWithTag(5, value.managed_account_first_name) + protoAdapter3.encodedSizeWithTag(4, value.skip_action) + ProtoAdapter.INT32.encodedSizeWithTag(3, value.allowlist_limit) + protoAdapter3.encodedSizeWithTag(2, value.back_action) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SelectAllowlistCustomerBlocker redact(SelectAllowlistCustomerBlocker value) {
                value.getClass();
                BlockerAction blockerAction = value.back_action;
                BlockerAction blockerAction2 = blockerAction != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction) : null;
                BlockerAction blockerAction3 = value.skip_action;
                BlockerAction blockerAction4 = blockerAction3 != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction3) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.for_customer_token;
                Integer num = value.allowlist_limit;
                byteString.getClass();
                return new SelectAllowlistCustomerBlocker(str, blockerAction2, num, blockerAction4, null, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SelectAllowlistCustomerBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 5, value.managed_account_first_name);
                ProtoAdapter protoAdapter3 = BlockerAction.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 4, value.skip_action);
                ProtoAdapter.INT32.encodeWithTag(writer, 3, value.allowlist_limit);
                protoAdapter3.encodeWithTag(writer, 2, value.back_action);
                protoAdapter2.encodeWithTag(writer, 1, value.for_customer_token);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectAllowlistCustomerBlocker(String str, BlockerAction blockerAction, Integer num, BlockerAction blockerAction2, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.for_customer_token = str;
        this.back_action = blockerAction;
        this.allowlist_limit = num;
        this.skip_action = blockerAction2;
        this.managed_account_first_name = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SelectAllowlistCustomerBlocker)) {
            return false;
        }
        SelectAllowlistCustomerBlocker selectAllowlistCustomerBlocker = (SelectAllowlistCustomerBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), selectAllowlistCustomerBlocker.unknownFields()) && Intrinsics.areEqual(this.for_customer_token, selectAllowlistCustomerBlocker.for_customer_token) && Intrinsics.areEqual(this.back_action, selectAllowlistCustomerBlocker.back_action) && Intrinsics.areEqual(this.allowlist_limit, selectAllowlistCustomerBlocker.allowlist_limit) && Intrinsics.areEqual(this.skip_action, selectAllowlistCustomerBlocker.skip_action) && Intrinsics.areEqual(this.managed_account_first_name, selectAllowlistCustomerBlocker.managed_account_first_name);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.for_customer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        BlockerAction blockerAction = this.back_action;
        int hashCode3 = (hashCode2 + (blockerAction != null ? blockerAction.hashCode() : 0)) * 37;
        Integer num = this.allowlist_limit;
        int hashCode4 = (hashCode3 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        BlockerAction blockerAction2 = this.skip_action;
        int hashCode5 = (hashCode4 + (blockerAction2 != null ? blockerAction2.hashCode() : 0)) * 37;
        String str2 = this.managed_account_first_name;
        int hashCode6 = hashCode5 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.for_customer_token = this.for_customer_token;
        builder.back_action = this.back_action;
        builder.allowlist_limit = this.allowlist_limit;
        builder.skip_action = this.skip_action;
        builder.managed_account_first_name = this.managed_account_first_name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.for_customer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "for_customer_token=", arrayList);
        }
        BlockerAction blockerAction = this.back_action;
        if (blockerAction != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("back_action=", blockerAction, arrayList);
        }
        Integer num = this.allowlist_limit;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("allowlist_limit=", num, arrayList);
        }
        BlockerAction blockerAction2 = this.skip_action;
        if (blockerAction2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("skip_action=", blockerAction2, arrayList);
        }
        if (this.managed_account_first_name != null) {
            arrayList.add("managed_account_first_name=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SelectAllowlistCustomerBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectAllowlistCustomerBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/SelectAllowlistCustomerBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/SelectAllowlistCustomerBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/SelectAllowlistCustomerBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ SelectAllowlistCustomerBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
