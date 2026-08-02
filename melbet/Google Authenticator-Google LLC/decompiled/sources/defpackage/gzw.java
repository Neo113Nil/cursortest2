package defpackage;

import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class gzw extends gyg {
    final /* synthetic */ brn g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzw(gzz gzzVar, CharSequence charSequence, brn brnVar) {
        super(gzzVar, charSequence);
        this.g = brnVar;
    }

    @Override // defpackage.gyg
    public final int a(int i) {
        return ((Matcher) this.g.a).end();
    }

    @Override // defpackage.gyg
    public final int b(int i) {
        Matcher matcher = (Matcher) this.g.a;
        if (matcher.find(i)) {
            return matcher.start();
        }
        return -1;
    }
}
