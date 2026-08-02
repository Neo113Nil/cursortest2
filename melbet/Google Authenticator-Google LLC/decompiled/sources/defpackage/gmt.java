package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gmt implements jrq {
    private volatile Object a;
    private final Object b = new Object();
    private final View c;

    public gmt(View view) {
        this.c = view;
    }

    private final Context a(Class cls) {
        View view = this.c;
        Context b = b(view.getContext(), cls);
        hoq.K(b != b(b.getApplicationContext(), jrq.class), "%s, Sting view cannot be created using the application context. Use a Sting Fragment or Activity context.", view.getClass());
        return b;
    }

    private static Context b(Context context, Class cls) {
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    @Override // defpackage.jrq
    public final Object C() {
        Object bnpVar;
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    Context a = a(jrg.class);
                    if (a instanceof gmq) {
                        bob q = ((gmr) ((jrq) ((jrg) a).a()).C()).q();
                        q.a = this.c;
                        iwm.a(q.a, View.class);
                        bnpVar = new bnm(q.b, q.c, q.d, q.e, q.a);
                    } else {
                        if (!(a instanceof jrg)) {
                            Context a2 = a(jrq.class);
                            View view = this.c;
                            hoq.M(!(a2 instanceof jrq), "%s, @WithFragmentBindings Sting view must be attached to an @Sting Fragment. Was attached to context: %s", view.getClass(), a2.getClass().getName());
                            throw new IllegalStateException(String.format("%s, Sting view must be attached to an @Sting Fragment or Activity. Was attached to context: %s", view.getClass(), a2.getClass().getName()));
                        }
                        View view2 = this.c;
                        hoq.K(false, "%s, Account views may only attach to account fragments.", view2.getClass());
                        boe j = ((gms) ((jrq) ((jrg) a).a()).C()).j();
                        j.a = view2;
                        iwm.a(j.a, View.class);
                        bnpVar = new bnp((bmz) j.b);
                    }
                    this.a = bnpVar;
                }
            }
        }
        return this.a;
    }
}
