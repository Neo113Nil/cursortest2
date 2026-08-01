package androidx.room;

import G1.AbstractC0001b;
import android.content.Context;
import f0.ExecutorC0120d;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2102a;

    /* renamed from: b, reason: collision with root package name */
    public final C1.d f2103b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2104c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2105d;
    public final ExecutorC0120d e;

    /* renamed from: f, reason: collision with root package name */
    public final ExecutorC0120d f2106f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2107g;

    /* renamed from: h, reason: collision with root package name */
    public final LinkedHashSet f2108h;
    public final ArrayList i;
    public final ArrayList j;

    public j(Context context, N0.e eVar, C1.d dVar, ArrayList arrayList, int i, ExecutorC0120d executorC0120d, ExecutorC0120d executorC0120d2, boolean z2, LinkedHashSet linkedHashSet, ArrayList arrayList2, ArrayList arrayList3) {
        j1.h.e(dVar, "migrationContainer");
        AbstractC0001b.j("journalMode", i);
        j1.h.e(executorC0120d, "queryExecutor");
        j1.h.e(executorC0120d2, "transactionExecutor");
        j1.h.e(arrayList2, "typeConverters");
        j1.h.e(arrayList3, "autoMigrationSpecs");
        this.f2102a = context;
        this.f2103b = dVar;
        this.f2104c = arrayList;
        this.f2105d = i;
        this.e = executorC0120d;
        this.f2106f = executorC0120d2;
        this.f2107g = z2;
        this.f2108h = linkedHashSet;
        this.i = arrayList2;
        this.j = arrayList3;
    }
}
