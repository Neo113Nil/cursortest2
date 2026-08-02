package com.squareup.protos.rewardly.ui;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiDda;
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
public final class AppVersion extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AppVersion> CREATOR;
    public final Integer major_version;
    public final Integer minor_version;
    public final Integer patch_version;
    public final Platform platform;

    static {
        AppVersion$Companion$ADAPTER$1 appVersion$Companion$ADAPTER$1 = new AppVersion$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AppVersion.class), "type.googleapis.com/squareup.rewardly.ui.AppVersion", Syntax.PROTO_2, null, "squareup/rewardly/ui.proto");
        ADAPTER = appVersion$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(appVersion$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppVersion(Platform platform, Integer num, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.platform = platform;
        this.major_version = num;
        this.minor_version = num2;
        this.patch_version = num3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppVersion)) {
            return false;
        }
        AppVersion appVersion = (AppVersion) obj;
        return Intrinsics.areEqual(unknownFields(), appVersion.unknownFields()) && this.platform == appVersion.platform && Intrinsics.areEqual(this.major_version, appVersion.major_version) && Intrinsics.areEqual(this.minor_version, appVersion.minor_version) && Intrinsics.areEqual(this.patch_version, appVersion.patch_version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Platform platform = this.platform;
        int hashCode2 = (hashCode + (platform != null ? platform.hashCode() : 0)) * 37;
        Integer num = this.major_version;
        int hashCode3 = (hashCode2 + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.minor_version;
        int hashCode4 = (hashCode3 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        Integer num3 = this.patch_version;
        int hashCode5 = hashCode4 + (num3 != null ? Integer.hashCode(num3.intValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiDda.Builder builder = new UiDda.Builder(24);
        builder.account = this.platform;
        builder.enabled = this.major_version;
        builder.button = this.minor_version;
        builder.dda_form = this.patch_version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Platform platform = this.platform;
        if (platform != null) {
            arrayList.add("platform=" + platform);
        }
        Integer num = this.major_version;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("major_version=", num, arrayList);
        }
        Integer num2 = this.minor_version;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("minor_version=", num2, arrayList);
        }
        Integer num3 = this.patch_version;
        if (num3 != null) {
            re$$ExternalSyntheticOutline0.m("patch_version=", num3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AppVersion{", "}", 0, null, null, 56);
    }
}
