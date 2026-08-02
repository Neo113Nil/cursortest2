package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zd extends WindowInsetsAnimation$Callback {
    private final yy a;
    private List b;
    private ArrayList c;
    private final HashMap d;

    public zd(yy yyVar) {
        super(0);
        this.d = new HashMap();
        this.a = yyVar;
    }

    private final brn a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.d;
        brn brnVar = (brn) hashMap.get(windowInsetsAnimation);
        if (brnVar != null) {
            return brnVar;
        }
        brn brnVar2 = new brn(windowInsetsAnimation);
        hashMap.put(windowInsetsAnimation, brnVar2);
        return brnVar2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.b(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.c(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                yy yyVar = this.a;
                zz q = zz.q(windowInsets, null);
                yyVar.a(q, this.b);
                return q.e();
            }
            WindowInsetsAnimation m88m = it$$ExternalSyntheticApiModelOutline0.m88m(list.get(size));
            brn a = a(m88m);
            fraction = m88m.getFraction();
            a.L(fraction);
            this.c.add(a);
        }
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        brn a = a(windowInsetsAnimation);
        yx yxVar = new yx(bounds);
        this.a.d(a, yxVar);
        return new WindowInsetsAnimation.Bounds(yxVar.a.a(), yxVar.b.a());
    }
}
