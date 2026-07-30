package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import defpackage.fr;
import defpackage.g90;
import defpackage.nz2;
import defpackage.pz2;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ nz2 lambda$getComponents$0(ComponentContainer componentContainer) {
        pz2.b((Context) componentContainer.get(Context.class));
        return pz2.a().c(fr.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ nz2 lambda$getComponents$1(ComponentContainer componentContainer) {
        pz2.b((Context) componentContainer.get(Context.class));
        return pz2.a().c(fr.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ nz2 lambda$getComponents$2(ComponentContainer componentContainer) {
        pz2.b((Context) componentContainer.get(Context.class));
        return pz2.a().c(fr.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(nz2.class).name(LIBRARY_NAME).add(Dependency.required((Class<?>) Context.class)).factory(new g90(6)).build(), Component.builder(Qualified.qualified(LegacyTransportBackend.class, nz2.class)).add(Dependency.required((Class<?>) Context.class)).factory(new g90(7)).build(), Component.builder(Qualified.qualified(TransportBackend.class, nz2.class)).add(Dependency.required((Class<?>) Context.class)).factory(new g90(8)).build(), LibraryVersionComponent.create(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
