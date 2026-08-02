package squareup.cash.paychecks;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.payrollconnector.common.PayrollProviderUiSpecification;
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
public final class Employer extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Employer> CREATOR;
    public final String employer_token;
    public final PayrollProviderUiSpecification ui_specification;

    static {
        Employer$Companion$ADAPTER$1 employer$Companion$ADAPTER$1 = new Employer$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Employer.class), "type.googleapis.com/squareup.cash.paychecks.Employer", Syntax.PROTO_2, null, "squareup/cash/paychecks/common.proto");
        ADAPTER = employer$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(employer$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Employer(String str, PayrollProviderUiSpecification payrollProviderUiSpecification, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.employer_token = str;
        this.ui_specification = payrollProviderUiSpecification;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Employer)) {
            return false;
        }
        Employer employer = (Employer) obj;
        return Intrinsics.areEqual(unknownFields(), employer.unknownFields()) && Intrinsics.areEqual(this.employer_token, employer.employer_token) && Intrinsics.areEqual(this.ui_specification, employer.ui_specification);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.employer_token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        PayrollProviderUiSpecification payrollProviderUiSpecification = this.ui_specification;
        int hashCode3 = hashCode2 + (payrollProviderUiSpecification != null ? payrollProviderUiSpecification.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsConfig.Builder builder = new BillsConfig.Builder(17);
        builder.bills_applet_default_action = this.employer_token;
        builder.half_applet_content = this.ui_specification;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.employer_token;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "employer_token=", arrayList);
        }
        PayrollProviderUiSpecification payrollProviderUiSpecification = this.ui_specification;
        if (payrollProviderUiSpecification != null) {
            arrayList.add("ui_specification=" + payrollProviderUiSpecification);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Employer{", "}", 0, null, null, 56);
    }
}
