package com.artillery.ctc.base;

import androidx.annotation.Keep;
import com.artillery.ctc.base.AsrLanguage;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class AsrModel {
    public AsrLanguage dev_pid;

    /* JADX WARN: Multi-variable type inference failed */
    public AsrModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AsrModel copy$default(AsrModel asrModel, AsrLanguage asrLanguage, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            asrLanguage = asrModel.dev_pid;
        }
        return asrModel.copy(asrLanguage);
    }

    public final AsrLanguage component1() {
        return this.dev_pid;
    }

    public final AsrModel copy(AsrLanguage dev_pid) {
        s.checkNotNullParameter(dev_pid, "dev_pid");
        return new AsrModel(dev_pid);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AsrModel) && s.areEqual(this.dev_pid, ((AsrModel) obj).dev_pid);
    }

    public int hashCode() {
        return this.dev_pid.hashCode();
    }

    public String toString() {
        return "AsrModel(dev_pid=" + this.dev_pid + ')';
    }

    public AsrModel(AsrLanguage dev_pid) {
        s.checkNotNullParameter(dev_pid, "dev_pid");
        this.dev_pid = dev_pid;
    }

    public /* synthetic */ AsrModel(AsrLanguage asrLanguage, int i8, o oVar) {
        this((i8 & 1) != 0 ? AsrLanguage.ZhPlus.INSTANCE : asrLanguage);
    }
}
