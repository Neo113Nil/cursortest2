package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bsl {
    public static final gdo a = new gdo("intro_page_key");
    public final Context b;
    public final SharedPreferences c;
    public final fcu d;

    public bsl(Context context, fcu fcuVar) {
        this.b = context;
        this.d = fcuVar;
        this.c = context.getSharedPreferences(air.e(context), 0);
    }
}
