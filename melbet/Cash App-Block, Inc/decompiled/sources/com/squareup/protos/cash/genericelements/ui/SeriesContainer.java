package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.grantly.api.Card;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SeriesContainer extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SeriesContainer> CREATOR;
    public final StyleAttributes attributes;
    public final Boolean ignoreVerticalSpacing;
    public final List items;
    public final Scroll scroll;

    public enum Scroll implements WireEnum {
        VERTICAL(1),
        HORIZONTAL(2),
        HORIZONTAL_PAGINATED(3);

        public final int value;
        public static final Alignment.Companion Companion = new Alignment.Companion();
        public static final SeriesContainer$Scroll$Companion$ADAPTER$1 ADAPTER = new SeriesContainer$Scroll$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Scroll.class), Syntax.PROTO_2, null);

        Scroll(int i) {
            this.value = i;
        }

        public static final Scroll fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return VERTICAL;
            }
            if (i == 2) {
                return HORIZONTAL;
            }
            if (i != 3) {
                return null;
            }
            return HORIZONTAL_PAGINATED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        SeriesContainer$Companion$ADAPTER$1 seriesContainer$Companion$ADAPTER$1 = new SeriesContainer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SeriesContainer.class), "type.googleapis.com/squareup.cash.genericelements.ui.SeriesContainer", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = seriesContainer$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(seriesContainer$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeriesContainer(List list, Scroll scroll, Boolean bool, StyleAttributes styleAttributes, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.scroll = scroll;
        this.ignoreVerticalSpacing = bool;
        this.attributes = styleAttributes;
        this.items = TransactorKt.immutableCopyOf("items", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SeriesContainer)) {
            return false;
        }
        SeriesContainer seriesContainer = (SeriesContainer) obj;
        return Intrinsics.areEqual(unknownFields(), seriesContainer.unknownFields()) && Intrinsics.areEqual(this.items, seriesContainer.items) && this.scroll == seriesContainer.scroll && Intrinsics.areEqual(this.ignoreVerticalSpacing, seriesContainer.ignoreVerticalSpacing) && Intrinsics.areEqual(this.attributes, seriesContainer.attributes);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.items);
        Scroll scroll = this.scroll;
        int hashCode = (m + (scroll != null ? scroll.hashCode() : 0)) * 37;
        Boolean bool = this.ignoreVerticalSpacing;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        StyleAttributes styleAttributes = this.attributes;
        int hashCode3 = hashCode2 + (styleAttributes != null ? styleAttributes.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Card.CardPii.Builder builder = new Card.CardPii.Builder(15, false);
        builder.postal_code = this.items;
        builder.last_four_digits = this.scroll;
        builder.expiration = this.ignoreVerticalSpacing;
        builder.ciphertext_ = this.attributes;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.items;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("items=", arrayList, list);
        }
        Scroll scroll = this.scroll;
        if (scroll != null) {
            arrayList.add("scroll=" + scroll);
        }
        Boolean bool = this.ignoreVerticalSpacing;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("ignoreVerticalSpacing=", bool, arrayList);
        }
        StyleAttributes styleAttributes = this.attributes;
        if (styleAttributes != null) {
            arrayList.add("attributes=" + styleAttributes);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SeriesContainer{", "}", 0, null, null, 56);
    }
}
