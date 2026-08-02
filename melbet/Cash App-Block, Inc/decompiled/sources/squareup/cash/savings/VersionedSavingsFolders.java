package squareup.cash.savings;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
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
import xyz.block.protos.genie.ViewPlan;

/* loaded from: classes10.dex */
public final class VersionedSavingsFolders extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<VersionedSavingsFolders> CREATOR;
    public final String v2_balance_token;
    public final List v2_folders;

    static {
        VersionedSavingsFolders$Companion$ADAPTER$1 versionedSavingsFolders$Companion$ADAPTER$1 = new VersionedSavingsFolders$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(VersionedSavingsFolders.class), "type.googleapis.com/squareup.cash.savings.VersionedSavingsFolders", Syntax.PROTO_2, null, "squareup/cash/savings/VersionedSavingsFolders.proto");
        ADAPTER = versionedSavingsFolders$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(versionedSavingsFolders$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VersionedSavingsFolders(List list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.v2_balance_token = str;
        this.v2_folders = TransactorKt.immutableCopyOf("v2_folders", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof VersionedSavingsFolders)) {
            return false;
        }
        VersionedSavingsFolders versionedSavingsFolders = (VersionedSavingsFolders) obj;
        return Intrinsics.areEqual(unknownFields(), versionedSavingsFolders.unknownFields()) && Intrinsics.areEqual(this.v2_folders, versionedSavingsFolders.v2_folders) && Intrinsics.areEqual(this.v2_balance_token, versionedSavingsFolders.v2_balance_token);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.v2_folders);
        String str = this.v2_balance_token;
        int hashCode = m + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ViewPlan.Builder builder = new ViewPlan.Builder(13, false);
        builder.view_entries = this.v2_folders;
        builder.initial_view_slug = this.v2_balance_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.v2_folders;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("v2_folders=", arrayList, list);
        }
        String str = this.v2_balance_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "v2_balance_token=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "VersionedSavingsFolders{", "}", 0, null, null, 56);
    }
}
