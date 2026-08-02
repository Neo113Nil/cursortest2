package com.squareup.protos.wire.roster.mds;

import android.os.Parcelable;
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

/* loaded from: classes8.dex */
public final class Name extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<Name> CREATOR;
    public final ScriptScope$Script script;
    public final String value;

    static {
        Name$Companion$ADAPTER$1 name$Companion$ADAPTER$1 = new Name$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Name.class), "type.googleapis.com/squareup.roster.mds.Name", Syntax.PROTO_2, null, "squareup/roster/mds.proto");
        ADAPTER = name$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(name$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Name(ScriptScope$Script scriptScope$Script, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.script = scriptScope$Script;
        this.value = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Name)) {
            return false;
        }
        Name name = (Name) obj;
        return Intrinsics.areEqual(unknownFields(), name.unknownFields()) && this.script == name.script && Intrinsics.areEqual(this.value, name.value);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ScriptScope$Script scriptScope$Script = this.script;
        int hashCode2 = (hashCode + (scriptScope$Script != null ? scriptScope$Script.hashCode() : 0)) * 37;
        String str = this.value;
        int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsConfig.Builder builder = new BillsConfig.Builder(3);
        builder.bills_applet_default_action = this.script;
        builder.half_applet_content = this.value;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ScriptScope$Script scriptScope$Script = this.script;
        if (scriptScope$Script != null) {
            arrayList.add("script=" + scriptScope$Script);
        }
        if (this.value != null) {
            arrayList.add("value=██");
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Name{", "}", 0, null, null, 56);
    }
}
