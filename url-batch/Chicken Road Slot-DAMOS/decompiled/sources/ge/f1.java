package ge;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class f1 extends wd.n implements Function1 {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f4348v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(int i3, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i3, obj, cls, str, str2, i10);
        this.f4348v = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object[] objArr;
        Object[] objArr2;
        int i3;
        switch (this.f4348v) {
            case 0:
                ((g1) this.f10145e).l((Throwable) obj);
                return Unit.f5554a;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                x.l lVar = (x.l) this.f10145e;
                s.z zVar = lVar.O;
                if (booleanValue) {
                    lVar.O();
                } else {
                    ld.a aVar = null;
                    if (lVar.E != null) {
                        Object[] objArr3 = zVar.f8401c;
                        long[] jArr = zVar.f8399a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i10 = 0;
                            while (true) {
                                long j = jArr[i10];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i11 = 8;
                                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                                    int i13 = 0;
                                    while (i13 < i12) {
                                        if ((255 & j) < 128) {
                                            i3 = i11;
                                            objArr2 = objArr3;
                                            a0.s(lVar.w(), null, new x.d(lVar, (z.h) objArr3[(i10 << 3) + i13], aVar, 0), 3);
                                        } else {
                                            objArr2 = objArr3;
                                            i3 = i11;
                                        }
                                        j >>= i3;
                                        i13++;
                                        i11 = i3;
                                        objArr3 = objArr2;
                                    }
                                    objArr = objArr3;
                                    if (i12 != i11) {
                                    }
                                } else {
                                    objArr = objArr3;
                                }
                                if (i10 != length) {
                                    i10++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                        z.h hVar = lVar.Q;
                        if (hVar != null) {
                            a0.s(lVar.w(), null, new x.d(lVar, hVar, aVar, 1), 3);
                        }
                    }
                    zVar.a();
                    lVar.Q = null;
                }
                return Unit.f5554a;
            default:
                ((Set) obj).getClass();
                z4.f fVar = (z4.f) this.f10145e;
                ReentrantLock reentrantLock = fVar.f10739d;
                reentrantLock.lock();
                try {
                    List Q = CollectionsKt.Q(fVar.f10738c.values());
                    reentrantLock.unlock();
                    Iterator it = Q.iterator();
                    if (!it.hasNext()) {
                        return Unit.f5554a;
                    }
                    ((z4.k) it.next()).getClass();
                    throw null;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
        }
    }
}
