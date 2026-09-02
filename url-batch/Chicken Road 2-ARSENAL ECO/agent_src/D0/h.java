package D0;

import H1.v;
import X5.u;
import a.AbstractC0219a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.lifecycle.AbstractC0248o;
import com.strategylink.Row.Five.R;
import h.AbstractC0401a;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import k.AbstractC0441C;
import k.C0456o;
import k.T;
import k.k0;
import k5.C0477g;
import l5.AbstractC0507k;
import l5.t;
import n6.y;
import u0.C0673c;
import w.AbstractC0708a;
import y1.C0759c;

/* loaded from: classes.dex */
public final class h implements L3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f329a;

    /* renamed from: b, reason: collision with root package name */
    public Object f330b;

    /* renamed from: c, reason: collision with root package name */
    public Object f331c;

    /* renamed from: d, reason: collision with root package name */
    public Object f332d;

    /* renamed from: e, reason: collision with root package name */
    public Object f333e;

    /* renamed from: f, reason: collision with root package name */
    public Object f334f;

    /* renamed from: g, reason: collision with root package name */
    public Object f335g;

    public h(int i7) {
        this.f329a = i7;
        switch (i7) {
            case 4:
                this.f330b = new int[]{2131165260, 2131165258, 2131165184};
                this.f331c = new int[]{2131165208, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.f332d = new int[]{2131165257, 2131165259, 2131165201, R.drawable.abc_text_cursor_material, 2131165254, 2131165255, 2131165256};
                this.f333e = new int[]{2131165233, R.drawable.abc_cab_background_internal_bg, 2131165232};
                this.f334f = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.f335g = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
            case 5:
                this.f329a = 5;
                this.f331c = new AtomicBoolean(false);
                this.f332d = new CountDownLatch(1);
                this.f330b = "PublicSuffixDatabase.list";
                break;
        }
    }

    public static boolean b(int[] iArr, int i7) {
        for (int i8 : iArr) {
            if (i8 == i7) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList d(Context context, int i7) {
        int c7 = k0.c(context, R.attr.colorControlHighlight);
        int b7 = k0.b(context, R.attr.colorButtonNormal);
        int[] iArr = k0.f5052b;
        int[] iArr2 = k0.f5054d;
        int a7 = AbstractC0708a.a(c7, i7);
        return new ColorStateList(new int[][]{iArr, iArr2, k0.f5053c, k0.f5056f}, new int[]{b7, a7, AbstractC0708a.a(c7, i7), i7});
    }

    public static LayerDrawable f(T t6, Context context, int i7) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i7);
        Drawable c7 = t6.c(context, R.drawable.abc_star_black_48dp);
        Drawable c8 = t6.c(context, R.drawable.abc_star_half_black_48dp);
        if ((c7 instanceof BitmapDrawable) && c7.getIntrinsicWidth() == dimensionPixelSize && c7.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) c7;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            c7.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c7.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((c8 instanceof BitmapDrawable) && c8.getIntrinsicWidth() == dimensionPixelSize && c8.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) c8;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            c8.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            c8.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, android.R.id.background);
        layerDrawable.setId(1, android.R.id.secondaryProgress);
        layerDrawable.setId(2, android.R.id.progress);
        return layerDrawable;
    }

    public static void m(Drawable drawable, int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter e4;
        if (AbstractC0441C.a(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = C0456o.f5070b;
        }
        PorterDuff.Mode mode2 = C0456o.f5070b;
        synchronized (C0456o.class) {
            e4 = T.e(i7, mode);
        }
        drawable.setColorFilter(e4);
    }

    public void a(String str, String str2) {
        HashMap hashMap = (HashMap) this.f335g;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    public i c() {
        String str = ((String) this.f330b) == null ? " transportName" : "";
        if (((m) this.f332d) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f333e) == null) {
            str = W4.o.d(str, " eventMillis");
        }
        if (((Long) this.f334f) == null) {
            str = W4.o.d(str, " uptimeMillis");
        }
        if (((HashMap) this.f335g) == null) {
            str = W4.o.d(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new i((String) this.f330b, (Integer) this.f331c, (m) this.f332d, ((Long) this.f333e).longValue(), ((Long) this.f334f).longValue(), (HashMap) this.f335g);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public k1.n e(k1.n nVar) {
        return nVar.c(new P.c(0), new B1.g(8, this));
    }

    public ColorStateList g(Context context, int i7) {
        if (i7 == R.drawable.abc_edit_text_material) {
            Object obj = AbstractC0401a.f4318a;
            return context.getColorStateList(R.color.abc_tint_edittext);
        }
        if (i7 == 2131165250) {
            Object obj2 = AbstractC0401a.f4318a;
            return context.getColorStateList(R.color.abc_tint_switch_track);
        }
        if (i7 == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList d7 = k0.d(context, R.attr.colorSwitchThumbNormal);
            if (d7 == null || !d7.isStateful()) {
                iArr[0] = k0.f5052b;
                iArr2[0] = k0.b(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = k0.f5055e;
                iArr2[1] = k0.c(context, R.attr.colorControlActivated);
                iArr[2] = k0.f5056f;
                iArr2[2] = k0.c(context, R.attr.colorSwitchThumbNormal);
            } else {
                int[] iArr3 = k0.f5052b;
                iArr[0] = iArr3;
                iArr2[0] = d7.getColorForState(iArr3, 0);
                iArr[1] = k0.f5055e;
                iArr2[1] = k0.c(context, R.attr.colorControlActivated);
                iArr[2] = k0.f5056f;
                iArr2[2] = d7.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }
        if (i7 == R.drawable.abc_btn_default_mtrl_shape) {
            return d(context, k0.c(context, R.attr.colorButtonNormal));
        }
        if (i7 == R.drawable.abc_btn_borderless_material) {
            return d(context, 0);
        }
        if (i7 == R.drawable.abc_btn_colored_material) {
            return d(context, k0.c(context, R.attr.colorAccent));
        }
        if (i7 == 2131165245 || i7 == R.drawable.abc_spinner_textfield_background_material) {
            Object obj3 = AbstractC0401a.f4318a;
            return context.getColorStateList(R.color.abc_tint_spinner);
        }
        if (b((int[]) this.f331c, i7)) {
            return k0.d(context, R.attr.colorControlNormal);
        }
        if (b((int[]) this.f334f, i7)) {
            Object obj4 = AbstractC0401a.f4318a;
            return context.getColorStateList(R.color.abc_tint_default);
        }
        if (b((int[]) this.f335g, i7)) {
            Object obj5 = AbstractC0401a.f4318a;
            return context.getColorStateList(R.color.abc_tint_btn_checkable);
        }
        if (i7 != R.drawable.abc_seekbar_thumb_material) {
            return null;
        }
        Object obj6 = AbstractC0401a.f4318a;
        return context.getColorStateList(R.color.abc_tint_seek_thumb);
    }

    public n6.m h() {
        h6.e eVar = h6.e.f4355a;
        Object obj = h6.e.f4355a;
        h6.d dVar = obj != null ? (h6.d) obj : null;
        Context b7 = dVar != null ? dVar.b() : null;
        AssetManager assets = b7 != null ? b7.getAssets() : null;
        if (assets == null) {
            if (Build.FINGERPRINT == null) {
                throw new IOException("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            }
            throw new IOException("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        }
        InputStream open = assets.open((String) this.f330b);
        kotlin.jvm.internal.i.d(open, "open(...)");
        return new n6.m(open, new y());
    }

    public A.e i() {
        A.e eVar = new A.e(false);
        Object obj = l5.q.f5304f;
        eVar.f11k = obj;
        eVar.f8h = (X5.o) this.f331c;
        eVar.f7g = (String) this.f330b;
        eVar.f10j = (u) this.f333e;
        Map map = (Map) this.f334f;
        if (!map.isEmpty()) {
            obj = t.v0(map);
        }
        eVar.f11k = obj;
        eVar.f9i = ((X5.n) this.f332d).c();
        return eVar;
    }

    public boolean j(int i7, int i8, Intent intent) {
        Iterator it = new HashSet((HashSet) this.f332d).iterator();
        while (true) {
            boolean z5 = false;
            while (it.hasNext()) {
                HashMap hashMap = ((R3.a) it.next()).f2083i;
                if (hashMap.containsKey(Integer.valueOf(i7))) {
                    ((N3.j) hashMap.remove(Integer.valueOf(i7))).d(i8 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
                } else if (z5) {
                }
                z5 = true;
            }
            return z5;
        }
    }

    public void k() {
        try {
            n6.q b7 = n6.b.b(h());
            try {
                n6.i f7 = b7.f(b7.readInt());
                n6.i f8 = b7.f(b7.readInt());
                b7.close();
                synchronized (this) {
                    kotlin.jvm.internal.i.b(f7);
                    this.f333e = f7;
                    kotlin.jvm.internal.i.b(f8);
                    this.f334f = f8;
                }
            } finally {
            }
        } finally {
            ((CountDownLatch) this.f332d).countDown();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015a A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l(String str, String str2, Bundle bundle) {
        int i7;
        String str3;
        String str4;
        y1.f fVar;
        boolean g7;
        int i8;
        PackageInfo c7;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        m1.g gVar = (m1.g) this.f330b;
        gVar.a();
        bundle.putString("gmp_app_id", gVar.f5427c.f5440b);
        v vVar = (v) this.f331c;
        synchronized (vVar) {
            try {
                if (vVar.f1000d == 0 && (c7 = vVar.c("com.google.android.gms")) != null) {
                    vVar.f1000d = c7.versionCode;
                }
                i7 = vVar.f1000d;
            } finally {
            }
        }
        bundle.putString("gmsv", Integer.toString(i7));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((v) this.f331c).a());
        v vVar2 = (v) this.f331c;
        synchronized (vVar2) {
            try {
                if (vVar2.f999c == null) {
                    vVar2.e();
                }
                str3 = vVar2.f999c;
            } finally {
            }
        }
        bundle.putString("app_ver_name", str3);
        m1.g gVar2 = (m1.g) this.f330b;
        gVar2.a();
        try {
            str4 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar2.f5426b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str4 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str4);
        try {
            String str5 = ((B1.a) AbstractC0219a.c(((B1.d) ((B1.e) this.f335g)).d())).f84a;
            if (TextUtils.isEmpty(str5)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str5);
            }
        } catch (InterruptedException e4) {
            e = e4;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) AbstractC0219a.c(((B1.d) ((B1.e) this.f335g)).c()));
            bundle.putString("cliv", "fcm-24.0.0");
            fVar = (y1.f) ((A1.a) this.f334f).get();
            J1.b bVar = (J1.b) ((A1.a) this.f333e).get();
            if (fVar == null) {
                return;
            } else {
                return;
            }
        } catch (ExecutionException e7) {
            e = e7;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString("appid", (String) AbstractC0219a.c(((B1.d) ((B1.e) this.f335g)).c()));
            bundle.putString("cliv", "fcm-24.0.0");
            fVar = (y1.f) ((A1.a) this.f334f).get();
            J1.b bVar2 = (J1.b) ((A1.a) this.f333e).get();
            if (fVar == null) {
            }
        }
        bundle.putString("appid", (String) AbstractC0219a.c(((B1.d) ((B1.e) this.f335g)).c()));
        bundle.putString("cliv", "fcm-24.0.0");
        fVar = (y1.f) ((A1.a) this.f334f).get();
        J1.b bVar22 = (J1.b) ((A1.a) this.f333e).get();
        if (fVar == null || bVar22 == null) {
            return;
        }
        C0759c c0759c = (C0759c) fVar;
        synchronized (c0759c) {
            long currentTimeMillis = System.currentTimeMillis();
            y1.h hVar = (y1.h) c0759c.f6229a.get();
            synchronized (hVar) {
                g7 = hVar.g(currentTimeMillis);
            }
            if (g7) {
                synchronized (hVar) {
                    String d7 = hVar.d(System.currentTimeMillis());
                    hVar.f6235a.edit().putString("last-used-date", d7).commit();
                    hVar.f(d7);
                }
                i8 = 3;
            } else {
                i8 = 1;
            }
        }
        if (i8 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(N.p.c(i8)));
            bundle.putString("Firebase-Client", bVar22.a());
        }
    }

    public k1.n n(String str, String str2, Bundle bundle) {
        int i7;
        try {
            l(str, str2, bundle);
            Q0.b bVar = (Q0.b) this.f332d;
            Q0.h hVar = Q0.h.f1981h;
            D4.h hVar2 = bVar.f1968c;
            if (hVar2.b() >= 12000000) {
                Q0.o b7 = Q0.o.b(bVar.f1967b);
                synchronized (b7) {
                    i7 = b7.f2004a;
                    b7.f2004a = i7 + 1;
                }
                return b7.c(new Q0.n(i7, 1, bundle, 1)).c(hVar, Q0.d.f1974g);
            }
            if (hVar2.c() != 0) {
                return bVar.a(bundle).d(hVar, new C0673c(bVar, bundle));
            }
            IOException iOException = new IOException("MISSING_INSTANCEID_SERVICE");
            k1.n nVar = new k1.n();
            nVar.j(iOException);
            return nVar;
        } catch (InterruptedException | ExecutionException e4) {
            k1.n nVar2 = new k1.n();
            nVar2.j(e4);
            return nVar2;
        }
    }

    public String toString() {
        switch (this.f329a) {
            case 3:
                Map map = (Map) this.f334f;
                StringBuilder sb = new StringBuilder(32);
                sb.append("Request{method=");
                sb.append((String) this.f330b);
                sb.append(", url=");
                sb.append((X5.o) this.f331c);
                X5.n nVar = (X5.n) this.f332d;
                if (nVar.size() != 0) {
                    sb.append(", headers=[");
                    int i7 = 0;
                    for (Object obj : nVar) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            AbstractC0507k.B();
                            throw null;
                        }
                        C0477g c0477g = (C0477g) obj;
                        String str = (String) c0477g.f5198f;
                        String str2 = (String) c0477g.f5199g;
                        if (i7 > 0) {
                            sb.append(", ");
                        }
                        sb.append(str);
                        sb.append(':');
                        if (Y5.c.i(str)) {
                            str2 = "██";
                        }
                        sb.append(str2);
                        i7 = i8;
                    }
                    sb.append(']');
                }
                if (!map.isEmpty()) {
                    sb.append(", tags=");
                    sb.append(map);
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Map] */
    public h(A.e eVar) {
        this.f329a = 3;
        X5.o oVar = (X5.o) eVar.f8h;
        if (oVar != null) {
            this.f331c = oVar;
            this.f330b = (String) eVar.f7g;
            X5.n c7 = ((Q4.j) eVar.f9i).c();
            this.f332d = c7;
            u uVar = (u) eVar.f10j;
            this.f333e = uVar;
            this.f334f = t.u0(eVar.f11k);
            if ("upgrade".equalsIgnoreCase(c7.a("Connection")) && uVar != null && uVar.a() != 0) {
                throw new IllegalArgumentException("expected a null or empty request body with 'Connection: upgrade'");
            }
            return;
        }
        throw new IllegalStateException("url == null");
    }

    public h(m1.g gVar, v vVar, A1.a aVar, A1.a aVar2, B1.e eVar) {
        this.f329a = 2;
        gVar.a();
        Q0.b bVar = new Q0.b(gVar.f5425a);
        this.f330b = gVar;
        this.f331c = vVar;
        this.f332d = bVar;
        this.f333e = aVar;
        this.f334f = aVar2;
        this.f335g = eVar;
    }

    public h(Activity activity, AbstractC0248o abstractC0248o) {
        this.f329a = 1;
        this.f331c = new HashSet();
        this.f332d = new HashSet();
        this.f333e = new HashSet();
        this.f334f = new HashSet();
        new HashSet();
        this.f335g = new HashSet();
        this.f330b = activity;
        new HiddenLifecycleReference(abstractC0248o);
    }
}
