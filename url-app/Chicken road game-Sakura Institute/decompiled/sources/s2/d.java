package s2;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f8496a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f8497b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8498c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8499d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8500e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f8501f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f8502g;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(String str, PendingIntent pendingIntent) {
        IconCompat b9 = IconCompat.b(2131099648);
        Bundle bundle = new Bundle();
        this.f8499d = true;
        this.f8497b = b9;
        int i7 = b9.f756a;
        if (i7 == -1) {
            int i8 = Build.VERSION.SDK_INT;
            Object obj = b9.f757b;
            if (i8 >= 28) {
                i7 = w2.c.c(obj);
            } else {
                try {
                    i7 = ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
                } catch (IllegalAccessException e9) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e9);
                    i7 = -1;
                    if (i7 == 2) {
                    }
                    this.f8501f = e.a(str);
                    this.f8502g = pendingIntent;
                    this.f8496a = bundle;
                    this.f8498c = true;
                    this.f8499d = true;
                } catch (NoSuchMethodException e10) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e10);
                    i7 = -1;
                    if (i7 == 2) {
                    }
                    this.f8501f = e.a(str);
                    this.f8502g = pendingIntent;
                    this.f8496a = bundle;
                    this.f8498c = true;
                    this.f8499d = true;
                } catch (InvocationTargetException e11) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e11);
                    i7 = -1;
                    if (i7 == 2) {
                    }
                    this.f8501f = e.a(str);
                    this.f8502g = pendingIntent;
                    this.f8496a = bundle;
                    this.f8498c = true;
                    this.f8499d = true;
                }
            }
        }
        if (i7 == 2) {
            this.f8500e = b9.c();
        }
        this.f8501f = e.a(str);
        this.f8502g = pendingIntent;
        this.f8496a = bundle;
        this.f8498c = true;
        this.f8499d = true;
    }
}
