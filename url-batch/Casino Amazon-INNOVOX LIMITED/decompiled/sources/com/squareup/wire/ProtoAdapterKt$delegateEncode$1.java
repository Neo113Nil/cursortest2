package com.squareup.wire;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProtoAdapter.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes3.dex */
public final class ProtoAdapterKt$delegateEncode$1 implements Function1<ProtoWriter, Unit> {
    final /* synthetic */ ProtoAdapter<E> $this_delegateEncode;
    final /* synthetic */ E $value;

    public ProtoAdapterKt$delegateEncode$1(ProtoAdapter<E> protoAdapter, E e) {
        this.$this_delegateEncode = protoAdapter;
        this.$value = e;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ProtoWriter protoWriter) {
        invoke2(protoWriter);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ProtoWriter forwardWriter) {
        Intrinsics.checkNotNullParameter(forwardWriter, "forwardWriter");
        this.$this_delegateEncode.encode(forwardWriter, (ProtoWriter) this.$value);
    }
}
