package androidx.media;

import Z.a;
import Z.b;
import android.media.AudioAttributes;

/* loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f2415a = (AudioAttributes) aVar.g(audioAttributesImplApi21.f2415a, 1);
        audioAttributesImplApi21.f2416b = aVar.f(audioAttributesImplApi21.f2416b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        aVar.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.f2415a;
        aVar.i(1);
        ((b) aVar).f1909e.writeParcelable(audioAttributes, 0);
        aVar.j(audioAttributesImplApi21.f2416b, 2);
    }
}
