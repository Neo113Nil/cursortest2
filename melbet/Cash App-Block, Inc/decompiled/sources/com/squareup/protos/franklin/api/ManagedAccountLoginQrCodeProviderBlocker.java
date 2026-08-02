package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiAvatar;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.ActionButton;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/api/ManagedAccountLoginQrCodeProviderBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/ManagedAccountLoginQrCodeProviderBlocker$Builder;", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "avatar", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "", "title_text", "Ljava/lang/String;", "body_text", "deep_link_qr_code_image_url", "button_text", "Lcom/squareup/protos/franklin/api/BlockerAction;", ActionButton.f1477type, "Lcom/squareup/protos/franklin/api/BlockerAction;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ManagedAccountLoginQrCodeProviderBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ManagedAccountLoginQrCodeProviderBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.ui.UiAvatar#ADAPTER", schemaIndex = 0, tag = 1)
    public final UiAvatar avatar;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String body_text;

    @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 5, tag = 6)
    public final BlockerAction button_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String button_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String deep_link_qr_code_image_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String title_text;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\bJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/api/ManagedAccountLoginQrCodeProviderBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/ManagedAccountLoginQrCodeProviderBlocker;", "<init>", "()V", "avatar", "Lcom/squareup/protos/franklin/ui/UiAvatar;", "title_text", "", "body_text", "deep_link_qr_code_image_url", "button_text", ActionButton.f1477type, "Lcom/squareup/protos/franklin/api/BlockerAction;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public UiAvatar avatar;
        public String body_text;
        public BlockerAction button_action;
        public String button_text;
        public String deep_link_qr_code_image_url;
        public String title_text;

        public final Builder avatar(UiAvatar avatar) {
            this.avatar = avatar;
            return this;
        }

        public final Builder body_text(String body_text) {
            this.body_text = body_text;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ManagedAccountLoginQrCodeProviderBlocker build() {
            return new ManagedAccountLoginQrCodeProviderBlocker(this.avatar, this.title_text, this.body_text, this.deep_link_qr_code_image_url, this.button_text, this.button_action, buildUnknownFields());
        }

        public final Builder button_action(BlockerAction button_action) {
            this.button_action = button_action;
            return this;
        }

        public final Builder button_text(String button_text) {
            this.button_text = button_text;
            return this;
        }

        public final Builder deep_link_qr_code_image_url(String deep_link_qr_code_image_url) {
            this.deep_link_qr_code_image_url = deep_link_qr_code_image_url;
            return this;
        }

        public final Builder title_text(String title_text) {
            this.title_text = title_text;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ManagedAccountLoginQrCodeProviderBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.ManagedAccountLoginQrCodeProviderBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public ManagedAccountLoginQrCodeProviderBlocker decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new ManagedAccountLoginQrCodeProviderBlocker((UiAvatar) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (BlockerAction) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = TransactorKt.decodeMessageOrMerge(UiAvatar.ADAPTER, reader, obj);
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
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            obj6 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj6);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ManagedAccountLoginQrCodeProviderBlocker value) {
                writer.getClass();
                value.getClass();
                UiAvatar.ADAPTER.encodeWithTag(writer, 1, value.avatar);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 2, value.title_text);
                protoAdapter2.encodeWithTag(writer, 3, value.body_text);
                protoAdapter2.encodeWithTag(writer, 4, value.deep_link_qr_code_image_url);
                protoAdapter2.encodeWithTag(writer, 5, value.button_text);
                BlockerAction.ADAPTER.encodeWithTag(writer, 6, value.button_action);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ManagedAccountLoginQrCodeProviderBlocker value) {
                value.getClass();
                int encodedSizeWithTag = UiAvatar.ADAPTER.encodedSizeWithTag(1, value.avatar) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return BlockerAction.ADAPTER.encodedSizeWithTag(6, value.button_action) + protoAdapter2.encodedSizeWithTag(5, value.button_text) + protoAdapter2.encodedSizeWithTag(4, value.deep_link_qr_code_image_url) + protoAdapter2.encodedSizeWithTag(3, value.body_text) + protoAdapter2.encodedSizeWithTag(2, value.title_text) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ManagedAccountLoginQrCodeProviderBlocker redact(ManagedAccountLoginQrCodeProviderBlocker value) {
                value.getClass();
                UiAvatar uiAvatar = value.avatar;
                UiAvatar uiAvatar2 = uiAvatar != null ? (UiAvatar) UiAvatar.ADAPTER.redact(uiAvatar) : null;
                BlockerAction blockerAction = value.button_action;
                BlockerAction blockerAction2 = blockerAction != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.title_text;
                String str2 = value.body_text;
                String str3 = value.deep_link_qr_code_image_url;
                String str4 = value.button_text;
                byteString.getClass();
                return new ManagedAccountLoginQrCodeProviderBlocker(uiAvatar2, str, str2, str3, str4, blockerAction2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ManagedAccountLoginQrCodeProviderBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                BlockerAction.ADAPTER.encodeWithTag(writer, 6, value.button_action);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 5, value.button_text);
                protoAdapter2.encodeWithTag(writer, 4, value.deep_link_qr_code_image_url);
                protoAdapter2.encodeWithTag(writer, 3, value.body_text);
                protoAdapter2.encodeWithTag(writer, 2, value.title_text);
                UiAvatar.ADAPTER.encodeWithTag(writer, 1, value.avatar);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagedAccountLoginQrCodeProviderBlocker(UiAvatar uiAvatar, String str, String str2, String str3, String str4, BlockerAction blockerAction, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.avatar = uiAvatar;
        this.title_text = str;
        this.body_text = str2;
        this.deep_link_qr_code_image_url = str3;
        this.button_text = str4;
        this.button_action = blockerAction;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ManagedAccountLoginQrCodeProviderBlocker)) {
            return false;
        }
        ManagedAccountLoginQrCodeProviderBlocker managedAccountLoginQrCodeProviderBlocker = (ManagedAccountLoginQrCodeProviderBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), managedAccountLoginQrCodeProviderBlocker.unknownFields()) && Intrinsics.areEqual(this.avatar, managedAccountLoginQrCodeProviderBlocker.avatar) && Intrinsics.areEqual(this.title_text, managedAccountLoginQrCodeProviderBlocker.title_text) && Intrinsics.areEqual(this.body_text, managedAccountLoginQrCodeProviderBlocker.body_text) && Intrinsics.areEqual(this.deep_link_qr_code_image_url, managedAccountLoginQrCodeProviderBlocker.deep_link_qr_code_image_url) && Intrinsics.areEqual(this.button_text, managedAccountLoginQrCodeProviderBlocker.button_text) && Intrinsics.areEqual(this.button_action, managedAccountLoginQrCodeProviderBlocker.button_action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        UiAvatar uiAvatar = this.avatar;
        int hashCode2 = (hashCode + (uiAvatar != null ? uiAvatar.hashCode() : 0)) * 37;
        String str = this.title_text;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.body_text;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.deep_link_qr_code_image_url;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.button_text;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        BlockerAction blockerAction = this.button_action;
        int hashCode7 = hashCode6 + (blockerAction != null ? blockerAction.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.avatar = this.avatar;
        builder.title_text = this.title_text;
        builder.body_text = this.body_text;
        builder.deep_link_qr_code_image_url = this.deep_link_qr_code_image_url;
        builder.button_text = this.button_text;
        builder.button_action = this.button_action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        UiAvatar uiAvatar = this.avatar;
        if (uiAvatar != null) {
            Matcher$$ExternalSyntheticOutline0.m("avatar=", uiAvatar, arrayList);
        }
        String str = this.title_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title_text=", arrayList);
        }
        String str2 = this.body_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "body_text=", arrayList);
        }
        String str3 = this.deep_link_qr_code_image_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "deep_link_qr_code_image_url=", arrayList);
        }
        String str4 = this.button_text;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "button_text=", arrayList);
        }
        BlockerAction blockerAction = this.button_action;
        if (blockerAction != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("button_action=", blockerAction, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ManagedAccountLoginQrCodeProviderBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/ManagedAccountLoginQrCodeProviderBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/ManagedAccountLoginQrCodeProviderBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/ManagedAccountLoginQrCodeProviderBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/ManagedAccountLoginQrCodeProviderBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ ManagedAccountLoginQrCodeProviderBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
