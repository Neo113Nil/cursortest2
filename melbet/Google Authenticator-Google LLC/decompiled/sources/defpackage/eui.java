package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class eui implements eva {
    public final String a;
    public final String b;
    public final evj c;

    public eui(String str, String str2, evj evjVar) {
        this.a = str;
        this.b = str2;
        this.c = evjVar;
    }

    protected abstract Object b(Object obj);

    @Override // defpackage.eva, defpackage.hac
    public final Object bB() {
        AtomicReference atomicReference = etd.a;
        etf.b = true;
        if (etf.c == null) {
            etf.c = new ete();
        }
        Context context = (Context) etd.a.get();
        if (context == null) {
            etf.a();
            throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
        }
        Object f = f(etd.a(context));
        f.getClass();
        return f;
    }

    @Override // defpackage.eva
    public final Object bC(Context context) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        Object f = f(etd.a(applicationContext));
        f.getClass();
        return f;
    }

    protected final Object bD(String str) {
        try {
            return c(str);
        } catch (IOException | IllegalArgumentException e) {
            Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.b), e);
            return null;
        }
    }

    protected abstract Object c(String str);

    protected Object e() {
        return null;
    }

    protected abstract Object f(etd etdVar);
}
