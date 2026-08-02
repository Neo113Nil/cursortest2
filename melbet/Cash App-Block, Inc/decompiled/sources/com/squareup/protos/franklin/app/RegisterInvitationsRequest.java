package com.squareup.protos.franklin.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.TransactionType;
import com.squareup.protos.franklin.app.RegisterInvitationsRequest;
import com.squareup.protos.franklin.common.scenarios.InvitationConfig;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class RegisterInvitationsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RegisterInvitationsRequest> CREATOR;
    public final List enhanced_aliases;
    public final List hashed_email_addresses;
    public final List hashed_sms_numbers;
    public final Boolean invitation_message_modified;
    public final InvitationConfig.InvitationTreatment invitation_treatment;

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public List enhanced_aliases;
        public List hashed_email_addresses;
        public List hashed_sms_numbers;
        public Boolean invitation_message_modified;
        public InvitationConfig.InvitationTreatment invitation_treatment;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.hashed_sms_numbers = emptyList;
            this.hashed_email_addresses = emptyList;
            this.enhanced_aliases = emptyList;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            return new RegisterInvitationsRequest(this.hashed_sms_numbers, this.invitation_treatment, this.hashed_email_addresses, this.invitation_message_modified, this.enhanced_aliases, buildUnknownFields());
        }
    }

    /* loaded from: classes8.dex */
    public final class EnhancedAlias extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<EnhancedAlias> CREATOR;
        public final String hashed_alias;
        public final InvitationConfig.InvitationTreatment invitation_treatment;

        /* renamed from: type, reason: collision with root package name */
        public final Type f1365type;
        public final String unhashed_alias;

        public final class Builder extends Message.Builder {
            public String hashed_alias;
            public InvitationConfig.InvitationTreatment invitation_treatment;

            /* renamed from: type, reason: collision with root package name */
            public Type f1366type;
            public String unhashed_alias;

            @Override // com.squareup.wire.Message.Builder
            public final Message build() {
                return new EnhancedAlias(this.f1366type, this.hashed_alias, this.unhashed_alias, this.invitation_treatment, buildUnknownFields());
            }
        }

        public enum Type implements WireEnum {
            SMS(1),
            EMAIL(2);

            public final int value;
            public static final TransactionType.Companion Companion = new TransactionType.Companion();
            public static final RegisterInvitationsRequest$EnhancedAlias$Type$Companion$ADAPTER$1 ADAPTER = new RegisterInvitationsRequest$EnhancedAlias$Type$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Type.class), Syntax.PROTO_2, null);

            Type(int i) {
                this.value = i;
            }

            public static final Type fromValue(int i) {
                Companion.getClass();
                if (i == 1) {
                    return SMS;
                }
                if (i != 2) {
                    return null;
                }
                return EMAIL;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            RegisterInvitationsRequest$EnhancedAlias$Companion$ADAPTER$1 registerInvitationsRequest$EnhancedAlias$Companion$ADAPTER$1 = new RegisterInvitationsRequest$EnhancedAlias$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EnhancedAlias.class), "type.googleapis.com/squareup.franklin.app.RegisterInvitationsRequest.EnhancedAlias", Syntax.PROTO_2, null, "squareup/franklin/app/invitations.proto");
            ADAPTER = registerInvitationsRequest$EnhancedAlias$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(registerInvitationsRequest$EnhancedAlias$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnhancedAlias(Type type2, String str, String str2, InvitationConfig.InvitationTreatment invitationTreatment, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.f1365type = type2;
            this.hashed_alias = str;
            this.unhashed_alias = str2;
            this.invitation_treatment = invitationTreatment;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EnhancedAlias)) {
                return false;
            }
            EnhancedAlias enhancedAlias = (EnhancedAlias) obj;
            return Intrinsics.areEqual(unknownFields(), enhancedAlias.unknownFields()) && this.f1365type == enhancedAlias.f1365type && Intrinsics.areEqual(this.hashed_alias, enhancedAlias.hashed_alias) && Intrinsics.areEqual(this.unhashed_alias, enhancedAlias.unhashed_alias) && this.invitation_treatment == enhancedAlias.invitation_treatment;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Type type2 = this.f1365type;
            int hashCode2 = (hashCode + (type2 != null ? type2.hashCode() : 0)) * 37;
            String str = this.hashed_alias;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.unhashed_alias;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
            InvitationConfig.InvitationTreatment invitationTreatment = this.invitation_treatment;
            int hashCode5 = hashCode4 + (invitationTreatment != null ? invitationTreatment.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.f1366type = this.f1365type;
            builder.hashed_alias = this.hashed_alias;
            builder.unhashed_alias = this.unhashed_alias;
            builder.invitation_treatment = this.invitation_treatment;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Type type2 = this.f1365type;
            if (type2 != null) {
                arrayList.add("type=" + type2);
            }
            if (this.hashed_alias != null) {
                arrayList.add("hashed_alias=██");
            }
            if (this.unhashed_alias != null) {
                arrayList.add("unhashed_alias=██");
            }
            InvitationConfig.InvitationTreatment invitationTreatment = this.invitation_treatment;
            if (invitationTreatment != null) {
                arrayList.add("invitation_treatment=" + invitationTreatment);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "EnhancedAlias{", "}", 0, null, null, 56);
        }
    }

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(RegisterInvitationsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.franklin.app.RegisterInvitationsRequest$Companion$ADAPTER$1
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
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new RegisterInvitationsRequest(m, (InvitationConfig.InvitationTreatment) obj, arrayList, (Boolean) obj2, arrayList2, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 3) {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag == 4) {
                        try {
                            obj = InvitationConfig.InvitationTreatment.ADAPTER.decode(protoReader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            protoReader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 5) {
                        arrayList.add(ProtoAdapter.STRING.decode(protoReader));
                    } else if (nextTag == 6) {
                        obj2 = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 7) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        arrayList2.add(RegisterInvitationsRequest.EnhancedAlias.ADAPTER.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                RegisterInvitationsRequest registerInvitationsRequest = (RegisterInvitationsRequest) obj;
                reverseProtoWriter.getClass();
                registerInvitationsRequest.getClass();
                reverseProtoWriter.writeBytes(registerInvitationsRequest.unknownFields());
                RegisterInvitationsRequest.EnhancedAlias.ADAPTER.asRepeated().encodeWithTag(reverseProtoWriter, 7, registerInvitationsRequest.enhanced_aliases);
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 6, registerInvitationsRequest.invitation_message_modified);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 5, registerInvitationsRequest.hashed_email_addresses);
                InvitationConfig.InvitationTreatment.ADAPTER.encodeWithTag(reverseProtoWriter, 4, registerInvitationsRequest.invitation_treatment);
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 3, registerInvitationsRequest.hashed_sms_numbers);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                RegisterInvitationsRequest registerInvitationsRequest = (RegisterInvitationsRequest) obj;
                registerInvitationsRequest.getClass();
                int size$okio = registerInvitationsRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return RegisterInvitationsRequest.EnhancedAlias.ADAPTER.asRepeated().encodedSizeWithTag(7, registerInvitationsRequest.enhanced_aliases) + ProtoAdapter.BOOL.encodedSizeWithTag(6, registerInvitationsRequest.invitation_message_modified) + protoAdapter2.asRepeated().encodedSizeWithTag(5, registerInvitationsRequest.hashed_email_addresses) + InvitationConfig.InvitationTreatment.ADAPTER.encodedSizeWithTag(4, registerInvitationsRequest.invitation_treatment) + protoAdapter2.asRepeated().encodedSizeWithTag(3, registerInvitationsRequest.hashed_sms_numbers) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                RegisterInvitationsRequest registerInvitationsRequest = (RegisterInvitationsRequest) obj;
                registerInvitationsRequest.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(registerInvitationsRequest.enhanced_aliases, RegisterInvitationsRequest.EnhancedAlias.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                List list = registerInvitationsRequest.hashed_sms_numbers;
                InvitationConfig.InvitationTreatment invitationTreatment = registerInvitationsRequest.invitation_treatment;
                List list2 = registerInvitationsRequest.hashed_email_addresses;
                Boolean bool = registerInvitationsRequest.invitation_message_modified;
                list.getClass();
                list2.getClass();
                byteString.getClass();
                return new RegisterInvitationsRequest(list, invitationTreatment, list2, bool, m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                RegisterInvitationsRequest registerInvitationsRequest = (RegisterInvitationsRequest) obj;
                registerInvitationsRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 3, registerInvitationsRequest.hashed_sms_numbers);
                InvitationConfig.InvitationTreatment.ADAPTER.encodeWithTag(protoWriter, 4, registerInvitationsRequest.invitation_treatment);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 5, registerInvitationsRequest.hashed_email_addresses);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, registerInvitationsRequest.invitation_message_modified);
                RegisterInvitationsRequest.EnhancedAlias.ADAPTER.asRepeated().encodeWithTag(protoWriter, 7, registerInvitationsRequest.enhanced_aliases);
                protoWriter.writeBytes(registerInvitationsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterInvitationsRequest(List list, InvitationConfig.InvitationTreatment invitationTreatment, List list2, Boolean bool, List list3, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.invitation_treatment = invitationTreatment;
        this.invitation_message_modified = bool;
        this.hashed_sms_numbers = TransactorKt.immutableCopyOf("hashed_sms_numbers", list);
        this.hashed_email_addresses = TransactorKt.immutableCopyOf("hashed_email_addresses", list2);
        this.enhanced_aliases = TransactorKt.immutableCopyOf("enhanced_aliases", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RegisterInvitationsRequest)) {
            return false;
        }
        RegisterInvitationsRequest registerInvitationsRequest = (RegisterInvitationsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), registerInvitationsRequest.unknownFields()) && Intrinsics.areEqual(this.hashed_sms_numbers, registerInvitationsRequest.hashed_sms_numbers) && this.invitation_treatment == registerInvitationsRequest.invitation_treatment && Intrinsics.areEqual(this.hashed_email_addresses, registerInvitationsRequest.hashed_email_addresses) && Intrinsics.areEqual(this.invitation_message_modified, registerInvitationsRequest.invitation_message_modified) && Intrinsics.areEqual(this.enhanced_aliases, registerInvitationsRequest.enhanced_aliases);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.hashed_sms_numbers);
        InvitationConfig.InvitationTreatment invitationTreatment = this.invitation_treatment;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((m + (invitationTreatment != null ? invitationTreatment.hashCode() : 0)) * 37, 37, this.hashed_email_addresses);
        Boolean bool = this.invitation_message_modified;
        int hashCode = this.enhanced_aliases.hashCode() + ((m2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.hashed_sms_numbers = this.hashed_sms_numbers;
        builder.invitation_treatment = this.invitation_treatment;
        builder.hashed_email_addresses = this.hashed_email_addresses;
        builder.invitation_message_modified = this.invitation_message_modified;
        builder.enhanced_aliases = this.enhanced_aliases;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.hashed_sms_numbers;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("hashed_sms_numbers=", arrayList, list);
        }
        InvitationConfig.InvitationTreatment invitationTreatment = this.invitation_treatment;
        if (invitationTreatment != null) {
            arrayList.add("invitation_treatment=" + invitationTreatment);
        }
        List list2 = this.hashed_email_addresses;
        if (!list2.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("hashed_email_addresses=", arrayList, list2);
        }
        Boolean bool = this.invitation_message_modified;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("invitation_message_modified=", bool, arrayList);
        }
        List list3 = this.enhanced_aliases;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("enhanced_aliases=", arrayList, list3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RegisterInvitationsRequest{", "}", 0, null, null, 56);
    }
}
