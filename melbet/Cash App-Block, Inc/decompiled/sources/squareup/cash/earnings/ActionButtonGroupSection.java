package squareup.cash.earnings;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
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
import xyz.block.protos.genie.Collection;

/* loaded from: classes10.dex */
public final class ActionButtonGroupSection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActionButtonGroupSection> CREATOR;
    public final List buttons;

    static {
        ActionButtonGroupSection$Companion$ADAPTER$1 actionButtonGroupSection$Companion$ADAPTER$1 = new ActionButtonGroupSection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActionButtonGroupSection.class), "type.googleapis.com/squareup.cash.earnings.ActionButtonGroupSection", Syntax.PROTO_2, null, "squareup/cash/earnings/EarningsHomeUi.proto");
        ADAPTER = actionButtonGroupSection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(actionButtonGroupSection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionButtonGroupSection(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.buttons = TransactorKt.immutableCopyOf("buttons", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActionButtonGroupSection)) {
            return false;
        }
        ActionButtonGroupSection actionButtonGroupSection = (ActionButtonGroupSection) obj;
        return Intrinsics.areEqual(unknownFields(), actionButtonGroupSection.unknownFields()) && Intrinsics.areEqual(this.buttons, actionButtonGroupSection.buttons);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.buttons.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Collection.Builder builder = new Collection.Builder(21, false);
        builder.items = this.buttons;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.buttons;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("buttons=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActionButtonGroupSection{", "}", 0, null, null, 56);
    }
}
