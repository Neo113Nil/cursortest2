package androidx.media;

import defpackage.aqs;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(aqs aqsVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = aqsVar.a(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = aqsVar.a(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = aqsVar.a(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = aqsVar.a(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, aqs aqsVar) {
        aqsVar.h(audioAttributesImplBase.a, 1);
        aqsVar.h(audioAttributesImplBase.b, 2);
        aqsVar.h(audioAttributesImplBase.c, 3);
        aqsVar.h(audioAttributesImplBase.d, 4);
    }
}
