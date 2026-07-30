package com.google.firebase.components;

import defpackage.ey;
import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface ComponentRegistrarProcessor {
    public static final ComponentRegistrarProcessor NOOP = new ey(0);

    List<Component<?>> processRegistrar(ComponentRegistrar componentRegistrar);
}
