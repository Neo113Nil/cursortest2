package squareup.cash.ui.arcade.elements;

import android.os.Parcelable;
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
public final class InlineMessage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<InlineMessage> CREATOR;
    public final LocalizedString body_text;
    public final Image image;
    public final LocalizedString primary_button_text;
    public final LocalizedString secondary_button_text;
    public final LocalizedString title_text;

    static {
        InlineMessage$Companion$ADAPTER$1 inlineMessage$Companion$ADAPTER$1 = new InlineMessage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(InlineMessage.class), "type.googleapis.com/squareup.cash.ui.arcade.elements.InlineMessage", Syntax.PROTO_2, null, "squareup/cash/ui/arcade/elements/InlineMessage.proto");
        ADAPTER = inlineMessage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(inlineMessage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineMessage(Image image, LocalizedString localizedString, LocalizedString localizedString2, LocalizedString localizedString3, LocalizedString localizedString4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.image = image;
        this.title_text = localizedString;
        this.body_text = localizedString2;
        this.primary_button_text = localizedString3;
        this.secondary_button_text = localizedString4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InlineMessage)) {
            return false;
        }
        InlineMessage inlineMessage = (InlineMessage) obj;
        return Intrinsics.areEqual(unknownFields(), inlineMessage.unknownFields()) && Intrinsics.areEqual(this.image, inlineMessage.image) && Intrinsics.areEqual(this.title_text, inlineMessage.title_text) && Intrinsics.areEqual(this.body_text, inlineMessage.body_text) && Intrinsics.areEqual(this.primary_button_text, inlineMessage.primary_button_text) && Intrinsics.areEqual(this.secondary_button_text, inlineMessage.secondary_button_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Image image = this.image;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.title_text;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.body_text;
        int hashCode4 = (hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0)) * 37;
        LocalizedString localizedString3 = this.primary_button_text;
        int hashCode5 = (hashCode4 + (localizedString3 != null ? localizedString3.hashCode() : 0)) * 37;
        LocalizedString localizedString4 = this.secondary_button_text;
        int hashCode6 = hashCode5 + (localizedString4 != null ? localizedString4.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Binding.Builder builder = new Binding.Builder(26);
        builder.key_path = this.image;
        builder.get_transform = this.title_text;
        builder.set_transform = this.body_text;
        builder.validation = this.primary_button_text;
        builder.on_invalid = this.secondary_button_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Image image = this.image;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
        }
        LocalizedString localizedString = this.title_text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title_text=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.body_text;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("body_text=", localizedString2, arrayList);
        }
        LocalizedString localizedString3 = this.primary_button_text;
        if (localizedString3 != null) {
            Matcher$$ExternalSyntheticOutline0.m("primary_button_text=", localizedString3, arrayList);
        }
        LocalizedString localizedString4 = this.secondary_button_text;
        if (localizedString4 != null) {
            Matcher$$ExternalSyntheticOutline0.m("secondary_button_text=", localizedString4, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "InlineMessage{", "}", 0, null, null, 56);
    }
}
