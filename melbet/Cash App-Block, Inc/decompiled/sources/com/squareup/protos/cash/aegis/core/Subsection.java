package com.squareup.protos.cash.aegis.core;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.localization.LocalizedString;
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
import squareup.cash.bills.BillsApplet;

/* loaded from: classes7.dex */
public final class Subsection extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Subsection> CREATOR;
    public final List blocks;
    public final LocalizedString pill_text;

    static {
        Subsection$Companion$ADAPTER$1 subsection$Companion$ADAPTER$1 = new Subsection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Subsection.class), "type.googleapis.com/squareup.cash.aegis.core.Subsection", Syntax.PROTO_2, null, "squareup/cash/aegis/core/SafetyEducationHub.proto");
        ADAPTER = subsection$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(subsection$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Subsection(LocalizedString localizedString, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.pill_text = localizedString;
        this.blocks = TransactorKt.immutableCopyOf("blocks", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Subsection)) {
            return false;
        }
        Subsection subsection = (Subsection) obj;
        return Intrinsics.areEqual(unknownFields(), subsection.unknownFields()) && Intrinsics.areEqual(this.pill_text, subsection.pill_text) && Intrinsics.areEqual(this.blocks, subsection.blocks);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        LocalizedString localizedString = this.pill_text;
        int hashCode2 = this.blocks.hashCode() + ((hashCode + (localizedString != null ? localizedString.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsApplet.FullApplet.Builder builder = new BillsApplet.FullApplet.Builder(4);
        builder.title = this.pill_text;
        builder.lines = this.blocks;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        LocalizedString localizedString = this.pill_text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("pill_text=", localizedString, arrayList);
        }
        List list = this.blocks;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("blocks=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Subsection{", "}", 0, null, null, 56);
    }

    public Subsection(LocalizedString localizedString, List list) {
        this(localizedString, list, ByteString.EMPTY);
    }
}
