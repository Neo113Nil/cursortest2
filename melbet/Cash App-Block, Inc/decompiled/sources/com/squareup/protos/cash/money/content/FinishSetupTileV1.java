package com.squareup.protos.cash.money.content;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.pools.PoolParticipant;
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
public final class FinishSetupTileV1 extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FinishSetupTileV1> CREATOR;
    public final String client_route;
    public final Boolean completed;
    public final Image image;
    public final Boolean is_badged;
    public final Integer tasks_completed;
    public final Integer tasks_total;
    public final String title;

    static {
        FinishSetupTileV1$Companion$ADAPTER$1 finishSetupTileV1$Companion$ADAPTER$1 = new FinishSetupTileV1$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FinishSetupTileV1.class), "type.googleapis.com/squareup.cash.money.FinishSetupTileV1", Syntax.PROTO_2, null, "squareup/cash/money/content/finish_setup_tile.proto");
        ADAPTER = finishSetupTileV1$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(finishSetupTileV1$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinishSetupTileV1(String str, Integer num, Integer num2, Image image, String str2, Boolean bool, Boolean bool2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = str;
        this.tasks_completed = num;
        this.tasks_total = num2;
        this.image = image;
        this.client_route = str2;
        this.completed = bool;
        this.is_badged = bool2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FinishSetupTileV1)) {
            return false;
        }
        FinishSetupTileV1 finishSetupTileV1 = (FinishSetupTileV1) obj;
        return Intrinsics.areEqual(unknownFields(), finishSetupTileV1.unknownFields()) && Intrinsics.areEqual(this.title, finishSetupTileV1.title) && Intrinsics.areEqual(this.tasks_completed, finishSetupTileV1.tasks_completed) && Intrinsics.areEqual(this.tasks_total, finishSetupTileV1.tasks_total) && Intrinsics.areEqual(this.image, finishSetupTileV1.image) && Intrinsics.areEqual(this.client_route, finishSetupTileV1.client_route) && Intrinsics.areEqual(this.completed, finishSetupTileV1.completed) && Intrinsics.areEqual(this.is_badged, finishSetupTileV1.is_badged);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Integer num = this.tasks_completed;
        int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.tasks_total;
        int hashCode4 = (hashCode3 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        Image image = this.image;
        int hashCode5 = (hashCode4 + (image != null ? image.hashCode() : 0)) * 37;
        String str2 = this.client_route;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool = this.completed;
        int hashCode7 = (hashCode6 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.is_badged;
        int hashCode8 = hashCode7 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        PoolParticipant.Builder builder = new PoolParticipant.Builder(8);
        builder.customer_identifier = this.title;
        builder.profile_photo_url = this.tasks_completed;
        builder.cashtag = this.tasks_total;
        builder.added_at = this.image;
        builder.full_name = this.client_route;
        builder.participant_type = this.completed;
        builder.aggregated_contribution_amount = this.is_badged;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        Integer num = this.tasks_completed;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("tasks_completed=", num, arrayList);
        }
        Integer num2 = this.tasks_total;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("tasks_total=", num2, arrayList);
        }
        Image image = this.image;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
        }
        String str2 = this.client_route;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "client_route=", arrayList);
        }
        Boolean bool = this.completed;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("completed=", bool, arrayList);
        }
        Boolean bool2 = this.is_badged;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("is_badged=", bool2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FinishSetupTileV1{", "}", 0, null, null, 56);
    }
}
