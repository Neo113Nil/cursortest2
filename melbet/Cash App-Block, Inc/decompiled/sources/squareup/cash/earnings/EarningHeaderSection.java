package squareup.cash.earnings;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
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
import squareup.cash.savings.SavingsConfig;

/* loaded from: classes10.dex */
public final class EarningHeaderSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EarningHeaderSection> CREATOR;
    public final LocalizedString title;

    static {
        EarningHeaderSection$Companion$ADAPTER$1 earningHeaderSection$Companion$ADAPTER$1 = new EarningHeaderSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EarningHeaderSection.class), "type.googleapis.com/squareup.cash.earnings.EarningHeaderSection", Syntax.PROTO_2, null, "squareup/cash/earnings/EarningsHomeUi.proto");
        ADAPTER = earningHeaderSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(earningHeaderSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningHeaderSection(LocalizedString localizedString, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = localizedString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EarningHeaderSection)) {
            return false;
        }
        EarningHeaderSection earningHeaderSection = (EarningHeaderSection) obj;
        return Intrinsics.areEqual(unknownFields(), earningHeaderSection.unknownFields()) && Intrinsics.areEqual(this.title, earningHeaderSection.title);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.title;
        int hashCode2 = hashCode + (localizedString != null ? localizedString.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SavingsConfig.Yield.Builder builder = new SavingsConfig.Yield.Builder(8);
        builder.yield_current_rate_enhanced = this.title;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EarningHeaderSection{", "}", 0, null, null, 56);
    }
}
