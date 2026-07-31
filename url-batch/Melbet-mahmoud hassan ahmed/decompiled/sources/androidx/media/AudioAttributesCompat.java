package androidx.media;

import android.media.AudioAttributes;
import android.os.Build;
import android.util.SparseIntArray;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi21;
import androidx.media.AudioAttributesImplApi26;
import androidx.media.AudioAttributesImplBase;
import c4.w0;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements a0.b {

    /* renamed from: b, reason: collision with root package name */
    private static final SparseIntArray f944b;

    /* renamed from: c, reason: collision with root package name */
    static boolean f945c;

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f946d;

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributesImpl f947a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final AudioAttributesImpl.a f948a;

        public a() {
            AudioAttributesImpl.a aVar;
            if (AudioAttributesCompat.f945c) {
                aVar = new AudioAttributesImplBase.a();
            } else {
                int i7 = Build.VERSION.SDK_INT;
                aVar = i7 >= 26 ? new AudioAttributesImplApi26.a() : i7 >= 21 ? new AudioAttributesImplApi21.a() : new AudioAttributesImplBase.a();
            }
            this.f948a = aVar;
        }

        public AudioAttributesCompat a() {
            return new AudioAttributesCompat(this.f948a.a());
        }

        public a b(int i7) {
            this.f948a.e(i7);
            return this;
        }

        public a c(int i7) {
            this.f948a.d(i7);
            return this;
        }

        public a d(int i7) {
            this.f948a.c(i7);
            return this;
        }

        public a e(int i7) {
            this.f948a.b(i7);
            return this;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f944b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        f946d = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    public AudioAttributesCompat() {
    }

    AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f947a = audioAttributesImpl;
    }

    static int c(boolean z6, int i7, int i8) {
        if ((i7 & 1) == 1) {
            return z6 ? 1 : 7;
        }
        if ((i7 & 4) == 4) {
            return z6 ? 0 : 6;
        }
        switch (i8) {
            case 0:
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z6 ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case w0.f2149o /* 7 */:
            case w0.f2150p /* 8 */:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case 15:
            default:
                if (!z6) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + i8 + " in audio attributes");
        }
    }

    static String e(int i7) {
        switch (i7) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case w0.f2149o /* 7 */:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case w0.f2150p /* 8 */:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage " + i7;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    public static AudioAttributesCompat f(Object obj) {
        if (f945c) {
            return null;
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            return new AudioAttributesCompat(new AudioAttributesImplApi26((AudioAttributes) obj));
        }
        if (i7 >= 21) {
            return new AudioAttributesCompat(new AudioAttributesImplApi21((AudioAttributes) obj));
        }
        return null;
    }

    public int a() {
        return this.f947a.a();
    }

    public Object d() {
        return this.f947a.b();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesImpl audioAttributesImpl = this.f947a;
        AudioAttributesImpl audioAttributesImpl2 = ((AudioAttributesCompat) obj).f947a;
        return audioAttributesImpl == null ? audioAttributesImpl2 == null : audioAttributesImpl.equals(audioAttributesImpl2);
    }

    public int hashCode() {
        return this.f947a.hashCode();
    }

    public String toString() {
        return this.f947a.toString();
    }
}
