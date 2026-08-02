package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ak extends an {
    private final boolean b;
    private boolean c;
    private brr d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(cm cmVar, boolean z) {
        super(cmVar);
        cmVar.getClass();
        this.b = z;
    }

    public final brr a(Context context) {
        if (this.c) {
            return this.d;
        }
        cm cmVar = this.a;
        brr X = a.X(context, cmVar.a, cmVar.h == 2, this.b);
        this.d = X;
        this.c = true;
        return X;
    }
}
