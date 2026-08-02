package squareup.cash.savings.action;

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
import squareup.cash.bills.BillsApplet;
import squareup.cash.savings.action.Card;

/* loaded from: classes10.dex */
public final class CompactCard extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CompactCard> CREATOR;
    public final Button button;
    public final Card.Image image;
    public final LocalizedString title;

    static {
        CompactCard$Companion$ADAPTER$1 compactCard$Companion$ADAPTER$1 = new CompactCard$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CompactCard.class), "type.googleapis.com/squareup.cash.savings.action.CompactCard", Syntax.PROTO_2, null, "squareup/cash/savings/action/SavingsAction.proto");
        ADAPTER = compactCard$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(compactCard$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompactCard(Card.Image image, LocalizedString localizedString, Button button, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.image = image;
        this.title = localizedString;
        this.button = button;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CompactCard)) {
            return false;
        }
        CompactCard compactCard = (CompactCard) obj;
        return Intrinsics.areEqual(unknownFields(), compactCard.unknownFields()) && this.image == compactCard.image && Intrinsics.areEqual(this.title, compactCard.title) && Intrinsics.areEqual(this.button, compactCard.button);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Card.Image image = this.image;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.title;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        Button button = this.button;
        int hashCode4 = hashCode3 + (button != null ? button.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsApplet.Builder builder = new BillsApplet.Builder(25);
        builder.action = this.image;
        builder.full_applet = this.title;
        builder.half_applet = this.button;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Card.Image image = this.image;
        if (image != null) {
            arrayList.add("image=" + image);
        }
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        Button button = this.button;
        if (button != null) {
            arrayList.add("button=" + button);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CompactCard{", "}", 0, null, null, 56);
    }
}
