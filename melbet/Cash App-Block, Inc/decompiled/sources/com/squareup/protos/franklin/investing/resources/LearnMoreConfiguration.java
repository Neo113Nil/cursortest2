package com.squareup.protos.franklin.investing.resources;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.ProfileRow;
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
public final class LearnMoreConfiguration extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LearnMoreConfiguration> CREATOR;
    public final String body_text;
    public final String image_url;
    public final String link_text;
    public final String link_url;
    public final String title_text;

    static {
        LearnMoreConfiguration$Companion$ADAPTER$1 learnMoreConfiguration$Companion$ADAPTER$1 = new LearnMoreConfiguration$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LearnMoreConfiguration.class), "type.googleapis.com/squareup.franklin.investing.resources.LearnMoreConfiguration", Syntax.PROTO_2, null, "squareup/franklin/investing/resources.proto");
        ADAPTER = learnMoreConfiguration$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(learnMoreConfiguration$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LearnMoreConfiguration(String str, String str2, String str3, String str4, String str5, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.link_text = str;
        this.link_url = str2;
        this.image_url = str3;
        this.title_text = str4;
        this.body_text = str5;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LearnMoreConfiguration)) {
            return false;
        }
        LearnMoreConfiguration learnMoreConfiguration = (LearnMoreConfiguration) obj;
        return Intrinsics.areEqual(unknownFields(), learnMoreConfiguration.unknownFields()) && Intrinsics.areEqual(this.link_text, learnMoreConfiguration.link_text) && Intrinsics.areEqual(this.link_url, learnMoreConfiguration.link_url) && Intrinsics.areEqual(this.image_url, learnMoreConfiguration.image_url) && Intrinsics.areEqual(this.title_text, learnMoreConfiguration.title_text) && Intrinsics.areEqual(this.body_text, learnMoreConfiguration.body_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.link_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.link_url;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.image_url;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.title_text;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.body_text;
        int hashCode6 = hashCode5 + (str5 != null ? str5.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ProfileRow.Builder builder = new ProfileRow.Builder(11);
        builder.client_route = this.link_text;
        builder.icon_id = this.link_url;
        builder.title = this.image_url;
        builder.subtitle = this.title_text;
        builder.call_to_action = this.body_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.link_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "link_text=", arrayList);
        }
        String str2 = this.link_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "link_url=", arrayList);
        }
        String str3 = this.image_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "image_url=", arrayList);
        }
        String str4 = this.title_text;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "title_text=", arrayList);
        }
        String str5 = this.body_text;
        if (str5 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str5, "body_text=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LearnMoreConfiguration{", "}", 0, null, null, 56);
    }
}
