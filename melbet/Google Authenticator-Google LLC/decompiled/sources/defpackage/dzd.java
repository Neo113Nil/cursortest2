package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import android.widget.ImageView;
import com.google.android.apps.authenticator2.R;
import com.google.android.libraries.onegoogle.account.disc.SimpleAvatarView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dzd extends dza {
    private final jpt a;
    private final jpt b;
    private final bst c;
    private final fym d;
    private final iyh e;

    public dzd(iyh iyhVar, fym fymVar, jpt jptVar, jpt jptVar2, bst bstVar) {
        jptVar.getClass();
        jptVar2.getClass();
        this.e = iyhVar;
        this.d = fymVar;
        this.a = jptVar;
        this.b = jptVar2;
        this.c = bstVar;
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((dze) obj).getClass();
        ((dzc) obj2).getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [dpd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    @Override // defpackage.dza
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Drawable drawable;
        jgj jgjVar;
        bst bstVar;
        ?? r4;
        dze dzeVar = (dze) obj;
        dzc dzcVar = (dzc) obj2;
        dzeVar.getClass();
        dzcVar.getClass();
        Object obj3 = dzeVar.a;
        SimpleAvatarView simpleAvatarView = (SimpleAvatarView) obj3;
        Context context = simpleAvatarView.getContext();
        Resources resources = context.getResources();
        Object obj4 = dzeVar.b;
        jit jitVar = dzcVar.a;
        Drawable drawable2 = null;
        if (!ksp.b(obj4, jitVar)) {
            simpleAvatarView.l();
            if (dzcVar.c == 3) {
                r4 = (dpd) this.b.b();
            } else {
                Object obj5 = this.e.c;
                r4 = obj5;
                if (obj5 == null) {
                    ksp.a("avatarImageLoader");
                    r4 = 0;
                }
            }
            r4.getClass();
            r4.a(jitVar, (ImageView) obj3);
        }
        jgi jgiVar = dzcVar.b;
        jhm jhmVar = jgiVar.b;
        if (jhmVar != null) {
            int i = jhmVar.b - 1;
            if (i == 1) {
                drawable = new dqd(new kee(obj3));
            } else if (i == 2) {
                resources.getClass();
                drawable = new dqf(resources, new kee(obj3), 1);
            }
            simpleAvatarView.m(drawable);
            if (jhmVar != null) {
                jhh jhhVar = jhmVar.a;
                if (jhhVar != null) {
                    context.getClass();
                    simpleAvatarView.setContentDescription(dih.J(jhhVar, context));
                    simpleAvatarView.setImportantForAccessibility(1);
                } else {
                    simpleAvatarView.setContentDescription(null);
                    simpleAvatarView.setImportantForAccessibility(2);
                }
            }
            jgjVar = jgiVar.c;
            ((dpb) obj3).o(jgjVar == null ? jgjVar.c : 1, jgjVar == null ? jgjVar.b : 1);
            bstVar = this.c;
            dja.y(simpleAvatarView, bstVar.h());
            if (bstVar.h()) {
                Paint paint = simpleAvatarView.b;
                paint.setStrokeWidth(simpleAvatarView.getResources().getDimensionPixelSize(R.dimen.og_border_ring_thickness));
                paint.setColor(simpleAvatarView.c);
                paint.setAlpha(30);
                simpleAvatarView.r();
            } else {
                int c = va.c(((ehi) this.a.b()).a(jhb.b), 30);
                float applyDimension = TypedValue.applyDimension(1, 2.0f, resources.getDisplayMetrics());
                Paint paint2 = simpleAvatarView.b;
                paint2.setColor(c);
                paint2.setStrokeWidth(applyDimension);
                simpleAvatarView.r();
            }
            if (jgjVar != null) {
                fym fymVar = this.d;
                context.getClass();
                int i2 = jgjVar.b - 1;
                drawable2 = fymVar.i(context, jgjVar.a);
                if (i2 != 0) {
                    Drawable f = e.f(context, R.drawable.og_dimmed_badge);
                    f.getClass();
                    LayerDrawable layerDrawable = (LayerDrawable) f;
                    layerDrawable.setDrawable(1, drawable2);
                    drawable2 = layerDrawable;
                }
            }
            simpleAvatarView.g(drawable2);
            simpleAvatarView.setAlpha(jgiVar.a);
            dzeVar.b = jitVar;
        }
        drawable = null;
        simpleAvatarView.m(drawable);
        if (jhmVar != null) {
        }
        jgjVar = jgiVar.c;
        ((dpb) obj3).o(jgjVar == null ? jgjVar.c : 1, jgjVar == null ? jgjVar.b : 1);
        bstVar = this.c;
        dja.y(simpleAvatarView, bstVar.h());
        if (bstVar.h()) {
        }
        if (jgjVar != null) {
        }
        simpleAvatarView.g(drawable2);
        simpleAvatarView.setAlpha(jgiVar.a);
        dzeVar.b = jitVar;
    }
}
