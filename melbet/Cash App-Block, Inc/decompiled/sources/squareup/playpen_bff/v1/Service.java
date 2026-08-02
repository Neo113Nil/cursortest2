package squareup.playpen_bff.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import xyz.block.protos.genie.OpenURL;

/* loaded from: classes10.dex */
public final class Service extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Service> CREATOR;
    public final String name;

    static {
        Service$Companion$ADAPTER$1 service$Companion$ADAPTER$1 = new Service$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Service.class), "type.googleapis.com/squareup.playpen_bff.v1.Service", Syntax.PROTO_3, null, "squareup/playpen_bff/v1/service.proto");
        ADAPTER = service$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(service$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Service(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        byteString.getClass();
        this.name = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Service)) {
            return false;
        }
        Service service = (Service) obj;
        return Intrinsics.areEqual(unknownFields(), service.unknownFields()) && Intrinsics.areEqual(this.name, service.name);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.name.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        OpenURL.Builder builder = new OpenURL.Builder(8);
        builder.url = this.name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.name, "name=", arrayList);
        return CollectionsKt.joinToString$default(arrayList, ", ", "Service{", "}", 0, null, null, 56);
    }
}
