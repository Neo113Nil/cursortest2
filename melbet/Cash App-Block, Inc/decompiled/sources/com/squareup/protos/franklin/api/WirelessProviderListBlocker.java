package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.WirelessProviderListBlocker;
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

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/franklin/api/WirelessProviderListBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/WirelessProviderListBlocker$Builder;", "", "title", "Ljava/lang/String;", "search_hint_text", "empty_state_text", "button_text", "Lcom/squareup/protos/franklin/api/BlockerAction;", "get_help", "Lcom/squareup/protos/franklin/api/BlockerAction;", "", "Lcom/squareup/protos/franklin/api/WirelessProviderListBlocker$WirelessProvider;", "wireless_providers", "Ljava/util/List;", "Companion", "Builder", "WirelessProvider", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WirelessProviderListBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<WirelessProviderListBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String button_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String empty_state_text;

    @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 5, tag = 6)
    public final BlockerAction get_help;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    public final String search_hint_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String title;

    @WireField(adapter = "com.squareup.protos.franklin.api.WirelessProviderListBlocker$WirelessProvider#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 3, tag = 4)
    public final List<WirelessProvider> wireless_providers;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\t\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/franklin/api/WirelessProviderListBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/WirelessProviderListBlocker;", "<init>", "()V", "title", "", "search_hint_text", "empty_state_text", "wireless_providers", "", "Lcom/squareup/protos/franklin/api/WirelessProviderListBlocker$WirelessProvider;", "button_text", "get_help", "Lcom/squareup/protos/franklin/api/BlockerAction;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public String button_text;
        public String empty_state_text;
        public BlockerAction get_help;
        public String search_hint_text;
        public String title;
        public List<WirelessProvider> wireless_providers = EmptyList.INSTANCE;

        @Override // com.squareup.wire.Message.Builder
        public WirelessProviderListBlocker build() {
            return new WirelessProviderListBlocker(this.title, this.search_hint_text, this.empty_state_text, this.wireless_providers, this.button_text, this.get_help, buildUnknownFields());
        }

        public final Builder button_text(String button_text) {
            this.button_text = button_text;
            return this;
        }

        public final Builder empty_state_text(String empty_state_text) {
            this.empty_state_text = empty_state_text;
            return this;
        }

        public final Builder get_help(BlockerAction get_help) {
            this.get_help = get_help;
            return this;
        }

        public final Builder search_hint_text(String search_hint_text) {
            this.search_hint_text = search_hint_text;
            return this;
        }

        public final Builder title(String title) {
            this.title = title;
            return this;
        }

        public final Builder wireless_providers(List<WirelessProvider> wireless_providers) {
            wireless_providers.getClass();
            TransactorKt.checkElementsNotNull(wireless_providers);
            this.wireless_providers = wireless_providers;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(WirelessProviderListBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.WirelessProviderListBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public WirelessProviderListBlocker decode(ProtoReader reader) {
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
                        return new WirelessProviderListBlocker((String) obj, (String) obj2, (String) obj3, m, (String) obj4, (BlockerAction) obj5, reader.endMessageAndGetUnknownFields(beginMessage));
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
                            m.add(WirelessProviderListBlocker.WirelessProvider.ADAPTER.decode(reader));
                            break;
                        case 5:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            break;
                        case 6:
                            obj5 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj5);
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            break;
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, WirelessProviderListBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.title);
                protoAdapter2.encodeWithTag(writer, 2, value.search_hint_text);
                protoAdapter2.encodeWithTag(writer, 3, value.empty_state_text);
                WirelessProviderListBlocker.WirelessProvider.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.wireless_providers);
                protoAdapter2.encodeWithTag(writer, 5, value.button_text);
                BlockerAction.ADAPTER.encodeWithTag(writer, 6, value.get_help);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(WirelessProviderListBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return BlockerAction.ADAPTER.encodedSizeWithTag(6, value.get_help) + protoAdapter2.encodedSizeWithTag(5, value.button_text) + WirelessProviderListBlocker.WirelessProvider.ADAPTER.asRepeated().encodedSizeWithTag(4, value.wireless_providers) + protoAdapter2.encodedSizeWithTag(3, value.empty_state_text) + protoAdapter2.encodedSizeWithTag(2, value.search_hint_text) + protoAdapter2.encodedSizeWithTag(1, value.title) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public WirelessProviderListBlocker redact(WirelessProviderListBlocker value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.wireless_providers, WirelessProviderListBlocker.WirelessProvider.ADAPTER);
                BlockerAction blockerAction = value.get_help;
                BlockerAction blockerAction2 = blockerAction != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.title;
                String str2 = value.search_hint_text;
                String str3 = value.empty_state_text;
                String str4 = value.button_text;
                byteString.getClass();
                return new WirelessProviderListBlocker(str, str2, str3, m1169redactElements, str4, blockerAction2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, WirelessProviderListBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                BlockerAction.ADAPTER.encodeWithTag(writer, 6, value.get_help);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 5, value.button_text);
                WirelessProviderListBlocker.WirelessProvider.ADAPTER.asRepeated().encodeWithTag(writer, 4, value.wireless_providers);
                protoAdapter2.encodeWithTag(writer, 3, value.empty_state_text);
                protoAdapter2.encodeWithTag(writer, 2, value.search_hint_text);
                protoAdapter2.encodeWithTag(writer, 1, value.title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WirelessProviderListBlocker(String str, String str2, String str3, List list, String str4, BlockerAction blockerAction, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = str;
        this.search_hint_text = str2;
        this.empty_state_text = str3;
        this.button_text = str4;
        this.get_help = blockerAction;
        this.wireless_providers = TransactorKt.immutableCopyOf("wireless_providers", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WirelessProviderListBlocker)) {
            return false;
        }
        WirelessProviderListBlocker wirelessProviderListBlocker = (WirelessProviderListBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), wirelessProviderListBlocker.unknownFields()) && Intrinsics.areEqual(this.title, wirelessProviderListBlocker.title) && Intrinsics.areEqual(this.search_hint_text, wirelessProviderListBlocker.search_hint_text) && Intrinsics.areEqual(this.empty_state_text, wirelessProviderListBlocker.empty_state_text) && Intrinsics.areEqual(this.wireless_providers, wirelessProviderListBlocker.wireless_providers) && Intrinsics.areEqual(this.button_text, wirelessProviderListBlocker.button_text) && Intrinsics.areEqual(this.get_help, wirelessProviderListBlocker.get_help);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.search_hint_text;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.empty_state_text;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37, 37, this.wireless_providers);
        String str4 = this.button_text;
        int hashCode4 = (m + (str4 != null ? str4.hashCode() : 0)) * 37;
        BlockerAction blockerAction = this.get_help;
        int hashCode5 = hashCode4 + (blockerAction != null ? blockerAction.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.title = this.title;
        builder.search_hint_text = this.search_hint_text;
        builder.empty_state_text = this.empty_state_text;
        builder.wireless_providers = this.wireless_providers;
        builder.button_text = this.button_text;
        builder.get_help = this.get_help;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.search_hint_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "search_hint_text=", arrayList);
        }
        String str3 = this.empty_state_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "empty_state_text=", arrayList);
        }
        if (!this.wireless_providers.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("wireless_providers=", arrayList, this.wireless_providers);
        }
        String str4 = this.button_text;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "button_text=", arrayList);
        }
        BlockerAction blockerAction = this.get_help;
        if (blockerAction != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("get_help=", blockerAction, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "WirelessProviderListBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0002H\u0016J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0082\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u0096\u0080\u0004J\b\u0010\u0013\u001a\u00020\u0004H\u0016J4\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/squareup/protos/franklin/api/WirelessProviderListBlocker$WirelessProvider;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/WirelessProviderListBlocker$WirelessProvider$Builder;", "id", "", "name", "logo", "Lcom/squareup/protos/cash/ui/Image;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/squareup/protos/cash/ui/Image;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class WirelessProvider extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<WirelessProvider> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String id;

        @WireField(adapter = "com.squareup.protos.cash.ui.Image#ADAPTER", schemaIndex = 2, tag = 3)
        public final Image logo;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String name;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/squareup/protos/franklin/api/WirelessProviderListBlocker$WirelessProvider$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/WirelessProviderListBlocker$WirelessProvider;", "<init>", "()V", "id", "", "name", "logo", "Lcom/squareup/protos/cash/ui/Image;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String id;
            public Image logo;
            public String name;

            @Override // com.squareup.wire.Message.Builder
            public WirelessProvider build() {
                return new WirelessProvider(this.id, this.name, this.logo, buildUnknownFields());
            }

            public final Builder id(String id) {
                this.id = id;
                return this;
            }

            public final Builder logo(Image logo) {
                this.logo = logo;
                return this;
            }

            public final Builder name(String name) {
                this.name = name;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(WirelessProvider.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.WirelessProviderListBlocker$WirelessProvider$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public WirelessProviderListBlocker.WirelessProvider decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    Object obj3 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new WirelessProviderListBlocker.WirelessProvider((String) obj, (String) obj2, (Image) obj3, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag == 2) {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 3) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj3 = TransactorKt.decodeMessageOrMerge(Image.ADAPTER, reader, obj3);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, WirelessProviderListBlocker.WirelessProvider value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.id);
                    protoAdapter2.encodeWithTag(writer, 2, value.name);
                    Image.ADAPTER.encodeWithTag(writer, 3, value.logo);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(WirelessProviderListBlocker.WirelessProvider value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return Image.ADAPTER.encodedSizeWithTag(3, value.logo) + protoAdapter2.encodedSizeWithTag(2, value.name) + protoAdapter2.encodedSizeWithTag(1, value.id) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public WirelessProviderListBlocker.WirelessProvider redact(WirelessProviderListBlocker.WirelessProvider value) {
                    value.getClass();
                    Image image = value.logo;
                    return WirelessProviderListBlocker.WirelessProvider.copy$default(value, null, null, image != null ? (Image) Image.ADAPTER.redact(image) : null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, WirelessProviderListBlocker.WirelessProvider value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    Image.ADAPTER.encodeWithTag(writer, 3, value.logo);
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.name);
                    protoAdapter2.encodeWithTag(writer, 1, value.id);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ WirelessProvider(String str, String str2, Image image, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : image, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ WirelessProvider copy$default(WirelessProvider wirelessProvider, String str, String str2, Image image, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = wirelessProvider.id;
            }
            if ((i & 2) != 0) {
                str2 = wirelessProvider.name;
            }
            if ((i & 4) != 0) {
                image = wirelessProvider.logo;
            }
            if ((i & 8) != 0) {
                byteString = wirelessProvider.unknownFields();
            }
            return wirelessProvider.copy(str, str2, image, byteString);
        }

        public final WirelessProvider copy(String id, String name, Image logo, ByteString unknownFields) {
            unknownFields.getClass();
            return new WirelessProvider(id, name, logo, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof WirelessProvider)) {
                return false;
            }
            WirelessProvider wirelessProvider = (WirelessProvider) other;
            return Intrinsics.areEqual(unknownFields(), wirelessProvider.unknownFields()) && Intrinsics.areEqual(this.id, wirelessProvider.id) && Intrinsics.areEqual(this.name, wirelessProvider.name) && Intrinsics.areEqual(this.logo, wirelessProvider.logo);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.id;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            Image image = this.logo;
            int hashCode4 = hashCode3 + (image != null ? image.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.id = this.id;
            builder.name = this.name;
            builder.logo = this.logo;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.id;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "id=", arrayList);
            }
            String str2 = this.name;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "name=", arrayList);
            }
            Image image = this.logo;
            if (image != null) {
                SizeMode$EnumUnboxingLocalUtility.m("logo=", image, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "WirelessProvider{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/WirelessProviderListBlocker$WirelessProvider$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/WirelessProviderListBlocker$WirelessProvider$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/WirelessProviderListBlocker$WirelessProvider;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/WirelessProviderListBlocker$WirelessProvider;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ WirelessProvider build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public WirelessProvider() {
            this(null, null, null, null, 15, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WirelessProvider(String str, String str2, Image image, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.id = str;
            this.name = str2;
            this.logo = image;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/WirelessProviderListBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/WirelessProviderListBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/WirelessProviderListBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/WirelessProviderListBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ WirelessProviderListBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
