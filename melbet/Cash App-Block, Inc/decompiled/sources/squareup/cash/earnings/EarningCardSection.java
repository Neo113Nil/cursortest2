package squareup.cash.earnings;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
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
import xyz.block.protos.genie.Binding;

/* loaded from: classes10.dex */
public final class EarningCardSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<EarningCardSection> CREATOR;
    public final LocalizedString call_to_action_text;
    public final String client_route;
    public final Image header_image;
    public final LocalizedString subtitle;
    public final LocalizedString title;

    static {
        EarningCardSection$Companion$ADAPTER$1 earningCardSection$Companion$ADAPTER$1 = new EarningCardSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(EarningCardSection.class), "type.googleapis.com/squareup.cash.earnings.EarningCardSection", Syntax.PROTO_2, null, "squareup/cash/earnings/EarningsHomeUi.proto");
        ADAPTER = earningCardSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(earningCardSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningCardSection(Image image, LocalizedString localizedString, LocalizedString localizedString2, String str, LocalizedString localizedString3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.header_image = image;
        this.title = localizedString;
        this.subtitle = localizedString2;
        this.client_route = str;
        this.call_to_action_text = localizedString3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EarningCardSection)) {
            return false;
        }
        EarningCardSection earningCardSection = (EarningCardSection) obj;
        return Intrinsics.areEqual(unknownFields(), earningCardSection.unknownFields()) && Intrinsics.areEqual(this.header_image, earningCardSection.header_image) && Intrinsics.areEqual(this.title, earningCardSection.title) && Intrinsics.areEqual(this.subtitle, earningCardSection.subtitle) && Intrinsics.areEqual(this.client_route, earningCardSection.client_route) && Intrinsics.areEqual(this.call_to_action_text, earningCardSection.call_to_action_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Image image = this.header_image;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.title;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.subtitle;
        int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        String str = this.client_route;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        LocalizedString localizedString3 = this.call_to_action_text;
        int hashCode6 = hashCode5 + (localizedString3 != null ? localizedString3.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Binding.Builder builder = new Binding.Builder(12);
        builder.key_path = this.header_image;
        builder.get_transform = this.title;
        builder.set_transform = this.subtitle;
        builder.validation = this.client_route;
        builder.on_invalid = this.call_to_action_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Image image = this.header_image;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("header_image=", image, arrayList);
        }
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.subtitle;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
        }
        String str = this.client_route;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route=", arrayList);
        }
        LocalizedString localizedString3 = this.call_to_action_text;
        if (localizedString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("call_to_action_text=", localizedString3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "EarningCardSection{", "}", 0, null, null, 56);
    }
}
