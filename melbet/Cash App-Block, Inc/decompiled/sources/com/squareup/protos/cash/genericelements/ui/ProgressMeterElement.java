package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.groups.ExpenseSlice;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ProgressMeterElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ProgressMeterElement> CREATOR;
    public final Alignment alignment;
    public final Color color;
    public final Image icon;
    public final Long progress;
    public final Size size;
    public final Long total;

    static {
        ProgressMeterElement$Companion$ADAPTER$1 progressMeterElement$Companion$ADAPTER$1 = new ProgressMeterElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ProgressMeterElement.class), "type.googleapis.com/squareup.cash.genericelements.ui.ProgressMeterElement", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = progressMeterElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(progressMeterElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressMeterElement(Image image, Color color, Long l, Long l2, Alignment alignment, Size size, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.icon = image;
        this.color = color;
        this.progress = l;
        this.total = l2;
        this.alignment = alignment;
        this.size = size;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProgressMeterElement)) {
            return false;
        }
        ProgressMeterElement progressMeterElement = (ProgressMeterElement) obj;
        return Intrinsics.areEqual(unknownFields(), progressMeterElement.unknownFields()) && Intrinsics.areEqual(this.icon, progressMeterElement.icon) && Intrinsics.areEqual(this.color, progressMeterElement.color) && Intrinsics.areEqual(this.progress, progressMeterElement.progress) && Intrinsics.areEqual(this.total, progressMeterElement.total) && this.alignment == progressMeterElement.alignment && this.size == progressMeterElement.size;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Image image = this.icon;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
        Color color = this.color;
        int hashCode3 = (hashCode2 + (color != null ? color.hashCode() : 0)) * 37;
        Long l = this.progress;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.total;
        int hashCode5 = (hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0)) * 37;
        Alignment alignment = this.alignment;
        int hashCode6 = (hashCode5 + (alignment != null ? alignment.hashCode() : 0)) * 37;
        Size size = this.size;
        int hashCode7 = hashCode6 + (size != null ? size.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ExpenseSlice.Builder builder = new ExpenseSlice.Builder(7);
        builder.requester = this.icon;
        builder.responder = this.color;
        builder.amount = this.progress;
        builder.status = this.total;
        builder.slice_token = this.alignment;
        builder.action = this.size;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Image image = this.icon;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("icon=", image, arrayList);
        }
        Color color = this.color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("color=", color, arrayList);
        }
        Long l = this.progress;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("progress=", l, arrayList);
        }
        Long l2 = this.total;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("total=", l2, arrayList);
        }
        Alignment alignment = this.alignment;
        if (alignment != null) {
            arrayList.add("alignment=" + alignment);
        }
        Size size = this.size;
        if (size != null) {
            arrayList.add("size=" + size);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ProgressMeterElement{", "}", 0, null, null, 56);
    }
}
