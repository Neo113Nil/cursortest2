package androidx.media;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(androidx.versionedparcelable.a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f952a = aVar.v(audioAttributesImplBase.f952a, 1);
        audioAttributesImplBase.f953b = aVar.v(audioAttributesImplBase.f953b, 2);
        audioAttributesImplBase.f954c = aVar.v(audioAttributesImplBase.f954c, 3);
        audioAttributesImplBase.f955d = aVar.v(audioAttributesImplBase.f955d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, androidx.versionedparcelable.a aVar) {
        aVar.K(false, false);
        aVar.Y(audioAttributesImplBase.f952a, 1);
        aVar.Y(audioAttributesImplBase.f953b, 2);
        aVar.Y(audioAttributesImplBase.f954c, 3);
        aVar.Y(audioAttributesImplBase.f955d, 4);
    }
}
