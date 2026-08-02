package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hhg extends hjp {
    final /* synthetic */ gzf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhg(Iterator it, gzf gzfVar) {
        super(it);
        this.a = gzfVar;
    }

    @Override // defpackage.hjp
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new AbstractMap.SimpleImmutableEntry(obj, this.a.a(obj));
    }
}
