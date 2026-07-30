package x4;

import android.content.Context;
import java.util.HashMap;

/* renamed from: x4.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1009d implements o4.c, l, j {

    /* renamed from: i, reason: collision with root package name */
    public static final HashMap f8340i = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public Context f8341d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8342e = false;

    public static C1010e c(P1.h hVar) {
        String str = hVar.f2279a;
        String str2 = hVar.f2280b;
        String str3 = hVar.f2283e;
        if (str3 == null) {
            str3 = null;
        }
        String str4 = hVar.f2286h;
        if (str4 == null) {
            str4 = null;
        }
        String str5 = hVar.f2281c;
        String str6 = hVar.f2284f;
        String str7 = hVar.f2282d;
        String str8 = hVar.f2285g;
        if (str8 == null) {
            str8 = null;
        }
        C1010e c1010e = new C1010e();
        if (str == null) {
            throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
        }
        c1010e.f8343a = str;
        if (str2 == null) {
            throw new IllegalStateException("Nonnull field \"appId\" is null.");
        }
        c1010e.f8344b = str2;
        if (str3 == null) {
            throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
        }
        c1010e.f8345c = str3;
        if (str4 == null) {
            throw new IllegalStateException("Nonnull field \"projectId\" is null.");
        }
        c1010e.f8346d = str4;
        c1010e.f8347e = null;
        c1010e.f8348f = str5;
        c1010e.f8349g = str6;
        c1010e.f8350h = null;
        c1010e.f8351i = str7;
        c1010e.j = null;
        c1010e.f8352k = null;
        c1010e.f8353l = null;
        c1010e.f8354m = null;
        c1010e.f8355n = null;
        c1010e.f8356o = str8;
        return c1010e;
    }

    @Override // o4.c
    public final void onAttachedToEngine(o4.b bVar) {
        l.a(bVar.f7122c, this);
        j.b(bVar.f7122c, this);
        this.f8341d = bVar.f7120a;
    }

    @Override // o4.c
    public final void onDetachedFromEngine(o4.b bVar) {
        this.f8341d = null;
        l.a(bVar.f7122c, null);
        j.b(bVar.f7122c, null);
    }
}
