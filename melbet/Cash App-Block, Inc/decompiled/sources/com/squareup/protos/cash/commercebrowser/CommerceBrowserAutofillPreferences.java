package com.squareup.protos.cash.commercebrowser;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.ui.UiAppLock;
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

/* loaded from: classes7.dex */
public final class CommerceBrowserAutofillPreferences extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CommerceBrowserAutofillPreferences> CREATOR;
    public final Boolean opt_out;

    static {
        CommerceBrowserAutofillPreferences$Companion$ADAPTER$1 commerceBrowserAutofillPreferences$Companion$ADAPTER$1 = new CommerceBrowserAutofillPreferences$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CommerceBrowserAutofillPreferences.class), "type.googleapis.com/squareup.cash.commercebrowser.CommerceBrowserAutofillPreferences", Syntax.PROTO_2, null, "squareup/cash/commercebrowser/CustomerPreferences.proto");
        ADAPTER = commerceBrowserAutofillPreferences$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(commerceBrowserAutofillPreferences$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommerceBrowserAutofillPreferences(Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.opt_out = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CommerceBrowserAutofillPreferences)) {
            return false;
        }
        CommerceBrowserAutofillPreferences commerceBrowserAutofillPreferences = (CommerceBrowserAutofillPreferences) obj;
        return Intrinsics.areEqual(unknownFields(), commerceBrowserAutofillPreferences.unknownFields()) && Intrinsics.areEqual(this.opt_out, commerceBrowserAutofillPreferences.opt_out);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.opt_out;
        int hashCode2 = hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        UiAppLock.Builder builder = new UiAppLock.Builder(6);
        builder.activated = this.opt_out;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.opt_out;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("opt_out=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CommerceBrowserAutofillPreferences{", "}", 0, null, null, 56);
    }

    public /* synthetic */ CommerceBrowserAutofillPreferences(Boolean bool) {
        this(bool, ByteString.EMPTY);
    }
}
