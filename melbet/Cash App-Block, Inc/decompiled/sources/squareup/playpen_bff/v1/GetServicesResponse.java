package squareup.playpen_bff.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.Collection;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lsquareup/playpen_bff/v1/GetServicesResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lxyz/block/protos/genie/Collection$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GetServicesResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetServicesResponse> CREATOR;
    public final List services;

    static {
        GetServicesResponse$Companion$ADAPTER$1 getServicesResponse$Companion$ADAPTER$1 = new GetServicesResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetServicesResponse.class), "type.googleapis.com/squareup.playpen_bff.v1.GetServicesResponse", Syntax.PROTO_3, null, "squareup/playpen_bff/v1/service.proto");
        ADAPTER = getServicesResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getServicesResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetServicesResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.services = TransactorKt.immutableCopyOf("services", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetServicesResponse)) {
            return false;
        }
        GetServicesResponse getServicesResponse = (GetServicesResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getServicesResponse.unknownFields()) && Intrinsics.areEqual(this.services, getServicesResponse.services);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.services.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Collection.Builder builder = new Collection.Builder(29, false);
        builder.items = this.services;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.services;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("services=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetServicesResponse{", "}", 0, null, null, 56);
    }
}
