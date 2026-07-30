package h0;

import android.content.Context;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import l0.InterfaceC0655b;

/* renamed from: h0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0456b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5062a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5063b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0655b f5064c;

    /* renamed from: d, reason: collision with root package name */
    public final l2.c f5065d;

    /* renamed from: e, reason: collision with root package name */
    public final List f5066e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5067f;

    /* renamed from: g, reason: collision with root package name */
    public final EnumC0463i f5068g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f5069h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f5070i;
    public final boolean j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f5071k;

    /* renamed from: l, reason: collision with root package name */
    public final Set f5072l;

    /* renamed from: m, reason: collision with root package name */
    public final List f5073m;

    public C0456b(Context context, String str, InterfaceC0655b sqliteOpenHelperFactory, l2.c migrationContainer, List list, boolean z7, EnumC0463i journalMode, Executor queryExecutor, Executor transactionExecutor, boolean z8, boolean z9, Set set, List typeConverters, List autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.f5062a = context;
        this.f5063b = str;
        this.f5064c = sqliteOpenHelperFactory;
        this.f5065d = migrationContainer;
        this.f5066e = list;
        this.f5067f = z7;
        this.f5068g = journalMode;
        this.f5069h = queryExecutor;
        this.f5070i = transactionExecutor;
        this.j = z8;
        this.f5071k = z9;
        this.f5072l = set;
        this.f5073m = typeConverters;
    }
}
