package com.squareup.protos.cash.kgoose.api.v3;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
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
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0007\b\u0006\t\n\u000bR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\f"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Component;", "component", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Component;", "Companion", "Builder", "Component", "Column", "Row", "Box", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LayoutElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LayoutElement> CREATOR;
    private static final long serialVersionUID = 0;

    @WireSealedOneof(schemaIndex = 0)
    public final Component component;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\b\u0007R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Box;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Box$Builder;", "", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement;", "items", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Box extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Box> CREATOR;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.LayoutElement#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        public final List<LayoutElement> items;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Box$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Box;", "<init>", "()V", "items", "", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<LayoutElement> items = EmptyList.INSTANCE;

            @Override // com.squareup.wire.Message.Builder
            public Box build() {
                return new Box(this.items, buildUnknownFields());
            }

            public final Builder items(List<LayoutElement> items) {
                items.getClass();
                TransactorKt.checkElementsNotNull(items);
                this.items = items;
                return this;
            }
        }

        static {
            LayoutElement$Box$Companion$ADAPTER$1 layoutElement$Box$Companion$ADAPTER$1 = new LayoutElement$Box$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Box.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.LayoutElement.Box", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/client_renderable.proto");
            ADAPTER = layoutElement$Box$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(layoutElement$Box$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Box(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.items = TransactorKt.immutableCopyOf("items", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Box)) {
                return false;
            }
            Box box = (Box) obj;
            return Intrinsics.areEqual(unknownFields(), box.unknownFields()) && Intrinsics.areEqual(this.items, box.items);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.items.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.items = this.items;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.items.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("items=", arrayList, this.items);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Box{", "}", 0, null, null, 56);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement;", "<init>", "()V", "component", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Component;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends Message.Builder {
        public Component component;

        @Override // com.squareup.wire.Message.Builder
        public LayoutElement build() {
            return new LayoutElement(this.component, buildUnknownFields());
        }

        public final Builder component(Component component) {
            this.component = component;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\b\u0007R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Column;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Column$Builder;", "", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement;", "items", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Column extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Column> CREATOR;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.LayoutElement#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        public final List<LayoutElement> items;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Column$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Column;", "<init>", "()V", "items", "", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<LayoutElement> items = EmptyList.INSTANCE;

            @Override // com.squareup.wire.Message.Builder
            public Column build() {
                return new Column(this.items, buildUnknownFields());
            }

            public final Builder items(List<LayoutElement> items) {
                items.getClass();
                TransactorKt.checkElementsNotNull(items);
                this.items = items;
                return this;
            }
        }

        static {
            LayoutElement$Column$Companion$ADAPTER$1 layoutElement$Column$Companion$ADAPTER$1 = new LayoutElement$Column$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Column.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.LayoutElement.Column", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/client_renderable.proto");
            ADAPTER = layoutElement$Column$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(layoutElement$Column$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Column(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.items = TransactorKt.immutableCopyOf("items", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Column)) {
                return false;
            }
            Column column = (Column) obj;
            return Intrinsics.areEqual(unknownFields(), column.unknownFields()) && Intrinsics.areEqual(this.items, column.items);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.items.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.items = this.items;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.items.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("items=", arrayList, this.items);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Column{", "}", 0, null, null, 56);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Component;", "", "Column", "Row", "Box", "ArcadeComponent", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Component$ArcadeComponent;", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Component$Box;", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Component$Column;", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Component$Row;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class Component {

        @WireOneofField(adapter = "squareup.cash.ui.arcade.elements.ArcadeComponent#ADAPTER", declaredName = "arcade_component", tag = 4)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Component$ArcadeComponent;", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Component;", "Lsquareup/cash/ui/arcade/elements/ArcadeComponent;", "value", "Lsquareup/cash/ui/arcade/elements/ArcadeComponent;", "getValue", "()Lsquareup/cash/ui/arcade/elements/ArcadeComponent;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class ArcadeComponent extends Component {
            private final squareup.cash.ui.arcade.elements.ArcadeComponent value;

            public ArcadeComponent(squareup.cash.ui.arcade.elements.ArcadeComponent arcadeComponent) {
                arcadeComponent.getClass();
                this.value = arcadeComponent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ArcadeComponent) && Intrinsics.areEqual(this.value, ((ArcadeComponent) obj).value);
            }

            public final squareup.cash.ui.arcade.elements.ArcadeComponent getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "ArcadeComponent(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.LayoutElement$Box#ADAPTER", declaredName = "box", tag = 3)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Component$Box;", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Component;", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Box;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Box;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Box;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Box extends Component {
            private final Box value;

            public Box(Box box) {
                box.getClass();
                this.value = box;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Box) && Intrinsics.areEqual(this.value, ((Box) obj).value);
            }

            public final Box getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Box(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.LayoutElement$Column#ADAPTER", declaredName = "column", tag = 1)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Component$Column;", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Component;", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Column;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Column;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Column;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Column extends Component {
            private final Column value;

            public Column(Column column) {
                column.getClass();
                this.value = column;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Column) && Intrinsics.areEqual(this.value, ((Column) obj).value);
            }

            public final Column getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Column(value=" + this.value + ")";
            }
        }

        @WireOneofField(adapter = "com.squareup.protos.cash.kgoose.api.v3.LayoutElement$Row#ADAPTER", declaredName = "row", tag = 2)
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Component$Row;", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Component;", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Row;", "value", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Row;", "getValue", "()Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Row;", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Row extends Component {
            private final Row value;

            public Row(Row row) {
                row.getClass();
                this.value = row;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Row) && Intrinsics.areEqual(this.value, ((Row) obj).value);
            }

            public final Row getValue() {
                return this.value;
            }

            public final int hashCode() {
                return this.value.hashCode();
            }

            public final String toString() {
                return "Row(value=" + this.value + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00072\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\b\u0007R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Row;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Row$Builder;", "", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement;", "items", "Ljava/util/List;", "Companion", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Row extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Row> CREATOR;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.protos.cash.kgoose.api.v3.LayoutElement#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        public final List<LayoutElement> items;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\b\u001a\u00020\u0002H\u0016R\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Row$Builder;", "Lcom/squareup/wire/Message$Builder;", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement$Row;", "<init>", "()V", "items", "", "Lcom/squareup/protos/cash/kgoose/api/v3/LayoutElement;", "build", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Builder extends Message.Builder {
            public List<LayoutElement> items = EmptyList.INSTANCE;

            @Override // com.squareup.wire.Message.Builder
            public Row build() {
                return new Row(this.items, buildUnknownFields());
            }

            public final Builder items(List<LayoutElement> items) {
                items.getClass();
                TransactorKt.checkElementsNotNull(items);
                this.items = items;
                return this;
            }
        }

        static {
            LayoutElement$Row$Companion$ADAPTER$1 layoutElement$Row$Companion$ADAPTER$1 = new LayoutElement$Row$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Row.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.LayoutElement.Row", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/client_renderable.proto");
            ADAPTER = layoutElement$Row$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(layoutElement$Row$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Row(List list, ByteString byteString) {
            super(ADAPTER, byteString);
            list.getClass();
            byteString.getClass();
            this.items = TransactorKt.immutableCopyOf("items", list);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Row)) {
                return false;
            }
            Row row = (Row) obj;
            return Intrinsics.areEqual(unknownFields(), row.unknownFields()) && Intrinsics.areEqual(this.items, row.items);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.items.hashCode() + (unknownFields().hashCode() * 37);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Builder builder = new Builder();
            builder.items = this.items;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.items.isEmpty()) {
                re$$ExternalSyntheticOutline0.m("items=", arrayList, this.items);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Row{", "}", 0, null, null, 56);
        }
    }

    static {
        LayoutElement$Companion$ADAPTER$1 layoutElement$Companion$ADAPTER$1 = new LayoutElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LayoutElement.class), "type.googleapis.com/squareup.cash.kgoose.api.v3.LayoutElement", Syntax.PROTO_2, null, "squareup/cash/kgoose/api/v3/client_renderable.proto");
        ADAPTER = layoutElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(layoutElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutElement(Component component, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.component = component;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LayoutElement)) {
            return false;
        }
        LayoutElement layoutElement = (LayoutElement) obj;
        return Intrinsics.areEqual(unknownFields(), layoutElement.unknownFields()) && Intrinsics.areEqual(this.component, layoutElement.component);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Component component = this.component;
        int hashCode2 = hashCode + (component != null ? component.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.component = this.component;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Component component = this.component;
        if (component != null) {
            arrayList.add("component=" + component);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LayoutElement{", "}", 0, null, null, 56);
    }
}
