package squareup.cash.customer_feed.service;

import android.os.Parcelable;
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
import squareup.cash.earnings.EarningTool;

/* loaded from: classes3.dex */
public final class RequestEnvelope extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RequestEnvelope> CREATOR;

    /* renamed from: type, reason: collision with root package name */
    public final RequestEnvelope$Type$Subscribe f1635type;

    static {
        RequestEnvelope$Companion$ADAPTER$1 requestEnvelope$Companion$ADAPTER$1 = new RequestEnvelope$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RequestEnvelope.class), "type.googleapis.com/squareup.cash.customer_feed.service.RequestEnvelope", Syntax.PROTO_2, null, "squareup/cash/customer-feed/service.proto");
        ADAPTER = requestEnvelope$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(requestEnvelope$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestEnvelope(RequestEnvelope$Type$Subscribe requestEnvelope$Type$Subscribe, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1635type = requestEnvelope$Type$Subscribe;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RequestEnvelope)) {
            return false;
        }
        RequestEnvelope requestEnvelope = (RequestEnvelope) obj;
        return Intrinsics.areEqual(unknownFields(), requestEnvelope.unknownFields()) && Intrinsics.areEqual(this.f1635type, requestEnvelope.f1635type);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        RequestEnvelope$Type$Subscribe requestEnvelope$Type$Subscribe = this.f1635type;
        int hashCode2 = hashCode + (requestEnvelope$Type$Subscribe != null ? requestEnvelope$Type$Subscribe.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EarningTool.Builder builder = new EarningTool.Builder(13);
        builder.tool = this.f1635type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        RequestEnvelope$Type$Subscribe requestEnvelope$Type$Subscribe = this.f1635type;
        if (requestEnvelope$Type$Subscribe != null) {
            arrayList.add("type=" + requestEnvelope$Type$Subscribe);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RequestEnvelope{", "}", 0, null, null, 56);
    }
}
