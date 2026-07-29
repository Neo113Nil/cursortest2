package com.mopub.nativeads;

import android.location.Location;
import android.text.TextUtils;
import com.mopub.common.MoPub;
import com.tapjoy.TJAdUnitConstants;
import java.util.EnumSet;

/* loaded from: classes2.dex */
public class RequestParameters {
    private final EnumSet<NativeAdAsset> mDesiredAssets;
    private final String mKeywords;
    private final Location mLocation;
    private final String mUserDataKeywords;

    public enum NativeAdAsset {
        TITLE(TJAdUnitConstants.String.TITLE),
        TEXT("text"),
        ICON_IMAGE("iconimage"),
        MAIN_IMAGE("mainimage"),
        CALL_TO_ACTION_TEXT("ctatext"),
        STAR_RATING("starrating");

        private final String mAssetName;

        NativeAdAsset(String str) {
            this.mAssetName = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mAssetName;
        }
    }

    public static final class Builder {
        private EnumSet<NativeAdAsset> desiredAssets;
        private String keywords;
        private Location location;
        private String userDatakeywords;

        public final Builder keywords(String str) {
            this.keywords = str;
            return this;
        }

        public final Builder userDataKeywords(String str) {
            if (!MoPub.canCollectPersonalInformation()) {
                str = null;
            }
            this.userDatakeywords = str;
            return this;
        }

        public final Builder location(Location location) {
            if (!MoPub.canCollectPersonalInformation()) {
                location = null;
            }
            this.location = location;
            return this;
        }

        public final Builder desiredAssets(EnumSet<NativeAdAsset> enumSet) {
            this.desiredAssets = EnumSet.copyOf((EnumSet) enumSet);
            return this;
        }

        public final RequestParameters build() {
            return new RequestParameters(this);
        }
    }

    private RequestParameters(Builder builder) {
        this.mKeywords = builder.keywords;
        this.mDesiredAssets = builder.desiredAssets;
        boolean canCollectPersonalInformation = MoPub.canCollectPersonalInformation();
        this.mUserDataKeywords = canCollectPersonalInformation ? builder.userDatakeywords : null;
        this.mLocation = canCollectPersonalInformation ? builder.location : null;
    }

    public final String getKeywords() {
        return this.mKeywords;
    }

    public final String getUserDataKeywords() {
        if (MoPub.canCollectPersonalInformation()) {
            return this.mUserDataKeywords;
        }
        return null;
    }

    public final Location getLocation() {
        return this.mLocation;
    }

    public final String getDesiredAssets() {
        return this.mDesiredAssets != null ? TextUtils.join(",", this.mDesiredAssets.toArray()) : "";
    }
}
