package com.squareup.protos.franklin.blockers;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0012\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/blockers/TreehouseBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/blockers/TreehouseBlocker$Builder;", "", "name", "Ljava/lang/String;", "getName$annotations", "()V", "Lokio/ByteString;", "parameters", "Lokio/ByteString;", "path", "", "stack_size", "Ljava/lang/Integer;", "plasma_flow_token", "proposed_treehouse_flow_token", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TreehouseBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TreehouseBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", redacted = true, schemaIndex = 1, tag = 2)
    public final ByteString parameters;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String path;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String plasma_flow_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    public final String proposed_treehouse_flow_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 3, tag = 4)
    public final Integer stack_size;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u000fJ\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/franklin/blockers/TreehouseBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/blockers/TreehouseBlocker;", "<init>", "()V", "name", "", "parameters", "Lokio/ByteString;", "path", "stack_size", "", "Ljava/lang/Integer;", "plasma_flow_token", "proposed_treehouse_flow_token", "(Ljava/lang/Integer;)Lcom/squareup/protos/franklin/blockers/TreehouseBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public String name;
        public ByteString parameters;
        public String path;
        public String plasma_flow_token;
        public String proposed_treehouse_flow_token;
        public Integer stack_size;

        @Override // com.squareup.wire.Message.Builder
        public TreehouseBlocker build() {
            return new TreehouseBlocker(this.name, this.parameters, this.path, this.stack_size, this.plasma_flow_token, this.proposed_treehouse_flow_token, buildUnknownFields());
        }

        @Deprecated
        public final Builder name(String name) {
            this.name = name;
            return this;
        }

        public final Builder parameters(ByteString parameters) {
            this.parameters = parameters;
            return this;
        }

        public final Builder path(String path) {
            this.path = path;
            return this;
        }

        public final Builder plasma_flow_token(String plasma_flow_token) {
            this.plasma_flow_token = plasma_flow_token;
            return this;
        }

        public final Builder proposed_treehouse_flow_token(String proposed_treehouse_flow_token) {
            this.proposed_treehouse_flow_token = proposed_treehouse_flow_token;
            return this;
        }

        public final Builder stack_size(Integer stack_size) {
            this.stack_size = stack_size;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(TreehouseBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.blockers.TreehouseBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TreehouseBlocker decode(ProtoReader reader) {
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
                        return new TreehouseBlocker((String) obj, (ByteString) obj2, (String) obj3, (Integer) obj4, (String) obj5, (String) obj6, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 2:
                            obj2 = ProtoAdapter.BYTES.decode(reader);
                            break;
                        case 3:
                            obj3 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 4:
                            obj4 = ProtoAdapter.INT32.decode(reader);
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
            public void encode(ProtoWriter writer, TreehouseBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.name);
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.parameters);
                protoAdapter2.encodeWithTag(writer, 3, value.path);
                ProtoAdapter.INT32.encodeWithTag(writer, 4, value.stack_size);
                protoAdapter2.encodeWithTag(writer, 5, value.plasma_flow_token);
                protoAdapter2.encodeWithTag(writer, 6, value.proposed_treehouse_flow_token);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TreehouseBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.encodedSizeWithTag(6, value.proposed_treehouse_flow_token) + protoAdapter2.encodedSizeWithTag(5, value.plasma_flow_token) + ProtoAdapter.INT32.encodedSizeWithTag(4, value.stack_size) + protoAdapter2.encodedSizeWithTag(3, value.path) + ProtoAdapter.BYTES.encodedSizeWithTag(2, value.parameters) + protoAdapter2.encodedSizeWithTag(1, value.name) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TreehouseBlocker redact(TreehouseBlocker value) {
                value.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = value.name;
                String str2 = value.path;
                Integer num = value.stack_size;
                String str3 = value.plasma_flow_token;
                String str4 = value.proposed_treehouse_flow_token;
                value.getClass();
                byteString.getClass();
                return new TreehouseBlocker(str, null, str2, num, str3, str4, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TreehouseBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 6, value.proposed_treehouse_flow_token);
                protoAdapter2.encodeWithTag(writer, 5, value.plasma_flow_token);
                ProtoAdapter.INT32.encodeWithTag(writer, 4, value.stack_size);
                protoAdapter2.encodeWithTag(writer, 3, value.path);
                ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.parameters);
                protoAdapter2.encodeWithTag(writer, 1, value.name);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TreehouseBlocker(String str, ByteString byteString, String str2, Integer num, String str3, String str4, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.name = str;
        this.parameters = byteString;
        this.path = str2;
        this.stack_size = num;
        this.plasma_flow_token = str3;
        this.proposed_treehouse_flow_token = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TreehouseBlocker)) {
            return false;
        }
        TreehouseBlocker treehouseBlocker = (TreehouseBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), treehouseBlocker.unknownFields()) && Intrinsics.areEqual(this.name, treehouseBlocker.name) && Intrinsics.areEqual(this.parameters, treehouseBlocker.parameters) && Intrinsics.areEqual(this.path, treehouseBlocker.path) && Intrinsics.areEqual(this.stack_size, treehouseBlocker.stack_size) && Intrinsics.areEqual(this.plasma_flow_token, treehouseBlocker.plasma_flow_token) && Intrinsics.areEqual(this.proposed_treehouse_flow_token, treehouseBlocker.proposed_treehouse_flow_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        ByteString byteString = this.parameters;
        int hashCode3 = (hashCode2 + (byteString != null ? byteString.hashCode() : 0)) * 37;
        String str2 = this.path;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num = this.stack_size;
        int hashCode5 = (hashCode4 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        String str3 = this.plasma_flow_token;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.proposed_treehouse_flow_token;
        int hashCode7 = hashCode6 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.name = this.name;
        builder.parameters = this.parameters;
        builder.path = this.path;
        builder.stack_size = this.stack_size;
        builder.plasma_flow_token = this.plasma_flow_token;
        builder.proposed_treehouse_flow_token = this.proposed_treehouse_flow_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
        }
        if (this.parameters != null) {
            arrayList.add("parameters=██");
        }
        String str2 = this.path;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "path=", arrayList);
        }
        Integer num = this.stack_size;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("stack_size=", num, arrayList);
        }
        String str3 = this.plasma_flow_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "plasma_flow_token=", arrayList);
        }
        String str4 = this.proposed_treehouse_flow_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "proposed_treehouse_flow_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TreehouseBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/blockers/TreehouseBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/blockers/TreehouseBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/blockers/TreehouseBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/blockers/TreehouseBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ TreehouseBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
