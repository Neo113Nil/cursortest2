package s1;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final v f10564d;

    /* renamed from: e, reason: collision with root package name */
    public final Bundle f10565e;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f10566i;

    /* renamed from: j, reason: collision with root package name */
    public final int f10567j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f10568k;

    public u(v destination, Bundle bundle, boolean z4, int i2, boolean z5) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f10564d = destination;
        this.f10565e = bundle;
        this.f10566i = z4;
        this.f10567j = i2;
        this.f10568k = z5;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(u other) {
        Intrinsics.checkNotNullParameter(other, "other");
        boolean z4 = this.f10566i;
        if (z4 && !other.f10566i) {
            return 1;
        }
        if (!z4 && other.f10566i) {
            return -1;
        }
        int i2 = this.f10567j - other.f10567j;
        if (i2 > 0) {
            return 1;
        }
        if (i2 < 0) {
            return -1;
        }
        Bundle bundle = other.f10565e;
        Bundle bundle2 = this.f10565e;
        if (bundle2 != null && bundle == null) {
            return 1;
        }
        if (bundle2 == null && bundle != null) {
            return -1;
        }
        if (bundle2 != null) {
            int size = bundle2.size();
            Intrinsics.c(bundle);
            int size2 = size - bundle.size();
            if (size2 > 0) {
                return 1;
            }
            if (size2 < 0) {
                return -1;
            }
        }
        boolean z5 = other.f10568k;
        boolean z6 = this.f10568k;
        if (!z6 || z5) {
            return (z6 || !z5) ? 0 : -1;
        }
        return 1;
    }
}
