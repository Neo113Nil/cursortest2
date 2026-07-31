package androidx.media;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(androidx.versionedparcelable.a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f949a = (AudioAttributes) aVar.A(audioAttributesImplApi21.f949a, 1);
        audioAttributesImplApi21.f950b = aVar.v(audioAttributesImplApi21.f950b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, androidx.versionedparcelable.a aVar) {
        aVar.K(false, false);
        aVar.d0(audioAttributesImplApi21.f949a, 1);
        aVar.Y(audioAttributesImplApi21.f950b, 2);
    }
}
