package com.google.firebase;

import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.annotations.concurrent.Lightweight;
import com.google.firebase.annotations.concurrent.UiThread;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import defpackage.ap;
import defpackage.qv;
import defpackage.t40;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        Component build = Component.builder(Qualified.qualified(Background.class, t40.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Background.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$1
            @Override // com.google.firebase.components.ComponentFactory
            public final t40 create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(Background.class, Executor.class));
                obj.getClass();
                return ap.x((Executor) obj);
            }
        }).build();
        build.getClass();
        Component build2 = Component.builder(Qualified.qualified(Lightweight.class, t40.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Lightweight.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$2
            @Override // com.google.firebase.components.ComponentFactory
            public final t40 create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(Lightweight.class, Executor.class));
                obj.getClass();
                return ap.x((Executor) obj);
            }
        }).build();
        build2.getClass();
        Component build3 = Component.builder(Qualified.qualified(Blocking.class, t40.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Blocking.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$3
            @Override // com.google.firebase.components.ComponentFactory
            public final t40 create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(Blocking.class, Executor.class));
                obj.getClass();
                return ap.x((Executor) obj);
            }
        }).build();
        build3.getClass();
        Component build4 = Component.builder(Qualified.qualified(UiThread.class, t40.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(UiThread.class, Executor.class))).factory(new ComponentFactory() { // from class: com.google.firebase.FirebaseCommonKtxRegistrar$getComponents$$inlined$coroutineDispatcher$4
            @Override // com.google.firebase.components.ComponentFactory
            public final t40 create(ComponentContainer componentContainer) {
                Object obj = componentContainer.get(Qualified.qualified(UiThread.class, Executor.class));
                obj.getClass();
                return ap.x((Executor) obj);
            }
        }).build();
        build4.getClass();
        return qv.g(build, build2, build3, build4);
    }
}
