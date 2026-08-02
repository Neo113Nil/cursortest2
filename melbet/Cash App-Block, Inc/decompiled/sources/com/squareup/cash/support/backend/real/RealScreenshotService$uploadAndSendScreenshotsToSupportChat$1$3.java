package com.squareup.cash.support.backend.real;

import com.squareup.cash.support.backend.api.ScreenshotService$ServiceState;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes7.dex */
public final /* synthetic */ class RealScreenshotService$uploadAndSendScreenshotsToSupportChat$1$3 extends FunctionReferenceImpl implements Function1 {
    public static final RealScreenshotService$uploadAndSendScreenshotsToSupportChat$1$3 INSTANCE = new RealScreenshotService$uploadAndSendScreenshotsToSupportChat$1$3(1, ScreenshotService$ServiceState.Succeeded.class, "<init>", "<init>(Ljava/util/List;)V", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list = (List) obj;
        list.getClass();
        return new ScreenshotService$ServiceState.Succeeded(list);
    }
}
