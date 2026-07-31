package Q;

import D3.M;
import W4.o;
import android.content.Context;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1902a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1903b;

    /* renamed from: c, reason: collision with root package name */
    public final U.b f1904c;

    /* renamed from: d, reason: collision with root package name */
    public final M f1905d;

    /* renamed from: e, reason: collision with root package name */
    public final List f1906e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1907f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1908g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f1909h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f1910i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f1911j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1912k;

    /* renamed from: l, reason: collision with root package name */
    public final Set f1913l;

    public b(Context context, String str, U.b bVar, M migrationContainer, List list, boolean z5, int i7, Executor queryExecutor, Executor transactionExecutor, boolean z6, boolean z7, Set set, List typeConverters, List autoMigrationSpecs) {
        kotlin.jvm.internal.i.e(migrationContainer, "migrationContainer");
        o.f("journalMode", i7);
        kotlin.jvm.internal.i.e(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.i.e(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.i.e(typeConverters, "typeConverters");
        kotlin.jvm.internal.i.e(autoMigrationSpecs, "autoMigrationSpecs");
        this.f1902a = context;
        this.f1903b = str;
        this.f1904c = bVar;
        this.f1905d = migrationContainer;
        this.f1906e = list;
        this.f1907f = z5;
        this.f1908g = i7;
        this.f1909h = queryExecutor;
        this.f1910i = transactionExecutor;
        this.f1911j = z6;
        this.f1912k = z7;
        this.f1913l = set;
    }
}
