package com.squareup.cash.treehouse.platform;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.emoji2.text.MetadataRepo;
import app.cash.redwood.treehouse.EventListener;
import app.cash.redwood.treehouse.RealTreehouseApp;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.treehouse.android.platform.AndroidPlatformServiceFactory;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final class CashTreehouseAppFactory {
    public EventListener.Factory eventListenerFactory;
    public CashTreehouseAppFactoryKt$cashTreehouseAppFactory$1 launcherFactory = CashTreehouseAppFactoryKt$cashTreehouseAppFactory$1.INSTANCE;
    public final boolean loadCodeFromNetworkOnly;
    public AndroidPlatformServiceFactory platformServiceFactory;
    public RealTreehouseApp.Factory treehouseAppFactory;

    public final class LauncherEventListenerFactory implements EventListener.Factory {
        public final ContextScope appScope;
        public EventListener.Factory eventListenerFactory;
        public CashTreehouseAppFactoryKt$cashTreehouseAppFactory$1 launcherFactory;
        public AndroidPlatformServiceFactory platformServiceFactory;

        public LauncherEventListenerFactory(EventListener.Factory factory, AndroidPlatformServiceFactory androidPlatformServiceFactory, CashTreehouseAppFactoryKt$cashTreehouseAppFactory$1 cashTreehouseAppFactoryKt$cashTreehouseAppFactory$1, ContextScope contextScope) {
            factory.getClass();
            androidPlatformServiceFactory.getClass();
            cashTreehouseAppFactoryKt$cashTreehouseAppFactory$1.getClass();
            this.appScope = contextScope;
            this.eventListenerFactory = factory;
            this.platformServiceFactory = androidPlatformServiceFactory;
            this.launcherFactory = cashTreehouseAppFactoryKt$cashTreehouseAppFactory$1;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            EventListener.Factory factory = this.eventListenerFactory;
            if (factory != null) {
                CameraState$Type$EnumUnboxingLocalUtility.m(factory);
            }
            this.eventListenerFactory = null;
            this.platformServiceFactory = null;
            this.launcherFactory = null;
        }

        @Override // app.cash.redwood.treehouse.EventListener.Factory
        public final EventListener create(RealTreehouseApp realTreehouseApp, String str) {
            AndroidPlatformServiceFactory androidPlatformServiceFactory = this.platformServiceFactory;
            if (androidPlatformServiceFactory == null) {
                a$$ExternalSyntheticBUOutline0.m$1("closed");
                return null;
            }
            EventListener.Factory factory = this.eventListenerFactory;
            if (factory == null) {
                a$$ExternalSyntheticBUOutline0.m$1("closed");
                return null;
            }
            if (this.launcherFactory != null) {
                return new MetadataRepo(this.appScope, realTreehouseApp, androidPlatformServiceFactory).wrap(factory.create(realTreehouseApp, str));
            }
            a$$ExternalSyntheticBUOutline0.m$1("closed");
            return null;
        }
    }

    public CashTreehouseAppFactory(RealTreehouseApp.Factory factory, EventListener.Factory factory2, AndroidPlatformServiceFactory androidPlatformServiceFactory, boolean z) {
        this.loadCodeFromNetworkOnly = z;
        this.treehouseAppFactory = factory;
        this.eventListenerFactory = factory2;
        this.platformServiceFactory = androidPlatformServiceFactory;
    }
}
