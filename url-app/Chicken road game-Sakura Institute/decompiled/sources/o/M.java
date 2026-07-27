package o;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import l0.C0800A;
import y2.AbstractC1343r;

/* loaded from: classes.dex */
public final class M extends E2.i implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public int f8660i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f8661j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ CoroutineContext f8662k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ E2.i f8663l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public M(CoroutineContext coroutineContext, Function2 function2, C2.a aVar) {
        super(2, aVar);
        this.f8662k = coroutineContext;
        this.f8663l = (E2.i) function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        return ((M) j((C2.a) obj2, (C0800A) obj)).l(Unit.f7487a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [E2.i, kotlin.jvm.functions.Function2] */
    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        M m4 = new M(this.f8662k, this.f8663l, aVar);
        m4.f8661j = obj;
        return m4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, l0.A] */
    /* JADX WARN: Type inference failed for: r1v7, types: [E2.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0057 -> B:8:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x006c -> B:8:0x0028). Please report as a decompilation issue!!! */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        Object f4;
        C0800A c0800a;
        C0800A c0800a2;
        D2.a aVar = D2.a.f2163d;
        C0800A c0800a3 = this.f8660i;
        CoroutineContext coroutineContext = this.f8662k;
        try {
        } catch (CancellationException e4) {
            e = e4;
            if (W2.B.l(coroutineContext)) {
                throw e;
            }
            this.f8661j = c0800a3;
            this.f8660i = 3;
            Object f5 = m3.z.f(c0800a3, this);
            c0800a2 = c0800a3;
            if (f5 == aVar) {
                return aVar;
            }
            c0800a = c0800a2;
            if (W2.B.l(coroutineContext)) {
            }
        }
        if (c0800a3 == 0) {
            AbstractC1343r.b(obj);
            c0800a = (C0800A) this.f8661j;
            if (W2.B.l(coroutineContext)) {
            }
        } else if (c0800a3 != 1) {
            if (c0800a3 == 2) {
                C0800A c0800a4 = (C0800A) this.f8661j;
                AbstractC1343r.b(obj);
                c0800a2 = c0800a4;
            } else {
                if (c0800a3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0800A c0800a5 = (C0800A) this.f8661j;
                AbstractC1343r.b(obj);
                c0800a2 = c0800a5;
            }
            c0800a = c0800a2;
            if (W2.B.l(coroutineContext)) {
                try {
                } catch (CancellationException e5) {
                    c0800a3 = c0800a;
                    e = e5;
                    if (W2.B.l(coroutineContext)) {
                    }
                }
                ?? r12 = this.f8663l;
                this.f8661j = c0800a;
                this.f8660i = 1;
                if (r12.h(c0800a, this) == aVar) {
                    return aVar;
                }
                c0800a3 = c0800a;
                this.f8661j = c0800a3;
                this.f8660i = 2;
                f4 = m3.z.f(c0800a3, this);
                c0800a2 = c0800a3;
                if (f4 == aVar) {
                    return aVar;
                }
                c0800a = c0800a2;
                if (W2.B.l(coroutineContext)) {
                    return Unit.f7487a;
                }
            }
        } else {
            C0800A c0800a6 = (C0800A) this.f8661j;
            AbstractC1343r.b(obj);
            c0800a3 = c0800a6;
            this.f8661j = c0800a3;
            this.f8660i = 2;
            f4 = m3.z.f(c0800a3, this);
            c0800a2 = c0800a3;
            if (f4 == aVar) {
            }
            c0800a = c0800a2;
            if (W2.B.l(coroutineContext)) {
            }
        }
    }
}
