package com.squareup.protos.access.sync_values;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiIdvState;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class PasswordInfo extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PasswordInfo> CREATOR;
    public final Boolean has_password;
    public final Long version;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(PasswordInfo.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.access.sync_values.PasswordInfo$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new PasswordInfo((Boolean) obj2, (Long) obj, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.INT64.decode(protoReader);
                    } else if (nextTag != 2) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj2 = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                PasswordInfo passwordInfo = (PasswordInfo) obj;
                reverseProtoWriter.getClass();
                passwordInfo.getClass();
                reverseProtoWriter.writeBytes(passwordInfo.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(reverseProtoWriter, 2, passwordInfo.has_password);
                ProtoAdapter.INT64.encodeWithTag(reverseProtoWriter, 1, passwordInfo.version);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                PasswordInfo passwordInfo = (PasswordInfo) obj;
                passwordInfo.getClass();
                return ProtoAdapter.BOOL.encodedSizeWithTag(2, passwordInfo.has_password) + ProtoAdapter.INT64.encodedSizeWithTag(1, passwordInfo.version) + passwordInfo.unknownFields().getSize$okio();
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                PasswordInfo passwordInfo = (PasswordInfo) obj;
                passwordInfo.getClass();
                ByteString byteString = ByteString.EMPTY;
                Long l = passwordInfo.version;
                Boolean bool = passwordInfo.has_password;
                byteString.getClass();
                return new PasswordInfo(bool, l, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                PasswordInfo passwordInfo = (PasswordInfo) obj;
                passwordInfo.getClass();
                ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, passwordInfo.version);
                ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, passwordInfo.has_password);
                protoWriter.writeBytes(passwordInfo.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PasswordInfo(Boolean bool, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.version = l;
        this.has_password = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PasswordInfo)) {
            return false;
        }
        PasswordInfo passwordInfo = (PasswordInfo) obj;
        return Intrinsics.areEqual(unknownFields(), passwordInfo.unknownFields()) && Intrinsics.areEqual(this.version, passwordInfo.version) && Intrinsics.areEqual(this.has_password, passwordInfo.has_password);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.version;
        int hashCode2 = (hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        Boolean bool = this.has_password;
        int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiIdvState.Builder builder = new UiIdvState.Builder(1);
        builder.can_attempt_electronic_idv_at = this.version;
        builder.has_verified_identity = this.has_password;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("version=", l, arrayList);
        }
        Boolean bool = this.has_password;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("has_password=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PasswordInfo{", "}", 0, null, null, 56);
    }
}
