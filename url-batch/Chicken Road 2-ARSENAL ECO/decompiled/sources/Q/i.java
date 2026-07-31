package Q;

import D3.M;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1930a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1931b;

    /* renamed from: f, reason: collision with root package name */
    public Executor f1935f;

    /* renamed from: g, reason: collision with root package name */
    public Executor f1936g;

    /* renamed from: h, reason: collision with root package name */
    public B0.b f1937h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1938i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1941l;

    /* renamed from: p, reason: collision with root package name */
    public HashSet f1945p;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1932c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f1933d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f1934e = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final int f1939j = 1;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1940k = true;

    /* renamed from: m, reason: collision with root package name */
    public final long f1942m = -1;

    /* renamed from: n, reason: collision with root package name */
    public final M f1943n = new M(20);

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f1944o = new LinkedHashSet();

    public i(Context context, String str) {
        this.f1930a = context;
        this.f1931b = str;
    }

    public final void a(R.a... aVarArr) {
        if (this.f1945p == null) {
            this.f1945p = new HashSet();
        }
        for (R.a aVar : aVarArr) {
            HashSet hashSet = this.f1945p;
            kotlin.jvm.internal.i.b(hashSet);
            hashSet.add(Integer.valueOf(aVar.f2049a));
            HashSet hashSet2 = this.f1945p;
            kotlin.jvm.internal.i.b(hashSet2);
            hashSet2.add(Integer.valueOf(aVar.f2050b));
        }
        this.f1943n.s((R.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
    }
}
