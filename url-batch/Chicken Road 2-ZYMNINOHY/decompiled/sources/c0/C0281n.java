package c0;

import T.C0086d;
import java.util.Objects;

/* renamed from: c0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0281n {

    /* renamed from: a, reason: collision with root package name */
    public final int f5584a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5585b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5586c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5587d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5588e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5589f;

    /* renamed from: g, reason: collision with root package name */
    public final C0086d f5590g;

    /* renamed from: h, reason: collision with root package name */
    public final int f5591h;

    /* renamed from: i, reason: collision with root package name */
    public final int f5592i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f5593j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f5594k;

    public C0281n(C0280m c0280m) {
        this.f5584a = c0280m.f5573a;
        this.f5585b = c0280m.f5574b;
        this.f5586c = c0280m.f5575c;
        this.f5587d = c0280m.f5576d;
        this.f5588e = c0280m.f5577e;
        this.f5589f = c0280m.f5578f;
        this.f5590g = c0280m.f5579g;
        this.f5591h = c0280m.f5580h;
        this.f5592i = c0280m.f5581i;
        this.f5593j = c0280m.f5582j;
        this.f5594k = c0280m.f5583k;
    }

    public final C0280m a() {
        C0280m c0280m = new C0280m();
        c0280m.f5573a = this.f5584a;
        c0280m.f5574b = this.f5585b;
        c0280m.f5575c = this.f5586c;
        c0280m.f5576d = this.f5587d;
        c0280m.f5577e = this.f5588e;
        c0280m.f5578f = this.f5589f;
        c0280m.f5579g = this.f5590g;
        c0280m.f5580h = this.f5591h;
        c0280m.f5581i = this.f5592i;
        c0280m.f5582j = this.f5593j;
        c0280m.f5583k = this.f5594k;
        return c0280m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0281n.class != obj.getClass()) {
            return false;
        }
        C0281n c0281n = (C0281n) obj;
        return this.f5584a == c0281n.f5584a && this.f5585b == c0281n.f5585b && this.f5586c == c0281n.f5586c && this.f5587d == c0281n.f5587d && this.f5588e == c0281n.f5588e && this.f5589f == c0281n.f5589f && this.f5591h == c0281n.f5591h && this.f5592i == c0281n.f5592i && this.f5593j == c0281n.f5593j && this.f5594k == c0281n.f5594k && this.f5590g.equals(c0281n.f5590g);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f5584a), Integer.valueOf(this.f5585b), Integer.valueOf(this.f5586c), Boolean.valueOf(this.f5587d), Boolean.valueOf(this.f5588e), Integer.valueOf(this.f5589f), this.f5590g, Integer.valueOf(this.f5591h), Integer.valueOf(this.f5592i), Boolean.valueOf(this.f5594k), Boolean.valueOf(this.f5593j));
    }
}
