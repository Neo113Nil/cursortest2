package squareup.cash.earnings;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
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
import xyz.block.protos.genie.Binding;

/* loaded from: classes10.dex */
public final class EarningsAppletUIState extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EarningsAppletUIState> CREATOR;
    public final EarningsAppletState applet_state;
    public final String client_route;
    public final List stream_avatars;
    public final LocalizedString subtitle_text;
    public final LocalizedString title_text;

    static {
        EarningsAppletUIState$Companion$ADAPTER$1 earningsAppletUIState$Companion$ADAPTER$1 = new EarningsAppletUIState$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EarningsAppletUIState.class), "type.googleapis.com/squareup.cash.earnings.EarningsAppletUIState", Syntax.PROTO_2, null, "squareup/cash/earnings/EarningsAppletUIState.proto");
        ADAPTER = earningsAppletUIState$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(earningsAppletUIState$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningsAppletUIState(EarningsAppletState earningsAppletState, LocalizedString localizedString, LocalizedString localizedString2, String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.applet_state = earningsAppletState;
        this.title_text = localizedString;
        this.subtitle_text = localizedString2;
        this.client_route = str;
        this.stream_avatars = TransactorKt.immutableCopyOf("stream_avatars", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EarningsAppletUIState)) {
            return false;
        }
        EarningsAppletUIState earningsAppletUIState = (EarningsAppletUIState) obj;
        return Intrinsics.areEqual(unknownFields(), earningsAppletUIState.unknownFields()) && this.applet_state == earningsAppletUIState.applet_state && Intrinsics.areEqual(this.title_text, earningsAppletUIState.title_text) && Intrinsics.areEqual(this.subtitle_text, earningsAppletUIState.subtitle_text) && Intrinsics.areEqual(this.client_route, earningsAppletUIState.client_route) && Intrinsics.areEqual(this.stream_avatars, earningsAppletUIState.stream_avatars);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        EarningsAppletState earningsAppletState = this.applet_state;
        int hashCode2 = (hashCode + (earningsAppletState != null ? earningsAppletState.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.title_text;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.subtitle_text;
        int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        String str = this.client_route;
        int hashCode5 = this.stream_avatars.hashCode() + ((hashCode4 + (str != null ? str.hashCode() : 0)) * 37);
        this.hashCode = hashCode5;
        return hashCode5;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Binding.Builder builder = new Binding.Builder(13);
        builder.key_path = this.applet_state;
        builder.get_transform = this.title_text;
        builder.set_transform = this.subtitle_text;
        builder.validation = this.client_route;
        builder.on_invalid = this.stream_avatars;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        EarningsAppletState earningsAppletState = this.applet_state;
        if (earningsAppletState != null) {
            arrayList.add("applet_state=" + earningsAppletState);
        }
        LocalizedString localizedString = this.title_text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title_text=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.subtitle_text;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("subtitle_text=", localizedString2, arrayList);
        }
        String str = this.client_route;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route=", arrayList);
        }
        List list = this.stream_avatars;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("stream_avatars=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EarningsAppletUIState{", "}", 0, null, null, 56);
    }
}
