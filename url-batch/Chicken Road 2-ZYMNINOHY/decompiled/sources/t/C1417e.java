package t;

import E.AbstractC0003d;
import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* renamed from: t.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1417e {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f15241a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f15242b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15243c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15244d;

    /* renamed from: e, reason: collision with root package name */
    public final int f15245e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f15246f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f15247g;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1417e(String str, PendingIntent pendingIntent) {
        IconCompat a3 = IconCompat.a(2131165278);
        Bundle bundle = new Bundle();
        this.f15244d = true;
        this.f15242b = a3;
        int i4 = a3.f4508a;
        if (i4 == -1) {
            int i5 = Build.VERSION.SDK_INT;
            Object obj = a3.f4509b;
            if (i5 >= 28) {
                i4 = AbstractC0003d.l(obj);
            } else {
                try {
                    i4 = ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
                } catch (IllegalAccessException e4) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e4);
                    i4 = -1;
                    if (i4 == 2) {
                    }
                    this.f15246f = C1418f.a(str);
                    this.f15247g = pendingIntent;
                    this.f15241a = bundle;
                    this.f15243c = true;
                    this.f15244d = true;
                } catch (NoSuchMethodException e5) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e5);
                    i4 = -1;
                    if (i4 == 2) {
                    }
                    this.f15246f = C1418f.a(str);
                    this.f15247g = pendingIntent;
                    this.f15241a = bundle;
                    this.f15243c = true;
                    this.f15244d = true;
                } catch (InvocationTargetException e6) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e6);
                    i4 = -1;
                    if (i4 == 2) {
                    }
                    this.f15246f = C1418f.a(str);
                    this.f15247g = pendingIntent;
                    this.f15241a = bundle;
                    this.f15243c = true;
                    this.f15244d = true;
                }
            }
        }
        if (i4 == 2) {
            this.f15245e = a3.b();
        }
        this.f15246f = C1418f.a(str);
        this.f15247g = pendingIntent;
        this.f15241a = bundle;
        this.f15243c = true;
        this.f15244d = true;
    }
}
