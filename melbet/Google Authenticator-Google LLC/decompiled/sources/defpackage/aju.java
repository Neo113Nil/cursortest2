package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aju {
    public final ktj a;
    public final Context b;
    public final String c;
    public Executor f;
    public Executor g;
    public amm h;
    public boolean i;
    public boolean n;
    public boolean o;
    public final List d = new ArrayList();
    public final List e = new ArrayList();
    public final brn p = new brn((char[]) null, (byte[]) null, (byte[]) null);
    public final Set j = new LinkedHashSet();
    public final Set k = new LinkedHashSet();
    public final List l = new ArrayList();
    public boolean m = true;

    public aju(Context context, Class cls, String str) {
        this.a = ixf.h(cls);
        this.b = context;
        this.c = str;
    }

    public final void a(alk... alkVarArr) {
        alk alkVar = alkVarArr[0];
        Integer valueOf = Integer.valueOf(alkVar.a);
        Set set = this.k;
        set.add(valueOf);
        set.add(Integer.valueOf(alkVar.b));
        alk[] alkVarArr2 = (alk[]) Arrays.copyOf(alkVarArr, 1);
        alkVarArr2.getClass();
        for (alk alkVar2 : alkVarArr2) {
            this.p.E(alkVar2);
        }
    }
}
