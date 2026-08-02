package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class LocalShoppingCart extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalShoppingCart> CREATOR;
    public final List applied_discount_codes;
    public final List lines;
    public final LocalMoney lines_subtotal;
    public final LocalMoney lines_subtotal_before_discounts;

    public final class Builder extends Message.Builder {
        public List applied_discount_codes;
        public List lines;
        public LocalMoney lines_subtotal;
        public LocalMoney lines_subtotal_before_discounts;

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            return new LocalShoppingCart(this.lines, this.lines_subtotal, this.lines_subtotal_before_discounts, this.applied_discount_codes, buildUnknownFields());
        }
    }

    static {
        LocalShoppingCart$Companion$ADAPTER$1 localShoppingCart$Companion$ADAPTER$1 = new LocalShoppingCart$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalShoppingCart.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalShoppingCart", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_user_intent.proto");
        ADAPTER = localShoppingCart$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localShoppingCart$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalShoppingCart(List list, LocalMoney localMoney, LocalMoney localMoney2, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.lines_subtotal = localMoney;
        this.lines_subtotal_before_discounts = localMoney2;
        this.lines = TransactorKt.immutableCopyOf("lines", list);
        this.applied_discount_codes = TransactorKt.immutableCopyOf("applied_discount_codes", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalShoppingCart)) {
            return false;
        }
        LocalShoppingCart localShoppingCart = (LocalShoppingCart) obj;
        return Intrinsics.areEqual(unknownFields(), localShoppingCart.unknownFields()) && Intrinsics.areEqual(this.lines, localShoppingCart.lines) && Intrinsics.areEqual(this.lines_subtotal, localShoppingCart.lines_subtotal) && Intrinsics.areEqual(this.lines_subtotal_before_discounts, localShoppingCart.lines_subtotal_before_discounts) && Intrinsics.areEqual(this.applied_discount_codes, localShoppingCart.applied_discount_codes);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.lines);
        LocalMoney localMoney = this.lines_subtotal;
        int hashCode = (m + (localMoney != null ? localMoney.hashCode() : 0)) * 37;
        LocalMoney localMoney2 = this.lines_subtotal_before_discounts;
        int hashCode2 = this.applied_discount_codes.hashCode() + ((hashCode + (localMoney2 != null ? localMoney2.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.lines = this.lines;
        builder.lines_subtotal = this.lines_subtotal;
        builder.lines_subtotal_before_discounts = this.lines_subtotal_before_discounts;
        builder.applied_discount_codes = this.applied_discount_codes;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.lines;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("lines=", arrayList, list);
        }
        LocalMoney localMoney = this.lines_subtotal;
        if (localMoney != null) {
            SizeMode$EnumUnboxingLocalUtility.m("lines_subtotal=", localMoney, arrayList);
        }
        LocalMoney localMoney2 = this.lines_subtotal_before_discounts;
        if (localMoney2 != null) {
            SizeMode$EnumUnboxingLocalUtility.m("lines_subtotal_before_discounts=", localMoney2, arrayList);
        }
        List list2 = this.applied_discount_codes;
        if (!list2.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("applied_discount_codes=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalShoppingCart{", "}", 0, null, null, 56);
    }
}
