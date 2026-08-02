package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import com.google.android.apps.authenticator2.R;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fhr {
    public fhr() {
        new AtomicBoolean();
    }

    static void a(Outline outline, Path path) {
        outline.setPath(path);
    }

    public static ColorStateList b(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !di$$ExternalSyntheticApiModelOutline0.m57m((Object) drawable)) {
            return null;
        }
        colorStateList = di$$ExternalSyntheticApiModelOutline0.m((Object) drawable).getColorStateList();
        return colorStateList;
    }

    public static PorterDuffColorFilter c(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }

    public static void d(Outline outline, Path path) {
        if (Build.VERSION.SDK_INT >= 30) {
            a(outline, path);
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                fhq.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            fhq.a(outline, path);
        }
    }

    public static void e(Drawable drawable, int i) {
        if (i != 0) {
            drawable.setTint(i);
        } else {
            drawable.setTintList(null);
        }
    }

    public static Drawable f(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = drawable.mutate();
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        return drawable;
    }

    public static boolean g() {
        String str = Build.MANUFACTURER;
        return (str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu");
    }

    public static void h(float f, float[] fArr) {
        float f2 = f + f;
        if (f <= 0.5f) {
            fArr[0] = 1.0f - f2;
            fArr[1] = 0.0f;
        } else {
            fArr[0] = 0.0f;
            fArr[1] = f2 - 1.0f;
        }
    }

    public static Intent i(fuf fufVar, int i) {
        return new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.accountName", fufVar.b.g).putExtra("extra.screenId", i);
    }

    public static void j(Activity activity, String str) {
        Uri parse = Uri.parse(str);
        String packageName = activity.getPackageName();
        try {
            try {
                byo byoVar = new byo();
                ((hrz) byoVar.a).a = Integer.valueOf(activity.getColor(R.color.google_grey200) | (-16777216));
                brr v = byoVar.v();
                ((Intent) v.b).putExtra("android.intent.extra.REFERRER", Uri.parse(a.ah(packageName, "android-app://")));
                v.m(activity, parse);
            } catch (ActivityNotFoundException unused) {
                Intent intent = new Intent("android.intent.action.VIEW", parse);
                intent.putExtra("com.android.browser.application_id", packageName);
                activity.startActivity(intent);
            }
        } catch (ActivityNotFoundException unused2) {
        }
    }

    public static eew k(gnh gnhVar, bd bdVar, dov dovVar) {
        gnhVar.getClass();
        return new eew(new kee(gnhVar, null), bdVar.x(), dovVar);
    }

    public static final /* synthetic */ fvy l(jkj jkjVar) {
        jkp q = jkjVar.q();
        q.getClass();
        return (fvy) q;
    }

    public static final void m(boolean z, jkj jkjVar) {
        if (!jkjVar.b.M()) {
            jkjVar.t();
        }
        fvy fvyVar = (fvy) jkjVar.b;
        fvy fvyVar2 = fvy.a;
        fvyVar.b |= 1;
        fvyVar.c = z;
    }

    public static final void n(int i, jkj jkjVar) {
        if (!jkjVar.b.M()) {
            jkjVar.t();
        }
        fvy fvyVar = (fvy) jkjVar.b;
        fvy fvyVar2 = fvy.a;
        fvyVar.e = i - 1;
        fvyVar.b |= 2;
    }

    public static final void o(String str, ful fulVar, Map map) {
        Object computeIfAbsent = Map.EL.computeIfAbsent(map, str, new ckw(new dvm(13), 3));
        computeIfAbsent.getClass();
        java.util.Map map2 = (java.util.Map) computeIfAbsent;
        if (map2.containsKey(fulVar.g)) {
            throw new IllegalStateException("Found 2 accounts with the same account name.");
        }
        map2.put(fulVar.g, fulVar);
    }

    public static final /* synthetic */ ful p(jkl jklVar) {
        jkp q = jklVar.q();
        q.getClass();
        return (ful) q;
    }

    public static final void q(String str, jkl jklVar) {
        str.getClass();
        if (!jklVar.b.M()) {
            jklVar.t();
        }
        ful fulVar = (ful) jklVar.b;
        ful fulVar2 = ful.a;
        fulVar.b |= 16;
        fulVar.g = str;
    }

    public static final void r(String str, jkl jklVar) {
        str.getClass();
        if (!jklVar.b.M()) {
            jklVar.t();
        }
        ful fulVar = (ful) jklVar.b;
        ful fulVar2 = ful.a;
        fulVar.b |= 2;
        fulVar.d = str;
    }

    public static final void s(String str, jkl jklVar) {
        if (!jklVar.b.M()) {
            jklVar.t();
        }
        ful fulVar = (ful) jklVar.b;
        ful fulVar2 = ful.a;
        fulVar.b |= 1;
        fulVar.c = str;
    }

    public static final void t(jkl jklVar) {
        if (!jklVar.b.M()) {
            jklVar.t();
        }
        ful fulVar = (ful) jklVar.b;
        ful fulVar2 = ful.a;
        fulVar.b |= 256;
        fulVar.k = "google";
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static hvi u(List list, gzr gzrVar, Executor executor) {
        hvi a;
        Object aR;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                a = ((htq) it.next()).a();
            } catch (Exception e) {
                hvi aI = hnu.aI(e);
                if (arrayList.isEmpty()) {
                    return aI;
                }
                arrayList.add(aI);
            }
            if (a.isDone()) {
                try {
                    aR = hnu.aR(a);
                } catch (ExecutionException unused) {
                    if (!arrayList.isEmpty()) {
                        arrayList.add(a);
                    }
                }
                if (a.isCancelled() || gzrVar.a(aR)) {
                    if (arrayList.isEmpty()) {
                        return a;
                    }
                    arrayList.add(a);
                    fua fuaVar = new fua(arrayList, gzrVar, executor);
                    hoq.H(fuaVar.d != -1);
                    hvi b = fuaVar.b();
                    b.c(new fnh(fuaVar, 11), fuaVar.c);
                    return b;
                }
            } else {
                arrayList.add(a);
            }
        }
        fua fuaVar2 = new fua(arrayList, gzrVar, executor);
        hoq.H(fuaVar2.d != -1);
        hvi b2 = fuaVar2.b();
        b2.c(new fnh(fuaVar2, 11), fuaVar2.c);
        return b2;
    }
}
