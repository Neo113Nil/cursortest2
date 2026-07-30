package h0;

import P.V;
import R5.q;
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: h0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0467m {

    /* renamed from: a, reason: collision with root package name */
    public final WorkDatabase f5119a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f5120b;

    /* renamed from: c, reason: collision with root package name */
    public final q f5121c;

    public AbstractC0467m(WorkDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f5119a = database;
        this.f5120b = new AtomicBoolean(false);
        this.f5121c = R5.i.b(new V(3, this));
    }

    public final m0.j a() {
        this.f5119a.a();
        return this.f5120b.compareAndSet(false, true) ? (m0.j) this.f5121c.getValue() : b();
    }

    public final m0.j b() {
        String sql = c();
        WorkDatabase workDatabase = this.f5119a;
        workDatabase.getClass();
        Intrinsics.checkNotNullParameter(sql, "sql");
        workDatabase.a();
        workDatabase.b();
        return workDatabase.h().C().g(sql);
    }

    public abstract String c();

    public final void d(m0.j statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        if (statement == ((m0.j) this.f5121c.getValue())) {
            this.f5120b.set(false);
        }
    }
}
