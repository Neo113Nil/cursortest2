package com.withpersona.sdk2.camera;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes8.dex */
public final class AudioConfiguration {
    public final int bufferSizeInBytes;
    public final int sampleRateInHz;

    public AudioConfiguration(int i, int i2) {
        this.sampleRateInHz = i;
        this.bufferSizeInBytes = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioConfiguration)) {
            return false;
        }
        AudioConfiguration audioConfiguration = (AudioConfiguration) obj;
        return this.sampleRateInHz == audioConfiguration.sampleRateInHz && this.bufferSizeInBytes == audioConfiguration.bufferSizeInBytes;
    }

    public final int hashCode() {
        return Integer.hashCode(this.bufferSizeInBytes) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(2, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(16, Integer.hashCode(this.sampleRateInHz) * 31, 31), 31);
    }

    public final String toString() {
        return Recorder$$ExternalSyntheticOutline2.m(this.sampleRateInHz, this.bufferSizeInBytes, "AudioConfiguration(sampleRateInHz=", ", channelConfig=16, audioFormat=2, bufferSizeInBytes=", ")");
    }
}
