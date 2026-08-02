package com.squareup.protos.cash.cashsessionrecorder.app.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.giftly.app.GiftCardCategory;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* loaded from: classes.dex */
public final class SubmitScreenshotBundleRequest extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SubmitScreenshotBundleRequest> CREATOR;
    public final List file_tokens;
    public final String idempotence_key;
    public final String screenshot_request_id;

    static {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(SubmitScreenshotBundleRequest.class);
        Syntax syntax = Syntax.PROTO_2;
        ProtoAdapter protoAdapter = new ProtoAdapter(orCreateKotlinClass) { // from class: com.squareup.protos.cash.cashsessionrecorder.app.v1.SubmitScreenshotBundleRequest$Companion$ADAPTER$1
            {
                FieldEncoding fieldEncoding2 = FieldEncoding.LENGTH_DELIMITED;
                Syntax syntax2 = Syntax.PROTO_2;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object decode(ProtoReader protoReader) {
                ArrayList m = re$$ExternalSyntheticOutline0.m(protoReader);
                long beginMessage = protoReader.beginMessage();
                Object obj = null;
                Object obj2 = null;
                while (true) {
                    int nextTag = protoReader.nextTag();
                    if (nextTag == -1) {
                        return new SubmitScreenshotBundleRequest((String) obj, (String) obj2, m, protoReader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        obj = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag == 2) {
                        obj2 = ProtoAdapter.STRING.decode(protoReader);
                    } else if (nextTag != 3) {
                        protoReader.readUnknownField(nextTag);
                    } else {
                        m.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) {
                SubmitScreenshotBundleRequest submitScreenshotBundleRequest = (SubmitScreenshotBundleRequest) obj;
                reverseProtoWriter.getClass();
                submitScreenshotBundleRequest.getClass();
                reverseProtoWriter.writeBytes(submitScreenshotBundleRequest.unknownFields());
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.asRepeated().encodeWithTag(reverseProtoWriter, 3, submitScreenshotBundleRequest.file_tokens);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 2, submitScreenshotBundleRequest.screenshot_request_id);
                protoAdapter2.encodeWithTag(reverseProtoWriter, 1, submitScreenshotBundleRequest.idempotence_key);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final int encodedSize(Object obj) {
                SubmitScreenshotBundleRequest submitScreenshotBundleRequest = (SubmitScreenshotBundleRequest) obj;
                submitScreenshotBundleRequest.getClass();
                int size$okio = submitScreenshotBundleRequest.unknownFields().getSize$okio();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                return protoAdapter2.asRepeated().encodedSizeWithTag(3, submitScreenshotBundleRequest.file_tokens) + protoAdapter2.encodedSizeWithTag(2, submitScreenshotBundleRequest.screenshot_request_id) + protoAdapter2.encodedSizeWithTag(1, submitScreenshotBundleRequest.idempotence_key) + size$okio;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final Object redact(Object obj) {
                SubmitScreenshotBundleRequest submitScreenshotBundleRequest = (SubmitScreenshotBundleRequest) obj;
                submitScreenshotBundleRequest.getClass();
                ByteString byteString = ByteString.EMPTY;
                String str = submitScreenshotBundleRequest.idempotence_key;
                String str2 = submitScreenshotBundleRequest.screenshot_request_id;
                List list = submitScreenshotBundleRequest.file_tokens;
                list.getClass();
                byteString.getClass();
                return new SubmitScreenshotBundleRequest(str, str2, list, byteString);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public final void encode(ProtoWriter protoWriter, Object obj) {
                SubmitScreenshotBundleRequest submitScreenshotBundleRequest = (SubmitScreenshotBundleRequest) obj;
                submitScreenshotBundleRequest.getClass();
                ProtoAdapter protoAdapter2 = ProtoAdapter.STRING;
                protoAdapter2.encodeWithTag(protoWriter, 1, submitScreenshotBundleRequest.idempotence_key);
                protoAdapter2.encodeWithTag(protoWriter, 2, submitScreenshotBundleRequest.screenshot_request_id);
                protoAdapter2.asRepeated().encodeWithTag(protoWriter, 3, submitScreenshotBundleRequest.file_tokens);
                protoWriter.writeBytes(submitScreenshotBundleRequest.unknownFields());
            }
        };
        ADAPTER = protoAdapter;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(protoAdapter);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitScreenshotBundleRequest(String str, String str2, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.idempotence_key = str;
        this.screenshot_request_id = str2;
        this.file_tokens = TransactorKt.immutableCopyOf("file_tokens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubmitScreenshotBundleRequest)) {
            return false;
        }
        SubmitScreenshotBundleRequest submitScreenshotBundleRequest = (SubmitScreenshotBundleRequest) obj;
        return Intrinsics.areEqual(unknownFields(), submitScreenshotBundleRequest.unknownFields()) && Intrinsics.areEqual(this.idempotence_key, submitScreenshotBundleRequest.idempotence_key) && Intrinsics.areEqual(this.screenshot_request_id, submitScreenshotBundleRequest.screenshot_request_id) && Intrinsics.areEqual(this.file_tokens, submitScreenshotBundleRequest.file_tokens);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.idempotence_key;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.screenshot_request_id;
        int hashCode3 = this.file_tokens.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GiftCardCategory.Builder builder = new GiftCardCategory.Builder(2);
        builder.token = this.idempotence_key;
        builder.name = this.screenshot_request_id;
        builder.gift_card_type_tokens = this.file_tokens;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.idempotence_key;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "idempotence_key=", arrayList);
        }
        String str2 = this.screenshot_request_id;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "screenshot_request_id=", arrayList);
        }
        List list = this.file_tokens;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("file_tokens=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SubmitScreenshotBundleRequest{", "}", 0, null, null, 56);
    }
}
