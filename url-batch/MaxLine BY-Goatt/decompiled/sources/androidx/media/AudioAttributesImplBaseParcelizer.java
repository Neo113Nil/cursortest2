package androidx.media;

import defpackage.n43;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(n43 n43Var) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = n43Var.f(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = n43Var.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = n43Var.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = n43Var.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, n43 n43Var) {
        n43Var.getClass();
        n43Var.j(audioAttributesImplBase.a, 1);
        n43Var.j(audioAttributesImplBase.b, 2);
        n43Var.j(audioAttributesImplBase.c, 3);
        n43Var.j(audioAttributesImplBase.d, 4);
    }
}
