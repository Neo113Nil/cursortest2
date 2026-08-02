package androidx.media;

import android.media.AudioAttributes;
import defpackage.aqs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(aqs aqsVar) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) aqsVar.b(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = aqsVar.a(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, aqs aqsVar) {
        aqsVar.i(audioAttributesImplApi26.a, 1);
        aqsVar.h(audioAttributesImplApi26.b, 2);
    }
}
