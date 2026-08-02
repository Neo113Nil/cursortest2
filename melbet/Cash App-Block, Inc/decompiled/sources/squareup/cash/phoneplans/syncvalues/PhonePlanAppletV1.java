package squareup.cash.phoneplans.syncvalues;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import net.idrnd.face.iad.capture.internal.y0;
import okio.ByteString;
import xyz.block.protos.genie.Binding;

/* loaded from: classes10.dex */
public final class PhonePlanAppletV1 extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PhonePlanAppletV1> CREATOR;
    public final String client_route_url;
    public final LocalizedString detail;
    public final State state;
    public final LocalizedString subtitle;
    public final LocalizedString title;

    /* loaded from: classes9.dex */
    public enum State implements WireEnum {
        STATE_UNSPECIFIED(0),
        NEVER_ENROLLED(1),
        PENDING(2),
        TRANSFERRING(3),
        PROVISIONED(4),
        ACTIVE(5),
        BILL_OVERDUE(6),
        SUSPENDED(7),
        ATTENTION_NEEDED(8),
        CANCELLED_PENDING(9),
        DEGRADED(10),
        CANCELLED(11);

        public static final PhonePlanAppletV1$State$Companion$ADAPTER$1 ADAPTER;
        public static final y0 Companion;
        public final int value;

        static {
            State state = STATE_UNSPECIFIED;
            Companion = new y0();
            ADAPTER = new PhonePlanAppletV1$State$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(State.class), Syntax.PROTO_2, state);
        }

        State(int i) {
            this.value = i;
        }

        public static final State fromValue(int i) {
            Companion.getClass();
            return y0.m4314fromValue(i);
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        PhonePlanAppletV1$Companion$ADAPTER$1 phonePlanAppletV1$Companion$ADAPTER$1 = new PhonePlanAppletV1$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PhonePlanAppletV1.class), "type.googleapis.com/squareup.cash.phoneplans.syncvalues.PhonePlanAppletV1", Syntax.PROTO_2, null, "squareup/cash/phoneplans/syncvalues/VersionedPhonePlanApplet.proto");
        ADAPTER = phonePlanAppletV1$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(phonePlanAppletV1$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhonePlanAppletV1(LocalizedString localizedString, LocalizedString localizedString2, State state, String str, LocalizedString localizedString3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.title = localizedString;
        this.subtitle = localizedString2;
        this.state = state;
        this.client_route_url = str;
        this.detail = localizedString3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PhonePlanAppletV1)) {
            return false;
        }
        PhonePlanAppletV1 phonePlanAppletV1 = (PhonePlanAppletV1) obj;
        return Intrinsics.areEqual(unknownFields(), phonePlanAppletV1.unknownFields()) && Intrinsics.areEqual(this.title, phonePlanAppletV1.title) && Intrinsics.areEqual(this.subtitle, phonePlanAppletV1.subtitle) && this.state == phonePlanAppletV1.state && Intrinsics.areEqual(this.client_route_url, phonePlanAppletV1.client_route_url) && Intrinsics.areEqual(this.detail, phonePlanAppletV1.detail);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.title;
        int hashCode2 = (hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.subtitle;
        int hashCode3 = (hashCode2 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        State state = this.state;
        int hashCode4 = (hashCode3 + (state != null ? state.hashCode() : 0)) * 37;
        String str = this.client_route_url;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        LocalizedString localizedString3 = this.detail;
        int hashCode6 = hashCode5 + (localizedString3 != null ? localizedString3.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Binding.Builder builder = new Binding.Builder(21);
        builder.key_path = this.title;
        builder.get_transform = this.subtitle;
        builder.set_transform = this.state;
        builder.validation = this.client_route_url;
        builder.on_invalid = this.detail;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.subtitle;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
        }
        State state = this.state;
        if (state != null) {
            arrayList.add("state=" + state);
        }
        String str = this.client_route_url;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route_url=", arrayList);
        }
        LocalizedString localizedString3 = this.detail;
        if (localizedString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("detail=", localizedString3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PhonePlanAppletV1{", "}", 0, null, null, 56);
    }
}
