package s2;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public Context f8503a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f8504b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f8505c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f8506d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f8507e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f8508f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f8509g;

    /* renamed from: h, reason: collision with root package name */
    public int f8510h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8511i;

    /* renamed from: j, reason: collision with root package name */
    public q5.g f8512j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8513k;

    /* renamed from: l, reason: collision with root package name */
    public Bundle f8514l;

    /* renamed from: m, reason: collision with root package name */
    public String f8515m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8516n;

    /* renamed from: o, reason: collision with root package name */
    public Notification f8517o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f8518p;

    public static CharSequence a(CharSequence charSequence) {
        return charSequence == null ? charSequence : charSequence.length() > 5120 ? charSequence.subSequence(0, 5120) : charSequence;
    }

    public final void b(q5.g gVar) {
        if (this.f8512j != gVar) {
            this.f8512j = gVar;
            if (((e) gVar.f7527g) != this) {
                gVar.f7527g = this;
                b(gVar);
            }
        }
    }
}
