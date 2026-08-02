package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import com.squareup.protos.cash.composer.app.Asset;
import com.squareup.protos.cash.genericelements.ui.Alignment;
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
public final class BlankDividerComponent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BlankDividerComponent> CREATOR;
    public final Size size;

    public enum Size implements WireEnum {
        SMALL(1),
        LARGE(2);

        public final int value;
        public static final Alignment.Companion Companion = new Alignment.Companion();
        public static final BlankDividerComponent$Size$Companion$ADAPTER$1 ADAPTER = new BlankDividerComponent$Size$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Size.class), Syntax.PROTO_2, null);

        Size(int i) {
            this.value = i;
        }

        public static final Size fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return SMALL;
            }
            if (i != 2) {
                return null;
            }
            return LARGE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        BlankDividerComponent$Companion$ADAPTER$1 blankDividerComponent$Companion$ADAPTER$1 = new BlankDividerComponent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BlankDividerComponent.class), "type.googleapis.com/squareup.cash.genericelements.ui.BlankDividerComponent", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = blankDividerComponent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(blankDividerComponent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlankDividerComponent(Size size, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.size = size;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BlankDividerComponent)) {
            return false;
        }
        BlankDividerComponent blankDividerComponent = (BlankDividerComponent) obj;
        return Intrinsics.areEqual(unknownFields(), blankDividerComponent.unknownFields()) && this.size == blankDividerComponent.size;
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
        Asset.Builder builder = new Asset.Builder(24);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "BlankDividerComponent{", "}", 0, null, null, 56);
    }
}
