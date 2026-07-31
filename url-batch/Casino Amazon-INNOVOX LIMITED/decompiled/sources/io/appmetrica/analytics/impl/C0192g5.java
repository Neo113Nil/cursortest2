package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import kotlin.collections.ArraysKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: io.appmetrica.analytics.impl.g5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0192g5 implements IExecutionPolicy {

    /* renamed from: a, reason: collision with root package name */
    public final IExecutionPolicy[] f1266a;
    public final String b;

    public C0192g5(IExecutionPolicy... iExecutionPolicyArr) {
        this.f1266a = iExecutionPolicyArr;
        this.b = "Composite of {" + ArraysKt.joinToString$default(iExecutionPolicyArr, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, C0166f5.f1250a, 30, (Object) null) + AbstractJsonLexerKt.END_OBJ;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final boolean canBeExecuted() {
        IExecutionPolicy iExecutionPolicy;
        IExecutionPolicy[] iExecutionPolicyArr = this.f1266a;
        if (iExecutionPolicyArr.length == 0) {
            return false;
        }
        int length = iExecutionPolicyArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                iExecutionPolicy = null;
                break;
            }
            iExecutionPolicy = iExecutionPolicyArr[i];
            if (!iExecutionPolicy.canBeExecuted()) {
                break;
            }
            i++;
        }
        return iExecutionPolicy == null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy
    public final String description() {
        return this.b;
    }
}
