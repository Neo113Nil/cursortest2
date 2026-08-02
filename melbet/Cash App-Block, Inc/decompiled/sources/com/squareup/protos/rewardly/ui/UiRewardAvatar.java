package com.squareup.protos.rewardly.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.UiDda;
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
public final class UiRewardAvatar extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UiRewardAvatar> CREATOR;
    public final String color;
    public final Image image;
    public final Color themed_color;
    public final String url;

    static {
        UiRewardAvatar$Companion$ADAPTER$1 uiRewardAvatar$Companion$ADAPTER$1 = new UiRewardAvatar$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UiRewardAvatar.class), "type.googleapis.com/squareup.rewardly.ui.UiRewardAvatar", Syntax.PROTO_2, null, "squareup/rewardly/ui.proto");
        ADAPTER = uiRewardAvatar$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(uiRewardAvatar$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UiRewardAvatar(Image image, Color color, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.url = str;
        this.color = str2;
        this.image = image;
        this.themed_color = color;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UiRewardAvatar)) {
            return false;
        }
        UiRewardAvatar uiRewardAvatar = (UiRewardAvatar) obj;
        return Intrinsics.areEqual(unknownFields(), uiRewardAvatar.unknownFields()) && Intrinsics.areEqual(this.url, uiRewardAvatar.url) && Intrinsics.areEqual(this.color, uiRewardAvatar.color) && Intrinsics.areEqual(this.image, uiRewardAvatar.image) && Intrinsics.areEqual(this.themed_color, uiRewardAvatar.themed_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.color;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Image image = this.image;
        int hashCode4 = (hashCode3 + (image != null ? image.hashCode() : 0)) * 37;
        Color color = this.themed_color;
        int hashCode5 = hashCode4 + (color != null ? color.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiDda.Builder builder = new UiDda.Builder(25);
        builder.account = this.url;
        builder.enabled = this.color;
        builder.button = this.image;
        builder.dda_form = this.themed_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "url=", arrayList);
        }
        String str2 = this.color;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "color=", arrayList);
        }
        Image image = this.image;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
        }
        Color color = this.themed_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("themed_color=", color, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UiRewardAvatar{", "}", 0, null, null, 56);
    }
}
