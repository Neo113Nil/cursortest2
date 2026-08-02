package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.WireOneofField;
import com.squareup.wire.WireSealedOneof;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.ui.arcade.elements.CellDefault;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u000e\r\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CellList;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/CellList$Builder;", "", "show_as_pinned_suggestions", "Ljava/lang/Boolean;", "", "version", "Ljava/lang/Integer;", "", "Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell;", "cells", "Ljava/util/List;", "Companion", "Builder", "TappableCell", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CellList extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CellList> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.CellList$TappableCell#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    public final List<TappableCell> cells;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 1, tag = 2)
    public final Boolean show_as_pinned_suggestions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 2, tag = 3)
    public final Integer version;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0015\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\nR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CellList$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/CellList;", "<init>", "()V", "cells", "", "Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell;", "show_as_pinned_suggestions", "", "Ljava/lang/Boolean;", "version", "", "Ljava/lang/Integer;", "(Ljava/lang/Boolean;)Lcom/squareup/protos/cash/kgoose/api/v3/CellList$Builder;", "(Ljava/lang/Integer;)Lcom/squareup/protos/cash/kgoose/api/v3/CellList$Builder;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public List<TappableCell> cells = EmptyList.INSTANCE;
        public Boolean show_as_pinned_suggestions;
        public Integer version;

        @Override // com.squareup.wire.Message.Builder
        public CellList build() {
            return new CellList(this.cells, this.show_as_pinned_suggestions, this.version, buildUnknownFields());
        }

        public final Builder cells(List<TappableCell> cells) {
            cells.getClass();
            TransactorKt.checkElementsNotNull(cells);
            this.cells = cells;
            return this;
        }

        public final Builder show_as_pinned_suggestions(Boolean show_as_pinned_suggestions) {
            this.show_as_pinned_suggestions = show_as_pinned_suggestions;
            return this;
        }

        public final Builder version(Integer version) {
            this.version = version;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u000f\u0010\u000e\u0011\u0012R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell$Builder;", "Lsquareup/cash/ui/arcade/elements/CellDefault;", "cells", "Lsquareup/cash/ui/arcade/elements/CellDefault;", "Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell$TapAction;", "tap_action", "Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell$TapAction;", "", "campaign_category", "Ljava/lang/String;", "getCampaign_category$annotations", "()V", "Companion", "Builder", "TapAction", "SendMessageAction", "RequestFreeformInputAction", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class TappableCell extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TappableCell> CREATOR;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
        public final String campaign_category;

        @WireField(adapter = "squareup.cash.ui.arcade.elements.CellDefault#ADAPTER", schemaIndex = 0, tag = 1)
        public final CellDefault cells;

        @WireSealedOneof(schemaIndex = 1)
        public final TapAction tap_action;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007J\u0010\u0010\u0007\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell;", "<init>", "()V", "cells", "Lsquareup/cash/ui/arcade/elements/CellDefault;", "tap_action", "Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell$TapAction;", "campaign_category", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public String campaign_category;
            public CellDefault cells;
            public TapAction tap_action;

            @Override // com.squareup.wire.Message.Builder
            public TappableCell build() {
                return new TappableCell(this.cells, this.tap_action, this.campaign_category, buildUnknownFields());
            }

            @Deprecated
            public final Builder campaign_category(String campaign_category) {
                this.campaign_category = campaign_category;
                return this;
            }

            public final Builder cells(CellDefault cells) {
                this.cells = cells;
                return this;
            }

            public final Builder tap_action(TapAction tap_action) {
                this.tap_action = tap_action;
                return this;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell$RequestFreeformInputAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell$RequestFreeformInputAction$Builder;", "", "placeholder", "Ljava/lang/String;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class RequestFreeformInputAction extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<RequestFreeformInputAction> CREATOR;
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String placeholder;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell$RequestFreeformInputAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell$RequestFreeformInputAction;", "<init>", "()V", "placeholder", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String placeholder;

                @Override // com.squareup.wire.Message.Builder
                public RequestFreeformInputAction build() {
                    return new RequestFreeformInputAction(this.placeholder, buildUnknownFields());
                }

                public final Builder placeholder(String placeholder) {
                    this.placeholder = placeholder;
                    return this;
                }
            }

            static {
                CellList$TappableCell$RequestFreeformInputAction$Companion$ADAPTER$1 cellList$TappableCell$RequestFreeformInputAction$Companion$ADAPTER$1 = new CellList$TappableCell$RequestFreeformInputAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RequestFreeformInputAction.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.CellList.TappableCell.RequestFreeformInputAction", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/client_renderable.proto");
                ADAPTER = cellList$TappableCell$RequestFreeformInputAction$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(cellList$TappableCell$RequestFreeformInputAction$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RequestFreeformInputAction(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.placeholder = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof RequestFreeformInputAction)) {
                    return false;
                }
                RequestFreeformInputAction requestFreeformInputAction = (RequestFreeformInputAction) obj;
                return Intrinsics.areEqual(unknownFields(), requestFreeformInputAction.unknownFields()) && Intrinsics.areEqual(this.placeholder, requestFreeformInputAction.placeholder);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.placeholder;
                int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Builder builder = new Builder();
                builder.placeholder = this.placeholder;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.placeholder;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "placeholder=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "RequestFreeformInputAction{", "}", 0, null, null, 56);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\u0006R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell$SendMessageAction;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell$SendMessageAction$Builder;", "", "message", "Ljava/lang/String;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class SendMessageAction extends AndroidMessage {
            public static final ProtoAdapter ADAPTER;
            public static final Parcelable.Creator<SendMessageAction> CREATOR;
            private static final long serialVersionUID = 0;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
            public final String message;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell$SendMessageAction$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell$SendMessageAction;", "<init>", "()V", "message", "", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Builder extends Message.Builder {
                public String message;

                @Override // com.squareup.wire.Message.Builder
                public SendMessageAction build() {
                    return new SendMessageAction(this.message, buildUnknownFields());
                }

                public final Builder message(String message) {
                    this.message = message;
                    return this;
                }
            }

            static {
                CellList$TappableCell$SendMessageAction$Companion$ADAPTER$1 cellList$TappableCell$SendMessageAction$Companion$ADAPTER$1 = new CellList$TappableCell$SendMessageAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SendMessageAction.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.CellList.TappableCell.SendMessageAction", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/client_renderable.proto");
                ADAPTER = cellList$TappableCell$SendMessageAction$Companion$ADAPTER$1;
                AndroidMessage.Companion.getClass();
                CREATOR = new AndroidMessage.ProtoAdapterCreator(cellList$TappableCell$SendMessageAction$Companion$ADAPTER$1);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SendMessageAction(String str, ByteString byteString) {
                super(ADAPTER, byteString);
                byteString.getClass();
                this.message = str;
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SendMessageAction)) {
                    return false;
                }
                SendMessageAction sendMessageAction = (SendMessageAction) obj;
                return Intrinsics.areEqual(unknownFields(), sendMessageAction.unknownFields()) && Intrinsics.areEqual(this.message, sendMessageAction.message);
            }

            public final int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int hashCode = unknownFields().hashCode() * 37;
                String str = this.message;
                int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
                this.hashCode = hashCode2;
                return hashCode2;
            }

            @Override // com.squareup.wire.Message
            public final Message.Builder newBuilder() {
                Builder builder = new Builder();
                builder.message = this.message;
                builder.addUnknownFields(unknownFields());
                return builder;
            }

            public final String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.message;
                if (str != null) {
                    BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "message=", arrayList);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "SendMessageAction{", "}", 0, null, null, 56);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell$TapAction;", "", "SendMessage", "RequestFreeformInput", "Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell$TapAction$RequestFreeformInput;", "Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell$TapAction$SendMessage;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static abstract class TapAction {

            @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.CellList$TappableCell$RequestFreeformInputAction#ADAPTER", declaredName = "request_freeform_input", tag = 4)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell$TapAction$RequestFreeformInput;", "Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell$TapAction;", "Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell$RequestFreeformInputAction;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell$RequestFreeformInputAction;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell$RequestFreeformInputAction;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class RequestFreeformInput extends TapAction {
                private final RequestFreeformInputAction value;

                public RequestFreeformInput(RequestFreeformInputAction requestFreeformInputAction) {
                    requestFreeformInputAction.getClass();
                    this.value = requestFreeformInputAction;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof RequestFreeformInput) && Intrinsics.areEqual(this.value, ((RequestFreeformInput) obj).value);
                }

                public final RequestFreeformInputAction getValue() {
                    return this.value;
                }

                public final int hashCode() {
                    return this.value.hashCode();
                }

                public final String toString() {
                    return "RequestFreeformInput(value=" + this.value + ")";
                }
            }

            @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.CellList$TappableCell$SendMessageAction#ADAPTER", declaredName = "send_message", tag = 2)
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell$TapAction$SendMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell$TapAction;", "Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell$SendMessageAction;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell$SendMessageAction;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/CellList$TappableCell$SendMessageAction;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final /* data */ class SendMessage extends TapAction {
                private final SendMessageAction value;

                public SendMessage(SendMessageAction sendMessageAction) {
                    sendMessageAction.getClass();
                    this.value = sendMessageAction;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof SendMessage) && Intrinsics.areEqual(this.value, ((SendMessage) obj).value);
                }

                public final SendMessageAction getValue() {
                    return this.value;
                }

                public final int hashCode() {
                    return this.value.hashCode();
                }

                public final String toString() {
                    return "SendMessage(value=" + this.value + ")";
                }
            }
        }

        static {
            CellList$TappableCell$Companion$ADAPTER$1 cellList$TappableCell$Companion$ADAPTER$1 = new CellList$TappableCell$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TappableCell.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.CellList.TappableCell", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/client_renderable.proto");
            ADAPTER = cellList$TappableCell$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(cellList$TappableCell$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TappableCell(CellDefault cellDefault, TapAction tapAction, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.cells = cellDefault;
            this.tap_action = tapAction;
            this.campaign_category = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TappableCell)) {
                return false;
            }
            TappableCell tappableCell = (TappableCell) obj;
            return Intrinsics.areEqual(unknownFields(), tappableCell.unknownFields()) && Intrinsics.areEqual(this.cells, tappableCell.cells) && Intrinsics.areEqual(this.tap_action, tappableCell.tap_action) && Intrinsics.areEqual(this.campaign_category, tappableCell.campaign_category);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            CellDefault cellDefault = this.cells;
            int hashCode2 = (hashCode + (cellDefault != null ? cellDefault.hashCode() : 0)) * 37;
            TapAction tapAction = this.tap_action;
            int hashCode3 = (hashCode2 + (tapAction != null ? tapAction.hashCode() : 0)) * 37;
            String str = this.campaign_category;
            int hashCode4 = hashCode3 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.cells = this.cells;
            builder.tap_action = this.tap_action;
            builder.campaign_category = this.campaign_category;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            CellDefault cellDefault = this.cells;
            if (cellDefault != null) {
                arrayList.add("cells=" + cellDefault);
            }
            TapAction tapAction = this.tap_action;
            if (tapAction != null) {
                arrayList.add("tap_action=" + tapAction);
            }
            String str = this.campaign_category;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "campaign_category=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TappableCell{", "}", 0, null, null, 56);
        }
    }

    static {
        CellList$Companion$ADAPTER$1 cellList$Companion$ADAPTER$1 = new CellList$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CellList.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.CellList", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/client_renderable.proto");
        ADAPTER = cellList$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cellList$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CellList(List list, Boolean bool, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.show_as_pinned_suggestions = bool;
        this.version = num;
        this.cells = TransactorKt.immutableCopyOf("cells", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CellList)) {
            return false;
        }
        CellList cellList = (CellList) obj;
        return Intrinsics.areEqual(unknownFields(), cellList.unknownFields()) && Intrinsics.areEqual(this.cells, cellList.cells) && Intrinsics.areEqual(this.show_as_pinned_suggestions, cellList.show_as_pinned_suggestions) && Intrinsics.areEqual(this.version, cellList.version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.cells);
        Boolean bool = this.show_as_pinned_suggestions;
        int hashCode = (m + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Integer num = this.version;
        int hashCode2 = hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.cells = this.cells;
        builder.show_as_pinned_suggestions = this.show_as_pinned_suggestions;
        builder.version = this.version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.cells.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("cells=", arrayList, this.cells);
        }
        Boolean bool = this.show_as_pinned_suggestions;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_as_pinned_suggestions=", bool, arrayList);
        }
        Integer num = this.version;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("version=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CellList{", "}", 0, null, null, 56);
    }
}
