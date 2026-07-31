package com.yandex.mobile.ads.impl;

import android.media.AudioAttributes;
import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.InterfaceC2259tl;

/* renamed from: com.yandex.mobile.ads.impl.ch, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1856ch implements InterfaceC2259tl {

    /* renamed from: h, reason: collision with root package name */
    public static final C1856ch f24207h = new C1856ch(0, 0, 1, 1, 0);

    /* renamed from: b, reason: collision with root package name */
    public final int f24208b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24209c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24210d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24211e;

    /* renamed from: f, reason: collision with root package name */
    public final int f24212f;

    /* renamed from: g, reason: collision with root package name */
    private c f24213g;

    /* renamed from: com.yandex.mobile.ads.impl.ch$a */
    private static final class a {
        public static void a(AudioAttributes.Builder builder, int i4) {
            builder.setAllowedCapturePolicy(i4);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ch$b */
    private static final class b {
        public static void a(AudioAttributes.Builder builder, int i4) {
            builder.setSpatializationBehavior(i4);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ch$c */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final AudioAttributes f24214a;

        private c(C1856ch c1856ch) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c1856ch.f24208b).setFlags(c1856ch.f24209c).setUsage(c1856ch.f24210d);
            int i4 = u82.f32873a;
            if (i4 >= 29) {
                a.a(usage, c1856ch.f24211e);
            }
            if (i4 >= 32) {
                b.a(usage, c1856ch.f24212f);
            }
            this.f24214a = usage.build();
        }
    }

    static {
        new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.K0
            @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
            public final InterfaceC2259tl fromBundle(Bundle bundle) {
                C1856ch a4;
                a4 = C1856ch.a(bundle);
                return a4;
            }
        };
    }

    private C1856ch(int i4, int i5, int i6, int i7, int i8) {
        this.f24208b = i4;
        this.f24209c = i5;
        this.f24210d = i6;
        this.f24211e = i7;
        this.f24212f = i8;
    }

    public final c a() {
        if (this.f24213g == null) {
            this.f24213g = new c();
        }
        return this.f24213g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1856ch.class == obj.getClass()) {
            C1856ch c1856ch = (C1856ch) obj;
            if (this.f24208b == c1856ch.f24208b && this.f24209c == c1856ch.f24209c && this.f24210d == c1856ch.f24210d && this.f24211e == c1856ch.f24211e && this.f24212f == c1856ch.f24212f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f24208b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f24209c) * 31) + this.f24210d) * 31) + this.f24211e) * 31) + this.f24212f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static C1856ch a(Bundle bundle) {
        return new C1856ch(bundle.containsKey(Integer.toString(0, 36)) ? bundle.getInt(Integer.toString(0, 36)) : 0, bundle.containsKey(Integer.toString(1, 36)) ? bundle.getInt(Integer.toString(1, 36)) : 0, bundle.containsKey(Integer.toString(2, 36)) ? bundle.getInt(Integer.toString(2, 36)) : 1, bundle.containsKey(Integer.toString(3, 36)) ? bundle.getInt(Integer.toString(3, 36)) : 1, bundle.containsKey(Integer.toString(4, 36)) ? bundle.getInt(Integer.toString(4, 36)) : 0);
    }
}
