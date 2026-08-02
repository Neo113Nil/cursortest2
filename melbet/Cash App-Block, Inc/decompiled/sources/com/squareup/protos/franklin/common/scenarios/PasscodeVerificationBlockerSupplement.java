package com.squareup.protos.franklin.common.scenarios;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import kotlin.Deprecated;
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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0012R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\b\u0012\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/PasscodeVerificationBlockerSupplement;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/scenarios/PasscodeVerificationBlockerSupplement$Builder;", "", "main_text", "Ljava/lang/String;", "", "suppress_forgot_passcode_button", "Ljava/lang/Boolean;", "sub_text", "suppress_help_item", "getSuppress_help_item$annotations", "()V", "show_biometrics_enrollment_if_eligible", "", "Lcom/squareup/protos/franklin/api/HelpItem;", "additional_help_items", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PasscodeVerificationBlockerSupplement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PasscodeVerificationBlockerSupplement> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.HelpItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<HelpItem> additional_help_items;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
    public final String main_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 5, tag = 6)
    public final Boolean show_biometrics_enrollment_if_eligible;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String sub_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
    public final Boolean suppress_forgot_passcode_button;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 4, tag = 5)
    public final Boolean suppress_help_item;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0010J\u0014\u0010\n\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0002\u0010\u0010J\u0015\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/PasscodeVerificationBlockerSupplement$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/PasscodeVerificationBlockerSupplement;", "<init>", "()V", "main_text", "", "suppress_forgot_passcode_button", "", "Ljava/lang/Boolean;", "additional_help_items", "", "Lcom/squareup/protos/franklin/api/HelpItem;", "sub_text", "suppress_help_item", "show_biometrics_enrollment_if_eligible", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/common/scenarios/PasscodeVerificationBlockerSupplement$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<HelpItem> additional_help_items = EmptyList.INSTANCE;
        public String main_text;
        public Boolean show_biometrics_enrollment_if_eligible;
        public String sub_text;
        public Boolean suppress_forgot_passcode_button;
        public Boolean suppress_help_item;

        public final Builder additional_help_items(List<HelpItem> additional_help_items) {
            additional_help_items.getClass();
            TransactorKt.checkElementsNotNull(additional_help_items);
            this.additional_help_items = additional_help_items;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public PasscodeVerificationBlockerSupplement build() {
            String str = this.main_text;
            Boolean bool = this.suppress_forgot_passcode_button;
            List<HelpItem> list = this.additional_help_items;
            return new PasscodeVerificationBlockerSupplement(bool, this.suppress_help_item, this.show_biometrics_enrollment_if_eligible, str, this.sub_text, list, buildUnknownFields());
        }

        public final Builder main_text(String main_text) {
            this.main_text = main_text;
            return this;
        }

        public final Builder show_biometrics_enrollment_if_eligible(Boolean show_biometrics_enrollment_if_eligible) {
            this.show_biometrics_enrollment_if_eligible = show_biometrics_enrollment_if_eligible;
            return this;
        }

        public final Builder sub_text(String sub_text) {
            this.sub_text = sub_text;
            return this;
        }

        public final Builder suppress_forgot_passcode_button(Boolean suppress_forgot_passcode_button) {
            this.suppress_forgot_passcode_button = suppress_forgot_passcode_button;
            return this;
        }

        @Deprecated
        public final Builder suppress_help_item(Boolean suppress_help_item) {
            this.suppress_help_item = suppress_help_item;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PasscodeVerificationBlockerSupplement.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.scenarios.PasscodeVerificationBlockerSupplement$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public PasscodeVerificationBlockerSupplement decode(ProtoReader reader) {
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
                        return new PasscodeVerificationBlockerSupplement((Boolean) obj2, (Boolean) obj4, (Boolean) obj5, (String) obj, (String) obj3, m, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 3:
                            m.add(HelpItem.ADAPTER.decode(reader));
                            break;
                        case 4:
                            obj3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            obj4 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 6:
                            obj5 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PasscodeVerificationBlockerSupplement value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.main_text);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(writer, 2, value.suppress_forgot_passcode_button);
                HelpItem.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.additional_help_items);
                protoAdapter2.encodeWithTag(writer, 4, value.sub_text);
                protoAdapter3.encodeWithTag(writer, 5, value.suppress_help_item);
                protoAdapter3.encodeWithTag(writer, 6, value.show_biometrics_enrollment_if_eligible);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PasscodeVerificationBlockerSupplement value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(1, value.main_text) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                return protoAdapter3.encodedSizeWithTag(6, value.show_biometrics_enrollment_if_eligible) + protoAdapter3.encodedSizeWithTag(5, value.suppress_help_item) + protoAdapter2.encodedSizeWithTag(4, value.sub_text) + HelpItem.ADAPTER.asRepeated().encodedSizeWithTag(3, value.additional_help_items) + protoAdapter3.encodedSizeWithTag(2, value.suppress_forgot_passcode_button) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PasscodeVerificationBlockerSupplement redact(PasscodeVerificationBlockerSupplement value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.additional_help_items, HelpItem.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                Boolean bool = value.suppress_forgot_passcode_button;
                String str = value.sub_text;
                Boolean bool2 = value.suppress_help_item;
                Boolean bool3 = value.show_biometrics_enrollment_if_eligible;
                byteString.getClass();
                return new PasscodeVerificationBlockerSupplement(bool, bool2, bool3, null, str, m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PasscodeVerificationBlockerSupplement value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 6, value.show_biometrics_enrollment_if_eligible);
                protoAdapter2.encodeWithTag(writer, 5, value.suppress_help_item);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 4, value.sub_text);
                HelpItem.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.additional_help_items);
                protoAdapter2.encodeWithTag(writer, 2, value.suppress_forgot_passcode_button);
                protoAdapter3.encodeWithTag(writer, 1, value.main_text);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasscodeVerificationBlockerSupplement(Boolean bool, Boolean bool2, Boolean bool3, String str, String str2, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.main_text = str;
        this.suppress_forgot_passcode_button = bool;
        this.sub_text = str2;
        this.suppress_help_item = bool2;
        this.show_biometrics_enrollment_if_eligible = bool3;
        this.additional_help_items = TransactorKt.immutableCopyOf("additional_help_items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PasscodeVerificationBlockerSupplement)) {
            return false;
        }
        PasscodeVerificationBlockerSupplement passcodeVerificationBlockerSupplement = (PasscodeVerificationBlockerSupplement) obj;
        return Intrinsics.areEqual(unknownFields(), passcodeVerificationBlockerSupplement.unknownFields()) && Intrinsics.areEqual(this.main_text, passcodeVerificationBlockerSupplement.main_text) && Intrinsics.areEqual(this.suppress_forgot_passcode_button, passcodeVerificationBlockerSupplement.suppress_forgot_passcode_button) && Intrinsics.areEqual(this.additional_help_items, passcodeVerificationBlockerSupplement.additional_help_items) && Intrinsics.areEqual(this.sub_text, passcodeVerificationBlockerSupplement.sub_text) && Intrinsics.areEqual(this.suppress_help_item, passcodeVerificationBlockerSupplement.suppress_help_item) && Intrinsics.areEqual(this.show_biometrics_enrollment_if_eligible, passcodeVerificationBlockerSupplement.show_biometrics_enrollment_if_eligible);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.main_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.suppress_forgot_passcode_button;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37, 37, this.additional_help_items);
        String str2 = this.sub_text;
        int hashCode3 = (m + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool2 = this.suppress_help_item;
        int hashCode4 = (hashCode3 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.show_biometrics_enrollment_if_eligible;
        int hashCode5 = hashCode4 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.main_text = this.main_text;
        builder.suppress_forgot_passcode_button = this.suppress_forgot_passcode_button;
        builder.additional_help_items = this.additional_help_items;
        builder.sub_text = this.sub_text;
        builder.suppress_help_item = this.suppress_help_item;
        builder.show_biometrics_enrollment_if_eligible = this.show_biometrics_enrollment_if_eligible;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.main_text != null) {
            arrayList.add("main_text=██");
        }
        Boolean bool = this.suppress_forgot_passcode_button;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("suppress_forgot_passcode_button=", bool, arrayList);
        }
        if (!this.additional_help_items.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("additional_help_items=", arrayList, this.additional_help_items);
        }
        String str = this.sub_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "sub_text=", arrayList);
        }
        Boolean bool2 = this.suppress_help_item;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("suppress_help_item=", bool2, arrayList);
        }
        Boolean bool3 = this.show_biometrics_enrollment_if_eligible;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_biometrics_enrollment_if_eligible=", bool3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PasscodeVerificationBlockerSupplement{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/PasscodeVerificationBlockerSupplement$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/scenarios/PasscodeVerificationBlockerSupplement$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/scenarios/PasscodeVerificationBlockerSupplement;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/scenarios/PasscodeVerificationBlockerSupplement;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PasscodeVerificationBlockerSupplement build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
