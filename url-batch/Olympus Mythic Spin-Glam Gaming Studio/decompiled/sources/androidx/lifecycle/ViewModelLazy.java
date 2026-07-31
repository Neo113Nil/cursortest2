package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* compiled from: ViewModelLazy.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/lifecycle/ViewModelLazy;", "Landroidx/lifecycle/ViewModel;", "VM", "Lkotlin/Lazy;", "", "isInitialized", "()Z", "Lkotlin/reflect/KClass;", "viewModelClass", "Lkotlin/reflect/KClass;", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelStore;", "storeProducer", "Lkotlin/jvm/functions/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factoryProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extrasProducer", "cached", "Landroidx/lifecycle/ViewModel;", "getValue", "()Landroidx/lifecycle/ViewModel;", "value", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ViewModelLazy<VM extends ViewModel> implements Lazy {
    private ViewModel cached;
    private final Function0 extrasProducer;
    private final Function0 factoryProducer;
    private final Function0 storeProducer;
    private final KClass viewModelClass;

    @Override // kotlin.Lazy
    public ViewModel getValue() {
        ViewModel viewModel = this.cached;
        if (viewModel != null) {
            return viewModel;
        }
        ViewModel viewModel2 = ViewModelProvider.INSTANCE.create((ViewModelStore) this.storeProducer.mo4828invoke(), (ViewModelProvider.Factory) this.factoryProducer.mo4828invoke(), (CreationExtras) this.extrasProducer.mo4828invoke()).get(this.viewModelClass);
        this.cached = viewModel2;
        return viewModel2;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this.cached != null;
    }
}
