package com.squareup.protos.franklin.common.scenarios;

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

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u000e\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/PasscodeCreationBlockerSupplement;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/common/scenarios/PasscodeCreationBlockerSupplement$Builder;", "", "prompt_main_text", "Ljava/lang/String;", "confirmation_main_text", "", "skippable", "Ljava/lang/Boolean;", "prompt_sub_text", "confirmation_sub_text", "main_text_accessibility_text", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PasscodeCreationBlockerSupplement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PasscodeCreationBlockerSupplement> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String confirmation_main_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String confirmation_sub_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    public final String main_text_accessibility_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String prompt_main_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String prompt_sub_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
    public final Boolean skippable;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/PasscodeCreationBlockerSupplement$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/common/scenarios/PasscodeCreationBlockerSupplement;", "<init>", "()V", "prompt_main_text", "", "confirmation_main_text", "skippable", "", "Ljava/lang/Boolean;", "prompt_sub_text", "confirmation_sub_text", "main_text_accessibility_text", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/common/scenarios/PasscodeCreationBlockerSupplement$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String confirmation_main_text;
        public String confirmation_sub_text;
        public String main_text_accessibility_text;
        public String prompt_main_text;
        public String prompt_sub_text;
        public Boolean skippable;

        @Override // com.squareup.wire.Message.Builder
        public PasscodeCreationBlockerSupplement build() {
            return new PasscodeCreationBlockerSupplement(this.skippable, this.prompt_main_text, this.confirmation_main_text, this.prompt_sub_text, this.confirmation_sub_text, this.main_text_accessibility_text, buildUnknownFields());
        }

        public final Builder confirmation_main_text(String confirmation_main_text) {
            this.confirmation_main_text = confirmation_main_text;
            return this;
        }

        public final Builder confirmation_sub_text(String confirmation_sub_text) {
            this.confirmation_sub_text = confirmation_sub_text;
            return this;
        }

        public final Builder main_text_accessibility_text(String main_text_accessibility_text) {
            this.main_text_accessibility_text = main_text_accessibility_text;
            return this;
        }

        public final Builder prompt_main_text(String prompt_main_text) {
            this.prompt_main_text = prompt_main_text;
            return this;
        }

        public final Builder prompt_sub_text(String prompt_sub_text) {
            this.prompt_sub_text = prompt_sub_text;
            return this;
        }

        public final Builder skippable(Boolean skippable) {
            this.skippable = skippable;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PasscodeCreationBlockerSupplement.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.common.scenarios.PasscodeCreationBlockerSupplement$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public PasscodeCreationBlockerSupplement decode(ProtoReader reader) {
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
                        return new PasscodeCreationBlockerSupplement((Boolean) obj3, (String) obj, (String) obj2, (String) obj4, (String) obj5, (String) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            obj3 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 4:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 5:
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.STRING.decode(reader);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PasscodeCreationBlockerSupplement value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.prompt_main_text);
                protoAdapter2.encodeWithTag(writer, 2, value.confirmation_main_text);
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.skippable);
                protoAdapter2.encodeWithTag(writer, 4, value.prompt_sub_text);
                protoAdapter2.encodeWithTag(writer, 5, value.confirmation_sub_text);
                protoAdapter2.encodeWithTag(writer, 6, value.main_text_accessibility_text);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PasscodeCreationBlockerSupplement value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(6, value.main_text_accessibility_text) + protoAdapter2.encodedSizeWithTag(5, value.confirmation_sub_text) + protoAdapter2.encodedSizeWithTag(4, value.prompt_sub_text) + ProtoAdapter.BOOL.encodedSizeWithTag(3, value.skippable) + protoAdapter2.encodedSizeWithTag(2, value.confirmation_main_text) + protoAdapter2.encodedSizeWithTag(1, value.prompt_main_text) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PasscodeCreationBlockerSupplement redact(PasscodeCreationBlockerSupplement value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = value.prompt_main_text;
                String str2 = value.confirmation_main_text;
                Boolean bool = value.skippable;
                String str3 = value.prompt_sub_text;
                String str4 = value.confirmation_sub_text;
                String str5 = value.main_text_accessibility_text;
                value.getClass();
                byteString.getClass();
                return new PasscodeCreationBlockerSupplement(bool, str, str2, str3, str4, str5, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PasscodeCreationBlockerSupplement value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 6, value.main_text_accessibility_text);
                protoAdapter2.encodeWithTag(writer, 5, value.confirmation_sub_text);
                protoAdapter2.encodeWithTag(writer, 4, value.prompt_sub_text);
                ProtoAdapter.BOOL.encodeWithTag(writer, 3, value.skippable);
                protoAdapter2.encodeWithTag(writer, 2, value.confirmation_main_text);
                protoAdapter2.encodeWithTag(writer, 1, value.prompt_main_text);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasscodeCreationBlockerSupplement(Boolean bool, String str, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.prompt_main_text = str;
        this.confirmation_main_text = str2;
        this.skippable = bool;
        this.prompt_sub_text = str3;
        this.confirmation_sub_text = str4;
        this.main_text_accessibility_text = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PasscodeCreationBlockerSupplement)) {
            return false;
        }
        PasscodeCreationBlockerSupplement passcodeCreationBlockerSupplement = (PasscodeCreationBlockerSupplement) obj;
        return Intrinsics.areEqual(unknownFields(), passcodeCreationBlockerSupplement.unknownFields()) && Intrinsics.areEqual(this.prompt_main_text, passcodeCreationBlockerSupplement.prompt_main_text) && Intrinsics.areEqual(this.confirmation_main_text, passcodeCreationBlockerSupplement.confirmation_main_text) && Intrinsics.areEqual(this.skippable, passcodeCreationBlockerSupplement.skippable) && Intrinsics.areEqual(this.prompt_sub_text, passcodeCreationBlockerSupplement.prompt_sub_text) && Intrinsics.areEqual(this.confirmation_sub_text, passcodeCreationBlockerSupplement.confirmation_sub_text) && Intrinsics.areEqual(this.main_text_accessibility_text, passcodeCreationBlockerSupplement.main_text_accessibility_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.prompt_main_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.confirmation_main_text;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool = this.skippable;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str3 = this.prompt_sub_text;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.confirmation_sub_text;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.main_text_accessibility_text;
        int hashCode7 = hashCode6 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.prompt_main_text = this.prompt_main_text;
        builder.confirmation_main_text = this.confirmation_main_text;
        builder.skippable = this.skippable;
        builder.prompt_sub_text = this.prompt_sub_text;
        builder.confirmation_sub_text = this.confirmation_sub_text;
        builder.main_text_accessibility_text = this.main_text_accessibility_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.prompt_main_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "prompt_main_text=", arrayList);
        }
        String str2 = this.confirmation_main_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "confirmation_main_text=", arrayList);
        }
        Boolean bool = this.skippable;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("skippable=", bool, arrayList);
        }
        String str3 = this.prompt_sub_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "prompt_sub_text=", arrayList);
        }
        String str4 = this.confirmation_sub_text;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "confirmation_sub_text=", arrayList);
        }
        String str5 = this.main_text_accessibility_text;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "main_text_accessibility_text=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PasscodeCreationBlockerSupplement{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/common/scenarios/PasscodeCreationBlockerSupplement$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/common/scenarios/PasscodeCreationBlockerSupplement$Builder;", "", "body", "Lcom/squareup/protos/franklin/common/scenarios/PasscodeCreationBlockerSupplement;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/common/scenarios/PasscodeCreationBlockerSupplement;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PasscodeCreationBlockerSupplement build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
