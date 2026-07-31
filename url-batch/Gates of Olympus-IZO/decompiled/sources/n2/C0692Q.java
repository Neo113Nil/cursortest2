package n2;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k2.C0536h;
import m2.EnumC0626a;
import o2.AbstractC0753b;
import o2.AbstractC0754c;
import o2.AbstractC0755d;

/* renamed from: n2.Q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0692Q extends AbstractC0753b implements InterfaceC0719y, InterfaceC0700f, o2.p {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6320i = AtomicReferenceFieldUpdater.newUpdater(C0692Q.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: h, reason: collision with root package name */
    public int f6321h;

    public C0692Q(Object obj) {
        this._state$volatile = obj;
    }

    @Override // n2.InterfaceC0718x
    public final void a() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // o2.p
    public final InterfaceC0700f b(P1.i iVar, int i3, EnumC0626a enumC0626a) {
        return (((i3 < 0 || i3 >= 2) && i3 != -2) || enumC0626a != EnumC0626a.f5930e) ? AbstractC0682G.k(this, iVar, i3, enumC0626a) : this;
    }

    @Override // n2.InterfaceC0718x
    public final boolean c(Object obj) {
        k(null, obj);
        return true;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007d, B:17:0x0085, B:20:0x008c, B:21:0x0090, B:25:0x0093, B:27:0x00b4, B:30:0x00c4, B:31:0x00de, B:37:0x00f0, B:33:0x00e7, B:36:0x00ed, B:46:0x0099, B:49:0x00a0, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007d, B:17:0x0085, B:20:0x008c, B:21:0x0090, B:25:0x0093, B:27:0x00b4, B:30:0x00c4, B:31:0x00de, B:37:0x00f0, B:33:0x00e7, B:36:0x00ed, B:46:0x0099, B:49:0x00a0, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c3 -> B:15:0x007d). Please report as a decompilation issue!!! */
    @Override // n2.InterfaceC0700f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object collect(n2.InterfaceC0701g r17, P1.d r18) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.C0692Q.collect(n2.g, P1.d):java.lang.Object");
    }

    @Override // o2.AbstractC0753b
    public final AbstractC0755d e() {
        return new C0693S();
    }

    @Override // n2.InterfaceC0701g
    public final Object emit(Object obj, P1.d dVar) {
        j(obj);
        return L1.z.f2729a;
    }

    @Override // o2.AbstractC0753b
    public final AbstractC0755d[] f() {
        return new C0693S[2];
    }

    @Override // n2.InterfaceC0690O
    public final Object getValue() {
        j1.p pVar = AbstractC0754c.f6699b;
        Object obj = f6320i.get(this);
        if (obj == pVar) {
            return null;
        }
        return obj;
    }

    public final boolean i(Object obj, Object obj2) {
        j1.p pVar = AbstractC0754c.f6699b;
        if (obj == null) {
            obj = pVar;
        }
        if (obj2 == null) {
            obj2 = pVar;
        }
        return k(obj, obj2);
    }

    public final void j(Object obj) {
        if (obj == null) {
            obj = AbstractC0754c.f6699b;
        }
        k(null, obj);
    }

    public final boolean k(Object obj, Object obj2) {
        int i3;
        AbstractC0755d[] abstractC0755dArr;
        j1.p pVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6320i;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Z1.i.a(obj3, obj)) {
                return false;
            }
            if (Z1.i.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i4 = this.f6321h;
            if ((i4 & 1) != 0) {
                this.f6321h = i4 + 2;
                return true;
            }
            int i5 = i4 + 1;
            this.f6321h = i5;
            AbstractC0755d[] abstractC0755dArr2 = this.f6694d;
            while (true) {
                C0693S[] c0693sArr = (C0693S[]) abstractC0755dArr2;
                if (c0693sArr != null) {
                    for (C0693S c0693s : c0693sArr) {
                        if (c0693s != null) {
                            AtomicReference atomicReference = c0693s.f6322a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (pVar = AbstractC0682G.f6295c)) {
                                    j1.p pVar2 = AbstractC0682G.f6294b;
                                    if (obj4 != pVar2) {
                                        while (!atomicReference.compareAndSet(obj4, pVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((C0536h) obj4).resumeWith(L1.z.f2729a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, pVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i3 = this.f6321h;
                    if (i3 == i5) {
                        this.f6321h = i5 + 1;
                        return true;
                    }
                    abstractC0755dArr = this.f6694d;
                }
                abstractC0755dArr2 = abstractC0755dArr;
                i5 = i3;
            }
        }
    }
}
