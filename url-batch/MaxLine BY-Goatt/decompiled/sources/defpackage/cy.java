package defpackage;

import com.google.firebase.FirebaseApp;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.installations.local.IidStore;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class cy implements Provider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cy(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        ComponentRegistrar instantiate;
        IidStore lambda$new$0;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                instantiate = ComponentDiscovery.instantiate((String) obj);
                return instantiate;
            default:
                lambda$new$0 = FirebaseInstallations.lambda$new$0((FirebaseApp) obj);
                return lambda$new$0;
        }
    }
}
