package androidx.lifecycle;

import androidx.lifecycle.AbstractC1346l;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1340f implements InterfaceC1351q {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1339e f12640b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1351q f12641c;

    /* renamed from: androidx.lifecycle.f$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12642a;

        static {
            int[] iArr = new int[AbstractC1346l.a.values().length];
            try {
                iArr[AbstractC1346l.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1346l.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC1346l.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC1346l.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC1346l.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC1346l.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC1346l.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f12642a = iArr;
        }
    }

    public C1340f(InterfaceC1339e defaultLifecycleObserver, InterfaceC1351q interfaceC1351q) {
        Intrinsics.checkNotNullParameter(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f12640b = defaultLifecycleObserver;
        this.f12641c = interfaceC1351q;
    }

    @Override // androidx.lifecycle.InterfaceC1351q
    public void onStateChanged(InterfaceC1354u source, AbstractC1346l.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        switch (a.f12642a[event.ordinal()]) {
            case 1:
                this.f12640b.onCreate(source);
                break;
            case 2:
                this.f12640b.onStart(source);
                break;
            case 3:
                this.f12640b.onResume(source);
                break;
            case 4:
                this.f12640b.onPause(source);
                break;
            case 5:
                this.f12640b.onStop(source);
                break;
            case 6:
                this.f12640b.onDestroy(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC1351q interfaceC1351q = this.f12641c;
        if (interfaceC1351q != null) {
            interfaceC1351q.onStateChanged(source, event);
        }
    }
}
