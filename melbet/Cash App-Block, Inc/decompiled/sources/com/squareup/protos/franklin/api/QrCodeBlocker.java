package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
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
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/QrCodeBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/QrCodeBlocker$Builder;", "", "missing_qr_code_to_locate_cvv", "Ljava/lang/Boolean;", "getMissing_qr_code_to_locate_cvv$annotations", "()V", "", "info_text_above_scanner", "Ljava/lang/String;", "info_text_below_scanner", "button_text", "Lcom/squareup/protos/cash/localization/LocalizableString;", "localizable_info_text_above_scanner", "Lcom/squareup/protos/cash/localization/LocalizableString;", "localizable_info_text_below_scanner", "localizable_button_text", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class QrCodeBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<QrCodeBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String button_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String info_text_above_scanner;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String info_text_below_scanner;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 6, tag = 7)
    public final LocalizableString localizable_button_text;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 4, tag = 5)
    public final LocalizableString localizable_info_text_above_scanner;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 5, tag = 6)
    public final LocalizableString localizable_info_text_below_scanner;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 0, tag = 1)
    public final Boolean missing_qr_code_to_locate_cvv;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0010J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\rJ\b\u0010\u0011\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/franklin/api/QrCodeBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/QrCodeBlocker;", "<init>", "()V", "missing_qr_code_to_locate_cvv", "", "Ljava/lang/Boolean;", "info_text_above_scanner", "", "info_text_below_scanner", "button_text", "localizable_info_text_above_scanner", "Lcom/squareup/protos/cash/localization/LocalizableString;", "localizable_info_text_below_scanner", "localizable_button_text", "(Ljava/lang/Boolean;)Lcom/squareup/protos/franklin/api/QrCodeBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public String button_text;
        public String info_text_above_scanner;
        public String info_text_below_scanner;
        public LocalizableString localizable_button_text;
        public LocalizableString localizable_info_text_above_scanner;
        public LocalizableString localizable_info_text_below_scanner;
        public Boolean missing_qr_code_to_locate_cvv;

        @Override // com.squareup.wire.Message.Builder
        public QrCodeBlocker build() {
            return new QrCodeBlocker(this.missing_qr_code_to_locate_cvv, this.info_text_above_scanner, this.info_text_below_scanner, this.button_text, this.localizable_info_text_above_scanner, this.localizable_info_text_below_scanner, this.localizable_button_text, buildUnknownFields());
        }

        public final Builder button_text(String button_text) {
            this.button_text = button_text;
            return this;
        }

        public final Builder info_text_above_scanner(String info_text_above_scanner) {
            this.info_text_above_scanner = info_text_above_scanner;
            return this;
        }

        public final Builder info_text_below_scanner(String info_text_below_scanner) {
            this.info_text_below_scanner = info_text_below_scanner;
            return this;
        }

        public final Builder localizable_button_text(LocalizableString localizable_button_text) {
            this.localizable_button_text = localizable_button_text;
            return this;
        }

        public final Builder localizable_info_text_above_scanner(LocalizableString localizable_info_text_above_scanner) {
            this.localizable_info_text_above_scanner = localizable_info_text_above_scanner;
            return this;
        }

        public final Builder localizable_info_text_below_scanner(LocalizableString localizable_info_text_below_scanner) {
            this.localizable_info_text_below_scanner = localizable_info_text_below_scanner;
            return this;
        }

        @Deprecated
        public final Builder missing_qr_code_to_locate_cvv(Boolean missing_qr_code_to_locate_cvv) {
            this.missing_qr_code_to_locate_cvv = missing_qr_code_to_locate_cvv;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(QrCodeBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.QrCodeBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public QrCodeBlocker decode(ProtoReader reader) {
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
                        return new QrCodeBlocker((Boolean) obj, (String) obj2, (String) obj3, (String) obj4, (LocalizableString) obj5, (LocalizableString) obj6, (LocalizableString) obj7, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.BOOL.decode(reader);
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
                            obj5 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj5);
                            break;
                        case 6:
                            obj6 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj6);
                            break;
                        case 7:
                            obj7 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj7);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, QrCodeBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.missing_qr_code_to_locate_cvv);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 2, value.info_text_above_scanner);
                protoAdapter2.encodeWithTag(writer, 3, value.info_text_below_scanner);
                protoAdapter2.encodeWithTag(writer, 4, value.button_text);
                ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 5, value.localizable_info_text_above_scanner);
                protoAdapter3.encodeWithTag(writer, 6, value.localizable_info_text_below_scanner);
                protoAdapter3.encodeWithTag(writer, 7, value.localizable_button_text);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(QrCodeBlocker value) {
                value.getClass();
                int encodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, value.missing_qr_code_to_locate_cvv) + value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag2 = protoAdapter2.encodedSizeWithTag(4, value.button_text) + protoAdapter2.encodedSizeWithTag(3, value.info_text_below_scanner) + protoAdapter2.encodedSizeWithTag(2, value.info_text_above_scanner) + encodedSizeWithTag;
                ProtoAdapter protoAdapter3 = LocalizableString.ADAPTER;
                return protoAdapter3.encodedSizeWithTag(7, value.localizable_button_text) + protoAdapter3.encodedSizeWithTag(6, value.localizable_info_text_below_scanner) + protoAdapter3.encodedSizeWithTag(5, value.localizable_info_text_above_scanner) + encodedSizeWithTag2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public QrCodeBlocker redact(QrCodeBlocker value) {
                value.getClass();
                LocalizableString localizableString = value.localizable_info_text_above_scanner;
                LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
                LocalizableString localizableString3 = value.localizable_info_text_below_scanner;
                LocalizableString localizableString4 = localizableString3 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString3) : null;
                LocalizableString localizableString5 = value.localizable_button_text;
                LocalizableString localizableString6 = localizableString5 != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString5) : null;
                ByteString byteString = ByteString.EMPTY;
                Boolean bool = value.missing_qr_code_to_locate_cvv;
                String str = value.info_text_above_scanner;
                String str2 = value.info_text_below_scanner;
                String str3 = value.button_text;
                byteString.getClass();
                return new QrCodeBlocker(bool, str, str2, str3, localizableString2, localizableString4, localizableString6, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, QrCodeBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = LocalizableString.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 7, value.localizable_button_text);
                protoAdapter2.encodeWithTag(writer, 6, value.localizable_info_text_below_scanner);
                protoAdapter2.encodeWithTag(writer, 5, value.localizable_info_text_above_scanner);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 4, value.button_text);
                protoAdapter3.encodeWithTag(writer, 3, value.info_text_below_scanner);
                protoAdapter3.encodeWithTag(writer, 2, value.info_text_above_scanner);
                ProtoAdapter.BOOL.encodeWithTag(writer, 1, value.missing_qr_code_to_locate_cvv);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrCodeBlocker(Boolean bool, String str, String str2, String str3, LocalizableString localizableString, LocalizableString localizableString2, LocalizableString localizableString3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.missing_qr_code_to_locate_cvv = bool;
        this.info_text_above_scanner = str;
        this.info_text_below_scanner = str2;
        this.button_text = str3;
        this.localizable_info_text_above_scanner = localizableString;
        this.localizable_info_text_below_scanner = localizableString2;
        this.localizable_button_text = localizableString3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof QrCodeBlocker)) {
            return false;
        }
        QrCodeBlocker qrCodeBlocker = (QrCodeBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), qrCodeBlocker.unknownFields()) && Intrinsics.areEqual(this.missing_qr_code_to_locate_cvv, qrCodeBlocker.missing_qr_code_to_locate_cvv) && Intrinsics.areEqual(this.info_text_above_scanner, qrCodeBlocker.info_text_above_scanner) && Intrinsics.areEqual(this.info_text_below_scanner, qrCodeBlocker.info_text_below_scanner) && Intrinsics.areEqual(this.button_text, qrCodeBlocker.button_text) && Intrinsics.areEqual(this.localizable_info_text_above_scanner, qrCodeBlocker.localizable_info_text_above_scanner) && Intrinsics.areEqual(this.localizable_info_text_below_scanner, qrCodeBlocker.localizable_info_text_below_scanner) && Intrinsics.areEqual(this.localizable_button_text, qrCodeBlocker.localizable_button_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.missing_qr_code_to_locate_cvv;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str = this.info_text_above_scanner;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.info_text_below_scanner;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.button_text;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localizable_info_text_above_scanner;
        int hashCode6 = (hashCode5 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
        LocalizableString localizableString2 = this.localizable_info_text_below_scanner;
        int hashCode7 = (hashCode6 + (localizableString2 != null ? localizableString2.hashCode() : 0)) * 37;
        LocalizableString localizableString3 = this.localizable_button_text;
        int hashCode8 = hashCode7 + (localizableString3 != null ? localizableString3.hashCode() : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.missing_qr_code_to_locate_cvv = this.missing_qr_code_to_locate_cvv;
        builder.info_text_above_scanner = this.info_text_above_scanner;
        builder.info_text_below_scanner = this.info_text_below_scanner;
        builder.button_text = this.button_text;
        builder.localizable_info_text_above_scanner = this.localizable_info_text_above_scanner;
        builder.localizable_info_text_below_scanner = this.localizable_info_text_below_scanner;
        builder.localizable_button_text = this.localizable_button_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.missing_qr_code_to_locate_cvv;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("missing_qr_code_to_locate_cvv=", bool, arrayList);
        }
        String str = this.info_text_above_scanner;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "info_text_above_scanner=", arrayList);
        }
        String str2 = this.info_text_below_scanner;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "info_text_below_scanner=", arrayList);
        }
        String str3 = this.button_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "button_text=", arrayList);
        }
        LocalizableString localizableString = this.localizable_info_text_above_scanner;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_info_text_above_scanner=", localizableString, arrayList);
        }
        LocalizableString localizableString2 = this.localizable_info_text_below_scanner;
        if (localizableString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_info_text_below_scanner=", localizableString2, arrayList);
        }
        LocalizableString localizableString3 = this.localizable_button_text;
        if (localizableString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_button_text=", localizableString3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "QrCodeBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/QrCodeBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/QrCodeBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/QrCodeBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/QrCodeBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ QrCodeBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
