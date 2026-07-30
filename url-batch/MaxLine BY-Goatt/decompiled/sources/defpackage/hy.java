package defpackage;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.inject.Provider;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class hy implements Provider {
    public final /* synthetic */ int a;
    public final /* synthetic */ ComponentRegistrar b;

    public /* synthetic */ hy(ComponentRegistrar componentRegistrar, int i) {
        this.a = i;
        this.b = componentRegistrar;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        ComponentRegistrar lambda$toProviders$1;
        ComponentRegistrar lambda$addComponentRegistrar$0;
        int i = this.a;
        ComponentRegistrar componentRegistrar = this.b;
        switch (i) {
            case 0:
                lambda$toProviders$1 = ComponentRuntime.lambda$toProviders$1(componentRegistrar);
                return lambda$toProviders$1;
            default:
                lambda$addComponentRegistrar$0 = ComponentRuntime.Builder.lambda$addComponentRegistrar$0(componentRegistrar);
                return lambda$addComponentRegistrar$0;
        }
    }
}
