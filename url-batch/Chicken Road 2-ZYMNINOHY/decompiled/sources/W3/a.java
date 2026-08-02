package W3;

import android.media.AudioAttributes;
import java.util.Objects;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3465a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3466b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3467c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3468d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3469e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3470f;

    public a(boolean z, boolean z4, int i4, int i5, int i6, int i7) {
        this.f3465a = z;
        this.f3466b = z4;
        this.f3467c = i4;
        this.f3468d = i5;
        this.f3469e = i6;
        this.f3470f = i7;
    }

    public static a b(a aVar) {
        boolean z = aVar.f3465a;
        boolean z4 = aVar.f3466b;
        int i4 = aVar.f3467c;
        int i5 = aVar.f3468d;
        int i6 = aVar.f3469e;
        int i7 = aVar.f3470f;
        aVar.getClass();
        return new a(z, z4, i4, i5, i6, i7);
    }

    public final AudioAttributes a() {
        AudioAttributes build = new AudioAttributes.Builder().setUsage(this.f3468d).setContentType(this.f3467c).build();
        i.d(build, "build(...)");
        return build;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3465a == aVar.f3465a && this.f3466b == aVar.f3466b && this.f3467c == aVar.f3467c && this.f3468d == aVar.f3468d && this.f3469e == aVar.f3469e && this.f3470f == aVar.f3470f;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f3465a), Boolean.valueOf(this.f3466b), Integer.valueOf(this.f3467c), Integer.valueOf(this.f3468d), Integer.valueOf(this.f3469e), Integer.valueOf(this.f3470f));
    }

    public final String toString() {
        return "AudioContextAndroid(isSpeakerphoneOn=" + this.f3465a + ", stayAwake=" + this.f3466b + ", contentType=" + this.f3467c + ", usageType=" + this.f3468d + ", audioFocus=" + this.f3469e + ", audioMode=" + this.f3470f + ')';
    }
}
