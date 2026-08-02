package com.squareup.protos.cash.supportal.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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

/* loaded from: classes8.dex */
public final class MatchedNode extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MatchedNode> CREATOR;
    public final String subtitle;
    public final String title;
    public final String token;

    static {
        MatchedNode$Companion$ADAPTER$1 matchedNode$Companion$ADAPTER$1 = new MatchedNode$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MatchedNode.class), "type.googleapis.com/squareup.cash.supportal.app.MatchedNode", Syntax.PROTO_2, null, "squareup/cash/supportal/app.proto");
        ADAPTER = matchedNode$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(matchedNode$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MatchedNode(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
        this.title = str2;
        this.subtitle = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MatchedNode)) {
            return false;
        }
        MatchedNode matchedNode = (MatchedNode) obj;
        return Intrinsics.areEqual(unknownFields(), matchedNode.unknownFields()) && Intrinsics.areEqual(this.token, matchedNode.token) && Intrinsics.areEqual(this.title, matchedNode.title) && Intrinsics.areEqual(this.subtitle, matchedNode.subtitle);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.subtitle;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SupportConfig.Builder builder = new SupportConfig.Builder(27);
        builder.contact_support_url = this.token;
        builder.privacy_policy_url = this.title;
        builder.terms_of_service_url = this.subtitle;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        String str2 = this.title;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "title=", arrayList);
        }
        String str3 = this.subtitle;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "subtitle=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MatchedNode{", "}", 0, null, null, 56);
    }
}
