package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class ViewModelLazy<VM extends ViewModel> implements y5.f {
    private VM cached;
    private final f6.a extrasProducer;
    private final f6.a factoryProducer;
    private final f6.a storeProducer;
    private final kotlin.reflect.d viewModelClass;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelLazy(kotlin.reflect.d viewModelClass, f6.a storeProducer, f6.a factoryProducer) {
        this(viewModelClass, storeProducer, factoryProducer, null, 8, null);
        s.checkNotNullParameter(viewModelClass, "viewModelClass");
        s.checkNotNullParameter(storeProducer, "storeProducer");
        s.checkNotNullParameter(factoryProducer, "factoryProducer");
    }

    @Override // y5.f
    public boolean isInitialized() {
        return this.cached != null;
    }

    public ViewModelLazy(kotlin.reflect.d viewModelClass, f6.a storeProducer, f6.a factoryProducer, f6.a extrasProducer) {
        s.checkNotNullParameter(viewModelClass, "viewModelClass");
        s.checkNotNullParameter(storeProducer, "storeProducer");
        s.checkNotNullParameter(factoryProducer, "factoryProducer");
        s.checkNotNullParameter(extrasProducer, "extrasProducer");
        this.viewModelClass = viewModelClass;
        this.storeProducer = storeProducer;
        this.factoryProducer = factoryProducer;
        this.extrasProducer = extrasProducer;
    }

    @Override // y5.f
    public VM getValue() {
        VM vm = this.cached;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) new ViewModelProvider((ViewModelStore) this.storeProducer.invoke(), (ViewModelProvider.Factory) this.factoryProducer.invoke(), (CreationExtras) this.extrasProducer.invoke()).get(e6.a.getJavaClass(this.viewModelClass));
        this.cached = vm2;
        return vm2;
    }

    public /* synthetic */ ViewModelLazy(kotlin.reflect.d dVar, f6.a aVar, f6.a aVar2, f6.a aVar3, int i8, o oVar) {
        this(dVar, aVar, aVar2, (i8 & 8) != 0 ? new f6.a() { // from class: androidx.lifecycle.ViewModelLazy.1
            @Override // f6.a
            public final CreationExtras.Empty invoke() {
                return CreationExtras.Empty.INSTANCE;
            }
        } : aVar3);
    }
}
