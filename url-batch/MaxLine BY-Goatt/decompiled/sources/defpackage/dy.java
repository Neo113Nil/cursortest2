package defpackage;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.platforminfo.LibraryVersion;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.tracing.ComponentMonitor;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class dy implements ComponentFactory {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dy(String str, Object obj, int i) {
        this.a = i;
        this.b = str;
        this.c = obj;
    }

    @Override // com.google.firebase.components.ComponentFactory
    public final Object create(ComponentContainer componentContainer) {
        Object lambda$processRegistrar$0;
        LibraryVersion lambda$fromContext$0;
        int i = this.a;
        Object obj = this.c;
        String str = this.b;
        switch (i) {
            case 0:
                lambda$processRegistrar$0 = ComponentMonitor.lambda$processRegistrar$0(str, (Component) obj, componentContainer);
                return lambda$processRegistrar$0;
            default:
                lambda$fromContext$0 = LibraryVersionComponent.lambda$fromContext$0(str, (LibraryVersionComponent.VersionExtractor) obj, componentContainer);
                return lambda$fromContext$0;
        }
    }
}
