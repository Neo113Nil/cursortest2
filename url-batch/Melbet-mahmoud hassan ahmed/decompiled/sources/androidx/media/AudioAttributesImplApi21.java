package androidx.media;

import android.annotation.SuppressLint;
import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f949a;

    /* renamed from: b, reason: collision with root package name */
    public int f950b;

    static class a implements AudioAttributesImpl.a {

        /* renamed from: a, reason: collision with root package name */
        final AudioAttributes.Builder f951a = new AudioAttributes.Builder();

        a() {
        }

        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl a() {
            return new AudioAttributesImplApi21(this.f951a.build());
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a e(int i7) {
            this.f951a.setContentType(i7);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a d(int i7) {
            this.f951a.setFlags(i7);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a c(int i7) {
            this.f951a.setLegacyStreamType(i7);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        @SuppressLint({"WrongConstant"})
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a b(int i7) {
            if (i7 == 16) {
                i7 = 12;
            }
            this.f951a.setUsage(i7);
            return this;
        }
    }

    public AudioAttributesImplApi21() {
        this.f950b = -1;
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes) {
        this(audioAttributes, -1);
    }

    AudioAttributesImplApi21(AudioAttributes audioAttributes, int i7) {
        this.f950b = -1;
        this.f949a = audioAttributes;
        this.f950b = i7;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int a() {
        int i7 = this.f950b;
        return i7 != -1 ? i7 : AudioAttributesCompat.c(false, c(), d());
    }

    @Override // androidx.media.AudioAttributesImpl
    public Object b() {
        return this.f949a;
    }

    public int c() {
        return this.f949a.getFlags();
    }

    public int d() {
        return this.f949a.getUsage();
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f949a.equals(((AudioAttributesImplApi21) obj).f949a);
        }
        return false;
    }

    public int hashCode() {
        return this.f949a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f949a;
    }
}
