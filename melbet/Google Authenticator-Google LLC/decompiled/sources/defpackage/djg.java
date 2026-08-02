package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class djg {
    public final dix a;
    public final djb b;

    protected djg(Context context, djb djbVar) {
        Context context2;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        djh djhVar = new djh();
        diw diwVar = new diw();
        diwVar.a();
        if (applicationContext == null) {
            throw new NullPointerException("Null context");
        }
        diwVar.a = applicationContext;
        diwVar.c = gzp.h(djhVar);
        diwVar.a();
        if (diwVar.e == 1 && (context2 = diwVar.a) != null) {
            this.a = new dix(context2, diwVar.b, diwVar.c, diwVar.d);
            this.b = djbVar;
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (diwVar.a == null) {
            sb.append(" context");
        }
        if (diwVar.e == 0) {
            sb.append(" googlerOverridesCheckbox");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public static djg a(Context context, div divVar) {
        return new djg(context, new djb(divVar));
    }

    public final String toString() {
        return "CollectionBasisLogVerifier{collectionBasisContext=" + this.a + ", basis=" + this.b + "}";
    }
}
