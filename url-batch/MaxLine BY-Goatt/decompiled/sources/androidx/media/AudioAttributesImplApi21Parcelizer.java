package androidx.media;

import android.media.AudioAttributes;
import defpackage.n43;
import defpackage.o43;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(n43 n43Var) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) n43Var.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = n43Var.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, n43 n43Var) {
        n43Var.getClass();
        AudioAttributes audioAttributes = audioAttributesImplApi21.a;
        n43Var.i(1);
        ((o43) n43Var).e.writeParcelable(audioAttributes, 0);
        n43Var.j(audioAttributesImplApi21.b, 2);
    }
}
