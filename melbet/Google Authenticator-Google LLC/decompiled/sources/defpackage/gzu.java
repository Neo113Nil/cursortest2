package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gzu implements gzy {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ gzu(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.gzy
    public final Iterator a(gzz gzzVar, CharSequence charSequence) {
        int i = this.b;
        Object obj = this.a;
        return i != 0 ? new gzv(gzzVar, charSequence, (gyv) obj) : new gzw(gzzVar, charSequence, ((gyw) obj).a(charSequence));
    }
}
