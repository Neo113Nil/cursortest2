package z;

import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class c {
    private final String app_id;
    private final Integer status;

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ c copy$default(c cVar, String str, Integer num, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = cVar.app_id;
        }
        if ((i8 & 2) != 0) {
            num = cVar.status;
        }
        return cVar.copy(str, num);
    }

    public final String component1() {
        return this.app_id;
    }

    public final Integer component2() {
        return this.status;
    }

    public final c copy(String str, Integer num) {
        return new c(str, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.areEqual(this.app_id, cVar.app_id) && s.areEqual(this.status, cVar.status);
    }

    public final String getApp_id() {
        return this.app_id;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.app_id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.status;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "SimultaneousInterpretationHeader(app_id=" + this.app_id + ", status=" + this.status + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
    }

    public c(String str, Integer num) {
        this.app_id = str;
        this.status = num;
    }

    public /* synthetic */ c(String str, Integer num, int i8, kotlin.jvm.internal.o oVar) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : num);
    }
}
