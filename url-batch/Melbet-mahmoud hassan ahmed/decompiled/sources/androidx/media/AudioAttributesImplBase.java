package androidx.media;

import android.util.Log;
import androidx.media.AudioAttributesImpl;
import c4.w0;
import java.util.Arrays;

/* loaded from: classes.dex */
public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f952a;

    /* renamed from: b, reason: collision with root package name */
    public int f953b;

    /* renamed from: c, reason: collision with root package name */
    public int f954c;

    /* renamed from: d, reason: collision with root package name */
    public int f955d;

    static class a implements AudioAttributesImpl.a {

        /* renamed from: a, reason: collision with root package name */
        private int f956a = 0;

        /* renamed from: b, reason: collision with root package name */
        private int f957b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f958c = 0;

        /* renamed from: d, reason: collision with root package name */
        private int f959d = -1;

        a() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private a h(int i7) {
            int i8 = 1;
            switch (i7) {
                case 0:
                case 10:
                    this.f957b = i8;
                    break;
                case 1:
                case 2:
                case 4:
                case 5:
                case w0.f2150p /* 8 */:
                case 9:
                    this.f957b = 4;
                    break;
                case 3:
                    i8 = 2;
                    this.f957b = i8;
                    break;
                case 6:
                    this.f957b = 1;
                    this.f958c |= 4;
                    break;
                case w0.f2149o /* 7 */:
                    this.f958c = 1 | this.f958c;
                    this.f957b = 4;
                    break;
                default:
                    Log.e("AudioAttributesCompat", "Invalid stream type " + i7 + " for AudioAttributesCompat");
                    break;
            }
            this.f956a = AudioAttributesImplBase.f(i7);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        public AudioAttributesImpl a() {
            return new AudioAttributesImplBase(this.f957b, this.f958c, this.f956a, this.f959d);
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a e(int i7) {
            if (i7 != 0 && i7 != 1 && i7 != 2 && i7 != 3 && i7 != 4) {
                i7 = 0;
            }
            this.f957b = i7;
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a d(int i7) {
            this.f958c = (i7 & 1023) | this.f958c;
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a c(int i7) {
            if (i7 == 10) {
                throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
            }
            this.f959d = i7;
            return h(i7);
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public a b(int i7) {
            switch (i7) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case w0.f2149o /* 7 */:
                case w0.f2150p /* 8 */:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    break;
                case 16:
                    i7 = 12;
                    break;
                default:
                    i7 = 0;
                    break;
            }
            this.f956a = i7;
            return this;
        }
    }

    public AudioAttributesImplBase() {
        this.f952a = 0;
        this.f953b = 0;
        this.f954c = 0;
        this.f955d = -1;
    }

    AudioAttributesImplBase(int i7, int i8, int i9, int i10) {
        this.f952a = 0;
        this.f953b = 0;
        this.f954c = 0;
        this.f955d = -1;
        this.f953b = i7;
        this.f954c = i8;
        this.f952a = i9;
        this.f955d = i10;
    }

    static int f(int i7) {
        switch (i7) {
        }
        return 2;
    }

    @Override // androidx.media.AudioAttributesImpl
    public int a() {
        int i7 = this.f955d;
        return i7 != -1 ? i7 : AudioAttributesCompat.c(false, this.f954c, this.f952a);
    }

    @Override // androidx.media.AudioAttributesImpl
    public Object b() {
        return null;
    }

    public int c() {
        return this.f953b;
    }

    public int d() {
        int i7 = this.f954c;
        int a7 = a();
        if (a7 == 6) {
            i7 |= 4;
        } else if (a7 == 7) {
            i7 |= 1;
        }
        return i7 & 273;
    }

    public int e() {
        return this.f952a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f953b == audioAttributesImplBase.c() && this.f954c == audioAttributesImplBase.d() && this.f952a == audioAttributesImplBase.e() && this.f955d == audioAttributesImplBase.f955d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f953b), Integer.valueOf(this.f954c), Integer.valueOf(this.f952a), Integer.valueOf(this.f955d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f955d != -1) {
            sb.append(" stream=");
            sb.append(this.f955d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.e(this.f952a));
        sb.append(" content=");
        sb.append(this.f953b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f954c).toUpperCase());
        return sb.toString();
    }
}
