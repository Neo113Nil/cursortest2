package g;

import G1.AbstractC0001b;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import e0.ExecutorC0105d;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: g.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121b {

    /* renamed from: a, reason: collision with root package name */
    public int f2639a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2640b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f2641c;
    public final Object d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2642e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2643f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2644g;
    public Object h;
    public Object i;

    /* renamed from: j, reason: collision with root package name */
    public Object f2645j;

    public C0121b(Context context, R0.e eVar, A0.c cVar, ArrayList arrayList, int i, ExecutorC0105d executorC0105d, ExecutorC0105d executorC0105d2, boolean z2, LinkedHashSet linkedHashSet, ArrayList arrayList2, ArrayList arrayList3) {
        k1.e.e(cVar, "migrationContainer");
        AbstractC0001b.j("journalMode", i);
        k1.e.e(executorC0105d, "queryExecutor");
        k1.e.e(executorC0105d2, "transactionExecutor");
        k1.e.e(arrayList2, "typeConverters");
        k1.e.e(arrayList3, "autoMigrationSpecs");
        this.f2641c = context;
        this.d = cVar;
        this.f2642e = arrayList;
        this.f2639a = i;
        this.f2643f = executorC0105d;
        this.f2644g = executorC0105d2;
        this.f2640b = z2;
        this.h = linkedHashSet;
        this.i = arrayList2;
        this.f2645j = arrayList3;
    }

    public C0121b(ContextThemeWrapper contextThemeWrapper) {
        this.f2639a = -1;
        this.f2641c = contextThemeWrapper;
        this.d = (LayoutInflater) contextThemeWrapper.getSystemService("layout_inflater");
    }
}
