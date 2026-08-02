package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.BrandBanner;
import com.squareup.protos.franklin.api.UiAlias;
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

/* loaded from: classes7.dex */
public final class InlineV2Message extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InlineV2Message> CREATOR;
    public final String message_subtitle;
    public final String message_title;
    public final Placement placement;
    public final String url;
    public final InlineV2Message$VisualAsset$Avatar visualAsset;

    /* loaded from: classes.dex */
    public enum Placement implements WireEnum {
        ACTIVITY_TAB(1),
        MONEYBOT_APPLET(2),
        MONEYBOT_CHAT(3);

        public final int value;
        public static final UiAlias.Type.Companion Companion = new UiAlias.Type.Companion();
        public static final InlineV2Message$Placement$Companion$ADAPTER$1 ADAPTER = new InlineV2Message$Placement$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Placement.class), Syntax.PROTO_2, null);

        Placement(int i) {
            this.value = i;
        }

        public static final Placement fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return ACTIVITY_TAB;
            }
            if (i == 2) {
                return MONEYBOT_APPLET;
            }
            if (i != 3) {
                return null;
            }
            return MONEYBOT_CHAT;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        InlineV2Message$Companion$ADAPTER$1 inlineV2Message$Companion$ADAPTER$1 = new InlineV2Message$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InlineV2Message.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.InlineV2Message", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppMessageSpecProto.proto");
        ADAPTER = inlineV2Message$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(inlineV2Message$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineV2Message(Placement placement, InlineV2Message$VisualAsset$Avatar inlineV2Message$VisualAsset$Avatar, String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.placement = placement;
        this.visualAsset = inlineV2Message$VisualAsset$Avatar;
        this.message_title = str;
        this.message_subtitle = str2;
        this.url = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InlineV2Message)) {
            return false;
        }
        InlineV2Message inlineV2Message = (InlineV2Message) obj;
        return Intrinsics.areEqual(unknownFields(), inlineV2Message.unknownFields()) && this.placement == inlineV2Message.placement && Intrinsics.areEqual(this.visualAsset, inlineV2Message.visualAsset) && Intrinsics.areEqual(this.message_title, inlineV2Message.message_title) && Intrinsics.areEqual(this.message_subtitle, inlineV2Message.message_subtitle) && Intrinsics.areEqual(this.url, inlineV2Message.url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Placement placement = this.placement;
        int hashCode2 = (hashCode + (placement != null ? placement.hashCode() : 0)) * 37;
        InlineV2Message$VisualAsset$Avatar inlineV2Message$VisualAsset$Avatar = this.visualAsset;
        int hashCode3 = (hashCode2 + (inlineV2Message$VisualAsset$Avatar != null ? inlineV2Message$VisualAsset$Avatar.hashCode() : 0)) * 37;
        String str = this.message_title;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.message_subtitle;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.url;
        int hashCode6 = hashCode5 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BrandBanner.Builder builder = new BrandBanner.Builder(21);
        builder.icon = this.placement;
        builder.title = this.visualAsset;
        builder.subtitle = this.message_title;
        builder.action = this.message_subtitle;
        builder.icon_background_color = this.url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Placement placement = this.placement;
        if (placement != null) {
            arrayList.add("placement=" + placement);
        }
        InlineV2Message$VisualAsset$Avatar inlineV2Message$VisualAsset$Avatar = this.visualAsset;
        if (inlineV2Message$VisualAsset$Avatar != null) {
            arrayList.add("visualAsset=" + inlineV2Message$VisualAsset$Avatar);
        }
        String str = this.message_title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "message_title=", arrayList);
        }
        String str2 = this.message_subtitle;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "message_subtitle=", arrayList);
        }
        String str3 = this.url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InlineV2Message{", "}", 0, null, null, 56);
    }
}
