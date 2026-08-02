package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class glx extends ContextWrapper implements glp {
    private static final hkh a = hkh.l("com/google/apps/tiktok/inject/peer/FragmentContextWrapper");
    private final hac b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public glx(bd bdVar, LayoutInflater layoutInflater) {
        super(r0);
        Context context = layoutInflater.getContext();
        context.getClass();
        b(context, a(bdVar));
        this.b = hoq.v(new dxi(this, layoutInflater, 18, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Locale a(bd bdVar) {
        Locale aI;
        if ((bdVar instanceof glw) && (aI = ((glw) bdVar).aI()) != null) {
            return aI;
        }
        bd bdVar2 = bdVar.F;
        if (bdVar2 != null) {
            return a(bdVar2);
        }
        return null;
    }

    private static void b(Context context, Locale locale) {
        if (locale != null) {
            ((hkf) ((hkf) a.b()).i("com/google/apps/tiktok/inject/peer/FragmentContextWrapper", "maybeApplyCustomLocale", 46, "FragmentContextWrapper.java")).u("applying customLocale = %s", locale);
            Configuration configuration = new Configuration();
            configuration.locale = locale;
            Resources resources = context.getResources();
            resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        return !"layout_inflater".equals(str) ? getBaseContext().getSystemService(str) : this.b.bB();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glx(bd bdVar, Context context) {
        super(context);
        context.getClass();
        b(context, a(bdVar));
        this.b = hoq.v(new ewf(this, 5));
    }
}
