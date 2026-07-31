package androidx.media;

import androidx.annotation.RestrictTo;
import androidx.media.AudioAttributesImpl;
import java.util.Arrays;

@RestrictTo
/* loaded from: classes5.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {
    public int mContentType;
    public int mFlags;
    public int mLegacyStream;
    public int mUsage;

    @RestrictTo
    public AudioAttributesImplBase() {
        this.mUsage = 0;
        this.mContentType = 0;
        this.mFlags = 0;
        this.mLegacyStream = -1;
    }

    AudioAttributesImplBase(int i, int i2, int i3, int i4) {
        this.mContentType = i;
        this.mFlags = i2;
        this.mUsage = i3;
        this.mLegacyStream = i4;
    }

    public int getLegacyStreamType() {
        int i = this.mLegacyStream;
        return i != -1 ? i : AudioAttributesCompat.toVolumeStreamType(false, this.mFlags, this.mUsage);
    }

    public int getContentType() {
        return this.mContentType;
    }

    public int getUsage() {
        return this.mUsage;
    }

    public int getFlags() {
        int i = this.mFlags;
        int legacyStreamType = getLegacyStreamType();
        if (legacyStreamType == 6) {
            i |= 4;
        } else if (legacyStreamType == 7) {
            i |= 1;
        }
        return i & 273;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.mContentType), Integer.valueOf(this.mFlags), Integer.valueOf(this.mUsage), Integer.valueOf(this.mLegacyStream)});
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.mContentType == audioAttributesImplBase.getContentType() && this.mFlags == audioAttributesImplBase.getFlags() && this.mUsage == audioAttributesImplBase.getUsage() && this.mLegacyStream == audioAttributesImplBase.mLegacyStream;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.mLegacyStream != -1) {
            sb.append(" stream=");
            sb.append(this.mLegacyStream);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.usageToString(this.mUsage));
        sb.append(" content=");
        sb.append(this.mContentType);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.mFlags).toUpperCase());
        return sb.toString();
    }

    static class Builder implements AudioAttributesImpl.Builder {
        private int mUsage = 0;
        private int mContentType = 0;
        private int mFlags = 0;
        private int mLegacyStream = -1;

        Builder() {
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        public AudioAttributesImpl build() {
            return new AudioAttributesImplBase(this.mContentType, this.mFlags, this.mUsage, this.mLegacyStream);
        }

        @Override // androidx.media.AudioAttributesImpl.Builder
        public Builder setUsage(int i) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    this.mUsage = i;
                    return this;
                case 16:
                    this.mUsage = 12;
                    return this;
                default:
                    this.mUsage = 0;
                    return this;
            }
        }
    }
}
