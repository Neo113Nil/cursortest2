package com.squareup.protos.cash.clients;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
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
public final class Version extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Version> CREATOR;
    public final Integer major;
    public final Integer minor;
    public final Integer patch;

    public final class Builder extends Message.Builder {
        public Integer major;
        public Integer minor;
        public Integer patch;

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            return new Version(this.major, this.minor, this.patch, buildUnknownFields());
        }
    }

    static {
        Version$Companion$ADAPTER$1 version$Companion$ADAPTER$1 = new Version$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Version.class), "type.googleapis.com/squareup.cash.clients.Version", Syntax.PROTO_2, null, "squareup/cash/clients/VersionProto.proto");
        ADAPTER = version$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(version$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Version(Integer num, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.major = num;
        this.minor = num2;
        this.patch = num3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Version)) {
            return false;
        }
        Version version = (Version) obj;
        return Intrinsics.areEqual(unknownFields(), version.unknownFields()) && Intrinsics.areEqual(this.major, version.major) && Intrinsics.areEqual(this.minor, version.minor) && Intrinsics.areEqual(this.patch, version.patch);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.major;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.minor;
        int hashCode3 = (hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        Integer num3 = this.patch;
        int hashCode4 = hashCode3 + (num3 != null ? Integer.hashCode(num3.intValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder();
        builder.major = this.major;
        builder.minor = this.minor;
        builder.patch = this.patch;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.major;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("major=", num, arrayList);
        }
        Integer num2 = this.minor;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("minor=", num2, arrayList);
        }
        Integer num3 = this.patch;
        if (num3 != null) {
            re$$ExternalSyntheticOutline0.m("patch=", num3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Version{", "}", 0, null, null, 56);
    }
}
