package androidx.media;

import androidx.versionedparcelable.a;

/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f12755a = aVar.p(audioAttributesImplBase.f12755a, 1);
        audioAttributesImplBase.f12756b = aVar.p(audioAttributesImplBase.f12756b, 2);
        audioAttributesImplBase.f12757c = aVar.p(audioAttributesImplBase.f12757c, 3);
        audioAttributesImplBase.f12758d = aVar.p(audioAttributesImplBase.f12758d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.x(false, false);
        aVar.F(audioAttributesImplBase.f12755a, 1);
        aVar.F(audioAttributesImplBase.f12756b, 2);
        aVar.F(audioAttributesImplBase.f12757c, 3);
        aVar.F(audioAttributesImplBase.f12758d, 4);
    }
}
