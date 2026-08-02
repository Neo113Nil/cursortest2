package com.squareup.protos.cash.woodrow.syncvalues;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.sync_values.Text;
import com.squareup.protos.cash.localization.LocalizableString;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes8.dex */
public final class PerformanceDetailsUiFooter extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<PerformanceDetailsUiFooter> CREATOR;
    public final LocalizableString localizable_text;
    public final String text;

    static {
        PerformanceDetailsUiFooter$Companion$ADAPTER$1 performanceDetailsUiFooter$Companion$ADAPTER$1 = new PerformanceDetailsUiFooter$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(PerformanceDetailsUiFooter.class), "type.googleapis.com/squareup.cash.woodrow.syncvalues.PerformanceDetailsUiFooter", Syntax.PROTO_3, null, "squareup/cash/woodrow/syncvalues/types.proto");
        ADAPTER = performanceDetailsUiFooter$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(performanceDetailsUiFooter$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceDetailsUiFooter(String str, LocalizableString localizableString, ByteString byteString) {
        super(ADAPTER, byteString);
        str.getClass();
        byteString.getClass();
        this.text = str;
        this.localizable_text = localizableString;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PerformanceDetailsUiFooter)) {
            return false;
        }
        PerformanceDetailsUiFooter performanceDetailsUiFooter = (PerformanceDetailsUiFooter) obj;
        return Intrinsics.areEqual(unknownFields(), performanceDetailsUiFooter.unknownFields()) && Intrinsics.areEqual(this.text, performanceDetailsUiFooter.text) && Intrinsics.areEqual(this.localizable_text, performanceDetailsUiFooter.localizable_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(unknownFields().hashCode() * 37, 37, this.text);
        LocalizableString localizableString = this.localizable_text;
        int hashCode = m + (localizableString != null ? localizableString.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Text.Builder builder = new Text.Builder(2);
        builder.text = this.text;
        builder.localizable_text = this.localizable_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BalanceFeedKt$$ExternalSyntheticOutline0.m(this.text, "text=", arrayList);
        LocalizableString localizableString = this.localizable_text;
        if (localizableString != null) {
            Matcher$$ExternalSyntheticOutline0.m("localizable_text=", localizableString, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PerformanceDetailsUiFooter{", "}", 0, null, null, 56);
    }
}
