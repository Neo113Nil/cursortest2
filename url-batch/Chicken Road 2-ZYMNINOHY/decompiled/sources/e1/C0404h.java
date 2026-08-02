package e1;

import E.AbstractC0005f;
import android.text.Layout;

/* renamed from: e1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0404h {

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f8451c;

    /* renamed from: a, reason: collision with root package name */
    public long f8449a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f8450b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f8452d = 2;

    /* renamed from: e, reason: collision with root package name */
    public float f8453e = -3.4028235E38f;

    /* renamed from: f, reason: collision with root package name */
    public int f8454f = 1;

    /* renamed from: g, reason: collision with root package name */
    public int f8455g = 0;

    /* renamed from: h, reason: collision with root package name */
    public float f8456h = -3.4028235E38f;

    /* renamed from: i, reason: collision with root package name */
    public int f8457i = Integer.MIN_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public float f8458j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public int f8459k = Integer.MIN_VALUE;

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0072, code lost:
    
        if (r7 == 0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V.a a() {
        Layout.Alignment alignment;
        float f4;
        CharSequence charSequence;
        float f5 = this.f8456h;
        float f6 = -3.4028235E38f;
        if (f5 == -3.4028235E38f) {
            int i4 = this.f8452d;
            f5 = i4 != 4 ? i4 != 5 ? 0.5f : 1.0f : 0.0f;
        }
        int i5 = this.f8457i;
        if (i5 == Integer.MIN_VALUE) {
            int i6 = this.f8452d;
            if (i6 != 1) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        if (i6 != 5) {
                            i5 = 1;
                        }
                    }
                }
                i5 = 2;
            }
            i5 = 0;
        }
        V.a aVar = new V.a();
        int i7 = this.f8452d;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            AbstractC0005f.u(i7, "Unknown textAlignment: ", "WebvttCueParser");
                            alignment = null;
                        }
                    }
                }
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            aVar.f3117c = alignment;
            f4 = this.f8453e;
            int i8 = this.f8454f;
            if (f4 != -3.4028235E38f || i8 != 0 || (f4 >= 0.0f && f4 <= 1.0f)) {
                if (f4 == -3.4028235E38f) {
                    f6 = f4;
                }
                aVar.f3119e = f6;
                aVar.f3120f = i8;
                aVar.f3121g = this.f8455g;
                aVar.f3122h = f5;
                aVar.f3123i = i5;
                float f7 = this.f8458j;
                if (i5 == 0) {
                    f5 = 1.0f - f5;
                } else if (i5 == 1) {
                    f5 = f5 <= 0.5f ? f5 * 2.0f : (1.0f - f5) * 2.0f;
                } else if (i5 != 2) {
                    throw new IllegalStateException(String.valueOf(i5));
                }
                aVar.f3126l = Math.min(f7, f5);
                aVar.f3128p = this.f8459k;
                charSequence = this.f8451c;
                if (charSequence != null) {
                    aVar.f3115a = charSequence;
                    aVar.f3116b = null;
                }
                return aVar;
            }
            f6 = 1.0f;
            aVar.f3119e = f6;
            aVar.f3120f = i8;
            aVar.f3121g = this.f8455g;
            aVar.f3122h = f5;
            aVar.f3123i = i5;
            float f72 = this.f8458j;
            if (i5 == 0) {
            }
            aVar.f3126l = Math.min(f72, f5);
            aVar.f3128p = this.f8459k;
            charSequence = this.f8451c;
            if (charSequence != null) {
            }
            return aVar;
        }
        alignment = Layout.Alignment.ALIGN_NORMAL;
        aVar.f3117c = alignment;
        f4 = this.f8453e;
        int i82 = this.f8454f;
        if (f4 != -3.4028235E38f) {
        }
        if (f4 == -3.4028235E38f) {
        }
        aVar.f3119e = f6;
        aVar.f3120f = i82;
        aVar.f3121g = this.f8455g;
        aVar.f3122h = f5;
        aVar.f3123i = i5;
        float f722 = this.f8458j;
        if (i5 == 0) {
        }
        aVar.f3126l = Math.min(f722, f5);
        aVar.f3128p = this.f8459k;
        charSequence = this.f8451c;
        if (charSequence != null) {
        }
        return aVar;
    }
}
