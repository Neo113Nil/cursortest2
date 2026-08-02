package t;

import E.AbstractC0003d;
import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f10334a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f10335b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f10336c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f10337d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10338e;
    public final CharSequence f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f10339g;

    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(String str, PendingIntent pendingIntent) {
        IconCompat a3 = IconCompat.a(2131165278);
        Bundle bundle = new Bundle();
        this.f10337d = true;
        this.f10335b = a3;
        int i3 = a3.f2174a;
        if (i3 == -1) {
            int i4 = Build.VERSION.SDK_INT;
            Object obj = a3.f2175b;
            if (i4 >= 28) {
                i3 = AbstractC0003d.l(obj);
            } else {
                try {
                    i3 = ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
                } catch (IllegalAccessException e3) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e3);
                    i3 = -1;
                    if (i3 == 2) {
                    }
                    this.f = d.a(str);
                    this.f10339g = pendingIntent;
                    this.f10334a = bundle;
                    this.f10336c = true;
                    this.f10337d = true;
                } catch (NoSuchMethodException e4) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e4);
                    i3 = -1;
                    if (i3 == 2) {
                    }
                    this.f = d.a(str);
                    this.f10339g = pendingIntent;
                    this.f10334a = bundle;
                    this.f10336c = true;
                    this.f10337d = true;
                } catch (InvocationTargetException e5) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e5);
                    i3 = -1;
                    if (i3 == 2) {
                    }
                    this.f = d.a(str);
                    this.f10339g = pendingIntent;
                    this.f10334a = bundle;
                    this.f10336c = true;
                    this.f10337d = true;
                }
            }
        }
        if (i3 == 2) {
            this.f10338e = a3.b();
        }
        this.f = d.a(str);
        this.f10339g = pendingIntent;
        this.f10334a = bundle;
        this.f10336c = true;
        this.f10337d = true;
    }
}
