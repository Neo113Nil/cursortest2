package com.squareup.cash.supportarticles.app.v1;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.AnnexBUtils;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.Error;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class SupportLink extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SupportLink> CREATOR;
    public final List analytics_tags;
    public final Boolean include_in_recently_viewed;
    public final String link_token;
    public final String preview_text;
    public final AnnexBUtils target;
    public final String title_text;

    static {
        SupportLink$Companion$ADAPTER$1 supportLink$Companion$ADAPTER$1 = new SupportLink$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SupportLink.class), "type.googleapis.com/squareup.cash.supportarticles.app.v1beta1.SupportLink", Syntax.PROTO_3, null, "squareup/cash/supportarticles/app/v1beta1/support_link.proto");
        ADAPTER = supportLink$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(supportLink$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportLink(String str, String str2, AnnexBUtils annexBUtils, List list, String str3, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title_text = str;
        this.preview_text = str2;
        this.target = annexBUtils;
        this.link_token = str3;
        this.include_in_recently_viewed = bool;
        this.analytics_tags = TransactorKt.immutableCopyOf("analytics_tags", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SupportLink)) {
            return false;
        }
        SupportLink supportLink = (SupportLink) obj;
        return Intrinsics.areEqual(unknownFields(), supportLink.unknownFields()) && Intrinsics.areEqual(this.title_text, supportLink.title_text) && Intrinsics.areEqual(this.preview_text, supportLink.preview_text) && Intrinsics.areEqual(this.target, supportLink.target) && Intrinsics.areEqual(this.analytics_tags, supportLink.analytics_tags) && Intrinsics.areEqual(this.link_token, supportLink.link_token) && Intrinsics.areEqual(this.include_in_recently_viewed, supportLink.include_in_recently_viewed);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.title_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.preview_text;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        AnnexBUtils annexBUtils = this.target;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode3 + (annexBUtils != null ? annexBUtils.hashCode() : 0)) * 37, 37, this.analytics_tags);
        String str3 = this.link_token;
        int hashCode4 = (m + (str3 != null ? str3.hashCode() : 0)) * 37;
        Boolean bool = this.include_in_recently_viewed;
        int hashCode5 = hashCode4 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Error.Builder builder = new Error.Builder(5, false);
        builder.description = this.title_text;
        builder.field = this.preview_text;
        builder.category = this.target;
        builder.code = this.analytics_tags;
        builder.metadata = this.link_token;
        builder.retryable = this.include_in_recently_viewed;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.title_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title_text=", arrayList);
        }
        String str2 = this.preview_text;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "preview_text=", arrayList);
        }
        AnnexBUtils annexBUtils = this.target;
        if (annexBUtils != null) {
            arrayList.add("target=" + annexBUtils);
        }
        List list = this.analytics_tags;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("analytics_tags=", arrayList, list);
        }
        String str3 = this.link_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "link_token=", arrayList);
        }
        Boolean bool = this.include_in_recently_viewed;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("include_in_recently_viewed=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SupportLink{", "}", 0, null, null, 56);
    }
}
