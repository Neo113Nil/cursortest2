package androidx.media;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(androidx.versionedparcelable.a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f947a = (AudioAttributesImpl) aVar.I(audioAttributesCompat.f947a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, androidx.versionedparcelable.a aVar) {
        aVar.K(false, false);
        aVar.m0(audioAttributesCompat.f947a, 1);
    }
}
