package s1;

import A.AbstractC0017m;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import z2.C1440x;

@Metadata
@G("navigation")
/* renamed from: s1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1182A extends H {

    /* renamed from: c, reason: collision with root package name */
    public final I f10432c;

    public C1182A(I navigatorProvider) {
        Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        this.f10432c = navigatorProvider;
    }

    @Override // s1.H
    public final void d(List entries, E e4) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            C1193i c1193i = (C1193i) it.next();
            v vVar = c1193i.f10510e;
            Intrinsics.d(vVar, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            y yVar = (y) vVar;
            Bundle g4 = c1193i.g();
            int i2 = yVar.f10587p;
            String str = yVar.f10589r;
            if (i2 == 0 && str == null) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i4 = yVar.f10575l;
                sb.append(i4 != 0 ? String.valueOf(i4) : "the root navigation");
                throw new IllegalStateException(sb.toString().toString());
            }
            v destination = str != null ? yVar.B(str, false) : (v) yVar.f10586o.b(i2);
            if (destination == null) {
                if (yVar.f10588q == null) {
                    String str2 = yVar.f10589r;
                    if (str2 == null) {
                        str2 = String.valueOf(yVar.f10587p);
                    }
                    yVar.f10588q = str2;
                }
                String str3 = yVar.f10588q;
                Intrinsics.c(str3);
                throw new IllegalArgumentException(AbstractC0017m.j("navigation destination ", str3, " is not a direct child of this NavGraph"));
            }
            if (str != null && !str.equals(destination.f10576m)) {
                u w4 = destination.w(str);
                Bundle bundle = w4 != null ? w4.f10565e : null;
                if (bundle != null && !bundle.isEmpty()) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putAll(bundle);
                    if (g4 != null) {
                        bundle2.putAll(g4);
                    }
                    g4 = bundle2;
                }
            }
            H b4 = this.f10432c.b(destination.f10570d);
            l b5 = b();
            Bundle h4 = destination.h(g4);
            Intrinsics.checkNotNullParameter(destination, "destination");
            C1183B c1183b = b5.f10534h;
            b4.d(C1440x.a(H1.f.k(c1183b.f10436a, destination, h4, c1183b.h(), c1183b.f10451p)), e4);
        }
    }

    @Override // s1.H
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public y a() {
        return new y(this);
    }
}
