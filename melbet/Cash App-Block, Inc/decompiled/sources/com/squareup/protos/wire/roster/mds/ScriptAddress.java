package com.squareup.protos.wire.roster.mds;

import android.os.Parcelable;
import com.squareup.protos.common.location.GlobalAddress;
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
public final class ScriptAddress extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ScriptAddress> CREATOR;
    public final GlobalAddress address;
    public final ScriptScope$Script script;

    static {
        ScriptAddress$Companion$ADAPTER$1 scriptAddress$Companion$ADAPTER$1 = new ScriptAddress$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ScriptAddress.class), "type.googleapis.com/squareup.roster.mds.ScriptAddress", Syntax.PROTO_2, null, "squareup/roster/mds.proto");
        ADAPTER = scriptAddress$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(scriptAddress$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScriptAddress(GlobalAddress globalAddress, ScriptScope$Script scriptScope$Script, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.address = globalAddress;
        this.script = scriptScope$Script;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScriptAddress)) {
            return false;
        }
        ScriptAddress scriptAddress = (ScriptAddress) obj;
        return Intrinsics.areEqual(unknownFields(), scriptAddress.unknownFields()) && Intrinsics.areEqual(this.address, scriptAddress.address) && this.script == scriptAddress.script;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        GlobalAddress globalAddress = this.address;
        int hashCode2 = (hashCode + (globalAddress != null ? globalAddress.hashCode() : 0)) * 37;
        ScriptScope$Script scriptScope$Script = this.script;
        int hashCode3 = hashCode2 + (scriptScope$Script != null ? scriptScope$Script.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        BillsConfig.Builder builder = new BillsConfig.Builder(5);
        builder.bills_applet_default_action = this.address;
        builder.half_applet_content = this.script;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        GlobalAddress globalAddress = this.address;
        if (globalAddress != null) {
            arrayList.add("address=" + globalAddress);
        }
        ScriptScope$Script scriptScope$Script = this.script;
        if (scriptScope$Script != null) {
            arrayList.add("script=" + scriptScope$Script);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScriptAddress{", "}", 0, null, null, 56);
    }
}
