package androidx.webkit;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Objects;

/* loaded from: classes12.dex */
public final class UserAgentMetadata {
    private final String mArchitecture;
    private int mBitness;
    private final List mBrandVersionList;
    private final String mFullVersion;
    private boolean mMobile;
    private final String mModel;
    private final String mPlatform;
    private final String mPlatformVersion;
    private boolean mWow64;

    public static final class Builder {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAgentMetadata)) {
            return false;
        }
        UserAgentMetadata userAgentMetadata = (UserAgentMetadata) obj;
        return this.mMobile == userAgentMetadata.mMobile && this.mBitness == userAgentMetadata.mBitness && this.mWow64 == userAgentMetadata.mWow64 && Objects.equals(this.mBrandVersionList, userAgentMetadata.mBrandVersionList) && Objects.equals(this.mFullVersion, userAgentMetadata.mFullVersion) && Objects.equals(this.mPlatform, userAgentMetadata.mPlatform) && Objects.equals(this.mPlatformVersion, userAgentMetadata.mPlatformVersion) && Objects.equals(this.mArchitecture, userAgentMetadata.mArchitecture) && Objects.equals(this.mModel, userAgentMetadata.mModel);
    }

    public int hashCode() {
        return Objects.hash(this.mBrandVersionList, this.mFullVersion, this.mPlatform, this.mPlatformVersion, this.mArchitecture, this.mModel, Boolean.valueOf(this.mMobile), Integer.valueOf(this.mBitness), Boolean.valueOf(this.mWow64));
    }

    public static final class BrandVersion {
        private final String mBrand;
        private final String mFullVersion;
        private final String mMajorVersion;

        public static final class Builder {
        }

        public String toString() {
            return this.mBrand + StringUtils.COMMA + this.mMajorVersion + StringUtils.COMMA + this.mFullVersion;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BrandVersion)) {
                return false;
            }
            BrandVersion brandVersion = (BrandVersion) obj;
            return Objects.equals(this.mBrand, brandVersion.mBrand) && Objects.equals(this.mMajorVersion, brandVersion.mMajorVersion) && Objects.equals(this.mFullVersion, brandVersion.mFullVersion);
        }

        public int hashCode() {
            return Objects.hash(this.mBrand, this.mMajorVersion, this.mFullVersion);
        }
    }
}
