package squareup.cash.cryptocurrency;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cats.Cats;
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
public final class BtcP2pConversionBps extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BtcP2pConversionBps> CREATOR;
    public final Long conversion_bps;

    static {
        BtcP2pConversionBps$Companion$ADAPTER$1 btcP2pConversionBps$Companion$ADAPTER$1 = new BtcP2pConversionBps$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BtcP2pConversionBps.class), "type.googleapis.com/squareup.cash.cryptocurrency.BtcP2pConversionBps", Syntax.PROTO_2, null, "squareup/cash/cryptocurrency/BtcP2pConversionBps.proto");
        ADAPTER = btcP2pConversionBps$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(btcP2pConversionBps$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BtcP2pConversionBps(Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.conversion_bps = l;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BtcP2pConversionBps)) {
            return false;
        }
        BtcP2pConversionBps btcP2pConversionBps = (BtcP2pConversionBps) obj;
        return Intrinsics.areEqual(unknownFields(), btcP2pConversionBps.unknownFields()) && Intrinsics.areEqual(this.conversion_bps, btcP2pConversionBps.conversion_bps);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.conversion_bps;
        int hashCode2 = hashCode + (l != null ? Long.hashCode(l.longValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Cats.Builder builder = new Cats.Builder(15);
        builder.cat_count = this.conversion_bps;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.conversion_bps;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("conversion_bps=", l, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BtcP2pConversionBps{", "}", 0, null, null, 56);
    }
}
