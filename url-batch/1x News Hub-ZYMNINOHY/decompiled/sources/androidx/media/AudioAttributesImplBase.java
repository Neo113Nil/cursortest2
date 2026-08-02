package androidx.media;

import E1.AbstractC0033i;
import java.util.Arrays;

/* loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f2417a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f2418b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f2419c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f2420d = -1;

    public final boolean equals(Object obj) {
        int i3;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f2418b == audioAttributesImplBase.f2418b) {
            int i4 = this.f2419c;
            int i5 = audioAttributesImplBase.f2419c;
            int i6 = audioAttributesImplBase.f2420d;
            if (i6 == -1) {
                int i7 = audioAttributesImplBase.f2417a;
                int i8 = AudioAttributesCompat.f2413b;
                if ((i5 & 1) != 1) {
                    if ((i5 & 4) != 4) {
                        switch (i7) {
                            case 2:
                                i3 = 0;
                                break;
                            case 3:
                                i3 = 8;
                                break;
                            case 4:
                                i3 = 4;
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i3 = 5;
                                break;
                            case 6:
                                i3 = 2;
                                break;
                            case 11:
                                i3 = 10;
                                break;
                            case 12:
                            default:
                                i3 = 3;
                                break;
                            case 13:
                                i3 = 1;
                                break;
                        }
                    } else {
                        i3 = 6;
                    }
                } else {
                    i3 = 7;
                }
            } else {
                i3 = i6;
            }
            if (i3 == 6) {
                i5 |= 4;
            } else if (i3 == 7) {
                i5 |= 1;
            }
            if (i4 == (i5 & 273) && this.f2417a == audioAttributesImplBase.f2417a && this.f2420d == i6) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f2418b), Integer.valueOf(this.f2419c), Integer.valueOf(this.f2417a), Integer.valueOf(this.f2420d)});
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f2420d != -1) {
            sb.append(" stream=");
            sb.append(this.f2420d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        int i3 = this.f2417a;
        int i4 = AudioAttributesCompat.f2413b;
        switch (i3) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = AbstractC0033i.h(i3, "unknown usage ");
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb.append(str);
        sb.append(" content=");
        sb.append(this.f2418b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f2419c).toUpperCase());
        return sb.toString();
    }
}
