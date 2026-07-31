package l2;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    private int f18546f;

    /* renamed from: h, reason: collision with root package name */
    private int f18548h;

    /* renamed from: o, reason: collision with root package name */
    private float f18555o;

    /* renamed from: a, reason: collision with root package name */
    private String f18541a = "";

    /* renamed from: b, reason: collision with root package name */
    private String f18542b = "";

    /* renamed from: c, reason: collision with root package name */
    private Set<String> f18543c = Collections.emptySet();

    /* renamed from: d, reason: collision with root package name */
    private String f18544d = "";

    /* renamed from: e, reason: collision with root package name */
    private String f18545e = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f18547g = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f18549i = false;

    /* renamed from: j, reason: collision with root package name */
    private int f18550j = -1;

    /* renamed from: k, reason: collision with root package name */
    private int f18551k = -1;

    /* renamed from: l, reason: collision with root package name */
    private int f18552l = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f18553m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f18554n = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f18556p = -1;

    /* renamed from: q, reason: collision with root package name */
    private boolean f18557q = false;

    private static int B(int i7, String str, String str2, int i8) {
        if (str.isEmpty() || i7 == -1) {
            return i7;
        }
        if (str.equals(str2)) {
            return i7 + i8;
        }
        return -1;
    }

    public d A(boolean z6) {
        this.f18551k = z6 ? 1 : 0;
        return this;
    }

    public int a() {
        if (this.f18549i) {
            return this.f18548h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean b() {
        return this.f18557q;
    }

    public int c() {
        if (this.f18547g) {
            return this.f18546f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String d() {
        return this.f18545e;
    }

    public float e() {
        return this.f18555o;
    }

    public int f() {
        return this.f18554n;
    }

    public int g() {
        return this.f18556p;
    }

    public int h(String str, String str2, Set<String> set, String str3) {
        if (this.f18541a.isEmpty() && this.f18542b.isEmpty() && this.f18543c.isEmpty() && this.f18544d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int B = B(B(B(0, this.f18541a, str, 1073741824), this.f18542b, str2, 2), this.f18544d, str3, 4);
        if (B == -1 || !set.containsAll(this.f18543c)) {
            return 0;
        }
        return B + (this.f18543c.size() * 4);
    }

    public int i() {
        int i7 = this.f18552l;
        if (i7 == -1 && this.f18553m == -1) {
            return -1;
        }
        return (i7 == 1 ? 1 : 0) | (this.f18553m == 1 ? 2 : 0);
    }

    public boolean j() {
        return this.f18549i;
    }

    public boolean k() {
        return this.f18547g;
    }

    public boolean l() {
        return this.f18550j == 1;
    }

    public boolean m() {
        return this.f18551k == 1;
    }

    public d n(int i7) {
        this.f18548h = i7;
        this.f18549i = true;
        return this;
    }

    public d o(boolean z6) {
        this.f18552l = z6 ? 1 : 0;
        return this;
    }

    public d p(boolean z6) {
        this.f18557q = z6;
        return this;
    }

    public d q(int i7) {
        this.f18546f = i7;
        this.f18547g = true;
        return this;
    }

    public d r(String str) {
        this.f18545e = str == null ? null : l4.b.e(str);
        return this;
    }

    public d s(float f7) {
        this.f18555o = f7;
        return this;
    }

    public d t(int i7) {
        this.f18554n = i7;
        return this;
    }

    public d u(boolean z6) {
        this.f18553m = z6 ? 1 : 0;
        return this;
    }

    public d v(int i7) {
        this.f18556p = i7;
        return this;
    }

    public void w(String[] strArr) {
        this.f18543c = new HashSet(Arrays.asList(strArr));
    }

    public void x(String str) {
        this.f18541a = str;
    }

    public void y(String str) {
        this.f18542b = str;
    }

    public void z(String str) {
        this.f18544d = str;
    }
}
