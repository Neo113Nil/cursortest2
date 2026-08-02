package squareup.cash.savings;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import squareup.cash.earnings.ActionButton;

/* loaded from: classes10.dex */
public final class GeneralFolder extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GeneralFolder> CREATOR;
    public final String label;
    public final LocalizedString localized_label;

    static {
        GeneralFolder$Companion$ADAPTER$1 generalFolder$Companion$ADAPTER$1 = new GeneralFolder$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GeneralFolder.class), "type.googleapis.com/squareup.cash.savings.GeneralFolder", Syntax.PROTO_2, null, "squareup/cash/savings/GeneralFolder.proto");
        ADAPTER = generalFolder$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(generalFolder$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeneralFolder(LocalizedString localizedString, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.label = str;
        this.localized_label = localizedString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GeneralFolder)) {
            return false;
        }
        GeneralFolder generalFolder = (GeneralFolder) obj;
        return Intrinsics.areEqual(unknownFields(), generalFolder.unknownFields()) && Intrinsics.areEqual(this.label, generalFolder.label) && Intrinsics.areEqual(this.localized_label, generalFolder.localized_label);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.label;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.localized_label;
        int hashCode3 = hashCode2 + (localizedString != null ? localizedString.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ActionButton.Builder builder = new ActionButton.Builder(7);
        builder.client_route = this.label;
        builder.title = this.localized_label;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.label;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "label=", arrayList);
        }
        LocalizedString localizedString = this.localized_label;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localized_label=", localizedString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GeneralFolder{", "}", 0, null, null, 56);
    }
}
