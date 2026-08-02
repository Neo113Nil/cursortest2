package com.squareup.protos.franklin.common;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.pools.PoolOwner;
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
import xyz.block.protos.genie.Collection;

/* loaded from: classes8.dex */
public final class TreehouseConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TreehouseConfig> CREATOR;
    public final List apps;

    public final class TreehouseApp extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<TreehouseApp> CREATOR;
        public final String app_name;
        public final String manifestURL;
        public final String minimal_commit_timestamp;
        public final String path;

        static {
            TreehouseConfig$TreehouseApp$Companion$ADAPTER$1 treehouseConfig$TreehouseApp$Companion$ADAPTER$1 = new TreehouseConfig$TreehouseApp$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TreehouseApp.class), "type.googleapis.com/squareup.franklin.common.TreehouseConfig.TreehouseApp", Syntax.PROTO_2, null, "squareup/franklin/common/treehouse_config.proto");
            ADAPTER = treehouseConfig$TreehouseApp$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(treehouseConfig$TreehouseApp$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TreehouseApp(String str, String str2, String str3, String str4, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.app_name = str;
            this.path = str2;
            this.manifestURL = str3;
            this.minimal_commit_timestamp = str4;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TreehouseApp)) {
                return false;
            }
            TreehouseApp treehouseApp = (TreehouseApp) obj;
            return Intrinsics.areEqual(unknownFields(), treehouseApp.unknownFields()) && Intrinsics.areEqual(this.app_name, treehouseApp.app_name) && Intrinsics.areEqual(this.path, treehouseApp.path) && Intrinsics.areEqual(this.manifestURL, treehouseApp.manifestURL) && Intrinsics.areEqual(this.minimal_commit_timestamp, treehouseApp.minimal_commit_timestamp);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.app_name;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.path;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.manifestURL;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
            String str4 = this.minimal_commit_timestamp;
            int hashCode5 = hashCode4 + (str4 != null ? str4.hashCode() : 0);
            this.hashCode = hashCode5;
            return hashCode5;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            PoolOwner.Builder builder = new PoolOwner.Builder(19);
            builder.customer_token = this.app_name;
            builder.full_name = this.path;
            builder.profile_photo_url = this.manifestURL;
            builder.cashtag = this.minimal_commit_timestamp;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.app_name;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "app_name=", arrayList);
            }
            String str2 = this.path;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "path=", arrayList);
            }
            String str3 = this.manifestURL;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "manifestURL=", arrayList);
            }
            String str4 = this.minimal_commit_timestamp;
            if (str4 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "minimal_commit_timestamp=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "TreehouseApp{", "}", 0, null, null, 56);
        }
    }

    static {
        TreehouseConfig$Companion$ADAPTER$1 treehouseConfig$Companion$ADAPTER$1 = new TreehouseConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TreehouseConfig.class), "type.googleapis.com/squareup.franklin.common.TreehouseConfig", Syntax.PROTO_2, null, "squareup/franklin/common/treehouse_config.proto");
        ADAPTER = treehouseConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(treehouseConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TreehouseConfig(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.apps = TransactorKt.immutableCopyOf("apps", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TreehouseConfig)) {
            return false;
        }
        TreehouseConfig treehouseConfig = (TreehouseConfig) obj;
        return Intrinsics.areEqual(unknownFields(), treehouseConfig.unknownFields()) && Intrinsics.areEqual(this.apps, treehouseConfig.apps);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.apps.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Collection.Builder builder = new Collection.Builder(2, false);
        builder.items = this.apps;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.apps;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("apps=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TreehouseConfig{", "}", 0, null, null, 56);
    }
}
