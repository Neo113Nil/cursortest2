package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.location.Location;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.AnrListener;
import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class Sc extends C3018ui implements InterfaceC2569db {
    @Override // io.appmetrica.analytics.impl.InterfaceC2569db
    public final void a(Activity activity) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db
    public final void b(Activity activity) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db
    public final void c() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db
    public final List<String> f() {
        return new ArrayList();
    }

    @Override // io.appmetrica.analytics.impl.C3018ui, io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(@NonNull AdRevenue adRevenue, boolean z4) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull PluginErrorDetails pluginErrorDetails, String str) {
    }

    @Override // io.appmetrica.analytics.impl.C3018ui, io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(@NonNull ModuleEvent moduleEvent) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(@NonNull PluginErrorDetails pluginErrorDetails) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db, io.appmetrica.analytics.impl.InterfaceC2544cd
    public final void a(Location location) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db
    public final void b(@NonNull String str) {
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(@NonNull String str, String str2, PluginErrorDetails pluginErrorDetails) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db
    public final void a(@NonNull AnrListener anrListener) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db, io.appmetrica.analytics.impl.Ya
    public final void b(@NonNull String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db
    public final void a(@NonNull ExternalAttribution externalAttribution) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db, io.appmetrica.analytics.impl.InterfaceC2544cd
    public final void b(boolean z4) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db
    public final void a(@NonNull Do r12) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db, io.appmetrica.analytics.impl.Ya
    public final boolean b() {
        return false;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db
    public final void a(@NonNull EnumC2792m enumC2792m) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db, io.appmetrica.analytics.impl.Ya
    public final void a(@NonNull String str) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db, io.appmetrica.analytics.impl.InterfaceC2544cd
    public final void a(String str, String str2) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db
    public final void a(@NonNull String str, boolean z4) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2569db, io.appmetrica.analytics.impl.InterfaceC2544cd
    public final void a(boolean z4) {
    }
}
