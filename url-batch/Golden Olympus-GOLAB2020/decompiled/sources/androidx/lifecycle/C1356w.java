package androidx.lifecycle;

import androidx.lifecycle.AbstractC1346l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.C3249a;
import l.C3250b;
import r2.AbstractC3398h;

/* renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1356w extends AbstractC1346l {

    /* renamed from: k, reason: collision with root package name */
    public static final a f12673k = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12674b;

    /* renamed from: c, reason: collision with root package name */
    private C3249a f12675c;

    /* renamed from: d, reason: collision with root package name */
    private AbstractC1346l.b f12676d;

    /* renamed from: e, reason: collision with root package name */
    private final WeakReference f12677e;

    /* renamed from: f, reason: collision with root package name */
    private int f12678f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f12679g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f12680h;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f12681i;

    /* renamed from: j, reason: collision with root package name */
    private final r2.u f12682j;

    /* renamed from: androidx.lifecycle.w$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC1346l.b a(AbstractC1346l.b state1, AbstractC1346l.b bVar) {
            Intrinsics.checkNotNullParameter(state1, "state1");
            return (bVar == null || bVar.compareTo(state1) >= 0) ? state1 : bVar;
        }

        private a() {
        }
    }

    /* renamed from: androidx.lifecycle.w$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private AbstractC1346l.b f12683a;

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC1351q f12684b;

        public b(InterfaceC1353t interfaceC1353t, AbstractC1346l.b initialState) {
            Intrinsics.checkNotNullParameter(initialState, "initialState");
            Intrinsics.checkNotNull(interfaceC1353t);
            this.f12684b = C1357x.f(interfaceC1353t);
            this.f12683a = initialState;
        }

        public final void a(InterfaceC1354u interfaceC1354u, AbstractC1346l.a event) {
            Intrinsics.checkNotNullParameter(event, "event");
            AbstractC1346l.b e4 = event.e();
            this.f12683a = C1356w.f12673k.a(this.f12683a, e4);
            InterfaceC1351q interfaceC1351q = this.f12684b;
            Intrinsics.checkNotNull(interfaceC1354u);
            interfaceC1351q.onStateChanged(interfaceC1354u, event);
            this.f12683a = e4;
        }

        public final AbstractC1346l.b b() {
            return this.f12683a;
        }
    }

    private C1356w(InterfaceC1354u interfaceC1354u, boolean z4) {
        this.f12674b = z4;
        this.f12675c = new C3249a();
        AbstractC1346l.b bVar = AbstractC1346l.b.INITIALIZED;
        this.f12676d = bVar;
        this.f12681i = new ArrayList();
        this.f12677e = new WeakReference(interfaceC1354u);
        this.f12682j = r2.I.a(bVar);
    }

    private final void c(InterfaceC1354u interfaceC1354u) {
        Iterator descendingIterator = this.f12675c.descendingIterator();
        Intrinsics.checkNotNullExpressionValue(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.f12680h) {
            Map.Entry entry = (Map.Entry) descendingIterator.next();
            Intrinsics.checkNotNullExpressionValue(entry, "next()");
            InterfaceC1353t interfaceC1353t = (InterfaceC1353t) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f12676d) > 0 && !this.f12680h && this.f12675c.contains(interfaceC1353t)) {
                AbstractC1346l.a a4 = AbstractC1346l.a.Companion.a(bVar.b());
                if (a4 == null) {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
                k(a4.e());
                bVar.a(interfaceC1354u, a4);
                j();
            }
        }
    }

    private final AbstractC1346l.b d(InterfaceC1353t interfaceC1353t) {
        b bVar;
        Map.Entry j4 = this.f12675c.j(interfaceC1353t);
        AbstractC1346l.b bVar2 = null;
        AbstractC1346l.b b4 = (j4 == null || (bVar = (b) j4.getValue()) == null) ? null : bVar.b();
        if (!this.f12681i.isEmpty()) {
            bVar2 = (AbstractC1346l.b) this.f12681i.get(r0.size() - 1);
        }
        a aVar = f12673k;
        return aVar.a(aVar.a(this.f12676d, b4), bVar2);
    }

    private final void e(String str) {
        if (!this.f12674b || k.c.f().b()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    private final void f(InterfaceC1354u interfaceC1354u) {
        C3250b.d e4 = this.f12675c.e();
        Intrinsics.checkNotNullExpressionValue(e4, "observerMap.iteratorWithAdditions()");
        while (e4.hasNext() && !this.f12680h) {
            Map.Entry entry = (Map.Entry) e4.next();
            InterfaceC1353t interfaceC1353t = (InterfaceC1353t) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f12676d) < 0 && !this.f12680h && this.f12675c.contains(interfaceC1353t)) {
                k(bVar.b());
                AbstractC1346l.a b4 = AbstractC1346l.a.Companion.b(bVar.b());
                if (b4 == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(interfaceC1354u, b4);
                j();
            }
        }
    }

    private final boolean h() {
        if (this.f12675c.size() == 0) {
            return true;
        }
        Map.Entry b4 = this.f12675c.b();
        Intrinsics.checkNotNull(b4);
        AbstractC1346l.b b5 = ((b) b4.getValue()).b();
        Map.Entry f4 = this.f12675c.f();
        Intrinsics.checkNotNull(f4);
        AbstractC1346l.b b6 = ((b) f4.getValue()).b();
        return b5 == b6 && this.f12676d == b6;
    }

    private final void i(AbstractC1346l.b bVar) {
        AbstractC1346l.b bVar2 = this.f12676d;
        if (bVar2 == bVar) {
            return;
        }
        if (bVar2 == AbstractC1346l.b.INITIALIZED && bVar == AbstractC1346l.b.DESTROYED) {
            throw new IllegalStateException(("no event down from " + this.f12676d + " in component " + this.f12677e.get()).toString());
        }
        this.f12676d = bVar;
        if (this.f12679g || this.f12678f != 0) {
            this.f12680h = true;
            return;
        }
        this.f12679g = true;
        m();
        this.f12679g = false;
        if (this.f12676d == AbstractC1346l.b.DESTROYED) {
            this.f12675c = new C3249a();
        }
    }

    private final void j() {
        this.f12681i.remove(r0.size() - 1);
    }

    private final void k(AbstractC1346l.b bVar) {
        this.f12681i.add(bVar);
    }

    private final void m() {
        InterfaceC1354u interfaceC1354u = (InterfaceC1354u) this.f12677e.get();
        if (interfaceC1354u == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!h()) {
            this.f12680h = false;
            AbstractC1346l.b bVar = this.f12676d;
            Map.Entry b4 = this.f12675c.b();
            Intrinsics.checkNotNull(b4);
            if (bVar.compareTo(((b) b4.getValue()).b()) < 0) {
                c(interfaceC1354u);
            }
            Map.Entry f4 = this.f12675c.f();
            if (!this.f12680h && f4 != null && this.f12676d.compareTo(((b) f4.getValue()).b()) > 0) {
                f(interfaceC1354u);
            }
        }
        this.f12680h = false;
        this.f12682j.setValue(getCurrentState());
    }

    @Override // androidx.lifecycle.AbstractC1346l
    public void addObserver(InterfaceC1353t observer) {
        InterfaceC1354u interfaceC1354u;
        Intrinsics.checkNotNullParameter(observer, "observer");
        e("addObserver");
        AbstractC1346l.b bVar = this.f12676d;
        AbstractC1346l.b bVar2 = AbstractC1346l.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC1346l.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (((b) this.f12675c.h(observer, bVar3)) == null && (interfaceC1354u = (InterfaceC1354u) this.f12677e.get()) != null) {
            boolean z4 = this.f12678f != 0 || this.f12679g;
            AbstractC1346l.b d4 = d(observer);
            this.f12678f++;
            while (bVar3.b().compareTo(d4) < 0 && this.f12675c.contains(observer)) {
                k(bVar3.b());
                AbstractC1346l.a b4 = AbstractC1346l.a.Companion.b(bVar3.b());
                if (b4 == null) {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(interfaceC1354u, b4);
                j();
                d4 = d(observer);
            }
            if (!z4) {
                m();
            }
            this.f12678f--;
        }
    }

    public void g(AbstractC1346l.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        e("handleLifecycleEvent");
        i(event.e());
    }

    @Override // androidx.lifecycle.AbstractC1346l
    public AbstractC1346l.b getCurrentState() {
        return this.f12676d;
    }

    @Override // androidx.lifecycle.AbstractC1346l
    public r2.G getCurrentStateFlow() {
        return AbstractC3398h.a(this.f12682j);
    }

    public void l(AbstractC1346l.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        e("setCurrentState");
        i(state);
    }

    @Override // androidx.lifecycle.AbstractC1346l
    public void removeObserver(InterfaceC1353t observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        e("removeObserver");
        this.f12675c.i(observer);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1356w(InterfaceC1354u provider) {
        this(provider, true);
        Intrinsics.checkNotNullParameter(provider, "provider");
    }
}
