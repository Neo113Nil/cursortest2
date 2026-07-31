package d0;

import android.os.Build;
import androidx.work.ListenableWorker;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    private UUID f15503a;

    /* renamed from: b, reason: collision with root package name */
    private l0.p f15504b;

    /* renamed from: c, reason: collision with root package name */
    private Set<String> f15505c;

    public static abstract class a<B extends a<?, ?>, W extends u> {

        /* renamed from: c, reason: collision with root package name */
        l0.p f15508c;

        /* renamed from: e, reason: collision with root package name */
        Class<? extends ListenableWorker> f15510e;

        /* renamed from: a, reason: collision with root package name */
        boolean f15506a = false;

        /* renamed from: d, reason: collision with root package name */
        Set<String> f15509d = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        UUID f15507b = UUID.randomUUID();

        a(Class<? extends ListenableWorker> cls) {
            this.f15510e = cls;
            this.f15508c = new l0.p(this.f15507b.toString(), cls.getName());
            a(cls.getName());
        }

        public final B a(String str) {
            this.f15509d.add(str);
            return d();
        }

        public final W b() {
            W c7 = c();
            b bVar = this.f15508c.f18486j;
            int i7 = Build.VERSION.SDK_INT;
            boolean z6 = (i7 >= 24 && bVar.e()) || bVar.f() || bVar.g() || (i7 >= 23 && bVar.h());
            if (this.f15508c.f18493q && z6) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            this.f15507b = UUID.randomUUID();
            l0.p pVar = new l0.p(this.f15508c);
            this.f15508c = pVar;
            pVar.f18477a = this.f15507b.toString();
            return c7;
        }

        abstract W c();

        abstract B d();

        public final B e(b bVar) {
            this.f15508c.f18486j = bVar;
            return d();
        }

        public final B f(androidx.work.b bVar) {
            this.f15508c.f18481e = bVar;
            return d();
        }
    }

    protected u(UUID uuid, l0.p pVar, Set<String> set) {
        this.f15503a = uuid;
        this.f15504b = pVar;
        this.f15505c = set;
    }

    public String a() {
        return this.f15503a.toString();
    }

    public Set<String> b() {
        return this.f15505c;
    }

    public l0.p c() {
        return this.f15504b;
    }
}
