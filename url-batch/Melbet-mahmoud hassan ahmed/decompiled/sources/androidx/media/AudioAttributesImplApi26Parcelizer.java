package androidx.media;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(androidx.versionedparcelable.a aVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f949a = (AudioAttributes) aVar.A(audioAttributesImplApi26.f949a, 1);
        audioAttributesImplApi26.f950b = aVar.v(audioAttributesImplApi26.f950b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, androidx.versionedparcelable.a aVar) {
        aVar.K(false, false);
        aVar.d0(audioAttributesImplApi26.f949a, 1);
        aVar.Y(audioAttributesImplApi26.f950b, 2);
    }
}
