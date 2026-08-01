package n4;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: b, reason: collision with root package name */
    public static final d f7044b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f7045c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f7046d;

    /* renamed from: e, reason: collision with root package name */
    public static final d f7047e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f7048f;
    public static final c g;

    /* renamed from: h, reason: collision with root package name */
    public static final d f7049h;

    /* renamed from: i, reason: collision with root package name */
    public static final c f7050i;
    public static final c j;

    /* renamed from: k, reason: collision with root package name */
    public static final d f7051k;

    /* renamed from: l, reason: collision with root package name */
    public static final c f7052l;

    /* renamed from: m, reason: collision with root package name */
    public static final c f7053m;

    /* renamed from: n, reason: collision with root package name */
    public static final d f7054n;

    /* renamed from: o, reason: collision with root package name */
    public static final c f7055o;

    /* renamed from: p, reason: collision with root package name */
    public static final c f7056p;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7057a;

    static {
        boolean z10 = false;
        f7044b = new d(2, z10);
        boolean z11 = true;
        f7045c = new c(4, z11);
        f7046d = new c(5, z11);
        f7047e = new d(3, z10);
        f7048f = new c(6, z11);
        g = new c(7, z11);
        f7049h = new d(1, z10);
        f7050i = new c(2, z11);
        j = new c(3, z11);
        int i3 = 0;
        f7051k = new d(i3, z10);
        f7052l = new c(i3, z11);
        f7053m = new c(1, z11);
        f7054n = new d(4, z11);
        f7055o = new c(8, z11);
        f7056p = new c(9, z11);
    }

    public f0(boolean z10) {
        this.f7057a = z10;
    }

    public abstract Object a(String str, Bundle bundle);

    public abstract String b();

    public Object c(Object obj, String str) {
        return d(str);
    }

    public abstract Object d(String str);

    public abstract void e(Bundle bundle, String str, Object obj);

    public String f(Object obj) {
        return String.valueOf(obj);
    }

    public boolean g(Object obj, Object obj2) {
        return Intrinsics.a(obj, obj2);
    }

    public final String toString() {
        return b();
    }
}
