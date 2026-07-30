package com.google.firebase.tracing;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRegistrarProcessor;
import defpackage.dy;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class ComponentMonitor implements ComponentRegistrarProcessor {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$processRegistrar$0(String str, Component component, ComponentContainer componentContainer) {
        try {
            FirebaseTrace.pushTrace(str);
            return component.getFactory().create(componentContainer);
        } finally {
            FirebaseTrace.popTrace();
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrarProcessor
    public List<Component<?>> processRegistrar(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (Component<?> component : componentRegistrar.getComponents()) {
            String name = component.getName();
            if (name != null) {
                component = component.withFactory(new dy(name, component, 0));
            }
            arrayList.add(component);
        }
        return arrayList;
    }
}
