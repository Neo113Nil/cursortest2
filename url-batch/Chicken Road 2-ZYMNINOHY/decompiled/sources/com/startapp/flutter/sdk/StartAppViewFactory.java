package com.startapp.flutter.sdk;

import android.content.Context;
import com.startapp.flutter.sdk.StartAppView;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import java.util.Map;

/* loaded from: classes.dex */
public class StartAppViewFactory<T extends StartAppView> extends PlatformViewFactory {
    private final FactoryMethod<T> factory;

    public interface FactoryMethod<T extends StartAppView> {
        T newInstance();
    }

    public StartAppViewFactory(FactoryMethod<T> factoryMethod) {
        super(StandardMessageCodec.INSTANCE);
        this.factory = factoryMethod;
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    public PlatformView create(Context context, int i4, Object obj) {
        T newInstance = this.factory.newInstance();
        newInstance.createView(context, i4, (Map) obj);
        return newInstance;
    }
}
