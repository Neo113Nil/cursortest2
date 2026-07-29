package android.support.constraint.a.a;

import android.support.constraint.a.g;
import java.util.HashSet;

/* compiled from: ConstraintAnchor.java */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    final android.support.constraint.a.a.b f1396a;

    /* renamed from: b, reason: collision with root package name */
    final c f1397b;

    /* renamed from: c, reason: collision with root package name */
    a f1398c;
    android.support.constraint.a.g f;

    /* renamed from: d, reason: collision with root package name */
    public int f1399d = 0;
    int e = -1;
    private b h = b.NONE;
    private EnumC0003a i = EnumC0003a.RELAXED;
    private int j = 0;
    int g = Integer.MAX_VALUE;

    /* compiled from: ConstraintAnchor.java */
    /* renamed from: android.support.constraint.a.a.a$a, reason: collision with other inner class name */
    public enum EnumC0003a {
        RELAXED,
        STRICT
    }

    /* compiled from: ConstraintAnchor.java */
    public enum b {
        NONE,
        STRONG,
        WEAK
    }

    /* compiled from: ConstraintAnchor.java */
    public enum c {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public a(android.support.constraint.a.a.b bVar, c cVar) {
        this.f1396a = bVar;
        this.f1397b = cVar;
    }

    public android.support.constraint.a.g a() {
        return this.f;
    }

    public void a(android.support.constraint.a.c cVar) {
        if (this.f == null) {
            this.f = new android.support.constraint.a.g(g.a.UNRESTRICTED);
        } else {
            this.f.c();
        }
    }

    public android.support.constraint.a.a.b b() {
        return this.f1396a;
    }

    public c c() {
        return this.f1397b;
    }

    public int d() {
        if (this.f1396a.d() == 8) {
            return 0;
        }
        if (this.e > -1 && this.f1398c != null && this.f1398c.f1396a.d() == 8) {
            return this.e;
        }
        return this.f1399d;
    }

    public b e() {
        return this.h;
    }

    public a f() {
        return this.f1398c;
    }

    public EnumC0003a g() {
        return this.i;
    }

    public void a(EnumC0003a enumC0003a) {
        this.i = enumC0003a;
    }

    public int h() {
        return this.j;
    }

    public void i() {
        this.f1398c = null;
        this.f1399d = 0;
        this.e = -1;
        this.h = b.STRONG;
        this.j = 0;
        this.i = EnumC0003a.RELAXED;
    }

    public boolean a(a aVar, int i, b bVar, int i2) {
        return a(aVar, i, -1, bVar, i2, false);
    }

    public boolean a(a aVar, int i, int i2, b bVar, int i3, boolean z) {
        if (aVar == null) {
            this.f1398c = null;
            this.f1399d = 0;
            this.e = -1;
            this.h = b.NONE;
            this.j = 2;
            return true;
        }
        if (!z && !a(aVar)) {
            return false;
        }
        this.f1398c = aVar;
        if (i > 0) {
            this.f1399d = i;
        } else {
            this.f1399d = 0;
        }
        this.e = i2;
        this.h = bVar;
        this.j = i3;
        return true;
    }

    public boolean j() {
        return this.f1398c != null;
    }

    public boolean a(a aVar) {
        if (aVar == null) {
            return false;
        }
        c c2 = aVar.c();
        if (c2 == this.f1397b) {
            if (this.f1397b == c.CENTER) {
                return false;
            }
            return this.f1397b != c.BASELINE || (aVar.b().v() && b().v());
        }
        switch (this.f1397b) {
            case CENTER:
                if (c2 == c.BASELINE || c2 == c.CENTER_X || c2 == c.CENTER_Y) {
                }
                break;
            case LEFT:
            case RIGHT:
                boolean z = c2 == c.LEFT || c2 == c.RIGHT;
                if (aVar.b() instanceof d) {
                    if (z || c2 == c.CENTER_X) {
                    }
                }
                break;
            case TOP:
            case BOTTOM:
                boolean z2 = c2 == c.TOP || c2 == c.BOTTOM;
                if (aVar.b() instanceof d) {
                    if (z2 || c2 == c.CENTER_Y) {
                    }
                }
                break;
        }
        return false;
    }

    public String toString() {
        String str;
        HashSet<a> hashSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1396a.e());
        sb.append(":");
        sb.append(this.f1397b.toString());
        if (this.f1398c != null) {
            str = " connected to " + this.f1398c.a(hashSet);
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    private String a(HashSet<a> hashSet) {
        String str;
        if (!hashSet.add(this)) {
            return "<-";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1396a.e());
        sb.append(":");
        sb.append(this.f1397b.toString());
        if (this.f1398c != null) {
            str = " connected to " + this.f1398c.a(hashSet);
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }
}
