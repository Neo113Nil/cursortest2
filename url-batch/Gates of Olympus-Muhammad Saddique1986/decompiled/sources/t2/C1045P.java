package t2;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q2.C0821h;
import s2.EnumC0967a;
import u2.AbstractC1150b;
import u2.AbstractC1151c;
import u2.AbstractC1152d;

/* renamed from: t2.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1045P extends AbstractC1150b implements InterfaceC1072y, InterfaceC1053f, u2.v {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9003i = AtomicReferenceFieldUpdater.newUpdater(C1045P.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: h, reason: collision with root package name */
    public int f9004h;

    public C1045P(Object obj) {
        this._state$volatile = obj;
    }

    @Override // t2.InterfaceC1071x
    public final void a() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // u2.v
    public final InterfaceC1053f b(V1.i iVar, int i3, EnumC0967a enumC0967a) {
        return (((i3 < 0 || i3 >= 2) && i3 != -2) || enumC0967a != EnumC0967a.f8360e) ? AbstractC1035F.l(this, iVar, i3, enumC0967a) : this;
    }

    @Override // t2.InterfaceC1071x
    public final boolean c(Object obj) {
        k(obj);
        return true;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007e, B:17:0x0086, B:20:0x008d, B:21:0x0091, B:25:0x0094, B:27:0x00b5, B:30:0x00c5, B:31:0x00df, B:37:0x00f1, B:33:0x00e8, B:36:0x00ee, B:46:0x009a, B:49:0x00a1, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5 A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:13:0x0039, B:15:0x007e, B:17:0x0086, B:20:0x008d, B:21:0x0091, B:25:0x0094, B:27:0x00b5, B:30:0x00c5, B:31:0x00df, B:37:0x00f1, B:33:0x00e8, B:36:0x00ee, B:46:0x009a, B:49:0x00a1, B:57:0x0053, B:59:0x005d, B:60:0x006e), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00c4 -> B:15:0x007e). Please report as a decompilation issue!!! */
    @Override // t2.InterfaceC1053f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object d(t2.InterfaceC1054g r17, V1.d r18) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.C1045P.d(t2.g, V1.d):java.lang.Object");
    }

    @Override // t2.InterfaceC1054g
    public final Object e(Object obj, V1.d dVar) {
        k(obj);
        return R1.y.f4171a;
    }

    @Override // u2.AbstractC1150b
    public final AbstractC1152d g() {
        return new C1046Q();
    }

    @Override // t2.InterfaceC1043N
    public final Object getValue() {
        m1.q qVar = AbstractC1151c.f9682b;
        Object obj = f9003i.get(this);
        if (obj == qVar) {
            return null;
        }
        return obj;
    }

    @Override // u2.AbstractC1150b
    public final AbstractC1152d[] h() {
        return new C1046Q[2];
    }

    public final void k(Object obj) {
        if (obj == null) {
            obj = AbstractC1151c.f9682b;
        }
        l(null, obj);
    }

    public final boolean l(Object obj, Object obj2) {
        int i3;
        AbstractC1152d[] abstractC1152dArr;
        m1.q qVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9003i;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !f2.j.a(obj3, obj)) {
                return false;
            }
            if (f2.j.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i4 = this.f9004h;
            if ((i4 & 1) != 0) {
                this.f9004h = i4 + 2;
                return true;
            }
            int i5 = i4 + 1;
            this.f9004h = i5;
            AbstractC1152d[] abstractC1152dArr2 = this.f9677d;
            while (true) {
                C1046Q[] c1046qArr = (C1046Q[]) abstractC1152dArr2;
                if (c1046qArr != null) {
                    for (C1046Q c1046q : c1046qArr) {
                        if (c1046q != null) {
                            AtomicReference atomicReference = c1046q.f9005a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (qVar = AbstractC1035F.f8978c)) {
                                    m1.q qVar2 = AbstractC1035F.f8977b;
                                    if (obj4 != qVar2) {
                                        while (!atomicReference.compareAndSet(obj4, qVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((C0821h) obj4).u(R1.y.f4171a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, qVar)) {
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
                    i3 = this.f9004h;
                    if (i3 == i5) {
                        this.f9004h = i5 + 1;
                        return true;
                    }
                    abstractC1152dArr = this.f9677d;
                }
                abstractC1152dArr2 = abstractC1152dArr;
                i5 = i3;
            }
        }
    }
}
