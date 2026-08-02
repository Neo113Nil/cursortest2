package squareup.playpen_bff.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.IdValue;

/* loaded from: classes10.dex */
public final class Playpen extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Playpen> CREATOR;
    public final String baggage_header_value;
    public final String name;

    static {
        Playpen$Companion$ADAPTER$1 playpen$Companion$ADAPTER$1 = new Playpen$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Playpen.class), "type.googleapis.com/squareup.playpen_bff.v1.Playpen", Syntax.PROTO_3, null, "squareup/playpen_bff/v1/service.proto");
        ADAPTER = playpen$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(playpen$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Playpen(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        str2.getClass();
        byteString.getClass();
        this.name = str;
        this.baggage_header_value = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Playpen)) {
            return false;
        }
        Playpen playpen = (Playpen) obj;
        return Intrinsics.areEqual(unknownFields(), playpen.unknownFields()) && Intrinsics.areEqual(this.name, playpen.name) && Intrinsics.areEqual(this.baggage_header_value, playpen.baggage_header_value);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.baggage_header_value.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.name);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        IdValue.Builder builder = new IdValue.Builder(24);
        builder.server = this.name;
        builder.local = this.baggage_header_value;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.name, "name=", arrayList);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.baggage_header_value, "baggage_header_value=", arrayList);
        return CollectionsKt.joinToString$default(arrayList, ", ", "Playpen{", "}", 0, null, null, 56);
    }
}
