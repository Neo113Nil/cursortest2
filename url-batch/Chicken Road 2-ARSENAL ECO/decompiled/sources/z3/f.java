package z3;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class f implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public final transient n6.i f6305f;

    /* renamed from: g, reason: collision with root package name */
    public transient int f6306g;

    public f(i adapter, n6.i unknownFields) {
        kotlin.jvm.internal.i.e(adapter, "adapter");
        kotlin.jvm.internal.i.e(unknownFields, "unknownFields");
        this.f6305f = unknownFields;
    }

    public final n6.i a() {
        n6.i iVar = this.f6305f;
        return iVar == null ? n6.i.f5525i : iVar;
    }
}
