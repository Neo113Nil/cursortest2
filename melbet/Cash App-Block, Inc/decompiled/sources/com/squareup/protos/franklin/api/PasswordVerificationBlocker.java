package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/api/PasswordVerificationBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PasswordVerificationBlocker$Builder;", "", "header_text", "Ljava/lang/String;", "detail_text", "password_placeholder", "Lcom/squareup/protos/franklin/api/BlockerAction;", "help_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "", "should_suppress_password_token_storage", "Ljava/lang/Boolean;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PasswordVerificationBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PasswordVerificationBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String detail_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String header_text;

    @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 3, tag = 4)
    public final BlockerAction help_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String password_placeholder;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 4, tag = 5)
    public final Boolean should_suppress_password_token_storage;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/api/PasswordVerificationBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PasswordVerificationBlocker;", "<init>", "()V", "header_text", "", "detail_text", "password_placeholder", "help_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "should_suppress_password_token_storage", "", "Ljava/lang/Boolean;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/PasswordVerificationBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public String detail_text;
        public String header_text;
        public BlockerAction help_action;
        public String password_placeholder;
        public Boolean should_suppress_password_token_storage;

        @Override // com.squareup.wire.Message.Builder
        public PasswordVerificationBlocker build() {
            return new PasswordVerificationBlocker(this.header_text, this.detail_text, this.password_placeholder, this.help_action, this.should_suppress_password_token_storage, buildUnknownFields());
        }

        public final Builder detail_text(String detail_text) {
            this.detail_text = detail_text;
            return this;
        }

        public final Builder header_text(String header_text) {
            this.header_text = header_text;
            return this;
        }

        public final Builder help_action(BlockerAction help_action) {
            this.help_action = help_action;
            return this;
        }

        public final Builder password_placeholder(String password_placeholder) {
            this.password_placeholder = password_placeholder;
            return this;
        }

        public final Builder should_suppress_password_token_storage(Boolean should_suppress_password_token_storage) {
            this.should_suppress_password_token_storage = should_suppress_password_token_storage;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PasswordVerificationBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PasswordVerificationBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public PasswordVerificationBlocker decode(ProtoReader reader) {
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
                        return new PasswordVerificationBlocker((String) obj, (String) obj2, (String) obj3, (BlockerAction) obj4, (Boolean) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 3) {
                        obj3 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 4) {
                        obj4 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj4);
                    } else if (nextTag != 5) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj5 = ProtoAdapter.BOOL.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PasswordVerificationBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.header_text);
                protoAdapter2.encodeWithTag(writer, 2, value.detail_text);
                protoAdapter2.encodeWithTag(writer, 3, value.password_placeholder);
                BlockerAction.ADAPTER.encodeWithTag(writer, 4, value.help_action);
                ProtoAdapter.BOOL.encodeWithTag(writer, 5, value.should_suppress_password_token_storage);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PasswordVerificationBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return ProtoAdapter.BOOL.encodedSizeWithTag(5, value.should_suppress_password_token_storage) + BlockerAction.ADAPTER.encodedSizeWithTag(4, value.help_action) + protoAdapter2.encodedSizeWithTag(3, value.password_placeholder) + protoAdapter2.encodedSizeWithTag(2, value.detail_text) + protoAdapter2.encodedSizeWithTag(1, value.header_text) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PasswordVerificationBlocker redact(PasswordVerificationBlocker value) {
                value.getClass();
                BlockerAction blockerAction = value.help_action;
                BlockerAction blockerAction2 = blockerAction != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.header_text;
                String str2 = value.detail_text;
                String str3 = value.password_placeholder;
                Boolean bool = value.should_suppress_password_token_storage;
                byteString.getClass();
                return new PasswordVerificationBlocker(str, str2, str3, blockerAction2, bool, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PasswordVerificationBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(writer, 5, value.should_suppress_password_token_storage);
                BlockerAction.ADAPTER.encodeWithTag(writer, 4, value.help_action);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 3, value.password_placeholder);
                protoAdapter2.encodeWithTag(writer, 2, value.detail_text);
                protoAdapter2.encodeWithTag(writer, 1, value.header_text);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasswordVerificationBlocker(String str, String str2, String str3, BlockerAction blockerAction, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.header_text = str;
        this.detail_text = str2;
        this.password_placeholder = str3;
        this.help_action = blockerAction;
        this.should_suppress_password_token_storage = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PasswordVerificationBlocker)) {
            return false;
        }
        PasswordVerificationBlocker passwordVerificationBlocker = (PasswordVerificationBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), passwordVerificationBlocker.unknownFields()) && Intrinsics.areEqual(this.header_text, passwordVerificationBlocker.header_text) && Intrinsics.areEqual(this.detail_text, passwordVerificationBlocker.detail_text) && Intrinsics.areEqual(this.password_placeholder, passwordVerificationBlocker.password_placeholder) && Intrinsics.areEqual(this.help_action, passwordVerificationBlocker.help_action) && Intrinsics.areEqual(this.should_suppress_password_token_storage, passwordVerificationBlocker.should_suppress_password_token_storage);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.header_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.detail_text;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.password_placeholder;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        BlockerAction blockerAction = this.help_action;
        int hashCode5 = (hashCode4 + (blockerAction != null ? blockerAction.hashCode() : 0)) * 37;
        Boolean bool = this.should_suppress_password_token_storage;
        int hashCode6 = hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.header_text = this.header_text;
        builder.detail_text = this.detail_text;
        builder.password_placeholder = this.password_placeholder;
        builder.help_action = this.help_action;
        builder.should_suppress_password_token_storage = this.should_suppress_password_token_storage;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.header_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "header_text=", arrayList);
        }
        String str2 = this.detail_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "detail_text=", arrayList);
        }
        String str3 = this.password_placeholder;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "password_placeholder=", arrayList);
        }
        BlockerAction blockerAction = this.help_action;
        if (blockerAction != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("help_action=", blockerAction, arrayList);
        }
        Boolean bool = this.should_suppress_password_token_storage;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("should_suppress_password_token_storage=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PasswordVerificationBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PasswordVerificationBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PasswordVerificationBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PasswordVerificationBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PasswordVerificationBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PasswordVerificationBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
