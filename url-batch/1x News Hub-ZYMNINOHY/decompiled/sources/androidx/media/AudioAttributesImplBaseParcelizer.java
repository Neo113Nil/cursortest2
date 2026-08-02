package androidx.media;

import Z.a;

/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f2417a = aVar.f(audioAttributesImplBase.f2417a, 1);
        audioAttributesImplBase.f2418b = aVar.f(audioAttributesImplBase.f2418b, 2);
        audioAttributesImplBase.f2419c = aVar.f(audioAttributesImplBase.f2419c, 3);
        audioAttributesImplBase.f2420d = aVar.f(audioAttributesImplBase.f2420d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.getClass();
        aVar.j(audioAttributesImplBase.f2417a, 1);
        aVar.j(audioAttributesImplBase.f2418b, 2);
        aVar.j(audioAttributesImplBase.f2419c, 3);
        aVar.j(audioAttributesImplBase.f2420d, 4);
    }
}
