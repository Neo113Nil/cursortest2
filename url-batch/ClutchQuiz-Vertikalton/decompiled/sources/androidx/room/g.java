package androidx.room;

import X.V;
import android.content.Context;
import d0.ExecutorC0090d;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1653a;

    /* renamed from: b, reason: collision with root package name */
    public final A0.h f1654b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1655c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final ExecutorC0090d f1656e;

    /* renamed from: f, reason: collision with root package name */
    public final ExecutorC0090d f1657f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1658g;
    public final LinkedHashSet h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f1659j;

    public g(Context context, O0.e eVar, A0.h hVar, ArrayList arrayList, int i, ExecutorC0090d executorC0090d, ExecutorC0090d executorC0090d2, boolean z2, LinkedHashSet linkedHashSet, ArrayList arrayList2, ArrayList arrayList3) {
        g1.f.e(hVar, "migrationContainer");
        V.g("journalMode", i);
        g1.f.e(executorC0090d, "queryExecutor");
        g1.f.e(executorC0090d2, "transactionExecutor");
        g1.f.e(arrayList2, "typeConverters");
        g1.f.e(arrayList3, "autoMigrationSpecs");
        this.f1653a = context;
        this.f1654b = hVar;
        this.f1655c = arrayList;
        this.d = i;
        this.f1656e = executorC0090d;
        this.f1657f = executorC0090d2;
        this.f1658g = z2;
        this.h = linkedHashSet;
        this.i = arrayList2;
        this.f1659j = arrayList3;
    }
}
