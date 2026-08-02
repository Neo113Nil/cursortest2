package io.appmetrica.analytics.flutter;

import E1.AbstractActivityC0029e;
import F1.c;
import L1.b;
import M1.a;
import P1.f;
import android.content.Context;
import io.appmetrica.analytics.flutter.impl.AppMetricaConfigConverterImpl;
import io.appmetrica.analytics.flutter.impl.AppMetricaImpl;
import io.appmetrica.analytics.flutter.impl.AppMetricaLibraryAdapterImpl;
import io.appmetrica.analytics.flutter.impl.InitialDeepLinkHolderImpl;
import io.appmetrica.analytics.flutter.impl.ReporterImpl;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;

/* loaded from: classes.dex */
public class AppMetricaPlugin implements b, a {
    private AppMetricaImpl appMetrica = null;
    private AppMetricaLibraryAdapterImpl appMetricaLibraryAdapter = null;
    private InitialDeepLinkHolderImpl deeplinkHolder = null;

    @Override // M1.a
    public void onAttachedToActivity(M1.b bVar) {
        AppMetricaImpl appMetricaImpl = this.appMetrica;
        if (appMetricaImpl != null) {
            appMetricaImpl.activity = (AbstractActivityC0029e) ((c) bVar).f486a;
        }
        InitialDeepLinkHolderImpl initialDeepLinkHolderImpl = this.deeplinkHolder;
        if (initialDeepLinkHolderImpl != null) {
            initialDeepLinkHolderImpl.activity = (AbstractActivityC0029e) ((c) bVar).f486a;
        }
    }

    @Override // L1.b
    public void onAttachedToEngine(L1.a aVar) {
        this.appMetrica = new AppMetricaImpl(aVar.f887a);
        Context context = aVar.f887a;
        this.appMetricaLibraryAdapter = new AppMetricaLibraryAdapterImpl(context);
        this.deeplinkHolder = new InitialDeepLinkHolderImpl();
        AppMetricaImpl appMetricaImpl = this.appMetrica;
        f fVar = aVar.f888b;
        Pigeon.AppMetricaPigeon.setup(fVar, appMetricaImpl);
        Pigeon.AppMetricaLibraryAdapterPigeon.setup(fVar, this.appMetricaLibraryAdapter);
        Pigeon.ReporterPigeon.setup(fVar, new ReporterImpl(context));
        Pigeon.AppMetricaConfigConverterPigeon.setup(fVar, new AppMetricaConfigConverterImpl());
        Pigeon.InitialDeepLinkHolderPigeon.setup(fVar, this.deeplinkHolder);
    }

    @Override // M1.a
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

    @Override // M1.a
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

    @Override // M1.a
    public void onReattachedToActivityForConfigChanges(M1.b bVar) {
        AppMetricaImpl appMetricaImpl = this.appMetrica;
        if (appMetricaImpl != null) {
            appMetricaImpl.activity = (AbstractActivityC0029e) ((c) bVar).f486a;
        }
        InitialDeepLinkHolderImpl initialDeepLinkHolderImpl = this.deeplinkHolder;
        if (initialDeepLinkHolderImpl != null) {
            initialDeepLinkHolderImpl.activity = (AbstractActivityC0029e) ((c) bVar).f486a;
        }
    }

    @Override // L1.b
    public void onDetachedFromEngine(L1.a aVar) {
    }
}
