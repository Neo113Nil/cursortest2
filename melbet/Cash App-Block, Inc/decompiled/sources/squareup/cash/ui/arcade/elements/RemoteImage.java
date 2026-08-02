package squareup.cash.ui.arcade.elements;

import android.os.Parcelable;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.contour.SizeMode$EnumUnboxingLocalUtility;
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
public final class RemoteImage extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<RemoteImage> CREATOR;
    public final String accessibility_label;
    public final Integer height;
    public final HorizontalAlignment horizontal_alignment;
    public final Image image;
    public final Integer width;

    static {
        RemoteImage$Companion$ADAPTER$1 remoteImage$Companion$ADAPTER$1 = new RemoteImage$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(RemoteImage.class), "type.googleapis.com/squareup.cash.ui.arcade.elements.RemoteImage", Syntax.PROTO_2, null, "squareup/cash/ui/arcade/elements/RemoteImage.proto");
        ADAPTER = remoteImage$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(remoteImage$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteImage(Integer num, Integer num2, Image image, HorizontalAlignment horizontalAlignment, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.width = num;
        this.height = num2;
        this.image = image;
        this.horizontal_alignment = horizontalAlignment;
        this.accessibility_label = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RemoteImage)) {
            return false;
        }
        RemoteImage remoteImage = (RemoteImage) obj;
        return Intrinsics.areEqual(unknownFields(), remoteImage.unknownFields()) && Intrinsics.areEqual(this.width, remoteImage.width) && Intrinsics.areEqual(this.height, remoteImage.height) && Intrinsics.areEqual(this.image, remoteImage.image) && this.horizontal_alignment == remoteImage.horizontal_alignment && Intrinsics.areEqual(this.accessibility_label, remoteImage.accessibility_label);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.width;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        Integer num2 = this.height;
        int hashCode3 = (hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 37;
        Image image = this.image;
        int hashCode4 = (hashCode3 + (image != null ? image.hashCode() : 0)) * 37;
        HorizontalAlignment horizontalAlignment = this.horizontal_alignment;
        int hashCode5 = (hashCode4 + (horizontalAlignment != null ? horizontalAlignment.hashCode() : 0)) * 37;
        String str = this.accessibility_label;
        int hashCode6 = hashCode5 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Binding.Builder builder = new Binding.Builder(27);
        builder.key_path = this.width;
        builder.get_transform = this.height;
        builder.set_transform = this.image;
        builder.validation = this.horizontal_alignment;
        builder.on_invalid = this.accessibility_label;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.width;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("width=", num, arrayList);
        }
        Integer num2 = this.height;
        if (num2 != null) {
            re$$ExternalSyntheticOutline0.m("height=", num2, arrayList);
        }
        Image image = this.image;
        if (image != null) {
            SizeMode$EnumUnboxingLocalUtility.m("image=", image, arrayList);
        }
        HorizontalAlignment horizontalAlignment = this.horizontal_alignment;
        if (horizontalAlignment != null) {
            arrayList.add("horizontal_alignment=" + horizontalAlignment);
        }
        String str = this.accessibility_label;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "accessibility_label=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "RemoteImage{", "}", 0, null, null, 56);
    }
}
