package retrofit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class BuiltInFactories$Java8 extends Reflection {
    @Override // retrofit2.Reflection
    public final List createDefaultCallAdapterFactories(Executor executor) {
        int i = 0;
        return Arrays.asList(new CompletableFutureCallAdapterFactory(i), new DefaultCallAdapterFactory(executor, i));
    }

    @Override // retrofit2.Reflection
    public final List createDefaultConverterFactories() {
        return Collections.singletonList(new BuiltInConverters(1));
    }
}
