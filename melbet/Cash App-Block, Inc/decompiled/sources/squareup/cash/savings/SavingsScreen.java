package squareup.cash.savings;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.analytics.AnalyticsMappersKt;
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
import squareup.cash.earnings.EarningTool;
import xyz.block.protos.genie.Collection;

/* loaded from: classes10.dex */
public final class SavingsScreen extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SavingsScreen> CREATOR;
    public final List elements;

    public final class Element extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Element> CREATOR;
        public final AnalyticsMappersKt element_type;

        static {
            SavingsScreen$Element$Companion$ADAPTER$1 savingsScreen$Element$Companion$ADAPTER$1 = new SavingsScreen$Element$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Element.class), "type.googleapis.com/squareup.cash.savings.SavingsScreen.Element", Syntax.PROTO_2, null, "squareup/cash/savings/VersionedSavingsScreens.proto");
            ADAPTER = savingsScreen$Element$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsScreen$Element$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Element(AnalyticsMappersKt analyticsMappersKt, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.element_type = analyticsMappersKt;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Element)) {
                return false;
            }
            Element element = (Element) obj;
            return Intrinsics.areEqual(unknownFields(), element.unknownFields()) && Intrinsics.areEqual(this.element_type, element.element_type);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            AnalyticsMappersKt analyticsMappersKt = this.element_type;
            int hashCode2 = hashCode + (analyticsMappersKt != null ? analyticsMappersKt.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            EarningTool.Builder builder = new EarningTool.Builder(27);
            builder.tool = this.element_type;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            AnalyticsMappersKt analyticsMappersKt = this.element_type;
            if (analyticsMappersKt != null) {
                arrayList.add("element_type=" + analyticsMappersKt);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Element{", "}", 0, null, null, 56);
        }
    }

    static {
        SavingsScreen$Companion$ADAPTER$1 savingsScreen$Companion$ADAPTER$1 = new SavingsScreen$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SavingsScreen.class), "type.googleapis.com/squareup.cash.savings.SavingsScreen", Syntax.PROTO_2, null, "squareup/cash/savings/VersionedSavingsScreens.proto");
        ADAPTER = savingsScreen$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(savingsScreen$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavingsScreen(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.elements = TransactorKt.immutableCopyOf("elements", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SavingsScreen)) {
            return false;
        }
        SavingsScreen savingsScreen = (SavingsScreen) obj;
        return Intrinsics.areEqual(unknownFields(), savingsScreen.unknownFields()) && Intrinsics.areEqual(this.elements, savingsScreen.elements);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.elements.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Collection.Builder builder = new Collection.Builder(26, false);
        builder.items = this.elements;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.elements;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("elements=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SavingsScreen{", "}", 0, null, null, 56);
    }
}
