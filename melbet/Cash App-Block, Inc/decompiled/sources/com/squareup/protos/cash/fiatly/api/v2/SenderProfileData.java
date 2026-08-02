package com.squareup.protos.cash.fiatly.api.v2;

import android.os.Parcelable;
import com.squareup.protos.franklin.api.SupportConfig;
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
public final class SenderProfileData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SenderProfileData> CREATOR;
    public final String cashtag;
    public final String display_name;
    public final String profile_photo_url;

    static {
        SenderProfileData$Companion$ADAPTER$1 senderProfileData$Companion$ADAPTER$1 = new SenderProfileData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SenderProfileData.class), "type.googleapis.com/squareup.cash.fiatly.api.v2beta.SenderProfileData", Syntax.PROTO_2, null, "squareup/cash/fiatly/api/v2beta/p2p_real_time_service.proto");
        ADAPTER = senderProfileData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(senderProfileData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SenderProfileData(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.display_name = str;
        this.cashtag = str2;
        this.profile_photo_url = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SenderProfileData)) {
            return false;
        }
        SenderProfileData senderProfileData = (SenderProfileData) obj;
        return Intrinsics.areEqual(unknownFields(), senderProfileData.unknownFields()) && Intrinsics.areEqual(this.display_name, senderProfileData.display_name) && Intrinsics.areEqual(this.cashtag, senderProfileData.cashtag) && Intrinsics.areEqual(this.profile_photo_url, senderProfileData.profile_photo_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.display_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.cashtag;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.profile_photo_url;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SupportConfig.Builder builder = new SupportConfig.Builder(10);
        builder.contact_support_url = this.display_name;
        builder.privacy_policy_url = this.cashtag;
        builder.terms_of_service_url = this.profile_photo_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.display_name != null) {
            arrayList.add("display_name=██");
        }
        if (this.cashtag != null) {
            arrayList.add("cashtag=██");
        }
        if (this.profile_photo_url != null) {
            arrayList.add("profile_photo_url=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SenderProfileData{", "}", 0, null, null, 56);
    }
}
