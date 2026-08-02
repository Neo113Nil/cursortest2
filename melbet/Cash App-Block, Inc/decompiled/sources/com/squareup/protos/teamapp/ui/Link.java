package com.squareup.protos.teamapp.ui;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.investcrypto.resources.Order;
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
public final class Link extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Link> CREATOR;
    public final String deep_link;
    public final String web_url;
    public final Boolean web_url_hides_navigation;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public String deep_link;
        public String web_url;
        public Boolean web_url_hides_navigation;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new Link(this.web_url_hides_navigation, this.web_url, this.deep_link, buildUnknownFields());
                default:
                    return new Order.FeatureMetadata.UsdOnLnPaymentMetadata(this.web_url_hides_navigation, this.web_url, this.deep_link, buildUnknownFields());
            }
        }
    }

    static {
        Link$Companion$ADAPTER$1 link$Companion$ADAPTER$1 = new Link$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Link.class), "type.googleapis.com/squareup.teamapp.ui.Link", Syntax.PROTO_2, null, "squareup/teamapp/ui/models.proto");
        ADAPTER = link$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(link$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Link(Boolean bool, String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.web_url = str;
        this.web_url_hides_navigation = bool;
        this.deep_link = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Link)) {
            return false;
        }
        Link link = (Link) obj;
        return Intrinsics.areEqual(unknownFields(), link.unknownFields()) && Intrinsics.areEqual(this.web_url, link.web_url) && Intrinsics.areEqual(this.web_url_hides_navigation, link.web_url_hides_navigation) && Intrinsics.areEqual(this.deep_link, link.deep_link);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.web_url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Boolean bool = this.web_url_hides_navigation;
        int hashCode3 = (hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        String str2 = this.deep_link;
        int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.web_url = this.web_url;
        builder.web_url_hides_navigation = this.web_url_hides_navigation;
        builder.deep_link = this.deep_link;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.web_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "web_url=", arrayList);
        }
        Boolean bool = this.web_url_hides_navigation;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("web_url_hides_navigation=", bool, arrayList);
        }
        String str2 = this.deep_link;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "deep_link=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Link{", "}", 0, null, null, 56);
    }
}
