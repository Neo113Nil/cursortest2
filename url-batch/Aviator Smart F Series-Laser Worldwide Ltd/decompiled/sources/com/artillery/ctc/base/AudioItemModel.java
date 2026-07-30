package com.artillery.ctc.base;

import androidx.annotation.Keep;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class AudioItemModel {
    private final String audioItemId;
    private final StreamModel stream;

    public AudioItemModel(String audioItemId, StreamModel stream) {
        s.checkNotNullParameter(audioItemId, "audioItemId");
        s.checkNotNullParameter(stream, "stream");
        this.audioItemId = audioItemId;
        this.stream = stream;
    }

    public static /* synthetic */ AudioItemModel copy$default(AudioItemModel audioItemModel, String str, StreamModel streamModel, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = audioItemModel.audioItemId;
        }
        if ((i8 & 2) != 0) {
            streamModel = audioItemModel.stream;
        }
        return audioItemModel.copy(str, streamModel);
    }

    public final String component1() {
        return this.audioItemId;
    }

    public final StreamModel component2() {
        return this.stream;
    }

    public final AudioItemModel copy(String audioItemId, StreamModel stream) {
        s.checkNotNullParameter(audioItemId, "audioItemId");
        s.checkNotNullParameter(stream, "stream");
        return new AudioItemModel(audioItemId, stream);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioItemModel)) {
            return false;
        }
        AudioItemModel audioItemModel = (AudioItemModel) obj;
        return s.areEqual(this.audioItemId, audioItemModel.audioItemId) && s.areEqual(this.stream, audioItemModel.stream);
    }

    public final String getAudioItemId() {
        return this.audioItemId;
    }

    public final StreamModel getStream() {
        return this.stream;
    }

    public int hashCode() {
        return (this.audioItemId.hashCode() * 31) + this.stream.hashCode();
    }

    public String toString() {
        return "AudioItemModel(audioItemId=" + this.audioItemId + ", stream=" + this.stream + ')';
    }
}
