package t;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import f0.C0322a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public Context f10340a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f10341b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f10342c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f10343d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f10344e;
    public CharSequence f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f10345g;

    /* renamed from: h, reason: collision with root package name */
    public int f10346h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10347i;

    /* renamed from: j, reason: collision with root package name */
    public C0322a f10348j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10349k;

    /* renamed from: l, reason: collision with root package name */
    public Bundle f10350l;

    /* renamed from: m, reason: collision with root package name */
    public String f10351m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10352n;
    public Notification o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f10353p;

    public static CharSequence a(String str) {
        return str == null ? str : str.length() > 5120 ? str.subSequence(0, 5120) : str;
    }

    public final void b(C0322a c0322a) {
        if (this.f10348j != c0322a) {
            this.f10348j = c0322a;
            if (((d) c0322a.f4977b) != this) {
                c0322a.f4977b = this;
                b(c0322a);
            }
        }
    }
}
