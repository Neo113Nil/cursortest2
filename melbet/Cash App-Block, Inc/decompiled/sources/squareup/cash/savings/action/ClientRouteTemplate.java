package squareup.cash.savings.action;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.common.CryptocurrencyConfig;
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

/* loaded from: classes10.dex */
public final class ClientRouteTemplate extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ClientRouteTemplate> CREATOR;

    /* renamed from: android, reason: collision with root package name */
    public final String f1643android;
    public final Long argument_count;
    public final String ios;
    public final String web;
    public final String zero_arg_verbatim_string;

    /* loaded from: classes8.dex */
    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;

        /* renamed from: android, reason: collision with root package name */
        public String f1644android;
        public Long argument_count;
        public String ios;
        public String web;
        public String zero_arg_verbatim_string;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new ClientRouteTemplate(this.argument_count, this.f1644android, this.ios, this.web, this.zero_arg_verbatim_string, buildUnknownFields());
                default:
                    return new CryptocurrencyConfig(this.argument_count, this.f1644android, this.ios, this.web, this.zero_arg_verbatim_string, buildUnknownFields());
            }
        }
    }

    static {
        ClientRouteTemplate$Companion$ADAPTER$1 clientRouteTemplate$Companion$ADAPTER$1 = new ClientRouteTemplate$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClientRouteTemplate.class), "type.googleapis.com/squareup.cash.savings.action.ClientRouteTemplate", Syntax.PROTO_2, null, "squareup/cash/savings/action/ClientRouteTemplate.proto");
        ADAPTER = clientRouteTemplate$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(clientRouteTemplate$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClientRouteTemplate(Long l, String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1643android = str;
        this.ios = str2;
        this.web = str3;
        this.argument_count = l;
        this.zero_arg_verbatim_string = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientRouteTemplate)) {
            return false;
        }
        ClientRouteTemplate clientRouteTemplate = (ClientRouteTemplate) obj;
        return Intrinsics.areEqual(unknownFields(), clientRouteTemplate.unknownFields()) && Intrinsics.areEqual(this.f1643android, clientRouteTemplate.f1643android) && Intrinsics.areEqual(this.ios, clientRouteTemplate.ios) && Intrinsics.areEqual(this.web, clientRouteTemplate.web) && Intrinsics.areEqual(this.argument_count, clientRouteTemplate.argument_count) && Intrinsics.areEqual(this.zero_arg_verbatim_string, clientRouteTemplate.zero_arg_verbatim_string);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.f1643android;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.ios;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.web;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        Long l = this.argument_count;
        int hashCode5 = (hashCode4 + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37;
        String str4 = this.zero_arg_verbatim_string;
        int hashCode6 = hashCode5 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.f1644android = this.f1643android;
        builder.ios = this.ios;
        builder.web = this.web;
        builder.argument_count = this.argument_count;
        builder.zero_arg_verbatim_string = this.zero_arg_verbatim_string;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.f1643android;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "android=", arrayList);
        }
        String str2 = this.ios;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "ios=", arrayList);
        }
        String str3 = this.web;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "web=", arrayList);
        }
        Long l = this.argument_count;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("argument_count=", l, arrayList);
        }
        String str4 = this.zero_arg_verbatim_string;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "zero_arg_verbatim_string=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ClientRouteTemplate{", "}", 0, null, null, 56);
    }
}
