package com.squareup.protos.cash.cashface.api;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aliases.Cashtag;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class ProfileElement extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ProfileElement> CREATOR;
    public final String icon_url;
    public final String text;

    static {
        ProfileElement$Companion$ADAPTER$1 profileElement$Companion$ADAPTER$1 = new ProfileElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ProfileElement.class), "type.googleapis.com/squareup.cash.cashface.api.ProfileElement", Syntax.PROTO_2, null, "squareup/cash/cashface/api/ProfileDetails.proto");
        ADAPTER = profileElement$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(profileElement$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileElement(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        str2.getClass();
        byteString.getClass();
        this.icon_url = str;
        this.text = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ProfileElement)) {
            return false;
        }
        ProfileElement profileElement = (ProfileElement) obj;
        return Intrinsics.areEqual(unknownFields(), profileElement.unknownFields()) && Intrinsics.areEqual(this.icon_url, profileElement.icon_url) && Intrinsics.areEqual(this.text, profileElement.text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.text.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.icon_url);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cashtag.Builder builder = new Cashtag.Builder(16);
        builder.prefix = this.icon_url;
        builder.name = this.text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.icon_url, "icon_url=", arrayList);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.text, "text=", arrayList);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ProfileElement{", "}", 0, null, null, 56);
    }
}
