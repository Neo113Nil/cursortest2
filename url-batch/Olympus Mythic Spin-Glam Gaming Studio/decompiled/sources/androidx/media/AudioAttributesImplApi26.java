package androidx.media;

import android.media.AudioAttributes;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.media.AudioAttributesImplApi21;

@RequiresApi
@RestrictTo
/* loaded from: classes3.dex */
public class AudioAttributesImplApi26 extends AudioAttributesImplApi21 {
    @RestrictTo
    public AudioAttributesImplApi26() {
    }

    AudioAttributesImplApi26(AudioAttributes audioAttributes) {
        super(audioAttributes, -1);
    }

    @RequiresApi
    static class Builder extends AudioAttributesImplApi21.Builder {
        Builder() {
        }

        @Override // androidx.media.AudioAttributesImplApi21.Builder, androidx.media.AudioAttributesImpl.Builder
        public AudioAttributesImpl build() {
            return new AudioAttributesImplApi26(this.mFwkBuilder.build());
        }

        @Override // androidx.media.AudioAttributesImplApi21.Builder, androidx.media.AudioAttributesImpl.Builder
        public Builder setUsage(int i) {
            this.mFwkBuilder.setUsage(i);
            return this;
        }
    }
}
