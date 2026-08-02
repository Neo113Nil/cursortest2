package com.withpersona.sdk2.inquiry.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.withpersona.sdk2.inquiry.network.dto.government_id.Id;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.LocalImage;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.UiComponentConfig;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule;", "", "<init>", "()V", "Companion", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NetworkInquiryModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static final Set<JsonAdapter.Factory> provideMoshiJsonAdapterFactory() {
        return INSTANCE.provideMoshiJsonAdapterFactory();
    }

    public static final String userAgent() {
        return INSTANCE.userAgent();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u00070\u0005H\u0007J\r\u0010\b\u001a\u00070\t¢\u0006\u0002\b\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/dto/NetworkInquiryModule$Companion;", "", "<init>", "()V", "provideMoshiJsonAdapterFactory", "", "Lcom/squareup/moshi/JsonAdapter$Factory;", "Lcom/withpersona/sdk2/inquiry/network/core/MoshiJsonAdapter;", "userAgent", "", "Lcom/withpersona/sdk2/inquiry/network/core/HttpHeader;", "network-inquiry_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<JsonAdapter.Factory> provideMoshiJsonAdapterFactory() {
            return ArraysKt___ArraysKt.toSet(new JsonAdapter.Factory[]{NextStep.INSTANCE.createAdapter(), UiComponentConfig.INSTANCE.createAdapter(), LocalImage.INSTANCE.createAdapter(), Id.INSTANCE.createAdapter(), Included.INSTANCE.createAdapter()});
        }

        public final String userAgent() {
            return "Persona/1.0 (Android) Inquiry/2.43.0";
        }

        private Companion() {
        }
    }
}
