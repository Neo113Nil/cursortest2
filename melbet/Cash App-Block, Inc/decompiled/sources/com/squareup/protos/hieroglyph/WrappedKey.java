package com.squareup.protos.hieroglyph;

import android.os.Parcelable;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
public final class WrappedKey extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<WrappedKey> CREATOR;
    public final Long expiration_ts;
    public final ByteString key_ciphertext;
    public final KeyScope key_scope;
    public final Long key_ttl_millis;

    static {
        WrappedKey$Companion$ADAPTER$1 wrappedKey$Companion$ADAPTER$1 = new WrappedKey$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(WrappedKey.class), "type.googleapis.com/squareup.hieroglyph.WrappedKey", Syntax.PROTO_2, null, "squareup/hieroglyph/hieroglyph.proto");
        ADAPTER = wrappedKey$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(wrappedKey$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrappedKey(KeyScope keyScope, ByteString byteString, Long l, Long l2, ByteString byteString2) {
        super(ADAPTER, byteString2);
        byteString2.getClass();
        this.key_scope = keyScope;
        this.key_ciphertext = byteString;
        this.expiration_ts = l;
        this.key_ttl_millis = l2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof WrappedKey)) {
            return false;
        }
        WrappedKey wrappedKey = (WrappedKey) obj;
        return Intrinsics.areEqual(unknownFields(), wrappedKey.unknownFields()) && this.key_scope == wrappedKey.key_scope && Intrinsics.areEqual(this.key_ciphertext, wrappedKey.key_ciphertext) && Intrinsics.areEqual(this.expiration_ts, wrappedKey.expiration_ts) && Intrinsics.areEqual(this.key_ttl_millis, wrappedKey.key_ttl_millis);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        KeyScope keyScope = this.key_scope;
        int hashCode2 = (hashCode + (keyScope != null ? keyScope.hashCode() : 0)) * 37;
        ByteString byteString = this.key_ciphertext;
        int hashCode3 = (hashCode2 + (byteString != null ? byteString.hashCode() : 0)) * 37;
        Long l = this.expiration_ts;
        int hashCode4 = (hashCode3 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Long l2 = this.key_ttl_millis;
        int hashCode5 = hashCode4 + (l2 != null ? Long.hashCode(l2.longValue()) : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiDda.Builder builder = new UiDda.Builder(12);
        builder.account = this.key_scope;
        builder.enabled = this.key_ciphertext;
        builder.button = this.expiration_ts;
        builder.dda_form = this.key_ttl_millis;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        KeyScope keyScope = this.key_scope;
        if (keyScope != null) {
            arrayList.add("key_scope=" + keyScope);
        }
        ByteString byteString = this.key_ciphertext;
        if (byteString != null) {
            Request$Priority$EnumUnboxingLocalUtility.m("key_ciphertext=", byteString, arrayList);
        }
        Long l = this.expiration_ts;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("expiration_ts=", l, arrayList);
        }
        Long l2 = this.key_ttl_millis;
        if (l2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("key_ttl_millis=", l2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "WrappedKey{", "}", 0, null, null, 56);
    }
}
