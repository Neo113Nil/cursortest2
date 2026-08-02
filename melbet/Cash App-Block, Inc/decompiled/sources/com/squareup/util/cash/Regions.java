package com.squareup.util.cash;

import com.datadog.android.rum.model.ViewEvent;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.clientsync.models.SyncEntity;
import com.squareup.cash.clientsync.pipeline.EntityVersionDifference;
import com.squareup.cash.util.country.SupportedCountryConfig;
import com.squareup.cash.util.country.UtilKt;
import com.squareup.protos.common.countries.Country;
import com.squareup.protos.franklin.api.Region;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes6.dex */
public abstract class Regions {

    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Region.values().length];
            try {
                iArr[Region.GBR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Region.USA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static ViewEvent.LongTask fromJsonObject(JsonObject jsonObject) {
        try {
            return new ViewEvent.LongTask(jsonObject.get("count").getAsLong());
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type LongTask", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type LongTask", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type LongTask", e3);
            return null;
        }
    }

    public static final EntityVersionDifference getEntityVersionDifference(SyncEntity syncEntity, SyncEntity syncEntity2) {
        syncEntity2.getClass();
        Long l = syncEntity != null ? syncEntity.entityVersion : null;
        Long l2 = syncEntity2.entityVersion;
        return (l == null || l2 == null || l.longValue() < l2.longValue()) ? EntityVersionDifference.Upgrade : l.equals(l2) ? EntityVersionDifference.Equal : EntityVersionDifference.Downgrade;
    }

    public static final Country toCountry(Region region) {
        region.getClass();
        SupportedCountryConfig supportedCountryConfig = (SupportedCountryConfig) UtilKt.SUPPORTED_REGION_MAP.get(region);
        Country country = supportedCountryConfig != null ? supportedCountryConfig.country : null;
        if (country != null) {
            return country;
        }
        Path$$ExternalSyntheticBUOutline0.m$3(region, "Unexpected Region ");
        return null;
    }
}
