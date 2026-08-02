package com.squareup.protos.lending.app_support;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.clients.Version;
import com.squareup.protos.franklin.common.Trigger;
import com.squareup.protos.giftly.GiftCard;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class AppSupport extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AppSupport> CREATOR;
    public final Version max_version;
    public final Version min_version;
    public final List platform;

    public enum Platform implements WireEnum {
        IOS(0),
        ANDROID(1);

        public static final AppSupport$Platform$Companion$ADAPTER$1 ADAPTER;
        public static final Trigger.Companion Companion;
        public final int value;

        static {
            Platform platform = IOS;
            Companion = new Trigger.Companion();
            ADAPTER = new AppSupport$Platform$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Platform.class), Syntax.PROTO_2, platform);
        }

        Platform(int i) {
            this.value = i;
        }

        public static final Platform fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return IOS;
            }
            if (i != 1) {
                return null;
            }
            return ANDROID;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        AppSupport$Companion$ADAPTER$1 appSupport$Companion$ADAPTER$1 = new AppSupport$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AppSupport.class), "type.googleapis.com/squareup.lending.app_support.AppSupport", Syntax.PROTO_2, null, "squareup/lending/app_support.proto");
        ADAPTER = appSupport$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(appSupport$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSupport(List list, Version version, Version version2, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.min_version = version;
        this.max_version = version2;
        this.platform = TransactorKt.immutableCopyOf("platform", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppSupport)) {
            return false;
        }
        AppSupport appSupport = (AppSupport) obj;
        return Intrinsics.areEqual(unknownFields(), appSupport.unknownFields()) && Intrinsics.areEqual(this.platform, appSupport.platform) && Intrinsics.areEqual(this.min_version, appSupport.min_version) && Intrinsics.areEqual(this.max_version, appSupport.max_version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.platform);
        Version version = this.min_version;
        int hashCode = (m + (version != null ? version.hashCode() : 0)) * 37;
        Version version2 = this.max_version;
        int hashCode2 = hashCode + (version2 != null ? version2.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Options.Builder builder = new GiftCard.Options.Builder(13);
        builder.label = this.platform;
        builder.localizable_label = this.min_version;
        builder.client_scenario = this.max_version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.platform;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("platform=", arrayList, list);
        }
        Version version = this.min_version;
        if (version != null) {
            arrayList.add("min_version=" + version);
        }
        Version version2 = this.max_version;
        if (version2 != null) {
            arrayList.add("max_version=" + version2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AppSupport{", "}", 0, null, null, 56);
    }
}
