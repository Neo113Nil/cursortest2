package com.onevcat.uniwebview.internal.obfuscated;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* renamed from: com.onevcat.uniwebview.internal.obfuscated.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0090o0 extends Lambda implements Function0 {
    public final /* synthetic */ Ref.ObjectRef a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0090o0(Ref.ObjectRef objectRef) {
        super(0);
        this.a = objectRef;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return (com.onevcat.uniwebview.a) this.a.element;
    }
}
