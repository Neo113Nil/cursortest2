package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.SelectSponsorsBlocker;
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

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0015\u0014\u0016\u0017R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker$Builder;", "", "allow_only_cash_users", "Ljava/lang/Boolean;", "", "title", "Ljava/lang/String;", "to_hint", "should_only_recommend_cash_users", "Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker$AddContactsDialog;", "contacts_dialog", "Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker$AddContactsDialog;", "Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker$AddContactsCard;", "contacts_card", "Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker$AddContactsCard;", "Lcom/squareup/protos/franklin/api/BlockerAction;", "invite_contact_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "Companion", "Builder", "AddContactsDialog", "AddContactsCard", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectSponsorsBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SelectSponsorsBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 0, tag = 1)
    public final Boolean allow_only_cash_users;

    @WireField(adapter = "com.squareup.protos.franklin.api.SelectSponsorsBlocker$AddContactsCard#ADAPTER", schemaIndex = 5, tag = 7)
    public final AddContactsCard contacts_card;

    @WireField(adapter = "com.squareup.protos.franklin.api.SelectSponsorsBlocker$AddContactsDialog#ADAPTER", schemaIndex = 4, tag = 6)
    public final AddContactsDialog contacts_dialog;

    @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 6, tag = 8)
    public final BlockerAction invite_contact_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 3, tag = 5)
    public final Boolean should_only_recommend_cash_users;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 3)
    public final String title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 2, tag = 4)
    public final String to_hint;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0012J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0012J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\b\u0010\u0013\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker;", "<init>", "()V", "allow_only_cash_users", "", "Ljava/lang/Boolean;", "title", "", "to_hint", "should_only_recommend_cash_users", "contacts_dialog", "Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker$AddContactsDialog;", "contacts_card", "Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker$AddContactsCard;", "invite_contact_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public Boolean allow_only_cash_users;
        public AddContactsCard contacts_card;
        public AddContactsDialog contacts_dialog;
        public BlockerAction invite_contact_action;
        public Boolean should_only_recommend_cash_users;
        public String title;
        public String to_hint;

        public final Builder allow_only_cash_users(Boolean allow_only_cash_users) {
            this.allow_only_cash_users = allow_only_cash_users;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public SelectSponsorsBlocker build() {
            return new SelectSponsorsBlocker(this.allow_only_cash_users, this.title, this.to_hint, this.should_only_recommend_cash_users, this.contacts_dialog, this.contacts_card, this.invite_contact_action, buildUnknownFields());
        }

        public final Builder contacts_card(AddContactsCard contacts_card) {
            this.contacts_card = contacts_card;
            return this;
        }

        public final Builder contacts_dialog(AddContactsDialog contacts_dialog) {
            this.contacts_dialog = contacts_dialog;
            return this;
        }

        public final Builder invite_contact_action(BlockerAction invite_contact_action) {
            this.invite_contact_action = invite_contact_action;
            return this;
        }

        public final Builder should_only_recommend_cash_users(Boolean should_only_recommend_cash_users) {
            this.should_only_recommend_cash_users = should_only_recommend_cash_users;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }

        public final Builder to_hint(String to_hint) {
            this.to_hint = to_hint;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SelectSponsorsBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SelectSponsorsBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public SelectSponsorsBlocker decode(ProtoReader reader) {
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
                        return new SelectSponsorsBlocker((Boolean) obj, (String) obj2, (String) obj3, (Boolean) obj4, (SelectSponsorsBlocker.AddContactsDialog) obj5, (SelectSponsorsBlocker.AddContactsCard) obj6, (BlockerAction) obj7, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 2:
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                        case 3:
                            obj2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            obj3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            obj4 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 6:
                            obj5 = TransactorKt.decodeMessageOrMerge(SelectSponsorsBlocker.AddContactsDialog.ADAPTER, reader, obj5);
                            break;
                        case 7:
                            obj6 = TransactorKt.decodeMessageOrMerge(SelectSponsorsBlocker.AddContactsCard.ADAPTER, reader, obj6);
                            break;
                        case 8:
                            obj7 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj7);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SelectSponsorsBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 1, value.allow_only_cash_users);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 3, value.title);
                protoAdapter3.encodeWithTag(writer, 4, value.to_hint);
                protoAdapter2.encodeWithTag(writer, 5, value.should_only_recommend_cash_users);
                SelectSponsorsBlocker.AddContactsDialog.ADAPTER.encodeWithTag(writer, 6, value.contacts_dialog);
                SelectSponsorsBlocker.AddContactsCard.ADAPTER.encodeWithTag(writer, 7, value.contacts_card);
                BlockerAction.ADAPTER.encodeWithTag(writer, 8, value.invite_contact_action);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SelectSponsorsBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(1, value.allow_only_cash_users) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                return BlockerAction.ADAPTER.encodedSizeWithTag(8, value.invite_contact_action) + SelectSponsorsBlocker.AddContactsCard.ADAPTER.encodedSizeWithTag(7, value.contacts_card) + SelectSponsorsBlocker.AddContactsDialog.ADAPTER.encodedSizeWithTag(6, value.contacts_dialog) + protoAdapter2.encodedSizeWithTag(5, value.should_only_recommend_cash_users) + protoAdapter3.encodedSizeWithTag(4, value.to_hint) + protoAdapter3.encodedSizeWithTag(3, value.title) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SelectSponsorsBlocker redact(SelectSponsorsBlocker value) {
                value.getClass();
                SelectSponsorsBlocker.AddContactsDialog addContactsDialog = value.contacts_dialog;
                SelectSponsorsBlocker.AddContactsDialog addContactsDialog2 = addContactsDialog != null ? (SelectSponsorsBlocker.AddContactsDialog) SelectSponsorsBlocker.AddContactsDialog.ADAPTER.redact(addContactsDialog) : null;
                SelectSponsorsBlocker.AddContactsCard addContactsCard = value.contacts_card;
                SelectSponsorsBlocker.AddContactsCard addContactsCard2 = addContactsCard != null ? (SelectSponsorsBlocker.AddContactsCard) SelectSponsorsBlocker.AddContactsCard.ADAPTER.redact(addContactsCard) : null;
                BlockerAction blockerAction = value.invite_contact_action;
                BlockerAction blockerAction2 = blockerAction != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction) : null;
                ByteString byteString = ByteString.EMPTY;
                Boolean bool = value.allow_only_cash_users;
                Boolean bool2 = value.should_only_recommend_cash_users;
                byteString.getClass();
                return new SelectSponsorsBlocker(bool, null, null, bool2, addContactsDialog2, addContactsCard2, blockerAction2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SelectSponsorsBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                BlockerAction.ADAPTER.encodeWithTag(writer, 8, value.invite_contact_action);
                SelectSponsorsBlocker.AddContactsCard.ADAPTER.encodeWithTag(writer, 7, value.contacts_card);
                SelectSponsorsBlocker.AddContactsDialog.ADAPTER.encodeWithTag(writer, 6, value.contacts_dialog);
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 5, value.should_only_recommend_cash_users);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 4, value.to_hint);
                protoAdapter3.encodeWithTag(writer, 3, value.title);
                protoAdapter2.encodeWithTag(writer, 1, value.allow_only_cash_users);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectSponsorsBlocker(Boolean bool, String str, String str2, Boolean bool2, AddContactsDialog addContactsDialog, AddContactsCard addContactsCard, BlockerAction blockerAction, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.allow_only_cash_users = bool;
        this.title = str;
        this.to_hint = str2;
        this.should_only_recommend_cash_users = bool2;
        this.contacts_dialog = addContactsDialog;
        this.contacts_card = addContactsCard;
        this.invite_contact_action = blockerAction;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SelectSponsorsBlocker)) {
            return false;
        }
        SelectSponsorsBlocker selectSponsorsBlocker = (SelectSponsorsBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), selectSponsorsBlocker.unknownFields()) && Intrinsics.areEqual(this.allow_only_cash_users, selectSponsorsBlocker.allow_only_cash_users) && Intrinsics.areEqual(this.title, selectSponsorsBlocker.title) && Intrinsics.areEqual(this.to_hint, selectSponsorsBlocker.to_hint) && Intrinsics.areEqual(this.should_only_recommend_cash_users, selectSponsorsBlocker.should_only_recommend_cash_users) && Intrinsics.areEqual(this.contacts_dialog, selectSponsorsBlocker.contacts_dialog) && Intrinsics.areEqual(this.contacts_card, selectSponsorsBlocker.contacts_card) && Intrinsics.areEqual(this.invite_contact_action, selectSponsorsBlocker.invite_contact_action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.allow_only_cash_users;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.title;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.to_hint;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool2 = this.should_only_recommend_cash_users;
        int hashCode5 = (hashCode4 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        AddContactsDialog addContactsDialog = this.contacts_dialog;
        int hashCode6 = (hashCode5 + (addContactsDialog != null ? addContactsDialog.hashCode() : 0)) * 37;
        AddContactsCard addContactsCard = this.contacts_card;
        int hashCode7 = (hashCode6 + (addContactsCard != null ? addContactsCard.hashCode() : 0)) * 37;
        BlockerAction blockerAction = this.invite_contact_action;
        int hashCode8 = hashCode7 + (blockerAction != null ? blockerAction.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.allow_only_cash_users = this.allow_only_cash_users;
        builder.title = this.title;
        builder.to_hint = this.to_hint;
        builder.should_only_recommend_cash_users = this.should_only_recommend_cash_users;
        builder.contacts_dialog = this.contacts_dialog;
        builder.contacts_card = this.contacts_card;
        builder.invite_contact_action = this.invite_contact_action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.allow_only_cash_users;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("allow_only_cash_users=", bool, arrayList);
        }
        if (this.title != null) {
            arrayList.add("title=██");
        }
        if (this.to_hint != null) {
            arrayList.add("to_hint=██");
        }
        Boolean bool2 = this.should_only_recommend_cash_users;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("should_only_recommend_cash_users=", bool2, arrayList);
        }
        AddContactsDialog addContactsDialog = this.contacts_dialog;
        if (addContactsDialog != null) {
            arrayList.add("contacts_dialog=" + addContactsDialog);
        }
        AddContactsCard addContactsCard = this.contacts_card;
        if (addContactsCard != null) {
            arrayList.add("contacts_card=" + addContactsCard);
        }
        BlockerAction blockerAction = this.invite_contact_action;
        if (blockerAction != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("invite_contact_action=", blockerAction, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SelectSponsorsBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker$AddContactsCard;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker$AddContactsCard$Builder;", "inline_text", "", "add_contact_button_title", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class AddContactsCard extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AddContactsCard> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String add_contact_button_title;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String inline_text;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker$AddContactsCard$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker$AddContactsCard;", "<init>", "()V", "inline_text", "", "add_contact_button_title", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String add_contact_button_title;
            public String inline_text;

            public final Builder add_contact_button_title(String add_contact_button_title) {
                this.add_contact_button_title = add_contact_button_title;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public AddContactsCard build() {
                return new AddContactsCard(this.inline_text, this.add_contact_button_title, buildUnknownFields());
            }

            public final Builder inline_text(String inline_text) {
                this.inline_text = inline_text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AddContactsCard.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SelectSponsorsBlocker$AddContactsCard$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public SelectSponsorsBlocker.AddContactsCard decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new SelectSponsorsBlocker.AddContactsCard((String) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
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
                public void encode(ProtoWriter writer, SelectSponsorsBlocker.AddContactsCard value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.inline_text);
                    protoAdapter2.encodeWithTag(writer, 2, value.add_contact_button_title);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(SelectSponsorsBlocker.AddContactsCard value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(2, value.add_contact_button_title) + protoAdapter2.encodedSizeWithTag(1, value.inline_text) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public SelectSponsorsBlocker.AddContactsCard redact(SelectSponsorsBlocker.AddContactsCard value) {
                    value.getClass();
                    return SelectSponsorsBlocker.AddContactsCard.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, SelectSponsorsBlocker.AddContactsCard value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.add_contact_button_title);
                    protoAdapter2.encodeWithTag(writer, 1, value.inline_text);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ AddContactsCard(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ AddContactsCard copy$default(AddContactsCard addContactsCard, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = addContactsCard.inline_text;
            }
            if ((i & 2) != 0) {
                str2 = addContactsCard.add_contact_button_title;
            }
            if ((i & 4) != 0) {
                byteString = addContactsCard.unknownFields();
            }
            return addContactsCard.copy(str, str2, byteString);
        }

        public final AddContactsCard copy(String inline_text, String add_contact_button_title, ByteString unknownFields) {
            unknownFields.getClass();
            return new AddContactsCard(inline_text, add_contact_button_title, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof AddContactsCard)) {
                return false;
            }
            AddContactsCard addContactsCard = (AddContactsCard) other;
            return Intrinsics.areEqual(unknownFields(), addContactsCard.unknownFields()) && Intrinsics.areEqual(this.inline_text, addContactsCard.inline_text) && Intrinsics.areEqual(this.add_contact_button_title, addContactsCard.add_contact_button_title);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.inline_text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.add_contact_button_title;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.inline_text = this.inline_text;
            builder.add_contact_button_title = this.add_contact_button_title;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.inline_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "inline_text=", arrayList);
            }
            String str2 = this.add_contact_button_title;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "add_contact_button_title=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AddContactsCard{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker$AddContactsCard$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker$AddContactsCard$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker$AddContactsCard;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker$AddContactsCard;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ AddContactsCard build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public AddContactsCard() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddContactsCard(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.inline_text = str;
            this.add_contact_button_title = str2;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0004H\u0016J@\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker$AddContactsDialog;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker$AddContactsDialog$Builder;", "title", "", "body", "add_contact_button_title", "dismiss_button_title", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class AddContactsDialog extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<AddContactsDialog> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String add_contact_button_title;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
        public final String body;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
        public final String dismiss_button_title;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
        public final String title;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker$AddContactsDialog$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker$AddContactsDialog;", "<init>", "()V", "title", "", "body", "add_contact_button_title", "dismiss_button_title", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String add_contact_button_title;
            public String body;
            public String dismiss_button_title;
            public String title;

            public final Builder add_contact_button_title(String add_contact_button_title) {
                this.add_contact_button_title = add_contact_button_title;
                return this;
            }

            public final Builder body(String body) {
                this.body = body;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public AddContactsDialog build() {
                return new AddContactsDialog(this.title, this.body, this.add_contact_button_title, this.dismiss_button_title, buildUnknownFields());
            }

            public final Builder dismiss_button_title(String dismiss_button_title) {
                this.dismiss_button_title = dismiss_button_title;
                return this;
            }

            public final Builder title(String title) {
                this.title = title;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(AddContactsDialog.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SelectSponsorsBlocker$AddContactsDialog$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public SelectSponsorsBlocker.AddContactsDialog decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    Object obj4 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new SelectSponsorsBlocker.AddContactsDialog((String) obj, (String) obj2, (String) obj3, (String) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 3) {
                            obj3 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 4) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj4 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, SelectSponsorsBlocker.AddContactsDialog value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                    protoAdapter2.encodeWithTag(writer, 2, value.body);
                    protoAdapter2.encodeWithTag(writer, 3, value.add_contact_button_title);
                    protoAdapter2.encodeWithTag(writer, 4, value.dismiss_button_title);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(SelectSponsorsBlocker.AddContactsDialog value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(4, value.dismiss_button_title) + protoAdapter2.encodedSizeWithTag(3, value.add_contact_button_title) + protoAdapter2.encodedSizeWithTag(2, value.body) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public SelectSponsorsBlocker.AddContactsDialog redact(SelectSponsorsBlocker.AddContactsDialog value) {
                    value.getClass();
                    return SelectSponsorsBlocker.AddContactsDialog.copy$default(value, null, null, null, null, ByteString.EMPTY, 12, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, SelectSponsorsBlocker.AddContactsDialog value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 4, value.dismiss_button_title);
                    protoAdapter2.encodeWithTag(writer, 3, value.add_contact_button_title);
                    protoAdapter2.encodeWithTag(writer, 2, value.body);
                    protoAdapter2.encodeWithTag(writer, 1, value.title);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ AddContactsDialog(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ AddContactsDialog copy$default(AddContactsDialog addContactsDialog, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = addContactsDialog.title;
            }
            if ((i & 2) != 0) {
                str2 = addContactsDialog.body;
            }
            if ((i & 4) != 0) {
                str3 = addContactsDialog.add_contact_button_title;
            }
            if ((i & 8) != 0) {
                str4 = addContactsDialog.dismiss_button_title;
            }
            if ((i & 16) != 0) {
                byteString = addContactsDialog.unknownFields();
            }
            ByteString byteString2 = byteString;
            String str5 = str3;
            return addContactsDialog.copy(str, str2, str5, str4, byteString2);
        }

        public final AddContactsDialog copy(String title, String body, String add_contact_button_title, String dismiss_button_title, ByteString unknownFields) {
            unknownFields.getClass();
            return new AddContactsDialog(title, body, add_contact_button_title, dismiss_button_title, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof AddContactsDialog)) {
                return false;
            }
            AddContactsDialog addContactsDialog = (AddContactsDialog) other;
            return Intrinsics.areEqual(unknownFields(), addContactsDialog.unknownFields()) && Intrinsics.areEqual(this.title, addContactsDialog.title) && Intrinsics.areEqual(this.body, addContactsDialog.body) && Intrinsics.areEqual(this.add_contact_button_title, addContactsDialog.add_contact_button_title) && Intrinsics.areEqual(this.dismiss_button_title, addContactsDialog.dismiss_button_title);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.body;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.add_contact_button_title;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.dismiss_button_title;
            int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title = this.title;
            builder.body = this.body;
            builder.add_contact_button_title = this.add_contact_button_title;
            builder.dismiss_button_title = this.dismiss_button_title;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (this.title != null) {
                arrayList.add("title=██");
            }
            if (this.body != null) {
                arrayList.add("body=██");
            }
            String str = this.add_contact_button_title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "add_contact_button_title=", arrayList);
            }
            String str2 = this.dismiss_button_title;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "dismiss_button_title=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "AddContactsDialog{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker$AddContactsDialog$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker$AddContactsDialog$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker$AddContactsDialog;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker$AddContactsDialog;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ AddContactsDialog build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public AddContactsDialog() {
            this(null, null, null, null, null, 31, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AddContactsDialog(String str, String str2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.body = str2;
            this.add_contact_button_title = str3;
            this.dismiss_button_title = str4;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/SelectSponsorsBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ SelectSponsorsBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
