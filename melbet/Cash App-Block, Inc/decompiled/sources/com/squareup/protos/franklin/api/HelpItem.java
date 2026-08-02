package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.protos.franklin.api.HelpItem;
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
import kotlin.Deprecated;
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
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u0019\u001bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0005R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u0012\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0005\u0012\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0005R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0005R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/squareup/protos/franklin/api/HelpItem;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/HelpItem$Builder;", "", "text", "Ljava/lang/String;", "Lcom/squareup/protos/cash/localization/LocalizableString;", "localized_text", "Lcom/squareup/protos/cash/localization/LocalizableString;", "Lcom/squareup/protos/franklin/api/HelpItem$Action;", "action", "Lcom/squareup/protos/franklin/api/HelpItem$Action;", "url", "select_option_action", "confirm_dialog_text", "support_node_token", "getSupport_node_token$annotations", "()V", "client_scenario", "getClient_scenario$annotations", "message_title", "message_text", "Lcom/squareup/protos/franklin/api/BlockerAction;", "blocker_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "Companion", "Builder", "Action", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HelpItem extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<HelpItem> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.franklin.api.HelpItem$Action#ADAPTER", schemaIndex = 2, tag = 2)
    public final Action action;

    @WireField(adapter = "com.squareup.protos.franklin.api.BlockerAction#ADAPTER", schemaIndex = 10, tag = 10)
    public final BlockerAction blocker_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 7)
    public final String client_scenario;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 5)
    public final String confirm_dialog_text;

    @WireField(adapter = "com.squareup.protos.cash.localization.LocalizableString#ADAPTER", schemaIndex = 1, tag = 11)
    public final LocalizableString localized_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 9, tag = 9)
    public final String message_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 8)
    public final String message_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 4)
    public final String select_option_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 6)
    public final String support_node_token;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 3, tag = 3)
    public final String url;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\b\u0010\u0014\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/api/HelpItem$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/HelpItem;", "<init>", "()V", "text", "", "localized_text", "Lcom/squareup/protos/cash/localization/LocalizableString;", "action", "Lcom/squareup/protos/franklin/api/HelpItem$Action;", "url", "select_option_action", "confirm_dialog_text", "support_node_token", "client_scenario", "message_title", "message_text", "blocker_action", "Lcom/squareup/protos/franklin/api/BlockerAction;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public Action action;
        public BlockerAction blocker_action;
        public String client_scenario;
        public String confirm_dialog_text;
        public LocalizableString localized_text;
        public String message_text;
        public String message_title;
        public String select_option_action;
        public String support_node_token;
        public String text;
        public String url;

        public final Builder action(Action action) {
            this.action = action;
            return this;
        }

        public final Builder blocker_action(BlockerAction blocker_action) {
            this.blocker_action = blocker_action;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public HelpItem build() {
            return new HelpItem(this.text, this.localized_text, this.action, this.url, this.select_option_action, this.confirm_dialog_text, this.support_node_token, this.client_scenario, this.message_title, this.message_text, this.blocker_action, buildUnknownFields());
        }

        @Deprecated
        public final Builder client_scenario(String client_scenario) {
            this.client_scenario = client_scenario;
            return this;
        }

        public final Builder confirm_dialog_text(String confirm_dialog_text) {
            this.confirm_dialog_text = confirm_dialog_text;
            return this;
        }

        public final Builder localized_text(LocalizableString localized_text) {
            this.localized_text = localized_text;
            return this;
        }

        public final Builder message_text(String message_text) {
            this.message_text = message_text;
            return this;
        }

        public final Builder message_title(String message_title) {
            this.message_title = message_title;
            return this;
        }

        public final Builder select_option_action(String select_option_action) {
            this.select_option_action = select_option_action;
            return this;
        }

        @Deprecated
        public final Builder support_node_token(String support_node_token) {
            this.support_node_token = support_node_token;
            return this;
        }

        public final Builder text(String text) {
            this.text = text;
            return this;
        }

        public final Builder url(String url) {
            this.url = url;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(HelpItem.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.HelpItem$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public HelpItem decode(ProtoReader reader) {
                Object obj;
                Object obj2;
                Object obj3;
                reader.getClass();
                long beginMessage = reader.beginMessage();
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                Object obj10 = null;
                Object obj11 = null;
                Object obj12 = null;
                Object obj13 = null;
                Object obj14 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new HelpItem((String) obj4, (LocalizableString) obj5, (HelpItem.Action) obj6, (String) obj7, (String) obj8, (String) obj9, (String) obj10, (String) obj11, (String) obj12, (String) obj13, (BlockerAction) obj14, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 2:
                            try {
                                obj6 = HelpItem.Action.ADAPTER.decode(reader);
                                continue;
                            } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                obj = obj4;
                                obj2 = obj5;
                                obj3 = obj6;
                                reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                break;
                            }
                        case 3:
                            obj7 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 4:
                            obj8 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 5:
                            obj9 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 6:
                            obj10 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 7:
                            obj11 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 8:
                            obj12 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 9:
                            obj13 = ProtoAdapter.STRING.decode(reader);
                            continue;
                        case 10:
                            obj14 = TransactorKt.decodeMessageOrMerge(BlockerAction.ADAPTER, reader, obj14);
                            continue;
                        case 11:
                            obj5 = TransactorKt.decodeMessageOrMerge(LocalizableString.ADAPTER, reader, obj5);
                            continue;
                        default:
                            reader.readUnknownField(nextTag);
                            obj = obj4;
                            obj2 = obj5;
                            obj3 = obj6;
                            break;
                    }
                    obj4 = obj;
                    obj5 = obj2;
                    obj6 = obj3;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, HelpItem value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.text);
                LocalizableString.ADAPTER.encodeWithTag(writer, 11, value.localized_text);
                HelpItem.Action.ADAPTER.encodeWithTag(writer, 2, value.action);
                protoAdapter2.encodeWithTag(writer, 3, value.url);
                protoAdapter2.encodeWithTag(writer, 4, value.select_option_action);
                protoAdapter2.encodeWithTag(writer, 5, value.confirm_dialog_text);
                protoAdapter2.encodeWithTag(writer, 6, value.support_node_token);
                protoAdapter2.encodeWithTag(writer, 7, value.client_scenario);
                protoAdapter2.encodeWithTag(writer, 8, value.message_title);
                protoAdapter2.encodeWithTag(writer, 9, value.message_text);
                BlockerAction.ADAPTER.encodeWithTag(writer, 10, value.blocker_action);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(HelpItem value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return BlockerAction.ADAPTER.encodedSizeWithTag(10, value.blocker_action) + protoAdapter2.encodedSizeWithTag(9, value.message_text) + protoAdapter2.encodedSizeWithTag(8, value.message_title) + protoAdapter2.encodedSizeWithTag(7, value.client_scenario) + protoAdapter2.encodedSizeWithTag(6, value.support_node_token) + protoAdapter2.encodedSizeWithTag(5, value.confirm_dialog_text) + protoAdapter2.encodedSizeWithTag(4, value.select_option_action) + protoAdapter2.encodedSizeWithTag(3, value.url) + HelpItem.Action.ADAPTER.encodedSizeWithTag(2, value.action) + LocalizableString.ADAPTER.encodedSizeWithTag(11, value.localized_text) + protoAdapter2.encodedSizeWithTag(1, value.text) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public HelpItem redact(HelpItem value) {
                value.getClass();
                LocalizableString localizableString = value.localized_text;
                LocalizableString localizableString2 = localizableString != null ? (LocalizableString) LocalizableString.ADAPTER.redact(localizableString) : null;
                BlockerAction blockerAction = value.blocker_action;
                return HelpItem.copy$default(value, localizableString2, blockerAction != null ? (BlockerAction) BlockerAction.ADAPTER.redact(blockerAction) : null, ByteString.EMPTY, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_HALFTONING_INFO);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, HelpItem value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                BlockerAction.ADAPTER.encodeWithTag(writer, 10, value.blocker_action);
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 9, value.message_text);
                protoAdapter2.encodeWithTag(writer, 8, value.message_title);
                protoAdapter2.encodeWithTag(writer, 7, value.client_scenario);
                protoAdapter2.encodeWithTag(writer, 6, value.support_node_token);
                protoAdapter2.encodeWithTag(writer, 5, value.confirm_dialog_text);
                protoAdapter2.encodeWithTag(writer, 4, value.select_option_action);
                protoAdapter2.encodeWithTag(writer, 3, value.url);
                HelpItem.Action.ADAPTER.encodeWithTag(writer, 2, value.action);
                LocalizableString.ADAPTER.encodeWithTag(writer, 11, value.localized_text);
                protoAdapter2.encodeWithTag(writer, 1, value.text);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    public /* synthetic */ HelpItem(String str, Action action, String str2, BlockerAction blockerAction, int i) {
        this(str, null, action, null, null, null, null, (i & 128) != 0 ? null : str2, null, null, (i & 1024) != 0 ? null : blockerAction, ByteString.EMPTY);
    }

    public static HelpItem copy$default(HelpItem helpItem, LocalizableString localizableString, BlockerAction blockerAction, ByteString byteString, int i) {
        String str = helpItem.text;
        if ((i & 2) != 0) {
            localizableString = helpItem.localized_text;
        }
        LocalizableString localizableString2 = localizableString;
        Action action = helpItem.action;
        String str2 = (i & 8) != 0 ? helpItem.url : null;
        String str3 = helpItem.select_option_action;
        String str4 = (i & 32) != 0 ? helpItem.confirm_dialog_text : null;
        String str5 = helpItem.support_node_token;
        String str6 = helpItem.client_scenario;
        String str7 = helpItem.message_title;
        String str8 = helpItem.message_text;
        BlockerAction blockerAction2 = (i & 1024) != 0 ? helpItem.blocker_action : blockerAction;
        ByteString unknownFields = (i & 2048) != 0 ? helpItem.unknownFields() : byteString;
        helpItem.getClass();
        unknownFields.getClass();
        return new HelpItem(str, localizableString2, action, str2, str3, str4, str5, str6, str7, str8, blockerAction2, unknownFields);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HelpItem)) {
            return false;
        }
        HelpItem helpItem = (HelpItem) obj;
        return Intrinsics.areEqual(unknownFields(), helpItem.unknownFields()) && Intrinsics.areEqual(this.text, helpItem.text) && Intrinsics.areEqual(this.localized_text, helpItem.localized_text) && this.action == helpItem.action && Intrinsics.areEqual(this.url, helpItem.url) && Intrinsics.areEqual(this.select_option_action, helpItem.select_option_action) && Intrinsics.areEqual(this.confirm_dialog_text, helpItem.confirm_dialog_text) && Intrinsics.areEqual(this.support_node_token, helpItem.support_node_token) && Intrinsics.areEqual(this.client_scenario, helpItem.client_scenario) && Intrinsics.areEqual(this.message_title, helpItem.message_title) && Intrinsics.areEqual(this.message_text, helpItem.message_text) && Intrinsics.areEqual(this.blocker_action, helpItem.blocker_action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LocalizableString localizableString = this.localized_text;
        int hashCode3 = (hashCode2 + (localizableString != null ? localizableString.hashCode() : 0)) * 37;
        Action action = this.action;
        int hashCode4 = (hashCode3 + (action != null ? action.hashCode() : 0)) * 37;
        String str2 = this.url;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.select_option_action;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.confirm_dialog_text;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.support_node_token;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.client_scenario;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.message_title;
        int hashCode10 = (hashCode9 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.message_text;
        int hashCode11 = (hashCode10 + (str8 != null ? str8.hashCode() : 0)) * 37;
        BlockerAction blockerAction = this.blocker_action;
        int hashCode12 = hashCode11 + (blockerAction != null ? blockerAction.hashCode() : 0);
        this.hashCode = hashCode12;
        return hashCode12;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.text = this.text;
        builder.localized_text = this.localized_text;
        builder.action = this.action;
        builder.url = this.url;
        builder.select_option_action = this.select_option_action;
        builder.confirm_dialog_text = this.confirm_dialog_text;
        builder.support_node_token = this.support_node_token;
        builder.client_scenario = this.client_scenario;
        builder.message_title = this.message_title;
        builder.message_text = this.message_text;
        builder.blocker_action = this.blocker_action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "text=", arrayList);
        }
        LocalizableString localizableString = this.localized_text;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localized_text=", localizableString, arrayList);
        }
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        if (this.url != null) {
            arrayList.add("url=██");
        }
        String str2 = this.select_option_action;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "select_option_action=", arrayList);
        }
        String str3 = this.confirm_dialog_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "confirm_dialog_text=", arrayList);
        }
        String str4 = this.support_node_token;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "support_node_token=", arrayList);
        }
        String str5 = this.client_scenario;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "client_scenario=", arrayList);
        }
        String str6 = this.message_title;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "message_title=", arrayList);
        }
        String str7 = this.message_text;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "message_text=", arrayList);
        }
        BlockerAction blockerAction = this.blocker_action;
        if (blockerAction != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("blocker_action=", blockerAction, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "HelpItem{", "}", 0, null, null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/HelpItem$Action;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "GET_SCENARIO_PLAN", "RESOLVE_MERGE_FALSE", "SKIP_BLOCKER", "OPEN_URL", "SELECT_OPTION", "SIGN_OUT", "START_SUPPORT_FLOW", "START_CLIENT_SCENARIO", "SHOW_MESSAGE", "BLOCKER_ACTION", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Action implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final ProtoAdapter ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;

        @Deprecated
        public static final Action GET_SCENARIO_PLAN = new Action("GET_SCENARIO_PLAN", 0, 1);

        @Deprecated
        public static final Action RESOLVE_MERGE_FALSE = new Action("RESOLVE_MERGE_FALSE", 1, 2);

        @Deprecated
        public static final Action SKIP_BLOCKER = new Action("SKIP_BLOCKER", 2, 3);

        @Deprecated
        public static final Action OPEN_URL = new Action("OPEN_URL", 3, 4);
        public static final Action SELECT_OPTION = new Action("SELECT_OPTION", 4, 5);

        @Deprecated
        public static final Action SIGN_OUT = new Action("SIGN_OUT", 5, 6);

        @Deprecated
        public static final Action START_SUPPORT_FLOW = new Action("START_SUPPORT_FLOW", 6, 7);

        @Deprecated
        public static final Action START_CLIENT_SCENARIO = new Action("START_CLIENT_SCENARIO", 7, 8);

        @Deprecated
        public static final Action SHOW_MESSAGE = new Action("SHOW_MESSAGE", 8, 9);
        public static final Action BLOCKER_ACTION = new Action("BLOCKER_ACTION", 9, 10);

        private static final /* synthetic */ Action[] $values() {
            return new Action[]{GET_SCENARIO_PLAN, RESOLVE_MERGE_FALSE, SKIP_BLOCKER, OPEN_URL, SELECT_OPTION, SIGN_OUT, START_SUPPORT_FLOW, START_CLIENT_SCENARIO, SHOW_MESSAGE, BLOCKER_ACTION};
        }

        static {
            Action[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Tags.enumEntries($values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(Action.class);
            final Syntax syntax = Syntax.PROTO_2;
            ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.HelpItem$Action$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public HelpItem.Action fromValue(int value) {
                    return HelpItem.Action.INSTANCE.fromValue(value);
                }
            };
        }

        private Action(String str, int i, int i2) {
            this.value = i2;
        }

        public static final Action fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/HelpItem$Action$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/HelpItem$Action;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Action fromValue(int value) {
                switch (value) {
                    case 1:
                        return Action.GET_SCENARIO_PLAN;
                    case 2:
                        return Action.RESOLVE_MERGE_FALSE;
                    case 3:
                        return Action.SKIP_BLOCKER;
                    case 4:
                        return Action.OPEN_URL;
                    case 5:
                        return Action.SELECT_OPTION;
                    case 6:
                        return Action.SIGN_OUT;
                    case 7:
                        return Action.START_SUPPORT_FLOW;
                    case 8:
                        return Action.START_CLIENT_SCENARIO;
                    case 9:
                        return Action.SHOW_MESSAGE;
                    case 10:
                        return Action.BLOCKER_ACTION;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/HelpItem$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/HelpItem$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/HelpItem;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/HelpItem;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ HelpItem build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpItem(String str, LocalizableString localizableString, Action action, String str2, String str3, String str4, String str5, String str6, String str7, String str8, BlockerAction blockerAction, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.text = str;
        this.localized_text = localizableString;
        this.action = action;
        this.url = str2;
        this.select_option_action = str3;
        this.confirm_dialog_text = str4;
        this.support_node_token = str5;
        this.client_scenario = str6;
        this.message_title = str7;
        this.message_text = str8;
        this.blocker_action = blockerAction;
    }
}
