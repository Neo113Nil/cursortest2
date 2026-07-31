package io.appmetrica.analytics.impl;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.coreutils.internal.toggle.ConjunctiveCompositeThreadSafeToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.OuterStateToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.SavableToggle;
import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public final C2834nf f37679a = Ia.j().x();

    /* renamed from: b, reason: collision with root package name */
    public final SavableToggle f37680b;

    /* renamed from: c, reason: collision with root package name */
    public final OuterStateToggle f37681c;

    /* renamed from: d, reason: collision with root package name */
    public final OuterStateToggle f37682d;

    /* renamed from: e, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f37683e;

    /* renamed from: f, reason: collision with root package name */
    public final ConjunctiveCompositeThreadSafeToggle f37684f;

    /* renamed from: g, reason: collision with root package name */
    public final SavableToggle f37685g;

    public I(C2633fm c2633fm) {
        SavableToggle savableToggle = new SavableToggle("advIdsFromClientApi", new H(this));
        this.f37680b = savableToggle;
        OuterStateToggle outerStateToggle = new OuterStateToggle(false, "GAID-remote-config");
        this.f37681c = outerStateToggle;
        OuterStateToggle outerStateToggle2 = new OuterStateToggle(false, "HOAID-remote-config");
        this.f37682d = outerStateToggle2;
        this.f37683e = new ConjunctiveCompositeThreadSafeToggle(CollectionsKt.listOf((Object[]) new SimpleThreadSafeToggle[]{savableToggle, outerStateToggle}), IronSourceConstants.TYPE_GAID);
        this.f37684f = new ConjunctiveCompositeThreadSafeToggle(CollectionsKt.listOf((Object[]) new SimpleThreadSafeToggle[]{savableToggle, outerStateToggle2}), "HOAID");
        this.f37685g = savableToggle;
        a(c2633fm);
    }

    public final void a(C2633fm c2633fm) {
        boolean z4 = c2633fm.f38994p;
        boolean z5 = true;
        this.f37681c.update(!z4 || c2633fm.f38992n.f37560c);
        OuterStateToggle outerStateToggle = this.f37682d;
        if (z4 && !c2633fm.f38992n.f37562e) {
            z5 = false;
        }
        outerStateToggle.update(z5);
    }

    public final F a() {
        int i4;
        int i5 = 3;
        int i6 = 4;
        if (this.f37683e.getActualState()) {
            i4 = 1;
        } else if (this.f37680b.getActualState()) {
            i4 = !this.f37681c.getActualState() ? 3 : 4;
        } else {
            i4 = 2;
        }
        if (this.f37684f.getActualState()) {
            i5 = 1;
        } else if (!this.f37680b.getActualState()) {
            i5 = 2;
        } else if (this.f37682d.getActualState()) {
            i5 = 4;
        }
        if (this.f37685g.getActualState()) {
            i6 = 1;
        } else if (!this.f37680b.getActualState()) {
            i6 = 2;
        }
        return new F(i4, i5, i6);
    }
}
