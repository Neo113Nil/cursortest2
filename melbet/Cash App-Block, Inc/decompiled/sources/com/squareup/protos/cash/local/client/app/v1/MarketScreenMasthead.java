package com.squareup.protos.cash.local.client.app.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.protos.cash.local.client.v1.LocalImage;
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
public final class MarketScreenMasthead extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MarketScreenMasthead> CREATOR;
    public final LocalImage logo;
    public final String title;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public LocalImage logo;
        public String title;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new MarketScreenMasthead(this.logo, this.title, buildUnknownFields());
                default:
                    return new GetNeighborhoodsTabContentResponse.LocalCashExplainer(this.logo, this.title, buildUnknownFields());
            }
        }
    }

    static {
        MarketScreenMasthead$Companion$ADAPTER$1 marketScreenMasthead$Companion$ADAPTER$1 = new MarketScreenMasthead$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MarketScreenMasthead.class), "type.googleapis.com/squareup.cash.local.client.app.v1.MarketScreenMasthead", Syntax.PROTO_2, null, "squareup/cash/local/client/app/v1/model.proto");
        ADAPTER = marketScreenMasthead$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(marketScreenMasthead$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketScreenMasthead(LocalImage localImage, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = str;
        this.logo = localImage;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MarketScreenMasthead)) {
            return false;
        }
        MarketScreenMasthead marketScreenMasthead = (MarketScreenMasthead) obj;
        return Intrinsics.areEqual(unknownFields(), marketScreenMasthead.unknownFields()) && Intrinsics.areEqual(this.title, marketScreenMasthead.title) && Intrinsics.areEqual(this.logo, marketScreenMasthead.logo);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LocalImage localImage = this.logo;
        int hashCode3 = hashCode2 + (localImage != null ? localImage.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.title = this.title;
        builder.logo = this.logo;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        LocalImage localImage = this.logo;
        if (localImage != null) {
            SizeMode$EnumUnboxingLocalUtility.m("logo=", localImage, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MarketScreenMasthead{", "}", 0, null, null, 56);
    }
}
