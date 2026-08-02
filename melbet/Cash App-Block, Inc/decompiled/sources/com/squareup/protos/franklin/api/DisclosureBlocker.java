package com.squareup.protos.franklin.api;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.DisclosureBlocker;
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

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001a\u0019\u001bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0005R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u0012\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0005\u0012\u0004\b\r\u0010\u000bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0005\u0012\u0004\b\u000f\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0005R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0005R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/squareup/protos/franklin/api/DisclosureBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/DisclosureBlocker$Builder;", "", "headline_text", "Ljava/lang/String;", "description_text", "scroll_button_text", "accept_button_text", "more_info_panel_collapsed_title", "getMore_info_panel_collapsed_title$annotations", "()V", "more_info_panel_expanded_title", "getMore_info_panel_expanded_title$annotations", "more_info_panel_footer_text", "getMore_info_panel_footer_text$annotations", "footer_text", "cancel_dialog_text", "cancel_dialog_cancel_text", "cancel_dialog_confirm_text", "", "Lcom/squareup/protos/franklin/api/DisclosureBlocker$LineItem;", "line_items", "Ljava/util/List;", "more_info_panel_line_items", "Companion", "Builder", "LineItem", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DisclosureBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<DisclosureBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    public final String accept_button_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 11, tag = 12)
    public final String cancel_dialog_cancel_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 12, tag = 13)
    public final String cancel_dialog_confirm_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 10, tag = 11)
    public final String cancel_dialog_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    public final String description_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 9, tag = 10)
    public final String footer_text;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", redacted = true, schemaIndex = 0, tag = 1)
    public final String headline_text;

    @WireField(adapter = "com.squareup.protos.franklin.api.DisclosureBlocker$LineItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    public final List<LineItem> line_items;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    public final String more_info_panel_collapsed_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    public final String more_info_panel_expanded_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 9)
    public final String more_info_panel_footer_text;

    @WireField(adapter = "com.squareup.protos.franklin.api.DisclosureBlocker$LineItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 7, tag = 8)
    public final List<LineItem> more_info_panel_line_items;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    public final String scroll_button_text;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0007J\u0014\u0010\u000f\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0012\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0012\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0013\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/squareup/protos/franklin/api/DisclosureBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/DisclosureBlocker;", "<init>", "()V", "headline_text", "", "line_items", "", "Lcom/squareup/protos/franklin/api/DisclosureBlocker$LineItem;", "description_text", "scroll_button_text", "accept_button_text", "more_info_panel_collapsed_title", "more_info_panel_expanded_title", "more_info_panel_line_items", "more_info_panel_footer_text", "footer_text", "cancel_dialog_text", "cancel_dialog_cancel_text", "cancel_dialog_confirm_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder {
        public String accept_button_text;
        public String cancel_dialog_cancel_text;
        public String cancel_dialog_confirm_text;
        public String cancel_dialog_text;
        public String description_text;
        public String footer_text;
        public String headline_text;
        public List<LineItem> line_items;
        public String more_info_panel_collapsed_title;
        public String more_info_panel_expanded_title;
        public String more_info_panel_footer_text;
        public List<LineItem> more_info_panel_line_items;
        public String scroll_button_text;

        public Builder() {
            EmptyList emptyList = EmptyList.INSTANCE;
            this.line_items = emptyList;
            this.more_info_panel_line_items = emptyList;
        }

        public final Builder accept_button_text(String accept_button_text) {
            this.accept_button_text = accept_button_text;
            return this;
        }

        @Override // com.squareup.wire.Message.Builder
        public DisclosureBlocker build() {
            return new DisclosureBlocker(this.headline_text, this.line_items, this.description_text, this.scroll_button_text, this.accept_button_text, this.more_info_panel_collapsed_title, this.more_info_panel_expanded_title, this.more_info_panel_line_items, this.more_info_panel_footer_text, this.footer_text, this.cancel_dialog_text, this.cancel_dialog_cancel_text, this.cancel_dialog_confirm_text, buildUnknownFields());
        }

        public final Builder cancel_dialog_cancel_text(String cancel_dialog_cancel_text) {
            this.cancel_dialog_cancel_text = cancel_dialog_cancel_text;
            return this;
        }

        public final Builder cancel_dialog_confirm_text(String cancel_dialog_confirm_text) {
            this.cancel_dialog_confirm_text = cancel_dialog_confirm_text;
            return this;
        }

        public final Builder cancel_dialog_text(String cancel_dialog_text) {
            this.cancel_dialog_text = cancel_dialog_text;
            return this;
        }

        public final Builder description_text(String description_text) {
            this.description_text = description_text;
            return this;
        }

        public final Builder footer_text(String footer_text) {
            this.footer_text = footer_text;
            return this;
        }

        public final Builder headline_text(String headline_text) {
            this.headline_text = headline_text;
            return this;
        }

        public final Builder line_items(List<LineItem> line_items) {
            line_items.getClass();
            TransactorKt.checkElementsNotNull(line_items);
            this.line_items = line_items;
            return this;
        }

        @Deprecated
        public final Builder more_info_panel_collapsed_title(String more_info_panel_collapsed_title) {
            this.more_info_panel_collapsed_title = more_info_panel_collapsed_title;
            return this;
        }

        @Deprecated
        public final Builder more_info_panel_expanded_title(String more_info_panel_expanded_title) {
            this.more_info_panel_expanded_title = more_info_panel_expanded_title;
            return this;
        }

        @Deprecated
        public final Builder more_info_panel_footer_text(String more_info_panel_footer_text) {
            this.more_info_panel_footer_text = more_info_panel_footer_text;
            return this;
        }

        public final Builder more_info_panel_line_items(List<LineItem> more_info_panel_line_items) {
            more_info_panel_line_items.getClass();
            TransactorKt.checkElementsNotNull(more_info_panel_line_items);
            this.more_info_panel_line_items = more_info_panel_line_items;
            return this;
        }

        public final Builder scroll_button_text(String scroll_button_text) {
            this.scroll_button_text = scroll_button_text;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(DisclosureBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.DisclosureBlocker$Companion$ADAPTER$1
            /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0026. Please report as an issue. */
            @Override // com.squareup.wire.ProtoAdapter
            public DisclosureBlocker decode(ProtoReader reader) {
                Object obj;
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                ArrayList arrayList = new ArrayList();
                long beginMessage = reader.beginMessage();
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                Object obj5 = null;
                Object obj6 = null;
                Object obj7 = null;
                Object obj8 = null;
                Object obj9 = null;
                Object obj10 = null;
                Object obj11 = null;
                Object obj12 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    Object obj13 = obj3;
                    if (nextTag == -1) {
                        return new DisclosureBlocker((String) obj2, m, (String) obj13, (String) obj4, (String) obj5, (String) obj6, (String) obj7, arrayList, (String) obj8, (String) obj9, (String) obj10, (String) obj11, (String) obj12, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    switch (nextTag) {
                        case 1:
                            obj = ProtoAdapter.STRING.decode(reader);
                            obj3 = obj13;
                            break;
                        case 2:
                            m.add(DisclosureBlocker.LineItem.ADAPTER.decode(reader));
                            obj = obj2;
                            obj3 = obj13;
                            break;
                        case 3:
                            obj3 = ProtoAdapter.STRING.decode(reader);
                            obj = obj2;
                            break;
                        case 4:
                            obj4 = ProtoAdapter.STRING.decode(reader);
                            obj3 = obj13;
                            obj = obj2;
                            break;
                        case 5:
                            obj5 = ProtoAdapter.STRING.decode(reader);
                            obj3 = obj13;
                            obj = obj2;
                            break;
                        case 6:
                            obj6 = ProtoAdapter.STRING.decode(reader);
                            obj3 = obj13;
                            obj = obj2;
                            break;
                        case 7:
                            obj7 = ProtoAdapter.STRING.decode(reader);
                            obj3 = obj13;
                            obj = obj2;
                            break;
                        case 8:
                            arrayList.add(DisclosureBlocker.LineItem.ADAPTER.decode(reader));
                            obj = obj2;
                            obj3 = obj13;
                            break;
                        case 9:
                            obj8 = ProtoAdapter.STRING.decode(reader);
                            obj3 = obj13;
                            obj = obj2;
                            break;
                        case 10:
                            obj9 = ProtoAdapter.STRING.decode(reader);
                            obj3 = obj13;
                            obj = obj2;
                            break;
                        case 11:
                            obj10 = ProtoAdapter.STRING.decode(reader);
                            obj3 = obj13;
                            obj = obj2;
                            break;
                        case 12:
                            obj11 = ProtoAdapter.STRING.decode(reader);
                            obj3 = obj13;
                            obj = obj2;
                            break;
                        case 13:
                            obj12 = ProtoAdapter.STRING.decode(reader);
                            obj3 = obj13;
                            obj = obj2;
                            break;
                        default:
                            reader.readUnknownField(nextTag);
                            obj = obj2;
                            obj3 = obj13;
                            break;
                    }
                    obj2 = obj;
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DisclosureBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 1, value.headline_text);
                ProtoAdapter protoAdapter3 = DisclosureBlocker.LineItem.ADAPTER;
                protoAdapter3.asRepeated().encodeWithTag(writer, 2, value.line_items);
                protoAdapter2.encodeWithTag(writer, 3, value.description_text);
                protoAdapter2.encodeWithTag(writer, 4, value.scroll_button_text);
                protoAdapter2.encodeWithTag(writer, 5, value.accept_button_text);
                protoAdapter2.encodeWithTag(writer, 6, value.more_info_panel_collapsed_title);
                protoAdapter2.encodeWithTag(writer, 7, value.more_info_panel_expanded_title);
                protoAdapter3.asRepeated().encodeWithTag(writer, 8, value.more_info_panel_line_items);
                protoAdapter2.encodeWithTag(writer, 9, value.more_info_panel_footer_text);
                protoAdapter2.encodeWithTag(writer, 10, value.footer_text);
                protoAdapter2.encodeWithTag(writer, 11, value.cancel_dialog_text);
                protoAdapter2.encodeWithTag(writer, 12, value.cancel_dialog_cancel_text);
                protoAdapter2.encodeWithTag(writer, 13, value.cancel_dialog_confirm_text);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DisclosureBlocker value) {
                value.getClass();
                int size$okio = value.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(1, value.headline_text) + size$okio;
                ProtoAdapter protoAdapter3 = DisclosureBlocker.LineItem.ADAPTER;
                return protoAdapter2.encodedSizeWithTag(13, value.cancel_dialog_confirm_text) + protoAdapter2.encodedSizeWithTag(12, value.cancel_dialog_cancel_text) + protoAdapter2.encodedSizeWithTag(11, value.cancel_dialog_text) + protoAdapter2.encodedSizeWithTag(10, value.footer_text) + protoAdapter2.encodedSizeWithTag(9, value.more_info_panel_footer_text) + protoAdapter3.asRepeated().encodedSizeWithTag(8, value.more_info_panel_line_items) + protoAdapter2.encodedSizeWithTag(7, value.more_info_panel_expanded_title) + protoAdapter2.encodedSizeWithTag(6, value.more_info_panel_collapsed_title) + protoAdapter2.encodedSizeWithTag(5, value.accept_button_text) + protoAdapter2.encodedSizeWithTag(4, value.scroll_button_text) + protoAdapter2.encodedSizeWithTag(3, value.description_text) + protoAdapter3.asRepeated().encodedSizeWithTag(2, value.line_items) + encodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DisclosureBlocker redact(DisclosureBlocker value) {
                value.getClass();
                List<DisclosureBlocker.LineItem> list = value.line_items;
                ProtoAdapter protoAdapter2 = DisclosureBlocker.LineItem.ADAPTER;
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(list, protoAdapter2);
                ArrayList m1169redactElements2 = TransactorKt.m1169redactElements(value.more_info_panel_line_items, protoAdapter2);
                ByteString byteString = ByteString.EMPTY;
                String str = value.description_text;
                String str2 = value.scroll_button_text;
                String str3 = value.accept_button_text;
                String str4 = value.more_info_panel_collapsed_title;
                String str5 = value.more_info_panel_expanded_title;
                String str6 = value.more_info_panel_footer_text;
                String str7 = value.footer_text;
                String str8 = value.cancel_dialog_text;
                String str9 = value.cancel_dialog_cancel_text;
                String str10 = value.cancel_dialog_confirm_text;
                byteString.getClass();
                return new DisclosureBlocker(null, m1169redactElements, str, str2, str3, str4, str5, m1169redactElements2, str6, str7, str8, str9, str10, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DisclosureBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(writer, 13, value.cancel_dialog_confirm_text);
                protoAdapter2.encodeWithTag(writer, 12, value.cancel_dialog_cancel_text);
                protoAdapter2.encodeWithTag(writer, 11, value.cancel_dialog_text);
                protoAdapter2.encodeWithTag(writer, 10, value.footer_text);
                protoAdapter2.encodeWithTag(writer, 9, value.more_info_panel_footer_text);
                ProtoAdapter protoAdapter3 = DisclosureBlocker.LineItem.ADAPTER;
                protoAdapter3.asRepeated().encodeWithTag(writer, 8, value.more_info_panel_line_items);
                protoAdapter2.encodeWithTag(writer, 7, value.more_info_panel_expanded_title);
                protoAdapter2.encodeWithTag(writer, 6, value.more_info_panel_collapsed_title);
                protoAdapter2.encodeWithTag(writer, 5, value.accept_button_text);
                protoAdapter2.encodeWithTag(writer, 4, value.scroll_button_text);
                protoAdapter2.encodeWithTag(writer, 3, value.description_text);
                protoAdapter3.asRepeated().encodeWithTag(writer, 2, value.line_items);
                protoAdapter2.encodeWithTag(writer, 1, value.headline_text);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisclosureBlocker(String str, List list, String str2, String str3, String str4, String str5, String str6, List list2, String str7, String str8, String str9, String str10, String str11, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.headline_text = str;
        this.description_text = str2;
        this.scroll_button_text = str3;
        this.accept_button_text = str4;
        this.more_info_panel_collapsed_title = str5;
        this.more_info_panel_expanded_title = str6;
        this.more_info_panel_footer_text = str7;
        this.footer_text = str8;
        this.cancel_dialog_text = str9;
        this.cancel_dialog_cancel_text = str10;
        this.cancel_dialog_confirm_text = str11;
        this.line_items = TransactorKt.immutableCopyOf("line_items", list);
        this.more_info_panel_line_items = TransactorKt.immutableCopyOf("more_info_panel_line_items", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DisclosureBlocker)) {
            return false;
        }
        DisclosureBlocker disclosureBlocker = (DisclosureBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), disclosureBlocker.unknownFields()) && Intrinsics.areEqual(this.headline_text, disclosureBlocker.headline_text) && Intrinsics.areEqual(this.line_items, disclosureBlocker.line_items) && Intrinsics.areEqual(this.description_text, disclosureBlocker.description_text) && Intrinsics.areEqual(this.scroll_button_text, disclosureBlocker.scroll_button_text) && Intrinsics.areEqual(this.accept_button_text, disclosureBlocker.accept_button_text) && Intrinsics.areEqual(this.more_info_panel_collapsed_title, disclosureBlocker.more_info_panel_collapsed_title) && Intrinsics.areEqual(this.more_info_panel_expanded_title, disclosureBlocker.more_info_panel_expanded_title) && Intrinsics.areEqual(this.more_info_panel_line_items, disclosureBlocker.more_info_panel_line_items) && Intrinsics.areEqual(this.more_info_panel_footer_text, disclosureBlocker.more_info_panel_footer_text) && Intrinsics.areEqual(this.footer_text, disclosureBlocker.footer_text) && Intrinsics.areEqual(this.cancel_dialog_text, disclosureBlocker.cancel_dialog_text) && Intrinsics.areEqual(this.cancel_dialog_cancel_text, disclosureBlocker.cancel_dialog_cancel_text) && Intrinsics.areEqual(this.cancel_dialog_confirm_text, disclosureBlocker.cancel_dialog_confirm_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.headline_text;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.line_items);
        String str2 = this.description_text;
        int hashCode2 = (m + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.scroll_button_text;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.accept_button_text;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.more_info_panel_collapsed_title;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.more_info_panel_expanded_title;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 37, 37, this.more_info_panel_line_items);
        String str7 = this.more_info_panel_footer_text;
        int hashCode6 = (m2 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.footer_text;
        int hashCode7 = (hashCode6 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.cancel_dialog_text;
        int hashCode8 = (hashCode7 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.cancel_dialog_cancel_text;
        int hashCode9 = (hashCode8 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.cancel_dialog_confirm_text;
        int hashCode10 = hashCode9 + (str11 != null ? str11.hashCode() : 0);
        this.hashCode = hashCode10;
        return hashCode10;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.headline_text = this.headline_text;
        builder.line_items = this.line_items;
        builder.description_text = this.description_text;
        builder.scroll_button_text = this.scroll_button_text;
        builder.accept_button_text = this.accept_button_text;
        builder.more_info_panel_collapsed_title = this.more_info_panel_collapsed_title;
        builder.more_info_panel_expanded_title = this.more_info_panel_expanded_title;
        builder.more_info_panel_line_items = this.more_info_panel_line_items;
        builder.more_info_panel_footer_text = this.more_info_panel_footer_text;
        builder.footer_text = this.footer_text;
        builder.cancel_dialog_text = this.cancel_dialog_text;
        builder.cancel_dialog_cancel_text = this.cancel_dialog_cancel_text;
        builder.cancel_dialog_confirm_text = this.cancel_dialog_confirm_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.headline_text != null) {
            arrayList.add("headline_text=██");
        }
        if (!this.line_items.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("line_items=", arrayList, this.line_items);
        }
        String str = this.description_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "description_text=", arrayList);
        }
        String str2 = this.scroll_button_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "scroll_button_text=", arrayList);
        }
        String str3 = this.accept_button_text;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "accept_button_text=", arrayList);
        }
        String str4 = this.more_info_panel_collapsed_title;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "more_info_panel_collapsed_title=", arrayList);
        }
        String str5 = this.more_info_panel_expanded_title;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "more_info_panel_expanded_title=", arrayList);
        }
        if (!this.more_info_panel_line_items.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("more_info_panel_line_items=", arrayList, this.more_info_panel_line_items);
        }
        String str6 = this.more_info_panel_footer_text;
        if (str6 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str6, "more_info_panel_footer_text=", arrayList);
        }
        String str7 = this.footer_text;
        if (str7 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str7, "footer_text=", arrayList);
        }
        String str8 = this.cancel_dialog_text;
        if (str8 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str8, "cancel_dialog_text=", arrayList);
        }
        String str9 = this.cancel_dialog_cancel_text;
        if (str9 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str9, "cancel_dialog_cancel_text=", arrayList);
        }
        String str10 = this.cancel_dialog_confirm_text;
        if (str10 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str10, "cancel_dialog_confirm_text=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "DisclosureBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0013\u0014B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0002H\u0016J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0082\u0004J\n\u0010\u000f\u001a\u00020\u0010H\u0096\u0080\u0004J\b\u0010\u0011\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/franklin/api/DisclosureBlocker$LineItem;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/franklin/api/DisclosureBlocker$LineItem$Builder;", "title_text", "", "detail_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Builder", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class LineItem extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<LineItem> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        public final String detail_text;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        public final String title_text;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/franklin/api/DisclosureBlocker$LineItem$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/franklin/api/DisclosureBlocker$LineItem;", "<init>", "()V", "title_text", "", "detail_text", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String detail_text;
            public String title_text;

            @Override // com.squareup.wire.Message.Builder
            public LineItem build() {
                return new LineItem(this.title_text, this.detail_text, buildUnknownFields());
            }

            public final Builder detail_text(String detail_text) {
                this.detail_text = detail_text;
                return this;
            }

            public final Builder title_text(String title_text) {
                this.title_text = title_text;
                return this;
            }
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(LineItem.class);
            final Syntax syntax = Syntax.PROTO_2;
            ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.DisclosureBlocker$LineItem$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public DisclosureBlocker.LineItem decode(ProtoReader reader) {
                    reader.getClass();
                    long beginMessage = reader.beginMessage();
                    Object obj = null;
                    Object obj2 = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new DisclosureBlocker.LineItem((String) obj, (String) obj2, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            obj = ProtoAdapter.STRING.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            obj2 = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, DisclosureBlocker.LineItem value) {
                    writer.getClass();
                    value.getClass();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 1, value.title_text);
                    protoAdapter2.encodeWithTag(writer, 2, value.detail_text);
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(DisclosureBlocker.LineItem value) {
                    value.getClass();
                    int size$okio = value.unknownFields().getSize$okio();
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    return protoAdapter2.encodedSizeWithTag(2, value.detail_text) + protoAdapter2.encodedSizeWithTag(1, value.title_text) + size$okio;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public DisclosureBlocker.LineItem redact(DisclosureBlocker.LineItem value) {
                    value.getClass();
                    return DisclosureBlocker.LineItem.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, DisclosureBlocker.LineItem value) {
                    writer.getClass();
                    value.getClass();
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                    protoAdapter2.encodeWithTag(writer, 2, value.detail_text);
                    protoAdapter2.encodeWithTag(writer, 1, value.title_text);
                }
            };
            ADAPTER = protoAdapter;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
        }

        public /* synthetic */ LineItem(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public static /* synthetic */ LineItem copy$default(LineItem lineItem, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = lineItem.title_text;
            }
            if ((i & 2) != 0) {
                str2 = lineItem.detail_text;
            }
            if ((i & 4) != 0) {
                byteString = lineItem.unknownFields();
            }
            return lineItem.copy(str, str2, byteString);
        }

        public final LineItem copy(String title_text, String detail_text, ByteString unknownFields) {
            unknownFields.getClass();
            return new LineItem(title_text, detail_text, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof LineItem)) {
                return false;
            }
            LineItem lineItem = (LineItem) other;
            return Intrinsics.areEqual(unknownFields(), lineItem.unknownFields()) && Intrinsics.areEqual(this.title_text, lineItem.title_text) && Intrinsics.areEqual(this.detail_text, lineItem.detail_text);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title_text;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.detail_text;
            int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public Builder newBuilder() {
            Builder builder = new Builder();
            builder.title_text = this.title_text;
            builder.detail_text = this.detail_text;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title_text;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title_text=", arrayList);
            }
            String str2 = this.detail_text;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "detail_text=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "LineItem{", "}", 0, null, null, 56);
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/DisclosureBlocker$LineItem$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/DisclosureBlocker$LineItem$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/DisclosureBlocker$LineItem;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/DisclosureBlocker$LineItem;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ LineItem build(Function1<? super Builder, Unit> body) {
                body.getClass();
                Builder builder = new Builder();
                body.invoke(builder);
                return builder.build();
            }

            private Companion() {
            }
        }

        public LineItem() {
            this(null, null, null, 7, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LineItem(String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title_text = str;
            this.detail_text = str2;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/franklin/api/DisclosureBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/franklin/api/DisclosureBlocker$Builder;", "", "body", "Lcom/squareup/protos/franklin/api/DisclosureBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/franklin/api/DisclosureBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ DisclosureBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
