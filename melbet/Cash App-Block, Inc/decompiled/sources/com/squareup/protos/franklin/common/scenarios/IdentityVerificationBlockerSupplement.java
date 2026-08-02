package com.squareup.protos.franklin.common.scenarios;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.HelpItem;
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

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000f\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/IdentityVerificationBlockerSupplement;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/scenarios/IdentityVerificationBlockerSupplement$Builder;", "", "name_main_text", "Ljava/lang/String;", "name_prefill", "name_hint_text", "ssn_main_text", "birthdate_main_text", "", "Lcom/squareup/protos/franklin/api/HelpItem;", "additional_help_items", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IdentityVerificationBlockerSupplement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<IdentityVerificationBlockerSupplement> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.HelpItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 2)
    public final List<HelpItem> additional_help_items;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 4, tag = 6)
    public final String birthdate_main_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 2, tag = 4)
    public final String name_hint_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
    public final String name_main_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 1, tag = 3)
    public final String name_prefill;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 3, tag = 5)
    public final String ssn_main_text;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u000b\u001a\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/IdentityVerificationBlockerSupplement$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/IdentityVerificationBlockerSupplement;", "<init>", "()V", "name_main_text", "", "name_prefill", "name_hint_text", "ssn_main_text", "birthdate_main_text", "additional_help_items", "", "Lcom/squareup/protos/franklin/api/HelpItem;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<HelpItem> additional_help_items = EmptyList.INSTANCE;
        public String birthdate_main_text;
        public String name_hint_text;
        public String name_main_text;
        public String name_prefill;
        public String ssn_main_text;

        public final Builder additional_help_items(List<HelpItem> additional_help_items) {
            additional_help_items.getClass();
            TransactorKt.checkElementsNotNull(additional_help_items);
            this.additional_help_items = additional_help_items;
            return this;
        }

        public final Builder birthdate_main_text(String birthdate_main_text) {
            this.birthdate_main_text = birthdate_main_text;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public IdentityVerificationBlockerSupplement build() {
            return new IdentityVerificationBlockerSupplement(this.name_main_text, this.name_prefill, this.name_hint_text, this.ssn_main_text, this.birthdate_main_text, this.additional_help_items, buildUnknownFields());
        }

        public final Builder name_hint_text(String name_hint_text) {
            this.name_hint_text = name_hint_text;
            return this;
        }

        public final Builder name_main_text(String name_main_text) {
            this.name_main_text = name_main_text;
            return this;
        }

        public final Builder name_prefill(String name_prefill) {
            this.name_prefill = name_prefill;
            return this;
        }

        public final Builder ssn_main_text(String ssn_main_text) {
            this.ssn_main_text = ssn_main_text;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(IdentityVerificationBlockerSupplement.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.scenarios.IdentityVerificationBlockerSupplement$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public IdentityVerificationBlockerSupplement decode(ProtoReader reader) {
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
                        return new IdentityVerificationBlockerSupplement((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, m, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            m.add(HelpItem.ADAPTER.decode(reader));
                            break;
                        case 3:
                            obj2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            obj3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IdentityVerificationBlockerSupplement value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.name_main_text);
                protoAdapter2.encodeWithTag(writer, 3, value.name_prefill);
                protoAdapter2.encodeWithTag(writer, 4, value.name_hint_text);
                protoAdapter2.encodeWithTag(writer, 5, value.ssn_main_text);
                protoAdapter2.encodeWithTag(writer, 6, value.birthdate_main_text);
                HelpItem.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.additional_help_items);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IdentityVerificationBlockerSupplement value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return HelpItem.ADAPTER.asRepeated().encodedSizeWithTag(2, value.additional_help_items) + protoAdapter2.encodedSizeWithTag(6, value.birthdate_main_text) + protoAdapter2.encodedSizeWithTag(5, value.ssn_main_text) + protoAdapter2.encodedSizeWithTag(4, value.name_hint_text) + protoAdapter2.encodedSizeWithTag(3, value.name_prefill) + protoAdapter2.encodedSizeWithTag(1, value.name_main_text) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IdentityVerificationBlockerSupplement redact(IdentityVerificationBlockerSupplement value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.additional_help_items, HelpItem.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                byteString.getClass();
                return new IdentityVerificationBlockerSupplement(null, null, null, null, null, m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IdentityVerificationBlockerSupplement value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                HelpItem.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.additional_help_items);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 6, value.birthdate_main_text);
                protoAdapter2.encodeWithTag(writer, 5, value.ssn_main_text);
                protoAdapter2.encodeWithTag(writer, 4, value.name_hint_text);
                protoAdapter2.encodeWithTag(writer, 3, value.name_prefill);
                protoAdapter2.encodeWithTag(writer, 1, value.name_main_text);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentityVerificationBlockerSupplement(String str, String str2, String str3, String str4, String str5, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.name_main_text = str;
        this.name_prefill = str2;
        this.name_hint_text = str3;
        this.ssn_main_text = str4;
        this.birthdate_main_text = str5;
        this.additional_help_items = TransactorKt.immutableCopyOf("additional_help_items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IdentityVerificationBlockerSupplement)) {
            return false;
        }
        IdentityVerificationBlockerSupplement identityVerificationBlockerSupplement = (IdentityVerificationBlockerSupplement) obj;
        return Intrinsics.areEqual(unknownFields(), identityVerificationBlockerSupplement.unknownFields()) && Intrinsics.areEqual(this.name_main_text, identityVerificationBlockerSupplement.name_main_text) && Intrinsics.areEqual(this.name_prefill, identityVerificationBlockerSupplement.name_prefill) && Intrinsics.areEqual(this.name_hint_text, identityVerificationBlockerSupplement.name_hint_text) && Intrinsics.areEqual(this.ssn_main_text, identityVerificationBlockerSupplement.ssn_main_text) && Intrinsics.areEqual(this.birthdate_main_text, identityVerificationBlockerSupplement.birthdate_main_text) && Intrinsics.areEqual(this.additional_help_items, identityVerificationBlockerSupplement.additional_help_items);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name_main_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.name_prefill;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.name_hint_text;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.ssn_main_text;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.birthdate_main_text;
        int hashCode6 = this.additional_help_items.hashCode() + ((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.name_main_text = this.name_main_text;
        builder.name_prefill = this.name_prefill;
        builder.name_hint_text = this.name_hint_text;
        builder.ssn_main_text = this.ssn_main_text;
        builder.birthdate_main_text = this.birthdate_main_text;
        builder.additional_help_items = this.additional_help_items;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.name_main_text != null) {
            arrayList.add("name_main_text=██");
        }
        if (this.name_prefill != null) {
            arrayList.add("name_prefill=██");
        }
        if (this.name_hint_text != null) {
            arrayList.add("name_hint_text=██");
        }
        if (this.ssn_main_text != null) {
            arrayList.add("ssn_main_text=██");
        }
        if (this.birthdate_main_text != null) {
            arrayList.add("birthdate_main_text=██");
        }
        if (!this.additional_help_items.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("additional_help_items=", arrayList, this.additional_help_items);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "IdentityVerificationBlockerSupplement{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/IdentityVerificationBlockerSupplement$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/scenarios/IdentityVerificationBlockerSupplement$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/scenarios/IdentityVerificationBlockerSupplement;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/scenarios/IdentityVerificationBlockerSupplement;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ IdentityVerificationBlockerSupplement build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
