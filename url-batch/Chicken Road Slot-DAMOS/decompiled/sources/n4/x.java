package n4;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.k0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7129a;

    /* renamed from: b, reason: collision with root package name */
    public final q4.h f7130b;

    /* renamed from: c, reason: collision with root package name */
    public final c4.o f7131c;

    /* renamed from: d, reason: collision with root package name */
    public final Activity f7132d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7133e;

    /* renamed from: f, reason: collision with root package name */
    public final d.d0 f7134f;
    public final boolean g;

    public x(Context context) {
        Object obj;
        context.getClass();
        this.f7129a = context;
        this.f7130b = new q4.h(this, new j(this, 0));
        this.f7131c = new c4.o(context, (char) 0);
        Iterator it = de.k.c(context, new m2.u(14)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            }
        }
        this.f7132d = (Activity) obj;
        this.f7134f = new d.d0(3, this);
        this.g = true;
        i0 i0Var = this.f7130b.f8010s;
        i0Var.a(new w(i0Var));
        this.f7130b.f8010s.a(new b(this.f7129a));
        hd.h.b(new j(this, 1));
    }

    public final void a(Object obj, Function1 function1) {
        obj.getClass();
        q4.h hVar = this.f7130b;
        hVar.getClass();
        a0 S = c6.f.S(function1);
        String f3 = hVar.f(obj);
        if (hVar.f7996c == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + f3 + ". Navigation graph has not been set for NavController " + hVar + '.').toString());
        }
        u k10 = hVar.k();
        r g = k10.g(f3, true, k10);
        if (g == null) {
            StringBuilder q3 = v4.a.q("Navigation destination that matches route ", f3, " cannot be found in the navigation graph ");
            q3.append(hVar.f7996c);
            throw new IllegalArgumentException(q3.toString());
        }
        s sVar = g.f7108d;
        Bundle b10 = sVar.b(g.f7109e);
        if (b10 == null) {
            k0.f5575d.getClass();
            b10 = z4.w.h((Pair[]) Arrays.copyOf(new Pair[0], 0));
        }
        int i3 = s.f7113s;
        String str = (String) sVar.f7115e.f1698e;
        Uri parse = Uri.parse(str != null ? "android-app://androidx.navigation/".concat(str) : "");
        parse.getClass();
        Intent intent = new Intent();
        intent.setDataAndType(parse, null);
        intent.setAction(null);
        b10.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        hVar.m(sVar, b10, S);
    }

    public final void b() {
        q4.h hVar = this.f7130b;
        if (hVar.f7999f.isEmpty()) {
            return;
        }
        s i3 = hVar.i();
        i3.getClass();
        if (hVar.n(i3.f7115e.f1694a, true, false)) {
            hVar.b();
        }
    }
}
