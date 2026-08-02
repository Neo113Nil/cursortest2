package androidx.media;

import defpackage.aqs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(aqs aqsVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.a = (AudioAttributesImpl) aqsVar.t(audioAttributesCompat.a);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, aqs aqsVar) {
        aqsVar.u(audioAttributesCompat.a);
    }
}
