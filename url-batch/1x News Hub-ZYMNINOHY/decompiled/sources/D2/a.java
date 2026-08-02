package D2;

import android.media.AudioAttributes;
import java.util.Objects;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f225a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f226b;

    /* renamed from: c, reason: collision with root package name */
    public final int f227c;

    /* renamed from: d, reason: collision with root package name */
    public final int f228d;

    /* renamed from: e, reason: collision with root package name */
    public final int f229e;
    public final int f;

    public a(boolean z, boolean z2, int i3, int i4, int i5, int i6) {
        this.f225a = z;
        this.f226b = z2;
        this.f227c = i3;
        this.f228d = i4;
        this.f229e = i5;
        this.f = i6;
    }

    public static a b(a aVar) {
        boolean z = aVar.f225a;
        boolean z2 = aVar.f226b;
        int i3 = aVar.f227c;
        int i4 = aVar.f228d;
        int i5 = aVar.f229e;
        int i6 = aVar.f;
        aVar.getClass();
        return new a(z, z2, i3, i4, i5, i6);
    }

    public final AudioAttributes a() {
        AudioAttributes build = new AudioAttributes.Builder().setUsage(this.f228d).setContentType(this.f227c).build();
        j.d(build, "build(...)");
        return build;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f225a == aVar.f225a && this.f226b == aVar.f226b && this.f227c == aVar.f227c && this.f228d == aVar.f228d && this.f229e == aVar.f229e && this.f == aVar.f;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f225a), Boolean.valueOf(this.f226b), Integer.valueOf(this.f227c), Integer.valueOf(this.f228d), Integer.valueOf(this.f229e), Integer.valueOf(this.f));
    }

    public final String toString() {
        return "AudioContextAndroid(isSpeakerphoneOn=" + this.f225a + ", stayAwake=" + this.f226b + ", contentType=" + this.f227c + ", usageType=" + this.f228d + ", audioFocus=" + this.f229e + ", audioMode=" + this.f + ')';
    }
}
