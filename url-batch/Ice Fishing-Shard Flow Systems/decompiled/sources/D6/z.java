package D6;

import I.C0108d;
import android.app.Activity;
import android.content.Context;
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
import androidx.lifecycle.AbstractC0250p;
import b2.InterfaceC0271b;
import com.appsflyer.AppsFlyerProperties;
import com.icefishing.icefish.ice.fishing.s294s.R;
import e2.InterfaceC0372a;
import f2.C0394a;
import f2.C0396c;
import f2.InterfaceC0397d;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.I;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0731q0;
import n.C0733s;
import n.Q0;
import n.i1;
import p1.C0820c;
import z1.AbstractC1053a;

/* loaded from: classes.dex */
public final class z implements S1.c, p4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f638a;

    /* renamed from: b, reason: collision with root package name */
    public Object f639b;

    /* renamed from: c, reason: collision with root package name */
    public Object f640c;

    /* renamed from: d, reason: collision with root package name */
    public Object f641d;

    /* renamed from: e, reason: collision with root package name */
    public Object f642e;

    /* renamed from: f, reason: collision with root package name */
    public Object f643f;

    /* renamed from: g, reason: collision with root package name */
    public Object f644g;

    public z(int i2) {
        this.f638a = i2;
        switch (i2) {
            case 3:
                break;
            case 6:
                this.f640c = new int[]{2131165260, 2131165258, 2131165184};
                this.f639b = new int[]{2131165208, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
                this.f641d = new int[]{2131165257, 2131165259, 2131165201, R.drawable.abc_text_cursor_material, 2131165254, 2131165255, 2131165256};
                this.f642e = new int[]{2131165233, R.drawable.abc_cab_background_internal_bg, 2131165232};
                this.f643f = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
                this.f644g = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
                break;
            default:
                Intrinsics.checkNotNullParameter("PublicSuffixDatabase.list", "path");
                this.f638a = 1;
                this.f640c = new AtomicBoolean(false);
                this.f641d = new CountDownLatch(1);
                this.f639b = "PublicSuffixDatabase.list";
                break;
        }
    }

    public static boolean h(int[] iArr, int i2) {
        for (int i5 : iArr) {
            if (i5 == i2) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList j(Context context, int i2) {
        int c7 = i1.c(context, R.attr.colorControlHighlight);
        int b7 = i1.b(context, R.attr.colorButtonNormal);
        int[] iArr = i1.f6787b;
        int[] iArr2 = i1.f6789d;
        int b8 = B.a.b(c7, i2);
        return new ColorStateList(new int[][]{iArr, iArr2, i1.f6788c, i1.f6791f}, new int[]{b7, b8, B.a.b(c7, i2), i2});
    }

    public static LayerDrawable k(Q0 q02, Context context, int i2) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
        Drawable c7 = q02.c(context, R.drawable.abc_star_black_48dp);
        Drawable c8 = q02.c(context, R.drawable.abc_star_half_black_48dp);
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

    public static void r(Drawable drawable, int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter e7;
        int[] iArr = AbstractC0731q0.f6868a;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C0733s.f6879b;
        }
        PorterDuff.Mode mode2 = C0733s.f6879b;
        synchronized (C0733s.class) {
            e7 = Q0.e(i2, mode);
        }
        mutate.setColorFilter(e7);
    }

    @Override // S1.c
    public Object a(Class cls) {
        if (((Set) this.f640c).contains(S1.r.a(cls))) {
            Object a7 = ((S1.c) this.f644g).a(cls);
            return !cls.equals(InterfaceC0271b.class) ? a7 : new S1.s((Set) this.f643f, (InterfaceC0271b) a7);
        }
        throw new E1.i("Attempting to request an undeclared dependency " + cls + ".");
    }

    @Override // S1.c
    public Set b(S1.r rVar) {
        if (((Set) this.f641d).contains(rVar)) {
            return ((S1.c) this.f644g).b(rVar);
        }
        throw new E1.i("Attempting to request an undeclared dependency Set<" + rVar + ">.");
    }

    @Override // S1.c
    public InterfaceC0372a c(S1.r rVar) {
        if (((Set) this.f642e).contains(rVar)) {
            return ((S1.c) this.f644g).c(rVar);
        }
        throw new E1.i("Attempting to request an undeclared dependency Provider<Set<" + rVar + ">>.");
    }

    @Override // S1.c
    public Object d(S1.r rVar) {
        if (((Set) this.f640c).contains(rVar)) {
            return ((S1.c) this.f644g).d(rVar);
        }
        throw new E1.i("Attempting to request an undeclared dependency " + rVar + ".");
    }

    @Override // S1.c
    public InterfaceC0372a e(Class cls) {
        return f(S1.r.a(cls));
    }

    @Override // S1.c
    public InterfaceC0372a f(S1.r rVar) {
        if (((Set) this.f639b).contains(rVar)) {
            return ((S1.c) this.f644g).f(rVar);
        }
        throw new E1.i("Attempting to request an undeclared dependency Provider<" + rVar + ">.");
    }

    public void g(String str, String str2) {
        HashMap hashMap = (HashMap) this.f644g;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put(str, str2);
    }

    public a1.h i() {
        String str = ((String) this.f639b) == null ? " transportName" : "";
        if (((a1.l) this.f641d) == null) {
            str = str.concat(" encodedPayload");
        }
        if (((Long) this.f642e) == null) {
            str = r4.f.c(str, " eventMillis");
        }
        if (((Long) this.f643f) == null) {
            str = r4.f.c(str, " uptimeMillis");
        }
        if (((HashMap) this.f644g) == null) {
            str = r4.f.c(str, " autoMetadata");
        }
        if (str.isEmpty()) {
            return new a1.h((String) this.f639b, (Integer) this.f640c, (a1.l) this.f641d, ((Long) this.f642e).longValue(), ((Long) this.f643f).longValue(), (HashMap) this.f644g);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public ColorStateList l(Context context, int i2) {
        if (i2 == R.drawable.abc_edit_text_material) {
            return O6.g.K(context, R.color.abc_tint_edittext);
        }
        if (i2 == 2131165250) {
            return O6.g.K(context, R.color.abc_tint_switch_track);
        }
        if (i2 != R.drawable.abc_switch_thumb_material) {
            if (i2 == R.drawable.abc_btn_default_mtrl_shape) {
                return j(context, i1.c(context, R.attr.colorButtonNormal));
            }
            if (i2 == R.drawable.abc_btn_borderless_material) {
                return j(context, 0);
            }
            if (i2 == R.drawable.abc_btn_colored_material) {
                return j(context, i1.c(context, R.attr.colorAccent));
            }
            if (i2 == 2131165245 || i2 == R.drawable.abc_spinner_textfield_background_material) {
                return O6.g.K(context, R.color.abc_tint_spinner);
            }
            if (h((int[]) this.f639b, i2)) {
                return i1.d(context, R.attr.colorControlNormal);
            }
            if (h((int[]) this.f643f, i2)) {
                return O6.g.K(context, R.color.abc_tint_default);
            }
            if (h((int[]) this.f644g, i2)) {
                return O6.g.K(context, R.color.abc_tint_btn_checkable);
            }
            if (i2 == R.drawable.abc_seekbar_thumb_material) {
                return O6.g.K(context, R.color.abc_tint_seek_thumb);
            }
            return null;
        }
        int[][] iArr = new int[3][];
        int[] iArr2 = new int[3];
        ColorStateList d7 = i1.d(context, R.attr.colorSwitchThumbNormal);
        if (d7 == null || !d7.isStateful()) {
            iArr[0] = i1.f6787b;
            iArr2[0] = i1.b(context, R.attr.colorSwitchThumbNormal);
            iArr[1] = i1.f6790e;
            iArr2[1] = i1.c(context, R.attr.colorControlActivated);
            iArr[2] = i1.f6791f;
            iArr2[2] = i1.c(context, R.attr.colorSwitchThumbNormal);
        } else {
            int[] iArr3 = i1.f6787b;
            iArr[0] = iArr3;
            iArr2[0] = d7.getColorForState(iArr3, 0);
            iArr[1] = i1.f6790e;
            iArr2[1] = i1.c(context, R.attr.colorControlActivated);
            iArr[2] = i1.f6791f;
            iArr2[2] = d7.getDefaultColor();
        }
        return new ColorStateList(iArr, iArr2);
    }

    public String m(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return ((q) this.f641d).a(name);
    }

    public T6.m n() {
        N6.e eVar = N6.e.f1879a;
        Object obj = N6.e.f1879a;
        N6.d dVar = obj != null ? (N6.d) obj : null;
        Context b7 = dVar != null ? dVar.b() : null;
        AssetManager assets = b7 != null ? b7.getAssets() : null;
        if (assets == null) {
            if (Build.FINGERPRINT == null) {
                throw new IOException("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            }
            throw new IOException("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        }
        InputStream open = assets.open((String) this.f639b);
        Intrinsics.checkNotNullExpressionValue(open, "open(...)");
        Intrinsics.checkNotNullParameter(open, "<this>");
        return new T6.m(open, new T6.y());
    }

    public y o() {
        Intrinsics.checkNotNullParameter(this, "request");
        y yVar = new y();
        yVar.f637m = I.c();
        yVar.f634e = (s) this.f640c;
        yVar.f633d = (String) this.f639b;
        yVar.f636l = (A) this.f642e;
        Map map = (Map) this.f643f;
        yVar.f637m = map.isEmpty() ? I.c() : I.j(map);
        yVar.f635i = ((q) this.f641d).c();
        return yVar;
    }

    public void p() {
        try {
            T6.q b7 = T6.b.b(n());
            try {
                T6.i e7 = b7.e(b7.readInt());
                T6.i e8 = b7.e(b7.readInt());
                Unit unit = Unit.f6114a;
                b7.close();
                synchronized (this) {
                    Intrinsics.b(e7);
                    Intrinsics.checkNotNullParameter(e7, "<set-?>");
                    this.f642e = e7;
                    Intrinsics.b(e8);
                    Intrinsics.checkNotNullParameter(e8, "<set-?>");
                    this.f643f = e8;
                }
            } finally {
            }
        } finally {
            ((CountDownLatch) this.f641d).countDown();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0100 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0157 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void q(String str, Bundle bundle, boolean z7) {
        String str2;
        String str3;
        c2.g gVar;
        boolean e7;
        int i2;
        bundle.putString("scope", "*");
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        P1.g gVar2 = (P1.g) this.f640c;
        gVar2.a();
        bundle.putString("gmp_app_id", gVar2.f2272c.f2280b);
        bundle.putString("gmsv", Integer.toString(((C0108d) this.f639b).g()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((C0108d) this.f639b).e());
        C0108d c0108d = (C0108d) this.f639b;
        synchronized (c0108d) {
            try {
                if (((String) c0108d.f1181n) == null) {
                    c0108d.j();
                }
                str2 = (String) c0108d.f1181n;
            } finally {
            }
        }
        bundle.putString("app_ver_name", str2);
        P1.g gVar3 = (P1.g) this.f640c;
        gVar3.a();
        try {
            str3 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(gVar3.f2271b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str3 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str3);
        if (z7) {
            P1.g gVar4 = (P1.g) this.f640c;
            gVar4.a();
            bundle.putString("Goog-Api-Key", gVar4.f2272c.f2279a);
        }
        try {
            String str4 = ((C0394a) AbstractC1053a.e(((C0396c) ((InterfaceC0397d) this.f644g)).d())).f4773a;
            if (TextUtils.isEmpty(str4)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", str4);
            }
        } catch (InterruptedException e8) {
            e = e8;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString(AppsFlyerProperties.APP_ID, (String) AbstractC1053a.e(((C0396c) ((InterfaceC0397d) this.f644g)).c()));
            bundle.putString("cliv", "fcm-25.1.0");
            gVar = (c2.g) ((InterfaceC0372a) this.f643f).get();
            l2.b bVar = (l2.b) ((InterfaceC0372a) this.f642e).get();
            if (gVar == null) {
                return;
            } else {
                return;
            }
        } catch (ExecutionException e9) {
            e = e9;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            bundle.putString(AppsFlyerProperties.APP_ID, (String) AbstractC1053a.e(((C0396c) ((InterfaceC0397d) this.f644g)).c()));
            bundle.putString("cliv", "fcm-25.1.0");
            gVar = (c2.g) ((InterfaceC0372a) this.f643f).get();
            l2.b bVar2 = (l2.b) ((InterfaceC0372a) this.f642e).get();
            if (gVar == null) {
            }
        }
        bundle.putString(AppsFlyerProperties.APP_ID, (String) AbstractC1053a.e(((C0396c) ((InterfaceC0397d) this.f644g)).c()));
        bundle.putString("cliv", "fcm-25.1.0");
        gVar = (c2.g) ((InterfaceC0372a) this.f643f).get();
        l2.b bVar22 = (l2.b) ((InterfaceC0372a) this.f642e).get();
        if (gVar == null || bVar22 == null) {
            return;
        }
        c2.d dVar = (c2.d) gVar;
        synchronized (dVar) {
            long currentTimeMillis = System.currentTimeMillis();
            c2.l lVar = (c2.l) dVar.f4180a.get();
            synchronized (lVar) {
                e7 = lVar.e(c2.l.f4196b, currentTimeMillis);
            }
            if (e7) {
                synchronized (lVar) {
                    lVar.f4199a.a(new c2.j(lVar, c2.l.b(System.currentTimeMillis())));
                }
                i2 = 3;
            } else {
                i2 = 1;
            }
        }
        if (i2 != 1) {
            bundle.putString("Firebase-Client-Log-Type", Integer.toString(S.i.b(i2)));
            bundle.putString("Firebase-Client", bVar22.a());
        }
    }

    public String toString() {
        switch (this.f638a) {
            case 0:
                Map map = (Map) this.f643f;
                StringBuilder sb = new StringBuilder(32);
                sb.append("Request{method=");
                sb.append((String) this.f639b);
                sb.append(", url=");
                sb.append((s) this.f640c);
                q qVar = (q) this.f641d;
                if (qVar.size() != 0) {
                    sb.append(", headers=[");
                    int i2 = 0;
                    for (Object obj : qVar) {
                        int i5 = i2 + 1;
                        if (i2 < 0) {
                            kotlin.collections.r.f();
                            throw null;
                        }
                        Pair pair = (Pair) obj;
                        String str = (String) pair.f6112d;
                        String str2 = (String) pair.f6113e;
                        if (i2 > 0) {
                            sb.append(", ");
                        }
                        sb.append(str);
                        sb.append(':');
                        if (E6.c.i(str)) {
                            str2 = "██";
                        }
                        sb.append(str2);
                        i2 = i5;
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
    public z(y builder) {
        this.f638a = 0;
        Intrinsics.checkNotNullParameter(builder, "builder");
        s sVar = (s) builder.f634e;
        if (sVar != null) {
            this.f640c = sVar;
            this.f639b = (String) builder.f633d;
            q d7 = ((C4.d) builder.f635i).d();
            this.f641d = d7;
            A a7 = (A) builder.f636l;
            this.f642e = a7;
            this.f643f = I.i(builder.f637m);
            if ("upgrade".equalsIgnoreCase(d7.a("Connection")) && a7 != null && a7.a() != 0) {
                throw new IllegalArgumentException("expected a null or empty request body with 'Connection: upgrade'");
            }
            return;
        }
        throw new IllegalStateException("url == null");
    }

    public z(S1.b bVar, S1.c cVar) {
        this.f638a = 2;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<S1.j> set = bVar.f2467c;
        Set set2 = bVar.f2471g;
        for (S1.j jVar : set) {
            int i2 = jVar.f2490c;
            int i5 = jVar.f2489b;
            boolean z7 = i2 == 0;
            S1.r rVar = jVar.f2488a;
            if (z7) {
                if (i5 == 2) {
                    hashSet4.add(rVar);
                } else {
                    hashSet.add(rVar);
                }
            } else if (i2 == 2) {
                hashSet3.add(rVar);
            } else if (i5 == 2) {
                hashSet5.add(rVar);
            } else {
                hashSet2.add(rVar);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(S1.r.a(InterfaceC0271b.class));
        }
        this.f640c = Collections.unmodifiableSet(hashSet);
        this.f639b = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.f641d = Collections.unmodifiableSet(hashSet4);
        this.f642e = Collections.unmodifiableSet(hashSet5);
        this.f643f = set2;
        this.f644g = cVar;
    }

    public z(P1.g gVar, C0108d c0108d, InterfaceC0372a interfaceC0372a, InterfaceC0372a interfaceC0372a2, InterfaceC0397d interfaceC0397d) {
        this.f638a = 4;
        gVar.a();
        C0820c c0820c = new C0820c(gVar.f2270a);
        this.f640c = gVar;
        this.f639b = c0108d;
        this.f641d = c0820c;
        this.f642e = interfaceC0372a;
        this.f643f = interfaceC0372a2;
        this.f644g = interfaceC0397d;
    }

    public z(Activity activity, AbstractC0250p abstractC0250p) {
        this.f638a = 5;
        this.f639b = new HashSet();
        this.f641d = new HashSet();
        this.f642e = new HashSet();
        this.f643f = new HashSet();
        new HashSet();
        this.f644g = new HashSet();
        this.f640c = activity;
        new HiddenLifecycleReference(abstractC0250p);
    }
}
