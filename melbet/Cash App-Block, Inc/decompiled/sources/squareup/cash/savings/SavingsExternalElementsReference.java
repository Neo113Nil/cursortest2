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
import squareup.cash.savings.SavingsExternalElements;

/* loaded from: classes10.dex */
public final class SavingsExternalElementsReference extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SavingsExternalElementsReference> CREATOR;
    public final List fallback_elements;
    public final SavingsExternalReference savings_external_reference;
    public final SavingsExternalReferenceIdentifier savings_external_reference_id;

    static {
        SavingsExternalElementsReference$Companion$ADAPTER$1 savingsExternalElementsReference$Companion$ADAPTER$1 = new SavingsExternalElementsReference$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsExternalElementsReference.class), "type.googleapis.com/squareup.cash.savings.SavingsExternalElementsReference", Syntax.PROTO_2, null, "squareup/cash/savings/SavingsExternalElements.proto");
        ADAPTER = savingsExternalElementsReference$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsExternalElementsReference$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsExternalElementsReference(SavingsExternalReference savingsExternalReference, List list, SavingsExternalReferenceIdentifier savingsExternalReferenceIdentifier, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.savings_external_reference = savingsExternalReference;
        this.savings_external_reference_id = savingsExternalReferenceIdentifier;
        this.fallback_elements = TransactorKt.immutableCopyOf("fallback_elements", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavingsExternalElementsReference)) {
            return false;
        }
        SavingsExternalElementsReference savingsExternalElementsReference = (SavingsExternalElementsReference) obj;
        return Intrinsics.areEqual(unknownFields(), savingsExternalElementsReference.unknownFields()) && this.savings_external_reference == savingsExternalElementsReference.savings_external_reference && Intrinsics.areEqual(this.fallback_elements, savingsExternalElementsReference.fallback_elements) && Intrinsics.areEqual(this.savings_external_reference_id, savingsExternalElementsReference.savings_external_reference_id);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        SavingsExternalReference savingsExternalReference = this.savings_external_reference;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (savingsExternalReference != null ? savingsExternalReference.hashCode() : 0)) * 37, 37, this.fallback_elements);
        SavingsExternalReferenceIdentifier savingsExternalReferenceIdentifier = this.savings_external_reference_id;
        int hashCode2 = m + (savingsExternalReferenceIdentifier != null ? savingsExternalReferenceIdentifier.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SavingsExternalElements.Builder builder = new SavingsExternalElements.Builder(1);
        builder.savings_external_reference = this.savings_external_reference;
        builder.elements = this.fallback_elements;
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
        List list = this.fallback_elements;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("fallback_elements=", arrayList, list);
        }
        SavingsExternalReferenceIdentifier savingsExternalReferenceIdentifier = this.savings_external_reference_id;
        if (savingsExternalReferenceIdentifier != null) {
            arrayList.add("savings_external_reference_id=" + savingsExternalReferenceIdentifier);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsExternalElementsReference{", "}", 0, null, null, 56);
    }
}
