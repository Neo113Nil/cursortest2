package com.squareup.protos.franklin.api;

import android.os.Parcelable;
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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000e\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/api/ContactAccessPreparationScreen;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/ContactAccessPreparationScreen$Builder;", "", "treatment", "Ljava/lang/String;", "header_text", "body_text", "skip_button_text", "continue_button_text", "Lcom/squareup/protos/franklin/api/InviteFriendsBlockerButtonOrder;", "button_order", "Lcom/squareup/protos/franklin/api/InviteFriendsBlockerButtonOrder;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ContactAccessPreparationScreen extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ContactAccessPreparationScreen> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String body_text;

    @WireField(adapter = "com.squareup.protos.franklin.api.InviteFriendsBlockerButtonOrder#ADAPTER", schemaIndex = 5, tag = 6)
    public final InviteFriendsBlockerButtonOrder button_order;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String continue_button_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String header_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String skip_button_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String treatment;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ\b\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/squareup/protos/franklin/api/ContactAccessPreparationScreen$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/ContactAccessPreparationScreen;", "<init>", "()V", "treatment", "", "header_text", "body_text", "skip_button_text", "continue_button_text", "button_order", "Lcom/squareup/protos/franklin/api/InviteFriendsBlockerButtonOrder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String body_text;
        public InviteFriendsBlockerButtonOrder button_order;
        public String continue_button_text;
        public String header_text;
        public String skip_button_text;
        public String treatment;

        public final Builder body_text(String body_text) {
            this.body_text = body_text;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public ContactAccessPreparationScreen build() {
            return new ContactAccessPreparationScreen(this.treatment, this.header_text, this.body_text, this.skip_button_text, this.continue_button_text, this.button_order, buildUnknownFields());
        }

        public final Builder button_order(InviteFriendsBlockerButtonOrder button_order) {
            this.button_order = button_order;
            return this;
        }

        public final Builder continue_button_text(String continue_button_text) {
            this.continue_button_text = continue_button_text;
            return this;
        }

        public final Builder header_text(String header_text) {
            this.header_text = header_text;
            return this;
        }

        public final Builder skip_button_text(String skip_button_text) {
            this.skip_button_text = skip_button_text;
            return this;
        }

        public final Builder treatment(String treatment) {
            this.treatment = treatment;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ContactAccessPreparationScreen.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.ContactAccessPreparationScreen$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public ContactAccessPreparationScreen decode(ProtoReader reader) {
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
                        return new ContactAccessPreparationScreen((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (InviteFriendsBlockerButtonOrder) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
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
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            try {
                                obj6 = InviteFriendsBlockerButtonOrder.ADAPTER.decode(reader);
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
            public void encode(ProtoWriter writer, ContactAccessPreparationScreen value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.treatment);
                protoAdapter2.encodeWithTag(writer, 2, value.header_text);
                protoAdapter2.encodeWithTag(writer, 3, value.body_text);
                protoAdapter2.encodeWithTag(writer, 4, value.skip_button_text);
                protoAdapter2.encodeWithTag(writer, 5, value.continue_button_text);
                InviteFriendsBlockerButtonOrder.ADAPTER.encodeWithTag(writer, 6, value.button_order);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ContactAccessPreparationScreen value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return InviteFriendsBlockerButtonOrder.ADAPTER.encodedSizeWithTag(6, value.button_order) + protoAdapter2.encodedSizeWithTag(5, value.continue_button_text) + protoAdapter2.encodedSizeWithTag(4, value.skip_button_text) + protoAdapter2.encodedSizeWithTag(3, value.body_text) + protoAdapter2.encodedSizeWithTag(2, value.header_text) + protoAdapter2.encodedSizeWithTag(1, value.treatment) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ContactAccessPreparationScreen redact(ContactAccessPreparationScreen value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = value.treatment;
                String str2 = value.header_text;
                String str3 = value.body_text;
                String str4 = value.skip_button_text;
                String str5 = value.continue_button_text;
                InviteFriendsBlockerButtonOrder inviteFriendsBlockerButtonOrder = value.button_order;
                value.getClass();
                byteString.getClass();
                return new ContactAccessPreparationScreen(str, str2, str3, str4, str5, inviteFriendsBlockerButtonOrder, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ContactAccessPreparationScreen value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                InviteFriendsBlockerButtonOrder.ADAPTER.encodeWithTag(writer, 6, value.button_order);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 5, value.continue_button_text);
                protoAdapter2.encodeWithTag(writer, 4, value.skip_button_text);
                protoAdapter2.encodeWithTag(writer, 3, value.body_text);
                protoAdapter2.encodeWithTag(writer, 2, value.header_text);
                protoAdapter2.encodeWithTag(writer, 1, value.treatment);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactAccessPreparationScreen(String str, String str2, String str3, String str4, String str5, InviteFriendsBlockerButtonOrder inviteFriendsBlockerButtonOrder, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.treatment = str;
        this.header_text = str2;
        this.body_text = str3;
        this.skip_button_text = str4;
        this.continue_button_text = str5;
        this.button_order = inviteFriendsBlockerButtonOrder;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContactAccessPreparationScreen)) {
            return false;
        }
        ContactAccessPreparationScreen contactAccessPreparationScreen = (ContactAccessPreparationScreen) obj;
        return Intrinsics.areEqual(unknownFields(), contactAccessPreparationScreen.unknownFields()) && Intrinsics.areEqual(this.treatment, contactAccessPreparationScreen.treatment) && Intrinsics.areEqual(this.header_text, contactAccessPreparationScreen.header_text) && Intrinsics.areEqual(this.body_text, contactAccessPreparationScreen.body_text) && Intrinsics.areEqual(this.skip_button_text, contactAccessPreparationScreen.skip_button_text) && Intrinsics.areEqual(this.continue_button_text, contactAccessPreparationScreen.continue_button_text) && this.button_order == contactAccessPreparationScreen.button_order;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.treatment;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.header_text;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.body_text;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.skip_button_text;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.continue_button_text;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        InviteFriendsBlockerButtonOrder inviteFriendsBlockerButtonOrder = this.button_order;
        int hashCode7 = hashCode6 + (inviteFriendsBlockerButtonOrder != null ? inviteFriendsBlockerButtonOrder.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.treatment = this.treatment;
        builder.header_text = this.header_text;
        builder.body_text = this.body_text;
        builder.skip_button_text = this.skip_button_text;
        builder.continue_button_text = this.continue_button_text;
        builder.button_order = this.button_order;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.treatment;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "treatment=", arrayList);
        }
        String str2 = this.header_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "header_text=", arrayList);
        }
        String str3 = this.body_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "body_text=", arrayList);
        }
        String str4 = this.skip_button_text;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "skip_button_text=", arrayList);
        }
        String str5 = this.continue_button_text;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "continue_button_text=", arrayList);
        }
        InviteFriendsBlockerButtonOrder inviteFriendsBlockerButtonOrder = this.button_order;
        if (inviteFriendsBlockerButtonOrder != null) {
            arrayList.add("button_order=" + inviteFriendsBlockerButtonOrder);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ContactAccessPreparationScreen{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/ContactAccessPreparationScreen$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/ContactAccessPreparationScreen$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/ContactAccessPreparationScreen;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/ContactAccessPreparationScreen;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ ContactAccessPreparationScreen build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
