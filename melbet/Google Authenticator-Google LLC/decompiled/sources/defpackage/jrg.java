package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jrg extends ContextWrapper {
    public bd a;
    public LayoutInflater b;
    public LayoutInflater c;
    private final aep d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public jrg(LayoutInflater layoutInflater, bd bdVar) {
        super(r0);
        iwi.b(layoutInflater);
        Context context = layoutInflater.getContext();
        iwi.b(context);
        na naVar = new na(this, 4, null);
        this.d = naVar;
        this.b = layoutInflater;
        this.a = bdVar;
        bdVar.L().a(naVar);
    }

    public final bd a() {
        a.v(this.a, "The fragment has already been destroyed.");
        return this.a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        LayoutInflater layoutInflater = this.c;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflater2 = this.b;
        if (layoutInflater2 == null) {
            layoutInflater2 = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            this.b = layoutInflater2;
        }
        LayoutInflater cloneInContext = layoutInflater2.cloneInContext(this);
        this.c = cloneInContext;
        return cloneInContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jrg(Context context, bd bdVar) {
        super(context);
        iwi.b(context);
        na naVar = new na(this, 4, null);
        this.d = naVar;
        this.b = null;
        this.a = bdVar;
        bdVar.L().a(naVar);
    }
}
