package W0;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3385a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3386b;

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f3387c;

    /* renamed from: d, reason: collision with root package name */
    public int f3388d;

    /* renamed from: e, reason: collision with root package name */
    public int f3389e;

    /* renamed from: f, reason: collision with root package name */
    public int f3390f;

    /* renamed from: g, reason: collision with root package name */
    public int f3391g;

    /* renamed from: h, reason: collision with root package name */
    public int f3392h;

    public b(int i4, int i5) {
        ArrayList arrayList = new ArrayList();
        this.f3385a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f3386b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.f3387c = sb;
        this.f3391g = i4;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.f3388d = 15;
        this.f3389e = 0;
        this.f3390f = 0;
        this.f3392h = i5;
    }

    public final void a(char c4) {
        StringBuilder sb = this.f3387c;
        if (sb.length() < 32) {
            sb.append(c4);
        }
    }

    public final void b() {
        StringBuilder sb = this.f3387c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.f3385a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                a aVar = (a) arrayList.get(size);
                int i4 = aVar.f3384c;
                if (i4 != length) {
                    return;
                }
                aVar.f3384c = i4 - 1;
            }
        }
    }

    public final V.b c(int i4) {
        float f4;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f3386b;
            if (i5 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i5));
            spannableStringBuilder.append('\n');
            i5++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i6 = this.f3389e + this.f3390f;
        int length = (32 - i6) - spannableStringBuilder.length();
        int i7 = i6 - length;
        int i8 = i4 != Integer.MIN_VALUE ? i4 : (this.f3391g != 2 || (Math.abs(i7) >= 3 && length >= 0)) ? (this.f3391g != 2 || i7 <= 0) ? 0 : 2 : 1;
        if (i8 != 1) {
            if (i8 == 2) {
                i6 = 32 - length;
            }
            f4 = ((i6 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f4 = 0.5f;
        }
        float f5 = f4;
        int i9 = this.f3388d;
        if (i9 > 7) {
            i9 -= 17;
        } else if (this.f3391g == 1) {
            i9 -= this.f3392h - 1;
        }
        return new V.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i9, 1, Integer.MIN_VALUE, f5, i8, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
    }

    public final SpannableString d() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f3387c);
        int length = spannableStringBuilder.length();
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = 0;
        int i9 = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.f3385a;
            if (i8 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i8);
            boolean z4 = aVar.f3383b;
            int i10 = aVar.f3382a;
            if (i10 != 8) {
                boolean z5 = i10 == 7;
                if (i10 != 7) {
                    i7 = c.f3394B[i10];
                }
                z = z5;
            }
            int i11 = aVar.f3384c;
            i8++;
            if (i11 != (i8 < arrayList.size() ? ((a) arrayList.get(i8)).f3384c : length)) {
                if (i4 != -1 && !z4) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i4, i11, 33);
                    i4 = -1;
                } else if (i4 == -1 && z4) {
                    i4 = i11;
                }
                if (i5 != -1 && !z) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i5, i11, 33);
                    i5 = -1;
                } else if (i5 == -1 && z) {
                    i5 = i11;
                }
                if (i7 != i6) {
                    if (i6 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i6), i9, i11, 33);
                    }
                    i6 = i7;
                    i9 = i11;
                }
            }
        }
        if (i4 != -1 && i4 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i4, length, 33);
        }
        if (i5 != -1 && i5 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i5, length, 33);
        }
        if (i9 != length && i6 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i6), i9, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        return this.f3385a.isEmpty() && this.f3386b.isEmpty() && this.f3387c.length() == 0;
    }
}
