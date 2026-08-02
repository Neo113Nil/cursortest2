package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jqm implements jrq {
    public final agl a;
    public final Context b;
    private volatile jpw c;
    private final Object d = new Object();

    public jqm(ng ngVar) {
        this.a = ngVar;
        this.b = ngVar;
    }

    public static final agj b(agl aglVar, Context context) {
        return new agj(aglVar, new jqd(context, 2));
    }

    @Override // defpackage.jrq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jpw C() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = ((jqk) b(this.a, this.b).a(jqk.class)).a;
                }
            }
        }
        return this.c;
    }
}
