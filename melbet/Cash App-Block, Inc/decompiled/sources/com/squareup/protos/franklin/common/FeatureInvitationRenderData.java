package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.document.Document;
import com.squareup.protos.franklin.ui.UiControl;
import com.squareup.protos.invest.ui.ClientDriven;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class FeatureInvitationRenderData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<FeatureInvitationRenderData> CREATOR;
    public final String action_url;
    public final Feature feature;
    public final String icon_url;
    public final String invitee_alias;
    public final String invitee_full_name;
    public final Status status;

    public enum Feature implements WireEnum {
        TEEN_SPONSORSHIP_REQUEST(0),
        SPONSOR_SPONSORSHIP_REQUEST(1);

        public static final FeatureInvitationRenderData$Feature$Companion$ADAPTER$1 ADAPTER;
        public static final ClientDriven.Companion Companion;
        public final int value;

        static {
            Feature feature = TEEN_SPONSORSHIP_REQUEST;
            Companion = new ClientDriven.Companion();
            ADAPTER = new FeatureInvitationRenderData$Feature$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Feature.class), Syntax.PROTO_2, feature);
        }

        Feature(int i) {
            this.value = i;
        }

        public static final Feature fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return TEEN_SPONSORSHIP_REQUEST;
            }
            if (i != 1) {
                return null;
            }
            return SPONSOR_SPONSORSHIP_REQUEST;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    public enum Status implements WireEnum {
        PENDING(0),
        LINKED(1),
        ACCEPTED(2),
        DECLINED(3),
        EXPIRED(4),
        CANCELED(5),
        ABANDONED(6);

        public static final FeatureInvitationRenderData$Status$Companion$ADAPTER$1 ADAPTER;
        public static final UiControl.Type.Companion Companion;
        public final int value;

        static {
            Status status = PENDING;
            Companion = new UiControl.Type.Companion();
            ADAPTER = new FeatureInvitationRenderData$Status$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Status.class), Syntax.PROTO_2, status);
        }

        Status(int i) {
            this.value = i;
        }

        public static final Status fromValue(int i) {
            Companion.getClass();
            switch (i) {
                case 0:
                    return PENDING;
                case 1:
                    return LINKED;
                case 2:
                    return ACCEPTED;
                case 3:
                    return DECLINED;
                case 4:
                    return EXPIRED;
                case 5:
                    return CANCELED;
                case 6:
                    return ABANDONED;
                default:
                    return null;
            }
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        FeatureInvitationRenderData$Companion$ADAPTER$1 featureInvitationRenderData$Companion$ADAPTER$1 = new FeatureInvitationRenderData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FeatureInvitationRenderData.class), "type.googleapis.com/squareup.franklin.FeatureInvitationRenderData", Syntax.PROTO_2, null, "squareup/franklin/render_data.proto");
        ADAPTER = featureInvitationRenderData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(featureInvitationRenderData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeatureInvitationRenderData(Status status, Feature feature, String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.status = status;
        this.feature = feature;
        this.action_url = str;
        this.icon_url = str2;
        this.invitee_alias = str3;
        this.invitee_full_name = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FeatureInvitationRenderData)) {
            return false;
        }
        FeatureInvitationRenderData featureInvitationRenderData = (FeatureInvitationRenderData) obj;
        return Intrinsics.areEqual(unknownFields(), featureInvitationRenderData.unknownFields()) && this.status == featureInvitationRenderData.status && this.feature == featureInvitationRenderData.feature && Intrinsics.areEqual(this.action_url, featureInvitationRenderData.action_url) && Intrinsics.areEqual(this.icon_url, featureInvitationRenderData.icon_url) && Intrinsics.areEqual(this.invitee_alias, featureInvitationRenderData.invitee_alias) && Intrinsics.areEqual(this.invitee_full_name, featureInvitationRenderData.invitee_full_name);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Status status = this.status;
        int hashCode2 = (hashCode + (status != null ? status.hashCode() : 0)) * 37;
        Feature feature = this.feature;
        int hashCode3 = (hashCode2 + (feature != null ? feature.hashCode() : 0)) * 37;
        String str = this.action_url;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.icon_url;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.invitee_alias;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.invitee_full_name;
        int hashCode7 = hashCode6 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Document.Builder builder = new Document.Builder(29, false);
        builder.owner_token = this.status;
        builder.document_date = this.feature;
        builder.category = this.action_url;
        builder.token = this.icon_url;
        builder.title = this.invitee_alias;
        builder.url = this.invitee_full_name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Status status = this.status;
        if (status != null) {
            arrayList.add("status=" + status);
        }
        Feature feature = this.feature;
        if (feature != null) {
            arrayList.add("feature=" + feature);
        }
        String str = this.action_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "action_url=", arrayList);
        }
        String str2 = this.icon_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "icon_url=", arrayList);
        }
        if (this.invitee_alias != null) {
            arrayList.add("invitee_alias=██");
        }
        if (this.invitee_full_name != null) {
            arrayList.add("invitee_full_name=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FeatureInvitationRenderData{", "}", 0, null, null, 56);
    }
}
