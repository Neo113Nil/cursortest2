package com.squareup.cash.treehouse.android;

import android.os.Trace;
import app.cash.redwood.protocol.ChildrenTag;
import app.cash.redwood.protocol.EventTag;
import app.cash.redwood.protocol.Id;
import app.cash.redwood.protocol.ModifierTag;
import app.cash.redwood.protocol.PropertyTag;
import app.cash.redwood.protocol.WidgetTag;
import app.cash.redwood.treehouse.EventListener;
import app.cash.redwood.treehouse.RealTreehouseApp;
import app.cash.zipline.Call;
import app.cash.zipline.CallResult;
import app.cash.zipline.Zipline;
import app.cash.zipline.ZiplineFunction;
import app.cash.zipline.ZiplineManifest;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.backend.ActivityZiplineManifestWatcher;
import com.squareup.cash.observability.backend.api.SpanTracking;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.types.ErrorReporter;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CoroutineScope;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class RealTreehouseEventListener extends EventListener {

    /* renamed from: app, reason: collision with root package name */
    public final RealTreehouseApp f1217app;
    public String committedAt;
    public int consecutiveCodeLoadFailureCount;
    public int consecutiveDownloadFailureCount;
    public SpanTracking currentCodeLoadSpan;
    public final Factory factory;
    public final String manifestUrl;
    public String manifestVersion;
    public int nextTracingCookie = 1;
    public int unknownChildrenCount;
    public int unknownLayoutModifierCount;
    public int unknownPropertyCount;
    public int unknownWidgetCount;
    public final boolean useNetworkCodeOnly;

    /* loaded from: classes.dex */
    public final class Factory implements EventListener.Factory {
        public final Lazy appStateChangeListenersLazy;
        public final ErrorReporter errorReporter;
        public final RealObservabilityManager observabilityManager;
        public final boolean useNetworkCodeOnlyKeyValue;

        public Factory(CoroutineScope coroutineScope, Lazy lazy, ErrorReporter errorReporter, RealObservabilityManager realObservabilityManager, boolean z) {
            this.appStateChangeListenersLazy = lazy;
            this.errorReporter = errorReporter;
            this.observabilityManager = realObservabilityManager;
            this.useNetworkCodeOnlyKeyValue = z;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
        }

        @Override // app.cash.redwood.treehouse.EventListener.Factory
        public final EventListener create(RealTreehouseApp realTreehouseApp, String str) {
            return new RealTreehouseEventListener(this, realTreehouseApp, str, this.useNetworkCodeOnlyKeyValue);
        }
    }

    public RealTreehouseEventListener(Factory factory, RealTreehouseApp realTreehouseApp, String str, boolean z) {
        this.factory = factory;
        this.f1217app = realTreehouseApp;
        this.manifestUrl = str;
        this.useNetworkCodeOnly = z;
    }

    @Override // app.cash.redwood.treehouse.EventListener
    public final void callEnd(Call call, CallResult callResult, Object obj) {
        call.getClass();
        ZiplineFunction ziplineFunction = call.function;
        if (ziplineFunction.isSuspending()) {
            return;
        }
        String signature = ziplineFunction.getSignature();
        if (Trace.isEnabled()) {
            String take = StringsKt___StringsKt.take(127, "Call " + signature);
            obj.getClass();
            androidx.tracing.Trace.endAsyncSection(take, ((Integer) obj).intValue());
        }
    }

    @Override // app.cash.redwood.treehouse.EventListener
    public final Object callStart(Call call) {
        int i;
        call.getClass();
        ZiplineFunction ziplineFunction = call.function;
        if (ziplineFunction.isSuspending()) {
            return null;
        }
        String signature = ziplineFunction.getSignature();
        if (Trace.isEnabled()) {
            int i2 = this.nextTracingCookie;
            this.nextTracingCookie = i2 + 1;
            androidx.tracing.Trace.beginAsyncSection(StringsKt___StringsKt.take(127, "Call " + signature), i2);
            i = i2;
        } else {
            i = -1;
        }
        return Integer.valueOf(i);
    }

    @Override // app.cash.redwood.treehouse.EventListener
    public final void codeLoadFailed(Exception exc, Object obj) {
        String str = this.f1217app.name;
        exc.getClass();
        SpanTracking spanTracking = this.currentCodeLoadSpan;
        if (spanTracking != null) {
            SpanTracking.spanEnded$default(spanTracking, null, 3);
        }
        this.currentCodeLoadSpan = null;
        int i = this.consecutiveCodeLoadFailureCount;
        this.consecutiveCodeLoadFailureCount = i + 1;
        if (i > 0) {
            return;
        }
        RealObservabilityManager realObservabilityManager = this.factory.observabilityManager;
        Pair pair = new Pair("app", str);
        String str2 = this.manifestUrl;
        realObservabilityManager.reportError("Treehouse: codeLoadFailed", exc, MapsKt__MapsKt.mapOf(pair, new Pair("manifest_url", str2 == null ? "cached" : str2), new Pair("th_event", "codeLoadFailed")));
        Timber.Forest forest = Timber.Forest;
        forest.tag("Treehouse");
        forest.w("Code load failed! app=%s manifestUrl=%s", new Object[]{str, str2}, exc);
    }

    @Override // app.cash.redwood.treehouse.EventListener
    public final void codeLoadSkipped(Object obj) {
        SpanTracking spanTracking = this.currentCodeLoadSpan;
        if (spanTracking != null) {
            SpanTracking.spanEnded$default(spanTracking, null, 3);
        }
        this.currentCodeLoadSpan = null;
    }

    @Override // app.cash.redwood.treehouse.EventListener
    public final void codeLoadSkippedNotFresh(Object obj) {
        SpanTracking spanTracking = this.currentCodeLoadSpan;
        if (spanTracking != null) {
            SpanTracking.spanEnded$default(spanTracking, null, 3);
        }
        this.currentCodeLoadSpan = null;
        Timber.Forest forest = Timber.Forest;
        forest.tag("Treehouse");
        forest.i("Not loading cached code because it isn't fresh app=%s", this.f1217app.name);
    }

    @Override // app.cash.redwood.treehouse.EventListener
    public final Object codeLoadStart() {
        if (this.useNetworkCodeOnly) {
            return null;
        }
        SpanTracking spanTracking = this.currentCodeLoadSpan;
        if (spanTracking != null) {
            SpanTracking.spanEnded$default(spanTracking, null, 3);
            Timber.Forest forest = Timber.Forest;
            forest.tag("Treehouse");
            forest.e(new Exception("unexpected call to codeLoadStart"));
        }
        RealObservabilityManager realObservabilityManager = this.factory.observabilityManager;
        Pair pair = new Pair("app", this.f1217app.name);
        String str = this.manifestUrl;
        if (str == null) {
            str = "cached";
        }
        this.currentCodeLoadSpan = RealObservabilityManager.startTrackingRootSpan$default(realObservabilityManager, "treehouse_code_load", MapsKt__MapsKt.mapOf(pair, new Pair("manifest_url", str)), 8);
        return null;
    }

    @Override // app.cash.redwood.treehouse.EventListener
    public final void codeLoadSuccess(ZiplineManifest ziplineManifest, Zipline zipline, Object obj) {
        ziplineManifest.getClass();
        zipline.getClass();
        if (this.manifestVersion != null) {
            a$$ExternalSyntheticBUOutline0.m$1("multiple calls to codeLoadSuccess?!");
            return;
        }
        this.manifestVersion = ziplineManifest.version;
        this.committedAt = (String) ziplineManifest.metadata.get("committed_at");
        for (ActivityZiplineManifestWatcher activityZiplineManifestWatcher : (Set) this.factory.appStateChangeListenersLazy.getValue()) {
            activityZiplineManifestWatcher.getClass();
            activityZiplineManifestWatcher.latestZiplineManifest = ziplineManifest;
        }
        SpanTracking spanTracking = this.currentCodeLoadSpan;
        if (spanTracking != null) {
            SpanTracking.spanEnded$default(spanTracking, null, 3);
        }
        this.currentCodeLoadSpan = null;
        Timber.Forest forest = Timber.Forest;
        forest.tag("Treehouse");
        forest.i("Code loaded. app=%s manifestUrl=%s manifestVersion=%s", this.f1217app.name, this.manifestUrl, this.manifestVersion);
        this.consecutiveCodeLoadFailureCount = 0;
    }

    @Override // app.cash.redwood.treehouse.EventListener
    public final void codeUnloaded() {
        Timber.Forest forest = Timber.Forest;
        forest.tag("Treehouse");
        forest.i("Code unloaded. app=%s", this.f1217app.name);
    }

    @Override // app.cash.redwood.treehouse.EventListener
    public final void downloadFailed(String str, Exception exc, Object obj) {
        String str2 = this.f1217app.name;
        str.getClass();
        SpanTracking spanTracking = obj instanceof SpanTracking ? (SpanTracking) obj : null;
        if (spanTracking != null) {
            SpanTracking.spanEnded$default(spanTracking, null, 3);
        }
        int i = this.consecutiveDownloadFailureCount;
        this.consecutiveDownloadFailureCount = i + 1;
        if (i > 0) {
            return;
        }
        this.factory.observabilityManager.reportError("Treehouse: downloadFailed", exc, MapsKt__MapsKt.mapOf(new Pair("app", str2), new Pair("url", str), new Pair("th_event", "downloadFailed")));
        Timber.Forest forest = Timber.Forest;
        forest.tag("Treehouse");
        forest.w("Download failed! app=%s url=%s", new Object[]{str2, str}, exc);
    }

    @Override // app.cash.redwood.treehouse.EventListener
    public final Object downloadStart(String str) {
        str.getClass();
        SpanTracking spanTracking = this.currentCodeLoadSpan;
        if (spanTracking != null) {
            return SpanTracking.childSpanStarted$default(spanTracking, null, "treehouse_download", MapsKt__MapsKt.mapOf(new Pair("app", this.f1217app.name), new Pair("url", str)), 8);
        }
        return null;
    }

    @Override // app.cash.redwood.treehouse.EventListener
    public final void downloadSuccess(Object obj, String str) {
        str.getClass();
        SpanTracking spanTracking = obj instanceof SpanTracking ? (SpanTracking) obj : null;
        if (spanTracking != null) {
            SpanTracking.spanEnded$default(spanTracking, null, 3);
        }
        this.consecutiveDownloadFailureCount = 0;
    }

    @Override // app.cash.redwood.treehouse.EventListener
    public final void manifestParseFailed(Exception exc) {
        RealObservabilityManager realObservabilityManager = this.factory.observabilityManager;
        String str = this.f1217app.name;
        Pair pair = new Pair("app", str);
        String str2 = this.manifestUrl;
        realObservabilityManager.reportError("Treehouse: manifestParseFailed", exc, MapsKt__MapsKt.mapOf(pair, new Pair("manifest_url", str2 == null ? "cached" : str2), new Pair("th_event", "manifestParseFailed")));
        Timber.Forest forest = Timber.Forest;
        forest.tag("Treehouse");
        forest.e("Manifest parse failed! app=%s url=%s", new Object[]{str, str2}, exc);
    }

    @Override // app.cash.redwood.treehouse.EventListener
    public final void manifestVerified(ZiplineManifest ziplineManifest, String str) {
        ziplineManifest.getClass();
        Timber.Forest forest = Timber.Forest;
        forest.tag("Treehouse");
        forest.i("Manifest verified. app=%s manifestUrl=%s verifiedKey=%s", this.f1217app.name, this.manifestUrl, str);
    }

    @Override // app.cash.redwood.treehouse.EventListener
    public final void moduleLoadEnd(Object obj, String str) {
        str.getClass();
        SpanTracking spanTracking = obj instanceof SpanTracking ? (SpanTracking) obj : null;
        if (spanTracking != null) {
            SpanTracking.spanEnded$default(spanTracking, null, 3);
        }
    }

    @Override // app.cash.redwood.treehouse.EventListener
    public final Object moduleLoadStart(String str) {
        str.getClass();
        SpanTracking spanTracking = this.currentCodeLoadSpan;
        if (spanTracking != null) {
            return SpanTracking.childSpanStarted$default(spanTracking, null, "treehouse_module_load", MapsKt__MapsKt.mapOf(new Pair("app", this.f1217app.name), new Pair("module_id", str)), 8);
        }
        return null;
    }

    @Override // app.cash.redwood.treehouse.EventListener
    public final void uncaughtException(Throwable th) {
        th.getClass();
        Factory factory = this.factory;
        RealObservabilityManager realObservabilityManager = factory.observabilityManager;
        String str = this.f1217app.name;
        Pair pair = new Pair("app", str);
        String str2 = this.manifestVersion;
        if (str2 == null) {
            str2 = "local";
        }
        realObservabilityManager.reportError("Treehouse: uncaughtException", th, MapsKt__MapsKt.mapOf(pair, new Pair("guest_app_version", str2), new Pair("th_event", "uncaughtException")));
        ErrorReporter errorReporter = factory.errorReporter;
        String str3 = this.manifestVersion;
        errorReporter.report(new UncaughtTreehouseException(str, str3 != null ? str3 : "local", this.committedAt, th), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
    }

    @Override // app.cash.redwood.treehouse.EventListener
    /* renamed from: unknownChildren-iETOA3M */
    public final void mo1391unknownChildreniETOA3M(int i, int i2) {
        int i3 = this.unknownChildrenCount;
        this.unknownChildrenCount = i3 + 1;
        if (i3 > 0) {
            return;
        }
        Timber.Forest forest = Timber.Forest;
        forest.tag("Treehouse");
        forest.w("Unknown children ignored! app=%s widgetTag=%s, tag=%s", this.f1217app.name, new WidgetTag(i), new ChildrenTag(i2));
    }

    @Override // app.cash.redwood.treehouse.EventListener
    /* renamed from: unknownEvent-_LM6m-c */
    public final void mo1392unknownEvent_LM6mc(int i, int i2) {
        Timber.Forest forest = Timber.Forest;
        forest.tag("Treehouse");
        forest.w("Unknown event ignored! app=%s widget=%s tag=%s", this.f1217app.name, new WidgetTag(i), new EventTag(i2));
    }

    @Override // app.cash.redwood.treehouse.EventListener
    /* renamed from: unknownEventNode-1ccMwuE */
    public final void mo1393unknownEventNode1ccMwuE(int i, int i2) {
        Timber.Forest forest = Timber.Forest;
        forest.tag("Treehouse");
        forest.i("Event for a since-removed node was dropped. app=%s id=%s tag=%s", this.f1217app.name, new Id(i), new EventTag(i2));
    }

    @Override // app.cash.redwood.treehouse.EventListener
    /* renamed from: unknownModifier-nx0wl1g */
    public final void mo1394unknownModifiernx0wl1g(int i) {
        int i2 = this.unknownLayoutModifierCount;
        this.unknownLayoutModifierCount = i2 + 1;
        if (i2 > 0) {
            return;
        }
        Timber.Forest forest = Timber.Forest;
        forest.tag("Treehouse");
        forest.w("Unknown layout modifier ignored! app=%s tag=%s", this.f1217app.name, new ModifierTag(i));
    }

    @Override // app.cash.redwood.treehouse.EventListener
    /* renamed from: unknownProperty-LKUuuww */
    public final void mo1395unknownPropertyLKUuuww(int i, int i2) {
        int i3 = this.unknownPropertyCount;
        this.unknownPropertyCount = i3 + 1;
        if (i3 > 0) {
            return;
        }
        Timber.Forest forest = Timber.Forest;
        forest.tag("Treehouse");
        forest.w("Unknown property ignored! app=%s widgetTag=%s, tag=%s", this.f1217app.name, new WidgetTag(i), new PropertyTag(i2));
    }

    @Override // app.cash.redwood.treehouse.EventListener
    /* renamed from: unknownWidget-WCEpcRY */
    public final void mo1396unknownWidgetWCEpcRY(int i) {
        int i2 = this.unknownWidgetCount;
        this.unknownWidgetCount = i2 + 1;
        if (i2 > 0) {
            return;
        }
        Timber.Forest forest = Timber.Forest;
        forest.tag("Treehouse");
        forest.w("Unknown widget ignored! app=%s tag=%s", this.f1217app.name, new WidgetTag(i));
    }
}
