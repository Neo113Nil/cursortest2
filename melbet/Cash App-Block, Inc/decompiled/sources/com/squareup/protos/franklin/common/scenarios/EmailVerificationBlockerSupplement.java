package com.squareup.protos.franklin.common.scenarios;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.HelpItem;
import com.squareup.protos.franklin.common.scenarios.EmailVerificationBlockerSupplement;
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

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0013\u0012\u0014R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/EmailVerificationBlockerSupplement;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/scenarios/EmailVerificationBlockerSupplement$Builder;", "", "skip_message", "Ljava/lang/String;", "main_text", "headline", "", "suppress_edit_email_address", "Ljava/lang/Boolean;", "Lcom/squareup/protos/franklin/common/scenarios/EmailVerificationBlockerSupplement$EmailVerificationBlockerStatus;", "status", "Lcom/squareup/protos/franklin/common/scenarios/EmailVerificationBlockerSupplement$EmailVerificationBlockerStatus;", "", "Lcom/squareup/protos/franklin/api/HelpItem;", "additional_help_items", "Ljava/util/List;", "Companion", "Builder", "EmailVerificationBlockerStatus", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class EmailVerificationBlockerSupplement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EmailVerificationBlockerSupplement> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.HelpItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 3)
    public final List<HelpItem> additional_help_items;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 5)
    public final String headline;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 2)
    public final String main_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
    public final String skip_message;

    @WireField(adapter = "com.squareup.protos.franklin.common.scenarios.EmailVerificationBlockerSupplement$EmailVerificationBlockerStatus#ADAPTER", schemaIndex = 5, tag = 6)
    public final EmailVerificationBlockerStatus status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 4, tag = 4)
    public final Boolean suppress_edit_email_address;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\t\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0015\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0011J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/EmailVerificationBlockerSupplement$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/EmailVerificationBlockerSupplement;", "<init>", "()V", "skip_message", "", "main_text", "headline", "additional_help_items", "", "Lcom/squareup/protos/franklin/api/HelpItem;", "suppress_edit_email_address", "", "Ljava/lang/Boolean;", "status", "Lcom/squareup/protos/franklin/common/scenarios/EmailVerificationBlockerSupplement$EmailVerificationBlockerStatus;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/common/scenarios/EmailVerificationBlockerSupplement$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<HelpItem> additional_help_items = EmptyList.INSTANCE;
        public String headline;
        public String main_text;
        public String skip_message;
        public EmailVerificationBlockerStatus status;
        public Boolean suppress_edit_email_address;

        public final Builder additional_help_items(List<HelpItem> additional_help_items) {
            additional_help_items.getClass();
            TransactorKt.checkElementsNotNull(additional_help_items);
            this.additional_help_items = additional_help_items;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public EmailVerificationBlockerSupplement build() {
            return new EmailVerificationBlockerSupplement(this.skip_message, this.main_text, this.headline, this.additional_help_items, this.suppress_edit_email_address, this.status, buildUnknownFields());
        }

        public final Builder headline(String headline) {
            this.headline = headline;
            return this;
        }

        public final Builder main_text(String main_text) {
            this.main_text = main_text;
            return this;
        }

        public final Builder skip_message(String skip_message) {
            this.skip_message = skip_message;
            return this;
        }

        public final Builder status(EmailVerificationBlockerStatus status) {
            this.status = status;
            return this;
        }

        public final Builder suppress_edit_email_address(Boolean suppress_edit_email_address) {
            this.suppress_edit_email_address = suppress_edit_email_address;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(EmailVerificationBlockerSupplement.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.scenarios.EmailVerificationBlockerSupplement$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public EmailVerificationBlockerSupplement decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new EmailVerificationBlockerSupplement((String) obj, (String) obj2, (String) obj3, m, (Boolean) obj4, (EmailVerificationBlockerSupplement.EmailVerificationBlockerStatus) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            m.add(HelpItem.ADAPTER.decode(reader));
                            break;
                        case 4:
                            obj4 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 5:
                            obj3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            try {
                                obj5 = EmailVerificationBlockerSupplement.EmailVerificationBlockerStatus.ADAPTER.decode(reader);
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
            public void encode(ProtoWriter writer, EmailVerificationBlockerSupplement value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.skip_message);
                protoAdapter2.encodeWithTag(writer, 2, value.main_text);
                protoAdapter2.encodeWithTag(writer, 5, value.headline);
                HelpItem.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.additional_help_items);
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, value.suppress_edit_email_address);
                EmailVerificationBlockerSupplement.EmailVerificationBlockerStatus.ADAPTER.encodeWithTag(writer, 6, value.status);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EmailVerificationBlockerSupplement value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return EmailVerificationBlockerSupplement.EmailVerificationBlockerStatus.ADAPTER.encodedSizeWithTag(6, value.status) + ProtoAdapter.BOOL.encodedSizeWithTag(4, value.suppress_edit_email_address) + HelpItem.ADAPTER.asRepeated().encodedSizeWithTag(3, value.additional_help_items) + protoAdapter2.encodedSizeWithTag(5, value.headline) + protoAdapter2.encodedSizeWithTag(2, value.main_text) + protoAdapter2.encodedSizeWithTag(1, value.skip_message) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EmailVerificationBlockerSupplement redact(EmailVerificationBlockerSupplement value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.additional_help_items, HelpItem.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = value.headline;
                Boolean bool = value.suppress_edit_email_address;
                EmailVerificationBlockerSupplement.EmailVerificationBlockerStatus emailVerificationBlockerStatus = value.status;
                byteString.getClass();
                return new EmailVerificationBlockerSupplement(null, null, str, m1169redactElements, bool, emailVerificationBlockerStatus, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EmailVerificationBlockerSupplement value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                EmailVerificationBlockerSupplement.EmailVerificationBlockerStatus.ADAPTER.encodeWithTag(writer, 6, value.status);
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, value.suppress_edit_email_address);
                HelpItem.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.additional_help_items);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 5, value.headline);
                protoAdapter2.encodeWithTag(writer, 2, value.main_text);
                protoAdapter2.encodeWithTag(writer, 1, value.skip_message);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailVerificationBlockerSupplement(String str, String str2, String str3, List list, Boolean bool, EmailVerificationBlockerStatus emailVerificationBlockerStatus, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.skip_message = str;
        this.main_text = str2;
        this.headline = str3;
        this.suppress_edit_email_address = bool;
        this.status = emailVerificationBlockerStatus;
        this.additional_help_items = TransactorKt.immutableCopyOf("additional_help_items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EmailVerificationBlockerSupplement)) {
            return false;
        }
        EmailVerificationBlockerSupplement emailVerificationBlockerSupplement = (EmailVerificationBlockerSupplement) obj;
        return Intrinsics.areEqual(unknownFields(), emailVerificationBlockerSupplement.unknownFields()) && Intrinsics.areEqual(this.skip_message, emailVerificationBlockerSupplement.skip_message) && Intrinsics.areEqual(this.main_text, emailVerificationBlockerSupplement.main_text) && Intrinsics.areEqual(this.headline, emailVerificationBlockerSupplement.headline) && Intrinsics.areEqual(this.additional_help_items, emailVerificationBlockerSupplement.additional_help_items) && Intrinsics.areEqual(this.suppress_edit_email_address, emailVerificationBlockerSupplement.suppress_edit_email_address) && this.status == emailVerificationBlockerSupplement.status;
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
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.headline;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.additional_help_items);
        Boolean bool = this.suppress_edit_email_address;
        int hashCode4 = (m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        EmailVerificationBlockerStatus emailVerificationBlockerStatus = this.status;
        int hashCode5 = hashCode4 + (emailVerificationBlockerStatus != null ? emailVerificationBlockerStatus.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.skip_message = this.skip_message;
        builder.main_text = this.main_text;
        builder.headline = this.headline;
        builder.additional_help_items = this.additional_help_items;
        builder.suppress_edit_email_address = this.suppress_edit_email_address;
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
        String str = this.headline;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "headline=", arrayList);
        }
        if (!this.additional_help_items.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("additional_help_items=", arrayList, this.additional_help_items);
        }
        Boolean bool = this.suppress_edit_email_address;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("suppress_edit_email_address=", bool, arrayList);
        }
        EmailVerificationBlockerStatus emailVerificationBlockerStatus = this.status;
        if (emailVerificationBlockerStatus != null) {
            arrayList.add("status=" + emailVerificationBlockerStatus);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EmailVerificationBlockerSupplement{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/EmailVerificationBlockerSupplement$EmailVerificationBlockerStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "INVALID", "SUCCESS", "INVALID_EMAIL_ADDRESS", "EXPIRED_VERIFICATION_CODE", "TOO_MANY_FAILED_ATTEMPTS", "SUCCESS_WITH_VERIFICATION_DATA", "NOT_ELIGIBLE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class EmailVerificationBlockerStatus implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EmailVerificationBlockerStatus[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EmailVerificationBlockerStatus EXPIRED_VERIFICATION_CODE;
        public static final EmailVerificationBlockerStatus INVALID;
        public static final EmailVerificationBlockerStatus INVALID_EMAIL_ADDRESS;
        public static final EmailVerificationBlockerStatus NOT_ELIGIBLE;
        public static final EmailVerificationBlockerStatus SUCCESS;
        public static final EmailVerificationBlockerStatus SUCCESS_WITH_VERIFICATION_DATA;
        public static final EmailVerificationBlockerStatus TOO_MANY_FAILED_ATTEMPTS;
        private final int value;

        private static final /* synthetic */ EmailVerificationBlockerStatus[] $values() {
            return new EmailVerificationBlockerStatus[]{INVALID, SUCCESS, INVALID_EMAIL_ADDRESS, EXPIRED_VERIFICATION_CODE, TOO_MANY_FAILED_ATTEMPTS, SUCCESS_WITH_VERIFICATION_DATA, NOT_ELIGIBLE};
        }

        static {
            final EmailVerificationBlockerStatus emailVerificationBlockerStatus = new EmailVerificationBlockerStatus("INVALID", 0, 0);
            INVALID = emailVerificationBlockerStatus;
            SUCCESS = new EmailVerificationBlockerStatus("SUCCESS", 1, 1);
            INVALID_EMAIL_ADDRESS = new EmailVerificationBlockerStatus("INVALID_EMAIL_ADDRESS", 2, 2);
            EXPIRED_VERIFICATION_CODE = new EmailVerificationBlockerStatus("EXPIRED_VERIFICATION_CODE", 3, 3);
            TOO_MANY_FAILED_ATTEMPTS = new EmailVerificationBlockerStatus("TOO_MANY_FAILED_ATTEMPTS", 4, 4);
            SUCCESS_WITH_VERIFICATION_DATA = new EmailVerificationBlockerStatus("SUCCESS_WITH_VERIFICATION_DATA", 5, 5);
            NOT_ELIGIBLE = new EmailVerificationBlockerStatus("NOT_ELIGIBLE", 6, 6);
            EmailVerificationBlockerStatus[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(EmailVerificationBlockerStatus.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, emailVerificationBlockerStatus) { // from class: com.squareup.protos.franklin.common.scenarios.EmailVerificationBlockerSupplement$EmailVerificationBlockerStatus$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public EmailVerificationBlockerSupplement.EmailVerificationBlockerStatus fromValue(int value) {
                    return EmailVerificationBlockerSupplement.EmailVerificationBlockerStatus.INSTANCE.fromValue(value);
                }
            };
        }

        private EmailVerificationBlockerStatus(String str, int i, int i2) {
            this.value = i2;
        }

        public static final EmailVerificationBlockerStatus fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static EmailVerificationBlockerStatus valueOf(String str) {
            return (EmailVerificationBlockerStatus) Enum.valueOf(EmailVerificationBlockerStatus.class, str);
        }

        public static EmailVerificationBlockerStatus[] values() {
            return (EmailVerificationBlockerStatus[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/EmailVerificationBlockerSupplement$EmailVerificationBlockerStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/common/scenarios/EmailVerificationBlockerSupplement$EmailVerificationBlockerStatus;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EmailVerificationBlockerStatus fromValue(int value) {
                switch (value) {
                    case 0:
                        return EmailVerificationBlockerStatus.INVALID;
                    case 1:
                        return EmailVerificationBlockerStatus.SUCCESS;
                    case 2:
                        return EmailVerificationBlockerStatus.INVALID_EMAIL_ADDRESS;
                    case 3:
                        return EmailVerificationBlockerStatus.EXPIRED_VERIFICATION_CODE;
                    case 4:
                        return EmailVerificationBlockerStatus.TOO_MANY_FAILED_ATTEMPTS;
                    case 5:
                        return EmailVerificationBlockerStatus.SUCCESS_WITH_VERIFICATION_DATA;
                    case 6:
                        return EmailVerificationBlockerStatus.NOT_ELIGIBLE;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/EmailVerificationBlockerSupplement$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/scenarios/EmailVerificationBlockerSupplement$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/scenarios/EmailVerificationBlockerSupplement;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/scenarios/EmailVerificationBlockerSupplement;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ EmailVerificationBlockerSupplement build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
