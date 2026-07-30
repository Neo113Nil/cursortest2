package kotlinx.coroutines.flow.internal;

import java.util.Arrays;
import kotlin.Result;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.t;
import y5.w;

/* loaded from: classes5.dex */
public abstract class a {
    private o _subscriptionCount;
    private int nCollectors;
    private int nextIndex;
    private c[] slots;

    protected final c allocateSlot() {
        c cVar;
        o oVar;
        synchronized (this) {
            try {
                c[] cVarArr = this.slots;
                if (cVarArr == null) {
                    cVarArr = createSlotArray(2);
                    this.slots = cVarArr;
                } else if (this.nCollectors >= cVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(cVarArr, cVarArr.length * 2);
                    s.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                    this.slots = (c[]) copyOf;
                    cVarArr = (c[]) copyOf;
                }
                int i8 = this.nextIndex;
                do {
                    cVar = cVarArr[i8];
                    if (cVar == null) {
                        cVar = createSlot();
                        cVarArr[i8] = cVar;
                    }
                    i8++;
                    if (i8 >= cVarArr.length) {
                        i8 = 0;
                    }
                    s.checkNotNull(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!cVar.allocateLocked(this));
                this.nextIndex = i8;
                this.nCollectors++;
                oVar = this._subscriptionCount;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (oVar != null) {
            oVar.increment(1);
        }
        return cVar;
    }

    protected abstract c createSlot();

    protected abstract c[] createSlotArray(int i8);

    protected final void forEachSlotLocked(f6.l lVar) {
        c[] cVarArr;
        if (this.nCollectors == 0 || (cVarArr = this.slots) == null) {
            return;
        }
        for (c cVar : cVarArr) {
            if (cVar != null) {
                lVar.invoke(cVar);
            }
        }
    }

    protected final void freeSlot(c cVar) {
        o oVar;
        int i8;
        kotlin.coroutines.c[] freeLocked;
        synchronized (this) {
            try {
                int i9 = this.nCollectors - 1;
                this.nCollectors = i9;
                oVar = this._subscriptionCount;
                if (i9 == 0) {
                    this.nextIndex = 0;
                }
                s.checkNotNull(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                freeLocked = cVar.freeLocked(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (kotlin.coroutines.c cVar2 : freeLocked) {
            if (cVar2 != null) {
                Result.a aVar = Result.Companion;
                cVar2.resumeWith(Result.m348constructorimpl(w.INSTANCE));
            }
        }
        if (oVar != null) {
            oVar.increment(-1);
        }
    }

    protected final int getNCollectors() {
        return this.nCollectors;
    }

    protected final c[] getSlots() {
        return this.slots;
    }

    public final t getSubscriptionCount() {
        o oVar;
        synchronized (this) {
            oVar = this._subscriptionCount;
            if (oVar == null) {
                oVar = new o(this.nCollectors);
                this._subscriptionCount = oVar;
            }
        }
        return oVar;
    }
}
