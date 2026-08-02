package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import com.squareup.protos.cash.composer.app.Asset;
import com.squareup.protos.cash.grantly.api.Channel;
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
public final class BlankDividerElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BlankDividerElement> CREATOR;
    public final Size size;

    public enum Size implements WireEnum {
        SMALL(1),
        LARGE(2),
        X_LARGE(3);

        public final int value;
        public static final Channel.Companion Companion = new Channel.Companion();
        public static final BlankDividerElement$Size$Companion$ADAPTER$1 ADAPTER = new BlankDividerElement$Size$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Size.class), Syntax.PROTO_2, null);

        Size(int i) {
            this.value = i;
        }

        public static final Size fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return SMALL;
            }
            if (i == 2) {
                return LARGE;
            }
            if (i != 3) {
                return null;
            }
            return X_LARGE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        BlankDividerElement$Companion$ADAPTER$1 blankDividerElement$Companion$ADAPTER$1 = new BlankDividerElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BlankDividerElement.class), "type.googleapis.com/squareup.cash.genericelements.ui.BlankDividerElement", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = blankDividerElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(blankDividerElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlankDividerElement(Size size, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.size = size;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BlankDividerElement)) {
            return false;
        }
        BlankDividerElement blankDividerElement = (BlankDividerElement) obj;
        return Intrinsics.areEqual(unknownFields(), blankDividerElement.unknownFields()) && this.size == blankDividerElement.size;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Size size = this.size;
        int hashCode2 = hashCode + (size != null ? size.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Asset.Builder builder = new Asset.Builder(25);
        builder.asset_type = this.size;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Size size = this.size;
        if (size != null) {
            arrayList.add("size=" + size);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BlankDividerElement{", "}", 0, null, null, 56);
    }
}
