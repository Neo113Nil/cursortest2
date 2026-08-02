package com.squareup.protos.franklin.common.scenarios;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.HelpItem;
import com.squareup.protos.franklin.common.scenarios.PhoneVerificationBlockerSupplement;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0012\u0011\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/PhoneVerificationBlockerSupplement;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/scenarios/PhoneVerificationBlockerSupplement$Builder;", "", "skip_message", "Ljava/lang/String;", "main_text", "", "suppress_edit_phone_number", "Ljava/lang/Boolean;", "Lcom/squareup/protos/franklin/common/scenarios/PhoneVerificationBlockerSupplement$PhoneVerificationBlockerStatus;", "status", "Lcom/squareup/protos/franklin/common/scenarios/PhoneVerificationBlockerSupplement$PhoneVerificationBlockerStatus;", "", "Lcom/squareup/protos/franklin/api/HelpItem;", "additional_help_items", "Ljava/util/List;", "Companion", "Builder", "PhoneVerificationBlockerStatus", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PhoneVerificationBlockerSupplement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PhoneVerificationBlockerSupplement> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.HelpItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<HelpItem> additional_help_items;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
    public final String main_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
    public final String skip_message;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.PhoneVerificationBlockerSupplement$PhoneVerificationBlockerStatus#ADAPTER", schemaIndex = 4, tag = 5)
    public final PhoneVerificationBlockerStatus status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 3, tag = 4)
    public final Boolean suppress_edit_phone_number;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0010J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/PhoneVerificationBlockerSupplement$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/PhoneVerificationBlockerSupplement;", "<init>", "()V", "skip_message", "", "main_text", "additional_help_items", "", "Lcom/squareup/protos/franklin/api/HelpItem;", "suppress_edit_phone_number", "", "Ljava/lang/Boolean;", "status", "Lcom/squareup/protos/franklin/common/scenarios/PhoneVerificationBlockerSupplement$PhoneVerificationBlockerStatus;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/common/scenarios/PhoneVerificationBlockerSupplement$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<HelpItem> additional_help_items = EmptyList.INSTANCE;
        public String main_text;
        public String skip_message;
        public PhoneVerificationBlockerStatus status;
        public Boolean suppress_edit_phone_number;

        public final Builder additional_help_items(List<HelpItem> additional_help_items) {
            additional_help_items.getClass();
            TransactorKt.checkElementsNotNull(additional_help_items);
            this.additional_help_items = additional_help_items;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public PhoneVerificationBlockerSupplement build() {
            return new PhoneVerificationBlockerSupplement(this.skip_message, this.main_text, this.additional_help_items, this.suppress_edit_phone_number, this.status, buildUnknownFields());
        }

        public final Builder main_text(String main_text) {
            this.main_text = main_text;
            return this;
        }

        public final Builder skip_message(String skip_message) {
            this.skip_message = skip_message;
            return this;
        }

        public final Builder status(PhoneVerificationBlockerStatus status) {
            this.status = status;
            return this;
        }

        public final Builder suppress_edit_phone_number(Boolean suppress_edit_phone_number) {
            this.suppress_edit_phone_number = suppress_edit_phone_number;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PhoneVerificationBlockerSupplement.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.scenarios.PhoneVerificationBlockerSupplement$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public PhoneVerificationBlockerSupplement decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new PhoneVerificationBlockerSupplement((String) obj, (String) obj2, m, (Boolean) obj3, (PhoneVerificationBlockerSupplement.PhoneVerificationBlockerStatus) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 3) {
                        m.add(HelpItem.ADAPTER.decode(reader));
                    } else if (nextTag == 4) {
                        obj3 = ProtoAdapter.BOOL.decode(reader);
                    } else if (nextTag != 5) {
                        reader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj4 = PhoneVerificationBlockerSupplement.PhoneVerificationBlockerStatus.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PhoneVerificationBlockerSupplement value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.skip_message);
                protoAdapter2.encodeWithTag(writer, 2, value.main_text);
                HelpItem.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.additional_help_items);
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, value.suppress_edit_phone_number);
                PhoneVerificationBlockerSupplement.PhoneVerificationBlockerStatus.ADAPTER.encodeWithTag(writer, 5, value.status);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PhoneVerificationBlockerSupplement value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return PhoneVerificationBlockerSupplement.PhoneVerificationBlockerStatus.ADAPTER.encodedSizeWithTag(5, value.status) + ProtoAdapter.BOOL.encodedSizeWithTag(4, value.suppress_edit_phone_number) + HelpItem.ADAPTER.asRepeated().encodedSizeWithTag(3, value.additional_help_items) + protoAdapter2.encodedSizeWithTag(2, value.main_text) + protoAdapter2.encodedSizeWithTag(1, value.skip_message) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PhoneVerificationBlockerSupplement redact(PhoneVerificationBlockerSupplement value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.additional_help_items, HelpItem.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                Boolean bool = value.suppress_edit_phone_number;
                PhoneVerificationBlockerSupplement.PhoneVerificationBlockerStatus phoneVerificationBlockerStatus = value.status;
                byteString.getClass();
                return new PhoneVerificationBlockerSupplement(null, null, m1169redactElements, bool, phoneVerificationBlockerStatus, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PhoneVerificationBlockerSupplement value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                PhoneVerificationBlockerSupplement.PhoneVerificationBlockerStatus.ADAPTER.encodeWithTag(writer, 5, value.status);
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, value.suppress_edit_phone_number);
                HelpItem.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.additional_help_items);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 2, value.main_text);
                protoAdapter2.encodeWithTag(writer, 1, value.skip_message);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneVerificationBlockerSupplement(String str, String str2, List list, Boolean bool, PhoneVerificationBlockerStatus phoneVerificationBlockerStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.skip_message = str;
        this.main_text = str2;
        this.suppress_edit_phone_number = bool;
        this.status = phoneVerificationBlockerStatus;
        this.additional_help_items = TransactorKt.immutableCopyOf("additional_help_items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PhoneVerificationBlockerSupplement)) {
            return false;
        }
        PhoneVerificationBlockerSupplement phoneVerificationBlockerSupplement = (PhoneVerificationBlockerSupplement) obj;
        return Intrinsics.areEqual(unknownFields(), phoneVerificationBlockerSupplement.unknownFields()) && Intrinsics.areEqual(this.skip_message, phoneVerificationBlockerSupplement.skip_message) && Intrinsics.areEqual(this.main_text, phoneVerificationBlockerSupplement.main_text) && Intrinsics.areEqual(this.additional_help_items, phoneVerificationBlockerSupplement.additional_help_items) && Intrinsics.areEqual(this.suppress_edit_phone_number, phoneVerificationBlockerSupplement.suppress_edit_phone_number) && this.status == phoneVerificationBlockerSupplement.status;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.skip_message;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.main_text;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.additional_help_items);
        Boolean bool = this.suppress_edit_phone_number;
        int hashCode3 = (m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        PhoneVerificationBlockerStatus phoneVerificationBlockerStatus = this.status;
        int hashCode4 = hashCode3 + (phoneVerificationBlockerStatus != null ? phoneVerificationBlockerStatus.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.skip_message = this.skip_message;
        builder.main_text = this.main_text;
        builder.additional_help_items = this.additional_help_items;
        builder.suppress_edit_phone_number = this.suppress_edit_phone_number;
        builder.status = this.status;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.skip_message != null) {
            arrayList.add("skip_message=██");
        }
        if (this.main_text != null) {
            arrayList.add("main_text=██");
        }
        if (!this.additional_help_items.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("additional_help_items=", arrayList, this.additional_help_items);
        }
        Boolean bool = this.suppress_edit_phone_number;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("suppress_edit_phone_number=", bool, arrayList);
        }
        PhoneVerificationBlockerStatus phoneVerificationBlockerStatus = this.status;
        if (phoneVerificationBlockerStatus != null) {
            arrayList.add("status=" + phoneVerificationBlockerStatus);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PhoneVerificationBlockerSupplement{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u00142\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/PhoneVerificationBlockerSupplement$PhoneVerificationBlockerStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PVBS_DO_NOT_USE", "SUCCESS", "INVALID", "INVALID_SMS_NUMBER", "TOO_MANY_REQUESTS", "DUPLICATE_SMS_NUMBER", "CUSTOMER_DOES_NOT_EXIST", "INVALID_VERIFICATION_CODE", "EXPIRED_VERIFICATION_CODE", "TOO_MANY_FAILED_ATTEMPTS", "NOT_ELIGIBLE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PhoneVerificationBlockerStatus implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PhoneVerificationBlockerStatus[] $VALUES;
        public static final ProtoAdapter ADAPTER;
        public static final PhoneVerificationBlockerStatus CUSTOMER_DOES_NOT_EXIST;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final PhoneVerificationBlockerStatus DUPLICATE_SMS_NUMBER;
        public static final PhoneVerificationBlockerStatus EXPIRED_VERIFICATION_CODE;
        public static final PhoneVerificationBlockerStatus INVALID;
        public static final PhoneVerificationBlockerStatus INVALID_SMS_NUMBER;
        public static final PhoneVerificationBlockerStatus INVALID_VERIFICATION_CODE;
        public static final PhoneVerificationBlockerStatus NOT_ELIGIBLE;
        public static final PhoneVerificationBlockerStatus PVBS_DO_NOT_USE;
        public static final PhoneVerificationBlockerStatus SUCCESS;
        public static final PhoneVerificationBlockerStatus TOO_MANY_FAILED_ATTEMPTS;
        public static final PhoneVerificationBlockerStatus TOO_MANY_REQUESTS;
        private final int value;

        private static final /* synthetic */ PhoneVerificationBlockerStatus[] $values() {
            return new PhoneVerificationBlockerStatus[]{PVBS_DO_NOT_USE, SUCCESS, INVALID, INVALID_SMS_NUMBER, TOO_MANY_REQUESTS, DUPLICATE_SMS_NUMBER, CUSTOMER_DOES_NOT_EXIST, INVALID_VERIFICATION_CODE, EXPIRED_VERIFICATION_CODE, TOO_MANY_FAILED_ATTEMPTS, NOT_ELIGIBLE};
        }

        static {
            final PhoneVerificationBlockerStatus phoneVerificationBlockerStatus = new PhoneVerificationBlockerStatus("PVBS_DO_NOT_USE", 0, 0);
            PVBS_DO_NOT_USE = phoneVerificationBlockerStatus;
            SUCCESS = new PhoneVerificationBlockerStatus("SUCCESS", 1, 1);
            INVALID = new PhoneVerificationBlockerStatus("INVALID", 2, 2);
            INVALID_SMS_NUMBER = new PhoneVerificationBlockerStatus("INVALID_SMS_NUMBER", 3, 3);
            TOO_MANY_REQUESTS = new PhoneVerificationBlockerStatus("TOO_MANY_REQUESTS", 4, 4);
            DUPLICATE_SMS_NUMBER = new PhoneVerificationBlockerStatus("DUPLICATE_SMS_NUMBER", 5, 5);
            CUSTOMER_DOES_NOT_EXIST = new PhoneVerificationBlockerStatus("CUSTOMER_DOES_NOT_EXIST", 6, 6);
            INVALID_VERIFICATION_CODE = new PhoneVerificationBlockerStatus("INVALID_VERIFICATION_CODE", 7, 7);
            EXPIRED_VERIFICATION_CODE = new PhoneVerificationBlockerStatus("EXPIRED_VERIFICATION_CODE", 8, 8);
            TOO_MANY_FAILED_ATTEMPTS = new PhoneVerificationBlockerStatus("TOO_MANY_FAILED_ATTEMPTS", 9, 9);
            NOT_ELIGIBLE = new PhoneVerificationBlockerStatus("NOT_ELIGIBLE", 10, 10);
            PhoneVerificationBlockerStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PhoneVerificationBlockerStatus.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, phoneVerificationBlockerStatus) { // from class: com.squareup.protos.franklin.common.scenarios.PhoneVerificationBlockerSupplement$PhoneVerificationBlockerStatus$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public PhoneVerificationBlockerSupplement.PhoneVerificationBlockerStatus fromValue(int value) {
                    return PhoneVerificationBlockerSupplement.PhoneVerificationBlockerStatus.INSTANCE.fromValue(value);
                }
            };
        }

        private PhoneVerificationBlockerStatus(String str, int i, int i2) {
            this.value = i2;
        }

        public static final PhoneVerificationBlockerStatus fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static PhoneVerificationBlockerStatus valueOf(String str) {
            return (PhoneVerificationBlockerStatus) Enum.valueOf(PhoneVerificationBlockerStatus.class, str);
        }

        public static PhoneVerificationBlockerStatus[] values() {
            return (PhoneVerificationBlockerStatus[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/PhoneVerificationBlockerSupplement$PhoneVerificationBlockerStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/common/scenarios/PhoneVerificationBlockerSupplement$PhoneVerificationBlockerStatus;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final PhoneVerificationBlockerStatus fromValue(int value) {
                switch (value) {
                    case 0:
                        return PhoneVerificationBlockerStatus.PVBS_DO_NOT_USE;
                    case 1:
                        return PhoneVerificationBlockerStatus.SUCCESS;
                    case 2:
                        return PhoneVerificationBlockerStatus.INVALID;
                    case 3:
                        return PhoneVerificationBlockerStatus.INVALID_SMS_NUMBER;
                    case 4:
                        return PhoneVerificationBlockerStatus.TOO_MANY_REQUESTS;
                    case 5:
                        return PhoneVerificationBlockerStatus.DUPLICATE_SMS_NUMBER;
                    case 6:
                        return PhoneVerificationBlockerStatus.CUSTOMER_DOES_NOT_EXIST;
                    case 7:
                        return PhoneVerificationBlockerStatus.INVALID_VERIFICATION_CODE;
                    case 8:
                        return PhoneVerificationBlockerStatus.EXPIRED_VERIFICATION_CODE;
                    case 9:
                        return PhoneVerificationBlockerStatus.TOO_MANY_FAILED_ATTEMPTS;
                    case 10:
                        return PhoneVerificationBlockerStatus.NOT_ELIGIBLE;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/PhoneVerificationBlockerSupplement$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/scenarios/PhoneVerificationBlockerSupplement$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/scenarios/PhoneVerificationBlockerSupplement;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/scenarios/PhoneVerificationBlockerSupplement;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PhoneVerificationBlockerSupplement build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
