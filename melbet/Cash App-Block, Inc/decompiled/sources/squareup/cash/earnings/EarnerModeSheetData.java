package squareup.cash.earnings;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.lending.PrepurchaseCashCardAppletData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes10.dex */
public final class EarnerModeSheetData extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EarnerModeSheetData> CREATOR;
    public final LocalizedString body;
    public final List durations;
    public final LocalizedString primary_button_text;
    public final LocalizedString title;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public LocalizedString body;
        public List durations;
        public LocalizedString primary_button_text;
        public LocalizedString title;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new EarnerModeSheetData(this.title, this.body, this.durations, this.primary_button_text, buildUnknownFields());
                default:
                    return new PrepurchaseCashCardAppletData.PaymentPlansData(this.title, this.body, this.durations, this.primary_button_text, buildUnknownFields());
            }
        }
    }

    static {
        EarnerModeSheetData$Companion$ADAPTER$1 earnerModeSheetData$Companion$ADAPTER$1 = new EarnerModeSheetData$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EarnerModeSheetData.class), "type.googleapis.com/squareup.cash.earnings.EarnerModeSheetData", Syntax.PROTO_2, null, "squareup/cash/earnings/EarningsHomeUi.proto");
        ADAPTER = earnerModeSheetData$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(earnerModeSheetData$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarnerModeSheetData(LocalizedString localizedString, LocalizedString localizedString2, List list, LocalizedString localizedString3, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.title = localizedString;
        this.body = localizedString2;
        this.primary_button_text = localizedString3;
        this.durations = TransactorKt.immutableCopyOf("durations", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EarnerModeSheetData)) {
            return false;
        }
        EarnerModeSheetData earnerModeSheetData = (EarnerModeSheetData) obj;
        return Intrinsics.areEqual(unknownFields(), earnerModeSheetData.unknownFields()) && Intrinsics.areEqual(this.title, earnerModeSheetData.title) && Intrinsics.areEqual(this.body, earnerModeSheetData.body) && Intrinsics.areEqual(this.durations, earnerModeSheetData.durations) && Intrinsics.areEqual(this.primary_button_text, earnerModeSheetData.primary_button_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.title;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.body;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37, 37, this.durations);
        LocalizedString localizedString3 = this.primary_button_text;
        int hashCode3 = m + (localizedString3 != null ? localizedString3.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.title = this.title;
        builder.body = this.body;
        builder.durations = this.durations;
        builder.primary_button_text = this.primary_button_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.body;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("body=", localizedString2, arrayList);
        }
        List list = this.durations;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("durations=", arrayList, list);
        }
        LocalizedString localizedString3 = this.primary_button_text;
        if (localizedString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("primary_button_text=", localizedString3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EarnerModeSheetData{", "}", 0, null, null, 56);
    }
}
