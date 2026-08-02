package squareup.cash.savings.bespoke_elements;

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
import squareup.cash.analytics.CdfEvent;
import squareup.cash.ui.arcade.elements.ButtonCompact;
import xyz.block.protos.genie.Binding;

/* loaded from: classes10.dex */
public final class CompactCard extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CompactCard> CREATOR;
    public final LocalizedString body_text;
    public final ButtonCompact button;
    public final String button_client_route;
    public final CdfEvent cdfEvent;
    public final CardImage image;

    static {
        CompactCard$Companion$ADAPTER$1 compactCard$Companion$ADAPTER$1 = new CompactCard$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CompactCard.class), "type.googleapis.com/squareup.cash.savings.bespoke_elements.CompactCard", Syntax.PROTO_2, null, "squareup/cash/savings/bespoke_elements/CompactCard.proto");
        ADAPTER = compactCard$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(compactCard$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompactCard(CardImage cardImage, LocalizedString localizedString, ButtonCompact buttonCompact, String str, CdfEvent cdfEvent, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.image = cardImage;
        this.body_text = localizedString;
        this.button = buttonCompact;
        this.button_client_route = str;
        this.cdfEvent = cdfEvent;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CompactCard)) {
            return false;
        }
        CompactCard compactCard = (CompactCard) obj;
        return Intrinsics.areEqual(unknownFields(), compactCard.unknownFields()) && this.image == compactCard.image && Intrinsics.areEqual(this.body_text, compactCard.body_text) && Intrinsics.areEqual(this.button, compactCard.button) && Intrinsics.areEqual(this.button_client_route, compactCard.button_client_route) && Intrinsics.areEqual(this.cdfEvent, compactCard.cdfEvent);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        CardImage cardImage = this.image;
        int hashCode2 = (hashCode + (cardImage != null ? cardImage.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.body_text;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        ButtonCompact buttonCompact = this.button;
        int hashCode4 = (hashCode3 + (buttonCompact != null ? buttonCompact.hashCode() : 0)) * 37;
        String str = this.button_client_route;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 37;
        CdfEvent cdfEvent = this.cdfEvent;
        int hashCode6 = hashCode5 + (cdfEvent != null ? cdfEvent.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Binding.Builder builder = new Binding.Builder(24);
        builder.key_path = this.image;
        builder.get_transform = this.body_text;
        builder.set_transform = this.button;
        builder.validation = this.button_client_route;
        builder.on_invalid = this.cdfEvent;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        CardImage cardImage = this.image;
        if (cardImage != null) {
            arrayList.add("image=" + cardImage);
        }
        LocalizedString localizedString = this.body_text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("body_text=", localizedString, arrayList);
        }
        ButtonCompact buttonCompact = this.button;
        if (buttonCompact != null) {
            arrayList.add("button=" + buttonCompact);
        }
        String str = this.button_client_route;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "button_client_route=", arrayList);
        }
        CdfEvent cdfEvent = this.cdfEvent;
        if (cdfEvent != null) {
            arrayList.add("cdfEvent=" + cdfEvent);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CompactCard{", "}", 0, null, null, 56);
    }
}
