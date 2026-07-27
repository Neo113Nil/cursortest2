package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3475a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3476b;

    /* renamed from: f, reason: collision with root package name */
    public Executor f3480f;

    /* renamed from: g, reason: collision with root package name */
    public Executor f3481g;

    /* renamed from: h, reason: collision with root package name */
    public D3.g f3482h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3483i;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3486l;

    /* renamed from: p, reason: collision with root package name */
    public HashSet f3490p;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f3477c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f3478d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3479e = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final int f3484j = 1;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3485k = true;

    /* renamed from: m, reason: collision with root package name */
    public final long f3487m = -1;

    /* renamed from: n, reason: collision with root package name */
    public final P0.b f3488n = new P0.b(1);

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f3489o = new LinkedHashSet();

    public i(Context context, String str) {
        this.f3475a = context;
        this.f3476b = str;
    }

    public final void a(Y.a... aVarArr) {
        if (this.f3490p == null) {
            this.f3490p = new HashSet();
        }
        for (Y.a aVar : aVarArr) {
            HashSet hashSet = this.f3490p;
            kotlin.jvm.internal.i.b(hashSet);
            hashSet.add(Integer.valueOf(aVar.f3659a));
            HashSet hashSet2 = this.f3490p;
            kotlin.jvm.internal.i.b(hashSet2);
            hashSet2.add(Integer.valueOf(aVar.f3660b));
        }
        this.f3488n.a((Y.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
    }
}
