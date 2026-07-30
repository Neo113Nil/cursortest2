package u0;

import android.content.Context;
import com.google.android.gms.internal.ads.CL;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import y0.InterfaceC5220a;

/* renamed from: u0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5091b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f41001a;

    /* renamed from: b, reason: collision with root package name */
    public final String f41002b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC5220a f41003c;

    /* renamed from: d, reason: collision with root package name */
    public final h8.d f41004d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f41005e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f41006f;

    /* renamed from: g, reason: collision with root package name */
    public final int f41007g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f41008h;
    public final Executor i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f41009j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f41010k;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashSet f41011l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f41012m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f41013n;

    public C5091b(Context context, String str, InterfaceC5220a interfaceC5220a, h8.d migrationContainer, ArrayList arrayList, boolean z8, int i, Executor queryExecutor, Executor transactionExecutor, boolean z9, boolean z10, LinkedHashSet linkedHashSet, ArrayList typeConverters, ArrayList autoMigrationSpecs) {
        kotlin.jvm.internal.h.e(migrationContainer, "migrationContainer");
        CL.o(i, "journalMode");
        kotlin.jvm.internal.h.e(queryExecutor, "queryExecutor");
        kotlin.jvm.internal.h.e(transactionExecutor, "transactionExecutor");
        kotlin.jvm.internal.h.e(typeConverters, "typeConverters");
        kotlin.jvm.internal.h.e(autoMigrationSpecs, "autoMigrationSpecs");
        this.f41001a = context;
        this.f41002b = str;
        this.f41003c = interfaceC5220a;
        this.f41004d = migrationContainer;
        this.f41005e = arrayList;
        this.f41006f = z8;
        this.f41007g = i;
        this.f41008h = queryExecutor;
        this.i = transactionExecutor;
        this.f41009j = z9;
        this.f41010k = z10;
        this.f41011l = linkedHashSet;
        this.f41012m = typeConverters;
        this.f41013n = autoMigrationSpecs;
    }
}
