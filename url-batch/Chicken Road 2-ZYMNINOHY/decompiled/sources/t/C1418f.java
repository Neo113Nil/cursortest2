package t;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import d2.C0389g;
import java.util.ArrayList;

/* renamed from: t.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1418f {

    /* renamed from: a, reason: collision with root package name */
    public Context f15248a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f15249b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f15250c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f15251d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f15252e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f15253f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f15254g;

    /* renamed from: h, reason: collision with root package name */
    public int f15255h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f15256i;

    /* renamed from: j, reason: collision with root package name */
    public C0389g f15257j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f15258k;

    /* renamed from: l, reason: collision with root package name */
    public Bundle f15259l;

    /* renamed from: m, reason: collision with root package name */
    public String f15260m;
    public boolean n;
    public Notification o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f15261p;

    public static CharSequence a(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void b(C0389g c0389g) {
        if (this.f15257j != c0389g) {
            this.f15257j = c0389g;
            if (((C1418f) c0389g.f8264b) != this) {
                c0389g.f8264b = this;
                b(c0389g);
            }
        }
    }
}
