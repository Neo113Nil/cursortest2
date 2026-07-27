package S0;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import y.t;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public Context f4006a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f4007b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f4008c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f4009d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f4010e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f4011f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f4012g;

    /* renamed from: h, reason: collision with root package name */
    public int f4013h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f4014i;

    /* renamed from: j, reason: collision with root package name */
    public t f4015j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4016k;

    /* renamed from: l, reason: collision with root package name */
    public Bundle f4017l;

    /* renamed from: m, reason: collision with root package name */
    public String f4018m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4019n;

    /* renamed from: o, reason: collision with root package name */
    public Notification f4020o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f4021p;

    public static CharSequence a(String str) {
        return (str != null && str.length() > 5120) ? str.subSequence(0, 5120) : str;
    }

    public final void b(t tVar) {
        if (this.f4015j != tVar) {
            this.f4015j = tVar;
            if (((d) tVar.f11494e) != this) {
                tVar.f11494e = this;
                b(tVar);
            }
        }
    }
}
