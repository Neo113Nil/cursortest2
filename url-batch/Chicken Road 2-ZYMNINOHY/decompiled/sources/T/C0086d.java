package T;

import E.AbstractC0005f;
import android.media.AudioAttributes;
import android.os.Build;

/* renamed from: T.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0086d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0086d f2771c = new C0086d(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f2772a;

    /* renamed from: b, reason: collision with root package name */
    public AudioAttributes f2773b;

    static {
        AbstractC0005f.s(0, 1, 2, 3, 4);
        W.J.G(5);
        W.J.G(6);
    }

    public C0086d(int i4) {
        this.f2772a = i4;
    }

    public final AudioAttributes a() {
        if (this.f2773b == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(this.f2772a).setFlags(0).setUsage(1);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 29) {
                usage.setAllowedCapturePolicy(1);
                usage.setHapticChannelsMuted(true);
            }
            if (i4 >= 32) {
                usage.setSpatializationBehavior(0);
                usage.setIsContentSpatialized(false);
            }
            this.f2773b = usage.build();
        }
        return this.f2773b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0086d.class == obj.getClass() && this.f2772a == ((C0086d) obj).f2772a;
    }

    public final int hashCode() {
        return ((((((527 + this.f2772a) * 961) + 1) * 31) + 1) * 29791) + 1;
    }
}
