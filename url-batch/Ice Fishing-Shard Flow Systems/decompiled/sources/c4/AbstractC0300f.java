package c4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: c4.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0300f implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final transient T6.i f4220d;

    /* renamed from: e, reason: collision with root package name */
    public transient int f4221e;

    public AbstractC0300f(AbstractC0303i adapter, T6.i unknownFields) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.f4220d = unknownFields;
    }

    public final T6.i a() {
        T6.i iVar = this.f4220d;
        return iVar == null ? T6.i.f2618l : iVar;
    }
}
