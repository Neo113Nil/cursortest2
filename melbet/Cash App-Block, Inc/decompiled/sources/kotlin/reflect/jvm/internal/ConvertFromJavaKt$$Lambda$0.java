package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final class ConvertFromJavaKt$$Lambda$0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final Type arg$0;

    public /* synthetic */ ConvertFromJavaKt$$Lambda$0(int i, Type type2) {
        this.$r8$classId = i;
        this.arg$0 = type2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        return this.arg$0;
    }
}
