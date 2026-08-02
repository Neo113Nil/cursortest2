package com.squareup.protos.cash.messagingplatformcommon.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.GiftCard;
import com.squareup.protos.cash.papermate.enums.FeeType;
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

/* loaded from: classes.dex */
public final class Video extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Video> CREATOR;
    public final String asset_url;
    public final AudioPreference audio_preference;
    public final Boolean should_loop;
    public final String video_accessibility_hint;

    /* loaded from: classes7.dex */
    public enum AudioPreference implements WireEnum {
        NO_AUDIO(1),
        START_MUTED(2),
        MATCH_DEVICE(3);

        public final int value;
        public static final FeeType.Companion Companion = new FeeType.Companion();
        public static final Video$AudioPreference$Companion$ADAPTER$1 ADAPTER = new Video$AudioPreference$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AudioPreference.class), Syntax.PROTO_2, null);

        AudioPreference(int i) {
            this.value = i;
        }

        public static final AudioPreference fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return NO_AUDIO;
            }
            if (i == 2) {
                return START_MUTED;
            }
            if (i != 3) {
                return null;
            }
            return MATCH_DEVICE;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        Video$Companion$ADAPTER$1 video$Companion$ADAPTER$1 = new Video$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Video.class), "type.googleapis.com/squareup.cash.messagingplatformcommon.app.Video", Syntax.PROTO_2, null, "squareup/cash/messagingplatformcommon/app/AppMessageSpecProto.proto");
        ADAPTER = video$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(video$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Video(String str, String str2, Boolean bool, AudioPreference audioPreference, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.asset_url = str;
        this.video_accessibility_hint = str2;
        this.should_loop = bool;
        this.audio_preference = audioPreference;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Video)) {
            return false;
        }
        Video video = (Video) obj;
        return Intrinsics.areEqual(unknownFields(), video.unknownFields()) && Intrinsics.areEqual(this.asset_url, video.asset_url) && Intrinsics.areEqual(this.video_accessibility_hint, video.video_accessibility_hint) && Intrinsics.areEqual(this.should_loop, video.should_loop) && this.audio_preference == video.audio_preference;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.asset_url;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.video_accessibility_hint;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Boolean bool = this.should_loop;
        int hashCode4 = (hashCode3 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        AudioPreference audioPreference = this.audio_preference;
        int hashCode5 = hashCode4 + (audioPreference != null ? audioPreference.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Builder builder = new GiftCard.Builder(23, false);
        builder.id = this.asset_url;
        builder.last_4 = this.video_accessibility_hint;
        builder.gift_card_id = this.should_loop;
        builder.gift_card_amount = this.audio_preference;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.asset_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "asset_url=", arrayList);
        }
        String str2 = this.video_accessibility_hint;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "video_accessibility_hint=", arrayList);
        }
        Boolean bool = this.should_loop;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("should_loop=", bool, arrayList);
        }
        AudioPreference audioPreference = this.audio_preference;
        if (audioPreference != null) {
            arrayList.add("audio_preference=" + audioPreference);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Video{", "}", 0, null, null, 56);
    }
}
