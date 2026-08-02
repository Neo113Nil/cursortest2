package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.SelectionOption;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;
import okio.ByteString;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u000e\r\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectionOption;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/SelectionOption$Builder;", "", AnnotatedPrivateKey.LABEL, "Ljava/lang/String;", "action", "Lcom/squareup/protos/franklin/api/ClientScenario;", "client_scenario", "Lcom/squareup/protos/franklin/api/ClientScenario;", "Lcom/squareup/protos/franklin/api/SelectionOption$Hint;", "hint", "Lcom/squareup/protos/franklin/api/SelectionOption$Hint;", "Companion", "Builder", "Hint", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SelectionOption extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SelectionOption> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String action;

    @WireField(adapter = "com.squareup.protos.franklin.api.ClientScenario#ADAPTER", schemaIndex = 2, tag = 3)
    public final ClientScenario client_scenario;

    @WireField(adapter = "com.squareup.protos.franklin.api.SelectionOption$Hint#ADAPTER", schemaIndex = 3, tag = 4)
    public final Hint hint;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String label;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectionOption$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/SelectionOption;", "<init>", "()V", AnnotatedPrivateKey.LABEL, "", "action", "client_scenario", "Lcom/squareup/protos/franklin/api/ClientScenario;", "hint", "Lcom/squareup/protos/franklin/api/SelectionOption$Hint;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public String action;
        public ClientScenario client_scenario;
        public Hint hint;
        public String label;

        public final Builder action(String action) {
            this.action = action;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public SelectionOption build() {
            return new SelectionOption(this.label, this.action, this.client_scenario, this.hint, buildUnknownFields());
        }

        public final Builder client_scenario(ClientScenario client_scenario) {
            this.client_scenario = client_scenario;
            return this;
        }

        public final Builder hint(Hint hint) {
            this.hint = hint;
            return this;
        }

        public final Builder label(String label) {
            this.label = label;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SelectionOption.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SelectionOption$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public SelectionOption decode(ProtoReader reader) {
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new SelectionOption((String) obj, (String) obj2, (ClientScenario) obj3, (SelectionOption.Hint) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 3) {
                        try {
                            obj3 = ClientScenario.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        try {
                            obj4 = SelectionOption.Hint.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SelectionOption value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.label);
                protoAdapter2.encodeWithTag(writer, 2, value.action);
                ClientScenario.ADAPTER.encodeWithTag(writer, 3, value.client_scenario);
                SelectionOption.Hint.ADAPTER.encodeWithTag(writer, 4, value.hint);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SelectionOption value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return SelectionOption.Hint.ADAPTER.encodedSizeWithTag(4, value.hint) + ClientScenario.ADAPTER.encodedSizeWithTag(3, value.client_scenario) + protoAdapter2.encodedSizeWithTag(2, value.action) + protoAdapter2.encodedSizeWithTag(1, value.label) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SelectionOption redact(SelectionOption value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = value.label;
                String str2 = value.action;
                ClientScenario clientScenario = value.client_scenario;
                SelectionOption.Hint hint = value.hint;
                value.getClass();
                byteString.getClass();
                return new SelectionOption(str, str2, clientScenario, hint, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SelectionOption value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                SelectionOption.Hint.ADAPTER.encodeWithTag(writer, 4, value.hint);
                ClientScenario.ADAPTER.encodeWithTag(writer, 3, value.client_scenario);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 2, value.action);
                protoAdapter2.encodeWithTag(writer, 1, value.label);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionOption(String str, String str2, ClientScenario clientScenario, Hint hint, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.label = str;
        this.action = str2;
        this.client_scenario = clientScenario;
        this.hint = hint;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SelectionOption)) {
            return false;
        }
        SelectionOption selectionOption = (SelectionOption) obj;
        return Intrinsics.areEqual(unknownFields(), selectionOption.unknownFields()) && Intrinsics.areEqual(this.label, selectionOption.label) && Intrinsics.areEqual(this.action, selectionOption.action) && this.client_scenario == selectionOption.client_scenario && this.hint == selectionOption.hint;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.label;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.action;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        ClientScenario clientScenario = this.client_scenario;
        int hashCode4 = (hashCode3 + (clientScenario != null ? clientScenario.hashCode() : 0)) * 37;
        Hint hint = this.hint;
        int hashCode5 = hashCode4 + (hint != null ? hint.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.label = this.label;
        builder.action = this.action;
        builder.client_scenario = this.client_scenario;
        builder.hint = this.hint;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.label;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
        }
        String str2 = this.action;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "action=", arrayList);
        }
        ClientScenario clientScenario = this.client_scenario;
        if (clientScenario != null) {
            Matcher$$ExternalSyntheticOutline0.m("client_scenario=", clientScenario, arrayList);
        }
        Hint hint = this.hint;
        if (hint != null) {
            arrayList.add("hint=" + hint);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SelectionOption{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectionOption$Hint;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CANCEL_BUTTON", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Hint implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Hint[] $VALUES;
        public static final ProtoAdapter ADAPTER;
        public static final Hint CANCEL_BUTTON = new Hint("CANCEL_BUTTON", 0, 1);

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;

        private static final /* synthetic */ Hint[] $values() {
            return new Hint[]{CANCEL_BUTTON};
        }

        static {
            Hint[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Hint.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.SelectionOption$Hint$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public SelectionOption.Hint fromValue(int value) {
                    return SelectionOption.Hint.INSTANCE.fromValue(value);
                }
            };
        }

        private Hint(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Hint fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Hint valueOf(String str) {
            return (Hint) Enum.valueOf(Hint.class, str);
        }

        public static Hint[] values() {
            return (Hint[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectionOption$Hint$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/SelectionOption$Hint;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Hint fromValue(int value) {
                if (value == 1) {
                    return Hint.CANCEL_BUTTON;
                }
                return null;
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/SelectionOption$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/SelectionOption$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/SelectionOption;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/SelectionOption;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ SelectionOption build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
