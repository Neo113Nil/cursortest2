package defpackage;

import j$.util.DesugarCollections;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class jrt implements jrw {
    public final Map a;

    public jrt(Map map) {
        this.a = DesugarCollections.unmodifiableMap(map);
    }
}
