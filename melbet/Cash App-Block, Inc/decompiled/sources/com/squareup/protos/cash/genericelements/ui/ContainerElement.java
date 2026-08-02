package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import coil3.util.BitmapsKt;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ContainerElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ContainerElement> CREATOR;
    public final BitmapsKt container;
    public final Margin margin;

    public final class Margin extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Margin> CREATOR;
        public final MarginSize left;
        public final MarginSize right;

        public enum MarginSize implements WireEnum {
            SMALL(1),
            MEDIUM(2),
            LARGE(3),
            PROFILE(4),
            XLARGE(5);

            public final int value;
            public static final Alignment.Companion Companion = new Alignment.Companion();
            public static final ContainerElement$Margin$MarginSize$Companion$ADAPTER$1 ADAPTER = new ContainerElement$Margin$MarginSize$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(MarginSize.class), Syntax.PROTO_2, null);

            MarginSize(int i) {
                this.value = i;
            }

            public static final MarginSize fromValue(int i) {
                Companion.getClass();
                return Alignment.Companion.m3862fromValue(i);
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            ContainerElement$Margin$Companion$ADAPTER$1 containerElement$Margin$Companion$ADAPTER$1 = new ContainerElement$Margin$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Margin.class), "type.googleapis.com/squareup.cash.genericelements.ui.ContainerElement.Margin", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
            ADAPTER = containerElement$Margin$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(containerElement$Margin$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Margin(MarginSize marginSize, MarginSize marginSize2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.left = marginSize;
            this.right = marginSize2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Margin)) {
                return false;
            }
            Margin margin = (Margin) obj;
            return Intrinsics.areEqual(unknownFields(), margin.unknownFields()) && this.left == margin.left && this.right == margin.right;
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            MarginSize marginSize = this.left;
            int hashCode2 = (hashCode + (marginSize != null ? marginSize.hashCode() : 0)) * 37;
            MarginSize marginSize2 = this.right;
            int hashCode3 = hashCode2 + (marginSize2 != null ? marginSize2.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Action.Builder builder = new Action.Builder(22);
            builder.f1268type = this.left;
            builder.details = this.right;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            MarginSize marginSize = this.left;
            if (marginSize != null) {
                arrayList.add("left=" + marginSize);
            }
            MarginSize marginSize2 = this.right;
            if (marginSize2 != null) {
                arrayList.add("right=" + marginSize2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Margin{", "}", 0, null, null, 56);
        }
    }

    static {
        ContainerElement$Companion$ADAPTER$1 containerElement$Companion$ADAPTER$1 = new ContainerElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ContainerElement.class), "type.googleapis.com/squareup.cash.genericelements.ui.ContainerElement", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = containerElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(containerElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContainerElement(BitmapsKt bitmapsKt, Margin margin, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.container = bitmapsKt;
        this.margin = margin;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ContainerElement)) {
            return false;
        }
        ContainerElement containerElement = (ContainerElement) obj;
        return Intrinsics.areEqual(unknownFields(), containerElement.unknownFields()) && Intrinsics.areEqual(this.container, containerElement.container) && Intrinsics.areEqual(this.margin, containerElement.margin);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BitmapsKt bitmapsKt = this.container;
        int hashCode2 = (hashCode + (bitmapsKt != null ? bitmapsKt.hashCode() : 0)) * 37;
        Margin margin = this.margin;
        int hashCode3 = hashCode2 + (margin != null ? margin.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Action.Builder builder = new Action.Builder(21);
        builder.f1268type = this.container;
        builder.details = this.margin;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BitmapsKt bitmapsKt = this.container;
        if (bitmapsKt != null) {
            arrayList.add("container=" + bitmapsKt);
        }
        Margin margin = this.margin;
        if (margin != null) {
            arrayList.add("margin=" + margin);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ContainerElement{", "}", 0, null, null, 56);
    }
}
