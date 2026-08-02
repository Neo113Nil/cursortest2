package squareup.cash.earnings;

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
public final class EarningStreamIdentifier extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EarningStreamIdentifier> CREATOR;
    public final String token;

    static {
        EarningStreamIdentifier$Companion$ADAPTER$1 earningStreamIdentifier$Companion$ADAPTER$1 = new EarningStreamIdentifier$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EarningStreamIdentifier.class), "type.googleapis.com/squareup.cash.earnings.EarningStreamIdentifier", Syntax.PROTO_2, null, "squareup/cash/earnings/earnings_common.proto");
        ADAPTER = earningStreamIdentifier$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(earningStreamIdentifier$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningStreamIdentifier(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.token = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EarningStreamIdentifier)) {
            return false;
        }
        EarningStreamIdentifier earningStreamIdentifier = (EarningStreamIdentifier) obj;
        return Intrinsics.areEqual(unknownFields(), earningStreamIdentifier.unknownFields()) && Intrinsics.areEqual(this.token, earningStreamIdentifier.token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.token;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        OpenURL.Builder builder = new OpenURL.Builder(5);
        builder.url = this.token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EarningStreamIdentifier{", "}", 0, null, null, 56);
    }
}
