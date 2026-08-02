package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.authenticator2.R;
import j$.util.DesugarCollections;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dpl implements dpd {
    public static final Map a = DesugarCollections.synchronizedMap(new qi());
    public static final Map b = DesugarCollections.synchronizedMap(new qi());
    private static final AtomicBoolean c = new AtomicBoolean(false);
    private static final ComponentCallbacks2 d = new dpf();
    private final Executor e;
    private final eeq f;
    private final dov g;

    public dpl(Context context, ExecutorService executorService, dov dovVar, ees eesVar) {
        ees eesVar2;
        dih dihVar;
        cka ckaVar = new cka(context);
        eeo eeoVar = new eeo();
        eeoVar.a(new eep[0]);
        eeoVar.a = eesVar;
        eeoVar.d = new dih();
        eeoVar.b = new dpe(ckaVar, dovVar);
        eeoVar.a(eep.a);
        ees eesVar3 = eeoVar.a;
        if (eesVar3 != null && (eesVar2 = eeoVar.b) != null && (dihVar = eeoVar.d) != null) {
            eeq eeqVar = new eeq(eesVar3, eesVar2, dihVar, eeoVar.c);
            this.e = executorService;
            this.f = eeqVar;
            this.g = dovVar;
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (eeoVar.a == null) {
            sb.append(" imageRetriever");
        }
        if (eeoVar.b == null) {
            sb.append(" secondaryImageRetriever");
        }
        if (eeoVar.d == null) {
            sb.append(" defaultImageRetriever");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static void b(ImageView imageView, dpk dpkVar) {
        fao.c();
        dpk dpkVar2 = (dpk) imageView.getTag(R.id.tag_account_image_request);
        if (dpkVar2 != null) {
            dpkVar2.e = true;
        }
        imageView.setTag(R.id.tag_account_image_request, dpkVar);
    }

    @Override // defpackage.dpd
    public final void a(Object obj, ImageView imageView) {
        fao.c();
        Context context = imageView.getContext();
        if (!c.getAndSet(true)) {
            context.getApplicationContext().registerComponentCallbacks(d);
        }
        eeq eeqVar = this.f;
        Executor executor = this.e;
        dpk dpkVar = new dpk(obj, eeqVar, imageView, executor, this.g);
        b(imageView, dpkVar);
        executor.execute(new dlj(dpkVar, 6));
    }
}
