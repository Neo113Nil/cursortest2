package squareup.cash.savings;

import android.os.Parcelable;
import com.squareup.cash.money.viewmodels.api.Section;
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
public final class SavingsExternalReferenceIdentifier extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SavingsExternalReferenceIdentifier> CREATOR;
    public final Section.Header screen;

    /* renamed from: type, reason: collision with root package name */
    public final SavingsExternalReference f1642type;

    static {
        SavingsExternalReferenceIdentifier$Companion$ADAPTER$1 savingsExternalReferenceIdentifier$Companion$ADAPTER$1 = new SavingsExternalReferenceIdentifier$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsExternalReferenceIdentifier.class), "type.googleapis.com/squareup.cash.savings.SavingsExternalReferenceIdentifier", Syntax.PROTO_2, null, "squareup/cash/savings/SavingsExternalElements.proto");
        ADAPTER = savingsExternalReferenceIdentifier$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsExternalReferenceIdentifier$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsExternalReferenceIdentifier(SavingsExternalReference savingsExternalReference, Section.Header header, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.f1642type = savingsExternalReference;
        this.screen = header;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavingsExternalReferenceIdentifier)) {
            return false;
        }
        SavingsExternalReferenceIdentifier savingsExternalReferenceIdentifier = (SavingsExternalReferenceIdentifier) obj;
        return Intrinsics.areEqual(unknownFields(), savingsExternalReferenceIdentifier.unknownFields()) && this.f1642type == savingsExternalReferenceIdentifier.f1642type && Intrinsics.areEqual(this.screen, savingsExternalReferenceIdentifier.screen);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SavingsExternalReference savingsExternalReference = this.f1642type;
        int hashCode2 = (hashCode + (savingsExternalReference != null ? savingsExternalReference.hashCode() : 0)) * 37;
        Section.Header header = this.screen;
        int hashCode3 = hashCode2 + (header != null ? header.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsConfig.Builder builder = new BillsConfig.Builder(23);
        builder.bills_applet_default_action = this.f1642type;
        builder.half_applet_content = this.screen;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SavingsExternalReference savingsExternalReference = this.f1642type;
        if (savingsExternalReference != null) {
            arrayList.add("type=" + savingsExternalReference);
        }
        Section.Header header = this.screen;
        if (header != null) {
            arrayList.add("screen=" + header);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsExternalReferenceIdentifier{", "}", 0, null, null, 56);
    }
}
