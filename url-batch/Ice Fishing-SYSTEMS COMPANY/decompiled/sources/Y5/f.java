package Y5;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class f implements Serializable {

    /* renamed from: n, reason: collision with root package name */
    public final transient u8.h f3991n;

    /* renamed from: u, reason: collision with root package name */
    public transient int f3992u;

    public f(i adapter, u8.h unknownFields) {
        kotlin.jvm.internal.h.e(adapter, "adapter");
        kotlin.jvm.internal.h.e(unknownFields, "unknownFields");
        this.f3991n = unknownFields;
    }

    public final u8.h a() {
        u8.h hVar = this.f3991n;
        return hVar == null ? u8.h.f41278w : hVar;
    }
}
