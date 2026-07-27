package a0;

/* renamed from: a0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0353h {

    /* renamed from: a, reason: collision with root package name */
    public static final i.q f4789a;

    static {
        C0362q c0362q = C0349d.f4763c;
        int i2 = c0362q.f4760c;
        C0350e c0350e = new C0350e(c0362q, c0362q, 1);
        C0357l c0357l = C0349d.f4780t;
        int i4 = c0357l.f4760c << 6;
        int i5 = c0362q.f4760c;
        int i6 = i4 | i5;
        C0352g c0352g = new C0352g(c0362q, c0357l, 0);
        int i7 = (i5 << 6) | c0357l.f4760c;
        C0352g c0352g2 = new C0352g(c0357l, c0362q, 0);
        i.q qVar = i.j.f6922a;
        i.q qVar2 = new i.q();
        qVar2.i(i2 | (i2 << 6), c0350e);
        qVar2.i(i6, c0352g);
        qVar2.i(i7, c0352g2);
        f4789a = qVar2;
    }
}
