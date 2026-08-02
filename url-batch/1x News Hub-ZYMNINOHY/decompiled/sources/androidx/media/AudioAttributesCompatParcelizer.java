package androidx.media;

import Z.a;
import Z.c;

/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        c cVar = audioAttributesCompat.f2414a;
        if (aVar.e(1)) {
            cVar = aVar.h();
        }
        audioAttributesCompat.f2414a = (AudioAttributesImpl) cVar;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) {
        aVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f2414a;
        aVar.i(1);
        aVar.k(audioAttributesImpl);
    }
}
