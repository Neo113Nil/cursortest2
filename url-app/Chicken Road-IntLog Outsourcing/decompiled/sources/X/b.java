package X;

import android.content.Context;
import b0.InterfaceC0260a;
import b2.AbstractC0279e;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3444a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3445b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0260a f3446c;

    /* renamed from: d, reason: collision with root package name */
    public final P0.b f3447d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f3448e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3449f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3450g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f3451h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f3452i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f3453j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3454k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f3455l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f3456m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f3457n;

    public b(Context context, String str, InterfaceC0260a interfaceC0260a, P0.b migrationContainer, ArrayList arrayList, boolean z, int i2, Executor queryExecutor, Executor transactionExecutor, boolean z5, boolean z6, LinkedHashSet linkedHashSet, ArrayList typeConverters, ArrayList autoMigrationSpecs) {
        kotlin.jvm.internal.i.e(migrationContainer, "migrationContainer");
        AbstractC0279e.k(i2, "journalMode");
        kotlin.jvm.internal.i.e(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.i.e(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.i.e(typeConverters, "typeConverters");
        kotlin.jvm.internal.i.e(autoMigrationSpecs, "autoMigrationSpecs");
        this.f3444a = context;
        this.f3445b = str;
        this.f3446c = interfaceC0260a;
        this.f3447d = migrationContainer;
        this.f3448e = arrayList;
        this.f3449f = z;
        this.f3450g = i2;
        this.f3451h = queryExecutor;
        this.f3452i = transactionExecutor;
        this.f3453j = z5;
        this.f3454k = z6;
        this.f3455l = linkedHashSet;
        this.f3456m = typeConverters;
        this.f3457n = autoMigrationSpecs;
    }
}
