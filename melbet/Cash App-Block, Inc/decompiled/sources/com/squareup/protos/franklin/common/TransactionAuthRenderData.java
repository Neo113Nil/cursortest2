package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.data.LinkResult;
import com.squareup.protos.franklin.ui.UiDda;
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

/* loaded from: classes8.dex */
public final class TransactionAuthRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TransactionAuthRenderData> CREATOR;
    public final String dark_theme_overlay_icon_url;
    public final String overlay_icon_url;
    public final TransactionAuthRequestStatus request_status;
    public final String view_action_url;

    public enum TransactionAuthRequestStatus implements WireEnum {
        PENDING(1),
        RESPONDED(2);

        public final int value;
        public static final LinkResult.Companion Companion = new LinkResult.Companion();
        public static final TransactionAuthRenderData$TransactionAuthRequestStatus$Companion$ADAPTER$1 ADAPTER = new TransactionAuthRenderData$TransactionAuthRequestStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(TransactionAuthRequestStatus.class), Syntax.PROTO_2, null);

        TransactionAuthRequestStatus(int i) {
            this.value = i;
        }

        public static final TransactionAuthRequestStatus fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return PENDING;
            }
            if (i != 2) {
                return null;
            }
            return RESPONDED;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        TransactionAuthRenderData$Companion$ADAPTER$1 transactionAuthRenderData$Companion$ADAPTER$1 = new TransactionAuthRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TransactionAuthRenderData.class), "type.googleapis.com/squareup.franklin.TransactionAuthRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = transactionAuthRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(transactionAuthRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionAuthRenderData(TransactionAuthRequestStatus transactionAuthRequestStatus, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.request_status = transactionAuthRequestStatus;
        this.view_action_url = str;
        this.overlay_icon_url = str2;
        this.dark_theme_overlay_icon_url = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TransactionAuthRenderData)) {
            return false;
        }
        TransactionAuthRenderData transactionAuthRenderData = (TransactionAuthRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), transactionAuthRenderData.unknownFields()) && this.request_status == transactionAuthRenderData.request_status && Intrinsics.areEqual(this.view_action_url, transactionAuthRenderData.view_action_url) && Intrinsics.areEqual(this.overlay_icon_url, transactionAuthRenderData.overlay_icon_url) && Intrinsics.areEqual(this.dark_theme_overlay_icon_url, transactionAuthRenderData.dark_theme_overlay_icon_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        TransactionAuthRequestStatus transactionAuthRequestStatus = this.request_status;
        int hashCode2 = (hashCode + (transactionAuthRequestStatus != null ? transactionAuthRequestStatus.hashCode() : 0)) * 37;
        String str = this.view_action_url;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.overlay_icon_url;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.dark_theme_overlay_icon_url;
        int hashCode5 = hashCode4 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiDda.Builder builder = new UiDda.Builder(1);
        builder.account = this.request_status;
        builder.enabled = this.view_action_url;
        builder.button = this.overlay_icon_url;
        builder.dda_form = this.dark_theme_overlay_icon_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        TransactionAuthRequestStatus transactionAuthRequestStatus = this.request_status;
        if (transactionAuthRequestStatus != null) {
            arrayList.add("request_status=" + transactionAuthRequestStatus);
        }
        String str = this.view_action_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "view_action_url=", arrayList);
        }
        String str2 = this.overlay_icon_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "overlay_icon_url=", arrayList);
        }
        String str3 = this.dark_theme_overlay_icon_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "dark_theme_overlay_icon_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TransactionAuthRenderData{", "}", 0, null, null, 56);
    }
}
