package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.ui.Icon;
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

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0014R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\t\u0012\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/PasskeyUpsellBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/PasskeyUpsellBlocker$Builder;", "", "header_text", "Ljava/lang/String;", "detail_text", "", "is_retry", "Ljava/lang/Boolean;", "is_skippable", "is_skippable$annotations", "()V", "Lcom/squareup/protos/cash/ui/Icon;", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "", "Lcom/squareup/protos/franklin/api/PasskeyUpsellElement;", "elements", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PasskeyUpsellBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PasskeyUpsellBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String detail_text;

    @WireField(adapter = "com.squareup.protos.franklin.api.PasskeyUpsellElement#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    public final List<PasskeyUpsellElement> elements;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String header_text;

    @WireField(adapter = "com.squareup.protos.cash.ui.Icon#ADAPTER", schemaIndex = 5, tag = 6)
    public final Icon icon;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 3, tag = 4)
    public final Boolean is_retry;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 4, tag = 5)
    public final Boolean is_skippable;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u0011J\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0002\u0010\u0011J\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\rR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/api/PasskeyUpsellBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/PasskeyUpsellBlocker;", "<init>", "()V", "header_text", "", "detail_text", "elements", "", "Lcom/squareup/protos/franklin/api/PasskeyUpsellElement;", "is_retry", "", "Ljava/lang/Boolean;", "is_skippable", "icon", "Lcom/squareup/protos/cash/ui/Icon;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/PasskeyUpsellBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public String detail_text;
        public List<PasskeyUpsellElement> elements = EmptyList.INSTANCE;
        public String header_text;
        public Icon icon;
        public Boolean is_retry;
        public Boolean is_skippable;

        @Override // com.squareup.wire.Message.Builder
        public PasskeyUpsellBlocker build() {
            return new PasskeyUpsellBlocker(this.header_text, this.detail_text, this.elements, this.is_retry, this.is_skippable, this.icon, buildUnknownFields());
        }

        public final Builder detail_text(String detail_text) {
            this.detail_text = detail_text;
            return this;
        }

        public final Builder elements(List<PasskeyUpsellElement> elements) {
            elements.getClass();
            TransactorKt.checkElementsNotNull(elements);
            this.elements = elements;
            return this;
        }

        public final Builder header_text(String header_text) {
            this.header_text = header_text;
            return this;
        }

        public final Builder icon(Icon icon) {
            this.icon = icon;
            return this;
        }

        public final Builder is_retry(Boolean is_retry) {
            this.is_retry = is_retry;
            return this;
        }

        @Deprecated
        public final Builder is_skippable(Boolean is_skippable) {
            this.is_skippable = is_skippable;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PasskeyUpsellBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.PasskeyUpsellBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public PasskeyUpsellBlocker decode(ProtoReader reader) {
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
                        return new PasskeyUpsellBlocker((String) obj, (String) obj2, m, (Boolean) obj3, (Boolean) obj4, (Icon) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 3:
                            m.add(PasskeyUpsellElement.ADAPTER.decode(reader));
                            break;
                        case 4:
                            obj3 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 5:
                            obj4 = ProtoAdapter.BOOL.decode(reader);
                            break;
                        case 6:
                            obj5 = TransactorKt.decodeMessageOrMerge(Icon.ADAPTER, reader, obj5);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PasskeyUpsellBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.header_text);
                protoAdapter2.encodeWithTag(writer, 2, value.detail_text);
                PasskeyUpsellElement.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.elements);
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                protoAdapter3.encodeWithTag(writer, 4, value.is_retry);
                protoAdapter3.encodeWithTag(writer, 5, value.is_skippable);
                Icon.ADAPTER.encodeWithTag(writer, 6, value.icon);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PasskeyUpsellBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = PasskeyUpsellElement.ADAPTER.asRepeated().encodedSizeWithTag(3, value.elements) + protoAdapter2.encodedSizeWithTag(2, value.detail_text) + protoAdapter2.encodedSizeWithTag(1, value.header_text) + size$okio;
                ProtoAdapter protoAdapter3 = ProtoAdapter.BOOL;
                return Icon.ADAPTER.encodedSizeWithTag(6, value.icon) + protoAdapter3.encodedSizeWithTag(5, value.is_skippable) + protoAdapter3.encodedSizeWithTag(4, value.is_retry) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PasskeyUpsellBlocker redact(PasskeyUpsellBlocker value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.elements, PasskeyUpsellElement.ADAPTER);
                Icon icon = value.icon;
                Icon icon2 = icon != null ? (Icon) Icon.ADAPTER.redact(icon) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.header_text;
                String str2 = value.detail_text;
                Boolean bool = value.is_retry;
                Boolean bool2 = value.is_skippable;
                byteString.getClass();
                return new PasskeyUpsellBlocker(str, str2, m1169redactElements, bool, bool2, icon2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PasskeyUpsellBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                Icon.ADAPTER.encodeWithTag(writer, 6, value.icon);
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(writer, 5, value.is_skippable);
                protoAdapter2.encodeWithTag(writer, 4, value.is_retry);
                PasskeyUpsellElement.ADAPTER.asRepeated().encodeWithTag(writer, 3, value.elements);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 2, value.detail_text);
                protoAdapter3.encodeWithTag(writer, 1, value.header_text);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasskeyUpsellBlocker(String str, String str2, List list, Boolean bool, Boolean bool2, Icon icon, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.header_text = str;
        this.detail_text = str2;
        this.is_retry = bool;
        this.is_skippable = bool2;
        this.icon = icon;
        this.elements = TransactorKt.immutableCopyOf("elements", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PasskeyUpsellBlocker)) {
            return false;
        }
        PasskeyUpsellBlocker passkeyUpsellBlocker = (PasskeyUpsellBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), passkeyUpsellBlocker.unknownFields()) && Intrinsics.areEqual(this.header_text, passkeyUpsellBlocker.header_text) && Intrinsics.areEqual(this.detail_text, passkeyUpsellBlocker.detail_text) && Intrinsics.areEqual(this.elements, passkeyUpsellBlocker.elements) && Intrinsics.areEqual(this.is_retry, passkeyUpsellBlocker.is_retry) && Intrinsics.areEqual(this.is_skippable, passkeyUpsellBlocker.is_skippable) && Intrinsics.areEqual(this.icon, passkeyUpsellBlocker.icon);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.header_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.detail_text;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37, this.elements);
        Boolean bool = this.is_retry;
        int hashCode3 = (m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.is_skippable;
        int hashCode4 = (hashCode3 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Icon icon = this.icon;
        int hashCode5 = hashCode4 + (icon != null ? icon.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.header_text = this.header_text;
        builder.detail_text = this.detail_text;
        builder.elements = this.elements;
        builder.is_retry = this.is_retry;
        builder.is_skippable = this.is_skippable;
        builder.icon = this.icon;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.header_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "header_text=", arrayList);
        }
        String str2 = this.detail_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "detail_text=", arrayList);
        }
        if (!this.elements.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("elements=", arrayList, this.elements);
        }
        Boolean bool = this.is_retry;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_retry=", bool, arrayList);
        }
        Boolean bool2 = this.is_skippable;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_skippable=", bool2, arrayList);
        }
        Icon icon = this.icon;
        if (icon != null) {
            Matcher$$ExternalSyntheticOutline0.m("icon=", icon, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PasskeyUpsellBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/PasskeyUpsellBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/PasskeyUpsellBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/PasskeyUpsellBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/PasskeyUpsellBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ PasskeyUpsellBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
