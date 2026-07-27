package S0;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f3999a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f4000b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f4001c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4002d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4003e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f4004f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f4005g;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(String str, PendingIntent pendingIntent) {
        IconCompat a4 = IconCompat.a(2131099648);
        Bundle bundle = new Bundle();
        this.f4002d = true;
        this.f4000b = a4;
        int i2 = a4.f5229a;
        if (i2 == -1) {
            int i4 = Build.VERSION.SDK_INT;
            Object obj = a4.f5230b;
            if (i4 >= 28) {
                i2 = W0.c.c(obj);
            } else {
                try {
                    i2 = ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
                } catch (IllegalAccessException e4) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e4);
                    i2 = -1;
                    if (i2 == 2) {
                    }
                    this.f4004f = d.a(str);
                    this.f4005g = pendingIntent;
                    this.f3999a = bundle;
                    this.f4001c = true;
                    this.f4002d = true;
                } catch (NoSuchMethodException e5) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e5);
                    i2 = -1;
                    if (i2 == 2) {
                    }
                    this.f4004f = d.a(str);
                    this.f4005g = pendingIntent;
                    this.f3999a = bundle;
                    this.f4001c = true;
                    this.f4002d = true;
                } catch (InvocationTargetException e6) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e6);
                    i2 = -1;
                    if (i2 == 2) {
                    }
                    this.f4004f = d.a(str);
                    this.f4005g = pendingIntent;
                    this.f3999a = bundle;
                    this.f4001c = true;
                    this.f4002d = true;
                }
            }
        }
        if (i2 == 2) {
            this.f4003e = a4.b();
        }
        this.f4004f = d.a(str);
        this.f4005g = pendingIntent;
        this.f3999a = bundle;
        this.f4001c = true;
        this.f4002d = true;
    }
}
