package com.squareup.protos.cash.local.client.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.ToggleScreen;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
import com.squareup.protos.cash.papermate.enums.FeeType;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes7.dex */
public final class MapboxConfiguration extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<MapboxConfiguration> CREATOR;
    public final String access_token;
    public final List usage_options;

    public final class UsageOptions extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<UsageOptions> CREATOR;
        public final Context context;
        public final String style_uri_dark;
        public final String style_uri_light;

        public enum Context implements WireEnum {
            CONTEXT_UNSPECIFIED(0),
            CONTEXT_NEIGHBORHOODS_TAB(1);

            public static final MapboxConfiguration$UsageOptions$Context$Companion$ADAPTER$1 ADAPTER;
            public static final FeeType.Companion Companion;
            public final int value;

            static {
                Context context = CONTEXT_UNSPECIFIED;
                Companion = new FeeType.Companion();
                ADAPTER = new MapboxConfiguration$UsageOptions$Context$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Context.class), Syntax.PROTO_2, context);
            }

            Context(int i) {
                this.value = i;
            }

            public static final Context fromValue(int i) {
                Companion.getClass();
                if (i == 0) {
                    return CONTEXT_UNSPECIFIED;
                }
                if (i != 1) {
                    return null;
                }
                return CONTEXT_NEIGHBORHOODS_TAB;
            }

            @Override // com.squareup.wire.WireEnum
            public final int getValue() {
                return this.value;
            }
        }

        static {
            MapboxConfiguration$UsageOptions$Companion$ADAPTER$1 mapboxConfiguration$UsageOptions$Companion$ADAPTER$1 = new MapboxConfiguration$UsageOptions$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(UsageOptions.class), "type.googleapis.com/squareup.cash.local.client.v1.MapboxConfiguration.UsageOptions", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_common.proto");
            ADAPTER = mapboxConfiguration$UsageOptions$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(mapboxConfiguration$UsageOptions$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UsageOptions(Context context, String str, String str2, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.context = context;
            this.style_uri_light = str;
            this.style_uri_dark = str2;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UsageOptions)) {
                return false;
            }
            UsageOptions usageOptions = (UsageOptions) obj;
            return Intrinsics.areEqual(unknownFields(), usageOptions.unknownFields()) && this.context == usageOptions.context && Intrinsics.areEqual(this.style_uri_light, usageOptions.style_uri_light) && Intrinsics.areEqual(this.style_uri_dark, usageOptions.style_uri_dark);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Context context = this.context;
            int hashCode2 = (hashCode + (context != null ? context.hashCode() : 0)) * 37;
            String str = this.style_uri_light;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.style_uri_dark;
            int hashCode4 = hashCode3 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            BLEPayload.Builder builder = new BLEPayload.Builder(3, false);
            builder.advertisement_data = this.context;
            builder.transmission_level = this.style_uri_light;
            builder.frequency = this.style_uri_dark;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Context context = this.context;
            if (context != null) {
                arrayList.add("context=" + context);
            }
            String str = this.style_uri_light;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "style_uri_light=", arrayList);
            }
            String str2 = this.style_uri_dark;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "style_uri_dark=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "UsageOptions{", "}", 0, null, null, 56);
        }
    }

    static {
        MapboxConfiguration$Companion$ADAPTER$1 mapboxConfiguration$Companion$ADAPTER$1 = new MapboxConfiguration$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(MapboxConfiguration.class), "type.googleapis.com/squareup.cash.local.client.v1.MapboxConfiguration", Syntax.PROTO_2, null, "squareup/cash/local/client/v1/local_common.proto");
        ADAPTER = mapboxConfiguration$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(mapboxConfiguration$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapboxConfiguration(String str, List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.access_token = str;
        this.usage_options = TransactorKt.immutableCopyOf("usage_options", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MapboxConfiguration)) {
            return false;
        }
        MapboxConfiguration mapboxConfiguration = (MapboxConfiguration) obj;
        return Intrinsics.areEqual(unknownFields(), mapboxConfiguration.unknownFields()) && Intrinsics.areEqual(this.access_token, mapboxConfiguration.access_token) && Intrinsics.areEqual(this.usage_options, mapboxConfiguration.usage_options);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.access_token;
        int hashCode2 = this.usage_options.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 37);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ToggleScreen.Builder builder = new ToggleScreen.Builder(24, false);
        builder.toggle_title = this.access_token;
        builder.sections = this.usage_options;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.access_token != null) {
            arrayList.add("access_token=██");
        }
        List list = this.usage_options;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("usage_options=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "MapboxConfiguration{", "}", 0, null, null, 56);
    }
}
