package com.squareup.cash.support.backend.real;

import com.squareup.cash.support.backend.api.ScreenshotService$ServiceState;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class RealScreenshotService$uploadAndSendJob$1$1 extends FunctionReferenceImpl implements Function1 {
    public static final RealScreenshotService$uploadAndSendJob$1$1 INSTANCE = new RealScreenshotService$uploadAndSendJob$1$1(1, ScreenshotService$ServiceState.Canceled.class, "<init>", "<init>(Ljava/util/List;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list = (List) obj;
        list.getClass();
        return new ScreenshotService$ServiceState.Canceled(list);
    }
}
