package io.flutter.plugins.firebase.core;

import O6.g;
import S1.b;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class FlutterFirebaseCoreRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        return Collections.singletonList(g.B("flutter-fire-core", "4.11.0"));
    }
}
