package com.squareup.cash.supportarticles.app.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.supportarticles.app.v1.GetSupportArticleResponse;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/squareup/cash/supportarticles/app/v1/GetSupportArticleForTransactionResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/cash/supportarticles/app/v1/GetSupportArticleResponse$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GetSupportArticleForTransactionResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetSupportArticleForTransactionResponse> CREATOR;
    public final SupportArticle article;
    public final String stylesheet_url;

    static {
        GetSupportArticleForTransactionResponse$Companion$ADAPTER$1 getSupportArticleForTransactionResponse$Companion$ADAPTER$1 = new GetSupportArticleForTransactionResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetSupportArticleForTransactionResponse.class), "type.googleapis.com/squareup.cash.supportarticles.app.v1beta1.GetSupportArticleForTransactionResponse", Syntax.PROTO_3, null, "squareup/cash/supportarticles/app/v1beta1/app.proto");
        ADAPTER = getSupportArticleForTransactionResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getSupportArticleForTransactionResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSupportArticleForTransactionResponse(SupportArticle supportArticle, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.article = supportArticle;
        this.stylesheet_url = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetSupportArticleForTransactionResponse)) {
            return false;
        }
        GetSupportArticleForTransactionResponse getSupportArticleForTransactionResponse = (GetSupportArticleForTransactionResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getSupportArticleForTransactionResponse.unknownFields()) && Intrinsics.areEqual(this.article, getSupportArticleForTransactionResponse.article) && Intrinsics.areEqual(this.stylesheet_url, getSupportArticleForTransactionResponse.stylesheet_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SupportArticle supportArticle = this.article;
        int hashCode2 = (hashCode + (supportArticle != null ? supportArticle.hashCode() : 0)) * 37;
        String str = this.stylesheet_url;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GetSupportArticleResponse.Builder builder = new GetSupportArticleResponse.Builder(1);
        builder.article = this.article;
        builder.stylesheet_url = this.stylesheet_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SupportArticle supportArticle = this.article;
        if (supportArticle != null) {
            arrayList.add("article=" + supportArticle);
        }
        String str = this.stylesheet_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "stylesheet_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetSupportArticleForTransactionResponse{", "}", 0, null, null, 56);
    }
}
