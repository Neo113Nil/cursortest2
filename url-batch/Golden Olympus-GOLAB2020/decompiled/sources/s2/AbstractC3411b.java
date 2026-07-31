package s2;

import java.util.Arrays;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import r2.G;

/* renamed from: s2.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3411b {

    /* renamed from: b, reason: collision with root package name */
    private AbstractC3413d[] f45956b;

    /* renamed from: c, reason: collision with root package name */
    private int f45957c;

    /* renamed from: d, reason: collision with root package name */
    private int f45958d;

    /* renamed from: e, reason: collision with root package name */
    private y f45959e;

    public final G e() {
        y yVar;
        synchronized (this) {
            yVar = this.f45959e;
            if (yVar == null) {
                yVar = new y(this.f45957c);
                this.f45959e = yVar;
            }
        }
        return yVar;
    }

    protected final AbstractC3413d i() {
        AbstractC3413d abstractC3413d;
        y yVar;
        synchronized (this) {
            try {
                AbstractC3413d[] abstractC3413dArr = this.f45956b;
                if (abstractC3413dArr == null) {
                    abstractC3413dArr = k(2);
                    this.f45956b = abstractC3413dArr;
                } else if (this.f45957c >= abstractC3413dArr.length) {
                    Object[] copyOf = Arrays.copyOf(abstractC3413dArr, abstractC3413dArr.length * 2);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                    this.f45956b = (AbstractC3413d[]) copyOf;
                    abstractC3413dArr = (AbstractC3413d[]) copyOf;
                }
                int i4 = this.f45958d;
                do {
                    abstractC3413d = abstractC3413dArr[i4];
                    if (abstractC3413d == null) {
                        abstractC3413d = j();
                        abstractC3413dArr[i4] = abstractC3413d;
                    }
                    i4++;
                    if (i4 >= abstractC3413dArr.length) {
                        i4 = 0;
                    }
                    Intrinsics.checkNotNull(abstractC3413d, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!abstractC3413d.a(this));
                this.f45958d = i4;
                this.f45957c++;
                yVar = this.f45959e;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (yVar != null) {
            yVar.a0(1);
        }
        return abstractC3413d;
    }

    protected abstract AbstractC3413d j();

    protected abstract AbstractC3413d[] k(int i4);

    protected final void l(AbstractC3413d abstractC3413d) {
        y yVar;
        int i4;
        kotlin.coroutines.d[] b4;
        synchronized (this) {
            try {
                int i5 = this.f45957c - 1;
                this.f45957c = i5;
                yVar = this.f45959e;
                if (i5 == 0) {
                    this.f45958d = 0;
                }
                Intrinsics.checkNotNull(abstractC3413d, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b4 = abstractC3413d.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (kotlin.coroutines.d dVar : b4) {
            if (dVar != null) {
                Result.Companion companion = Result.Companion;
                dVar.resumeWith(Result.m243constructorimpl(Unit.f41027a));
            }
        }
        if (yVar != null) {
            yVar.a0(-1);
        }
    }

    protected final int m() {
        return this.f45957c;
    }

    protected final AbstractC3413d[] n() {
        return this.f45956b;
    }
}
