package com.artillery.ctc.base;

import androidx.annotation.Keep;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class IflytekData {
    private final IflytekResult result;
    private final int status;

    /* JADX WARN: Multi-variable type inference failed */
    public IflytekData() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ IflytekData copy$default(IflytekData iflytekData, int i8, IflytekResult iflytekResult, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = iflytekData.status;
        }
        if ((i9 & 2) != 0) {
            iflytekResult = iflytekData.result;
        }
        return iflytekData.copy(i8, iflytekResult);
    }

    public final int component1() {
        return this.status;
    }

    public final IflytekResult component2() {
        return this.result;
    }

    public final IflytekData copy(int i8, IflytekResult iflytekResult) {
        return new IflytekData(i8, iflytekResult);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IflytekData)) {
            return false;
        }
        IflytekData iflytekData = (IflytekData) obj;
        return this.status == iflytekData.status && s.areEqual(this.result, iflytekData.result);
    }

    public final IflytekResult getResult() {
        return this.result;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        int i8 = this.status * 31;
        IflytekResult iflytekResult = this.result;
        return i8 + (iflytekResult == null ? 0 : iflytekResult.hashCode());
    }

    public String toString() {
        return "IflytekData(status=" + this.status + ", result=" + this.result + ')';
    }

    public IflytekData(int i8, IflytekResult iflytekResult) {
        this.status = i8;
        this.result = iflytekResult;
    }

    public /* synthetic */ IflytekData(int i8, IflytekResult iflytekResult, int i9, o oVar) {
        this((i9 & 1) != 0 ? 0 : i8, (i9 & 2) != 0 ? null : iflytekResult);
    }
}
