package com.artillery.ctc.base;

import androidx.annotation.Keep;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class IflytekResponseData {
    private final int code;
    private final IflytekData data;
    private final String message;
    private final String sid;
    private final String tid;

    public IflytekResponseData() {
        this(0, null, null, null, null, 31, null);
    }

    public static /* synthetic */ IflytekResponseData copy$default(IflytekResponseData iflytekResponseData, int i8, String str, String str2, IflytekData iflytekData, String str3, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = iflytekResponseData.code;
        }
        if ((i9 & 2) != 0) {
            str = iflytekResponseData.message;
        }
        String str4 = str;
        if ((i9 & 4) != 0) {
            str2 = iflytekResponseData.sid;
        }
        String str5 = str2;
        if ((i9 & 8) != 0) {
            iflytekData = iflytekResponseData.data;
        }
        IflytekData iflytekData2 = iflytekData;
        if ((i9 & 16) != 0) {
            str3 = iflytekResponseData.tid;
        }
        return iflytekResponseData.copy(i8, str4, str5, iflytekData2, str3);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.message;
    }

    public final String component3() {
        return this.sid;
    }

    public final IflytekData component4() {
        return this.data;
    }

    public final String component5() {
        return this.tid;
    }

    public final IflytekResponseData copy(int i8, String message, String sid, IflytekData iflytekData, String tid) {
        s.checkNotNullParameter(message, "message");
        s.checkNotNullParameter(sid, "sid");
        s.checkNotNullParameter(tid, "tid");
        return new IflytekResponseData(i8, message, sid, iflytekData, tid);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IflytekResponseData)) {
            return false;
        }
        IflytekResponseData iflytekResponseData = (IflytekResponseData) obj;
        return this.code == iflytekResponseData.code && s.areEqual(this.message, iflytekResponseData.message) && s.areEqual(this.sid, iflytekResponseData.sid) && s.areEqual(this.data, iflytekResponseData.data) && s.areEqual(this.tid, iflytekResponseData.tid);
    }

    public final int getCode() {
        return this.code;
    }

    public final IflytekData getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getSid() {
        return this.sid;
    }

    public final String getTid() {
        return this.tid;
    }

    public int hashCode() {
        int hashCode = ((((this.code * 31) + this.message.hashCode()) * 31) + this.sid.hashCode()) * 31;
        IflytekData iflytekData = this.data;
        return ((hashCode + (iflytekData == null ? 0 : iflytekData.hashCode())) * 31) + this.tid.hashCode();
    }

    public String toString() {
        return "IflytekResponseData(code=" + this.code + ", message=" + this.message + ", sid=" + this.sid + ", data=" + this.data + ", tid=" + this.tid + ')';
    }

    public IflytekResponseData(int i8, String message, String sid, IflytekData iflytekData, String tid) {
        s.checkNotNullParameter(message, "message");
        s.checkNotNullParameter(sid, "sid");
        s.checkNotNullParameter(tid, "tid");
        this.code = i8;
        this.message = message;
        this.sid = sid;
        this.data = iflytekData;
        this.tid = tid;
    }

    public /* synthetic */ IflytekResponseData(int i8, String str, String str2, IflytekData iflytekData, String str3, int i9, o oVar) {
        this((i9 & 1) != 0 ? 0 : i8, (i9 & 2) != 0 ? "" : str, (i9 & 4) != 0 ? "" : str2, (i9 & 8) != 0 ? new IflytekData(0, null, 3, null) : iflytekData, (i9 & 16) != 0 ? "" : str3);
    }
}
