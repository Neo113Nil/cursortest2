package androidx.media;

import android.media.AudioAttributes;
import defpackage.aqs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(aqs aqsVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) aqsVar.b(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = aqsVar.a(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, aqs aqsVar) {
        aqsVar.i(audioAttributesImplApi21.a, 1);
        aqsVar.h(audioAttributesImplApi21.b, 2);
    }
}
