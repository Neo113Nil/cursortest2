package com.chartboost.sdk.privacy.model;

import com.chartboost.sdk.impl.ci;
import com.chartboost.sdk.impl.fi;
import com.chartboost.sdk.impl.mi;
import com.chartboost.sdk.impl.pi;
import com.chartboost.sdk.impl.q7;
import com.chartboost.sdk.impl.s5;
import com.chartboost.sdk.impl.si;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u000b\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010*\u001a\u00020\u0002¢\u0006\u0004\b+\u0010,J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\fJ\u0014\u0010\u000b\u001a\u00020\t*\u00020\tH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\u0017J\u0014\u0010\r\u001a\u00020\t*\u00020\tH\u0096\u0001¢\u0006\u0004\b\r\u0010\u0017J\u0014\u0010\u0010\u001a\u00020\u000e*\u00020\u000eH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0018J\u0014\u0010\u0014\u001a\u00020\u0012*\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0019J\u0014\u0010\u0016\u001a\u00020\t*\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u0004¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010!\u001a\u00020\u00038\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b\u001d\u0010\u001cR\"\u0010'\u001a\u00020\"8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b\u001b\u0010%\"\u0004\b\u001b\u0010&R\u0014\u0010)\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010 ¨\u0006-"}, d2 = {"Lcom/chartboost/sdk/privacy/model/GenericDataUseConsent;", "Lcom/chartboost/sdk/privacy/model/DataUseConsent;", "Lcom/chartboost/sdk/impl/q7;", "", "type", "location", "", "clear", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/chartboost/sdk/impl/pi;", "event", "clearFromStorage", "(Lcom/chartboost/sdk/impl/pi;)V", "persist", "Lcom/chartboost/sdk/impl/mi;", "config", ToolBar.REFRESH, "(Lcom/chartboost/sdk/impl/mi;)V", "Lcom/chartboost/sdk/impl/ci;", "ad", "store", "(Lcom/chartboost/sdk/impl/ci;)V", "track", "(Lcom/chartboost/sdk/impl/pi;)Lcom/chartboost/sdk/impl/pi;", "(Lcom/chartboost/sdk/impl/mi;)Lcom/chartboost/sdk/impl/mi;", "(Lcom/chartboost/sdk/impl/ci;)Lcom/chartboost/sdk/impl/ci;", "msg", "a", "(Ljava/lang/String;)V", "b", "Ljava/lang/String;", "getPrivacyStandardName", "()Ljava/lang/String;", "privacyStandardName", "", "c", "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "consentValue", "getPrivacyStandard", "privacyStandard", "eventTracker", "<init>", "(Lcom/chartboost/sdk/impl/q7;)V", "ChartboostMonetization-9.12.1_productionRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class GenericDataUseConsent implements DataUseConsent, q7 {
    public final /* synthetic */ q7 a;

    /* renamed from: b, reason: from kotlin metadata */
    public String privacyStandardName;

    /* renamed from: c, reason: from kotlin metadata */
    public Object consentValue;

    /* JADX WARN: Multi-variable type inference failed */
    public GenericDataUseConsent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: a, reason: from getter */
    public final Object getConsentValue() {
        return this.consentValue;
    }

    public final void b(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.privacyStandardName = str;
    }

    @Override // com.chartboost.sdk.impl.p7
    public void clear(@NotNull String type, @NotNull String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.a.clear(type, location);
    }

    @Override // com.chartboost.sdk.impl.q7
    @NotNull
    public pi clearFromStorage(@NotNull pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.a.clearFromStorage(piVar);
    }

    @Override // com.chartboost.sdk.privacy.model.DataUseConsent
    @NotNull
    /* renamed from: getPrivacyStandard, reason: from getter */
    public String getPrivacyStandardName() {
        return this.privacyStandardName;
    }

    @Override // com.chartboost.sdk.impl.q7
    @NotNull
    public pi persist(@NotNull pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.a.persist(piVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    @NotNull
    public mi refresh(@NotNull mi miVar) {
        Intrinsics.checkNotNullParameter(miVar, "<this>");
        return this.a.refresh(miVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    @NotNull
    public ci store(@NotNull ci ciVar) {
        Intrinsics.checkNotNullParameter(ciVar, "<this>");
        return this.a.store(ciVar);
    }

    @Override // com.chartboost.sdk.impl.q7
    @NotNull
    public pi track(@NotNull pi piVar) {
        Intrinsics.checkNotNullParameter(piVar, "<this>");
        return this.a.track(piVar);
    }

    public GenericDataUseConsent(@NotNull q7 eventTracker) {
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.a = eventTracker;
        this.privacyStandardName = "";
        this.consentValue = "";
    }

    public final void a(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<set-?>");
        this.consentValue = obj;
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: clearFromStorage */
    public void mo3218clearFromStorage(@NotNull pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.a.mo3218clearFromStorage(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: persist */
    public void mo3219persist(@NotNull pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.a.mo3219persist(event);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: refresh */
    public void mo3220refresh(@NotNull mi config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.a.mo3220refresh(config);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: store */
    public void mo3221store(@NotNull ci ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.a.mo3221store(ad);
    }

    @Override // com.chartboost.sdk.impl.p7
    /* renamed from: track */
    public void mo3222track(@NotNull pi event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.a.mo3222track(event);
    }

    public final void a(String msg) {
        try {
            track((pi) new s5(si.d.e, msg == null ? "no message" : msg, "", "", null, null, 48, null));
            throw new Exception(msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public /* synthetic */ GenericDataUseConsent(q7 q7Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? fi.a() : q7Var);
    }
}
