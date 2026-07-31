package androidx.media;

import java.util.Arrays;

/* loaded from: classes.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a, reason: collision with root package name */
    int f12755a = 0;

    /* renamed from: b, reason: collision with root package name */
    int f12756b = 0;

    /* renamed from: c, reason: collision with root package name */
    int f12757c = 0;

    /* renamed from: d, reason: collision with root package name */
    int f12758d = -1;

    AudioAttributesImplBase() {
    }

    public int a() {
        return this.f12756b;
    }

    public int b() {
        int i4 = this.f12757c;
        int c4 = c();
        if (c4 == 6) {
            i4 |= 4;
        } else if (c4 == 7) {
            i4 |= 1;
        }
        return i4 & 273;
    }

    public int c() {
        int i4 = this.f12758d;
        return i4 != -1 ? i4 : AudioAttributesCompat.a(false, this.f12757c, this.f12755a);
    }

    public int d() {
        return this.f12755a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        return this.f12756b == audioAttributesImplBase.a() && this.f12757c == audioAttributesImplBase.b() && this.f12755a == audioAttributesImplBase.d() && this.f12758d == audioAttributesImplBase.f12758d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f12756b), Integer.valueOf(this.f12757c), Integer.valueOf(this.f12755a), Integer.valueOf(this.f12758d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f12758d != -1) {
            sb.append(" stream=");
            sb.append(this.f12758d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.b(this.f12755a));
        sb.append(" content=");
        sb.append(this.f12756b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f12757c).toUpperCase());
        return sb.toString();
    }
}
