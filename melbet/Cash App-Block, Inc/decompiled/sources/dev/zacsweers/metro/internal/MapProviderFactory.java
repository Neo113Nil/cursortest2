package dev.zacsweers.metro.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;

/* loaded from: classes.dex */
public final class MapProviderFactory extends AbstractMapFactory implements Lazy {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Map value;

    public MapProviderFactory(LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.value = this.contributingMap;
    }

    @Override // kotlin.Lazy
    public final Object getValue() {
        return this.value;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.contributingMap;
    }

    @Override // kotlin.Lazy
    public final boolean isInitialized() {
        return true;
    }
}
