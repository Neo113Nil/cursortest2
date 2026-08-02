package squareup.cash.ui.arcade.elements;

import android.os.Parcelable;
import androidx.camera.camera2.pipe.CameraGraph$OperatingMode;
import bo.app.re$$ExternalSyntheticOutline0;
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
import squareup.cash.bills.BillsConfig;

/* loaded from: classes10.dex */
public final class ArcadeComponent extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ArcadeComponent> CREATOR;
    public final CameraGraph$OperatingMode component;
    public final Integer version;

    static {
        ArcadeComponent$Companion$ADAPTER$1 arcadeComponent$Companion$ADAPTER$1 = new ArcadeComponent$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ArcadeComponent.class), "type.googleapis.com/squareup.cash.ui.arcade.elements.ArcadeComponent", Syntax.PROTO_2, null, "squareup/cash/ui/arcade/elements/ArcadeComponent.proto");
        ADAPTER = arcadeComponent$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(arcadeComponent$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArcadeComponent(Integer num, CameraGraph$OperatingMode cameraGraph$OperatingMode, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.version = num;
        this.component = cameraGraph$OperatingMode;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ArcadeComponent)) {
            return false;
        }
        ArcadeComponent arcadeComponent = (ArcadeComponent) obj;
        return Intrinsics.areEqual(unknownFields(), arcadeComponent.unknownFields()) && Intrinsics.areEqual(this.version, arcadeComponent.version) && Intrinsics.areEqual(this.component, arcadeComponent.component);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Integer num = this.version;
        int hashCode2 = (hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0)) * 37;
        CameraGraph$OperatingMode cameraGraph$OperatingMode = this.component;
        int hashCode3 = hashCode2 + (cameraGraph$OperatingMode != null ? cameraGraph$OperatingMode.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsConfig.Builder builder = new BillsConfig.Builder(29);
        builder.bills_applet_default_action = this.version;
        builder.half_applet_content = this.component;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Integer num = this.version;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("version=", num, arrayList);
        }
        CameraGraph$OperatingMode cameraGraph$OperatingMode = this.component;
        if (cameraGraph$OperatingMode != null) {
            arrayList.add("component=" + cameraGraph$OperatingMode);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ArcadeComponent{", "}", 0, null, null, 56);
    }
}
