package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
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

/* loaded from: classes.dex */
public final class LocalCashInformationalContent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LocalCashInformationalContent> CREATOR;
    public final LocalButton button;
    public final String header;
    public final LocalImage image;
    public final String legal_text;
    public final LocalNumberedList list;

    static {
        LocalCashInformationalContent$Companion$ADAPTER$1 localCashInformationalContent$Companion$ADAPTER$1 = new LocalCashInformationalContent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LocalCashInformationalContent.class), "type.googleapis.com/squareup.cash.local.client.v1.LocalCashInformationalContent", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_cash.proto");
        ADAPTER = localCashInformationalContent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(localCashInformationalContent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalCashInformationalContent(LocalNumberedList localNumberedList, String str, String str2, LocalImage localImage, LocalButton localButton, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.list = localNumberedList;
        this.legal_text = str;
        this.header = str2;
        this.image = localImage;
        this.button = localButton;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalCashInformationalContent)) {
            return false;
        }
        LocalCashInformationalContent localCashInformationalContent = (LocalCashInformationalContent) obj;
        return Intrinsics.areEqual(unknownFields(), localCashInformationalContent.unknownFields()) && Intrinsics.areEqual(this.list, localCashInformationalContent.list) && Intrinsics.areEqual(this.legal_text, localCashInformationalContent.legal_text) && Intrinsics.areEqual(this.header, localCashInformationalContent.header) && Intrinsics.areEqual(this.image, localCashInformationalContent.image) && Intrinsics.areEqual(this.button, localCashInformationalContent.button);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalNumberedList localNumberedList = this.list;
        int hashCode2 = (hashCode + (localNumberedList != null ? localNumberedList.hashCode() : 0)) * 37;
        String str = this.legal_text;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.header;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        LocalImage localImage = this.image;
        int hashCode5 = (hashCode4 + (localImage != null ? localImage.hashCode() : 0)) * 37;
        LocalButton localButton = this.button;
        int hashCode6 = hashCode5 + (localButton != null ? localButton.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BrandBanner.Builder builder = new BrandBanner.Builder(6);
        builder.title = this.list;
        builder.subtitle = this.legal_text;
        builder.action = this.header;
        builder.icon = this.image;
        builder.icon_background_color = this.button;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalNumberedList localNumberedList = this.list;
        if (localNumberedList != null) {
            arrayList.add("list=" + localNumberedList);
        }
        String str = this.legal_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "legal_text=", arrayList);
        }
        String str2 = this.header;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "header=", arrayList);
        }
        LocalImage localImage = this.image;
        if (localImage != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image=", localImage, arrayList);
        }
        LocalButton localButton = this.button;
        if (localButton != null) {
            arrayList.add("button=" + localButton);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LocalCashInformationalContent{", "}", 0, null, null, 56);
    }
}
