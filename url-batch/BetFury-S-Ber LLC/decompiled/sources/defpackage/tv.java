package defpackage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final /* synthetic */ class tv extends fs implements tr {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tv(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.n = i4;
    }

    @Override // defpackage.tr
    public final Object h(Object obj) {
        int i = this.n;
        sk0 sk0Var = sk0.a;
        Object obj2 = this.g;
        switch (i) {
            case 0:
                Set set = (Set) obj;
                set.getClass();
                uv uvVar = (uv) obj2;
                ReentrantLock reentrantLock = uvVar.e;
                reentrantLock.lock();
                try {
                    List<l40> q0 = uc.q0(uvVar.d.values());
                    reentrantLock.unlock();
                    for (l40 l40Var : q0) {
                        l40Var.getClass();
                        int[] iArr = l40Var.b;
                        int length = iArr.length;
                        Set set2 = ym.f;
                        if (length != 0) {
                            int i2 = 0;
                            if (length != 1) {
                                ad0 ad0Var = new ad0();
                                int length2 = iArr.length;
                                int i3 = 0;
                                while (i2 < length2) {
                                    int i4 = i3 + 1;
                                    if (set.contains(Integer.valueOf(iArr[i2]))) {
                                        ad0Var.add(l40Var.c[i3]);
                                    }
                                    i2++;
                                    i3 = i4;
                                }
                                set2 = bd0.a(ad0Var);
                            } else if (set.contains(Integer.valueOf(iArr[0]))) {
                                set2 = l40Var.d;
                            }
                        }
                        if (!set2.isEmpty()) {
                            l40Var.a.a(set2);
                        }
                    }
                    return sk0Var;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            default:
                ((iw) obj2).l((Throwable) obj);
                return sk0Var;
        }
    }
}
