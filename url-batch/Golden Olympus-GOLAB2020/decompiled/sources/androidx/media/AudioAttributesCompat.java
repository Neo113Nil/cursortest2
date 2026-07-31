package androidx.media;

import android.util.SparseIntArray;
import m0.InterfaceC3256a;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements InterfaceC3256a {

    /* renamed from: b, reason: collision with root package name */
    private static final SparseIntArray f12750b;

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f12751c;

    /* renamed from: a, reason: collision with root package name */
    AudioAttributesImpl f12752a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f12750b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        f12751c = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    AudioAttributesCompat() {
    }

    static int a(boolean z4, int i4, int i5) {
        if ((i4 & 1) == 1) {
            return z4 ? 1 : 7;
        }
        if ((i4 & 4) == 4) {
            return z4 ? 0 : 6;
        }
        switch (i5) {
            case 0:
                return z4 ? Integer.MIN_VALUE : 3;
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z4 ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
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
                if (!z4) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + i5 + " in audio attributes");
        }
    }

    static String b(int i4) {
        switch (i4) {
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
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
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
                return "unknown usage " + i4;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f12752a;
        return audioAttributesImpl == null ? audioAttributesCompat.f12752a == null : audioAttributesImpl.equals(audioAttributesCompat.f12752a);
    }

    public int hashCode() {
        return this.f12752a.hashCode();
    }

    public String toString() {
        return this.f12752a.toString();
    }
}
