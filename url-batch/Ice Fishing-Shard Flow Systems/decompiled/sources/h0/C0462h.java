package h0;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import i0.AbstractC0540a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0462h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5088a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5089b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f5090c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5091d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f5092e;

    /* renamed from: f, reason: collision with root package name */
    public Executor f5093f;

    /* renamed from: g, reason: collision with root package name */
    public Executor f5094g;

    /* renamed from: h, reason: collision with root package name */
    public H0.l f5095h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f5096i;
    public final EnumC0463i j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5097k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5098l;

    /* renamed from: m, reason: collision with root package name */
    public final long f5099m;

    /* renamed from: n, reason: collision with root package name */
    public final l2.c f5100n;

    /* renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f5101o;

    /* renamed from: p, reason: collision with root package name */
    public HashSet f5102p;

    public C0462h(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(WorkDatabase.class, "klass");
        this.f5088a = context;
        this.f5089b = str;
        this.f5090c = new ArrayList();
        this.f5091d = new ArrayList();
        this.f5092e = new ArrayList();
        this.j = EnumC0463i.f5103d;
        this.f5097k = true;
        this.f5099m = -1L;
        this.f5100n = new l2.c(26);
        this.f5101o = new LinkedHashSet();
    }

    public final void a(AbstractC0540a... migrations) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        if (this.f5102p == null) {
            this.f5102p = new HashSet();
        }
        for (AbstractC0540a abstractC0540a : migrations) {
            HashSet hashSet = this.f5102p;
            Intrinsics.b(hashSet);
            hashSet.add(Integer.valueOf(abstractC0540a.f5496a));
            HashSet hashSet2 = this.f5102p;
            Intrinsics.b(hashSet2);
            hashSet2.add(Integer.valueOf(abstractC0540a.f5497b));
        }
        this.f5100n.u((AbstractC0540a[]) Arrays.copyOf(migrations, migrations.length));
    }
}
