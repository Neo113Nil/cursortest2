package U1;

import P.C0137b;
import S.k;
import S.l;
import S.m;
import android.content.Context;
import android.os.Process;
import android.util.Log;
import java.util.LinkedHashSet;
import kotlin.collections.q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f2712e;

    public /* synthetic */ a(h hVar, int i2) {
        this.f2711d = i2;
        this.f2712e = hVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f2711d) {
            case 0:
                C0137b ex = (C0137b) obj;
                Intrinsics.checkNotNullParameter(ex, "ex");
                Log.w(E.a(h.class).b(), "CorruptionException in " + this.f2712e.f2731a + " DataStore running in process " + Process.myPid(), ex);
                return new T.b(true);
            default:
                Context context = (Context) obj;
                Intrinsics.checkNotNullParameter(context, "it");
                String sharedPreferencesName = this.f2712e.f2731a;
                LinkedHashSet keysToMigrate = m.f2457a;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
                Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
                return q.b(new R.c(context, sharedPreferencesName, R.d.f2367a, new l(keysToMigrate, null), new k(3, null)));
        }
    }
}
