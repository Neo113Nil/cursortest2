package com.google.firebase.installations;

import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.heartbeatinfo.HeartBeatConsumerComponent;
import com.google.firebase.heartbeatinfo.HeartBeatController;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import defpackage.g90;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseInstallationsApi lambda$getComponents$0(ComponentContainer componentContainer) {
        return new FirebaseInstallations((FirebaseApp) componentContainer.get(FirebaseApp.class), componentContainer.getProvider(HeartBeatController.class), (ExecutorService) componentContainer.get(Qualified.qualified(Background.class, ExecutorService.class)), FirebaseExecutors.newSequentialExecutor((Executor) componentContainer.get(Qualified.qualified(Blocking.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component<?>> getComponents() {
        return Arrays.asList(Component.builder(FirebaseInstallationsApi.class).name(LIBRARY_NAME).add(Dependency.required((Class<?>) FirebaseApp.class)).add(Dependency.optionalProvider((Class<?>) HeartBeatController.class)).add(Dependency.required((Qualified<?>) Qualified.qualified(Background.class, ExecutorService.class))).add(Dependency.required((Qualified<?>) Qualified.qualified(Blocking.class, Executor.class))).factory(new g90(5)).build(), HeartBeatConsumerComponent.create(), LibraryVersionComponent.create(LIBRARY_NAME, BuildConfig.VERSION_NAME));
    }
}
