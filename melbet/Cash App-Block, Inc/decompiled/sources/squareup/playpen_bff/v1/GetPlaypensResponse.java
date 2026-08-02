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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lsquareup/playpen_bff/v1/GetPlaypensResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lxyz/block/protos/genie/Collection$Builder;", "Builder", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GetPlaypensResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetPlaypensResponse> CREATOR;
    public final List playpens;

    static {
        GetPlaypensResponse$Companion$ADAPTER$1 getPlaypensResponse$Companion$ADAPTER$1 = new GetPlaypensResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetPlaypensResponse.class), "type.googleapis.com/squareup.playpen_bff.v1.GetPlaypensResponse", Syntax.PROTO_3, null, "squareup/playpen_bff/v1/service.proto");
        ADAPTER = getPlaypensResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getPlaypensResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPlaypensResponse(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.playpens = TransactorKt.immutableCopyOf("playpens", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetPlaypensResponse)) {
            return false;
        }
        GetPlaypensResponse getPlaypensResponse = (GetPlaypensResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getPlaypensResponse.unknownFields()) && Intrinsics.areEqual(this.playpens, getPlaypensResponse.playpens);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.playpens.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Collection.Builder builder = new Collection.Builder(28, false);
        builder.items = this.playpens;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.playpens;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("playpens=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetPlaypensResponse{", "}", 0, null, null, 56);
    }
}
