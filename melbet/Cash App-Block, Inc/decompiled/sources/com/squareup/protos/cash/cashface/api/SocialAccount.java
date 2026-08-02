package com.squareup.protos.cash.cashface.api;

import android.os.Parcelable;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.rewardly.ui.IconAsset;
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
public final class SocialAccount extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SocialAccount> CREATOR;
    public final Image icon;
    public final String name;
    public final String url;

    static {
        SocialAccount$Companion$ADAPTER$1 socialAccount$Companion$ADAPTER$1 = new SocialAccount$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SocialAccount.class), "type.googleapis.com/squareup.cash.cashface.api.SocialAccount", Syntax.PROTO_2, null, "squareup/cash/cashface/api/CommerceProfileData.proto");
        ADAPTER = socialAccount$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(socialAccount$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialAccount(Image image, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.icon = image;
        this.name = str;
        this.url = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SocialAccount)) {
            return false;
        }
        SocialAccount socialAccount = (SocialAccount) obj;
        return Intrinsics.areEqual(unknownFields(), socialAccount.unknownFields()) && Intrinsics.areEqual(this.icon, socialAccount.icon) && Intrinsics.areEqual(this.name, socialAccount.name) && Intrinsics.areEqual(this.url, socialAccount.url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Image image = this.icon;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
        String str = this.name;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.url;
        int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        IconAsset.Builder builder = new IconAsset.Builder(3);
        builder.image = this.icon;
        builder.name = this.name;
        builder.url = this.url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Image image = this.icon;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("icon=", image, arrayList);
        }
        if (this.name != null) {
            arrayList.add("name=██");
        }
        if (this.url != null) {
            arrayList.add("url=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SocialAccount{", "}", 0, null, null, 56);
    }
}
