package o2;

import A.AbstractC0017m;
import j2.AbstractC0720j;

/* renamed from: o2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0924c implements Comparable {

    /* renamed from: e, reason: collision with root package name */
    public static final C0924c f8917e = new C0924c("[MIN_NAME]");

    /* renamed from: i, reason: collision with root package name */
    public static final C0924c f8918i = new C0924c("[MAX_KEY]");

    /* renamed from: j, reason: collision with root package name */
    public static final C0924c f8919j = new C0924c(".priority");

    /* renamed from: d, reason: collision with root package name */
    public final String f8920d;

    public C0924c(String str) {
        this.f8920d = str;
    }

    public static C0924c c(String str) {
        Integer g4 = AbstractC0720j.g(str);
        if (g4 != null) {
            return new C0923b(str, g4.intValue());
        }
        if (str.equals(".priority")) {
            return f8919j;
        }
        AbstractC0720j.c(!str.contains("/"));
        return new C0924c(str);
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C0924c c0924c) {
        int i2 = 0;
        if (this == c0924c) {
            return 0;
        }
        String str = this.f8920d;
        if (str.equals("[MIN_NAME]") || c0924c.f8920d.equals("[MAX_KEY]")) {
            return -1;
        }
        String str2 = c0924c.f8920d;
        if (str2.equals("[MIN_NAME]") || str.equals("[MAX_KEY]")) {
            return 1;
        }
        if (!(this instanceof C0923b)) {
            if (c0924c instanceof C0923b) {
                return 1;
            }
            return str.compareTo(str2);
        }
        if (!(c0924c instanceof C0923b)) {
            return -1;
        }
        int e4 = c0924c.e();
        char[] cArr = AbstractC0720j.f7166a;
        int i4 = ((C0923b) this).f8916k;
        int i5 = i4 < e4 ? -1 : i4 == e4 ? 0 : 1;
        if (i5 != 0) {
            return i5;
        }
        int length = str.length();
        int length2 = str2.length();
        if (length < length2) {
            i2 = -1;
        } else if (length != length2) {
            i2 = 1;
        }
        return i2;
    }

    public int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0924c)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return this.f8920d.equals(((C0924c) obj).f8920d);
    }

    public final int hashCode() {
        return this.f8920d.hashCode();
    }

    public String toString() {
        return AbstractC0017m.n(new StringBuilder("ChildKey(\""), this.f8920d, "\")");
    }
}
