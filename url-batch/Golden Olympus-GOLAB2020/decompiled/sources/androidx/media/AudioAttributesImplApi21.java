package androidx.media;

import android.media.AudioAttributes;

/* loaded from: classes.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    AudioAttributes f12753a;

    /* renamed from: b, reason: collision with root package name */
    int f12754b = -1;

    AudioAttributesImplApi21() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f12753a.equals(((AudioAttributesImplApi21) obj).f12753a);
        }
        return false;
    }

    public int hashCode() {
        return this.f12753a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f12753a;
    }
}
