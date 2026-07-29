package com.facebook.ads.internal.q.a;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

/* loaded from: classes.dex */
public class q implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    private final View f5424a;

    /* renamed from: b, reason: collision with root package name */
    private int f5425b;

    /* renamed from: c, reason: collision with root package name */
    private Window f5426c;

    /* renamed from: d, reason: collision with root package name */
    private a f5427d = a.DEFAULT;
    private final Runnable e = new Runnable() { // from class: com.facebook.ads.internal.q.a.q.1
        @Override // java.lang.Runnable
        public void run() {
            q.this.a(false);
        }
    };

    /* renamed from: com.facebook.ads.internal.q.a.q$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5429a = new int[a.values().length];

        static {
            try {
                f5429a[a.FULL_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public enum a {
        DEFAULT,
        FULL_SCREEN
    }

    public q(View view) {
        this.f5424a = view;
        this.f5424a.setOnSystemUiVisibilityChangeListener(this);
    }

    private void a(int i, boolean z) {
        int i2;
        if (this.f5426c == null) {
            return;
        }
        WindowManager.LayoutParams attributes = this.f5426c.getAttributes();
        if (z) {
            i2 = i | attributes.flags;
        } else {
            i2 = (i ^ (-1)) & attributes.flags;
        }
        attributes.flags = i2;
        this.f5426c.setAttributes(attributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z) {
        if (a.DEFAULT.equals(this.f5427d)) {
            return;
        }
        int i = z ? 3840 : 3847;
        Handler handler = this.f5424a.getHandler();
        if (handler != null && z) {
            handler.removeCallbacks(this.e);
            handler.postDelayed(this.e, 2000L);
        }
        this.f5424a.setSystemUiVisibility(i);
    }

    public void a() {
        this.f5426c = null;
    }

    public void a(Window window) {
        this.f5426c = window;
    }

    public void a(a aVar) {
        this.f5427d = aVar;
        if (AnonymousClass2.f5429a[this.f5427d.ordinal()] != 1) {
            a(67108864, false);
            a(134217728, false);
            this.f5424a.setSystemUiVisibility(0);
        } else {
            a(67108864, true);
            a(134217728, true);
            a(false);
        }
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public void onSystemUiVisibilityChange(int i) {
        int i2 = this.f5425b ^ i;
        this.f5425b = i;
        if ((i2 & 2) == 0 || (i & 2) != 0) {
            return;
        }
        a(true);
    }
}
