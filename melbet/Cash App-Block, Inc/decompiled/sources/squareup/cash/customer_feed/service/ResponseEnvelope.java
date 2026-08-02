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
import okhttp3.Cache;
import okio.ByteString;
import squareup.cash.earnings.EarningTool;

/* loaded from: classes3.dex */
public final class ResponseEnvelope extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ResponseEnvelope> CREATOR;

    /* renamed from: type, reason: collision with root package name */
    public final Cache.Companion f1636type;

    static {
        ResponseEnvelope$Companion$ADAPTER$1 responseEnvelope$Companion$ADAPTER$1 = new ResponseEnvelope$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ResponseEnvelope.class), "type.googleapis.com/squareup.cash.customer_feed.service.ResponseEnvelope", Syntax.PROTO_2, null, "squareup/cash/customer-feed/service.proto");
        ADAPTER = responseEnvelope$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(responseEnvelope$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResponseEnvelope(Cache.Companion companion, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1636type = companion;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResponseEnvelope)) {
            return false;
        }
        ResponseEnvelope responseEnvelope = (ResponseEnvelope) obj;
        return Intrinsics.areEqual(unknownFields(), responseEnvelope.unknownFields()) && Intrinsics.areEqual(this.f1636type, responseEnvelope.f1636type);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Cache.Companion companion = this.f1636type;
        int hashCode2 = hashCode + (companion != null ? companion.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EarningTool.Builder builder = new EarningTool.Builder(14);
        builder.tool = this.f1636type;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Cache.Companion companion = this.f1636type;
        if (companion != null) {
            arrayList.add("type=" + companion);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ResponseEnvelope{", "}", 0, null, null, 56);
    }
}
