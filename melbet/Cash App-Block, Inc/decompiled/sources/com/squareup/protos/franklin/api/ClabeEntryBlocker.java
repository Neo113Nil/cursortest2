package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.ClabeEntryBlocker;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0014\u0013\u0015R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0005R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/ClabeEntryBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/ClabeEntryBlocker$Builder;", "", "title", "Ljava/lang/String;", "subtitle", "placeholder_text", "masked_prefill_clabe_text", "masked_prefill_clabe_prefix", "masked_prefill_clabe_token", "Lcom/squareup/protos/franklin/api/BlockerAction;", "primary_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "secondary_action", "", "Lcom/squareup/protos/franklin/api/ClabeEntryBlocker$ClabeBankMapping;", "clabe_bank_mapping", "Ljava/util/List;", "Companion", "Builder", "ClabeBankMapping", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClabeEntryBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ClabeEntryBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.ClabeEntryBlocker$ClabeBankMapping#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 8, tag = 9)
    public final List<ClabeBankMapping> clabe_bank_mapping;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String masked_prefill_clabe_prefix;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String masked_prefill_clabe_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    public final String masked_prefill_clabe_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String placeholder_text;

    @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 6, tag = 7)
    public final BlockerAction primary_action;

    @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 7, tag = 8)
    public final BlockerAction secondary_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String subtitle;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String title;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0014\u0010\u000f\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/api/ClabeEntryBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/ClabeEntryBlocker;", "<init>", "()V", "title", "", "subtitle", "placeholder_text", "masked_prefill_clabe_text", "masked_prefill_clabe_prefix", "masked_prefill_clabe_token", "primary_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "secondary_action", "clabe_bank_mapping", "", "Lcom/squareup/protos/franklin/api/ClabeEntryBlocker$ClabeBankMapping;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public List<ClabeBankMapping> clabe_bank_mapping = EmptyList.INSTANCE;
        public String masked_prefill_clabe_prefix;
        public String masked_prefill_clabe_text;
        public String masked_prefill_clabe_token;
        public String placeholder_text;
        public BlockerAction primary_action;
        public BlockerAction secondary_action;
        public String subtitle;
        public String title;

        @Override // com.squareup.wire.Message.Builder
        public ClabeEntryBlocker build() {
            return new ClabeEntryBlocker(this.title, this.subtitle, this.placeholder_text, this.masked_prefill_clabe_text, this.masked_prefill_clabe_prefix, this.masked_prefill_clabe_token, this.primary_action, this.secondary_action, this.clabe_bank_mapping, buildUnknownFields());
        }

        public final Builder clabe_bank_mapping(List<ClabeBankMapping> clabe_bank_mapping) {
            clabe_bank_mapping.getClass();
            TransactorKt.checkElementsNotNull(clabe_bank_mapping);
            this.clabe_bank_mapping = clabe_bank_mapping;
            return this;
        }

        public final Builder masked_prefill_clabe_prefix(String masked_prefill_clabe_prefix) {
            this.masked_prefill_clabe_prefix = masked_prefill_clabe_prefix;
            return this;
        }

        public final Builder masked_prefill_clabe_text(String masked_prefill_clabe_text) {
            this.masked_prefill_clabe_text = masked_prefill_clabe_text;
            return this;
        }

        public final Builder masked_prefill_clabe_token(String masked_prefill_clabe_token) {
            this.masked_prefill_clabe_token = masked_prefill_clabe_token;
            return this;
        }

        public final Builder placeholder_text(String placeholder_text) {
            this.placeholder_text = placeholder_text;
            return this;
        }

        public final Builder primary_action(BlockerAction primary_action) {
            this.primary_action = primary_action;
            return this;
        }

        public final Builder secondary_action(BlockerAction secondary_action) {
            this.secondary_action = secondary_action;
            return this;
        }

        public final Builder subtitle(String subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ClabeEntryBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.ClabeEntryBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public ClabeEntryBlocker decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new ClabeEntryBlocker((String) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (BlockerAction) obj7, (BlockerAction) obj8, m, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
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
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            obj6 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 7:
                            obj7 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj7);
                            break;
                        case 8:
                            obj8 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj8);
                            break;
                        case 9:
                            m.add(ClabeEntryBlocker.ClabeBankMapping.ADAPTER.decode(reader));
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ClabeEntryBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.title);
                protoAdapter2.encodeWithTag(writer, 2, value.subtitle);
                protoAdapter2.encodeWithTag(writer, 3, value.placeholder_text);
                protoAdapter2.encodeWithTag(writer, 4, value.masked_prefill_clabe_text);
                protoAdapter2.encodeWithTag(writer, 5, value.masked_prefill_clabe_prefix);
                protoAdapter2.encodeWithTag(writer, 6, value.masked_prefill_clabe_token);
                ProtoAdapter protoAdapter3 = BlockerAction.ADAPTER;
                protoAdapter3.encodeWithTag(writer, 7, value.primary_action);
                protoAdapter3.encodeWithTag(writer, 8, value.secondary_action);
                ClabeEntryBlocker.ClabeBankMapping.ADAPTER.asRepeated().encodeWithTag(writer, 9, value.clabe_bank_mapping);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ClabeEntryBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(6, value.masked_prefill_clabe_token) + protoAdapter2.encodedSizeWithTag(5, value.masked_prefill_clabe_prefix) + protoAdapter2.encodedSizeWithTag(4, value.masked_prefill_clabe_text) + protoAdapter2.encodedSizeWithTag(3, value.placeholder_text) + protoAdapter2.encodedSizeWithTag(2, value.subtitle) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
                ProtoAdapter protoAdapter3 = BlockerAction.ADAPTER;
                return ClabeEntryBlocker.ClabeBankMapping.ADAPTER.asRepeated().encodedSizeWithTag(9, value.clabe_bank_mapping) + protoAdapter3.encodedSizeWithTag(8, value.secondary_action) + protoAdapter3.encodedSizeWithTag(7, value.primary_action) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ClabeEntryBlocker redact(ClabeEntryBlocker value) {
                value.getClass();
                BlockerAction blockerAction = value.primary_action;
                BlockerAction blockerAction2 = blockerAction != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction) : null;
                BlockerAction blockerAction3 = value.secondary_action;
                BlockerAction blockerAction4 = blockerAction3 != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction3) : null;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.clabe_bank_mapping, ClabeEntryBlocker.ClabeBankMapping.ADAPTER);
                ByteString byteString = ByteString.EMPTY;
                String str = value.title;
                String str2 = value.subtitle;
                String str3 = value.placeholder_text;
                String str4 = value.masked_prefill_clabe_text;
                String str5 = value.masked_prefill_clabe_prefix;
                String str6 = value.masked_prefill_clabe_token;
                byteString.getClass();
                return new ClabeEntryBlocker(str, str2, str3, str4, str5, str6, blockerAction2, blockerAction4, m1169redactElements, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ClabeEntryBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ClabeEntryBlocker.ClabeBankMapping.ADAPTER.asRepeated().encodeWithTag(writer, 9, value.clabe_bank_mapping);
                ProtoAdapter protoAdapter2 = BlockerAction.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 8, value.secondary_action);
                protoAdapter2.encodeWithTag(writer, 7, value.primary_action);
                ProtoAdapter protoAdapter3 = ProtoAdapter.STRING;
                protoAdapter3.encodeWithTag(writer, 6, value.masked_prefill_clabe_token);
                protoAdapter3.encodeWithTag(writer, 5, value.masked_prefill_clabe_prefix);
                protoAdapter3.encodeWithTag(writer, 4, value.masked_prefill_clabe_text);
                protoAdapter3.encodeWithTag(writer, 3, value.placeholder_text);
                protoAdapter3.encodeWithTag(writer, 2, value.subtitle);
                protoAdapter3.encodeWithTag(writer, 1, value.title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClabeEntryBlocker(String str, String str2, String str3, String str4, String str5, String str6, BlockerAction blockerAction, BlockerAction blockerAction2, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = str;
        this.subtitle = str2;
        this.placeholder_text = str3;
        this.masked_prefill_clabe_text = str4;
        this.masked_prefill_clabe_prefix = str5;
        this.masked_prefill_clabe_token = str6;
        this.primary_action = blockerAction;
        this.secondary_action = blockerAction2;
        this.clabe_bank_mapping = TransactorKt.immutableCopyOf("clabe_bank_mapping", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClabeEntryBlocker)) {
            return false;
        }
        ClabeEntryBlocker clabeEntryBlocker = (ClabeEntryBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), clabeEntryBlocker.unknownFields()) && Intrinsics.areEqual(this.title, clabeEntryBlocker.title) && Intrinsics.areEqual(this.subtitle, clabeEntryBlocker.subtitle) && Intrinsics.areEqual(this.placeholder_text, clabeEntryBlocker.placeholder_text) && Intrinsics.areEqual(this.masked_prefill_clabe_text, clabeEntryBlocker.masked_prefill_clabe_text) && Intrinsics.areEqual(this.masked_prefill_clabe_prefix, clabeEntryBlocker.masked_prefill_clabe_prefix) && Intrinsics.areEqual(this.masked_prefill_clabe_token, clabeEntryBlocker.masked_prefill_clabe_token) && Intrinsics.areEqual(this.primary_action, clabeEntryBlocker.primary_action) && Intrinsics.areEqual(this.secondary_action, clabeEntryBlocker.secondary_action) && Intrinsics.areEqual(this.clabe_bank_mapping, clabeEntryBlocker.clabe_bank_mapping);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subtitle;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.placeholder_text;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.masked_prefill_clabe_text;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.masked_prefill_clabe_prefix;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.masked_prefill_clabe_token;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37;
        BlockerAction blockerAction = this.primary_action;
        int hashCode8 = (hashCode7 + (blockerAction != null ? blockerAction.hashCode() : 0)) * 37;
        BlockerAction blockerAction2 = this.secondary_action;
        int hashCode9 = this.clabe_bank_mapping.hashCode() + ((hashCode8 + (blockerAction2 != null ? blockerAction2.hashCode() : 0)) * 37);
        this.hashCode = hashCode9;
        return hashCode9;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.subtitle = this.subtitle;
        builder.placeholder_text = this.placeholder_text;
        builder.masked_prefill_clabe_text = this.masked_prefill_clabe_text;
        builder.masked_prefill_clabe_prefix = this.masked_prefill_clabe_prefix;
        builder.masked_prefill_clabe_token = this.masked_prefill_clabe_token;
        builder.primary_action = this.primary_action;
        builder.secondary_action = this.secondary_action;
        builder.clabe_bank_mapping = this.clabe_bank_mapping;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.subtitle;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
        }
        String str3 = this.placeholder_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "placeholder_text=", arrayList);
        }
        String str4 = this.masked_prefill_clabe_text;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "masked_prefill_clabe_text=", arrayList);
        }
        String str5 = this.masked_prefill_clabe_prefix;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "masked_prefill_clabe_prefix=", arrayList);
        }
        String str6 = this.masked_prefill_clabe_token;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "masked_prefill_clabe_token=", arrayList);
        }
        BlockerAction blockerAction = this.primary_action;
        if (blockerAction != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("primary_action=", blockerAction, arrayList);
        }
        BlockerAction blockerAction2 = this.secondary_action;
        if (blockerAction2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("secondary_action=", blockerAction2, arrayList);
        }
        if (!this.clabe_bank_mapping.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("clabe_bank_mapping=", arrayList, this.clabe_bank_mapping);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClabeEntryBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0004H\u0016J$\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/api/ClabeEntryBlocker$ClabeBankMapping;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/ClabeEntryBlocker$ClabeBankMapping$Builder;", "clabe_prefix", "", "bank_name", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class ClabeBankMapping extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ClabeBankMapping> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, schemaIndex = 1, tag = 2)
        public final String bank_name;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REQUIRED, schemaIndex = 0, tag = 1)
        public final String clabe_prefix;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/api/ClabeEntryBlocker$ClabeBankMapping$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/ClabeEntryBlocker$ClabeBankMapping;", "<init>", "()V", "clabe_prefix", "", "bank_name", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String bank_name;
            public String clabe_prefix;

            public final Builder bank_name(String bank_name) {
                bank_name.getClass();
                this.bank_name = bank_name;
                return this;
            }

            @Override // com.squareup.wire.Message.Builder
            public ClabeBankMapping build() {
                String str = this.clabe_prefix;
                if (str == null) {
                    TransactorKt.missingRequiredFields(str, "clabe_prefix");
                    throw null;
                }
                String str2 = this.bank_name;
                if (str2 != null) {
                    return new ClabeBankMapping(str, str2, buildUnknownFields());
                }
                TransactorKt.missingRequiredFields(str2, "bank_name");
                throw null;
            }

            public final Builder clabe_prefix(String clabe_prefix) {
                clabe_prefix.getClass();
                this.clabe_prefix = clabe_prefix;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ClabeBankMapping.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.ClabeEntryBlocker$ClabeBankMapping$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public ClabeEntryBlocker.ClabeBankMapping decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            break;
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                    ByteString endMessageAndGetUnknownFields = reader.endMessageAndGetUnknownFields(beginMessage);
                    String str = (String) obj;
                    if (str == null) {
                        TransactorKt.missingRequiredFields(obj, "clabe_prefix");
                        throw null;
                    }
                    String str2 = (String) obj2;
                    if (str2 != null) {
                        return new ClabeEntryBlocker.ClabeBankMapping(str, str2, endMessageAndGetUnknownFields);
                    }
                    TransactorKt.missingRequiredFields(obj2, "bank_name");
                    throw null;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ClabeEntryBlocker.ClabeBankMapping value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.clabe_prefix);
                    protoAdapter2.encodeWithTag(writer, 2, value.bank_name);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ClabeEntryBlocker.ClabeBankMapping value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(2, value.bank_name) + protoAdapter2.encodedSizeWithTag(1, value.clabe_prefix) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ClabeEntryBlocker.ClabeBankMapping redact(ClabeEntryBlocker.ClabeBankMapping value) {
                    value.getClass();
                    return ClabeEntryBlocker.ClabeBankMapping.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ClabeEntryBlocker.ClabeBankMapping value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.bank_name);
                    protoAdapter2.encodeWithTag(writer, 1, value.clabe_prefix);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClabeBankMapping(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            str.getClass();
            str2.getClass();
            byteString.getClass();
            this.clabe_prefix = str;
            this.bank_name = str2;
        }

        public static /* synthetic */ ClabeBankMapping copy$default(ClabeBankMapping clabeBankMapping, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = clabeBankMapping.clabe_prefix;
            }
            if ((i & 2) != 0) {
                str2 = clabeBankMapping.bank_name;
            }
            if ((i & 4) != 0) {
                byteString = clabeBankMapping.unknownFields();
            }
            return clabeBankMapping.copy(str, str2, byteString);
        }

        public final ClabeBankMapping copy(String clabe_prefix, String bank_name, ByteString unknownFields) {
            clabe_prefix.getClass();
            bank_name.getClass();
            unknownFields.getClass();
            return new ClabeBankMapping(clabe_prefix, bank_name, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ClabeBankMapping)) {
                return false;
            }
            ClabeBankMapping clabeBankMapping = (ClabeBankMapping) other;
            return Intrinsics.areEqual(unknownFields(), clabeBankMapping.unknownFields()) && Intrinsics.areEqual(this.clabe_prefix, clabeBankMapping.clabe_prefix) && Intrinsics.areEqual(this.bank_name, clabeBankMapping.bank_name);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.bank_name.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.clabe_prefix);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.clabe_prefix = this.clabe_prefix;
            builder.bank_name = this.bank_name;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            BalanceFeedKt$$ExternalSyntheticOutline0.m(this.clabe_prefix, "clabe_prefix=", arrayList);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(this.bank_name, "bank_name=", arrayList);
            return CollectionsKt.joinToString$default(arrayList, ", ", "ClabeBankMapping{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/ClabeEntryBlocker$ClabeBankMapping$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/ClabeEntryBlocker$ClabeBankMapping$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/ClabeEntryBlocker$ClabeBankMapping;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/ClabeEntryBlocker$ClabeBankMapping;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ ClabeBankMapping build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public /* synthetic */ ClabeBankMapping(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/ClabeEntryBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/ClabeEntryBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/ClabeEntryBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/ClabeEntryBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ ClabeEntryBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
