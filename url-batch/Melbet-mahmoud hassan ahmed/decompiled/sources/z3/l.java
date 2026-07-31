package z3;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class l implements l3.b {

    /* renamed from: e, reason: collision with root package name */
    private static l3.b f23695e;

    /* renamed from: a, reason: collision with root package name */
    private final Context f23696a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f23697b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f23698c;

    /* renamed from: d, reason: collision with root package name */
    private final ExecutorService f23699d;

    l(Context context) {
        this.f23697b = false;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f23698c = newSingleThreadScheduledExecutor;
        this.f23699d = Executors.newSingleThreadExecutor();
        this.f23696a = context;
        if (this.f23697b) {
            return;
        }
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(new j(this, null), 0L, 86400L, TimeUnit.SECONDS);
        this.f23697b = true;
    }

    static synchronized l3.b d(Context context) {
        l3.b bVar;
        synchronized (l.class) {
            r3.o.j(context, "Context must not be null");
            if (f23695e == null) {
                f23695e = new l(context.getApplicationContext());
            }
            bVar = f23695e;
        }
        return bVar;
    }

    protected static final void f(Context context) {
        if (!g(context).edit().remove("app_set_id").commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            Log.e("AppSet", valueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(valueOf) : new String("Failed to clear app set ID generated for App "));
        }
        if (g(context).edit().remove("app_set_id_last_used_time").commit()) {
            return;
        }
        String valueOf2 = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
    }

    private static final SharedPreferences g(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    private static final void h(Context context) {
        if (g(context).edit().putLong("app_set_id_last_used_time", v3.g.d().b()).commit()) {
            return;
        }
        String valueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(valueOf) : new String("Failed to store app set ID last used time for App "));
        throw new k("Failed to store the app set ID last used time.");
    }

    @Override // l3.b
    public final j4.h<l3.c> a() {
        final j4.i iVar = new j4.i();
        this.f23699d.execute(new Runnable() { // from class: z3.h
            @Override // java.lang.Runnable
            public final void run() {
                l.this.e(iVar);
            }
        });
        return iVar.a();
    }

    protected final long b() {
        long j7 = g(this.f23696a).getLong("app_set_id_last_used_time", -1L);
        if (j7 != -1) {
            return j7 + 33696000000L;
        }
        return -1L;
    }

    final /* synthetic */ void e(j4.i iVar) {
        String string = g(this.f23696a).getString("app_set_id", null);
        long b7 = b();
        if (string == null || v3.g.d().b() > b7) {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.f23696a;
                if (!g(context).edit().putString("app_set_id", string).commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(valueOf) : new String("Failed to store app set ID generated for App "));
                    throw new k("Failed to store the app set ID.");
                }
                h(context);
                Context context2 = this.f23696a;
                if (!g(context2).edit().putLong("app_set_id_creation_time", v3.g.d().b()).commit()) {
                    String valueOf2 = String.valueOf(context2.getPackageName());
                    Log.e("AppSet", valueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(valueOf2) : new String("Failed to store app set ID creation time for App "));
                    throw new k("Failed to store the app set ID creation time.");
                }
            } catch (k e7) {
                iVar.b(e7);
                return;
            }
        } else {
            try {
                h(this.f23696a);
            } catch (k e8) {
                iVar.b(e8);
                return;
            }
        }
        iVar.c(new l3.c(string, 1));
    }
}
