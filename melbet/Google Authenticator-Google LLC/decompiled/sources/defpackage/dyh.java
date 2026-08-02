package defpackage;

import com.google.android.libraries.onegoogle.account.disc.SimpleAvatarView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dyh extends dza {
    private final dzd a;

    public dyh(dzd dzdVar) {
        this.a = dzdVar;
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((gfx) obj).getClass();
        ((jgg) obj2).getClass();
    }

    @Override // defpackage.dza
    public final /* synthetic */ void b(Object obj, Object obj2) {
        gfx gfxVar = (gfx) obj;
        jgg jggVar = (jgg) obj2;
        gfxVar.getClass();
        jggVar.getClass();
        dzc dzcVar = new dzc(jggVar.a, jggVar.b, 1);
        dzd dzdVar = this.a;
        Object obj3 = gfxVar.t;
        dzdVar.c(obj3, dzcVar);
        ((SimpleAvatarView) ((dze) obj3).a).setImportantForAccessibility(2);
    }
}
