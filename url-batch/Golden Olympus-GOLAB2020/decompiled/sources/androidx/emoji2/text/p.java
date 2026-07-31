package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public class p {

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f12214d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    private final int f12215a;

    /* renamed from: b, reason: collision with root package name */
    private final n f12216b;

    /* renamed from: c, reason: collision with root package name */
    private volatile int f12217c = 0;

    p(n nVar, int i4) {
        this.f12216b = nVar;
        this.f12215a = i4;
    }

    private T.a g() {
        ThreadLocal threadLocal = f12214d;
        T.a aVar = (T.a) threadLocal.get();
        if (aVar == null) {
            aVar = new T.a();
            threadLocal.set(aVar);
        }
        this.f12216b.d().j(aVar, this.f12215a);
        return aVar;
    }

    public void a(Canvas canvas, float f4, float f5, Paint paint) {
        Typeface g4 = this.f12216b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g4);
        canvas.drawText(this.f12216b.c(), this.f12215a * 2, 2, f4, f5, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i4) {
        return g().h(i4);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.f12217c & 3;
    }

    public int e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public int i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public boolean k() {
        return (this.f12217c & 4) > 0;
    }

    public void l(boolean z4) {
        int d4 = d();
        if (z4) {
            this.f12217c = d4 | 4;
        } else {
            this.f12217c = d4;
        }
    }

    public void m(boolean z4) {
        int i4 = this.f12217c & 4;
        this.f12217c = z4 ? i4 | 2 : i4 | 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(f()));
        sb.append(", codepoints:");
        int c4 = c();
        for (int i4 = 0; i4 < c4; i4++) {
            sb.append(Integer.toHexString(b(i4)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
