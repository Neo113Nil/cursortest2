package androidx.media;

import defpackage.n43;
import defpackage.p43;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(n43 n43Var) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        p43 p43Var = audioAttributesCompat.a;
        if (n43Var.e(1)) {
            p43Var = n43Var.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) p43Var;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, n43 n43Var) {
        n43Var.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        n43Var.i(1);
        n43Var.k(audioAttributesImpl);
    }
}
