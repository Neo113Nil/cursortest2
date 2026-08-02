package com.squareup.protos.cash.fiatly.blocker.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0014\u0013R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/squareup/protos/cash/fiatly/blocker/v1/P2pInstrumentSelectionBlocker;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/fiatly/blocker/v1/P2pInstrumentSelectionBlocker$Builder;", "", "header_title", "Ljava/lang/String;", "", "preselected_item_index", "Ljava/lang/Integer;", "Lcom/squareup/protos/cash/fiatly/blocker/v1/PrimaryButton;", "primary_button", "Lcom/squareup/protos/cash/fiatly/blocker/v1/PrimaryButton;", "Lcom/squareup/protos/cash/fiatly/blocker/v1/LinkButton;", "link_button", "Lcom/squareup/protos/cash/fiatly/blocker/v1/LinkButton;", "", "Lcom/squareup/protos/cash/fiatly/blocker/v1/InstrumentSelectionItem;", "items", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class P2pInstrumentSelectionBlocker extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<P2pInstrumentSelectionBlocker> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    public final String header_title;

    @WireField(adapter = "com.squareup.protos.cash.fiatly.blocker.v1.InstrumentSelectionItem#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    public final List<InstrumentSelectionItem> items;

    @WireField(adapter = "com.squareup.protos.cash.fiatly.blocker.v1.LinkButton#ADAPTER", schemaIndex = 4, tag = 5)
    public final LinkButton link_button;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", schemaIndex = 2, tag = 3)
    public final Integer preselected_item_index;

    @WireField(adapter = "com.squareup.protos.cash.fiatly.blocker.v1.PrimaryButton#ADAPTER", schemaIndex = 3, tag = 4)
    public final PrimaryButton primary_button;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0014\u0010\u0007\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0015\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\u0011J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\b\u0010\u0012\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/cash/fiatly/blocker/v1/P2pInstrumentSelectionBlocker$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/fiatly/blocker/v1/P2pInstrumentSelectionBlocker;", "<init>", "()V", "header_title", "", "items", "", "Lcom/squareup/protos/cash/fiatly/blocker/v1/InstrumentSelectionItem;", "preselected_item_index", "", "Ljava/lang/Integer;", "primary_button", "Lcom/squareup/protos/cash/fiatly/blocker/v1/PrimaryButton;", "link_button", "Lcom/squareup/protos/cash/fiatly/blocker/v1/LinkButton;", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/fiatly/blocker/v1/P2pInstrumentSelectionBlocker$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder {
        public String header_title;
        public List<InstrumentSelectionItem> items = EmptyList.INSTANCE;
        public LinkButton link_button;
        public Integer preselected_item_index;
        public PrimaryButton primary_button;

        @Override // com.squareup.wire.Message.Builder
        public P2pInstrumentSelectionBlocker build() {
            return new P2pInstrumentSelectionBlocker(this.header_title, this.items, this.preselected_item_index, this.primary_button, this.link_button, buildUnknownFields());
        }

        public final Builder header_title(String header_title) {
            this.header_title = header_title;
            return this;
        }

        public final Builder items(List<InstrumentSelectionItem> items) {
            items.getClass();
            TransactorKt.checkElementsNotNull(items);
            this.items = items;
            return this;
        }

        public final Builder link_button(LinkButton link_button) {
            this.link_button = link_button;
            return this;
        }

        public final Builder preselected_item_index(Integer preselected_item_index) {
            this.preselected_item_index = preselected_item_index;
            return this;
        }

        public final Builder primary_button(PrimaryButton primary_button) {
            this.primary_button = primary_button;
            return this;
        }
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(P2pInstrumentSelectionBlocker.class);
        final Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.squareup.protos.cash.fiatly.blocker.v1.P2pInstrumentSelectionBlocker$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public P2pInstrumentSelectionBlocker decode(ProtoReader reader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(reader);
                long beginMessage = reader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                Object obj4 = null;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new P2pInstrumentSelectionBlocker((String) obj, m, (Integer) obj2, (PrimaryButton) obj3, (LinkButton) obj4, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        m.add(InstrumentSelectionItem.ADAPTER.decode(reader));
                    } else if (nextTag == 3) {
                        obj2 = ProtoAdapter.UINT32.decode(reader);
                    } else if (nextTag == 4) {
                        obj3 = TransactorKt.decodeMessageOrMerge(PrimaryButton.ADAPTER, reader, obj3);
                    } else if (nextTag != 5) {
                        reader.readUnknownField(nextTag);
                    } else {
                        obj4 = TransactorKt.decodeMessageOrMerge(LinkButton.ADAPTER, reader, obj4);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, P2pInstrumentSelectionBlocker value) {
                writer.getClass();
                value.getClass();
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.header_title);
                InstrumentSelectionItem.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.items);
                ProtoAdapter.UINT32.encodeWithTag(writer, 3, value.preselected_item_index);
                PrimaryButton.ADAPTER.encodeWithTag(writer, 4, value.primary_button);
                LinkButton.ADAPTER.encodeWithTag(writer, 5, value.link_button);
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(P2pInstrumentSelectionBlocker value) {
                value.getClass();
                return LinkButton.ADAPTER.encodedSizeWithTag(5, value.link_button) + PrimaryButton.ADAPTER.encodedSizeWithTag(4, value.primary_button) + ProtoAdapter.UINT32.encodedSizeWithTag(3, value.preselected_item_index) + InstrumentSelectionItem.ADAPTER.asRepeated().encodedSizeWithTag(2, value.items) + ProtoAdapter.STRING.encodedSizeWithTag(1, value.header_title) + value.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public P2pInstrumentSelectionBlocker redact(P2pInstrumentSelectionBlocker value) {
                value.getClass();
                ArrayList m1169redactElements = TransactorKt.m1169redactElements(value.items, InstrumentSelectionItem.ADAPTER);
                PrimaryButton primaryButton = value.primary_button;
                PrimaryButton primaryButton2 = primaryButton != null ? (PrimaryButton) PrimaryButton.ADAPTER.redact(primaryButton) : null;
                LinkButton linkButton = value.link_button;
                LinkButton linkButton2 = linkButton != null ? (LinkButton) LinkButton.ADAPTER.redact(linkButton) : null;
                ByteString byteString = ByteString.EMPTY;
                String str = value.header_title;
                Integer num = value.preselected_item_index;
                byteString.getClass();
                return new P2pInstrumentSelectionBlocker(str, m1169redactElements, num, primaryButton2, linkButton2, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, P2pInstrumentSelectionBlocker value) {
                writer.getClass();
                value.getClass();
                writer.writeBytes(value.unknownFields());
                LinkButton.ADAPTER.encodeWithTag(writer, 5, value.link_button);
                PrimaryButton.ADAPTER.encodeWithTag(writer, 4, value.primary_button);
                ProtoAdapter.UINT32.encodeWithTag(writer, 3, value.preselected_item_index);
                InstrumentSelectionItem.ADAPTER.asRepeated().encodeWithTag(writer, 2, value.items);
                ProtoAdapter.STRING.encodeWithTag(writer, 1, value.header_title);
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P2pInstrumentSelectionBlocker(String str, List list, Integer num, PrimaryButton primaryButton, LinkButton linkButton, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.header_title = str;
        this.preselected_item_index = num;
        this.primary_button = primaryButton;
        this.link_button = linkButton;
        this.items = TransactorKt.immutableCopyOf("items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof P2pInstrumentSelectionBlocker)) {
            return false;
        }
        P2pInstrumentSelectionBlocker p2pInstrumentSelectionBlocker = (P2pInstrumentSelectionBlocker) obj;
        return Intrinsics.areEqual(unknownFields(), p2pInstrumentSelectionBlocker.unknownFields()) && Intrinsics.areEqual(this.header_title, p2pInstrumentSelectionBlocker.header_title) && Intrinsics.areEqual(this.items, p2pInstrumentSelectionBlocker.items) && Intrinsics.areEqual(this.preselected_item_index, p2pInstrumentSelectionBlocker.preselected_item_index) && Intrinsics.areEqual(this.primary_button, p2pInstrumentSelectionBlocker.primary_button) && Intrinsics.areEqual(this.link_button, p2pInstrumentSelectionBlocker.link_button);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.header_title;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str != null ? str.hashCode() : 0)) * 37, 37, this.items);
        Integer num = this.preselected_item_index;
        int hashCode2 = (m + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        PrimaryButton primaryButton = this.primary_button;
        int hashCode3 = (hashCode2 + (primaryButton != null ? primaryButton.hashCode() : 0)) * 37;
        LinkButton linkButton = this.link_button;
        int hashCode4 = hashCode3 + (linkButton != null ? linkButton.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.header_title = this.header_title;
        builder.items = this.items;
        builder.preselected_item_index = this.preselected_item_index;
        builder.primary_button = this.primary_button;
        builder.link_button = this.link_button;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.header_title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "header_title=", arrayList);
        }
        if (!this.items.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("items=", arrayList, this.items);
        }
        Integer num = this.preselected_item_index;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("preselected_item_index=", num, arrayList);
        }
        PrimaryButton primaryButton = this.primary_button;
        if (primaryButton != null) {
            arrayList.add("primary_button=" + primaryButton);
        }
        LinkButton linkButton = this.link_button;
        if (linkButton != null) {
            arrayList.add("link_button=" + linkButton);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "P2pInstrumentSelectionBlocker{", "}", 0, null, null, 56);
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0014"}, d2 = {"Lcom/squareup/protos/cash/fiatly/blocker/v1/P2pInstrumentSelectionBlocker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/squareup/protos/cash/fiatly/blocker/v1/P2pInstrumentSelectionBlocker$Builder;", "", "body", "Lcom/squareup/protos/cash/fiatly/blocker/v1/P2pInstrumentSelectionBlocker;", "build", "(Lkotlin/jvm/functions/Function1;)Lcom/squareup/protos/cash/fiatly/blocker/v1/P2pInstrumentSelectionBlocker;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "", "serialVersionUID", "J", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ P2pInstrumentSelectionBlocker build(Function1<? super Builder, Unit> body) {
            body.getClass();
            Builder builder = new Builder();
            body.invoke(builder);
            return builder.build();
        }

        private Companion() {
        }
    }
}
