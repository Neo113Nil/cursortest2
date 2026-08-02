package xyz.block.protos.genie;

import com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier;
import com.datadog.android.rum.metric.networksettled.NetworkSettledResourceContext;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import xyz.block.protos.genie.EasingCurve;

/* loaded from: classes10.dex */
public final class CreateSessionRequest extends Message {
    public static final ProtoAdapter ADAPTER = new CreateSessionRequest$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CreateSessionRequest.class), "type.googleapis.com/xyz.block.genie.v1.CreateSessionRequest", Syntax.PROTO_2, null, "xyz/block/genie/v1/service.proto");
    public final String app_identifier;
    public final String app_slug;
    public final String app_version;
    public final Platform platform;
    public final String proto_bundle_hash;

    public enum Platform implements WireEnum {
        PLATFORM_UNSPECIFIED(0),
        PLATFORM_ANDROID(1),
        PLATFORM_IOS(2),
        PLATFORM_WEB(3);

        public static final CreateSessionRequest$Platform$Companion$ADAPTER$1 ADAPTER;
        public static final Companion Companion;
        public final int value;

        /* loaded from: classes4.dex */
        public final class Companion implements InitialResourceIdentifier {
            @Override // com.datadog.android.rum.metric.networksettled.InitialResourceIdentifier
            public boolean validate(NetworkSettledResourceContext networkSettledResourceContext) {
                return false;
            }
        }

        static {
            Platform platform = PLATFORM_UNSPECIFIED;
            Companion = new Companion();
            ADAPTER = new CreateSessionRequest$Platform$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Platform.class), Syntax.PROTO_2, platform);
        }

        Platform(int i) {
            this.value = i;
        }

        public static final Platform fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return PLATFORM_UNSPECIFIED;
            }
            if (i == 1) {
                return PLATFORM_ANDROID;
            }
            if (i == 2) {
                return PLATFORM_IOS;
            }
            if (i != 3) {
                return null;
            }
            return PLATFORM_WEB;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateSessionRequest(String str, Platform platform, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.app_slug = str;
        this.platform = platform;
        this.app_identifier = str2;
        this.app_version = str3;
        this.proto_bundle_hash = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateSessionRequest)) {
            return false;
        }
        CreateSessionRequest createSessionRequest = (CreateSessionRequest) obj;
        return Intrinsics.areEqual(unknownFields(), createSessionRequest.unknownFields()) && Intrinsics.areEqual(this.app_slug, createSessionRequest.app_slug) && this.platform == createSessionRequest.platform && Intrinsics.areEqual(this.app_identifier, createSessionRequest.app_identifier) && Intrinsics.areEqual(this.app_version, createSessionRequest.app_version) && Intrinsics.areEqual(this.proto_bundle_hash, createSessionRequest.proto_bundle_hash);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.app_slug;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Platform platform = this.platform;
        int hashCode3 = (hashCode2 + (platform != null ? platform.hashCode() : 0)) * 37;
        String str2 = this.app_identifier;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.app_version;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.proto_bundle_hash;
        int hashCode6 = hashCode5 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = hashCode6;
        return hashCode6;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        EasingCurve.Builder builder = new EasingCurve.Builder(1);
        builder.linear = this.app_slug;
        builder.ease_in = this.platform;
        builder.ease_out = this.app_identifier;
        builder.ease_in_out = this.app_version;
        builder.cubic_bezier = this.proto_bundle_hash;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.app_slug;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "app_slug=", arrayList);
        }
        Platform platform = this.platform;
        if (platform != null) {
            arrayList.add("platform=" + platform);
        }
        String str2 = this.app_identifier;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "app_identifier=", arrayList);
        }
        String str3 = this.app_version;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "app_version=", arrayList);
        }
        String str4 = this.proto_bundle_hash;
        if (str4 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str4, "proto_bundle_hash=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateSessionRequest{", "}", 0, null, null, 56);
    }
}
