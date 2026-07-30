package c1;

import java.util.ArrayList;
import t0.AbstractC5051n;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f5673a;

    /* renamed from: b, reason: collision with root package name */
    public final char f5674b;

    /* renamed from: c, reason: collision with root package name */
    public final double f5675c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5676d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5677e;

    public d(ArrayList arrayList, char c4, double d2, String str, String str2) {
        this.f5673a = arrayList;
        this.f5674b = c4;
        this.f5675c = d2;
        this.f5676d = str;
        this.f5677e = str2;
    }

    public static int a(char c4, String str, String str2) {
        return str2.hashCode() + AbstractC5051n.k(c4 * 31, 31, str);
    }

    public final int hashCode() {
        return a(this.f5674b, this.f5677e, this.f5676d);
    }
}
