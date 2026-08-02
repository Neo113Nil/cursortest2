package com.squareup.protos.cash.treelot.app;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.SupportConfig;
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

/* loaded from: classes8.dex */
public final class TreehouseApp extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TreehouseApp> CREATOR;
    public final String app_name;
    public final String manifest_url;
    public final String minimal_commit_timestamp;

    static {
        TreehouseApp$Companion$ADAPTER$1 treehouseApp$Companion$ADAPTER$1 = new TreehouseApp$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TreehouseApp.class), "type.googleapis.com/squareup.cash.treelot.TreehouseApp", Syntax.PROTO_2, null, "squareup/cash/treelot/app/TreehouseApp.proto");
        ADAPTER = treehouseApp$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(treehouseApp$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TreehouseApp(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.app_name = str;
        this.manifest_url = str2;
        this.minimal_commit_timestamp = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TreehouseApp)) {
            return false;
        }
        TreehouseApp treehouseApp = (TreehouseApp) obj;
        return Intrinsics.areEqual(unknownFields(), treehouseApp.unknownFields()) && Intrinsics.areEqual(this.app_name, treehouseApp.app_name) && Intrinsics.areEqual(this.manifest_url, treehouseApp.manifest_url) && Intrinsics.areEqual(this.minimal_commit_timestamp, treehouseApp.minimal_commit_timestamp);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.app_name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.manifest_url;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.minimal_commit_timestamp;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SupportConfig.Builder builder = new SupportConfig.Builder(29);
        builder.contact_support_url = this.app_name;
        builder.privacy_policy_url = this.manifest_url;
        builder.terms_of_service_url = this.minimal_commit_timestamp;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.app_name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "app_name=", arrayList);
        }
        String str2 = this.manifest_url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "manifest_url=", arrayList);
        }
        String str3 = this.minimal_commit_timestamp;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "minimal_commit_timestamp=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TreehouseApp{", "}", 0, null, null, 56);
    }
}
