package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.authenticator2.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dyx extends dza {
    private final dzd a;
    private final ldt b;

    public dyx(dzd dzdVar, ldt ldtVar) {
        this.a = dzdVar;
        this.b = ldtVar;
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ekx ekxVar = (ekx) obj;
        ekxVar.getClass();
        ((jge) obj2).getClass();
        this.b.p((View) ekxVar.c, 93521, jgo.a);
    }

    @Override // defpackage.dza
    public final /* synthetic */ void b(Object obj, Object obj2) {
        jgi jgiVar;
        ekx ekxVar = (ekx) obj;
        jge jgeVar = (jge) obj2;
        ekxVar.getClass();
        jgeVar.getClass();
        jit jitVar = jgeVar.a;
        if (jitVar == null || (jgiVar = jgeVar.b) == null || !jgeVar.c) {
            ((FrameLayout) ekxVar.b).setVisibility(4);
        } else {
            this.a.c(ekxVar.d, new dzc(jitVar, jgiVar, 1));
            ((FrameLayout) ekxVar.b).setVisibility(0);
        }
        ((View) ekxVar.a).setBackgroundColor(jgeVar.c ? fhq.d(((View) ekxVar.a).getContext(), R.attr.colorSurfaceContainerHigh, 0) : 0);
    }
}
