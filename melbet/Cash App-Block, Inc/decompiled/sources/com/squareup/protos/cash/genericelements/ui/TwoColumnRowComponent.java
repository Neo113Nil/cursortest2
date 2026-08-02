package com.squareup.protos.cash.genericelements.ui;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.groups.ExpenseSlice;
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
public final class TwoColumnRowComponent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TwoColumnRowComponent> CREATOR;
    public final Action action;
    public final ColumnWidth column_width;
    public final List left;
    public final List right;
    public final Spacing spacing_between;
    public final VerticalAlignment vertical_alignment;

    public enum Spacing implements WireEnum {
        SMALL(1),
        LARGE(2);

        public final int value;
        public static final Alignment.Companion Companion = new Alignment.Companion();
        public static final TwoColumnRowComponent$Spacing$Companion$ADAPTER$1 ADAPTER = new TwoColumnRowComponent$Spacing$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Spacing.class), Syntax.PROTO_2, null);

        Spacing(int i) {
            this.value = i;
        }

        public static final Spacing fromValue(int i) {
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
        TwoColumnRowComponent$Companion$ADAPTER$1 twoColumnRowComponent$Companion$ADAPTER$1 = new TwoColumnRowComponent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TwoColumnRowComponent.class), "type.googleapis.com/squareup.cash.genericelements.ui.TwoColumnRowComponent", Syntax.PROTO_2, null, "squareup/cash/genericelements/ui/GenericTreeElements.proto");
        ADAPTER = twoColumnRowComponent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(twoColumnRowComponent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoColumnRowComponent(List list, List list2, Action action, Spacing spacing, ColumnWidth columnWidth, VerticalAlignment verticalAlignment, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.action = action;
        this.spacing_between = spacing;
        this.column_width = columnWidth;
        this.vertical_alignment = verticalAlignment;
        this.left = TransactorKt.immutableCopyOf("left", list);
        this.right = TransactorKt.immutableCopyOf("right", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TwoColumnRowComponent)) {
            return false;
        }
        TwoColumnRowComponent twoColumnRowComponent = (TwoColumnRowComponent) obj;
        return Intrinsics.areEqual(unknownFields(), twoColumnRowComponent.unknownFields()) && Intrinsics.areEqual(this.left, twoColumnRowComponent.left) && Intrinsics.areEqual(this.right, twoColumnRowComponent.right) && Intrinsics.areEqual(this.action, twoColumnRowComponent.action) && this.spacing_between == twoColumnRowComponent.spacing_between && this.column_width == twoColumnRowComponent.column_width && this.vertical_alignment == twoColumnRowComponent.vertical_alignment;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.left), 37, this.right);
        Action action = this.action;
        int hashCode = (m + (action != null ? action.hashCode() : 0)) * 37;
        Spacing spacing = this.spacing_between;
        int hashCode2 = (hashCode + (spacing != null ? spacing.hashCode() : 0)) * 37;
        ColumnWidth columnWidth = this.column_width;
        int hashCode3 = (hashCode2 + (columnWidth != null ? columnWidth.hashCode() : 0)) * 37;
        VerticalAlignment verticalAlignment = this.vertical_alignment;
        int hashCode4 = hashCode3 + (verticalAlignment != null ? verticalAlignment.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ExpenseSlice.Builder builder = new ExpenseSlice.Builder(8);
        builder.requester = this.left;
        builder.responder = this.right;
        builder.amount = this.action;
        builder.status = this.spacing_between;
        builder.slice_token = this.column_width;
        builder.action = this.vertical_alignment;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.left;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("left=", arrayList, list);
        }
        List list2 = this.right;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("right=", arrayList, list2);
        }
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        Spacing spacing = this.spacing_between;
        if (spacing != null) {
            arrayList.add("spacing_between=" + spacing);
        }
        ColumnWidth columnWidth = this.column_width;
        if (columnWidth != null) {
            arrayList.add("column_width=" + columnWidth);
        }
        VerticalAlignment verticalAlignment = this.vertical_alignment;
        if (verticalAlignment != null) {
            arrayList.add("vertical_alignment=" + verticalAlignment);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TwoColumnRowComponent{", "}", 0, null, null, 56);
    }
}
