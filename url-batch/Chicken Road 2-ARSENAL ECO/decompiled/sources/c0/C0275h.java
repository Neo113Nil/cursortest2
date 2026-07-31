package c0;

import F5.j;
import Q.m;
import java.math.BigInteger;
import k5.C0481k;
import kotlin.jvm.internal.i;
import m1.AbstractC0521b;

/* renamed from: c0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0275h implements Comparable {

    /* renamed from: k, reason: collision with root package name */
    public static final C0275h f3767k;

    /* renamed from: f, reason: collision with root package name */
    public final int f3768f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3769g;

    /* renamed from: h, reason: collision with root package name */
    public final int f3770h;

    /* renamed from: i, reason: collision with root package name */
    public final String f3771i;

    /* renamed from: j, reason: collision with root package name */
    public final C0481k f3772j = AbstractC0521b.x(new m(5, this));

    static {
        new C0275h(0, 0, 0, "");
        f3767k = new C0275h(0, 1, 0, "");
        new C0275h(1, 0, 0, "");
    }

    public C0275h(int i7, int i8, int i9, String str) {
        this.f3768f = i7;
        this.f3769g = i8;
        this.f3770h = i9;
        this.f3771i = str;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0275h other = (C0275h) obj;
        i.e(other, "other");
        Object value = this.f3772j.getValue();
        i.d(value, "<get-bigInteger>(...)");
        Object value2 = other.f3772j.getValue();
        i.d(value2, "<get-bigInteger>(...)");
        return ((BigInteger) value).compareTo((BigInteger) value2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0275h)) {
            return false;
        }
        C0275h c0275h = (C0275h) obj;
        return this.f3768f == c0275h.f3768f && this.f3769g == c0275h.f3769g && this.f3770h == c0275h.f3770h;
    }

    public final int hashCode() {
        return ((((527 + this.f3768f) * 31) + this.f3769g) * 31) + this.f3770h;
    }

    public final String toString() {
        String str;
        String str2 = this.f3771i;
        if (j.T(str2)) {
            str = "";
        } else {
            str = "-" + str2;
        }
        return this.f3768f + '.' + this.f3769g + '.' + this.f3770h + str;
    }
}
