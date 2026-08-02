package com.squareup.protos.cash.composer.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aliases.Cashtag;
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
public final class LottieAsset extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LottieAsset> CREATOR;
    public final String accessibility_hint;
    public final String asset_url;

    static {
        LottieAsset$Companion$ADAPTER$1 lottieAsset$Companion$ADAPTER$1 = new LottieAsset$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LottieAsset.class), "type.googleapis.com/squareup.cash.composer.app.LottieAsset", Syntax.PROTO_2, null, "squareup/cash/composer/app/AppService.proto");
        ADAPTER = lottieAsset$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(lottieAsset$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LottieAsset(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.asset_url = str;
        this.accessibility_hint = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LottieAsset)) {
            return false;
        }
        LottieAsset lottieAsset = (LottieAsset) obj;
        return Intrinsics.areEqual(unknownFields(), lottieAsset.unknownFields()) && Intrinsics.areEqual(this.asset_url, lottieAsset.asset_url) && Intrinsics.areEqual(this.accessibility_hint, lottieAsset.accessibility_hint);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.asset_url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.accessibility_hint;
        int hashCode3 = hashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cashtag.Builder builder = new Cashtag.Builder(26);
        builder.prefix = this.asset_url;
        builder.name = this.accessibility_hint;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.asset_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "asset_url=", arrayList);
        }
        String str2 = this.accessibility_hint;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "accessibility_hint=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LottieAsset{", "}", 0, null, null, 56);
    }
}
