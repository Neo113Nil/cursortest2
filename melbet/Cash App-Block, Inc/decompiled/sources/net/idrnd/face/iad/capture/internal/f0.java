package net.idrnd.face.iad.capture.internal;

import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class f0 extends Lambda implements Function1 {
    public static final f0 a = new f0(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) obj;
        threadPoolExecutor.getClass();
        return Boolean.valueOf(threadPoolExecutor.getActiveCount() == 0);
    }
}
