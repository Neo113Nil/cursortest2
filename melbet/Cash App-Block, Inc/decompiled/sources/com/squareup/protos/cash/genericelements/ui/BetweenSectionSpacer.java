package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import com.squareup.protos.cash.composer.app.Asset;
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
public final class BetweenSectionSpacer extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BetweenSectionSpacer> CREATOR;
    public final Size size;

    public enum Size implements WireEnum {
        LARGE(1),
        XLARGE(2),
        XLARGE_BELLOW_CELL(3);

        public final int value;
        public static final Action.Type.Companion Companion = new Action.Type.Companion();
        public static final BetweenSectionSpacer$Size$Companion$ADAPTER$1 ADAPTER = new BetweenSectionSpacer$Size$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Size.class), Syntax.PROTO_2, null);

        Size(int i) {
            this.value = i;
        }

        public static final Size fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return LARGE;
            }
            if (i == 2) {
                return XLARGE;
            }
            if (i != 3) {
                return null;
            }
            return XLARGE_BELLOW_CELL;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        BetweenSectionSpacer$Companion$ADAPTER$1 betweenSectionSpacer$Companion$ADAPTER$1 = new BetweenSectionSpacer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BetweenSectionSpacer.class), "type.googleapis.com/squareup.cash.genericelements.ui.BetweenSectionSpacer", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = betweenSectionSpacer$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(betweenSectionSpacer$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BetweenSectionSpacer(Size size, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.size = size;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BetweenSectionSpacer)) {
            return false;
        }
        BetweenSectionSpacer betweenSectionSpacer = (BetweenSectionSpacer) obj;
        return Intrinsics.areEqual(unknownFields(), betweenSectionSpacer.unknownFields()) && this.size == betweenSectionSpacer.size;
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
        Asset.Builder builder = new Asset.Builder(23);
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
        return CollectionsKt.joinToString$default(arrayList, ", ", "BetweenSectionSpacer{", "}", 0, null, null, 56);
    }
}
