package io.appmetrica.analytics.flutter;

import io.appmetrica.analytics.flutter.impl.AppMetricaConfigConverterImpl;
import io.appmetrica.analytics.flutter.impl.AppMetricaImpl;
import io.appmetrica.analytics.flutter.impl.AppMetricaLibraryAdapterImpl;
import io.appmetrica.analytics.flutter.impl.InitialDeepLinkHolderImpl;
import io.appmetrica.analytics.flutter.impl.ReporterImpl;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;

/* loaded from: classes.dex */
public class AppMetricaPlugin implements FlutterPlugin, ActivityAware {
    private AppMetricaImpl appMetrica = null;
    private AppMetricaLibraryAdapterImpl appMetricaLibraryAdapter = null;
    private InitialDeepLinkHolderImpl deeplinkHolder = null;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        AppMetricaImpl appMetricaImpl = this.appMetrica;
        if (appMetricaImpl != null) {
            appMetricaImpl.activity = activityPluginBinding.getActivity();
        }
        InitialDeepLinkHolderImpl initialDeepLinkHolderImpl = this.deeplinkHolder;
        if (initialDeepLinkHolderImpl != null) {
            initialDeepLinkHolderImpl.activity = activityPluginBinding.getActivity();
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.appMetrica = new AppMetricaImpl(flutterPluginBinding.getApplicationContext());
        this.appMetricaLibraryAdapter = new AppMetricaLibraryAdapterImpl(flutterPluginBinding.getApplicationContext());
        this.deeplinkHolder = new InitialDeepLinkHolderImpl();
        Pigeon.AppMetricaPigeon.setup(flutterPluginBinding.getBinaryMessenger(), this.appMetrica);
        Pigeon.AppMetricaLibraryAdapterPigeon.setup(flutterPluginBinding.getBinaryMessenger(), this.appMetricaLibraryAdapter);
        Pigeon.ReporterPigeon.setup(flutterPluginBinding.getBinaryMessenger(), new ReporterImpl(flutterPluginBinding.getApplicationContext()));
        Pigeon.AppMetricaConfigConverterPigeon.setup(flutterPluginBinding.getBinaryMessenger(), new AppMetricaConfigConverterImpl());
        Pigeon.InitialDeepLinkHolderPigeon.setup(flutterPluginBinding.getBinaryMessenger(), this.deeplinkHolder);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        AppMetricaImpl appMetricaImpl = this.appMetrica;
        if (appMetricaImpl != null) {
            appMetricaImpl.activity = null;
        }
        InitialDeepLinkHolderImpl initialDeepLinkHolderImpl = this.deeplinkHolder;
        if (initialDeepLinkHolderImpl != null) {
            initialDeepLinkHolderImpl.activity = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        AppMetricaImpl appMetricaImpl = this.appMetrica;
        if (appMetricaImpl != null) {
            appMetricaImpl.activity = null;
        }
        InitialDeepLinkHolderImpl initialDeepLinkHolderImpl = this.deeplinkHolder;
        if (initialDeepLinkHolderImpl != null) {
            initialDeepLinkHolderImpl.activity = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        AppMetricaImpl appMetricaImpl = this.appMetrica;
        if (appMetricaImpl != null) {
            appMetricaImpl.activity = activityPluginBinding.getActivity();
        }
        InitialDeepLinkHolderImpl initialDeepLinkHolderImpl = this.deeplinkHolder;
        if (initialDeepLinkHolderImpl != null) {
            initialDeepLinkHolderImpl.activity = activityPluginBinding.getActivity();
        }
    }
}
