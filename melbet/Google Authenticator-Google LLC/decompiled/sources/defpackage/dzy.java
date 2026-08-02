package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dzy extends dza {
    private Animatable a;
    private final fym b;

    public dzy(fym fymVar) {
        this.b = fymVar;
    }

    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((cfe) obj).getClass();
        ((jgu) obj2).getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dza
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        cfe cfeVar = (cfe) obj;
        jgu jguVar = (jgu) obj2;
        cfeVar.getClass();
        jguVar.getClass();
        ImageView imageView = (ImageView) cfeVar.a;
        Context context = imageView.getContext();
        context.getClass();
        Drawable i = this.b.i(context, jguVar);
        imageView.setImageDrawable(i);
        jhh b = jguVar.b();
        imageView.setContentDescription(b != null ? dih.J(b, context) : null);
        Animatable animatable = this.a;
        if (animatable != null) {
            animatable.stop();
        }
        this.a = null;
        if (jguVar instanceof jhl) {
            if (!(i instanceof Animatable)) {
                throw new IllegalStateException("ProgressOgImage should be used with an Animatable drawable.");
            }
            Animatable animatable2 = (Animatable) i;
            this.a = animatable2;
            if (animatable2 != null) {
                animatable2.start();
            }
        }
    }
}
