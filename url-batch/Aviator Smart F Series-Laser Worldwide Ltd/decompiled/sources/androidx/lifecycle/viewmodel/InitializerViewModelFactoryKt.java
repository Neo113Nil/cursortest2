package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import f6.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes.dex */
public final class InitializerViewModelFactoryKt {
    public static final /* synthetic */ <VM extends ViewModel> void initializer(InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder, l initializer) {
        s.checkNotNullParameter(initializerViewModelFactoryBuilder, "<this>");
        s.checkNotNullParameter(initializer, "initializer");
        s.reifiedOperationMarker(4, "VM");
        initializerViewModelFactoryBuilder.addInitializer(u.getOrCreateKotlinClass(ViewModel.class), initializer);
    }

    public static final ViewModelProvider.Factory viewModelFactory(l builder) {
        s.checkNotNullParameter(builder, "builder");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        builder.invoke(initializerViewModelFactoryBuilder);
        return initializerViewModelFactoryBuilder.build();
    }
}
