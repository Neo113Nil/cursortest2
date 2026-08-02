package com.squareup.protos.hieroglyph;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cats.Cats;
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
public final class PublicKeyConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PublicKeyConfig> CREATOR;
    public final Long size_bits;

    static {
        PublicKeyConfig$Companion$ADAPTER$1 publicKeyConfig$Companion$ADAPTER$1 = new PublicKeyConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PublicKeyConfig.class), "type.googleapis.com/squareup.hieroglyph.PublicKeyConfig", Syntax.PROTO_2, null, "squareup/hieroglyph/hieroglyph.proto");
        ADAPTER = publicKeyConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(publicKeyConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublicKeyConfig(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.size_bits = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PublicKeyConfig)) {
            return false;
        }
        PublicKeyConfig publicKeyConfig = (PublicKeyConfig) obj;
        return Intrinsics.areEqual(unknownFields(), publicKeyConfig.unknownFields()) && Intrinsics.areEqual(this.size_bits, publicKeyConfig.size_bits);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.size_bits;
        int hashCode2 = hashCode + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cats.Builder builder = new Cats.Builder(12);
        builder.cat_count = this.size_bits;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.size_bits;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("size_bits=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PublicKeyConfig{", "}", 0, null, null, 56);
    }
}
