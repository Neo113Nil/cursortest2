package kotlinx.coroutines.channels;

import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class e {
    public static final b Companion = new b(null);
    private static final c failed = new c();
    private final Object holder;

    public static final class a extends c {
        public final Throwable cause;

        public a(Throwable th) {
            this.cause = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && s.areEqual(this.cause, ((a) obj).cause);
        }

        public int hashCode() {
            Throwable th = this.cause;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // kotlinx.coroutines.channels.e.c
        public String toString() {
            return "Closed(" + this.cause + ')';
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(o oVar) {
            this();
        }

        /* renamed from: closed-JP2dKIU, reason: not valid java name */
        public final <E> Object m1253closedJP2dKIU(Throwable th) {
            return e.m1241constructorimpl(new a(th));
        }

        /* renamed from: failure-PtdJZtk, reason: not valid java name */
        public final <E> Object m1254failurePtdJZtk() {
            return e.m1241constructorimpl(e.failed);
        }

        /* renamed from: success-JP2dKIU, reason: not valid java name */
        public final <E> Object m1255successJP2dKIU(E e8) {
            return e.m1241constructorimpl(e8);
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ e(Object obj) {
        this.holder = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ e m1240boximpl(Object obj) {
        return new e(obj);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m1241constructorimpl(Object obj) {
        return obj;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1242equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof e) && s.areEqual(obj, ((e) obj2).m1252unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1243equalsimpl0(Object obj, Object obj2) {
        return s.areEqual(obj, obj2);
    }

    /* renamed from: exceptionOrNull-impl, reason: not valid java name */
    public static final Throwable m1244exceptionOrNullimpl(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.cause;
        }
        return null;
    }

    public static /* synthetic */ void getHolder$annotations() {
    }

    /* renamed from: getOrNull-impl, reason: not valid java name */
    public static final Object m1245getOrNullimpl(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    /* renamed from: getOrThrow-impl, reason: not valid java name */
    public static final Object m1246getOrThrowimpl(Object obj) {
        Throwable th;
        if (!(obj instanceof c)) {
            return obj;
        }
        if ((obj instanceof a) && (th = ((a) obj).cause) != null) {
            throw th;
        }
        throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1247hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: isClosed-impl, reason: not valid java name */
    public static final boolean m1248isClosedimpl(Object obj) {
        return obj instanceof a;
    }

    /* renamed from: isFailure-impl, reason: not valid java name */
    public static final boolean m1249isFailureimpl(Object obj) {
        return obj instanceof c;
    }

    /* renamed from: isSuccess-impl, reason: not valid java name */
    public static final boolean m1250isSuccessimpl(Object obj) {
        return !(obj instanceof c);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1251toStringimpl(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m1242equalsimpl(this.holder, obj);
    }

    public int hashCode() {
        return m1247hashCodeimpl(this.holder);
    }

    public String toString() {
        return m1251toStringimpl(this.holder);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m1252unboximpl() {
        return this.holder;
    }
}
