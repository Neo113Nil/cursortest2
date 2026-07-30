package com.artillery.ctc.base;

import androidx.annotation.Keep;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class BaseResult {
    public String type;

    public BaseResult(String type) {
        s.checkNotNullParameter(type, "type");
        this.type = type;
    }

    public static /* synthetic */ BaseResult copy$default(BaseResult baseResult, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = baseResult.type;
        }
        return baseResult.copy(str);
    }

    public final String component1() {
        return this.type;
    }

    public final BaseResult copy(String type) {
        s.checkNotNullParameter(type, "type");
        return new BaseResult(type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseResult) && s.areEqual(this.type, ((BaseResult) obj).type);
    }

    public int hashCode() {
        return this.type.hashCode();
    }

    public String toString() {
        return "BaseResult(type=" + this.type + ')';
    }
}
