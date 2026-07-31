package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.impl.q7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0448q7 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0355me f1449a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0448q7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0423p7 fromModel(C0497s7 c0497s7) {
        C0423p7 c0423p7 = new C0423p7();
        Long l = c0497s7.f1481a;
        if (l != null) {
            c0423p7.f1427a = l.longValue();
        }
        Long l2 = c0497s7.b;
        if (l2 != null) {
            c0423p7.b = l2.longValue();
        }
        Boolean bool = c0497s7.c;
        if (bool != null) {
            c0423p7.c = this.f1449a.fromModel(Boolean.valueOf(bool.booleanValue())).intValue();
        }
        return c0423p7;
    }

    public C0448q7(C0355me c0355me) {
        this.f1449a = c0355me;
    }

    public /* synthetic */ C0448q7(C0355me c0355me, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C0355me() : c0355me);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0497s7 toModel(C0423p7 c0423p7) {
        C0423p7 c0423p72 = new C0423p7();
        Long valueOf = Long.valueOf(c0423p7.f1427a);
        if (valueOf.longValue() == c0423p72.f1427a) {
            valueOf = null;
        }
        Long valueOf2 = Long.valueOf(c0423p7.b);
        return new C0497s7(valueOf, valueOf2.longValue() != c0423p72.b ? valueOf2 : null, this.f1449a.a(c0423p7.c));
    }
}
