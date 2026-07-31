package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.h;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class d {

    /* renamed from: h, reason: collision with root package name */
    private static final Executor f13004h = new c();

    /* renamed from: a, reason: collision with root package name */
    private final n f13005a;

    /* renamed from: b, reason: collision with root package name */
    final androidx.recyclerview.widget.c f13006b;

    /* renamed from: c, reason: collision with root package name */
    Executor f13007c;

    /* renamed from: d, reason: collision with root package name */
    private final List f13008d;

    /* renamed from: e, reason: collision with root package name */
    private List f13009e;

    /* renamed from: f, reason: collision with root package name */
    private List f13010f;

    /* renamed from: g, reason: collision with root package name */
    int f13011g;

    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f13012b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f13013c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f13014d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Runnable f13015e;

        /* renamed from: androidx.recyclerview.widget.d$a$a, reason: collision with other inner class name */
        class C0122a extends h.b {
            C0122a() {
            }

            @Override // androidx.recyclerview.widget.h.b
            public boolean areContentsTheSame(int i4, int i5) {
                Object obj = a.this.f13012b.get(i4);
                Object obj2 = a.this.f13013c.get(i5);
                if (obj != null && obj2 != null) {
                    return d.this.f13006b.b().areContentsTheSame(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            @Override // androidx.recyclerview.widget.h.b
            public boolean areItemsTheSame(int i4, int i5) {
                Object obj = a.this.f13012b.get(i4);
                Object obj2 = a.this.f13013c.get(i5);
                return (obj == null || obj2 == null) ? obj == null && obj2 == null : d.this.f13006b.b().areItemsTheSame(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.h.b
            public Object getChangePayload(int i4, int i5) {
                Object obj = a.this.f13012b.get(i4);
                Object obj2 = a.this.f13013c.get(i5);
                if (obj == null || obj2 == null) {
                    throw new AssertionError();
                }
                return d.this.f13006b.b().getChangePayload(obj, obj2);
            }

            @Override // androidx.recyclerview.widget.h.b
            public int getNewListSize() {
                return a.this.f13013c.size();
            }

            @Override // androidx.recyclerview.widget.h.b
            public int getOldListSize() {
                return a.this.f13012b.size();
            }
        }

        class b implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h.e f13018b;

            b(h.e eVar) {
                this.f13018b = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                d dVar = d.this;
                if (dVar.f13011g == aVar.f13014d) {
                    dVar.c(aVar.f13013c, this.f13018b, aVar.f13015e);
                }
            }
        }

        a(List list, List list2, int i4, Runnable runnable) {
            this.f13012b = list;
            this.f13013c = list2;
            this.f13014d = i4;
            this.f13015e = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f13007c.execute(new b(h.b(new C0122a())));
        }
    }

    public interface b {
        void a(List list, List list2);
    }

    private static class c implements Executor {

        /* renamed from: b, reason: collision with root package name */
        final Handler f13020b = new Handler(Looper.getMainLooper());

        c() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f13020b.post(runnable);
        }
    }

    public d(RecyclerView.h hVar, h.f fVar) {
        this(new androidx.recyclerview.widget.b(hVar), new c.a(fVar).a());
    }

    private void d(List list, Runnable runnable) {
        Iterator it = this.f13008d.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(list, this.f13010f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(b bVar) {
        this.f13008d.add(bVar);
    }

    public List b() {
        return this.f13010f;
    }

    void c(List list, h.e eVar, Runnable runnable) {
        List list2 = this.f13010f;
        this.f13009e = list;
        this.f13010f = Collections.unmodifiableList(list);
        eVar.b(this.f13005a);
        d(list2, runnable);
    }

    public void e(List list) {
        f(list, null);
    }

    public void f(List list, Runnable runnable) {
        int i4 = this.f13011g + 1;
        this.f13011g = i4;
        List list2 = this.f13009e;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List list3 = this.f13010f;
        if (list == null) {
            int size = list2.size();
            this.f13009e = null;
            this.f13010f = Collections.EMPTY_LIST;
            this.f13005a.onRemoved(0, size);
            d(list3, runnable);
            return;
        }
        if (list2 != null) {
            this.f13006b.a().execute(new a(list2, list, i4, runnable));
            return;
        }
        this.f13009e = list;
        this.f13010f = Collections.unmodifiableList(list);
        this.f13005a.onInserted(0, list.size());
        d(list3, runnable);
    }

    public d(n nVar, androidx.recyclerview.widget.c cVar) {
        this.f13008d = new CopyOnWriteArrayList();
        this.f13010f = Collections.EMPTY_LIST;
        this.f13005a = nVar;
        this.f13006b = cVar;
        if (cVar.c() != null) {
            this.f13007c = cVar.c();
        } else {
            this.f13007c = f13004h;
        }
    }
}
