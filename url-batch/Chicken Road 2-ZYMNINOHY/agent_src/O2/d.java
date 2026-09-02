package O2;

import T.C0086d;
import W.J;
import W.n;
import W.r;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import c0.C0267A;
import c0.C0270c;
import c0.C0271d;
import c0.C0272e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2046a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2047b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2048c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2049d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f2050e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f2051f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f2052g;

    /* renamed from: h, reason: collision with root package name */
    public Object f2053h;

    /* renamed from: i, reason: collision with root package name */
    public Object f2054i;

    /* renamed from: j, reason: collision with root package name */
    public Object f2055j;

    public d() {
        this.f2047b = new HashMap();
        this.f2048c = new HashMap();
        this.f2049d = new HashMap();
        this.f2051f = new HashSet();
        this.f2052g = new HashSet();
        this.f2053h = new HashSet();
        this.f2050e = new HashMap();
        this.f2054i = new HashSet();
        this.f2055j = new WeakHashMap();
    }

    public void a(C0270c c0270c) {
        if (!this.f2046a || c0270c.equals((C0270c) this.f2053h)) {
            return;
        }
        this.f2053h = c0270c;
        C0267A c0267a = (C0267A) ((D0.a) this.f2048c).f331b;
        c0267a.f();
        C0270c c0270c2 = c0267a.f5404g;
        if (c0270c2 == null || c0270c.equals(c0270c2)) {
            return;
        }
        c0267a.f5404g = c0270c;
        n nVar = c0267a.f5402e;
        if (nVar != null) {
            nVar.e(-1, new b0.c(13));
        }
    }

    public d(Context context, D0.a aVar, C0086d c0086d, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.f2047b = applicationContext;
        this.f2048c = aVar;
        this.f2055j = c0086d;
        this.f2054i = audioDeviceInfo;
        String str = J.f3263a;
        Looper myLooper = Looper.myLooper();
        Handler handler = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, null);
        this.f2049d = handler;
        this.f2050e = new C0271d(this);
        this.f2051f = new r(1, this);
        C0270c c0270c = C0270c.f5542c;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f2052g = uriFor != null ? new C0272e(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }
}
