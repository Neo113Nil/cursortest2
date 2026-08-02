package com.squareup.protos.document;

import android.os.Parcelable;
import com.squareup.protos.cash.ui.SplitButtons;
import com.squareup.protos.franklin.common.AppVersion;
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
public final class VersionData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VersionData> CREATOR;
    public final AppVersion max_android_version;
    public final AppVersion min_android_version;

    static {
        VersionData$Companion$ADAPTER$1 versionData$Companion$ADAPTER$1 = new VersionData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(VersionData.class), "type.googleapis.com/squareup.document.VersionData", Syntax.PROTO_2, null, "squareup/document/document.proto");
        ADAPTER = versionData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(versionData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VersionData(AppVersion appVersion, AppVersion appVersion2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.min_android_version = appVersion;
        this.max_android_version = appVersion2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VersionData)) {
            return false;
        }
        VersionData versionData = (VersionData) obj;
        return Intrinsics.areEqual(unknownFields(), versionData.unknownFields()) && Intrinsics.areEqual(this.min_android_version, versionData.min_android_version) && Intrinsics.areEqual(this.max_android_version, versionData.max_android_version);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        AppVersion appVersion = this.min_android_version;
        int hashCode2 = (hashCode + (appVersion != null ? appVersion.hashCode() : 0)) * 37;
        AppVersion appVersion2 = this.max_android_version;
        int hashCode3 = hashCode2 + (appVersion2 != null ? appVersion2.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SplitButtons.Builder builder = new SplitButtons.Builder(28);
        builder.primary_button = this.min_android_version;
        builder.secondary_button = this.max_android_version;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AppVersion appVersion = this.min_android_version;
        if (appVersion != null) {
            arrayList.add("min_android_version=" + appVersion);
        }
        AppVersion appVersion2 = this.max_android_version;
        if (appVersion2 != null) {
            arrayList.add("max_android_version=" + appVersion2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VersionData{", "}", 0, null, null, 56);
    }
}
