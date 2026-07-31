package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.work.impl.utils.futures.d;
import d0.e;
import d0.v;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class ListenableWorker {

    /* renamed from: f, reason: collision with root package name */
    private Context f1396f;

    /* renamed from: g, reason: collision with root package name */
    private WorkerParameters f1397g;

    /* renamed from: h, reason: collision with root package name */
    private volatile boolean f1398h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1399i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f1400j;

    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a, reason: collision with other inner class name */
        public static final class C0028a extends a {

            /* renamed from: a, reason: collision with root package name */
            private final androidx.work.b f1401a;

            public C0028a() {
                this(androidx.work.b.f1446c);
            }

            public C0028a(androidx.work.b bVar) {
                this.f1401a = bVar;
            }

            public androidx.work.b e() {
                return this.f1401a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0028a.class != obj.getClass()) {
                    return false;
                }
                return this.f1401a.equals(((C0028a) obj).f1401a);
            }

            public int hashCode() {
                return (C0028a.class.getName().hashCode() * 31) + this.f1401a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f1401a + '}';
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        public static final class c extends a {

            /* renamed from: a, reason: collision with root package name */
            private final androidx.work.b f1402a;

            public c() {
                this(androidx.work.b.f1446c);
            }

            public c(androidx.work.b bVar) {
                this.f1402a = bVar;
            }

            public androidx.work.b e() {
                return this.f1402a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.f1402a.equals(((c) obj).f1402a);
            }

            public int hashCode() {
                return (c.class.getName().hashCode() * 31) + this.f1402a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f1402a + '}';
            }
        }

        a() {
        }

        public static a a() {
            return new C0028a();
        }

        public static a b() {
            return new b();
        }

        public static a c() {
            return new c();
        }

        public static a d(androidx.work.b bVar) {
            return new c(bVar);
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.f1396f = context;
        this.f1397g = workerParameters;
    }

    public final Context getApplicationContext() {
        return this.f1396f;
    }

    public Executor getBackgroundExecutor() {
        return this.f1397g.a();
    }

    public p4.a<e> getForegroundInfoAsync() {
        d u6 = d.u();
        u6.r(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return u6;
    }

    public final UUID getId() {
        return this.f1397g.c();
    }

    public final b getInputData() {
        return this.f1397g.d();
    }

    public final Network getNetwork() {
        return this.f1397g.e();
    }

    public final int getRunAttemptCount() {
        return this.f1397g.g();
    }

    public final Set<String> getTags() {
        return this.f1397g.h();
    }

    public n0.a getTaskExecutor() {
        return this.f1397g.i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.f1397g.j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.f1397g.k();
    }

    public v getWorkerFactory() {
        return this.f1397g.l();
    }

    public boolean isRunInForeground() {
        return this.f1400j;
    }

    public final boolean isStopped() {
        return this.f1398h;
    }

    public final boolean isUsed() {
        return this.f1399i;
    }

    public void onStopped() {
    }

    public final p4.a<Void> setForegroundAsync(e eVar) {
        this.f1400j = true;
        return this.f1397g.b().a(getApplicationContext(), getId(), eVar);
    }

    public p4.a<Void> setProgressAsync(b bVar) {
        return this.f1397g.f().a(getApplicationContext(), getId(), bVar);
    }

    public void setRunInForeground(boolean z6) {
        this.f1400j = z6;
    }

    public final void setUsed() {
        this.f1399i = true;
    }

    public abstract p4.a<a> startWork();

    public final void stop() {
        this.f1398h = true;
        onStopped();
    }
}
