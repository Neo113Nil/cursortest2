package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0011\u0010R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/InviteFriendsBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/InviteFriendsBlocker$Builder;", "Lcom/squareup/protos/franklin/api/InviteFriendsOpportunityScreen;", "invite_friends_opportunity_screen", "Lcom/squareup/protos/franklin/api/InviteFriendsOpportunityScreen;", "Lcom/squareup/protos/franklin/api/ContactAccessPreparationScreen;", "contact_access_preparation_screen", "Lcom/squareup/protos/franklin/api/ContactAccessPreparationScreen;", "Lcom/squareup/protos/franklin/api/InviteFriendsScreen;", "invite_friends_screen", "Lcom/squareup/protos/franklin/api/InviteFriendsScreen;", "", "", "recommended_contacts_hashed_alias_ids", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InviteFriendsBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InviteFriendsBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.ContactAccessPreparationScreen#ADAPTER", schemaIndex = 1, tag = 2)
    public final ContactAccessPreparationScreen contact_access_preparation_screen;

    @WireField(adapter = "com.squareup.protos.franklin.api.InviteFriendsOpportunityScreen#ADAPTER", schemaIndex = 0, tag = 1)
    public final InviteFriendsOpportunityScreen invite_friends_opportunity_screen;

    @WireField(adapter = "com.squareup.protos.franklin.api.InviteFriendsScreen#ADAPTER", schemaIndex = 2, tag = 3)
    public final InviteFriendsScreen invite_friends_screen;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, redacted = true, schemaIndex = 3, tag = 4)
    public final List<String> recommended_contacts_hashed_alias_ids;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0014\u0010\u000b\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/api/InviteFriendsBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/InviteFriendsBlocker;", "<init>", "()V", "invite_friends_opportunity_screen", "Lcom/squareup/protos/franklin/api/InviteFriendsOpportunityScreen;", "contact_access_preparation_screen", "Lcom/squareup/protos/franklin/api/ContactAccessPreparationScreen;", "invite_friends_screen", "Lcom/squareup/protos/franklin/api/InviteFriendsScreen;", "recommended_contacts_hashed_alias_ids", "", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public ContactAccessPreparationScreen contact_access_preparation_screen;
        public InviteFriendsOpportunityScreen invite_friends_opportunity_screen;
        public InviteFriendsScreen invite_friends_screen;
        public List<String> recommended_contacts_hashed_alias_ids = EmptyList.INSTANCE;

        @Override // com.squareup.wire.Message.Builder
        public InviteFriendsBlocker build() {
            return new InviteFriendsBlocker(this.invite_friends_opportunity_screen, this.contact_access_preparation_screen, this.invite_friends_screen, this.recommended_contacts_hashed_alias_ids, buildUnknownFields());
        }

        public final Builder contact_access_preparation_screen(ContactAccessPreparationScreen contact_access_preparation_screen) {
            this.contact_access_preparation_screen = contact_access_preparation_screen;
            return this;
        }

        public final Builder invite_friends_opportunity_screen(InviteFriendsOpportunityScreen invite_friends_opportunity_screen) {
            this.invite_friends_opportunity_screen = invite_friends_opportunity_screen;
            return this;
        }

        public final Builder invite_friends_screen(InviteFriendsScreen invite_friends_screen) {
            this.invite_friends_screen = invite_friends_screen;
            return this;
        }

        public final Builder recommended_contacts_hashed_alias_ids(List<String> recommended_contacts_hashed_alias_ids) {
            recommended_contacts_hashed_alias_ids.getClass();
            TransactorKt.checkElementsNotNull(recommended_contacts_hashed_alias_ids);
            this.recommended_contacts_hashed_alias_ids = recommended_contacts_hashed_alias_ids;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(InviteFriendsBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.InviteFriendsBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public InviteFriendsBlocker decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new InviteFriendsBlocker((InviteFriendsOpportunityScreen) obj, (ContactAccessPreparationScreen) obj2, (InviteFriendsScreen) obj3, m, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = TransactorKt.decodeMessageOrMerge(InviteFriendsOpportunityScreen.ADAPTER, reader, obj);
                    } else if (nextTag == 2) {
                        obj2 = TransactorKt.decodeMessageOrMerge(ContactAccessPreparationScreen.ADAPTER, reader, obj2);
                    } else if (nextTag == 3) {
                        obj3 = TransactorKt.decodeMessageOrMerge(InviteFriendsScreen.ADAPTER, reader, obj3);
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        m.add(ProtoAdapter.STRING.decode(reader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, InviteFriendsBlocker value) {
                writer.getClass();
                value.getClass();
                InviteFriendsOpportunityScreen.ADAPTER.encodeWithTag(writer, 1, value.invite_friends_opportunity_screen);
                ContactAccessPreparationScreen.ADAPTER.encodeWithTag(writer, 2, value.contact_access_preparation_screen);
                InviteFriendsScreen.ADAPTER.encodeWithTag(writer, 3, value.invite_friends_screen);
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 4, value.recommended_contacts_hashed_alias_ids);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(InviteFriendsBlocker value) {
                value.getClass();
                return ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(4, value.recommended_contacts_hashed_alias_ids) + InviteFriendsScreen.ADAPTER.encodedSizeWithTag(3, value.invite_friends_screen) + ContactAccessPreparationScreen.ADAPTER.encodedSizeWithTag(2, value.contact_access_preparation_screen) + InviteFriendsOpportunityScreen.ADAPTER.encodedSizeWithTag(1, value.invite_friends_opportunity_screen) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public InviteFriendsBlocker redact(InviteFriendsBlocker value) {
                value.getClass();
                InviteFriendsOpportunityScreen inviteFriendsOpportunityScreen = value.invite_friends_opportunity_screen;
                InviteFriendsOpportunityScreen inviteFriendsOpportunityScreen2 = inviteFriendsOpportunityScreen != null ? (InviteFriendsOpportunityScreen) InviteFriendsOpportunityScreen.ADAPTER.redact(inviteFriendsOpportunityScreen) : null;
                ContactAccessPreparationScreen contactAccessPreparationScreen = value.contact_access_preparation_screen;
                ContactAccessPreparationScreen contactAccessPreparationScreen2 = contactAccessPreparationScreen != null ? (ContactAccessPreparationScreen) ContactAccessPreparationScreen.ADAPTER.redact(contactAccessPreparationScreen) : null;
                InviteFriendsScreen inviteFriendsScreen = value.invite_friends_screen;
                InviteFriendsScreen inviteFriendsScreen2 = inviteFriendsScreen != null ? (InviteFriendsScreen) InviteFriendsScreen.ADAPTER.redact(inviteFriendsScreen) : null;
                EmptyList emptyList = EmptyList.INSTANCE;
                ByteString byteString = ByteString.EMPTY;
                emptyList.getClass();
                byteString.getClass();
                return new InviteFriendsBlocker(inviteFriendsOpportunityScreen2, contactAccessPreparationScreen2, inviteFriendsScreen2, emptyList, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, InviteFriendsBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 4, value.recommended_contacts_hashed_alias_ids);
                InviteFriendsScreen.ADAPTER.encodeWithTag(writer, 3, value.invite_friends_screen);
                ContactAccessPreparationScreen.ADAPTER.encodeWithTag(writer, 2, value.contact_access_preparation_screen);
                InviteFriendsOpportunityScreen.ADAPTER.encodeWithTag(writer, 1, value.invite_friends_opportunity_screen);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteFriendsBlocker(InviteFriendsOpportunityScreen inviteFriendsOpportunityScreen, ContactAccessPreparationScreen contactAccessPreparationScreen, InviteFriendsScreen inviteFriendsScreen, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.invite_friends_opportunity_screen = inviteFriendsOpportunityScreen;
        this.contact_access_preparation_screen = contactAccessPreparationScreen;
        this.invite_friends_screen = inviteFriendsScreen;
        this.recommended_contacts_hashed_alias_ids = TransactorKt.immutableCopyOf("recommended_contacts_hashed_alias_ids", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InviteFriendsBlocker)) {
            return false;
        }
        InviteFriendsBlocker inviteFriendsBlocker = (InviteFriendsBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), inviteFriendsBlocker.unknownFields()) && Intrinsics.areEqual(this.invite_friends_opportunity_screen, inviteFriendsBlocker.invite_friends_opportunity_screen) && Intrinsics.areEqual(this.contact_access_preparation_screen, inviteFriendsBlocker.contact_access_preparation_screen) && Intrinsics.areEqual(this.invite_friends_screen, inviteFriendsBlocker.invite_friends_screen) && Intrinsics.areEqual(this.recommended_contacts_hashed_alias_ids, inviteFriendsBlocker.recommended_contacts_hashed_alias_ids);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        InviteFriendsOpportunityScreen inviteFriendsOpportunityScreen = this.invite_friends_opportunity_screen;
        int hashCode2 = (hashCode + (inviteFriendsOpportunityScreen != null ? inviteFriendsOpportunityScreen.hashCode() : 0)) * 37;
        ContactAccessPreparationScreen contactAccessPreparationScreen = this.contact_access_preparation_screen;
        int hashCode3 = (hashCode2 + (contactAccessPreparationScreen != null ? contactAccessPreparationScreen.hashCode() : 0)) * 37;
        InviteFriendsScreen inviteFriendsScreen = this.invite_friends_screen;
        int hashCode4 = this.recommended_contacts_hashed_alias_ids.hashCode() + ((hashCode3 + (inviteFriendsScreen != null ? inviteFriendsScreen.hashCode() : 0)) * 37);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.invite_friends_opportunity_screen = this.invite_friends_opportunity_screen;
        builder.contact_access_preparation_screen = this.contact_access_preparation_screen;
        builder.invite_friends_screen = this.invite_friends_screen;
        builder.recommended_contacts_hashed_alias_ids = this.recommended_contacts_hashed_alias_ids;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        InviteFriendsOpportunityScreen inviteFriendsOpportunityScreen = this.invite_friends_opportunity_screen;
        if (inviteFriendsOpportunityScreen != null) {
            arrayList.add("invite_friends_opportunity_screen=" + inviteFriendsOpportunityScreen);
        }
        ContactAccessPreparationScreen contactAccessPreparationScreen = this.contact_access_preparation_screen;
        if (contactAccessPreparationScreen != null) {
            arrayList.add("contact_access_preparation_screen=" + contactAccessPreparationScreen);
        }
        InviteFriendsScreen inviteFriendsScreen = this.invite_friends_screen;
        if (inviteFriendsScreen != null) {
            arrayList.add("invite_friends_screen=" + inviteFriendsScreen);
        }
        if (!this.recommended_contacts_hashed_alias_ids.isEmpty()) {
            arrayList.add("recommended_contacts_hashed_alias_ids=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InviteFriendsBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/InviteFriendsBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/InviteFriendsBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/InviteFriendsBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/InviteFriendsBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ InviteFriendsBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
