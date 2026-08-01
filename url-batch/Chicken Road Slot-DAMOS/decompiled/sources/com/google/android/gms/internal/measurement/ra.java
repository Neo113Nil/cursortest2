package com.google.android.gms.internal.measurement;

import android.accounts.Account;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class ra {

    /* renamed from: a, reason: collision with root package name */
    public Object f2737a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2738b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2739c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2740d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2741e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2742f;

    public ra(f8.y yVar) {
        long j = Integer.MIN_VALUE;
        this.f2738b = new AtomicLong((j & 4294967295L) | (j << 32));
        this.f2739c = new AtomicReference(null);
        this.f2740d = new AtomicReference(null);
        f8.d0 d0Var = f8.d0.f4128d;
        this.f2741e = new f8.w0(d0Var);
        f8.x0 x0Var = new f8.x0();
        this.f2742f = x0Var;
        xc xcVar = new xc();
        xcVar.f2983e = yVar;
        xcVar.f2984i = d0Var;
        this.f2737a = xcVar;
        x0Var.a(xcVar, d0Var);
    }

    public static boolean b(int[] iArr, int i3) {
        for (int i10 : iArr) {
            if (i10 == i3) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList d(Context context, int i3) {
        int c10 = m.o1.c(context, R.attr.colorControlHighlight);
        int b10 = m.o1.b(context, R.attr.colorButtonNormal);
        int[] iArr = m.o1.f6147b;
        int[] iArr2 = m.o1.f6149d;
        int b11 = h3.a.b(c10, i3);
        return new ColorStateList(new int[][]{iArr, iArr2, m.o1.f6148c, m.o1.f6151f}, new int[]{b10, b11, h3.a.b(c10, i3), i3});
    }

    public static LayerDrawable e(m.j1 j1Var, Context context, int i3) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i3);
        Drawable d10 = j1Var.d(context, R.drawable.abc_star_black_48dp);
        Drawable d11 = j1Var.d(context, R.drawable.abc_star_half_black_48dp);
        if ((d10 instanceof BitmapDrawable) && d10.getIntrinsicWidth() == dimensionPixelSize && d10.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) d10;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            d10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            d10.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((d11 instanceof BitmapDrawable) && d11.getIntrinsicWidth() == dimensionPixelSize && d11.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) d11;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            d11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            d11.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void h(Drawable drawable, int i3, PorterDuff.Mode mode) {
        PorterDuffColorFilter f3;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = m.o.f6141b;
        }
        PorterDuff.Mode mode2 = m.o.f6141b;
        synchronized (m.o.class) {
            f3 = m.j1.f(i3, mode);
        }
        mutate.setColorFilter(f3);
    }

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.f2742f;
        if (hashMap != null) {
            hashMap.put(str, str2);
        } else {
            kotlin.collections.i0.l("Property \"autoMetadata\" has not been set");
        }
    }

    public k6.h c() {
        String str = ((String) this.f2737a) == null ? " transportName" : "";
        if (((k6.k) this.f2739c) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f2740d) == null) {
            str = str.concat(" eventMillis");
        }
        if (((Long) this.f2741e) == null) {
            str = str.concat(" uptimeMillis");
        }
        if (((HashMap) this.f2742f) == null) {
            str = str.concat(" autoMetadata");
        }
        if (str.isEmpty()) {
            return new k6.h((String) this.f2737a, (Integer) this.f2738b, (k6.k) this.f2739c, ((Long) this.f2740d).longValue(), ((Long) this.f2741e).longValue(), (HashMap) this.f2742f);
        }
        kotlin.collections.i0.l("Missing required properties:".concat(str));
        return null;
    }

    public ColorStateList f(Context context, int i3) {
        if (i3 == R.drawable.abc_edit_text_material) {
            return z4.w.t(context, R.color.abc_tint_edittext);
        }
        if (i3 == 2131165251) {
            return z4.w.t(context, R.color.abc_tint_switch_track);
        }
        if (i3 != R.drawable.abc_switch_thumb_material) {
            if (i3 == R.drawable.abc_btn_default_mtrl_shape) {
                return d(context, m.o1.c(context, R.attr.colorButtonNormal));
            }
            if (i3 == R.drawable.abc_btn_borderless_material) {
                return d(context, 0);
            }
            if (i3 == R.drawable.abc_btn_colored_material) {
                return d(context, m.o1.c(context, R.attr.colorAccent));
            }
            if (i3 == 2131165246 || i3 == R.drawable.abc_spinner_textfield_background_material) {
                return z4.w.t(context, R.color.abc_tint_spinner);
            }
            if (b((int[]) this.f2738b, i3)) {
                return m.o1.d(context, R.attr.colorControlNormal);
            }
            if (b((int[]) this.f2741e, i3)) {
                return z4.w.t(context, R.color.abc_tint_default);
            }
            if (b((int[]) this.f2742f, i3)) {
                return z4.w.t(context, R.color.abc_tint_btn_checkable);
            }
            if (i3 == R.drawable.abc_seekbar_thumb_material) {
                return z4.w.t(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d10 = m.o1.d(context, R.attr.colorSwitchThumbNormal);
        if (d10 == null || !d10.isStateful()) {
            iArr[0] = m.o1.f6147b;
            iArr2[0] = m.o1.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = m.o1.f6150e;
            iArr2[1] = m.o1.c(context, R.attr.colorControlActivated);
            iArr[2] = m.o1.f6151f;
            iArr2[2] = m.o1.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = m.o1.f6147b;
            iArr[0] = iArr3;
            iArr2[0] = d10.getColorForState(iArr3, 0);
            iArr[1] = m.o1.f6150e;
            iArr2[1] = m.o1.c(context, R.attr.colorControlActivated);
            iArr[2] = m.o1.f6151f;
            iArr2[2] = d10.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0157 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void g(String str, Bundle bundle, boolean z10) {
        String str2;
        String str3;
        u8.f fVar;
        boolean e2;
        int i3;
        bundle.putString("scope", "*");
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        g8.g gVar = (g8.g) this.f2737a;
        gVar.a();
        bundle.putString("gmp_app_id", gVar.f4302c.f4314b);
        bundle.putString("gmsv", Integer.toString(((b1.m) this.f2738b).d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((b1.m) this.f2738b).b());
        b1.m mVar = (b1.m) this.f2738b;
        synchronized (mVar) {
            try {
                if (((String) mVar.f1011e) == null) {
                    mVar.g();
                }
                str2 = (String) mVar.f1011e;
            } finally {
            }
        }
        bundle.putString("app_ver_name", str2);
        g8.g gVar2 = (g8.g) this.f2737a;
        gVar2.a();
        try {
            str3 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar2.f4301b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str3 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str3);
        if (z10) {
            g8.g gVar3 = (g8.g) this.f2737a;
            gVar3.a();
            bundle.putString("Goog-Api-Key", gVar3.f4302c.f4313a);
        }
        try {
            String str4 = ((x8.a) z4.w.f(((x8.c) ((x8.d) this.f2742f)).d())).f10541a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException e9) {
            e = e9;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString(AppsFlyerProperties.APP_ID, (String) z4.w.f(((x8.c) ((x8.d) this.f2742f)).c()));
            bundle.putString("cliv", "fcm-25.1.0");
            fVar = (u8.f) ((w8.a) this.f2741e).get();
            d9.b bVar = (d9.b) ((w8.a) this.f2740d).get();
            if (fVar == null) {
                return;
            } else {
                return;
            }
        } catch (ExecutionException e10) {
            e = e10;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString(AppsFlyerProperties.APP_ID, (String) z4.w.f(((x8.c) ((x8.d) this.f2742f)).c()));
            bundle.putString("cliv", "fcm-25.1.0");
            fVar = (u8.f) ((w8.a) this.f2741e).get();
            d9.b bVar2 = (d9.b) ((w8.a) this.f2740d).get();
            if (fVar == null) {
            }
        }
        bundle.putString(AppsFlyerProperties.APP_ID, (String) z4.w.f(((x8.c) ((x8.d) this.f2742f)).c()));
        bundle.putString("cliv", "fcm-25.1.0");
        fVar = (u8.f) ((w8.a) this.f2741e).get();
        d9.b bVar22 = (d9.b) ((w8.a) this.f2740d).get();
        if (fVar == null || bVar22 == null) {
            return;
        }
        u8.c cVar = (u8.c) fVar;
        synchronized (cVar) {
            long currentTimeMillis = System.currentTimeMillis();
            u8.g gVar4 = (u8.g) cVar.f9686a.get();
            synchronized (gVar4) {
                e2 = gVar4.e(u8.g.f9696b, currentTimeMillis);
            }
            if (e2) {
                synchronized (gVar4) {
                    gVar4.f9699a.a(new a1.d(gVar4, u8.g.b(System.currentTimeMillis())));
                }
                i3 = 3;
            } else {
                i3 = 1;
            }
        }
        if (i3 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(a4.i.b(i3)));
            bundle.putString("Firebase-Client", bVar22.a());
        }
    }

    public f8.r i() {
        AtomicLong atomicLong;
        long j;
        final int i3;
        ListenableFuture listenableFuture;
        Executor executor = f8.d0.f4128d;
        f8.x0 x0Var = (f8.x0) this.f2742f;
        if (x0Var.isDone()) {
            return x0Var;
        }
        do {
            atomicLong = (AtomicLong) this.f2738b;
            j = atomicLong.get();
            i3 = (int) (j >>> 32);
        } while (!atomicLong.compareAndSet(j, ((((int) j) + 1) & 4294967295L) | (i3 << 32)));
        AtomicReference atomicReference = (AtomicReference) this.f2740d;
        f8.x0 x0Var2 = new f8.x0();
        ListenableFuture listenableFuture2 = (ListenableFuture) atomicReference.getAndSet(x0Var2);
        if (listenableFuture2 == null) {
            l5 a9 = cg.a(new bf(i3, this));
            f8.z0 z0Var = new f8.z0();
            z0Var.f4204w = new f8.y0(z0Var, a9);
            executor.execute(z0Var);
            listenableFuture = z0Var;
        } else {
            f8.z zVar = new f8.z() { // from class: com.google.android.gms.internal.measurement.af
                @Override // f8.z
                public final /* synthetic */ ListenableFuture apply(Object obj) {
                    return ra.this.m(i3);
                }
            };
            int i10 = cg.f2205a;
            listenableFuture = f8.l0.a(listenableFuture2, Throwable.class, new dd(4, mf.a(), zVar), (f8.w0) this.f2741e);
        }
        x0Var2.n(listenableFuture);
        df dfVar = new df(this, i3);
        x0Var2.a(new cf(this, x0Var2, dfVar, 0), executor);
        return dfVar;
    }

    public void j(String str) {
        oa.e(de.f2235a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        oa.e(!de.f2237c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.f2739c = str;
    }

    public void k(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = de.f2235a;
        this.f2741e = str;
    }

    public Uri l() {
        String p4;
        String str = (String) this.f2738b;
        String str2 = (String) this.f2739c;
        Account account = ae.f2145a;
        Account account2 = (Account) this.f2740d;
        oa.e(account2.type.indexOf(58) == -1, "Account type contains ':'.", new Object[0]);
        oa.e(account2.type.indexOf(47) == -1, "Account type contains '/'.", new Object[0]);
        oa.e(account2.name.indexOf(47) == -1, "Account name contains '/'.", new Object[0]);
        if (ae.f2145a.equals(account2)) {
            p4 = "shared";
        } else {
            String str3 = account2.type;
            String str4 = account2.name;
            p4 = v4.a.p(new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length()), str3, ":", str4);
        }
        String str5 = (String) this.f2741e;
        StringBuilder sb2 = new StringBuilder(p4.length() + str2.length() + str.length() + 2 + 1 + 1 + String.valueOf(str5).length());
        n0.l.l(sb2, "/", str, "/", str2);
        sb2.append("/");
        sb2.append(p4);
        sb2.append("/");
        sb2.append(str5);
        return new Uri.Builder().scheme("android").authority((String) this.f2737a).path(sb2.toString()).encodedFragment(le.a(((b8.c) this.f2742f).c())).build();
    }

    public f8.r m(int i3) {
        f8.d0 d0Var;
        AtomicLong atomicLong = (AtomicLong) this.f2738b;
        if (((int) (atomicLong.get() >>> 32)) > i3) {
            f8.m0 m0Var = f8.m0.f4156v;
            return m0Var != null ? m0Var : new f8.m0();
        }
        ef efVar = new ef(i3);
        while (true) {
            AtomicReference atomicReference = (AtomicReference) this.f2739c;
            ef efVar2 = (ef) atomicReference.get();
            if (efVar2 != null && efVar2.f2264v > i3) {
                f8.m0 m0Var2 = f8.m0.f4156v;
                return m0Var2 != null ? m0Var2 : new f8.m0();
            }
            while (!atomicReference.compareAndSet(efVar2, efVar)) {
                if (atomicReference.get() != efVar2) {
                    break;
                }
            }
            if (((int) (atomicLong.get() >>> 32)) > i3) {
                efVar.cancel(true);
                while (!atomicReference.compareAndSet(efVar, null) && atomicReference.get() == efVar) {
                }
                return efVar;
            }
            xc xcVar = (xc) this.f2737a;
            f8.y yVar = (f8.y) xcVar.f2983e;
            if (yVar == null || (d0Var = (f8.d0) xcVar.f2984i) == null) {
                efVar.n((f8.x0) this.f2742f);
                return efVar;
            }
            l5 a9 = cg.a(yVar);
            f8.z0 z0Var = new f8.z0();
            z0Var.f4204w = new f8.y0(z0Var, a9);
            d0Var.execute(z0Var);
            efVar.n(z0Var);
            return efVar;
        }
    }

    public ra(Context context) {
        this.f2738b = "files";
        this.f2739c = "common";
        this.f2740d = de.f2236b;
        this.f2741e = "";
        b8.d dVar = b8.g.f1423e;
        this.f2742f = new b8.c(4);
        oa.e(context != null, "Context cannot be null", new Object[0]);
        this.f2737a = context.getPackageName();
    }
}
