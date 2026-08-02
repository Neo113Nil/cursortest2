package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class we implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;
    final /* synthetic */ List c;
    final /* synthetic */ int d;

    public we(String str, Context context, List list, int i) {
        this.a = str;
        this.b = context;
        this.c = list;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bsh call() {
        try {
            return wg.b(this.a, this.b, this.c, this.d);
        } catch (Throwable unused) {
            return new bsh(-3);
        }
    }
}
