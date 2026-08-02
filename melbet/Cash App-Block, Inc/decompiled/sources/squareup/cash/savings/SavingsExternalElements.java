package squareup.cash.savings;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
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

/* loaded from: classes10.dex */
public final class SavingsExternalElements extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SavingsExternalElements> CREATOR;
    public final List elements;
    public final SavingsExternalReference savings_external_reference;
    public final SavingsExternalReferenceIdentifier savings_external_reference_id;

    public final class Builder extends Message.Builder {
        public final /* synthetic */ int $r8$classId;
        public List elements;
        public SavingsExternalReference savings_external_reference;
        public SavingsExternalReferenceIdentifier savings_external_reference_id;

        public /* synthetic */ Builder(int i) {
            this.$r8$classId = i;
        }

        @Override // com.squareup.wire.Message.Builder
        public final Message build() {
            switch (this.$r8$classId) {
                case 0:
                    return new SavingsExternalElements(this.savings_external_reference, this.elements, this.savings_external_reference_id, buildUnknownFields());
                default:
                    return new SavingsExternalElementsReference(this.savings_external_reference, this.elements, this.savings_external_reference_id, buildUnknownFields());
            }
        }
    }

    static {
        SavingsExternalElements$Companion$ADAPTER$1 savingsExternalElements$Companion$ADAPTER$1 = new SavingsExternalElements$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsExternalElements.class), "type.googleapis.com/squareup.cash.savings.SavingsExternalElements", Syntax.PROTO_2, null, "squareup/cash/savings/SavingsExternalElements.proto");
        ADAPTER = savingsExternalElements$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsExternalElements$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsExternalElements(SavingsExternalReference savingsExternalReference, List list, SavingsExternalReferenceIdentifier savingsExternalReferenceIdentifier, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.savings_external_reference = savingsExternalReference;
        this.savings_external_reference_id = savingsExternalReferenceIdentifier;
        this.elements = TransactorKt.immutableCopyOf("elements", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavingsExternalElements)) {
            return false;
        }
        SavingsExternalElements savingsExternalElements = (SavingsExternalElements) obj;
        return Intrinsics.areEqual(unknownFields(), savingsExternalElements.unknownFields()) && this.savings_external_reference == savingsExternalElements.savings_external_reference && Intrinsics.areEqual(this.elements, savingsExternalElements.elements) && Intrinsics.areEqual(this.savings_external_reference_id, savingsExternalElements.savings_external_reference_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SavingsExternalReference savingsExternalReference = this.savings_external_reference;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (savingsExternalReference != null ? savingsExternalReference.hashCode() : 0)) * 37, 37, this.elements);
        SavingsExternalReferenceIdentifier savingsExternalReferenceIdentifier = this.savings_external_reference_id;
        int hashCode2 = m + (savingsExternalReferenceIdentifier != null ? savingsExternalReferenceIdentifier.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Builder builder = new Builder(0);
        builder.savings_external_reference = this.savings_external_reference;
        builder.elements = this.elements;
        builder.savings_external_reference_id = this.savings_external_reference_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        SavingsExternalReference savingsExternalReference = this.savings_external_reference;
        if (savingsExternalReference != null) {
            arrayList.add("savings_external_reference=" + savingsExternalReference);
        }
        List list = this.elements;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("elements=", arrayList, list);
        }
        SavingsExternalReferenceIdentifier savingsExternalReferenceIdentifier = this.savings_external_reference_id;
        if (savingsExternalReferenceIdentifier != null) {
            arrayList.add("savings_external_reference_id=" + savingsExternalReferenceIdentifier);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsExternalElements{", "}", 0, null, null, 56);
    }
}
