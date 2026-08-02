package com.squareup.protos.payrollconnector.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.cashbusinesspayments.api.v1beta1.GetListingDetailsResponse;
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

/* loaded from: classes8.dex */
public final class PayrollProviderUiAvatar extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PayrollProviderUiAvatar> CREATOR;
    public final Color avatar_accent_color;
    public final Image avatar_url;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public Color avatar_accent_color;
        public Image avatar_url;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new PayrollProviderUiAvatar(this.avatar_url, this.avatar_accent_color, buildUnknownFields());
                default:
                    return new GetListingDetailsResponse.CoverImage(this.avatar_url, this.avatar_accent_color, buildUnknownFields());
            }
        }
    }

    static {
        PayrollProviderUiAvatar$Companion$ADAPTER$1 payrollProviderUiAvatar$Companion$ADAPTER$1 = new PayrollProviderUiAvatar$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PayrollProviderUiAvatar.class), "type.googleapis.com/squareup.payrollconnector.common.PayrollProviderUiAvatar", Syntax.PROTO_2, null, "squareup/payroll-connector/common/PayrollProviderProto.proto");
        ADAPTER = payrollProviderUiAvatar$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(payrollProviderUiAvatar$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayrollProviderUiAvatar(Image image, Color color, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.avatar_url = image;
        this.avatar_accent_color = color;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PayrollProviderUiAvatar)) {
            return false;
        }
        PayrollProviderUiAvatar payrollProviderUiAvatar = (PayrollProviderUiAvatar) obj;
        return Intrinsics.areEqual(unknownFields(), payrollProviderUiAvatar.unknownFields()) && Intrinsics.areEqual(this.avatar_url, payrollProviderUiAvatar.avatar_url) && Intrinsics.areEqual(this.avatar_accent_color, payrollProviderUiAvatar.avatar_accent_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Image image = this.avatar_url;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
        Color color = this.avatar_accent_color;
        int hashCode3 = hashCode2 + (color != null ? color.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.avatar_url = this.avatar_url;
        builder.avatar_accent_color = this.avatar_accent_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Image image = this.avatar_url;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("avatar_url=", image, arrayList);
        }
        Color color = this.avatar_accent_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("avatar_accent_color=", color, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PayrollProviderUiAvatar{", "}", 0, null, null, 56);
    }
}
