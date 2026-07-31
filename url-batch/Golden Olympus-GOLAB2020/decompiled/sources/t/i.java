package t;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class i extends C3423e implements h {

    /* renamed from: w0, reason: collision with root package name */
    public C3423e[] f46194w0 = new C3423e[4];

    /* renamed from: x0, reason: collision with root package name */
    public int f46195x0 = 0;

    @Override // t.h
    public void b() {
        this.f46195x0 = 0;
        Arrays.fill(this.f46194w0, (Object) null);
    }

    @Override // t.h
    public void c(C3423e c3423e) {
        if (c3423e == this || c3423e == null) {
            return;
        }
        int i4 = this.f46195x0 + 1;
        C3423e[] c3423eArr = this.f46194w0;
        if (i4 > c3423eArr.length) {
            this.f46194w0 = (C3423e[]) Arrays.copyOf(c3423eArr, c3423eArr.length * 2);
        }
        C3423e[] c3423eArr2 = this.f46194w0;
        int i5 = this.f46195x0;
        c3423eArr2[i5] = c3423e;
        this.f46195x0 = i5 + 1;
    }

    @Override // t.h
    public void a(f fVar) {
    }
}
