package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import com.google.android.gms.internal.mlkit_vision_common.zzjh;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.local.client.v1.GiftCard;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class UpdateUserIntentRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<UpdateUserIntentRequest> CREATOR;
    public final String anonymous_user_app_token;
    public final String brand_token;
    public final String intent_token;
    public final zzjh update;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(UpdateUserIntentRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.local.client.v1.UpdateUserIntentRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                zzjh updateUserIntentRequest$Update$RemoteOrdering;
                protoReader.getClass();
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                Object obj3 = null;
                zzjh zzjhVar = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new UpdateUserIntentRequest((String) obj, (String) obj2, (String) obj3, zzjhVar, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 2) {
                        if (nextTag == 3) {
                            updateUserIntentRequest$Update$RemoteOrdering = new UpdateUserIntentRequest$Update$RemoteOrdering((LocalRemoteOrderingIntent) LocalRemoteOrderingIntent.ADAPTER.decode(protoReader));
                        } else if (nextTag == 4) {
                            updateUserIntentRequest$Update$RemoteOrdering = new UpdateUserIntentRequest$Update$InStoreOrdering((LocalInStoreOrderingIntent) LocalInStoreOrderingIntent.ADAPTER.decode(protoReader));
                        } else if (nextTag != 5) {
                            protoReader.readUnknownField(nextTag);
                        } else {
                            obj3 = ProtoAdapter.STRING.decode(protoReader);
                        }
                        zzjhVar = updateUserIntentRequest$Update$RemoteOrdering;
                    } else {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                UpdateUserIntentRequest updateUserIntentRequest = (UpdateUserIntentRequest) obj;
                reverseProtoWriter.getClass();
                updateUserIntentRequest.getClass();
                reverseProtoWriter.writeBytes(updateUserIntentRequest.unknownFields());
                zzjh zzjhVar = updateUserIntentRequest.update;
                if (zzjhVar instanceof UpdateUserIntentRequest$Update$RemoteOrdering) {
                    LocalRemoteOrderingIntent.ADAPTER.encodeWithTag(reverseProtoWriter, 3, ((UpdateUserIntentRequest$Update$RemoteOrdering) zzjhVar).value);
                } else if (zzjhVar instanceof UpdateUserIntentRequest$Update$InStoreOrdering) {
                    LocalInStoreOrderingIntent.ADAPTER.encodeWithTag(reverseProtoWriter, 4, ((UpdateUserIntentRequest$Update$InStoreOrdering) zzjhVar).value);
                } else if (zzjhVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(reverseProtoWriter, 5, updateUserIntentRequest.brand_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, updateUserIntentRequest.anonymous_user_app_token);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, updateUserIntentRequest.intent_token);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                UpdateUserIntentRequest updateUserIntentRequest = (UpdateUserIntentRequest) obj;
                updateUserIntentRequest.getClass();
                int size$okio = updateUserIntentRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                int encodedSizeWithTag = protoAdapter2.encodedSizeWithTag(5, updateUserIntentRequest.brand_token) + protoAdapter2.encodedSizeWithTag(2, updateUserIntentRequest.anonymous_user_app_token) + protoAdapter2.encodedSizeWithTag(1, updateUserIntentRequest.intent_token) + size$okio;
                zzjh zzjhVar = updateUserIntentRequest.update;
                if (zzjhVar instanceof UpdateUserIntentRequest$Update$RemoteOrdering) {
                    return LocalRemoteOrderingIntent.ADAPTER.encodedSizeWithTag(3, ((UpdateUserIntentRequest$Update$RemoteOrdering) zzjhVar).value) + encodedSizeWithTag;
                }
                if (zzjhVar instanceof UpdateUserIntentRequest$Update$InStoreOrdering) {
                    return LocalInStoreOrderingIntent.ADAPTER.encodedSizeWithTag(4, ((UpdateUserIntentRequest$Update$InStoreOrdering) zzjhVar).value) + encodedSizeWithTag;
                }
                if (zzjhVar == null) {
                    return encodedSizeWithTag;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return 0;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                UpdateUserIntentRequest updateUserIntentRequest = (UpdateUserIntentRequest) obj;
                updateUserIntentRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = updateUserIntentRequest.intent_token;
                String str2 = updateUserIntentRequest.anonymous_user_app_token;
                String str3 = updateUserIntentRequest.brand_token;
                zzjh zzjhVar = updateUserIntentRequest.update;
                byteString.getClass();
                return new UpdateUserIntentRequest(str, str2, str3, zzjhVar, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                UpdateUserIntentRequest updateUserIntentRequest = (UpdateUserIntentRequest) obj;
                updateUserIntentRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, updateUserIntentRequest.intent_token);
                protoAdapter2.encodeWithTag(protoWriter, 2, updateUserIntentRequest.anonymous_user_app_token);
                protoAdapter2.encodeWithTag(protoWriter, 5, updateUserIntentRequest.brand_token);
                zzjh zzjhVar = updateUserIntentRequest.update;
                if (zzjhVar instanceof UpdateUserIntentRequest$Update$RemoteOrdering) {
                    LocalRemoteOrderingIntent.ADAPTER.encodeWithTag(protoWriter, 3, ((UpdateUserIntentRequest$Update$RemoteOrdering) zzjhVar).value);
                } else if (zzjhVar instanceof UpdateUserIntentRequest$Update$InStoreOrdering) {
                    LocalInStoreOrderingIntent.ADAPTER.encodeWithTag(protoWriter, 4, ((UpdateUserIntentRequest$Update$InStoreOrdering) zzjhVar).value);
                } else if (zzjhVar != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                protoWriter.writeBytes(updateUserIntentRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateUserIntentRequest(String str, String str2, String str3, zzjh zzjhVar, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.intent_token = str;
        this.anonymous_user_app_token = str2;
        this.brand_token = str3;
        this.update = zzjhVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UpdateUserIntentRequest)) {
            return false;
        }
        UpdateUserIntentRequest updateUserIntentRequest = (UpdateUserIntentRequest) obj;
        return Intrinsics.areEqual(unknownFields(), updateUserIntentRequest.unknownFields()) && Intrinsics.areEqual(this.intent_token, updateUserIntentRequest.intent_token) && Intrinsics.areEqual(this.anonymous_user_app_token, updateUserIntentRequest.anonymous_user_app_token) && Intrinsics.areEqual(this.brand_token, updateUserIntentRequest.brand_token) && Intrinsics.areEqual(this.update, updateUserIntentRequest.update);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.intent_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.anonymous_user_app_token;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.brand_token;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        zzjh zzjhVar = this.update;
        int hashCode5 = hashCode4 + (zzjhVar != null ? zzjhVar.hashCode() : 0);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCard.Builder builder = new GiftCard.Builder(15, false);
        builder.id = this.intent_token;
        builder.last_4 = this.anonymous_user_app_token;
        builder.gift_card_id = this.brand_token;
        builder.gift_card_amount = this.update;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.intent_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "intent_token=", arrayList);
        }
        String str2 = this.anonymous_user_app_token;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "anonymous_user_app_token=", arrayList);
        }
        String str3 = this.brand_token;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "brand_token=", arrayList);
        }
        zzjh zzjhVar = this.update;
        if (zzjhVar != null) {
            arrayList.add("update=" + zzjhVar);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateUserIntentRequest{", "}", 0, null, null, 56);
    }
}
