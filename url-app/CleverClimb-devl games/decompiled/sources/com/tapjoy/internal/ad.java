package com.tapjoy.internal;

import android.view.animation.Animation;

/* loaded from: classes2.dex */
public class ad {

    /* renamed from: a, reason: collision with root package name */
    protected final Animation f7803a;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f7805a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f7806b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f7807c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f7808d = 4;
        private static final /* synthetic */ int[] e = {f7805a, f7806b, f7807c, f7808d};

        public static int[] a() {
            return (int[]) e.clone();
        }
    }

    /* renamed from: com.tapjoy.internal.ad$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7804a = new int[a.a().length];

        static {
            try {
                f7804a[a.f7805a - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7804a[a.f7806b - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7804a[a.f7807c - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7804a[a.f7808d - 1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ad(Animation animation) {
        this.f7803a = animation;
        animation.setDuration(400L);
    }

    public Animation a() {
        return this.f7803a;
    }

    public final ad b() {
        this.f7803a.setDuration(600L);
        return this;
    }
}
