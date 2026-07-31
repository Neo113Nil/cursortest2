package androidx.lifecycle;

import androidx.lifecycle.AbstractC1346l;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import r2.AbstractC3398h;

/* renamed from: androidx.lifecycle.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1346l {
    private AtomicReference<Object> internalScopeRef = new AtomicReference<>();

    /* renamed from: androidx.lifecycle.l$a */
    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static final C0112a Companion = new C0112a(null);

        /* renamed from: androidx.lifecycle.l$a$a, reason: collision with other inner class name */
        public static final class C0112a {

            /* renamed from: androidx.lifecycle.l$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0113a {

                /* renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f12658a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.CREATED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.RESUMED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.DESTROYED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.INITIALIZED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f12658a = iArr;
                }
            }

            public /* synthetic */ C0112a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i4 = C0113a.f12658a[state.ordinal()];
                if (i4 == 1) {
                    return a.ON_DESTROY;
                }
                if (i4 == 2) {
                    return a.ON_STOP;
                }
                if (i4 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            public final a b(b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i4 = C0113a.f12658a[state.ordinal()];
                if (i4 == 1) {
                    return a.ON_START;
                }
                if (i4 == 2) {
                    return a.ON_RESUME;
                }
                if (i4 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            public final a c(b state) {
                Intrinsics.checkNotNullParameter(state, "state");
                int i4 = C0113a.f12658a[state.ordinal()];
                if (i4 == 1) {
                    return a.ON_CREATE;
                }
                if (i4 == 2) {
                    return a.ON_START;
                }
                if (i4 != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }

            private C0112a() {
            }
        }

        /* renamed from: androidx.lifecycle.l$a$b */
        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f12659a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f12659a = iArr;
            }
        }

        public static final a d(b bVar) {
            return Companion.a(bVar);
        }

        public static final a f(b bVar) {
            return Companion.c(bVar);
        }

        public final b e() {
            switch (b.f12659a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* renamed from: androidx.lifecycle.l$b */
    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean d(b state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return compareTo(state) >= 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(r2.u mutableStateFlow, InterfaceC1354u interfaceC1354u, a event) {
        Intrinsics.checkNotNullParameter(mutableStateFlow, "$mutableStateFlow");
        Intrinsics.checkNotNullParameter(interfaceC1354u, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        mutableStateFlow.setValue(event.e());
    }

    public abstract void addObserver(InterfaceC1353t interfaceC1353t);

    public abstract b getCurrentState();

    public r2.G getCurrentStateFlow() {
        final r2.u a4 = r2.I.a(getCurrentState());
        addObserver(new InterfaceC1351q() { // from class: androidx.lifecycle.k
            @Override // androidx.lifecycle.InterfaceC1351q
            public final void onStateChanged(InterfaceC1354u interfaceC1354u, AbstractC1346l.a aVar) {
                AbstractC1346l.b(r2.u.this, interfaceC1354u, aVar);
            }
        });
        return AbstractC3398h.a(a4);
    }

    public final AtomicReference<Object> getInternalScopeRef() {
        return this.internalScopeRef;
    }

    public abstract void removeObserver(InterfaceC1353t interfaceC1353t);

    public final void setInternalScopeRef(AtomicReference<Object> atomicReference) {
        Intrinsics.checkNotNullParameter(atomicReference, "<set-?>");
        this.internalScopeRef = atomicReference;
    }
}
