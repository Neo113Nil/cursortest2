package androidx.media2.common;

import a0.b;
import java.util.Arrays;
import q.d;

/* loaded from: classes.dex */
public final class SubtitleData implements b {

    /* renamed from: a, reason: collision with root package name */
    long f1134a;

    /* renamed from: b, reason: collision with root package name */
    long f1135b;

    /* renamed from: c, reason: collision with root package name */
    byte[] f1136c;

    SubtitleData() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SubtitleData.class != obj.getClass()) {
            return false;
        }
        SubtitleData subtitleData = (SubtitleData) obj;
        return this.f1134a == subtitleData.f1134a && this.f1135b == subtitleData.f1135b && Arrays.equals(this.f1136c, subtitleData.f1136c);
    }

    public int hashCode() {
        return d.b(Long.valueOf(this.f1134a), Long.valueOf(this.f1135b), Integer.valueOf(Arrays.hashCode(this.f1136c)));
    }
}
