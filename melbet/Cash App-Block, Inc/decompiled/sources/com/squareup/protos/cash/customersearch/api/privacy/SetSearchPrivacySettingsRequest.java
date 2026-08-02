package com.squareup.protos.cash.customersearch.api.privacy;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiAccess;
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
public final class SetSearchPrivacySettingsRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SetSearchPrivacySettingsRequest> CREATOR;
    public final Boolean search_by_email;
    public final Boolean search_by_name;
    public final Boolean search_by_phone;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SetSearchPrivacySettingsRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.customersearch.api.privacy.SetSearchPrivacySettingsRequest$Companion$ADAPTER$1
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
                Object obj3 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SetSearchPrivacySettingsRequest((Boolean) obj, (Boolean) obj2, (Boolean) obj3, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.BOOL.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        obj3 = ProtoAdapter.BOOL.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SetSearchPrivacySettingsRequest setSearchPrivacySettingsRequest = (SetSearchPrivacySettingsRequest) obj;
                reverseProtoWriter.getClass();
                setSearchPrivacySettingsRequest.getClass();
                reverseProtoWriter.writeBytes(setSearchPrivacySettingsRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 3, setSearchPrivacySettingsRequest.search_by_phone);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, setSearchPrivacySettingsRequest.search_by_email);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, setSearchPrivacySettingsRequest.search_by_name);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SetSearchPrivacySettingsRequest setSearchPrivacySettingsRequest = (SetSearchPrivacySettingsRequest) obj;
                setSearchPrivacySettingsRequest.getClass();
                int size$okio = setSearchPrivacySettingsRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                return protoAdapter2.encodedSizeWithTag(3, setSearchPrivacySettingsRequest.search_by_phone) + protoAdapter2.encodedSizeWithTag(2, setSearchPrivacySettingsRequest.search_by_email) + protoAdapter2.encodedSizeWithTag(1, setSearchPrivacySettingsRequest.search_by_name) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SetSearchPrivacySettingsRequest setSearchPrivacySettingsRequest = (SetSearchPrivacySettingsRequest) obj;
                setSearchPrivacySettingsRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                Boolean bool = setSearchPrivacySettingsRequest.search_by_name;
                Boolean bool2 = setSearchPrivacySettingsRequest.search_by_email;
                Boolean bool3 = setSearchPrivacySettingsRequest.search_by_phone;
                byteString.getClass();
                return new SetSearchPrivacySettingsRequest(bool, bool2, bool3, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SetSearchPrivacySettingsRequest setSearchPrivacySettingsRequest = (SetSearchPrivacySettingsRequest) obj;
                setSearchPrivacySettingsRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.BOOL;
                protoAdapter2.encodeWithTag(protoWriter, 1, setSearchPrivacySettingsRequest.search_by_name);
                protoAdapter2.encodeWithTag(protoWriter, 2, setSearchPrivacySettingsRequest.search_by_email);
                protoAdapter2.encodeWithTag(protoWriter, 3, setSearchPrivacySettingsRequest.search_by_phone);
                protoWriter.writeBytes(setSearchPrivacySettingsRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    public /* synthetic */ SetSearchPrivacySettingsRequest(Boolean bool, Boolean bool2, Boolean bool3, int i) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2, (i & 4) != 0 ? null : bool3, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SetSearchPrivacySettingsRequest)) {
            return false;
        }
        SetSearchPrivacySettingsRequest setSearchPrivacySettingsRequest = (SetSearchPrivacySettingsRequest) obj;
        return Intrinsics.areEqual(unknownFields(), setSearchPrivacySettingsRequest.unknownFields()) && Intrinsics.areEqual(this.search_by_name, setSearchPrivacySettingsRequest.search_by_name) && Intrinsics.areEqual(this.search_by_email, setSearchPrivacySettingsRequest.search_by_email) && Intrinsics.areEqual(this.search_by_phone, setSearchPrivacySettingsRequest.search_by_phone);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.search_by_name;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.search_by_email;
        int hashCode3 = (hashCode2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.search_by_phone;
        int hashCode4 = hashCode3 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAccess.Builder builder = new UiAccess.Builder(1);
        builder.require_passcode_confirmation = this.search_by_name;
        builder.has_passcode = this.search_by_email;
        builder.app_lock_activated = this.search_by_phone;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.search_by_name;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("search_by_name=", bool, arrayList);
        }
        Boolean bool2 = this.search_by_email;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("search_by_email=", bool2, arrayList);
        }
        Boolean bool3 = this.search_by_phone;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("search_by_phone=", bool3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SetSearchPrivacySettingsRequest{", "}", 0, null, null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetSearchPrivacySettingsRequest(Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.search_by_name = bool;
        this.search_by_email = bool2;
        this.search_by_phone = bool3;
    }
}
