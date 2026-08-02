package kotlin.reflect.jvm.internal;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.reflect.KClassifier;

/* loaded from: classes9.dex */
public final class ErrorTypeParameter implements KClassifier {
    public final int id;

    public ErrorTypeParameter(int i) {
        this.id = i;
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("[Error type parameter "), this.id, ']');
    }
}
